package com.dxctraining.exceptions;

public class BookNotFoundExceptions extends RuntimeException{

    public BookNotFoundExceptions(String msg){
        super(msg);
    }
}