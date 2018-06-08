package com.company;

import java.util.Random;
import java.util.Scanner;

public class Week2ChallengeCrazyFunInsaneFizzBuzz {

    static Random random = new Random();
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        //print();
        //shazam();
        //takelong();
        //seven();
        bonus();
        //shazam2();
    }
    private static void print()
    {
        System.out.println("-fizzbuzz-");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 ==0)
            {
                System.out.println("fizzbuzz");
            }
            else if (i % 3 == 0){
                System.out.println("fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    private static void shazam()
    {
        System.out.println("how many numbers?: ");
        int inputnumber = keyboard.nextInt();

        int array[] = new int[inputnumber]; //[]
        System.out.println("random number of "+ inputnumber);

        for (int i = 0; i < inputnumber ; i ++)
        {
            array[i] = 1+ random.nextInt(100); //[i= ]//3
        }
        for (int temp: array)
        {
            System.out.print(temp + "\t");
        }
        if (array[0] == array[inputnumber-1])
        {
            System.out.print("Shazam!!");
        }
    }
    private static void takelong()
    {
        //System.out.print("so long");
        System.out.println("how many numbers?: ");
        int inputnumber = keyboard.nextInt();

        int array[] = new int[inputnumber]; //[]
        System.out.println("random number of "+ inputnumber);

        for (int i = 0; i < inputnumber ; i ++)
        {
            array[i] = 1+ random.nextInt(30); //3 10 20
        }
        for (int temp: array)
        {
            System.out.print(temp + "\t");
        }
        if (array[0] == array[inputnumber-1])
        {
            System.out.print("Shazam!!");
        }
        else if (Math.abs(array[0] - array[inputnumber-1]) < 10 ) //<
        {
            System.out.print("This won't take long");
        }
    }
    private static void seven()
    {
        //System.out.print("so long");
        System.out.println("how many numbers?: ");
        int inputnumber = keyboard.nextInt();

        int array[] = new int[inputnumber]; //[]
        System.out.println("random number of "+ inputnumber);

        for (int i = 0; i < inputnumber ; i ++)
        {
            array[i] = 1+ random.nextInt(100); //3 10 20 30
        }
        for (int temp: array)
        {
            System.out.print(temp + "\t");
            if (temp % 7 == 0)
            {
                System.out.print(temp + " - multiple of seven "); //This won't take long
            }
        }
        if (array[0] == array[inputnumber-1])
        {
            System.out.print("Shazam!!");
        }
        else if (Math.abs(array[0] - array[inputnumber-1]) < 10 ) //<
        {
            System.out.print("This won't take long");
        }
    }
    private static void bonus()
    {
        //System.out.print("bonus");

        for (int i = 1; i < 31 ; i ++)
        {
            if (i >=10 && (i % 10 ==0  || i % 10 == 6))
            {
                System.out.println("rock ");
            }
            //System.out.print(i + " ");
            else if (i >10 && (i % 10 == 2 ||  i % 10 == 8))
            {
                System.out.println("paper");
            }
            else if (i >10 && (i % 10  == 4))
            {
                System.out.println("siccors");
            }
            else
            {
                System.out.println(i + " ");
            }
        }
    }
    private static void shazam2()
    {
        System.out.println("how many numbers?: ");
        int inputnumber = keyboard.nextInt();

        int array[] = new int[inputnumber]; //[]
        System.out.println("random number of "+ inputnumber);

        for (int i = 0; i < inputnumber ; i ++)
        {
            array[i] = 1+ random.nextInt(100); //[i= ]//3 100 2
        }
        for (int temp: array)
        {
            if (temp % 5 ==0 )//(temp == 2)
            {
                System.out.print("buzz ");
            }
            else if (temp % 3 == 0)
            {
                System.out.print("fizz ");
            }
            else {
                System.out.print(temp + "\t");
            }
        }
        if (array[0] == array[inputnumber-1])
        {
            System.out.print("Shazam!!");
        }
    }
}
