
/* ===============================================
Date : 2016-01-04
Description : UI 관련 스크립트 함수 정의(레이어,네비게이션,배너 등)
=============================================== */

if(typeof pubUi!=="undefined"){alert("pubUi 변수가 중복사용되고 있습니다");}else{

    var pubUi = {

        /* ==================================================================
            GNB
        ================================================================== */
        gnbAction : function(){
            var obj = $('#gnbNav');
            var dep1 = $('.dep1',obj); //1depth
            var dep2 = $('.dep2', obj); //2depth
            var bg = $('.bg-gnb', obj); //2depth

            obj.find('.gnb').on({
                mouseenter : function(){
                    bg.show();
                    dep2.show();
                    //bg.slideDown('fast');
                    //dep2.slideDown('fast');
                },
                mouseleave : function(){
                    bg.hide();
                    dep2.hide();
                    //bg.slideUp('fast');
                    //dep2.slideUp('fast');
                }
            });

            //1depth 메뉴 탭 이벤트
            dep1.find('>li>a').on({
                focus : function(){
                    bg.show();
                    dep2.show();
                    //bg.slideDown('fast');
                    //dep2.slideDown('fast');
                },
                blur : function(){
                    setTimeout(function(){
                        if(dep1.find('a:focus').length == 0){
                            bg.hide();
                            dep2.hide();
                            //bg.slideUp('fast');
                            //dep2.slideUp('fast');
                        }
                    },0)
                }
            });

            //포커스 잃을 때
            dep1.find('a').on('blur', function(){
                setTimeout(function(){
                    if(dep1.find("a:focus").length == 0){
                        bg.hide();
                        dep2.hide();
                        //bg.slideUp('fast');
                        //dep2.slideUp('fast');
                    }
                },0)
            });
        },

        /* ==================================================================
            LNB
        ================================================================== */
        lnbAction : function(){
            var obj = $('#lnbNav');
            var target = $('>ul>li>a',obj);

            target.each(function(){
                var that = $(this);

                $(this).on({
                    mouseenter : function(){
                        $(this).next('.menu-wrap').show();
                        //$(this).find('.depth').slideDown('fast');
                    },
                    mouseleave : function(){
                        $(this).next('.menu-wrap').hide();
                        //$(this).find('.depth').slideUp('fast');
                    },
                    focus : function(){
                        $(this).next('.menu-wrap').show();
                        //$(this).next('.depth').slideDown('fast');
                    },
                    blur : function(){
                        setTimeout(function(){
                            if(that.next('.menu-wrap').find('a:focus').length == 0){
                              that.next('.menu-wrap').hide();
                            }
                        },0)
                    }
                });
                $('.menu-wrap').on({
                    mouseenter : function(){
                        $(this).show();
                        //$(this).find('.depth').slideDown('fast');
                    },
                    mouseleave : function(){
                        $(this).hide();
                        //$(this).find('.depth').slideUp('fast');
                    }
                })

                //포커스 잃을 때
                $(this).next('.menu-wrap').find('a').on('blur', function(){
                    setTimeout(function(){
                        if(that.next('.menu-wrap').find("a:focus").length == 0){
                            that.next('.menu-wrap').hide();
                            //that.find('.depth').slideUp();
                        }
                    },0)
                });
            });
        },

        /* ==================================================================
        헤더 리사이즈
        ================================================================== */
        headerResize : function(distance){
            obj = $("#headerWrap");

            $(window).scroll(function(){
                var position = $(window).scrollTop();
                if(position > distance){
                    $("#headerWrap").addClass('smaller');
                }else{
                    $("#headerWrap").removeClass('smaller');
                }
            });
        },

        /* ==================================================================
            레이어팝업
        ================================================================== */
        layerPop : function(id,w,event){ //레이어id, 클래스, 레이어 가로값
            var _thisElement; //레이어 띄우는 요소 저장 변수
            var _checkbox = $('input:checked');
            var _obj = $(id);

            _obj.find('.layerpop').css({
                width : w+'px',
                marginLeft : -(w/2)+'px'
            });
            if($('#validationMessage').length > 0){$('#validationMessage').remove();} //툴팁이 띄워져있다면 삭제
            _obj.fadeIn('fast');
            //_obj.find('.layer-header').find('.layer-close').focus(); // 접근성(키보드만 사용시)에 필요

            if(event){
                if(!event) event = window.event; //for firefox
                _thisElement = (event.target) ? event.target : event.srcElement;
            }

            layerResize(id); //레이어 컨텐츠 길이에 따라 높이 조절

            //닫기,취소
            _obj.find('.js-layer-close').on('click',function(){
                $(this).parents('.layerpop-wrap').fadeOut('fast');
                if(event){
                    _thisElement.focus(); //레이어띄운 요소에 포커스
                }
            });

            /* 레이어 컨텐츠 높이에 따라 리사이징 */
            function layerResize(id){
                var _obj = $(id);
                var titH = _obj.find('.layer-header').outerHeight(); //레이어 헤더 높이
                var conH = _obj.find('.layer-body').outerHeight(); //레이어 컨텐츠 높이
                var screenH = $(window).height(); //스크린 높이
                var gap = 2*30; //레이어 상하 마진의 합
                _obj.find('.layer-inner').css({
                    height : conH+'px',
                    overflow : 'auto'
                });
                _obj.find('.layerpop').css('margin-top',-((conH + titH)/2)+'px');

                if(conH > screenH - titH){ //레이어 컨텐츠가 스크린보다 길면
                    _obj.find('.layer-inner').css({
                        height : (screenH - titH - gap)+'px',
                        overflow : 'auto'
                    });
                    _obj.find('.layerpop').css('margin-top',-((screenH - gap)/2)+'px');
                }else{
                    _obj.find('.layer-inner').css({
                        height : conH+'px'
                    });
                    _obj.find('.layerpop').css('margin-top',-((conH + titH)/2)+'px');
                }
            }
            //$(window).resize(function(){layerResize(id);}) //윈도우 창 리사이즈 할 때마다 함수 호출
        },

        /* ==================================================================
            레이어팝업 리사이즈
        ================================================================== */
        layerResize : function(id){ //레이어id
            var _obj = $(id);
            var titH = _obj.find('.layer-header').outerHeight(); //레이어 헤더 높이
            var conH = _obj.find('.layer-body').css('height','auto').outerHeight(); //레이어 컨텐츠 높이
            var screenH = $(window).height(); //스크린 높이
            var gap = 2*30; //레이어 상하 마진의 합
            _obj.find('.layer-inner').css({
                height : conH+'px',
                overflow : 'auto'
            });
            _obj.find('.layerpop').css('margin-top',-((conH + titH)/2)+'px');

            if(conH > screenH - titH){ //레이어 컨텐츠가 스크린보다 길면
                _obj.find('.layer-inner').css({
                    height : (screenH - titH - gap)+'px',
                    overflow : 'auto'
                });
                _obj.find('.layerpop').css('margin-top',-((screenH - gap)/2)+'px');
            }else{
                _obj.find('.layer-inner').css({
                    height : conH+'px'
                });
                _obj.find('.layerpop').css('margin-top',-((conH + titH)/2)+'px');
            }
        },

        /* ==================================================================
            탭 배너 함수 (배너 1개 노출시 사용)
        ================================================================== */
        bannerTabFunc : function(option){
            var target = $('.js-banner-tab');

            target.each(function(n){
                var cmm = 0; //배너갯수에 따른 변수
                var timerID; //타이머 함수 담을 변수
                var bannerRolling = true; //재생.정지 구분 변수(기본 재생)
                var _this = $(this).find('>ul>li');
                var len = _this.length;
                _this.each(function(n){
                    $(this).find('.dot').removeClass('on');
                    $(this).find('.js-banner-con').css('z-index',0);
                    if(n == 0){
                        $(this).find('.dot').addClass('on');
                        $(this).find('.js-banner-con').css('z-index',1);
                    }
                    $(this).find('.dot').mouseover(function(){
                        _this.each(function(n){
                            $(this).find('.dot').removeClass('on');
                            $(this).find('.js-banner-con').css('z-index',0);
                        });
                        $(this).addClass('on');
                        $(this).next('.js-banner-con').css('z-index',1);
                        cmm = n;
                    });
                    $(this).find('.js-banner-con a').focus(function(){
                        _this.each(function(n){
                            $(this).find('.dot').removeClass('on');
                            $(this).find('.js-banner-con').css('z-index',0);
                        });
                        $(this).parent('.js-banner-con').prev('.dot').addClass('on');
                        $(this).parent('.js-banner-con').css('z-index',1);
                        cmm = n;
                    });
                });
                timerID = setInterval(function(){bannerTabStartRooling();},6000);
                if(option == "stop") {
                    bannerRolling = false;
                    clearInterval(timerID);
                }

                //재생버튼 함수
                $(this).find('.control-btns .play').click(function(){
                    bannerRolling = true;
                    timerID = setInterval(function(){bannerTabStartRooling();},3000);
                    $(this).hide();
                    $(this).parents('.control-btns').find('.stop').show().focus();
                })
                //정지버튼 함수
                $(this).find('.control-btns .stop').click(function(){
                    bannerRolling = false;
                    clearInterval(timerID);
                    $(this).hide();
                    $(this).parents('.control-btns').find('.play').show().focus();
                })
                //이전버튼 함수
                $(this).find('.control-btns .prev').click(function(){
                    $(this).parents('.control-btns').find('.play').show();
                    $(this).parents('.control-btns').find('.stop').hide();
                    bannerRolling = false;
                    clearInterval(timerID);

                    cmm--;
                    if(cmm < '0'){
                        cmm = len;
                    }
                    _this.eq(cmm).find('.dot').trigger('mouseover');
                })
                //다음버튼 함수
                $(this).find('.control-btns .next').click(function(){
                    $(this).parents('.control-btns').find('.play').show();
                    $(this).parents('.control-btns').find('.stop').hide();
                    bannerRolling = false;
                    clearInterval(timerID);

                    cmm++;
                    if(cmm >= len){
                        cmm = '0';
                    }
                    _this.eq(cmm).find('.dot').trigger('mouseover');
                })

                //자동재생 함수
                var bannerTabStartRooling = function(){
                    cmm++;
                    if(cmm >= len){
                        cmm = '0';
                    }
                    _this.eq(cmm).find('.dot').trigger('mouseover');
                }
            });
        },

        /* ==================================================================
            input placeholder
        ================================================================== */
        placeholder : function(){
            var input = $('.js-placeholder').next('input:enabled'); //활성화된 텍스트박스
            var label = $('input:enabled').siblings('.js-placeholder'); //활성화된 텍스트박스의 레이블

            //최초 로딩시 바인딩된 이벤트를 제거
            $('.js-placeholder').next('input').off('focus, blur, change');
            $('input').siblings('.js-placeholder').off('click');

            //이벤트 할당
            input.on({
                focus : function(){
                    $(this).prev('.js-placeholder').css('visibility', 'hidden');
                },
                blur : function(){
                    if ($(this).val() == '' && $(this).html() == '') {
                        $(this).prev('.js-placeholder').css('visibility', 'visible');
                    }
                    else {
                        $(this).prev('.js-placeholder').css('visibility', 'hidden');
                    }
                },
                change : function(){
                    if ($(this).val() == '' && $(this).html() == '') {
                        $(this).prev('.js-placeholder').css('visibility', 'visible');
                    }
                    else {
                        $(this).prev('.js-placeholder').css('visibility', 'hidden');
                    }
                }
            }).blur();
            label.on('click', function(){
                $(this).css('visibility', 'hidden');
                $(this).next('input').focus();
            })
        },

        /* ==================================================================
            링크 레이어 보이기
        ================================================================== */
        moreLayerToggle : function(){
            var obj = $('.js-more-wrap');

            obj.each(function(){
                /*$(this).on({
                    mouseenter : function(){
                        $(this).find('.js-more-link').show('blind','fast');
                    },
                    mouseleave : function(){
                        $(this).find('.js-more-link').hide('blind','fast');
                    }
                });

                $(this).find('.js-more-link').on({
                    mouseenter : function(){
                        $(this).show('blind','fast');
                    }
                });*/

                $(this).find('.js-more-nav').on({
                    click : function(){
                        $(this).siblings('.js-more-link').toggle('blind','fast');
                    }
                })

                $(this).find('a').on('blur', function(){
                    var _this = $(this).parents('.js-more-wrap');
                    setTimeout(function(){
                        if(_this.find('a:focus').length == 0){
                            _this.find('.js-more-link').hide('blind','fast');
                        }
                    },0)
                });
            });
        },

        /* ==================================================================
            탭
        ================================================================== */
        tab : function(){
            // 탭과 컨텐츠 구조 따로
            $('.js-tabA').each(function(n){
                var _this = $(this);
                _this.find('a.js-tab').each(function(n){
                    $(this).parents('.li').removeClass('on');
                    $($(this).attr('href')).hide();
                    if(n==0){
                        $(this).parents('.li').addClass('on');
                        $($(this).attr('href')).show();
                    }
                    $(this).on('click', function(){
                        _this.find('a.js-tab').each(function(n){
                            $(this).parents('.li').removeClass('on');
                            $($(this).attr('href')).hide();
                        });
                        $(this).parents('.li').addClass('on');
                        $($(this).attr('href')).show();
                        return false;
                    });
                });
            });

            // 탭과 컨텐츠 논리적 구조
            $('.js-tabB').each(function(n){
                var _this = $(this);
                _this.find('a.js-tab').each(function(n){
                    $(this).parents('.tit').addClass('m'+(n+1));
                    $(this).parents('.li').removeClass('on');
                    $(this).parents('.tit').next('.js-con').hide();
                    if(n==0){
                        $(this).parents('.li').addClass('on');
                        $(this).parents('.tit').next('.js-con').show();
                    }
                    $(this).on('click', function(){
                        _this.find('a.js-tab').each(function(n){
                            $(this).parents('.li').removeClass('on');
                            $(this).parents('.tit').next('.js-con').hide();
                        });
                        $(this).parents('.li').addClass('on');
                        $(this).parents('.tit').next('.js-con').show();
                    });
                });
            });

            // 탭과 컨텐츠 구조 따로
            $('.js-tabC').each(function(n){
                var _this = $(this);
                _this.find('a.js-tab').each(function(n){
                    $(this).parents('.li').removeClass('on');
                    if(n==0){
                        $(this).parents('.li').addClass('on');
                    }
                    $(this).on('click', function(){
                        _this.find('a.js-tab').each(function(n){
                            $(this).parents('.li').removeClass('on');
                        });
                        $(this).parents('.li').addClass('on');
                        return false;
                    });
                });
//                _this.find('.li').each(function(n){
//                    $(this).removeClass('on');
//                    if(n==0){
//                        $(this).addClass('on');
//                    }
//                    $(this).on('click', function(){
//                        _this.find('.li').each(function(n){
//                            $(this).removeClass('on');
//                        });
//                        $(this).addClass('on');
//                        return false;
//                    });
//                });
            });
        },

        /* 쿼리스트링 분리 함수 */
        getParameterByName: function(name) {
            name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
            var regexS = "[\\?&]" + name + "=([^&#]*)";
            var regex = new RegExp(regexS);
            var results = regex.exec(window.location.search);
            if(results == null)
                return "";
            else
                return decodeURIComponent(results[1].replace(/\+/g, " "));
        },

        /* 탭 활성화 함수 */
        tabActive : function(){
            if(pubUi.getParameterByName("tabNum")){
                $(".tab3 .li:eq("+pubUi.getParameterByName("tabNum")+") a").trigger("click");
            }
        },

        /* 팝업창(새창) 가운데로 띄우기(공통) */
        openWinCenterScroll : function(url,winName,Width,Height) {
            /* 파라미터 가져오기(for dual monitor) */
            var popupParams = function(width, height) {
                var a = typeof window.screenX != 'undefined' ? window.screenX : window.screenLeft;
                var i = typeof window.screenY != 'undefined' ? window.screenY : window.screenTop;
                var g = typeof window.outerWidth!='undefined' ? window.outerWidth : document.documentElement.clientWidth;
                var f = typeof window.outerHeight != 'undefined' ? window.outerHeight: (document.documentElement.clientHeight - 22);
                //var h = (a < 0) ? window.screen.width + a : a;
                var left = parseInt(a + ((g - width) / 2), 10);
                var top = parseInt(i + ((f-height) / 2.5), 10);
                return 'location=1,toolbar=0,scrollbars=1,width=' + width + ',height=' + height + ',left=' + left + ',top=' + top;
            }
            window.open(url, winName, popupParams(Width, Height));
            return false;
        },

        /* ==================================================================
        문서로딩시 실행함수
        ================================================================== */
        init : function(){
            this.gnbAction(); //GNB 함수
            this.lnbAction(); //LNB 함수
            this.moreLayerToggle(); //탑.푸터 더보기레이어 함수
            //this.btnTopFixed(151,70); //퀵메뉴
            this.headerResize(10); //헤더리사이즈
            this.tab(); //탭
            this.placeholder(); //input placeholder 함수
            this.tabActive(); //탭활성화 함수
        }


    };

    String.prototype.endsWith = function(suffix) {
        return this.indexOf(suffix, this.length - suffix.length) !== -1;
    };

    $(document).ready(function(){
        pubUi.init(); //문서로딩시 실행
        $('input[readonly], textarea[readonly]').on('focus', function(){
            $(this).blur();
        });
        $('input[readonly], textarea[readonly]').blur();

        if(!location.href.endsWith("/investor/financial/formFinancialInfo.sg")
                && !location.href.endsWith("/investor/stockprice/formStockpriceInfo.sg")
                && !location.href.endsWith("/investor/public/formPublicAnnouncementInfo.sg")) {
            $.ajax({
                type : "post",
                dataType : "json",
                data: { "CDA_Apply" : CDA_Apply,
                         "CDA_AppVr" : CDA_AppVr,
                         "CDA_AppUr" : CDA_AppUr,
                         "CDA_Refer" : CDA_Refer,
                         "CDA_ThHst" : CDA_ThHst,
                         "CDA_ThUrl" : CDA_ThUrl,
                         "CDA_ThPrm" : CDA_ThPrm,
                         "CDA_Cokei" : CDA_Cokei,
                         "CDA_Scren" : CDA_Scren,
                         "CDA_Windo" : CDA_Windo,
                         "CDA_Exinf" : CDA_Exinf },
                async : false,
                cache : false,
                url : __contextPath__  + "/common/ajaxCounter.json",
                success:function(data) {
                    if(data.sessionKey != null) {
                        setCookie("KICA-UID", data.sessionKey , 365);
                    }
                }
            });
        }
    });

    function setCookie( name, value, expiredays )
    {
        var todayDate = new Date();
        todayDate.setDate( todayDate.getDate() + expiredays );
        document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";"
    }
    function getCookie(name) {
        var Found = false
        var start, end
        var i = 0

        while(i <= document.cookie.length) {
            start = i
            end = start + name.length

            if(document.cookie.substring(start, end) == name) {
                Found = true
                break
            }
            i++
        }

        if(Found == true) {
            start = end + 1
            end = document.cookie.indexOf(";", start)
            if(end < start) end = document.cookie.length
            return document.cookie.substring(start, end)
        }
        return ""
    }

    /* ########################## 전달 변수 ########################## */
    var CDA_Apply = navigator.appName;          //브라우저 종류
    var CDA_AppVr = navigator.appVersion;       //브라우저 버전
    var CDA_AppUr = navigator.userAgent;        //브라우저 버전
    var CDA_Refer = document.referrer;          //이전 페이지
    var CDA_ThHst = "";                         //호스트정보
    var CDA_ThUrl = document.location.pathname; //페이지정보
    var CDA_ThPrm = document.location.search;   //전달값정보
    var CDA_Cokei = "";                         //쿠키 정보
    var CDA_Scren = "";                         //해상도 정보
    var CDA_Windo = "";                         //창크기 정보
    var CDA_Exinf = document.lastModified;      //기타 정보

    //if(document.body) {
//	    CDA_Windo = document.body.clientWidth+":"+document.body.clientHeight; //열린 창 정보
    //}
    CDA_Windo = $(window).width()+":"+$(window).height();

    CDA_Scren = screen.availWidth+":"+screen.availHeight; //해상도 정보

    var checkCookie=getCookie("KICA-UID");
    if(checkCookie.length!=32) CDA_Cokei=""; else CDA_Cokei = checkCookie;

    CDA_ThHst = document.location.protocol+"//"+document.location.hostname;     //호스트정보

}