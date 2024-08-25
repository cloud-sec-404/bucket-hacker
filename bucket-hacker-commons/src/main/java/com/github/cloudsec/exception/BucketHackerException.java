package com.github.cloudsec.exception;

/**
 *
 * 这个工具里所有的异常都要继承此异常
 *
 * @author CC11001100
 */
public class BucketHackerException extends Exception{

    public BucketHackerException() {
    }

    public BucketHackerException(String message) {
        super(message);
    }

    public BucketHackerException(String message, Throwable cause) {
        super(message, cause);
    }

    public BucketHackerException(Throwable cause) {
        super(cause);
    }

    public BucketHackerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
