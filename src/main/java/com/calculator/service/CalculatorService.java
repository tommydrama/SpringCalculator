package com.calculator.service;


import com.calculator.model.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(Calculator calculator){
        return calculator.getA()+calculator.getB();
    }

    public double subtract(Calculator calculator){
        return calculator.getA()- calculator.getB();
    }

    public double multiply(Calculator calculator){
        return calculator.getA()*calculator.getB();
    }

    public double divide(Calculator calculator){
        if(calculator.getA()==0 || calculator.getB()==0){
            return 0;
        }
        return calculator.getA()/calculator.getB();
    }

    public Calculator clear(Calculator calculator){
        calculator.setA(0);
        calculator.setB(0);
        calculator.setSingleOpp(0);
        return calculator;
    }
}
