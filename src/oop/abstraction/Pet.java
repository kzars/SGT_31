package oop.abstraction;

public abstract class Pet {
    protected String color;
    protected String eat;
    protected String place;
    protected int age;

    public abstract void printPetInfo();

    public Pet(String color, String eat, String place, int age){
        this.color = color;
        this.eat = eat;
        this.place = place;
        this.age = age;
    }

    //Default constructor
/*    public Pet(){

    }*/

}
