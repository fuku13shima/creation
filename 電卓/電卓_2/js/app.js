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
    let periodFlag = false;
    let calFlg = true;
    let equalFlg = false;


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
        // if($(e.target).text() === '.'){
        //     if(periodFlag){
        //         return;
        //     }else{
        //        periodFlag = true; 
        //     }
        // }

        // if(calFlg){
        //     calFlg = false;
        // }

        if(equalFlg){
            $('.display').text("");
            cal = 0;
            ans = 0;
        }
        equalFlg = false;
    
        num = $(e.target).text();
        console.log(num);

        num_push(num);
        //ボタンの内容（text)を表示
        $('.display').text($('.display').text() + $(e.target).text());
    
    });

    //計算ボタンクリック
    $('.calculation').on("click", function (e) {
        console.log("calculation:click" + $(e.target).text());
        console.log($(e.target).attr('id'));

        // if(periodFlag){
        //     periodFlag = false;
        // }

        // if(calFlg){
        //     return;
        // }else{
        //     calFlg = true;
        // }

        // let test = $(e.target);
        // console.log(test.attr('id'));
        // document.getElementById($(e.target).attr('id')).style.color = "white";
        // document.getElementById($(e.target).attr('id')).style.backgroundColor = 'orange';
        //$(e.target).attr('id').css("background-color","#218838");

        operator = $(e.target).text();
        operator = $(e.target);
        operator_push(operator);
        
    });

    //クリアボタンクリック
    $('.reset').on("click", function (e) {
        // console.log("reset:click" + $(e.target).text());

        //ボタンの内容（text)を表示
        $('.display').text($('.display').text() + $(e.target).text());

        ac_push();
    });

    //イコールボタン（=）クリック
    $('.result').on("click", function (e) {
        // console.log("result:click" + $(e.target).text());

        //ボタンの内容（text)を表示
        $('.display').text($('.display').text() + $(e.target).text());

        equal_push();
    });


    function num_push(num){
        // console.log("num_push : " + num);
        num = String(num);
        cal = cal + num;
        //console.log(cal + typeof cal);
        // $('.display').text("");

        console.log("*" +  operator_tmp);
        calTmp();
        // if(operator_tmp !== ""){
        //     cal = Number(cal);
        //     $('.display').text("");
    
        //     switch(operator_tmp.text()){
        //         case "+":
        //             ans = tmp + cal;
        //             break;
    
        //         case "-":
        //             ans = tmp - cal;
        //             break;
    
        //         case "*":
        //             ans = tmp * cal;
        //             break;
    
        //         case "/":
        //             ans = tmp / cal;
        //             break;    
        //     }

        //     console.log("tmp=" + tmp + " cal=" + cal + " ans" + ans);
        //     but_color();
        //     operator_tmp = "";
        //     cal = ans;

        // }

        
    }


    function operator_push(operator){
        //cnt++;
        document.getElementById(operator.attr('id')).style.color = "white";
        document.getElementById(operator.attr('id')).style.backgroundColor = 'orange';

        if(operator_tmp === ""){
            tmp = Number(cal);
            cal = "";
            operator_tmp = operator;
            // console.log(tmp + typeof tmp);
            // console.log("tmp" + operator_tmp);
            // console.log("operator " + operator);

        }else if(operator_tmp !== operator){
            but_color();
            operator_tmp = operator;
            operator_idx = $('.display').text();
            // console.log("tmp" + operator_tmp + "!=" + operator);


        }
        
        // console.log("tmp" + operator_tmp);
        // console.log("operator_push : " + operator);
        
    }


    function equal_push(){
        calTmp();
        console.log(operator.attr('id'));
        equalFlg = true;
        console.log("tmp=" + tmp + " cal=" + cal + " ans" + ans);

        $('.display').text(ans);
    }

    function ac_push(){
        tmp = 0;
        cal = 0;
        ans = 0;
        $('.display').text("");

        if(operator_tmp !== ""){
            but_color();
        }    
    }

    function calTmp(){
        console.log("cal");
        if(operator_tmp !== ""){
            cal = Number(cal);
            $('.display').text("");
    
            switch(operator_tmp.text()){
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
            but_color();
            operator_tmp = "";
            cal = ans;

        }
    }


    function but_color(){
        console.log(operator.attr('id'));
        document.getElementById(operator_tmp.attr('id')).style.color = "black";
        document.getElementById(operator_tmp.attr('id')).style.backgroundColor = 'white';    

    }

});