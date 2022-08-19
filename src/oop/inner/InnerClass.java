package oop.inner;

class OuterClass{
    int num = 10;

    class InnerClassExample{
        int num = 5;
    }
}

public class InnerClass {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println("OuterClass value: " + outerClass.num);

        OuterClass.InnerClassExample innerClassExample = outerClass.new InnerClassExample();
        System.out.println("Inner class value: " + innerClassExample.num);

    }
}
