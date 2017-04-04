package com.company;

public class Main {

    public static void main(String[] args) {
        int num1 = 1020;
        int num2 = 1000;
        int gcd = greatestCommonDivisor(num1, num2);

        System.out.print("The greatest common divisor of" + num1 + "and" + num2 + "is" + gcd);

    }

    public static int greatestCommonDivisor(int m, int n)
    {
        int r;

        if((m == 0) || (n == 0))
            return 0;
        else if((m < 0) || (n < 0))
            return -1;

        do
        {
            r = m % n;
            if(r == 0)
                break;
            m = n;
            n = r;
        }
        while(true);

        return n;
    }
}
