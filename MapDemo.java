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
import java.util.Map;
import java.util.HashMap;
public class MapDemo {
    public static void main(String[] args){
        Map<Integer, String> fruitMap = new HashMap<Integer, String>();
        // adding the fruits to the fruitMap with keys
        fruitMap.put(123, "apple");
        fruitMap.put(153, "peach");
        fruitMap.put(145, "plum");
        fruitMap.put(148, "plum");
        fruitMap.put(154, "kiwi");
        fruitMap.put(178, "fig");
        fruitMap.put(196, "fig");
      
//        for(Map.Entry e : fruitMap.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
        System.out.println(fruitMap.get(148));
        System.out.println(fruitMap.get(178));
        System.out.println(fruitMap.containsKey(178));
        System.out.println(fruitMap.containsValue("fig"));
        System.out.println(fruitMap.containsValue("banana"));
    }
}
