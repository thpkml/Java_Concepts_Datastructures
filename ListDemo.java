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
import java.util.*;

public class ListDemo {
    public static void main(String[] arg){
        ArrayList<String>  students = new ArrayList<String>();
            students.add("Jon Doe");
            students.add("Kevin Dooley");
            students.add("Mike Ashley");
            students.add("Simrat Patel");
            students.add("Mimisa Sharma");
            students.add("Anum Chowdary"); 
            
            students.clear();
            for(String student: students){
                System.out.printf("%s%n", student);
            }
    }
}
