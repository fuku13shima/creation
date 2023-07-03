let cnt = 0;
let fizzFlg = false;
let buzzFlg = false;
let fontSizeOrigen = $('#num').css("font-size");
let fontWeightOrigen = $('#num').css("font-weight");
console.log('size' + fontSizeOrigen + ' : weight' + fontWeightOrigen);
//let num = document.getElementById('num');
//console.log(num);

//画面読み込み時カウントリセット
$(document).ready(function() {
    cnt = 0;
    $('#num').text(cnt);
  });

$(function(){
    $('#num').knob({
        'release' : function (v) {
            console.log(v);
            cnt = v;
            FizzBuzzCheck(v);
        }
    });
    
});

//UPボタン押したときカウントアップ
countUpButton.addEventListener('click' , () => {
    cnt++;
    $('#num').val(cnt);
    console.log('countUp' + cnt);
    console.log($('#num').val());

    $('#num').knob({});
    FizzBuzzCheck(cnt);

});

//DOWNボタン押したときカウントダウン
countDownButton.addEventListener('click' , () => {
    cnt--;
    $('#num').val(cnt);
    console.log('countDown' + cnt);

    $('#num').knob({});
    FizzBuzzCheck(cnt);

});

//RESETボタン押したときカウントリセット
resetButton.addEventListener('click' , () => {
    $('#num').val('0')
    cnt = 0;
    $('#checkResult').text('');
    // $('#num').text(cnt);
    console.log('reset' + cnt);

    FizzBuzzCheck(cnt);

});

//FizzBuzzチェック・表示関数
function FizzBuzzCheck(cnt){
    $('#checkResult').css('display' , 'none');
    $('#checkResult').text('');
    $('#num').css('color' , 'black');
    $('#num').css('font-size' , fontSizeOrigen);
    $('#num').css('font-weight' , fontWeightOrigen);
    console.log('FizzBuzzCheck' + cnt);

    if(cnt != 0){
        if(cnt % 3 == 0){
            $('#checkResult').text('Fizz');
            $('#checkResult').css('display' , 'block');
            fizzFlg = true;
        }
        if(cnt % 5 == 0){
            $('#checkResult').text($('#checkResult').text() + 'Buzz');
            $('#checkResult').css('display' , 'block');
            buzzFlg = true;
        }
    }

    if(fizzFlg && buzzFlg){
        $('#num').css('color' , 'orangered');
        $('#num').css('font-size' , '+=20');
        $('#num').css('font-weight' , '1000');
        // console.log('size' + $('#num').css("font-size") + ' : weight' + $('#num').css("font-weight"));


    }else if (fizzFlg || buzzFlg){
        $('#num').css('color' , 'coral');
        $('#num').css('font-size' , '+=10');
        $('#num').css('font-weight' , '900');
        // console.log('size' + $('#num').css("font-size") + ' : weight' + $('#num').css("font-weight"));


    }


    fizzFlg = false;
    buzzFlg = false;

}