package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static int sum(int x,int y){
        return x+y;
    }

    static void printHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome to the Java course!");

        String firstname = "Anas";
        System.out.println(firstname);

        int age = 23;
        System.out.println(age);

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your lastname: ");
        String lastname = scanner.nextLine();
        System.out.println("Hello " + firstname + " " + lastname + "!");

        if(age == 18){
            System.out.println("You are a student");
        } else if (age == 23) {
            System.out.println("You are a graduate");
        } else {
            System.out.println("You are a developer");
        }

        switch (age){
            case 18:
                System.out.println("You are a student");
                break;
            case 23:
                System.out.println("You are a graduate");
                break;
            default:
                System.out.println("You are a developer");
        }

        for (int i=0;i<=10;i+=2){
            System.out.println(i);
        }

        int sum = sum(8,7);
        System.out.println(sum);

        printHello();

        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // Primitive array
        int[] arr = {10, 20, 30, 40};
        System.out.print("Primitive Array -> ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Non-primitive array (String objects)
        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");

    }
}
