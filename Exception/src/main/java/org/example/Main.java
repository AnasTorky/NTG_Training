package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws RuntimeException {
        try{
        Scanner scanner =new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int devide = num1 / num2;
        System.out.println(devide);
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        
        int num3=5;
        int num4=0;
        if (num4==0){
            throw new RuntimeException("Can't devide by zero");
        }
        else {
            System.out.println(num3/num4);
        }


    }
}
