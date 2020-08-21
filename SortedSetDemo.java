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
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetDemo {
    public static void main(String[] args){
        // creating a treeSet from an array
        String[] fruits = {"apple", "peach", "plum", "kiwi",
            "kiwi", "fig","fig"};
        SortedSet<String>fruitSet = 
                new TreeSet<String>(Arrays.asList(fruits));
        for(String f : fruitSet){
            System.out.printf("%s%n", f);
        }
    }
}
