$(function () {
    var devId = $("#devId").text();
    var telemeters = [];

    init();
    setInterval(init,1000);

    function init() {
        devId = $("#devId").text();
        $.get("/api/telemeter/profile?ran="+Math.random(), {"devId": devId}, function (date) {
            telemeters = date;
            for (var i = 0; i < telemeters.length; i++) {
                $("#id_0" + (i+100)).text(telemeters[i].ycVal.toFixed(2) + telemeters[i].ycunit);
            }
            /*
            var voltage = telemeters[0].ycVal, current = telemeters[1].ycVal;
            var power = voltage * current;

            $("#voltage").text(voltage.toFixed(2) + "A");
            $("#current").text(current.toFixed(2) + "Kv");
            $("#power").text(power.toFixed(2) + "Kw");
            */
        });
        imageCodeDao.getImageCode(devId);
        imageCodeDao.getCommunicationStatusCode(devId);
        imageCodeDao.getCircleCode(devId);
        imageCodeDao.getTelemeterStatusDate(devId);
    }

});