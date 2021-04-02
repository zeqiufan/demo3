$(function () {
    var devId = $("#devId").text();

    init();
    switchOn();
    switchOff();
    setInterval(init, 1000);

    function init() {
        devId = $("#devId").text();
        imageCodeDao.getImageCode(devId);
        imageCodeDao.getCommunicationStatusCode(devId);
        imageCodeDao.getCircleCode(devId);
        imageCodeDao.getTelemeterStatusDate(devId);
    }

    function switchOn() {
        $("#switchOn").click(function () {
            $.post("/api/remote/switchOn", {"devId": devId}, function () {
                alert("遥控合闸完成！");
            });
        });
    }

    function switchOff() {
        $("#switchOff").click(function () {
            $.post("/api/remote/switchOff", {"devId": devId}, function () {
                alert("遥控分闸完成！");
            });
        });
    }

});