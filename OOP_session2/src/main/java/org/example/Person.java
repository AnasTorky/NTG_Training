package org.example;

public class Person {

    String name;
    private int age;
    String track;
    Animal animal = new Animal();

    void greet(){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old" + " and I'm in track " + track);
    }
    //default constructor
    public Person(){
        name="UnKnown";
        age=0;
        track="UnKnown";
        animal.sound();
    }
    //parametrized constructor
    public Person (String name,int age , String track ){
        this.name=name;
        this.age=age;
        this.track=track;

    }

    public void setAge(int age){
        if (age<=18){
            System.out.println("Age must be greater than 18");
        }
        else{
            this.age=age;
        }
    }

    public int getAge(){
        return age;
    }


}
