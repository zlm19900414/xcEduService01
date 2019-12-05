package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionCatch {
    @ExceptionHandler(CustomException.class)
    public ResponseResult customException(CustomException customException){
        ResultCode resultCode = customException.getResultCode();
        return new ResponseResult(resultCode);
    }
}
