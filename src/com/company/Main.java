package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int sum = getTotal (10,20);
        System.out.println(sum);

        sum = getTotal(5, 4);
        System.out.println(sum);

        sum = getTotal(12, 12);
        System.out.println(sum);
    }

    private  static  int getTotal(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;
        return sum;
    }
}
