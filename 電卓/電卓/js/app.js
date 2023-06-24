$(function () {
    //画面ドラッグ
    let clickX;
    let clickY;
    let clickPosition;
    let isClick;

    let num = 0;
    let cal = "";
    let tmp;
    let operator = "";
    let operator_tmp ="";
    let ans = 0;
    

    $('.calc_app').css("position", "fixed");
    $('.calc_app').css("top", "90px");
    $('.calc_app').css("left", "20px");
    $('.calc_app').on("mousedown", function (e) {
        isClick = true;
        clickX = e.screenX;
        clickY = e.screenY;
        clickPosition = $('.calc_app').position();
        // console.log("X:" + e.screenX);
        // console.log("Y:" + e.screenY);
        // console.log("POS" + $('.calc_app').position().left);
    });
    $('.calc_app').on("mousemove", function (e) {
        if (!isClick) return;
        $('.calc_app').css('top', clickPosition.top + (e.screenY - clickY) + 'px');
        $('.calc_app').css('left', clickPosition.left + (e.screenX - clickX) + 'px');
        // console.log("moveX:" + $('.calc_app').position().left);
        // console.log("moveY:" + $('.calc_app').position().top);
    });
    $('.calc_app').on("mouseup", function (e) {
        isClick = false;
        // console.log("mouseup");
    });

    //電卓メインロジック
    //変数定義

    //数値ボタンクリック
    $('.switch').on("click", function (e) {
        console.log("switch:click" + $(e.target).text());

        //ボタンの内容（text)を表示
        $('.display').text($('.display').text() + $(e.target).text());

        num = $(e.target).text();
        
        console.log(num);

        num_push(num);

    });
    //計算ボタンクリック
    $('.calculation').on("click", function (e) {
        console.log("calculation:click" + $(e.target).text());

        //ボタンの内容（text)を表示
        $('.display').text($('.display').text() + $(e.target).text());

        operator = $(e.target).text();
        operator_push(operator);
    });
    //クリアボタンクリック
    $('.reset').on("click", function (e) {
        console.log("reset:click" + $(e.target).text());

        //ボタンの内容（text)を表示
        $('.display').text($('.display').text() + $(e.target).text());

        ac_push();
    });

    //イコールボタン（=）クリック
    $('.result').on("click", function (e) {
        console.log("result:click" + $(e.target).text());

        //ボタンの内容（text)を表示
        $('.display').text($('.display').text() + $(e.target).text());

        equal_push();
    });


    function num_push(num){
        console.log("num_push : " + num);
        num = String(num);
        cal = cal + num;
        //console.log(cal + typeof cal);

        if(operator_tmp !== ""){
            cal = Number(cal);
    
            switch(operator_tmp){
                case "+":
                    ans = tmp + cal;
                    break;
    
                case "-":
                    ans = tmp - cal;
                    break;
    
                case "*":
                    ans = tmp * cal;
                    break;
    
                case "/":
                    ans = tmp / cal;
                    break;    
            }

            console.log("tmp=" + tmp + " cal=" + cal + " ans" + ans);
            operator_tmp = "";
            cal = ans;

        }

        
    }


    function operator_push(operator){
        //cnt++;
        tmp = Number(cal);
        cal = "";
        operator_tmp = operator;
        console.log(tmp + typeof tmp);
        console.log("operator_push : " + operator);
        
    }


    function equal_push(){
        equalFlg = true;
        $('.display').text(ans);
    }

    function ac_push(){
        tmp = 0;
        cal = 0;
        ans = 0;
        $('.display').text("");
    }

});