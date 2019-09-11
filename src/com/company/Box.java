package com.company;

public class Box<E extends Number> {
    E number1;
    E number2;

    public Box(E number1, E number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public E getNumber1() {
        return number1;
    }

    public E getNumber2() {
        return number2;
    }


}
