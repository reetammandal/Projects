//package com.riverdale.programming.gettingstarted;


import java.util.HashMap;
import java.util.Scanner; 

 class Maps{
    public static void main(String args[]){
        HashMap<String, Integer> empIds = new HashMap<>();
        //Map empIds = new HashMap();
        empIds.put("John",12345);
        empIds.put("Mike",12346);
        empIds.put("Terry",12347);
        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Carl"));
        System.out.println(empIds.containsValue(12345));
        empIds.put("Ashley", 12348);
        empIds.put("John", 12349);
        System.out.println(empIds);
        empIds.put("Mike",12364);
        System.out.println(empIds);
        empIds.putIfAbsent("Tara",12564);
        empIds.remove("John");
        System.out.println(empIds);
    }    
}

interface Printable{
    void print();
}

class Cat implements Printable{
    String name;
    int age;
    Cat(){}
    public void print(){
        System.out.println("Meow!");
    }
}
class Lambdas{
    public static void main(String args[]){
        Cat myCat=new Cat();
        //myCat.print();
        printThing(myCat);        
    }
    static void printThing(Printable thing){
        thing.print();
    }
}

abstract class Animals{ //ABstract classes, cannot be instantiated, 

    int age;
    String name;
    public static void main(String[] args){
    }
    public abstract void makeNoise();
    public void play(){
        System.out.println("Play!");
    }

}



interface AnimalStuff{
    public  void poop();
    int id=1;
}

class Dog extends Animals implements AnimalStuff{
    @Override
    public void makeNoise(){
        System.out.println("Bark!");
    }
    public void poop(){
        System.out.println("Poop!");
    }
}

class Animal{
    private String name;
    //private String color;
    public void eat(){
        System.out.println("Eat!");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

class Monkey extends Animal{
    private int breed;
    //private String litterpreference;
    public int getBreed(){
        return breed;
    }
    public void setBreed(int breed){
        this.breed=breed;

    }
    public void eat(){
        System.out.println("Munch!");
    }
    public void eat(int numberOfTimes){
        System.out.println("Munch!");
    }

}
class Polymorphism{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        myAnimal.eat();
        Monkey monkey=new Monkey();
        monkey.eat();
    }
}


/*
class Scanner{
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System in);
        System.out.println("Enter name, height and weight:");
        String username = scannerObj.nextline();
        int age=scannerObj.nextInt();
        double weight=scannerObj.nextDouble();

        System.out.println("Hello, "+username+"!");

    }
}
*/


/*class Fishes{
    public static void main(String[] args){
        enum Breed {
            Tilapia,
            Carp,
            Catfish
        }

        System.out.println("Hello, "+username+"!");

    }
}
*/

class MultithreadThing extends Thread{
    
    private int threadNumber;
    public MultithreadThing(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run(){
        for(int i=1; i <= 5; i++){
            System.out.println(i+" from thread #"+threadNumber);
            if (threadNumber == 3){
                throw new RuntimeException();
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
        }                
    }
}
class Multithreading{
    public static void main(String[] args){
        MultithreadThing myThing1=new MultithreadThing(5);
        MultithreadThing myThing2=new MultithreadThing(5);
        myThing1.run();
        myThing2.run();
        myThing1.start();
        myThing2.start();
        for(int i = 1; i <=5; i ++){
            MultithreadThing myThing=new MultithreadThing(i);
            myThing.start();
        }
    }

}