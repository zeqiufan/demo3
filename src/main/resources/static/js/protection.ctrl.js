$(function () {
    var devId = $("#devId").text();
    var protectionsNum = 61;
    var protections = [];

    init();
    modify();
    over();
    solidify();
    refresh();
    change();
    setInterval(imgCodeRefresh,1000);

    $("input[name='devRadio']").click(function () {
        init();
    });

    function init() {
        devId = $("#devId").text();
        $.get("/api/protection/profile?ran="+Math.random(), {"devId":devId}, function (data) {
            protections = data;
            for (var i = 0; i < protections.length; i++) {
                var curElement = $("#id_0" + (i+401));
                if(curElement.attr('name') == "integer") {
                    curElement.text(protections[i].setVal.toFixed(0));
                } else {
                    curElement.text(protections[i].setVal.toFixed(2));
                }
                curElement.css("color", "white");
            }
        });
        /*
        $("#id_0417").text("100.00");
        */
    }

    function modify() {
        $(".form-text").dblclick(function () {
            for (var i = 0; i < protectionsNum; i++) {
                $("#id_0" + (i+401) + "_m").val($("#id_0" + (i+401)).text());
            }
            $(".form-text").hide();
            $(".form-input").show();
        });

        $(".form-input").focus(function () {
            var oldText = $(this).text();
            if($(this).text() != oldText)
                $(this).css("color","lightgreen");
        });
    }

    function over() {
        $(".form-input").blur(function () {
            modifyOver();
        });
        $(".form-input").keypress(function (e) {
            if (e.which == 13) { // 13表示回车键
                modifyOver();
            }
        });
    }

    function modifyOver() {
        for (var i = 0; i < 60; i++) {
            var curElement = $("#id_0" + (i+401)), curElement_m = $("#id_0" + (i+401) + "_m");
            if(curElement_m[0] == undefined)
                continue;
            if(curElement.text() != curElement_m[0].value) {
                curElement.css("color", "lightgreen");
                var newText = $(curElement_m)[0].value - 0;
                if(curElement.attr('name') == "integer") {
                    curElement.text(newText.toFixed(0));
                } else {
                    curElement.text(newText.toFixed(2));
                }
                //TODO: 直接修改数据库里的值
                $.post("/api/protection/modify", {"devId":devId, "indexNo":i+1, "modyVal":curElement.text()}, function() {
                    console.log("修改值已存到数据库");
                });
            }
        }
        $(".form-input").hide();
        $(".form-text").show();
    }
    
    function solidify() {
        $("#solidify").click(function () {
//            modifyOver();
            alert("开始固化！");

            $.post("/api/protection/solidify", {"devId":devId}, function() {
                alert("固化结束，请刷新查看效果！");
            });

            /*
            var count = 0;
            for (var i = 0; i < protections.length; i++) {
                var curElement = $("#id_0" + (i+401));
                if(curElement.text() != "" && curElement.text() != protections[i].setVal.toFixed(2)
                    && curElement.text() != protections[i].setVal.toFixed(0)) { // 弱类型比较
                    count++;
                    //TODO: 只修改cmdtype
                    $.post("/api/protection/solidify", {"devId":devId, "indexNo":i+1, "modyVal":curElement.text()}, function() {
                        alert("第"+(count)+"个值已固化。");
                    });
                }
            }
            if(count == 0) {
                alert("没有需要固化的值！")
            }
//            alert("共修改了"+count+"个值。");
            */
        });
    }
    
    function refresh() {
        $("#refresh").click(function () {
            //TODO: 传给 cmd_table cmd1 置为 1
            //TODO: 延迟几秒调用init / 根据后端数据来确定是否完成，然后再init
            alert("开始刷新");
            $.post("/api/protection/refresh", {"devId": devId}, function(data) {
                setTimeout(function(){
                    alert(data + "\n若无效果请稍等2秒再次刷新！");
                    init();
                }, 2000);
            });
        });
    }

    function change() {
        $("#change").click(function () {
            $.post("/api/protection/change", {"devId": devId}, function() {
                alert("请开始修改！");
            });
        });
    }

    function imgCodeRefresh() {
        imageCodeDao.getImageCode(devId);
        imageCodeDao.getCommunicationStatusCode(devId);
        imageCodeDao.getCircleCode(devId);
        imageCodeDao.getTelemeterStatusDate(devId);
    }
    
});