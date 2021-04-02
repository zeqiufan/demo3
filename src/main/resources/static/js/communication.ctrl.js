$(function () {
    var devId = $("#devId").text();
    var communications = [];

    init();
    setInterval(init,1000);

    function init() {
        devId = $("#devId").text();
        $.get("/api/communication/profile?ran="+Math.random(), {"devId":devId}, function (date) {
            communications = date;
            for (var i = 0; i < communications.length; i++) {
                $("#id_0" + (i+200)).text(communications[i].yxVal);
            }
        });
        imageCodeDao.getImageCode(devId);
        imageCodeDao.getCommunicationStatusCode(devId);
        imageCodeDao.getCircleCode(devId);
        imageCodeDao.getTelemeterStatusDate(devId);
    }

});