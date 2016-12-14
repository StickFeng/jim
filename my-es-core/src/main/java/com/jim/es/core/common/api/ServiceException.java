package com.jim.es.core.common.api;

/**
 * @author Jim
 * @date 12/13/2016
 * @version 1.0
 */
public class ServiceException extends RuntimeException{
    private static final long serialVersionUID = -8578269735355557685L;
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
