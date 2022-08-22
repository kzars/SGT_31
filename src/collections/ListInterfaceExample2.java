package collections;

import oop.interfaces.InterfaceExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        // Example 1

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1: " + list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List 2: " + list2);

        // Example 2

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");

        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        for(String str: arrayList){
            System.out.print(str + " ");
        }
        System.out.println();

        //LinkedList

        LinkedList<String> car = new LinkedList<>();
        car.add("Volvo");
        car.add("Opel");
        car.add("Toyota");
        System.out.println(car);
        System.out.println(car.getLast());
        System.out.println(car.get(car.size()-1));

        // Create a new LinkedList object
        // Populate the list with numbers from 1 to 100
        // Print all the elements in the LinkedList

        LinkedList<Integer>  linkedList = new LinkedList<>();
        for(int i = 1; i <= 100; i++){
            linkedList.add(i);
        }
        System.out.println(linkedList);



    }
}
