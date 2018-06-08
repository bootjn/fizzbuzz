package com.company;

public class Week2ChallengeCrazyFunInsaneFizzBuzz {

    public static void main(String[] args) {
	// write your code here
        print();
    }
    private static void print()
    {
        System.out.println("-fizzbuzz-");
        for (int i = 1; i < 16; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println("fizz");
            }
            else if (i % 5 == 0){
                System.out.println("buzz");
            }
            else if (i % 3 == 0 && i % 5 ==5)
            {
                System.out.println("fizzbuzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
