package com.miaoshaproject.error;/*
 @author -xxx
 @DESCRIPTION 
 @create 2019/8/2
*/

public enum  EmBusinessError implements CommonError{

    USER_NOT_EXIST(10001,"用户不存在"),
    UNKNOWN_ERROR(10002,"未知错误"),
    PARAMETER_VALIDATION_ERROR(20001,"参数不合法"),
    USER_LOGIN_FAIL(20002,"用户手机号或密码不正确"),
    USER_NOT_LOGIN(20003,"用户还未登陆"),
    //30000开头为交易信息错误定义
    STOCK_NOT_ENOUGH(30001,"库存不足"),
    MQ_SEND_FAIL(30002,"库存异步消息失败"),
    RATELIMIT(30003,"活动太火爆"),


    ;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;


    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg=errMsg;
        return this;
    }
}
