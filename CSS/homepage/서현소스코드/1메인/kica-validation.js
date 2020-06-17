(function ($, win) {

    /*
    @description
    $.validator함수에 대한 전역 설정
    validator프레임웍에 전달되는 기본 설정값입니다.
    submit을 제외한 validation만 수행합니다.
    */
   var defaultValidateOption = {
       debug: true,
       ignoreTitle: true,
       onfocusout: false,
       onkeyup: false,
       onclick: false,
       showErrors: function (errorMap, errorList) {
           //벨리데이션 에러 메세지를 on/off
           if(errorList.length >0){
               var errorRecord = errorList[0];

               $.notify('tip',errorRecord.message,errorRecord.element).show();

               /// 툴팁 위치 체크
               var $focusingTarget = $(errorRecord.element);
               var tipTop = $focusingTarget.position().top;
               //$('body, html').scrollTop(tipTop-50 );
               $focusingTarget.focus();
           }
       },
       invalidHandler: function(form, validator) {
           var errors = validator.numberOfInvalids();
           if (errors) {
               validator.errorList[0].element.focus();
           }
       }
   };

   /*
   @description
   $.validator함수에 대한 전역 설정
   validator프레임웍에 전달되는 확장 설정값입니다.
   ajax submit을 수행하고 그 경과를  $.Deferred로 추적하는 기능을 담고 있습니다.
    또한 부수적으로 활성화된 라디오 박스나 체크박스에 data-kica로 시작되는 프로퍼티가 존재하면 함께 post합니다.
   */
   var ajaxValidateOption = {
       debug: false,
       submitHandler: function (form) {
           if (typeof $.fn.ajaxForm === 'undefined') {
               alert('jquery.form.js가 임포트 되어 있지 않습니다.');
               return false;
           }
           var that = this;
           $(form).trigger('validated').ajaxSubmit({
               beforeSubmit: function(formData, jqForm, options){
                   if(typeof that.submitDeferred !== "undefined"){
                       that.submitDeferred.notify('beforeSubmit');
                   }
                   $(form).trigger('beforeSubmit', [formData, jqForm, options]);
                   $.each(formData,function(key,value){
                       jqForm.find('[name="' + value.name + '"]:checked').each(function() {
                           $.each(this.attributes, function() {
                               if(this.specified) {
                                   if(this.name.indexOf('data-kica') >= 0){
                                       var keyTokens = this.name.split('-');
                                       var key = keyTokens[keyTokens.length -1];
                                       var value = this.value;
                                       formData.push({
                                           name:key,
                                           value:value
                                       });
                                   }
                               }
                           });
                       });
                   });
               },
               success: function (data, textStatus, jqXHR) {
                   if(typeof that.submitDeferred !== "undefined"){
                       that.submitDeferred.resolve();
                   }
                   $(form).trigger('success', [data, textStatus, jqXHR]);
               },
               error: function (jqXHR, textStatus, errorThrown) {
                   if(typeof that.submitDeferred !== "undefined"){
                       that.submitDeferred.reject();
                   }
                   $(form).trigger('error', [jqXHR, textStatus, errorThrown]);
               }
           });
       }
   };

   /*
   @description
   $.fn.kicaValidate 플러그인이 숨겨진 엘리먼트도 스캔하도록 옵션을 수정합니다.
   */
   $.fn.deepScan = function(findInHidden){
       if(findInHidden || _.isUndefined(findInHidden)){
           $.extend($.validator.defaults,{ignore:[]});
       }else{
           delete $.validator.defaults['ignore']
       }
       return $(this);
   };

    /*
    @description
    $.fn.kicaValidateOnly 플러그인의 정의
    벨리데이션 체크만을 수행하는 플러그인입니다.
    */
    $.widget("custom.kicaValidateOnly", {
        _init: function () {
            mergedOptions = $.extend({}, defaultValidateOption, this.options),
            $el = this.element;
            //래핑한 벨리데이터의 참조를 위젯에 전달
            this.validator = $el.validate(mergedOptions);
        }
    });

    /*
    @description
    $.fn.kicaValidate 플러그인의 정의
    벨리데이션 체크 이후에 ajax submit을 동시에 수행하며, 그 결과를 $.Deferred로 추적할 수 있습니다.
    */
    $.widget("custom.kicaValidate", {
        submitPromise:function(){
            //form submit상태를 전달할 promise 전달
            this.validator.submitDeferred = $.Deferred();
            return this.validator.submitDeferred.promise();
        },
        _init: function () {
            mergedOptions = $.extend({}, defaultValidateOption, ajaxValidateOption, this.options),
            $el = this.element;
            //래핑한 벨리데이터의 참조를 위젯에 전달
            this.validator = $el.validate(mergedOptions);
        }
    });

    /*
     @description
     $.validator의 메세지 설정
     이 곳에 선언된 프로퍼티는 모든 validator함수와 그에 의존성을 가진 모든 함수에 그 영향이 전파되며, 오버라이드 가능합니다.
     */
    $.extend($.validator.messages, {
        required: "Required Field",//"필수 항목입니다.",
        remote: "항목을 수정하세요.",
        email: "Invalid Format",//"유효하지 않은 E-Mail주소입니다.",
        url: "유효하지 않은 URL입니다.",
        date: "올바른 날짜를 입력하세요.",
        dateISO: "올바른 날짜(ISO)를 입력하세요.",
        number: "유효한 숫자가 아닙니다.",
        digits: "Numbers Only",//"0 ~ 9 까지의 숫자만 입력 가능합니다.",
        creditcard: "신용카드 번호가 바르지 않습니다.",
        equalTo: "같은 값을 다시 입력하세요.",
        extension: "올바른 확장자가 아닙니다.",
        maxlength: $.validator.format("{0}자를 넘을 수 없습니다. "),
        minlength: $.validator.format("{0}자 이상 입력하세요."),
        rangelength: $.validator.format("문자 길이는 {0} 에서 {1} 사이여야 합니다."),
        range: $.validator.format("{0} 에서 {1} 사이의 값을 입력하세요."),
        max: $.validator.format("{0} 이하의 값을 입력하세요."),
        min: $.validator.format("{0} 이상의 값을 입력하세요.")
    });

    /*
    @description
    추가된 $.validator의 서버 벨리데이션 함수입니다.
  서버 측의 벨리데이션 결과를 통보 받아서 처리합니다.
    */
    $.validator.addMethod("kica_remote_method", function ( value, element, param ) {
        if ( this.optional( element ) ) {
            return "dependency-mismatch";
        }

        var previous = this.previousValue( element ),
            validator, data;

        if (!this.settings.messages[ element.name ] ) {
            this.settings.messages[ element.name ] = {};
        }
        previous.originalMessage = this.settings.messages[ element.name ].remote;
        this.settings.messages[ element.name ].remote = previous.message;

        param = typeof param === "string" && { url: param } || param;

        if ( previous.old === value ) {
            return previous.valid;
        }

        previous.old = value;
        validator = this;
        this.startRequest( element );
        data = $(element).parents('form').serialize();
        $.ajax( $.extend( true, {
            url: param,
            mode: "abort",
            port: "validate" + element.name,
            dataType: "json",
            data: data,
            context: validator.currentForm,
            success: function( response ) {
                var valid = (true === response['valid']),
                    errors, message, submitted;
                if('undefined' === valid){
                    valid = false;
                }
                if('undefined' === typeof response['msg']){
                    message = response['msg'];
                }

                validator.settings.messages[ element.name ].remote = previous.originalMessage;
                if ( valid ) {
                    submitted = validator.formSubmitted;
                    validator.prepareElement( element );
                    validator.formSubmitted = submitted;
                    validator.successList.push( element );
                    delete validator.invalid[ element.name ];
                    validator.showErrors();
                } else {
                    errors = {};
                    message = response.msg || validator.defaultMessage( element, "remote" );
                    errors[ element.name ] = previous.message = $.isFunction( message ) ? message( value ) : message;
                    validator.invalid[ element.name ] = true;
                    validator.showErrors( errors );
                }
                previous.valid = valid;
                validator.stopRequest( element, valid );
            }
        }, param ) );
        return "pending";
    });

    //외국인 검증함수
    $.isFrgnrNum = function(value, element, param){
        var sum = 0;
        if (value.length != 13) {
            return false;
        } else if (value.substr(6, 1) != 5 && value.substr(6, 1) != 6 && value.substr(6, 1) != 7 && value.substr(6, 1) != 8) {
            return false;
        }
        if (Number(value.substr(7, 2)) % 2 != 0) {
            return false;
        }
        for (var i = 0; i < 12; i++) {
            sum += Number(value.substr(i, 1)) * ((i % 8) + 2);
        }
        if ((((11 - (sum % 11)) % 10 + 2) % 10) == Number(value.substr(12, 1))) {
            return true;
        }
        return false;
    };

    //주민등록번호 검증함수
    $.isIhidnum = function(zoominNum) {
        if (/[^0-9-]+/.test(zoominNum))
            return false;

        var ssnCheck = 0;
        for (var i = 0; i < 12; i++) {
            ssnCheck += (i % 8 + 2) * zoominNum.charAt(i);
        }
        ssnCheck = (11 - ssnCheck % 11) % 10;

        if (ssnCheck != zoominNum.charAt(12)) {
            return false;
        }

        return true;
    };

    /*
    @description
    추가된 $.validator의 외국인 등록번호 검증 방법입니다.
    */
    $.validator.addMethod("kica_frgnrNum_method", $.isFrgnrNum, $.validator.format("올바른 외국인 등록번호가 아닙니다."));

    /*
    @description
    추가된 $.validator의 입력 칸 검증 방법입니다.
    영문 및 숫자 의 입력만 허용합니다.
    */
    $.validator.addMethod("kica_forceEngNum_method", function(value, element, param) {
        var regExp = /^[A-Za-z0-9]+$/;
        return regExp.test(value);
    }, $.validator.format("영문/숫자만 허용합니다. 확인후 다시 입력해주세요."));

    /*
    @description
    추가된 $.validator의 입력 칸 검증 방법입니다.
    영문 및 숫자 둘 다 포함하고 있어야 합니다.
    111111 = false
    aaaaaa = false
    aaa111 = true
    111aaa = true
    a1a1a1 = true
    1a1a1a = true
    */
    $.validator.addMethod("kica_EngWithNum_method", function(value, element, param) {
        var regExp = /^(?=[a-zA-z0-9]*$)(?=.*\d)(?=.*[a-zA-Z]).*$/;
        return regExp.test(value);
    }, $.validator.format("영문과 숫자를 혼합하여 입력해주세요."));

    /*
    @description
    추가된 $.validator의 영문 소문자 검증 메소드입니다.
    */
    $.validator.addMethod("kica_Eng_method", function(value, element, param) {
        var regExp = /^[a-z]+$/;
        return regExp.test(value);
    }, '영문 소문자 만 입력 가능합니다.');

    /*
    @description
    추가된 $.validator의 입력 칸 검증 방법입니다.
    한글 및 영문 의 입력만 허용합니다.
     */
    $.validator.addMethod("kica_korEng_method", function(value, element, param) {
        if(param === 'false'){return true;}
        var regExp = /^[A-Za-z가-힣]+$/;
        return regExp.test(value);
    }, $.validator.format("한글/영문만 허용합니다. 확인후 다시 입력해주세요."));

    /*
    @description
    추가된 $.validator의 입력 칸 검증 방법입니다.
    숫자 의 입력만 허용합니다.
     */
    $.validator.addMethod("kica_digits_method", function(value, element, param) {
        if(param === 'false'){return true;}
        var regExp = /^[0-9]+$/;
        return regExp.test(value);
    }, $.validator.format("Numbers Only"));//("숫자만 허용합니다. 확인후 다시 입력해주세요."));

    /*
    @description
    추가된 $.validator의 입력 칸 검증 방법입니다.
    반드시 글자수가 지켜져야 하는 경우 사용합니다.
    */
    $.validator.addMethod("kica_forceTextLen_method", function(value, element, param) {
        var forceLen = parseInt(param,10);
        var isValid = false;
        if(_.isNumber(forceLen)){
            isValid = (value.length === forceLen);
        }
        return isValid;
    }, $.validator.format("{0}자리로 입력해 주세요."));

    /*
    @description
    추가된 $.validator의 입력 칸 검증 방법입니다.
    최소한 입력되어야 하는 배열 요소가 채워졌는지의 여부를 검증합니다.
    */
    $.validator.addMethod("kica_InputMinLength_method", function(value, element, param) {
        if(param == false){return true;}
        var isValid = false;
        //만약 배열 요소가 다 채워졌는지를 검증해야 한다면
        $(element).parents('form').find('input[name="' + element.name + '"]').each(function() {
            if($(this).val().length == 0){
                isValid = false;
                return isValid;
            }else{
                isValid = true;
            }
        });
        return isValid;
    }, $.validator.format("{0}칸 모두 입력하세요."));

    /*
    @description
    추가된 inputbox 3개로 나뉜 $.validator의 사업자 등록번호 검증 방법입니다.
    */
    $.validator.addMethod("kica_bizrno_method", function(value, element, param) {
        if(param == false){return true;}
        var saupzaNum = '';
        $(element).parents('form').find('input[name="' + element.name + '"]').each(function() {
            saupzaNum += $.trim($(this).val());
        });
        saupzaNum = saupzaNum.replace(/-/ig,'');
        var sum = 0;
        var getlist = new Array(10);
        var chkarg = new Array("1", "3", "7", "1", "3", "7", "1", "3", "5");
        for (var i = 0; i < 10; i++) {
            getlist[i] = saupzaNum.substring(i, i + 1);
        }
        for (var i = 0; i < 9; i++) {
            sum += getlist[i] * chkarg[i];
        }
        sum = sum + parseInt((getlist[8] * 5) / 10);
        sidliy = sum % 10;
        sidchk = 0;
        if (sidliy != 0) {
            sidchk = 10 - sidliy;
        }
        else {
            sidchk = 0;
        }
        if (sidchk != getlist[9]) {
            return false;
        }
        return true;
    }, "올바른 사업자 등록번호가 아닙니다.");

    /*
    @description
    추가된 inputbox 2개로 나뉜 $.validator의 주민 등록번호 검증 방법입니다.
    */
    $.validator.addMethod("kica_ihidnum_method", function(value, element, param) {
        if(param == false){return true;}
        var zoominNum = '';
        $(element).parents('form').find('input[name="' + element.name + '"]').each(function() {
            zoominNum += $.trim($(this).val());
        });
        zoominNum = zoominNum.replace(/-/ig, '');
        return $.isIhidnum(zoominNum);
    }, "올바른 주민 등록번호가 아닙니다.");

    /*
    @description
    추가된 inputbox가 하나인 $.validator의 사업자 등록번호 검증 방법입니다.
    */
    $.validator.addMethod("kica_inputOneBizrno_method", function(value, element, param) {
        if(param == false){return true;}
        var sum = 0;
        var getlist = new Array(10);
        var chkarg = new Array("1", "3", "7", "1", "3", "7", "1", "3", "5");
        for (var i = 0; i < 10; i++) {
            getlist[i] = saupzaNum.substring(i, i + 1);
        }
        for (var i = 0; i < 9; i++) {
            sum += getlist[i] * chkarg[i];
        }
        sum = sum + parseInt((getlist[8] * 5) / 10);
        sidliy = sum % 10;
        sidchk = 0;
        if (sidliy != 0) {
            sidchk = 10 - sidliy;
        }
        else {
            sidchk = 0;
        }
        if (sidchk != getlist[9]) {
            return false;
        }
        return true;
    }, "올바른 사업자 등록번호가 아닙니다.");


    /*
    @description
    추가된 $.validator의 셀렉트 박스 검증 방법입니다.
    셀렉트 박스의 선택여부를 확인합니다.
    */
    $.validator.addMethod("kica_selectBoxSelected_method", function(value, element, param) {
        if(param == false){return true;}
        return (value != '');
    }, "선택하세요");

    /*
    @description
    추가된 $.validator의 전화번호 검증 방법입니다.
    */
    $.validator.addMethod("kica_tel_method", function(value, element, param) {
        if(param == false){return true;}
        var telNum = '';
        $(element).parents('form').find('*[name="' + element.name + '"]').each(function() {
            telNum += $.trim($(this).val());
        });
        telNum = telNum.replace(/-/gi, "");
        var regExp = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/;
        if (regExp.test(telNum)) {
            return true;
        } else {
            return false;
        }
    }, "올바른 전화번호가 아닙니다.");

    /*
    @description
    추가된 $.validator의 이메일 검증 방법입니다.
    */
    $.validator.addMethod("kica_email_method", function(value, element, param) {
        if(param == false){return true;}
        var testAddress = $(element).parents('form').find('*[name="' + element.name + '"]').map(function() {
            return this.value;
        }).get().join('');
        var regExp = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
        if (regExp.test(testAddress)) {
            return true;
        } else {
            return false;
        }
    }, $.validator.messages.email);

    /*
    @description
    추가된 $.validator의 라디오 버튼 선택 강요 메소드입니다.
    */
    $.validator.addMethod("kica_forceToSelect_method", function(value, element, param) {
        if(!_.isString(param)){return true;}
        var $forceTarget = $(element).parents('form').find(param);
        if($forceTarget.length){
           if($forceTarget.is(':checked')){
               return true;
           }else{
               $forceTarget.focus();
               return false;
           }
        }else{
            return true;
        }
    }, $.validator.messages.required);

    /*
    @description
    추가된 $.validator의 라디오 버튼 및 체크박스 선택 강요 메소드입니다.
    체크박스 배열이나 라디오 버튼 배열 요소중 한 개라도 체크되지 않으면 false를 반환합니다.
    배열 요소중 클릭을 권장하고 싶은 엘리먼트 1개에만 작성해 주시기 바랍니다.
    */
    $.validator.addMethod("kica_forceToCheck_method", function(value, element, param) {
        if(!_.isString(param)){return true;}
        if(param === 'false'){return true;}
        var $targets = $(element).parents('form').find('[name="' + param + '"]');
        param = $targets.length;
        return $targets.is(':checked');
    }, function(param, element) {
        var template = $.validator.format('{0}개 요소중 하나는 반드시 체크해야 합니다.')
        return template($(element).parents('form').find('[name="' + param + '"]').length);
    });

    /*
    @description
    추가된 $.validator의 신청자 수 제한 메소드입니다.
    */
    $.validator.addMethod("kica_applyQt_method", function ( qy, element, limit ) {
        if(!_.isString(limit)){return true;}
        if(limit === 'false'){return true;}
        var valid = false;

        qy = Number(qy);
        limit = Number(limit);

        if(qy <=0){
            valid = false;
        }else if(qy == limit){
            valid = true;
        }else if(qy > limit){
            //신청자수가 제한인수보다 큰 경우
            valid = false;
        }else{
            valid = true;
        }
        return valid;
    } , function(limit, element) {
        var template = $.validator.format('신청 기능한 인원은 {0}명 입니다')
        return template(limit);
    });

    /*
    @description
    추가된 $.validator의 숫자 및 대시문자 검증 메소드입니다.
    */
    $.validator.addMethod("kica_numbersWithDash_method", function(value, element, param) {
        var regExp = /^\d+-((\d+-?)*)?$/;
        return regExp.test(value);
    }, '숫자로 시작되어야 하며 숫자와 - 만 입력 가능합니다.');

    /*
    @description
    추가된 $.validator의 신청번호 검증 메소드입니다.
    123456-1234-1234 만 true
    */
    $.validator.addMethod("kica_applyNumber_method", function(value, element, param) {
        var regExp = /^\d{6}-\d{4}-\d{4}$/;
        return regExp.test(value);
    }, '123456-1234-1234 형식으로만 입력 가능합니다.');

    /*
    @description
    data-rule-required를 대체하여 사용하기 위해 만들어졌습니다.
         룰의 추가와 삭제가 쉽다는 장점이 있습니다.
    */
    $.validator.addMethod("kica_required_method", function(value, element, param){
        if(param === 'false'){return true;}
        return $.trim( value ).length > 0;
    }, $.validator.messages.required);


    /*
    @description
    data-rule-required를 대체하여 사용하기 위해 만들어졌습니다.
         룰의 추가와 삭제가 쉽다는 장점이 있습니다.
    */
    $.validator.addMethod("kica_required_cert_method", function(value, element, param){
        if(param === 'false'){return true;}
        return $.trim( value ) != '99';
    }, $.validator.messages.required);


    /*
    @description
         특수문자의 입력을 방지하기 위해 만들어졌습니다.
    */
    $.validator.addMethod("kica_preventSpChar_method", function(value, element, param){
        if(param === 'false'){return true;}
        return !(/[~!@\#$%<>^&*\()\-=+_\’]/gi.test(value));
    }, '특수문자는 입력할 수 없습니다.');

    /*
    @description
    추가된 $.validator의 본인확인 성공여부 검증 메소드입니다.
    */
    $.validator.addMethod("kica_selfCnfrm_method", function(value, element, param) {
        if(param === 'false'){return true;}
        //본인 확인이 시도되었는가?
        var authorizeTried = $(element).attr('data-authorizeTried') === 'Y';
        //본인 확인에 성공했는가?
        var authorized = $(element).attr('data-authorized') === 'Y';
        var valid = false;
        if(authorizeTried){
            if(authorized){
                valid = true;
            }
        }
        return valid;
    },function(param, element){
        //본인 확인이 시도되었는가?
        var authorizeTried = $(element).attr('data-authorizeTried') === 'Y';
        //본인 확인에 성공했는가?
        var authorized = $(element).attr('data-authorized') === 'Y';
        var msg = "";
        if(!authorizeTried){
            msg = "휴대폰을 통한 본인 확인이 필요합니다.";
        }else if(!authorized){
            msg = "휴대폰을 통한 본인 확인에 실패했습니다. 다시 시도해주세요.";
        }else{
            msg = "에러가 발생했습니다.";
        }
        return msg;
    });

    /*
    @description
    IP주소의 벨리데이션을 체크합니다.
    */
    $.validator.addMethod('kica_ip_method', function(value) {
        var split = value.split('.');
        if (split.length != 4)
            return false;

        for (var i=0; i<split.length; i++) {
            var s = split[i];
            if (s.length==0 || isNaN(s) || s<0 || s>255)
                return false;
        }
        return true;
    }, '올바른 IP주소가 아닙니다.');

    /*
    @description
        복수개 input의 required체크
    */
    $.validator.addMethod("require_from_group", function(value, element, options) {
        var $fields = $(options[1], element.form),
            $fieldsFirst = $fields.eq(0),
            validator = $fieldsFirst.data("valid_req_grp") ? $fieldsFirst.data("valid_req_grp") : $.extend({}, this),
            isValid = $fields.filter(function() {
                return validator.elementValue(this);
            }).length >= options[0];

        // Store the cloned validator for future validation
        $fieldsFirst.data("valid_req_grp", validator);

        // If element isn't being validated, run each require_from_group field's validation rules
        if (!$(element).data("being_validated")) {
            $fields.data("being_validated", true);
            $fields.each(function() {
                validator.element(this);
            });
            $fields.data("being_validated", false);
        }
        return isValid;
    }, $.validator.format("{0}개 이상의 필드가 필수 입력입니다."));

    /*
    @description
    스마트 에디터 내부의 텍스트가 비어있는지 체크합니다.
    */
    $.validator.addMethod('kica_seRequired_method', function(value, element, param) {
        if(param === 'false'){return true;}
        var targetId = $(element).attr('id');
        var proxyId = targetId + '_se';
        var innerText = window[proxyId].getById[targetId].getIR().replace(/<(\/)?[p](\/)?>/g, '').replace(/<(\/)?br(\/)?>/gi, '').replace(/\&nbsp;/g, '');
        return innerText.length >0;
    }, '에디터 내부가 비어 있습니다.');

    /*
    @description
    추가된 $.validator의 컨펌여부 검증 메소드입니다.
    */
    $.validator.addMethod("kica_stepCnfrm_method", function(value, element, param) {
        if(param === 'false'){return true;}
        //이 단계가 컨펌 된 상태인가?
        return $(element).attr('data-Cnfrm') === 'Y';
    },function(param, element){
        var btnMsg = $(element).text();
        if(btnMsg.length <= 0){
            btnMsg = $(element).val();
        }
        return btnMsg + '이(가) 선행되어야 합니다.';
    });

    /*
    @description
    Older "accept" file extension method. Old docs: http://docs.jquery.com/Plugins/Validation/Methods/accept
    */
    $.validator.addMethod("extension", function(value, element, param) {
        param = typeof param === "string" ? param.replace(/,/g, "|") : "png|jpe?g|gif";
        return this.optional(element) || value.match(new RegExp(".(" + param + ")$", "i"));
    }, function(param, element) {
        var msg = '다음 파일만 선택하실 수 있습니다.';
        if(param.split('|').length >= 2){
            msg = '다음 파일들만 선택하실 수 있습니다.';
        }
        var template = $.validator.format(msg + ' [ {0} ]');
        return template(param.replace(/\|/ig,', '));
    });

    /*
    @description
    추가된 $.validator의 입력 칸 검증 방법입니다.
    영문, 숫자 및 특수문자를  포함하고 있어야 합니다.
    */
    $.validator.addMethod("kica_EngAndNumWithSpe_method", function(value, element, param) {
        //var regExp = /^(?=[a-zA-z0-9]*$)(?=.*\d)(?=.*[a-zA-Z]*$)(?=.*\d)(?=[~!@\#$%<>^&*\()\-=+_\’])*$/;//[~!@\#$%<>^&*\()\-=+_\’]
        //var regExp = /^(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9])(?=.*[0-9]).{10,15}$/;
        //var regExp = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&+=]).*$/;
        var regExp = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^*()\-_=+\\\|\[\]{};:\'",.<>\/?]).*$/;

        return regExp.test(value);
    }, $.validator.format("영문, 숫자, 특수문자를 혼합하여 입력해주세요."));

    /*
    @description
    추가된 $.validator의 입력 칸 검증 방법입니다.
    설정된 글자 이상 입력될 수 없음
    */
    $.validator.addMethod("kica_maxLength_method", function(value, element, param) {
        var maxLen = parseInt(param,10);
        var isValid = false;
        if(_.isNumber(maxLen)){
            isValid = (value.length <= maxLen);
        }
        return isValid;
    }, $.validator.format("{0}자를 넘을 수 없습니다."));

    /*
    @description
    입력값의 Length값을 체크하여 10자리일 경우 사업자번호 체크, 13자리일 경우 주민번호를 체크
    */
    $.validator.addMethod("kica_bizrnoWithIhidnum_method", function(value, element, param) {
        if(param == false){return true;}

        var numVal = $(element).parents('form').find('input[name="' + element.name + '"]').val();

        if(numVal.length == 10) {
            var saupzaNum = numVal;
            var sum = 0;
            var getlist = new Array(10);
            var chkarg = new Array("1", "3", "7", "1", "3", "7", "1", "3", "5");
            for (var i = 0; i < 10; i++) {
                getlist[i] = saupzaNum.substring(i, i + 1);
            }
            for (var i = 0; i < 9; i++) {
                sum += getlist[i] * chkarg[i];
            }
            sum = sum + parseInt((getlist[8] * 5) / 10);
            sidliy = sum % 10;
            sidchk = 0;
            if (sidliy != 0) {
                sidchk = 10 - sidliy;
            }
            else {
                sidchk = 0;
            }
            if (sidchk != getlist[9]) {
                $.validator.messages.kica_bizrnoWithIhidnum_method = "올바른 사업자 등록번호가 아닙니다.";
                return false;
            }
        } else if(numVal.length == 13) {
            if(!$.isIhidnum(numVal)) {
                $.validator.messages.kica_bizrnoWithIhidnum_method = "올바른 주민 등록번호가 아닙니다.";
                return false;
            }
        } else {
            $.validator.messages.kica_bizrnoWithIhidnum_method = "올바른 사업자/주민 등록번호가 아닙니다.";
            return false;
        }

        return true;

    }, $.validator.messages.kica_bizrnoWithIhidnum_method);

    /*
    @description
  $.validator의 주민 등록번호 검증 클래스 룰입니다.
    클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
  required : 필수 입력
  digits : 숫자만 입력 가능
  kica_InputMinLength_method : 2개의 인풋 태그에 값이 삽입되어야 함
  kica_bizrno_method : 사업자 번호
    */
    $.validator.addClassRules("kica_ihidnum_ClassRule", {
        required: true,
        digits: true,
        kica_InputMinLength_method: 2,
        kica_ihidnum_method: true
    });

    /*
    @description
  $.validator의 사업자 등록번호 검증 클래스 룰입니다.
    클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
  required : 필수 입력
  digits : 숫자만 입력 가능
  kica_InputMinLength_method : 3개의 인풋 태그에 값이 삽입되어야 함
  kica_bizrno_method : 사업자 번호
    */
    $.validator.addClassRules("kica_bizrno_ClassRule", {
        required: true,
        digits: true,
        kica_InputMinLength_method: 3,
        kica_bizrno_method: true
    });

    /*
    @description
  $.validator의 전화번호 검증 클래스 룰입니다.
    클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
  required : 필수 입력
  digits : 숫자만 입력 가능
  kica_InputMinLength_method : 2개의 인풋 태그에 값이 삽입되어야 함
  kica_hp_method : 전화 번호 검증
    */
    $.validator.addClassRules("kica_tel_ClassRule", {
        required: true,
        digits: true,
        kica_InputMinLength_method: 2,
        kica_tel_method: true
    });

    /*
    @description
  $.validator의 이메일 검증 클래스 룰입니다.
    클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
  required : 필수 입력
  kica_InputMinLength_method : 2개의 인풋 태그에 값이 삽입되어야 함
  kica_email_method : 입력된 이메일 주소를 검증
    */
    $.validator.addClassRules("kica_email_ClassRule", {
        required: true,
        kica_InputMinLength_method: 2,
        kica_email_method: true
    });

    /*
    @description
  $.validator의 이름 및 사업자명 검증 벨리데이션 룰입니다.
    클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
  required : 필수 입력
  maxlength : 32자 이상 입력될 수 없음
    */
    $.validator.addClassRules("kica_rprSntvNm_ClassRule", {
        required: true,
        maxlength: 32
    });

    /*
    @description
  $.validator의 발급용 비밀번호 검증 벨리데이션 룰입니다.
    클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
  required : 필수 입력
  minlength : 4자 이하 입력될 수 없음
  maxlength : 10자 이상 입력될 수 없음
    */
    $.validator.addClassRules("kica_ordPw_ClassRule", {
        required: true,
        kica_preventSpChar_method: true,
        kica_EngWithNum_method: true,
        kica_forceTextLen_method: 10
    });

    /*
    @description
  $.validator의 IP 검증 벨리데이션 룰입니다.
    클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
  required : 필수 입력
  kica_ip_method : IP주소만 입력될 수 있음
    */
    $.validator.addClassRules("kica_ip_ClassRule", {
        required: true,
        kica_ip_method: true
    });

    /*
    @description
    $.validator의 발급용 비밀번호 검증 벨리데이션 룰입니다.
      클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
    required : 필수 입력
    minlength : 8자 이하 입력될 수 없음
    kica_maxLength_method : 12자 이상 입력될 수 없음
    kica_EngAndNumWithSpe_method : 영문, 숫자 및 특수문자를  포함하고 있어야 합니다.
    */
    $.validator.addClassRules("kica_sslPw_ClassRule", {
        required: true,
        minlength: 8,
        kica_maxLength_method: 12,
        kica_EngAndNumWithSpe_method: true
    });

    /*
    @description
    $.validator의 같은 필드의 사업자 또는 주민번호 벨리데이션 룰입니다.
      클래스에 반응해서 다음의 복합 벨리데이션 룰을 적용합니다.
    required : 필수 입력
    minlength : 10자 이하 입력될 수 없음
    kica_maxLength_method : 13자 이상 입력될 수 없음
    kica_bizrnoWithIhidnum_method : 10자리일 경우 사업자번호 체크, 13자리일 경우 주민번호를 체크
    */
    $.validator.addClassRules("kica_bizrnoWithIhidnum_ClassRule", {
        required: true,
        minlength: 10,
        kica_maxLength_method: 13,
        kica_bizrnoWithIhidnum_method: true
    });

    /*
    @description
    영문자, 숫자 입력 체크 룰입니다.
    input에 입력 자체를 못하도록 합니다.
    */
    $.fn.alphanumeric = function(p) {
        p = $.extend({
            ichars : "!@#$%^&*()+=[]\\\';,/{}|\":<>?~`.- ",
            nchars : "",
            allow : ""
        }, p);
        return this.each(function() {
            if (p.nocaps)
                p.nchars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            if (p.allcaps)
                p.nchars += "abcdefghijklmnopqrstuvwxyz";
            s = p.allow.split('');
            for (i = 0; i < s.length; i++)
                if (p.ichars.indexOf(s[i]) != -1)
                    s[i] = "\\" + s[i];
            p.allow = s.join('|');
            var reg = new RegExp(p.allow, 'gi');
            var ch = p.ichars + p.nchars;
            ch = ch.replace(reg, '');
            $(this).keypress(function(e) {
                if (!e.charCode)
                    k = String.fromCharCode(e.which);
                else
                    k = String.fromCharCode(e.charCode);
                if (ch.indexOf(k) != -1)
                    e.preventDefault();
                if (e.ctrlKey && k == 'v')
                    e.preventDefault();
            });
            $(this).bind('contextmenu', function() {
                return false;
            });
        });
    };
    $.fn.alphanumericExcept = function(p) {
        p = $.extend({
            ichars : "!@#$%^&*()+=[]\\\';,/{}|\":<>?~`- ",
            nchars : "",
            allow : ""
        }, p);
        return this.each(function() {
            if (p.nocaps)
                p.nchars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            if (p.allcaps)
                p.nchars += "abcdefghijklmnopqrstuvwxyz";
            s = p.allow.split('');
            for (i = 0; i < s.length; i++)
                if (p.ichars.indexOf(s[i]) != -1)
                    s[i] = "\\" + s[i];
            p.allow = s.join('|');
            var reg = new RegExp(p.allow, 'gi');
            var ch = p.ichars + p.nchars;
            ch = ch.replace(reg, '');
            $(this).keypress(function(e) {
                if (!e.charCode)
                    k = String.fromCharCode(e.which);
                else
                    k = String.fromCharCode(e.charCode);
                if (ch.indexOf(k) != -1)
                    e.preventDefault();
                if (e.ctrlKey && k == 'v')
                    e.preventDefault();
            });
            $(this).bind('contextmenu', function() {
                return false;
            });
        });
    };
    $.fn.numeric = function(p) {
        var az = "abcdefghijklmnopqrstuvwxyz";
        az += az.toUpperCase();
        p = $.extend({
            nchars : az
        }, p);
        return this.each(function() {
            $(this).alphanumeric(p);
        });
    };
    $.fn.currency = function(p) {
        var az = "abcdefghijklmnopqrstuvwxyz";
        az += az.toUpperCase();
        p = $.extend({
            nchars : az,
            allow : "."
        }, p);
        return this.each(function() {
            $(this).alphanumeric(p);
        });
    };
    $.fn.alpha = function(p) {
        var nm = "1234567890";
        p = $.extend({
            nchars : nm
        }, p);
        return this.each(function() {
            $(this).alphanumeric(p);
        });
    };

    /*
    @description
    $.fn.kica_numeric 숫자만 입력 가능 함수
    */
    $.fn.kica_numeric = function() {
        this.numeric();
        this.css("ime-mode", "disabled");
        return this;
    };

    /*
    @description
    $.fn.kica_numeric 숫자, .만 입력 가능 함수(달러입력 가능하도록)
    */
    $.fn.kica_currency = function() {
        this.currency();
        this.css("ime-mode", "disabled");
        return this;
    };

    /*
    @description
    $.fn.kica_alphanumeric 영문자, 숫자만 입력 가능 함수
    */
    $.fn.kica_alphanumeric = function() {
        this.alphanumeric();
        this.css("ime-mode", "disabled");
        return this;
    };

    $.fn.kica_alphanumericExcept = function() {
        this.alphanumericExcept();
        this.css("ime-mode", "disabled");
        return this;
    };

    /*
    @description
    $.fn.kica_alpha 영문자만 입력 가능 함수
    */
    $.fn.kica_alpha = function() {
        this.alpha();
        this.css("ime-mode", "disabled");
        return this;
    };

})(jQuery, window);