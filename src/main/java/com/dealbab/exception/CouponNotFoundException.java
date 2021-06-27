package com.dealbab.exception;

public class CouponNotFoundException extends RuntimeException {

    private Integer errorMessage;

    public CouponNotFoundException(Integer id){
        this.errorMessage = id;
    }

    public Integer getErrorMessage() {
        return errorMessage;
    }

}
