/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author GPC
 */
public class MyException extends Exception {
    private int errorCode;
    MyException() {
        super();
    }
    MyException (int errorCode) {
        super();
        this.errorCode = errorCode;
    }
    
    MyException (int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    
    
    
}
