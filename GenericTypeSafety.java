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
public class GenericTypeSafety {
    public static void main(String[] args){
        // declare a  generic arraylist
        ArrayList<String> words = new ArrayList<String>();
        words.add("ale");
        words.add("boy");
        words.add("cat");
//        words.add(500);
        words.add("dog");
    }
}