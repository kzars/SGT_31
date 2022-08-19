package oop.abstraction;

public class Fish extends Pet{
    private int waterChangesInAWeek;

    public void printPetInfo(){
        System.out.println("Color: " + color);
        System.out.println("Eat: " + eat);
        System.out.println("Place: " + place);
        System.out.println("Age: " + age);
        System.out.println("Water changes in a week: " + waterChangesInAWeek);
    }

    public Fish(String color, String eat, String place, int age, int waterChangesInAWeek){
        super(color,eat,place,age);
        this.waterChangesInAWeek = waterChangesInAWeek;
    }

}
