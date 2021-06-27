package com.dealbab.exception;

	 	    public class CouponAlreadyExistsException extends RuntimeException {

	        public CouponAlreadyExistsException(Integer integer) {
	            super("Coupon already exists for ID: '" + integer + "'");
	        }
	    }

