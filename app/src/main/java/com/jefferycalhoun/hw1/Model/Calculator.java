package com.jefferycalhoun.hw1.Model;

/**
 * Created by Jeff on 1/26/17.
 */

public class Calculator {

    private int operand1;
    private int operand2;

    public Calculator(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int add(){
        return operand1 + operand2;
    }
}
