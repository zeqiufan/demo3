package com.dl.demo2.model.common;

/**
 * 定义 cmd_table 相关的指令常量
 */
public interface Instruct {

    Integer CMD_INDEX_NO = 0;
    Integer CMD_TYPE_INDEX = 0;
    Integer PARAM1 = 1;
    Integer PARAM2 = 2;
    Integer PARAM3 = 3;
    Integer PARAM4 = 4;

    interface CMD_TYPE {
        Integer REFRESH = 1;
        Integer CHANGE = 2;
        Integer SOLIDIFY = 3;
        Integer SWITCH = 4;
    }

    interface PARAM {
        Integer SWITCH_OFF = 1;
        Integer SWITCH_ON = 2;
    }

}
