package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int sum = getTotal(10, 20);
        System.out.println(sum);

        sum = getTotal(5, 4);
        System.out.println(sum);

        sum = getTotal(12, 12);
        System.out.println(sum);

        int max = max(50, 5);
        System.out.println(max);
    }

    private static int getTotal(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    private static int max(int a, int b)
    {
        int max = 0;

        if (a > b)
        {
            max = a;
        }
        else if ( a < b)
        {
            max = b;
        }

        return max;
    }
}
