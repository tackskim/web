(function ($, win) {

    /*
     @description
     보안을 위한 설정입니다.
     window.console.log 함수를 멍키 패치하여 브라우저 로그 출력을 금지합니다.
     개발기간 중에는 주석처리를 권합니다.
     */
//    if (!window['console']) {
//        window['console'] = {};
//        console.log = function () {
//        };
//    }

/*
    $.ajaxSetup({
        timeout: 35000 //Time in milliseconds
    });
*/
    /*
    @description
    $.ajax함수에 대한 전역 필터입니다.
        스프링 AOP와 비슷하게 Ajax프로퍼티를 decorate하거나 오버라이드 할 수 있습니다.
    */
    var postFilter = function( options, originalOptions, jqXHR ) {
        var speed = 200;
        //모든 $.ajax요청을 post로 고정
        options.type = 'post';
        options.beforeSend = function (jqXHR, settings) {
            jqXHR.setRequestHeader("AJAX", true);
            if(!isExcludeLoadingLayerCheck(options)) $('#loadingAlert').fadeIn(speed);
            if(typeof originalOptions.beforeSend === "function"){
                originalOptions.beforeSend(jqXHR, settings);
            }
        },
        options.success = function(data, textStatus, jqXHR){
            try{
                if(typeof originalOptions.success === "function"){
                    originalOptions.success(data, textStatus, jqXHR);
                }
            }catch(e){
                options.error(jqXHR,'success',e);
            }
        },
        options.error = function(jqXHR, textStatus, errorThrown){
            if(typeof originalOptions.error === "function"){
                originalOptions.error(jqXHR, textStatus, errorThrown);
            }

            if(jqXHR.status !== 200){
                var uri = __contextPath__;
                switch(jqXHR.status){
                    case 400:
                        uri += '/error400.sg';
                        break;
                    case 404:
                        uri += '/error404.sg';
                        break;
                    case 406:
                        uri += JSON.parse(jqXHR.responseText).redirectUrl
                        break;
                    default:
                        uri += '/error.sg';
                        break;
                }
            }
            location.href = uri;

        },
        options.complete = function(jqXHR, textStatus){
            if(typeof originalOptions.complete === "function"){
                originalOptions.complete(jqXHR, textStatus);
            }
            if(textStatus === 'timeout'){
                $.okAlert('<p>서버의 응답이 지연되고 있습니다.</p><p>잠시 후 다시 이용하여 주십시오.</p>');
            }
            if(!isExcludeLoadingLayerCheck(options))$('#loadingAlert').fadeOut(speed);
        }
    };

    $.ajaxPrefilter(postFilter);

    /*
    @class: kicaSmartEditor
    @extends: smart editor
    @param smart editor의 파라미터를 확장한 파라미터를 수신합니다.
    http://jindo.dev.naver.com/smarteditor/user_guide/를 참조하십시오.
    @returns jquery function
    @description
    마크업에 의존적인 기본 옵션이 미리 정의되어 있습니다.
    */
    $.widget("custom.kicaSmartEditor", {
        value: function( value ) {
            var proxyPrefix = this.element[0].id;
            var proxyID = proxyPrefix + '_se';
            var proxy = window[proxyID];
            var remoteProxy;
            if(window[proxyID] === "undefined"){
                alert('스마트 에디터 초기화에 문제가 있습니다. 다시 확인해 주세요.');
                return false;
            }else{
                remoteProxy = proxy.getById[proxyPrefix];
            }
            if(typeof value === "undefined"){
                //getter
                return remoteProxy.getIR();
            }else{
                //setter
                remoteProxy.exec("PASTE_HTML", [value]);
            }
        },
        _init: function () {
            var that = this,
                editorRefName = that.element[0].id + '_se';
            window[editorRefName] = [];
            if(typeof __contextPath__ === "undefined"){
                alert('컨텍스트 패스에 접근할 수 없습니다. __contextPath__ 라는 이름으로 컨텍스트 패스를 선언해 주십시오. ');
                return false;
            }
            var defaultOption = {
                    contextPath: __contextPath__,
                    oAppRef: window[editorRefName],
                    elPlaceHolder: that.element[0].id,
                    sSkinURI: __contextPath__ + "/resources/se/SmartEditor2Skin.html",
                    htParams : {
                        bUseToolbar : true,             // 툴바 사용 여부 (true:사용/ false:사용하지 않음)
                        bUseVerticalResizer : true,     // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
                        bUseModeChanger : true,          // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
                        fOnBeforeUnload : function(){}
                        //aAdditionalFontList : aAdditionalFontSet,     // 추가 글꼴 목록
                    },
                    fCreator: "createSEditor2"
                };

            mergedOptions = $.extend({}, defaultOption, this.options),

            nhn.husky.EZCreator.createInIFrame(mergedOptions);

            return $(that).deepScan();
        }
    });

    /*
     @class: kicaSlider
     @extends: jQuery.ui.slider
     @param jquery ui와 동일한 마라미터를 수신합니다.
     http://api.jqueryui.com/slider/를 참조하십시오.
     @returns jquery function
     @description
     마크업에 의존적인 기본 옵션이 미리 정의되어 있습니다.
     얼마든지 오버라이드가 가능합니다만, 옵션이나 비지니스 로직이 비대해 질 경우는 새로운 위젯을 작성하는 것도 검토해 보시기 바랍니다.
     @example $('#sliderExample').kicaSlider();
     */
    $.widget("custom.kicaSlider", {
        _init: function () {
            var defaultOption = {
                    range: true,
                    values: [ 0, 10 ],
                    inline: true
                },
                mergedOptions = $.extend({}, defaultOption, this.options),
                $el = this.element;

            if (typeof $el.slider === "undefined") {
                alert('jQuery.ui.slider 를 찾을 수 없습니다.');
                return false;
            }
            //슬라이더 랜더링 개시
            $el.slider(mergedOptions);
        }
    });

    /*
     @class: kicaDatePicker
     @extends: jQuery.ui.datepicker
     @param jquery ui와 동일한 마라미터를 수신합니다.
     http://api.jqueryui.com/datepicker/를 참조하십시오.
     @returns jquery function
     @description
     마크업에 의존적인 기본 옵션이 미리 정의되어 있습니다.
     얼마든지 오버라이드가 가능합니다만, 옵션이나 비지니스 로직이 비대해 질 경우는 새로운 위젯을 작성하는 것도 검토해 보시기 바랍니다.
     @example $('#datepickerExample').kicaDatePicker();
     */
    $.widget("custom.kicaDatePicker", {
        _init: function () {
            var defaultOption = {},
                mergedOptions = $.extend({}, defaultOption, this.options),
                $el = this.element;

            if (typeof $el.datepicker === "undefined") {
                alert('jQuery.ui.datepicker 를 찾을 수 없습니다.');
                return false;
            }

            $.datepicker.regional['ko'] = {
                changeMonth: true,
                changeYear: true,
                closeText:'닫기',
                prevText:'다음달',
                nextText:'이전달',
                currentText:'오늘',
                monthNames:['01','02','03','04','05','06','07','08','09','10','11','12'],
                monthNamesShort:['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
                dayNames:['일','월','화','수','목','금','토'],
                dayNamesShort:['일','월','화','수','목','금','토'],
                dayNamesMin:['일','월','화','수','목','금','토'],
                weekHeader:'Wk',
                dateFormat:'yy-mm-dd',
                firstDay:0,
                showMonthAfterYear:true,
                yearSuffix:'',
                yearRange: "-10:+10",
                showOn: "button",
                buttonImage: __contextPath__ + "/resources/img/btn/btn_calendar.gif",
                buttonImageOnly: true,
                numberOfMonths: 1
            };
            $.datepicker.setDefaults($.datepicker.regional['ko']);

            //date picker 랜더링 개시
            $el.datepicker(mergedOptions);
        }
    });

    /*
    @description
  $.notify 프레임웍에서 레이어 사이즈를 조정시 사용하는 함수입니다.
    */
    $.fn.layerResize = function(){
        var $layer = this;
        var titH = $layer.find('.layer-header').outerHeight(); //레이어 헤더 높이
        var conH = $layer.find('.layer-body').outerHeight(); //레이어 컨텐츠 높이
        var screenH = $(window).height(); //스크린 높이
        var gap = 2*30; //레이어 상하 마진의 합

        if(conH > screenH - titH){ //레이어 컨텐츠가 스크린보다 길면
            $layer.find('.layer-inner').css({
                height : (screenH - titH - gap)+'px',
                overflow : 'auto'
            });
            $layer.find('.layerpop').css('margin-top',-((screenH - gap)/2)+'px');
        }else{
            $layer.find('.layer-inner').css({
                height : conH+'px'
            });
            $layer.find('.layerpop').css('margin-top',-((conH + titH)/2)+'px');
        }
    };

    /*
    @description
  툴팁과 알림 레이어를 띄우는 $.notify 프레임웍의 본체입니다.
    */
    $.notify = function(cmd, msg, focusingTarget, option){
        if(typeof cmd !== 'string'){return this;}
        var commands = [
            {'alert':'#validationMessageTemplate'},
            {'tip':'#validationMessageTemplate'}
        ];
        var widthes = [
            {'alert':'360'},
            {'tip':'360'}
        ];
        var msgPlaceHolders = [
           {'alert':'<p>'},
           {'tip':'<p>'}
        ];
        var prefict = function(record,idx){
            return record.hasOwnProperty(cmd);
        };
        var layerSelector = _.find(commands,prefict)[cmd];
        var width = _.find(widthes,prefict)[cmd];
        var placeHolder = _.find(msgPlaceHolders,prefict)[cmd];
        if(typeof layerSelector === 'undefined'){return this;}

        var targetCloneLayerSelector = layerSelector.replace('Template','');
        $(targetCloneLayerSelector).remove();
        var $layer = '';
        if(_.isUndefined(focusingTarget)){
            $layer = $(layerSelector).clone().attr('id',targetCloneLayerSelector.replace('#','')).insertBefore(layerSelector);
        }else{
            if(cmd === 'tip'){
                $layer = $(layerSelector).clone().attr('id',targetCloneLayerSelector.replace('#','')).insertBefore(focusingTarget);
            }else{
                $layer = $(layerSelector).clone().attr('id',targetCloneLayerSelector.replace('#','')).insertBefore(layerSelector);
            }
        }

        //너비와 포지션 수정
        $layer.find('.layerpop').css({
            width : width +'px',
            marginLeft : -(width/2)+'px'
        });

        //버튼 모두 삭제 함수
        $layer.removeAllBtn = function(){
            $layer.find('.vm-bottom').empty();
        };

        $layer.find('.layer-header').find('.layer-close').focus();

        $layer.layerResize(); //레이어 컨텐츠 길이에 따라 높이 조절

        if(cmd === 'tip'){
            $layer.removeClass('vm-layer');
        }else{
            $layer.addClass('vm-layer');
        }

        if(typeof option === 'string'){
            $layer.addClass('wide');
        }

        $layer.find('.vm-close').on('click',function(){
            $layer.hide();
        });

        // 레이어 컨텐츠 높이에 따라 리사이징
        $(window).resize(function(){
            $layer.layerResize();
        }); //윈도우 창 리사이즈 할 때마다 함수 호출

        //message setter
        $layer.setMsg = function (msg){
            if(typeof msg === 'string' && msg.length > 0){
                var $msgContainer = $layer.find('div.txt-area');
                $msgContainer.empty();
                if(cmd === 'tip'){
                    $msgContainer.append(msg);
                }else if(cmd === 'alert'){
                    if(_.isElement($.parseHTML(msg)[0])){
                        if($(msg).prop("tagName").toLowerCase() === 'p'){
                            $msgContainer.append(msg);
                        }else{
                            $msgContainer.append($('<p>').text(msg));
                        }
                    }else{
                        $msgContainer.append($('<p>').text(msg));
                    }
                }else{
                    var msgChunks = msg.match(/.{1,20}/g);
                    $.each(msgChunks,function(idx,msg){
                        var $msgPlaceHolder = $(placeHolder);
                        $msgPlaceHolder.text(msg);
                        $msgContainer.append($msgPlaceHolder);
                    });
                }
            }
        };

        //메세지가 존재할 경우
        if(typeof focusingTarget === 'string'){
            msg = focusingTarget;
        }else{
            //포커싱 해야 하는 타겟이 스마트 에디터일 경우
            if($(focusingTarget).attr('kica_seRequired_method') === 'true'){
                focusingTarget = $(focusingTarget).next('iframe[src*=SmartEditor]')[0];
            }
        }

        //메세지 설정
        $layer.setMsg(msg);
        $layer.show();

        //show함수 오버라이드
        $layer.show = function (){
            if(cmd === 'tip' && typeof focusingTarget === 'object'){
                var $focusingTarget = $(focusingTarget);
                var x = $focusingTarget.position().left;
                var y = $focusingTarget.position().top;
                $layer.css({
                    left: parseInt(x+0,10) + "px",
                    top: parseInt(y-30,10) + "px"
                }).on('click',function(){
                    $(this).remove();
                });

                $focusingTarget.blur(function(){
                    $layer.hide();
                });

                //아래의 코드는 iE에서 오작동함
//                $layer.animate({scrollTop:$focusingTarget.offset().top -50}, 'fast');
            }

            $layer.fadeIn('fast');
            $layer.find('.vm-close').focus();

            if(typeof focusingTarget === 'object'){
                try{$focusingTarget.focus();}catch(e){}
            }
            return $layer;
        };

        //hide 함수 오버라이드
        $layer.hide = function (){
            $.when($layer.fadeOut('fast').promise()).done(function(){
                $layer.remove();
                if( typeof focusingTarget === 'object' && cmd !== 'tip'){
                    $(focusingTarget).focus(); //레이어띄운 요소에 포커스
                }
                if( typeof $layer.closed === 'function' && typeof $layer.closedEventHandler === 'function' ){
                    $layer.closedEventHandler();
                }
            });
            return $layer;
        };

        //버튼 추가 함수
        $layer._addBtn = function(title, text, callback, $btnTemplate){
            $btnTemplate.find('a').attr('title', title).text(text);
            if(typeof callback !== 'function'){
                callback = function(){
                    $layer.hide();
                };
            }else{
                $btnTemplate.on('click',function(){
                    callback($layer);
                });
            }
            $layer.find('.vm-bottom').append($btnTemplate);
            return $layer;
        };

        //레이어가 닫힌 이후에 실행될 이벤트 핸들러
        $layer.closedEventHandler = '';

        //레이어가 닫힌 후의 이벤트 핸들러 삽입
        $layer.closed = function(callback){
            $layer.closedEventHandler = callback
            return $layer;
        };

        //파란 버튼 추가 함수
        $layer.addBlueBtn = function(title, text, callback){
            var $btnTemplate = $('<span class="btn-cmn btn1 s"><a href="javascript:;" title="확인">확인</a></span>');
            return $layer._addBtn(title, text, callback, $btnTemplate);
        };

        //흰색 버튼 추가 함수
        $layer.addWhiteBtn = function(title, text, callback){
            var $btnTemplate = $('<span class="btn-cmn btn1 g s"><a href="javascript:;" title="확인">확인</a></span>');
            return $layer._addBtn(title, text, callback, $btnTemplate);
        };

        return $layer;
    };

    /*
    @description
  보다 간단하게 알림창을 띄우기 위한 래퍼입니다.
    */
    $.alert = function(msg, focusingTarget){
        return $.notify('alert', msg, focusingTarget);
    };

    /*
    @description
  보다 간단하게 확인버튼이 붙은 알림창을 띄우기 위한 래퍼이빈다,
    */
    $.okAlert = function(msg, focusingTarget) {
        var $d = new $.Deferred();
        var $p = $d.promise();
        $.notify('alert', msg, focusingTarget).addBlueBtn('확인','확인',function($layer){
            //TODO: 비지니스 로직을 적어 주시기 바랍니다.
            $d.resolve();
            //다음의 명령으로 창이 닫힙니다.
            $layer.hide();
        }).show();
        return $p;
    };

    /*
    @description
  보다 간단하게 confirm창을 띄우기 위한 래퍼입니다.
    */
    $.confirm = function(msg, focusingTarget) {
        var $d = new $.Deferred();
        var $p = $d.promise();
        $.notify('alert', msg, focusingTarget).addWhiteBtn('취소','취소',function($layer){
            $d.reject();
            $layer.hide();
        }).addBlueBtn('확인','확인',function($layer){
            //TODO: 비지니스 로직을 적어 주시기 바랍니다.
            $d.resolve();
            //다음의 명령으로 창이 닫힙니다.
            $layer.hide();
        }).show();
        return $p;
    };

    /*
    @description
  보다 간단하게 넓은 알림창을 띄우기 위한 래퍼입니다.
    */
    $.wideAlert = function(msg, focusingTarget){
        return $.notify('alert', msg, focusingTarget, 'wide');
    };

    /*
    @description
  폼 내에 data-kica 로 정의된 속성을 가진 체크된 input 태그가 있을 경우 해당 data-kica 속성을 form에 히든 필드로 추가합니다.
    */
/*
    $.fn.appendDataKica = function(){
        if(typeof document.certChceFrm === 'object'){
            return this;
        }else{
            $(this).find('input:checked').each(function() {
                $.each(this.attributes, function() {
                    if(this.specified) {
                        if(this.name.indexOf('data-kica') >= 0){
                            var keyTokens = this.name.split('-');
                            var key = keyTokens[keyTokens.length -1];
                            var value = this.value;
                            $(this).append('<input type="hidden" name="' + key + '" value="' + value + '" />');
                        }
                    }
                });
            });
        }
    };
*/

    /*
    @description
    네이버 맵 렌더링을 보다 간편하게 수행하기 위한 래퍼입니다.
    @param smart editor의 파라미터를 확장한 파라미터를 수신합니다.
    title:마커에 표시할 제목입니다.
    contextPath:개발환경의 컨텍스트 루트입니다.
    */
    $.fn.renderNaverMap = function(options){
        var that = this,
            defaultOpt = {
                $that: that,
                title:'',
                contextPath:'',
                markerImgPath:'http://static.naver.com/maps2/icons/pin_spot2.png',
                renderBackgroundSelector: 'div.map-api-area'
            };
        options = $.extend(true, defaultOpt, options);
        if(typeof options.korAddr !== 'string'){
            $(that).trigger('fail',['한국어로 된 지번 주소를 입력하세요. 키 값은 korAddr입니다.']);
        }else if(typeof options.apiKey !== 'string'){
            $(that).trigger('fail',['apiKey를 입력하세요. 키 값은 apiKey입니다.']);
        }else{
            $.post(options.contextPath + '/common/getMapCoordsInfo.json',{'korAddr':options.korAddr,'apiKey':options.apiKey}).done(function(data){
                if(typeof data.result === 'undefined'){
                    var x = parseFloat(data.EPSG_4326_X),
                        y = parseFloat(data.EPSG_4326_Y),
                        getRenderSize = function(target){
                            var $renderArea = $(target);
                            return {
                                x:parseInt($renderArea.width()),
                                y:parseInt($renderArea.height())
                            };
                        },
                        renderSize = getRenderSize(options.renderBackgroundSelector),
                        renderPointWidth = renderSize.x,
                        renderPointHeight = renderSize.y,
                        oPoint = new nhn.api.map.LatLng(y,x);
                    nhn.api.map.setDefaultPoint('LatLng');
                    oMap = new nhn.api.map.Map(options.$that.attr('id') ,{
                       point : oPoint,
                       zoom : 12,
                       enableWheelZoom : true,
                       enableDragPan : true,
                       enableDblClickZoom : false,
                       mapMode : 0,
                       activateTrafficMap : false,
                       activateBicycleMap : false,
                       minMaxLevel : [ 1, 14 ],
                       size : new nhn.api.map.Size(renderPointWidth, renderPointHeight)
                    });
                    var markerCount = 0;
                    // 컨트롤 설정
                    var mapZoom = new nhn.api.map.ZoomControl();
                    mapZoom.setPosition({left:10, top:10}); // - 줌 컨트롤 위치 지정.
                    oMap.addControl(mapZoom);
                    // 마커의 기본 표시 설정
                    var oSize = new nhn.api.map.Size(28, 37);
                    var oOffset = new nhn.api.map.Size(14, 37);
                    var oIcon = new nhn.api.map.Icon(options.markerImgPath, oSize, oOffset);
                    var oMarker1 = new nhn.api.map.Marker(oIcon, { title : options.title });
                    oMarker1.setPoint(oPoint);
                    oMap.addOverlay(oMarker1);
                    var oLabel1 = new nhn.api.map.MarkerLabel();
                    oMap.addOverlay(oLabel1);
                    if(options.title === ''){
                        oLabel1.setVisible(false, oMarker1);
                    }else{
                        oLabel1.setVisible(true, oMarker1);
                    }
                    //윈도우 크기 변화시 맵을 리사이즈
                    $(window).resize(function(a,b){
                        var renderSize = getRenderSize(options.renderBackgroundSelector),
                            renderPointWidth = renderSize.x,
                            renderPointHeight = renderSize.y;
                        oMap.setSize(new nhn.api.map.Size(renderPointWidth, renderPointHeight));
                    });
                    $(that).trigger('succeed');
                }else{
                    $(that).trigger('fail',['올바른 주소를 입력해 주세요.']);
                }
            }).fail(function(){
                $(that).trigger('fail',['네트워크 연결에 문제가 있습니다.']);
            });
        }
        return that;
    };

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
    //영문+숫자+. 입력 가능
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
    $.fn.kica_alphanumeric 영문자, 숫자만 입력 가능 함수
    */
    $.fn.kica_alphanumeric = function() {
        this.alphanumeric();
        this.css("ime-mode", "disabled");
        return this;
    };
    /*
    @description
    $.fn.kica_alphanumeric 영문자, 숫자, . 입력 가능 함수
    */
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

function isExcludeLoadingLayerCheck(options) {
    if(options == null) return false;
    return options.url.match(/ajaxCounter.json$/);
}
