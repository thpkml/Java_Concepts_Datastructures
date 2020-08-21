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

import java.util.ArrayList;
public class NonGenericTypeCasting {
    public static void main(String[] args){
        // declare a non generic arraylist
        ArrayList<String> words = new ArrayList<String>();
        words.add("ale");
        words.add("boy");
        words.add("cat");
        words.add("dog");
       
       String a = words.get(0);
       System.out.println("This one was not typecast: \n"+a);
       System.out.println("These were typecast:");
       String c = (String)words.get(2);
       System.out.println(c);
       String d = (String)words.get(3);
       System.out.println(d);
    }
}