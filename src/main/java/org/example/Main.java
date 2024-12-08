package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main
{

   static int getRandom(int min, int max)
   {

       return new Random().nextInt(max - min) + min;
   }

    public static void main (String[] args)
    {

        int questionCount = getRandom(10, 15);
        int mark = 0;
        int answer;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questionCount; i++)
        {
            int firstDigit = getRandom(1, 11);
            int secondDigit = getRandom(1, 11);
            System.out.println("Here is " + (i+1) + " task : ");
            System.out.print(firstDigit +" * "+secondDigit+ " = ");
            answer = scanner.nextInt();
            if(answer == firstDigit*secondDigit)
            {
                System.out.println("Correct");
                mark++;
            }
            else
            {
                System.out.println("Wrong");
            }


        }
        if(mark == questionCount)
        {
            System.out.println("Wonderful!, your mark is " + 12);
        }
        else if (mark>=(questionCount/2)&&mark<(questionCount*1.5))
        {
            System.out.println("Great, your mark is " + 8);
        }
        else if (mark>=(questionCount*1.5))
        {
            System.out.println("Great, your mark is " + getRandom(7,11));
        }


    }
}