package com.jim.es.core.constants;

/**
 * @author Jim
 * @date 12/01/2016
 * @version 1.0
 * @description
 */
public class ServiceException extends RuntimeException{
    private int code;

    public ServiceException(int code,String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(int code,Throwable cause) {
        super(cause);
        this.code = code;
    }

    public ServiceException(int code,String message,Throwable cause) {
        super(message,cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceException that = (ServiceException) o;

        if (code != that.code) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
