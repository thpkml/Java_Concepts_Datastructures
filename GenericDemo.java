/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author admin
 */

public class GenericDemo {
    public static void main(String[] args){
        //creating few sample arrays of various types
        String[] strings = {"ball", "doll", "eel","foe"};
        Integer[] integers = {2, 4, 6, 8, 9};
        Double[] doubles = {1.2, 2.3, 3.4, 4.5};
        System.out.println("====String Array====");
        displayArray(strings);
        System.out.println("====Integer Array====");
        displayArray(integers);
        System.out.println("====Double Array====");
        displayArray(doubles);
    }
    // defining each of the display methods separately
    public static <T> void displayArray(T[] arr){
        for(T item : arr)
            System.out.printf("%s%n", item);
    }
}