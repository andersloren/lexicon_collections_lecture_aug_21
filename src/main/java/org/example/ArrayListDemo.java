package org.example;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        example1();
    }

    public static void example1() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);
        System.out.println(numbers.size());

        // hard coded, using get()
        System.out.println("accessing element on index 0: " + numbers.get(0));
        System.out.println("accessing element on index 1: " + numbers.get(1));
        System.out.println("accessing element on index 2: " + numbers.get(2));
//        System.out.println("accessing element on index 3: " + numbers.get(3)); // throws exception becuase out of bounds

        // using an Iterator, version 1
        Iterator<Integer> iterator1 = numbers.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        // using an Iterator, version 2
        Iterator<Integer> iterator2 = numbers.iterator();
        while (iterator2.hasNext()) {
            Integer number = iterator2.next();
            if (number.equals(40)) {
                iterator2.remove(); // will remove the element from the ArrayList
            }
            System.out.println(number);
        }

        // using a for loop does not allow for manipulating the array
        System.out.println("----------------");
        for (Integer number : numbers) {
            System.out.println(number);
//            if (number.equals(40)) {
//                numbers.remove(number); // this is not allowed
        }

        // using a for loop to iterate the ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----------");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Iterator<String> stringIterator = fruits.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
