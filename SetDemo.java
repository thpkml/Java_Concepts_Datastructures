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
import java.util.List;
import java.util.Arrays;
import java.util.Set;

import java.util.Iterator;
import java.util.HashSet;
public class SetDemo {
    public static void main(String[] arg){
        // create an array to feed into the set
        String[] fruits = {"apple", "peach", "plum", "kiwi",
            "kiwi", "fig","fig"};
        HashSet<String> fruitSet = new HashSet<String>();
        System.out.println("====The Original Array====");
        for(String item: fruits){
            fruitSet.add(item);
            System.out.printf("%s%n", item);
        }
        System.out.println("====The Set====");
        Iterator<String> it = fruitSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(fruits[2]);
        
    }
}
