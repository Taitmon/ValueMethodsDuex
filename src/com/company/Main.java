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

        int max = max(5, 50);
        System.out.println(max);

        boolean trueOrFalse = isThunderDome(2,1);
        System.out.println(trueOrFalse);

        trueOrFalse = isThunderDome(1,2);
        System.out.println(trueOrFalse);

        trueOrFalse = isThunderDome(2,2);
        System.out.println(trueOrFalse);

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
        else if (a == b)
        {
            max = a;
        }

        return max;
    }

    private static boolean isThunderDome (int enteredCount, int leavingCount)
    {
        boolean trueOrFalse;
        if (enteredCount == 2 && leavingCount == 1)
        {
            trueOrFalse = true;
        }
        else
        {
          trueOrFalse = false;
        }

        return trueOrFalse;
}


}
