package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int sum(int num1,int num2){
        return num1+num2;
    }

    static void main() {

        int sum = sum(5,7);
        System.out.println(sum);


        System.out.print("Hello");
        System.out.println("Hello and welcome to the Java course!");

        String firstname = "Anas";
        System.out.println(firstname);
        int age = 23;
        System.out.println(age);


//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        System.out.println(x);
//
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter your lastname: ");
//        String lastname = scn.nextLine();
//        System.out.println("Hello " + firstname + " " + lastname + "!");

        if(age == 18){
            System.out.println("You are a student");
        } else if (age == 23) {
            System.out.println("You are a graduate");
        } else {
            System.out.println("You are a developer");
        }

        Integer y = 5;

        int[] arr={1,2,23,4,5};

        Integer i =5;

        if(i==90){
            System.out.println("if");
        }
        else if (i==70){
            System.out.println("else if");
        }
        else {
            System.out.println("else");
        }

        switch (i){
            case 90:
                System.out.println("case 90");
                break;
            case 70:
                System.out.println("case 70");
                break;
            default:
                System.out.println("default");
        }


        for (int j = 1;j <=10;j+=2){
            System.out.println(j + " ");
        }

        for (int k =0;k<=10;k++){
            if(k%2!=0){
                System.out.println(k + " ");
            }
        }
        int e = 7;
        if ((e & 1)==1){
            System.out.println(e);
        }

        int[] arr1= {5,3,6,7,2};

        Arrays.sort(arr1);
        for (int a =0;a<arr1.length;a++){
            System.out.println(arr1[a]);
        }
//
        String s1 = "HELLO";
        for (int b = 0;b<s1.length();b++){
            System.out.println(s1.charAt(b));
        }

        final int nn= 10;
        System.out.println(nn);

        int h = 11;
        h+=1;
        System.out.println(h);

        String str = "Hello";
        str.concat(" World");
        System.out.println(str);


        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        if(s1==s2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        if(s1.equals(s2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        if(s1==s3){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        if (s1.equals(s3)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
