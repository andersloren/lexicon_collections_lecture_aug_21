package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
