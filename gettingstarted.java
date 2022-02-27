/*
//package com.riverdale.programming.gettingstarted;
/*

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
/*
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
*/
/*
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

/*
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
/*

class MultithreadThing extends Thread implements Runnable{
    
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
        MultithreadThing myThing3=new MultithreadThing(5);
        Thread myThread=new Thread(myThing3);
        myThread.start();
        myThread.join();
        myThread.isAlive();
    }

}




import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;

class FileIO{
    public static void main(){
        try{
        BufferedWriter writer=new BufferedWriter(new FileWriter("JavaTestFile.txt"));
        writer.write("Writing to a file.");
        writer.write("\nHere is another line.");
        String[] names={"Apple","Banana","Clementine"};
        for(String name: names){
            writer.write("\n"+name);
        }
        writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        BufferedReader reader=new BufferedReader(new FileReader("JavaTestFile.txt"));
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(reader.readLine());
        }        
        reader.close();
    }


}


class ExceptionHandling{
    public static void main(String[] args){
        try{
            int myInt=Integer.parseInt("pants");
        } catch(NumberFormatException | NullPointerException e){
            System.out.println("You need to enter an Interger");
            System.out.println();
        }
        catch(Exception e){
            System.out.println("You need to enter an Interger");

        } finally{
            System.out.println("Finally!");
            
        }       

    }
}


import java.io.Serializable;
class Cat extends Serializable{

}
*/
/*

class GenericsExample{
    public static void main(STring[] args){
        Printer<Integer> printer = new Printer<>(23);
        printer.print();
        Printer<Double> printer2 = new Printer<>(23.5);
        printer2.print();
    }

}

class Printer <T>{
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}



class Printer <T extends Animal & Serializable>{
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}

class GenericsExample{
    public static void main(STring[] args){
        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();
        Printer<Dog> printer2 = new Printer<>(newDog());
        printer2.print();
        ArrayList<Object> cats=new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Dog());
        Cat myCat=(Cat)cats.get(0);
        ArrayList<Dog> dogs=new ArrayList<>();
        
        dogs.add(new Dog());
        Dog myDog=dogs.get(0);
    }

}


class Animal{
     String name;
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
    public void makeNoise(){
        System.out.println("Growl!");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Bark!");
    }
    public void poop(){
        System.out.println("Poop!");
    }
}


class Cat extends Animal{
    
    
     String litterpreference;
    public Cat(String name){
        this.name=name;
    }
    public String getlitterpreference(){
        return litterpreference;
    }
    public void setlitterpreference(String litterpreference){
        this.litterpreference=litterpreference;

    }
    public void eat(){
        System.out.println("Munch!");
    }
    public void eat(int numberOfTimes){
        System.out.println("Munch!");
    }

}

class Casting{
    public static void main(String[] args){
        Animal mynewAnimal=new Dog();
        doAnimalStuff(mynewAnimal);

    }
    public static void doAnimalStuff(Animal myanimal){
        myanimal.makeNoise();
        if (myanimal instanceof Dog){
            Dog myDog=(Dog) myanimal;
            myDog.poop();
        }

    }
}


class ArrayList{
    public static void main(String[] args){
        ArrayList<String> friends=new ArrayList<>();

    }
}

class ArrayListvsLinkedList{
    public static void main(String[] args){
        ArrayList<String> friends=new ArrayList<>();
        friends.add("Aaron");
        friends.add("Bose");
        friends.add("Chan");
        
        LinkedList<String> family=new LinkedList<>();
        family.add("Zeeshan");
        family.add("Yzhou");
        family.add("Xki");

        friends.size();
        friends.get(0);
        friends.set(0, Abigail);
        friends.add("Dick")
        friends.add(1, Kramer);
        
        String name=new String("John the Baptist XI");
        System.out.println(names.length;);  
        name.length();

        String[] names=new String("Ravi","Chandra","Kumar","Singh");
        
        System.out.println(names.length;);       

    }
}

*/


