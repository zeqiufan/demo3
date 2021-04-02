$(function () {
    var devId = $("#devId").text();
    var settingDevShow = $("#settingDevShow");
    var settingCtrlShow = $("#settingCtrlShow");
    var hrefGroup = $("#hrefGroup");

    devShow();
    ctrlShow();
    setInterval(imgCodeRefresh,1000);

    function devShow() {
        $("#devSetting").click(function () {
            settingCtrlShow.hide();
            settingDevShow.show();
            hrefGroup.css("margin-top", "10px");
        });
    }

    function ctrlShow() {
        $("#ctrlSetting").click(function () {
            settingDevShow.hide();
            settingCtrlShow.show();
            hrefGroup.css("margin-top", "33px");
        });
    }

    function imgCodeRefresh() {
        devId = $("#devId").text();
        imageCodeDao.getImageCode(devId);
        imageCodeDao.getCommunicationStatusCode(devId);
        imageCodeDao.getCircleCode(devId);
        imageCodeDao.getTelemeterStatusDate(devId);
    }

});