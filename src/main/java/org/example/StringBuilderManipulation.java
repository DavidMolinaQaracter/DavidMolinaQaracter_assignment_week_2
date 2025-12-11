package org.example;

import java.util.Scanner;

public class StringBuilderManipulation {


    static void main(){
        repeater();
    }

    /**
     * This method is to test the StringBuilderManipulation
     * Ask the user for some words and repeat that words the number of times the user says
     */
    static void repeater(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to enter?: ");
        int arrSize = sc.nextInt();
        sc.nextLine(); //clear the buffer '\n'
        System.out.println("You must enter one word per line. ");

        String[] words = new String[arrSize];

        for(int i = 0; i < arrSize; i++){
            System.out.println("Enter the word number " + (i+1) + ": ");
            words[i] = sc.nextLine();
        }

        int times_to_repeat;
        do{
            System.out.println("How many times she wants to repeat those words. ");
            times_to_repeat = sc.nextInt();
            sc.nextLine();

            if(times_to_repeat <  1){
                System.out.println("Invalid input!");
            }
        }while(times_to_repeat < 1);

        StringBuilder wordsRepeated = new StringBuilder();
        wordsRepeated.append("The words repeated are: ");
        for (int i = 0; i < arrSize; i++){
            for (int j = 0; j < times_to_repeat; j++){
                wordsRepeated.append(words[i]).append(" ");
            }
        }

        System.out.println(wordsRepeated);
    }
}

