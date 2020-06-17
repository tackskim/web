$(document).ready(function () {

   //header OnOff
   $(".header").mouseenter(function (e) {
      e.preventDefault();
      e.stopPropagation();
      $(".header").addClass('on');
      $(".nav>ul>li").css("height", "100%");
      $(".header.on .nav-area").stop().animate({
         "height": "395px"
      }, 300);
   });
   $(".header").mouseleave(function (e) {
      e.preventDefault();
      e.stopPropagation();
      $(".nav>ul>li").css("height", "auto");
      $(".header.on .nav-area").stop().animate({
         "height": "88px"
      }, 300, function () {
         $(".header").removeClass("on");
      });
   });
   $(".header .sub-nav a").stop().hover(function (e) {
      e.preventDefault();
      e.stopPropagation();
      $(this).addClass("on");
   }, function (e) {
      e.preventDefault();
      e.stopPropagation();
      $(this).removeClass("on");
   });

   //footer linkList
   $(".footer .btn-footList").on("click", function (e) {
      e.preventDefault();
      e.stopPropagation();
      $(".foot-link-area").slideToggle();
      $(this).toggleClass("on");
   });
   $("body").on("click", function () {
      if ($(".footer .btn-footList").hasClass("on")) {
         $(".foot-link-area").slideToggle();
         $(".footer .btn-footList").toggleClass("on");
      }
   });



}); //end of document
/*
function isMobileDevice() {
    var phoneArray = new Array('samsung-', 'sch-', 'shw-', 'sph-', 'sgh-', 'lg-', 'canu', 'im-', 'ev-', 'iphone', 'nokia', 'blackberry', 'lgtelecom', 'natebrowser', 'sonyericsson', 'mobile', 'android', 'ipad');
    for (i = 0; i < phoneArray.length; i++) {
        if (navigator.userAgent.toLowerCase().indexOf(phoneArray[i]) > -1) { return true; }
    }
    return false;
}
*/
function isTabletDevice() {
   if (!isMobileDevice()) {
      return false;
   } // 태블릿검사
   if (navigator.userAgent.toLowerCase().indexOf('ipad') > -1 || (navigator.userAgent.toLowerCase().indexOf('android') > -1 && navigator.userAgent.toLowerCase().indexOf('mobile') == -1)) {
      return true;
   }

   // 갤럭시 탭만을 위한 리다이렉트. Mobile 이라는 단어가 안들어오게 되면 지우셔도 됨
   var galaxyTabModel = new Array('shw-');
   for (i = 0; i < galaxyTabModel.length; i++) {
      if (navigator.userAgent.toLowerCase().indexOf(galaxyTabModel[i]) > -1) {
         return true;
      }
   }
   return false;
}


/* alert, confirm layer make
@param root_path : root path
@param type : alert or confirm
@param msg : message
@param callback : callback function
*/
/* */
(function ($) {
   $.alertConfirmLayer = function (root_path, type, msg, callback) {
      var root_path_url = "/kica";
      $(document).off('click', '.btn-yes');
      $('body').append('<div class="blackBg"></div>');
      var html = '<div class="pop-area" style="display:none"><div><img src="' + root_path_url + '/resources/img/sub4/ico_err.jpg" alt=""><div class="mt20">';
      html += msg;
      html += "</div>";
      if (type == "confirm") {
         html += '<a href="#none" class="dis-inbr btn-close btn-yes">예</a><a href="#none" class="dis-inbr ml10 btn-close">아니요</a>';
      } else {
         html += '<a href="#none" class="btn-close">닫기</a>';
      }
      html += '</div></div>';
      $('body').append(html);
      $(".blackBg").fadeIn();
      var popPosition = $(window).height() - $('.pop-area').outerHeight();
      $('.pop-area').css({
         'top': ((popPosition) / 2 - 100 + $(window).scrollTop()) + 'px'
      }).fadeIn("fast");

      $(document).on("click", ".btn-close", function () {
         $(".blackBg, .pop-area").fadeOut().remove();
      });

      if (typeof (callback) === 'function') {
         //if($('.pop-area').find('.btn-yes').length>0){
         $(document).on('click', '.btn-yes', callback);
         //}else{
         //	return callback;
         //}
      } else {
         return false;
      }
   }
}(jQuery));
