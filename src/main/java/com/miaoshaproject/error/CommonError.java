package com.miaoshaproject.error;/*
 @author -xxx
 @DESCRIPTION 
 @create 2019/8/2
*/

public interface CommonError {
    public int getErrCode();

    public String getErrMsg();

    public CommonError setErrMsg(String errMsg);
}
