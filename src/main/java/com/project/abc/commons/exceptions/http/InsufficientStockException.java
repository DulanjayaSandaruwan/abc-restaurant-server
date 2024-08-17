package com.project.abc.commons.exceptions.http;

import com.project.abc.commons.exceptions.ExType;
import com.project.abc.commons.exceptions.ExceptionType;

public class InsufficientStockException extends BaseException{

    public InsufficientStockException(ExceptionType exType , String message){
        super(exType, message);
    }

    public InsufficientStockException(String message){
        super(message);
        setType(ExType.INSUFFICIENT_STOCK);
    }
}
