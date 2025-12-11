package org.example;

import java.util.Scanner;
import java.util.Stack;

public class ReverseAndSearchArray {
    /*
    • Commit your changes with a descriptive title and message.
    • Push the branch to the remote repository.
    • Merge feature/array into main using the NO-FAST-FORWARD option.
    • Push the updated main branch
    * */
    static void main(){
        Scanner sc = new Scanner(System.in);


        System.out.println("How many numbers do you want to enter?: ");
        int arrSize = sc.nextInt();
        sc.nextLine(); // clear buffer '\n'

        int[] arr = new int[arrSize];
        for(int i=0; i<arrSize; i++){
            System.out.println("Enter number "+(i+1)+": ");
            arr[i] = sc.nextInt();
            sc.nextLine(); // lear buffer '\n'
        }
        StringBuilder arrStr = new StringBuilder();

        arrStr.append("The array is: [ ");
        for (int i=0; i < arrSize; i++){
            arrStr.append(arr[i]).append(" ");
        }
        arrStr.append("]");

        System.out.println(arrStr);


        int[] reverseArr = new int[arrSize];

        for(int i=0; i < arrSize; i++){
            reverseArr[i] = arr[arrSize-i-1];
        }

        StringBuilder reverseArrStr = new StringBuilder();
        reverseArrStr.append("The reversed array is: [ ");
        for (int i=0; i < arrSize; i++){
            reverseArrStr.append(reverseArr[i]).append(" ");
        }
        reverseArrStr.append("]");
        System.out.println(reverseArrStr);


        System.out.println("Give me a number to search in the array: ");
        int numberToSearch = sc.nextInt();
        sc.nextLine(); // clear buffer '\n'

        boolean found = false;
        StringBuilder foundStr = new StringBuilder();
        foundStr.append("The number ").append(numberToSearch).append(" is found in the array in the index: ");
        for(int i=0; i < arrSize; i++){ //We only search in the normal arr
            if(numberToSearch == arr[i]){
                found = true;
                foundStr.append(i).append(" ");
            }
        }

        if(found){
            System.out.println(foundStr);
        }else{
            System.out.println("The number is not found in the array");
        }
    }
}
