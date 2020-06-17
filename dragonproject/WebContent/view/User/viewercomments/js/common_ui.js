var scroller, addDot;

(function ($) {
    
    var gnb, gnbLayout, gnbScroll, changeTop, dot, dotLayout, dotRange, familySite, skrollrLayout, portfolioBtn,
        isDot = false;
    
    
    addDot = function(){
        //말줄임표 레이아웃관련
        /*if( $(".newsList").length >= 1){ //뉴스목록 본문 html tag 제거
            dot.removeTag();
        }*/
        $(document).ready(function (e) {
            
            if( dot == undefined ){

                dot = new Dot();

                if( $(".newsList").length >= 1){
                    dotRange = {pc: 768,mobile: 0}
                }else if($(".recruitList").length >= 1){
                    dotRange = {pc: 1281,tablet:768, mobile: 0}
                }

                if(dotRange != undefined){
                    dotLayout = new Layout({
                        range:dotRange,
                        onChange: function (name) {
                            //처음부터 실행
                            isDot = true;
                            dot.change();
                        }
                    });
                }
            }
            
            if( isDot == true ){
                dot.change();
            }
        });
    }
    
    $(document).ready(function (e) {
        
        gnb = new Gnb();
        familySite = new FamilySite();
        portfolioBtn = new PortfolioBtn();
        
        gnbLayout = new Layout({
            range: {
                pc: 1281,
                tablet: 768,
                mobile: 0
            },
            onUpdate: function (prop) {
                var name = prop["name"];
                
                if( name != "pc" && gnb.isGnbOpen() ){
                    gnb.setMobileLayout();
                }
            },
            onChange: function (prop) {
                var name = prop["name"];
                //처음부터 실행
                gnb.setMode(name);
                
                var top = $(window).scrollTop();
                
                setTimeout(function(){
                    if (top < gnb.getGnbPos()) {
                        gnb.setScrollLayout("top");
                    }else{
                        gnb.setScrollLayout("scroll");
                    }  
                },100);
                
                if (name != "pc") {
                    gnb.removeMotion();
                }

                if (name == "pc") {
                    gnb.addMotion();
                    gnb.mobileGnbClose();
                }
            }
        });
        
        gnbScroll = new Scroll({
            onUpdate: function (prop) {
                var top, direction, scrollEnd;
                
                top = prop["top"];
                direction = prop["direction"];
                scrollEnd = prop["scrollEnd"];
                
                if (top < gnb.getGnbPos()) {
                    gnb.setScrollLayout("top");
                }else{
                    gnb.setScrollLayout("scroll");
                }
            }
        });
        
        $(document).bind("contextmenu", function(e) {
            alert('저작권 보호를 위하여 마우스 오른쪽버튼 사용이 금지되었습니다.');
            return false;
        });
        
        $(document).bind("dragstart selectstart", function(e) {
            return false;
        });

    });

    $(window).load(function (e) {
        
        var top = $(window).scrollTop();
                
        if (top < gnb.getGnbPos()) {
            gnb.setScrollLayout("top");
        }else{
            gnb.setScrollLayout("scroll");
        }
        
        //페럴럭스
        if( $(".content.main").length == 0){
            skrollrLayout = new Layout({
                range: {
                    pc: 1281,
                    tablet: 768,
                    mobile: 0
                },
                onChange: function (prop) {
                    
                    var name = prop["name"];
                    //처음부터 실행

                    if( typeof skrollr == "object"){
                        if(name != "pc"){
                            $(".skrollable").attr({"style":""});
                        }else{
                            var obj = {};
                            if( $('.history-wrap').length == 0){
                                obj = {skrollrBody:"wrap"}
                            }else{
                                obj = {
                                    skrollrBody:"wrap",
                                    smoothScrollingDuration:800
                                }
                            }
                            
                            scroller = skrollr.init(obj);
                        }
                    }
                }
            });
        }
        
        $('img').attr({"oncontextmenu":"return false;"});
        $('img').css({"-webkit-touch-callout":"none"});
        
    });
    
    function Gnb() {

        var header, gnb, gnbWrap, mobileOpenBtn, mobileCloseBtn, depth1, dim, transit,
            gnbLayoutType, gnbScrollType, isGnbOpen, gnbMode, mobileLastFocus;

        if (!(this instanceof Gnb)) {
            return new Gnb();
        }

        this.setMode = function (type) {
            gnbLayoutType = type;
        }

        this.addMotion = function () {
            addMotion();
        }

        this.removeMotion = function () {
            removeMotion();
        }

        this.mobileGnbClose = function () {
            mobileGnbClose();
        }

        this.setScrollLayout = function (type) {
            gnbScrollType = type;
            setScrollLayout();
        }
        
        this.setMobileLayout = function(){
            setMobileLayout();
        }
        
        this.isGnbOpen = function(){
            return isGnbOpen;
        };
        
        this.getGnbPos = function(){
            return getGnbOpenPos();
        }
        
        init();

        function init() {
            header = $("#header");
            gnbWrap = $(".mobile-wrap");
            gnb = $("#gnb");
            mobileOpenBtn = header.find(".ico-menu");
            mobileCloseBtn = header.find(".close");
            depth1 = gnb.find(".menu1");
            dim = $(".dim");
            transit = $(".transit");
            
            addEvent();
        }

        function addMotion() {
            transit.addClass("transition");
        }

        function removeMotion() {
            transit.removeClass("transition");
        }

        function addEvent() {
            gnb.mouseenter(function (e) {
                
                if (gnbLayoutType == "pc") {
                    gnbOpen();
                }
            });

            gnb.mouseleave(function (e) {
                if (gnbLayoutType == "pc") {
                    gnbClose();
                }
            });

            mobileOpenBtn.click(function (e) {
                if (gnbLayoutType != "pc") {
                    mobileGnbOpen();
                }
                e.preventDefault();
            });
            
            mobileCloseBtn.click(function (e) {
                if (gnbLayoutType != "pc") {
                    mobileGnbClose();
                }
                e.preventDefault();
            });

            depth1.click(function (e) {
                if (gnbLayoutType != "pc") {
                    var idx = depth1.index(this);
                    mobileMenuOpen(idx);
                    setMobileLayout();
                }
                e.preventDefault();
            });
            
            $("body").keyup(function (e) {
                if (e.key == "Tab") {
                    //포커스 관리
                    if ($.contains(gnb[0], e.target)) {
                        if (gnbLayoutType == "pc") {
                            gnbOpen();
                        }
                    } else {
                        if (gnbLayoutType == "pc") {
                            gnbClose();
                        }
                    }
                    e.preventDefault();
                }
            });
            
            $("body").keydown(function (e) {
                if (e.key == "Tab") {
                    var target = e.target;
                    if(gnbLayoutType != "pc" && $.contains(header[0], target)){
                        
                        if(mobileCloseBtn.is(target)){
                            gnb.find('a').eq(0).focus();
                            e.preventDefault();
                        }
                    }
                }
            });
        }

        function gnbOpen() {
            if ($(window).scrollTop() <= getGnbOpenPos()) {
                if(!header.hasClass("white"))header.addClass("hopen");
            }
            header.css({height: (gnb.height() + 75) + "px"});
            
            gnb.addClass("open");
            isGnbOpen = true;
        }

        function gnbClose() {
            if ($(window).scrollTop() > getGnbOpenPos()) {
                header.css({
                    height: ""
                });
            } else {
                header.css({
                    height: ""
                });
                if(!header.hasClass("white"))header.removeClass("hopen");
            }
            gnb.removeClass("open");
            isGnbOpen = false;
        }

        function mobileGnbOpen() {
            bodyDisabled(true);
            
            header.removeClass("hopen scroll");
            header.addClass("hmob");
            dim.css({display:"block"});
            isGnbOpen = true;
        }

        function mobileGnbClose() {
            
            bodyDisabled(false);

            header.removeClass("hmob");
            dim.css({display:"none"});
            mobileOpenBtn.focus();
            setScrollLayout();
            isGnbOpen = false;
        }

        function mobileMenuOpen(idx) {
            depth1.each(function (i) {
                var li = $(this).parent();
                if (idx == i && !li.hasClass('on')) {
                    li.addClass('on');
                } else {
                    li.removeClass('on');
                }
            });
            depth1.removeClass("on");
        }

        function setScrollLayout() {
            
            header.removeClass("scroll hopen");
            if( !header.hasClass("hmob") ){
                if( gnbScrollType == "top" ){
                    if(header.hasClass("white"))header.addClass("hopen");
                }else{
                    /*if( gnbLayoutType != "mobile")*/header.addClass("hopen");
                    if( gnbLayoutType == "pc")header.addClass("scroll");
                }
            }
        }

        function setMobileLayout() {
            var titleHeight, gnbHeight, headerPadding, languageHeight, conHeight;
                
                headerPadding = parseInt($("#header").css('padding-bottom'));
                gnbHeight = $("#header #gnb").height();
                titleHeight = $("#header>h1").height();
                languageHeight = $("#header .language").height() + parseInt($("#header .language").css('margin-top'));
            
                conHeight = headerPadding + titleHeight + gnbHeight + languageHeight;
            if(window.innerHeight < conHeight){
                gnbWrap.css({height:window.innerHeight - titleHeight - headerPadding});
            }else{
                gnbWrap.removeAttr("style");
            }
        }
        
        function getGnbOpenPos(){
            var changeTop;
            //GNB레이아웃 관련
            if( $(".content.main").length == 1){
                changeTop = $("#homeArea").height() - 60;
            }else{
                changeTop = 20;
            }
            
            return changeTop;
        }
        
        function bodyDisabled(type){
            if( type == true ){
                var distance, startScroll, startPosY;

                $("body").css({overflow: "hidden"})
                    .bind("touchstart", function (e) {
                    startScroll = gnbWrap.scrollTop();
                    //gnb일때 시작 포지션 
                    if ($.contains(gnbWrap[0], e.target) == true) {
                        startPosY = e.originalEvent.touches[0].clientY;
                    }
                })
                    .bind("touchmove", function (e) {
                    if ($.contains(gnbWrap[0], e.target) == true) {
                        distance = startPosY - e.originalEvent.touches[0].clientY;
                        gnbWrap.scrollTop(startScroll + distance);
                    }
                    e.preventDefault();
                });
            }else{
                $("body").removeAttr("style")
                    .unbind("touchmove");
            }
        }
    }
    //페밀리 사이트
    function FamilySite() {
        if (!(this instanceof FamilySite)) {
            return new FamilySite();
        }

        var btn;

        init();

        function init() {
            btn = $(".family");
            addEvent()
        }

        function addEvent() {

            btn.find(".sel").click(function (e) {
                
                e.stopPropagation();
                e.preventDefault();
                
                if( btn.hasClass("on") ){
                    $(document).off("click touchend");
                    btn.removeClass("on");
                }else{
                    btn.addClass("on");
                    $(document).one("click touchend", function(e){
                        setTimeout( function(){btn.removeClass("on");}, 100 );
                    });
                }
            });
        }
    }
    //말줄임표
    function Dot() {
        if (!(this instanceof Dot)) {
            return new Dot();
        }

        var dots,
            dotMaxHeight;

        dots = $(".dot");
        dotMaxHeight = [];

        this.update = function () {
            updateDot();
        }

        this.change = function () {
            reset();
        }
        
        this.removeTag = function(){
            removeTag();
        }
        
        function getMaxHeight() {
            dots.each(function (i) {
                dotMaxHeight[i] = $(this).css("max-height");
            });
        }

        function addDot() {
            dots.each(function (i) {
                $(this)
                    //.css({"border":"solid 1px red"})
                    .dotdotdot({
                        watch: "window",
                        wrap: 'letter',
                        height: parseInt(dotMaxHeight[i])
                    });
            });
        }

        function reset() {
            dots = $(".dot");
            destroy();
            getMaxHeight();
            addDot();
        }

        function updateDot() {
            dots.trigger("update.dot");
        }

        function destroy() {
            dots.trigger("destroy");
        }
        
        function removeTag(){//뉴스 본문 태그제거
            $(".newsList .txt.dot").each(function(i){
                var txt = $(this).text();
                $(this).empty().append(txt);
            });
        }
    }
    
    
    //포트폴리오 오버효과
    function PortfolioBtn(){
        if (!(this instanceof PortfolioBtn)) {
            return new PortfolioBtn();
        }
        
        var menus;
        
        init();
        addEvent();
        
        function init(){
            menus = $(".portfolioList li");
        }
        
        function addEvent(){
            menus.mouseover(function (e) {
                if( chkMobile() != "mobile"){
                    e.preventDefault();
                    $(this).find(".dimLayer")
                        .velocity("stop")
                        .velocity({
                            opacity: [1,0]
                        }, {
                            duration: 300, display:"block"
                        });
                }
            });
            menus.mouseout(function (e) {
                if( chkMobile() != "mobile"){
                    e.preventDefault();
                    $(this).find(".dimLayer")
                        .velocity("stop")
                        .velocity({
                            opacity: [0,1]
                        }, {
                            duration: 100, display:"none"
                        });
                }
            });
        }
    }
}(jQuery));

//window 넓이별 이벤트 세팅
function Layout(attr) {
    var targetObj, currentState, propObj,
        attributes, ranges, currentWidth, currentHeight,
        onUpdate, onChange;

    if (!(this instanceof Layout)) {
        return new Layout();
    }
    
    targetObj = this;
    
    propObj = {
        name:"",
        currentState:"",
        changeWidth:false,
        changeHeight:false,
        width:0,
        height:0,
    }
    
    Layout.prototype.getWindowState = function(arr){
        var state;
        arr.forEach(function (val, idx, arr) {
            //currentState
            if (window.innerWidth >= val["width"]) {
                state = val["name"];
            }
        });
        return state;
    }
    
    this.getState = function(){
        return propObj["name"];
    }
    
    init();

    function init() {
        
        if (typeof attr == "object") {

            attributes = attr;
            //범위 배열 지정
            if (typeof attributes["range"] == "object") {
                //
                ranges = [];
                //배열에 값 삽입
                $.each(attributes["range"], function (key, value) {
                    ranges.push({
                        width: value,
                        name: key
                    })
                });
                //범위 배열 정렬
                ranges.sort(function (a, b) {
                    return a["width"] - b["width"];
                });
            }
        } else {
            //console.log("인자값이 없음")
        }
        addEvent();
        update();
    }

    function addEvent() {
        $(window).resize(function (e) {
            update();
        })
    }

    function update() {
        if( currentWidth !=  window.innerWidth){
            propObj["changeWidth"] = true;
            currentWidth = window.innerWidth;
        }else{
            propObj["changeWidth"] = false;
        }
        
        if( currentHeight !=  window.innerHeight){
            propObj["changeHeight"] = true;
            currentHeight = window.innerHeight;
        }else{
            propObj["changeHeight"] = false;
        }
        
        propObj["width"] = window.innerWidth;
        propObj["height"] = window.innerHeight;
        
        //레이아웃 바뀔때
        if (targetObj.getWindowState(ranges) !=  propObj["name"] && typeof attributes.onChange == "function") {
            propObj["name"] = targetObj.getWindowState(ranges);
            attributes.onChange.call(this, propObj);
        }
        
        if (typeof attributes.onUpdate == "function") {
            attributes.onUpdate.call(this, propObj);
        }
    }
}
//스크롤 & 마우스 휠 이벤트
function Scroll(attr) {
    if (!(this instanceof Scroll)) {
        return new Scroll();
    }

    var obj, attributes, propObj,
        lastScroll;

    obj = this;
    propObj = {};
    
    Scroll.prototype.preventDefault = function (e) {
        e = e || window.event;
        if (e.preventDefault)
            e.preventDefault();
        e.returnValue = false;
    }

    Scroll.prototype.preventDefaultForScrollKeys = function (e) {

        var keys = {
            37: 1,
            38: 1,
            39: 1,
            40: 1
        };

        if (keys[e.keyCode]) {
            obj.preventDefault(e);
            return false;
        }
    }

    //스크롤 비활성
    Scroll.prototype.disableScroll = function () {
        if (window.addEventListener) // older FF
            window.addEventListener('DOMMouseScroll', obj.preventDefault, false);
        window.onwheel = obj.preventDefault; // modern standard
        window.onmousewheel = document.onmousewheel = obj.preventDefault; // older browsers, IE
        window.ontouchmove = obj.preventDefault; // mobile
        document.onkeydown = obj.preventDefaultForScrollKeys;
    }
    //스크롤 활성화
    Scroll.prototype.enableScroll = function () {
        if (window.removeEventListener)
            window.removeEventListener('DOMMouseScroll', obj.preventDefault, false);
        window.onmousewheel = document.onmousewheel = null;
        window.onwheel = null;
        window.ontouchmove = null;
        document.onkeydown = null;
    }
    
    init();

    function init() {
        lastScroll = 0;

        if (typeof attr == "object") {
            attributes = attr;
        }

        addEvent();

        //if( attributes.initEvent == true)
    }

    function addEvent() {
        $(window).scroll(function (e) {
            scrollUpdate();
            e.preventDefault();
        });

        $("html, body").bind('mousewheel DOMMouseScroll', function (e) {
            wheelUpdate(e);
        });
    }

    function scrollUpdate() {
        var updateCallBack = attributes.onUpdate;
        if (typeof updateCallBack == "function") {

            scrollTop = $(window).scrollTop();
            propObj["top"] = scrollTop;
            //방향 세팅
            if (scrollTop > lastScroll) {
                propObj["direction"] = "down";
            } else {
                propObj["direction"] = "up";
            }
            
            if (scrollTop == $(document).height() - $(window).height()) {
                propObj["scrollEnd"] = true;
            }else{
                propObj["scrollEnd"] = false;
            }
            
            updateCallBack.call(this, propObj);

            lastScroll = scrollTop;
        }
    }

    function wheelUpdate(e) {
        //휠 이벤트
        var wheelCallBack = attributes.onWheel;

        if (typeof wheelCallBack == "function") {

            var orgEvent, delta, targetPos, scrollTop;

            orgEvent = e.originalEvent;
            delta = 0;
            scrollTop = $(window).scrollTop();

            if (orgEvent.detail) { //FireFox wheel event
                delta = orgEvent.detail * -40;
            } else { //etc
                delta = orgEvent.wheelDelta;
            };
            
            propObj["top"] = scrollTop;
            propObj["targetPos"] = scrollTop - delta;
            
            if (delta > 0) {
                propObj["direction"] = "up";
            } else {
                propObj["direction"] = "down";
            }
            
            if (scrollTop == $(document).height() - $(window).height()) {
                propObj["scrollEnd"] = true;
            }else{
                propObj["scrollEnd"] = false;
            }
            
            wheelCallBack.call(this, propObj);
        }
    }
}

//공통 사용 modal
var _ModalPopupBackgroundID, _currentModal, _ModalBtn;

_ModalPopupBackgroundID = 'modal';

function ShowModalPopup(btn, modalPopupID) {
    _ModalBtn = btn;
    var popupID = "#" + modalPopupID;
    var popupMarginTop = $(popupID).height() / 2;
    var popupMarginLeft = $(popupID).width() / 2;
    
    _currentModal = popupID;
        
    $('body').css('overflow', 'hidden');
    $(popupID).css({
        'left': '50%',
        'top': '50%',
        'margin-top': -popupMarginTop,
        'margin-left': -popupMarginLeft,
        'display': 'block',
        'position': 'fixed',
        'z-index': 99999
    })
    //포커스
    .attr("tabindex", "0")
    .before("<div class='focusstart' tabindex='0'></div>")
    .after("<div class='focusend' tabindex='0'></div>")
    .find("a").eq(0).focus();

    var backgroundSelector = $('<div id="' + _ModalPopupBackgroundID + '" ></div>');
    backgroundSelector.appendTo('body');

    backgroundSelector.css({
        'width': $(document).width(),
        'height': $(document).height(),
        'display': 'none',
        'background-color': '#000',
        'filter':'alpha(opacity=80)',
        'position': 'absolute',
        'top': 0,
        'left': 0,
        'z-index': 99998
    });

    backgroundSelector.fadeTo('fast', 0.8);
    backgroundSelector.click(function(){
        HideModalPopup(modalPopupID)
    });
    
    //포커스 이벤트 
    $(".focusstart").focusin(function(e){
        $(popupID + " a").eq($(popupID + " a").length-1).focus();
    });
    
    $(".focusend").focusin(function(e){
        $(popupID).focus();
    });
}

function HideModalPopup(modalPopupID) {
    $(_ModalBtn).focus();
    $(".focusend").remove();//포커스 관련 객체 삭제
    $(".focusstart").remove();//포커스 관련 객체 삭제
    $("#" + modalPopupID).css('display', 'none');
    $("#" + _ModalPopupBackgroundID).remove();
    $('body').css('overflow', 'auto');
}

function chkMobile(){
    var mode = "pc"

    if(navigator.platform){
        if((/Android|iPhone|iPad|iPod|BlackBerry/i).test(navigator.userAgent || navigator.vendor || window.opera)){
            mode = "mobile";
        }else{
            mode = "pc";
        }
    }
    return mode;
}
