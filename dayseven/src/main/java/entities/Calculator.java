package entities;

public class Calculator {

    public int add(int num1, int num2){

        int result = 0;
        result = num1 + num2;
        return result;
    }

    public int div(int num1, int num2) throws ArithmeticException{
        int divResult=0;
        divResult = num1/num2;
        return divResult;
    }
}
