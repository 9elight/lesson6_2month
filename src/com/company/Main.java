package com.company;

import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        Box<Number> numberBox = new Box<>(2.0,32);
        Box<Float> floatBox = new Box<>(2.5f,16.2f);
        Number a = addition(numberBox,floatBox);
        Number b = multiplication(numberBox,floatBox);
        System.out.println("Сумма чисел = " + a);
        System.out.println("Результат умножения = " + b);

    }

    public static Number addition(Box<? extends Number> box1,Box<? extends Number> box2){
        return box1.getNumber1().doubleValue() + box1.getNumber2().doubleValue() + box2.getNumber1().doubleValue()
                + box2.getNumber2().doubleValue();
    }
    public static Number multiplication(Box<? extends Number> box1,Box<? extends Number> box2){
        return box1.getNumber1().doubleValue() * box1.getNumber2().doubleValue() * box2.getNumber1().doubleValue()
                * box2.getNumber2().doubleValue();
    }
}
