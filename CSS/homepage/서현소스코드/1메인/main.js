/**************************************************************************************************
 * KICA 메인
 *
 * @class KicaMain
 * @constructor
 * @version 1.0

 *
 **************************************************************************************************/
$(document).ready(function () {
    var current_section_page = 1;

    (function ($) {



        window.KicaMain = function () {
            if (this instanceof KicaMain === false) {
                return new KicaMain();
            }
            //Global Variable
            var $window = $(window), //윈도우
                $doc = $(document),
                $body = $('body'),
                $win_width = $(window).width(), //윈도우 넓이
                $win_height = $(window).height(), //윈도우 높이
                $wrap = $('#wrapper'),
                $navi = $('#sideNav ul li') //좌측네비게이션
            tm = TweenMax, //TweenMax
                scroll_max_index = 3, //스크롤 최대 사이즈
                isMoving = null, //애니메이션
                oTimer = null, //window resize time
                c_section = null, //현재 섹션
                isFirst = true,
                mouse_img_timer = null; //처음 진입여부
            var swiper = null;
            var $sec2Text = $("#sec2-text");
            var $sec3Text = $("#sec3-text");
            var swiper_temp_index = 0;
            var swiper_max_len = $('#mainSec1').find('.swiper-slide').length; //섹션1 swiper길이
            var slide3Timer = null; //스와이프 이미지 타임아웃체크

            //초기화
            init = function () {
                p1_resetEffect();
                c_section = 1;
                buildPage();
                resize();
                addMouseWheelHandler();
                isMoving = false;
                moveBgAction(1, "0");
                p1_effect_action();
                swiper = new Swiper('.swiper-container', {
                    speed: 1000,
                    loop: true,
                    touchRatio: 0,
                    simulateTouch:false,
                    preventClicks: true,
                    preventClicksPropagation: true
                });

            };

            //페이지 만들기
            buildPage = function () {
                $('section').css('width', $win_width);
                //  $('section').css('height', $win_height);
                $('footer').css('marginTop','-88px');
                moviePlay($win_width);

            };

            moviePlay = function ($win_width) {

                $('.video-wrap video').attr('width', $win_width);


            };

            //리사이즈
            resize = function () {
                $(window).resize(function () {
                    clearTimeout(mouse_img_timer);
                    if (oTimer != null) {
                        clearTimeout(oTimer);
                        oTimer = null;
                    }

                    oTimer = setTimeout(setWidth, 200);

                    function setWidth() {

                        $win_width = $(window).width(); //윈도우 넓이
                        $win_height = $(window).height();
                        $('section').css('width', $win_width);
                        //	$('section').css('height', $win_height);
                        var swiper_idx = swiper.activeIndex - 1;
                        swiper.update();
                        swiper = null;
                        $('.swiper-wrapper').removeAttr('style');
                        $('.swiper-slide').removeAttr('style');
                        swiper = new Swiper('.swiper-container', {
                            speed: 1000,
                            loop: true,
                            initialSlide: swiper_idx,
                            touchRatio: 0,
                            simulateTouch: false,
                            preventClicks: true,
                            preventClicksPropagation: true
                        });
                        moviePlay($win_width);
                        isMoving = true;
                        p1_effect_action();
                        moveBgAction(c_section, "0.85");
                    }
                });

            };
            //section 이동
            moveBgAction = function (index, speed) {
                clearTimeout(mouse_img_timer);
                $('.scr-down').fadeOut();
                //p1_resetEffect();
                p2_resetEffect();
                p3_resetEffect();
                var topY = $('#mainSec' + index).offset().top;
                $('html, body').animate({
                    scrollTop: topY
                }, {
                    duration: 500,
                    complete: function () {
                        moveAction(index);
                        isMoving = false;
                    }
                });
            }

            //section이동후 액션
            moveAction = function (index) {
                current_section_page = index;
                $navi.eq(index - 1).siblings().removeClass('on');
                $navi.eq(index - 1).addClass('on');
                $(".service-area > a").off(); //section2 이벤트 해제
                current_section_page = index;
                switch (index) { // each layer show effect animation
                    case 1:
                        p1_effect();
                        showScrollImg();
                        break;
                    case 2:
                        p2_effect();
                        showScrollImg();
                        break;
                    case 3:
                        p3_effect();
                        break;
                }
            };

            /* mouse/keyboard event */
            moveSection = function (state) {
                var temp_c_section = c_section;
                if (!isMoving) {
                    if (state == "up") {
                        if (c_section > 1) {
                            c_section--;
                        } else {
                            c_section = 1;
                        }
                    }
                    if (state == "down") {
                        if (c_section < scroll_max_index) {
                            c_section++;
                        } else {
                            c_section = scroll_max_index;
                        }
                    }

                    if (temp_c_section != c_section) {
                        isMoving = true;
                        moveBgAction(c_section, "0.85");
                    }
                }
            };

            //오른쪽네비
            $navi.on('click', function (e) {
                var idx = $(this).index() + 1;

                if (idx != 0) {
                    if (idx != c_section) {
                        c_section = idx;
                        moveBgAction(idx, "0");
                    }
                }
            });


            /* *****   page1 액션   **** */
            //영상 화면 사이즈별로 초기화 작업
            function p1_movie_size() {

            }

            function p1_effect() {
                textEffect();
                // 타이틀
                swiper.on('slideChangeTransitionStart', function () {
                    p1_resetEffect();
                });
                swiper.on('slideChangeTransitionEnd', function () {
                    p1_effect_action();
                });
            }

            function p1_effect_action() {
                clearTimeout(slide3Timer);
                textEffect();
                $('video').off('ended');

                var vidId = $('.swiper-wrapper').find('div.swiper-slide-active').find('video');
                var is_video = vidId.attr('id');

                if (typeof (is_video) != "undefined") {
                    try {
                        $(vidId).get(0).play();
                        $(vidId).on('ended', function () {
                            p1_resetEffect();
                            swiper.slideNext();
                        });
                    } catch (err) {
                        p1_noVideoImage();
                    }
                } else {
                    p1_noVideoImage();
                }
            }

            function p1_noVideoImage() {
                slide3Timer = setTimeout(function () {
                    swiper.slideNext();
                    clearTimeout(slide3Timer);
                }, 5000);
            }

            function textEffect() {
                var slide_title1 = $('.swiper-wrapper').find('div.swiper-slide-active').find('div.main-txt-area p').eq(0);
                var slide_title2 = $('.swiper-wrapper').find('div.swiper-slide-active').find('div.main-txt-area b');
                var slide_title3 = $('.swiper-wrapper').find('div.swiper-slide-active').find('div.main-txt-area p').eq(1);
                if (slide_title1.css('opacity') == 0) {
                    tm.to(slide_title1, 0.5, {
                        ease: Power1.easeInOut,
                        opacity: 1,
                        y: 0
                    });
                }
                if (slide_title2.css('opacity') == 0) {
                    tm.to(slide_title2, 1, {
                        ease: Power2.easeInOut,
                        opacity: 1,
                        y: 0
                    });
                }
                if (slide_title3.css('opacity') == 0) {
                    tm.to(slide_title3, 1.5, {
                        ease: Power3.easeInOut,
                        opacity: 1,
                        y: 0
                    });
                }
            }

            function p1_resetEffect() {
                var slide_title1 = $('.swiper-slide').find('div.main-txt-area p');
                var slide_title2 = $('.swiper-slide').find('div.main-txt-area b');
                var slide_title3 = $('.swiper-slide').find('div.main-txt-area p').eq(1);
                tm.set(slide_title1, {
                    opacity: 0,
                    y: 50
                });
                tm.set(slide_title2, {
                    opacity: 0,
                    y: 80
                });
                tm.set(slide_title3, {
                    opacity: 0,
                    y: 110
                });
            }

            /* *****   page2 액션  **** */
            function p2_effect() {
                //service hover
                startAnimation();
                $(".service-area > a").on('mouseenter', function () {
                    tm.to($(this).find(".off"), 0.5, {
                        opacity: 0,
                        ease: Circ.easeOut
                    });
                    tm.to($(this).find(".on"), 0.5, {
                        opacity: 1,
                        ease: Circ.easeOut
                    });

                    var i = $(this).index() + 2;
                    moveSideContent(i);

                });
                $(".service-area > a").mouseleave('mouseleave', function () {
                    tm.to($(this).find(".off"), 0.5, {
                        opacity: 1,
                        ease: Circ.easeOut
                    });
                    tm.to($(this).find(".on"), 0.5, {
                        opacity: 0,
                        ease: Circ.easeOut
                    });
                    moveSideContent(1);
                });

                /* when navigation mouseenter, */
                function moveSideContent(num) {
                    for (var i = 1; i <= 5; i++) {
                        if (i == num) {
                            TweenLite.to($('.serviceBg' + i), 1.5, {
                                ease: Power3.easeInOut,
                                opacity: 1
                            });
                            $('.serviceBg' + i).css("z-index", 5)
                        } else {
                            TweenLite.to($('.serviceBg' + i), 1.5, {
                                ease: Power3.easeInOut,
                                opacity: 0
                            });
                            $('.serviceBg' + i).css("z-index", 0)
                        }
                    }
                }


                function startAnimation() {
                    tm.fromTo($sec2Text, 0.5, {
                        ease: Power1.easeInOut,
                        opacity: 0,
                        y: 50
                    }, {
                        ease: Power2.easeInOut,
                        opacity: 1,
                        y: 0
                    });
                    var txt_conent = $('#sec2-text').parent().find('p');
                    tm.fromTo(txt_conent, 1.2, {
                        ease: Power1.easeInOut,
                        opacity: 0,
                        y: 80
                    }, {
                        ease: Power2.easeInOut,
                        opacity: 1,
                        y: 0
                    });
                }
            }

            function p2_resetEffect() {
                tm.set($sec2Text, {
                    opacity: 0,
                    y: 50
                });
                var txt_conent = $('#sec2-text').parent().find('p');
                tm.set(txt_conent, {
                    opacity: 0,
                    y: 80
                });
                //tm.set($sec2Text.children(),{ rotationY:180,opacity:0});

            }

            /* *****   page3 액션  **** */
            function p3_effect() {
                //$('.scr-down').css({'zIndex':'-1'});
                clearTimeout(mouse_img_timer);
                $('.scr-down').fadeOut();
                tm.fromTo($sec3Text, 0.5, {
                    ease: Power1.easeInOut,
                    opacity: 0,
                    y: 50
                }, {
                    ease: Power1.easeInOut,
                    opacity: 1,
                    y: 0
                });
                var txt_conent = $('#sec3-text').parent().find('p');
                tm.fromTo(txt_conent, 1.2, {
                        ease: Power1.easeInOut,
                        opacity: 0,
                        y: 80
                    }, {
                        ease: Power2.easeInOut,
                        opacity: 1,
                        y: 0
                    }

                );
            }

            function p3_resetEffect() {
                tm.set($sec3Text, {
                    opacity: 0,
                    y: 50
                });
                var txt_conent = $('#sec3-text').parent().find('p');
                tm.set(txt_conent, {
                    opacity: 0,
                    y: 80
                });

            }

            /* scroll image */
            function showScrollImg(index) {
                clearTimeout(mouse_img_timer);
                mouse_img_timer = setTimeout(function () {
                    $('.scr-down').fadeIn();
                    clearTimeout(mouse_img_timer);
                }, 3000);
            }


            //윈도우 스크롤
            /* mouse */
            function removeMouseWheelHandler() {
                if (document.addEventListener) {
                    //FF doesn't recognize mousewheel
                    var mousewheelevt = (/Firefox/i.test(navigator.userAgent)) ? "DOMMouseScroll" : "mousewheel";
                    document.removeEventListener(mousewheelevt, mouseWheelHandler, false);
                } else { //IE 6/7/8
                    document.detachEvent("onmousewheel", mouseWheelHandler);
                }
            }

            function addMouseWheelHandler() {
                if (document.addEventListener) {
                    //FF doesn't recognize mousewheel
                    var mousewheelevt = (/Firefox/i.test(navigator.userAgent)) ? "DOMMouseScroll" : "mousewheel";
                    document.addEventListener(mousewheelevt, mouseWheelHandler, false);
                } else { //IE 6/7/8
                    document.attachEvent("onmousewheel", mouseWheelHandler);
                }
            }

            function mouseWheelHandler(e) {
                e = window.event || e;
                var delta = Math.max(-1, Math.min(1,
                    (e.wheelDelta || -e.deltaY || -e.detail)));
                if (!isMoving) {
                    if (delta < 0) { // down
                        moveSection("down");
                    } else { //up
                        moveSection("up");
                    }
                }
                return false;
            }

            //keyboard
            $doc.keydown(keydownHandler);
            var keydownId;

            function keydownHandler(e) {
                clearTimeout(keydownId);
                var activeElement = $(document.activeElement);
                if (!activeElement.is('textarea') && !activeElement.is('input') && !activeElement.is('select')) {
                    var keyCode = e.which;

                    //preventing the scroll with arrow keys & spacebar & Page Up & Down keys
                    var keyControls = [40, 39, 38, 37, 32, 33, 34];
                    if ($.inArray(keyCode, keyControls) > -1) {
                        e.preventDefault();
                    }

                    keydownId = setTimeout(function () {
                        onkeydown(e);
                    }, 150);
                }
            }


            function onkeydown(e) {
                var shiftPressed = e.shiftKey;

                switch (e.which) {
                    //up
                    case 37:
                    case 38:
                    case 33:
                        moveSection("up");
                        break;

                        //down
                    case 32: //spacebar
                        if (shiftPressed) {
                            moveSection("up");
                            break;
                        }
                        case 40:
                        case 39:
                        case 34:
                            moveSection("down");
                            break;

                            //Home
                        case 36:
                            if (c_section != "1") {
                                moveBgAction(1, "0");
                            }
                            break;

                            //End
                        case 35:
                            if (c_section != "3") {
                                moveBgAction(3, "0");
                            }
                            break;

                        default:
                            return;
                }
            }

            init();

        } //end of KicaMain
    }(jQuery));
    new KicaMain(); //실행
});
$(document).ready(function () {
    $(window).on('load', function () {
        try {
            $('#video_1').get(0).play();
        } catch (err) {
            $('#video_1').controls = true;
        }
    });
}); //End document