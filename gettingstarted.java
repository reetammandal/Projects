//package com.riverdale.programming.gettingstarted;


import java.util.HashMap;

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
    private String color;
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
    private String litterpreference;
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