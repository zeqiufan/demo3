$(function () {
    var devs = [];
    var devIndex = 0;
    var devId = $("#devId").text();
    var userId = $("#userId").text();

    devTableInit();
    radioClick();

    function devTableInit() {
        $("input[name='devRadio']").get(devIndex).checked="checked";
        $.get("/api/dev/profile", {"userId": userId}, function (data) {
            devs = data;
        });
    }

    function radioClick() {
        $("input[name='devRadio']").click(function () {
            devIndex = $(":radio").index($("input[name='devRadio']:checked"));
            devId = devs[devIndex].devId;
            $("#devId").text(devId);
            $.get("/api/dev/changeCurDev", {"devId": devId}, function (curDev) {
                $("span[name='devName']").text(curDev.devName);
            });
        });
    }


});