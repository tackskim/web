<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Flipster Demo</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=550, initial-scale=1">

    <link rel="stylesheet" href="dist/jquery.flipster.min.css">

    <script src="jquery.min.js"></script>
    <script src="dist/jquery.flipster.min.js"></script>
</head>
<body>



<article id="demo-default" class="demo">

    <h2>Default Settings (Coverflow)</h2>

    <div id="coverflow">
        <ul class="flip-items">
            <li data-flip-title="Red">
                <img src="img/text1.gif">
            </li>
            <li data-flip-title="Razzmatazz" data-flip-category="Purples">
                <img src="img/text2.gif">
             </li>
            <li data-flip-title="Deep Lilac" data-flip-category="Purples">
                <img src="img/text3.gif">
            </li>
            <li data-flip-title="Daisy Bush" data-flip-category="Purples">
                <img src="img/text4.gif">
            </li>
            <li data-flip-title="Cerulean Blue" data-flip-category="Blues">
                <img src="img/text5.gif">
            </li>
            <li data-flip-title="Dodger Blue" data-flip-category="Blues">
                <img src="img/text6.gif">
            </li>
            <li data-flip-title="Cyan" data-flip-category="Blues">
                <img src="img/text7.gif">
            </li>
            <li data-flip-title="Robin's Egg" data-flip-category="Blues">
                <img src="img/text8.gif">
            </li>
            <li data-flip-title="Deep Sea" data-flip-category="Greens">
                <img src="img/text9.gif">
            </li>
            <li data-flip-title="Apple" data-flip-category="Greens">
                <img src="img/text10.gif">
            </li>
        </ul>
    </div>

<script>
    var coverflow = $("#coverflow").flipster();
</script>

<pre class="code">$("#coverflow").flipster();</pre>

</article>

<article id="demo-carousel" class="demo">

    <h2>Flipster Carousel</h2>

    <div id="carousel">
        <ul class="flip-items">
            <li data-flip-title="Red">
                <img src="img/text1.gif">
            </li>
            <li data-flip-title="Razzmatazz" data-flip-category="Purples">
                <img src="img/text2.gif">
             </li>
            <li data-flip-title="Deep Lilac" data-flip-category="Purples">
                <img src="img/text3.gif">
            </li>
            <li data-flip-title="Daisy Bush" data-flip-category="Purples">
                <img src="img/text4.gif">
            </li>
            <li data-flip-title="Cerulean Blue" data-flip-category="Blues">
                <img src="img/text5.gif">
            </li>
            <li data-flip-title="Dodger Blue" data-flip-category="Blues">
                <img src="img/text6.gif">
            </li>
            <li data-flip-title="Cyan" data-flip-category="Blues">
                <img src="img/text7.gif">
            </li>
            <li data-flip-title="Robin's Egg" data-flip-category="Blues">
                <img src="img/text8.gif">
            </li>
            <li data-flip-title="Deep Sea" data-flip-category="Greens">
                <img src="img/text9.gif">
            </li>
            <li data-flip-title="Apple" data-flip-category="Greens">
                <img src="img/text10.gif">
            </li>
            <li data-flip-title="Pistachio" data-flip-category="Greens">
                <img src="img/text11.gif">
            </li>
            <li data-flip-title="Pear" data-flip-category="Greens">
                <img src="img/text12.gif">
            </li>
            <li data-flip-title="Bright Sun" data-flip-category="Yellows">
                <img src="img/text13.gif">
            </li>
            <li data-flip-title="Mikado" data-flip-category="Yellows">
                <img src="img/text14.gif">
            </li>
        </ul>
    </div>

<script>
    var carousel = $("#carousel").flipster({
        style: 'carousel',
        spacing: -0.5,
        nav: true,
        buttons:   true,
    });
</script>

<pre class="code">$("#carousel").flipster({
    style: 'carousel',
    spacing: -0.5,
    nav: true,
    buttons: true,
});</pre>

</article>


<article id="demo-wheel" class="demo">

    <h2>Flipster Wheel</h2>

    <div id="wheel">
        <ul>
            <li data-flip-title="Red">
                <img src="img/text1.gif">
            </li>
            <li data-flip-title="Razzmatazz" data-flip-category="Purples">
                <img src="img/text2.gif">
             </li>
            <li data-flip-title="Deep Lilac" data-flip-category="Purples">
                <img src="img/text3.gif">
            </li>
            <li data-flip-title="Daisy Bush" data-flip-category="Purples">
                <img src="img/text4.gif">
            </li>
            <li data-flip-title="Cerulean Blue" data-flip-category="Blues">
                <img src="img/text5.gif">
            </li>
            <li data-flip-title="Dodger Blue" data-flip-category="Blues">
                <img src="img/text6.gif">
            </li>
            <li data-flip-title="Cyan" data-flip-category="Blues">
                <img src="img/text7.gif">
            </li>
            <li data-flip-title="Robin's Egg" data-flip-category="Blues">
                <img src="img/text8.gif">
            </li>
            <li data-flip-title="Deep Sea" data-flip-category="Greens">
                <img src="img/text9.gif">
            </li>
            <li data-flip-title="Apple" data-flip-category="Greens">
                <img src="img/text10.gif">
            </li>
            <li data-flip-title="Pistachio" data-flip-category="Greens">
                <img src="img/text11.gif">
            </li>
            <li data-flip-title="Pear" data-flip-category="Greens">
                <img src="img/text12.gif">
            </li>
            <li data-flip-title="Bright Sun" data-flip-category="Yellows">
                <img src="img/text13.gif">
            </li>
            <li data-flip-title="Mikado" data-flip-category="Yellows">
                <img src="img/text14.gif">
            </li>
        </ul>
    </div>

<script>
    var wheel = $("#wheel").flipster({
        style: 'wheel',
        spacing: 0
    });
</script>

<pre class="code">$("#wheel").flipster({
    style: 'wheel',
    spacing: 0
});</pre>
</article>


<article id="demo-flat" class="demo">

    <h2>Flipster Flat</h2>

    <div id="flat">
        <ul>
            <li data-flip-title="Red">
                <img src="img/text1.gif">
            </li>
            <li data-flip-title="Razzmatazz" data-flip-category="Purples">
                <img src="img/text2.gif">
             </li>
            <li data-flip-title="Deep Lilac" data-flip-category="Purples">
                <img src="img/text3.gif">
            </li>
            <li data-flip-title="Daisy Bush" data-flip-category="Purples">
                <img src="img/text4.gif">
            </li>
            <li data-flip-title="Cerulean Blue" data-flip-category="Blues">
                <img src="img/text5.gif">
            </li>
            <li data-flip-title="Dodger Blue" data-flip-category="Blues">
                <img src="img/text6.gif">
            </li>
            <li data-flip-title="Cyan" data-flip-category="Blues">
                <img src="img/text7.gif">
            </li>
            <li data-flip-title="Robin's Egg" data-flip-category="Blues">
                <img src="img/text8.gif">
            </li>
            <li data-flip-title="Deep Sea" data-flip-category="Greens">
                <img src="img/text9.gif">
            </li>
            <li data-flip-title="Apple" data-flip-category="Greens">
                <img src="img/text10.gif">
            </li>
        </ul>
    </div>

<script>
    var flat = $("#flat").flipster({
        style: 'flat',
        spacing: -0.25
    });
</script>

<pre class="code">$("#flat").flipster({
    style: 'flat',
    spacing: -0.25
});</pre>

</article>


</body>
</html>
