var imageCodeDao;

(function () {

    imageCodeDao = {
        getImageCode: function (devId) {
            $.get("/api/communication/imageCode?ran="+Math.random(), {"devId": devId}, function (imageCode) {
                var path;
                switch (imageCode) {
                    case 1:
                        path = "/images/断路器-白底分闸.png";
                        break;
                    case 2:
                        path = "/images/断路器-白底合闸.png";
                        break;
                    case 0:
                    case 3:
                        path = "/images/断路器-白底故障.png";
                        break;
                }
                $("img[name='img']").attr("src", path);
            });
        },
        getCommunicationStatusCode: function (devId) {
            $.get("/api/communication/communicationStatusCode?ran="+Math.random(), {"devId": devId}, function (communicationStatusCode) {
                var communicationStatus;
                switch (communicationStatusCode) {
                    case 0:
                        communicationStatus = "通讯状态：故障";
                        break;
                    case 1:
                        communicationStatus = "通讯状态：通讯状态正常";
                        break;
                }
                $("#communicationStatus").text(communicationStatus);
            });
        },

        /**
         * circleCodes 从数据库返回报警和故障的值
         * circleCodes = {yellowCircleCode: 0, redCircleCode: 0}
         * 值为 0 时圆圈颜色为灰色，1 时恢复本来颜色
         * @param devId
         */
        getCircleCode: function (devId) {
            $.get("/api/communication/circleCode?ran="+Math.random(), {"devId": devId}, function (circleCodes) {
                if(circleCodes.yellowCircleCode) {
                    $("#yellowCircle").css("background-color", "yellow");
                } else {
                    $("#yellowCircle").css("background-color", "gray");
                }

                if(circleCodes.redCircleCode) {
                    $("#redCircle").css("background-color", "red");
                } else {
                    $("#redCircle").css("background-color", "gray");
                }
            });
        },

        /**
         * 用于通信状态模块展示 电流 电压 功率
         * @param devId
         */
        getTelemeterStatusDate: function (devId) {
            $.get("/api/telemeter/status?ran="+Math.random(), {"devId": devId}, function (res) {
                var voltage = res.voltage, current = res.current;
                var power = voltage * current;

                $("#voltage").text(voltage.toFixed(2) + "A");
                $("#current").text(current.toFixed(2) + "Kv");
                $("#power").text(power.toFixed(2) + "Kw");

            });
        }
    }

})();