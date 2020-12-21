package com.nirajaky;

public class Calculator {

    CaluclatorService service;
    public int c = 10;
    public Calculator(CaluclatorService service){
        this.service = service;
    }

    public int perform(int i, int j){
        //return a+b+c;

        return (service.add(i,j))*i;
//        return (i+j)*i;
    }
}
