$(function () {

    var userPsw = $("#userPsw"), userPsw2 = $("#userPsw2"), pswNotEqual = $("#pswNotEqual");

    userPsw2.blur(checkPswEqual);

    userPsw.blur(function () {
        if(userPsw2.val() != undefined && userPsw2.val() != "") {
            checkPswEqual();
        }
    });

    function checkPswEqual() {
        if(userPsw.val() != userPsw2.val()) {
            pswNotEqual.show();
        }  else {
            pswNotEqual.hide();
        }
    }
/*
    $("#submit").click(function () {
        $.post("/api/logon", JSON.stringify($('form').serialize()), function (data) {
            if(data == "注册成功") {
                alert("注册成功！");
                window.location.href = "/login";
            } else {
                alert(data);
            }
        });
    });
*/

});