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
public class NonGenericTypeSafetyIssue {
    public static void main(String[] args){
        // declare a non generic arraylist
        ArrayList words = new ArrayList();
        words.add("ale");
        words.add("boy");
        words.add("cat");
        words.add(500);
        words.add("dog");
        
       String d = (String)words.get(3);
       System.out.println(d);
    }
}
