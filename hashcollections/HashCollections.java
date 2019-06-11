/*
 * Copyright (C) 2019 Daniel McGuinness
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package hashcollections;

import java.util.HashSet;
import java.util.HashMap; 
import java.util.Hashtable;

/**
 *
 * A small program demonstrating how to use the various "HashTable"-esque
 * data structures found within the collections API. Functionality has been 
 * explicitly commented to aid with understanding. 
 * 
 * This is not a COMPREHENSIVE look at these data structures just the 
 * essentials. For example, I do not cover methods for iterating through the
 * structures, if that is something you would like to see covered, send me a 
 * message.
 * 
 * @author Daniel McGuinness
 */
public class HashCollections {
    
    public static void main(String[] args) {

        System.out.println("=== Hashtable Example ===");
        hashTableExample(); 
        
        System.out.println("\n=== HashMap Example ===");
        hashMapExample(); 
        
        System.out.println("\n=== HashSet Example ===");
        hashSetExample(); 
    }
    
    /**
     * Demonstrates the creation of a Hashtable data structure as well as how to
     * access, add, and remove elements from it. 
     * 
     * NOTE: HashTable is DEPRECATED, for similar functionality use HashMap 
     *       instead! (See hashMapExample())
     * 
     * For full specification of Hashtable check:
     * https://docs.oracle.com/javase/7/docs/api/java/util/Hashtable.html
     */
    private static void hashTableExample(){

        /*Create Hashtable*/
        Hashtable<String, Integer> table = new Hashtable(); 
        
        
        /*Inserting key/value pairs into the hashtable.*/ 
        table.put("John", 92);
        table.put("Paul", 82);
        table.put("George", 76);
        table.put("Ringo", 1);
        
        /*Retrieve values using given key*/
        //NOTE: Using a non-existent key returns a NullPointerException.
        int val_1 = table.get("Ringo");
        int val_2 = table.get("Paul");
        
        System.out.println("'Ringo' lookup value:\t" + val_1);
        System.out.println("'Paul' lookup value:\t" + val_2);
        
        
        /*Check if table contains certain keys or values.*/
        boolean a = table.containsKey("John");
        boolean b = table.containsKey("Dave");
        
        boolean c = table.containsValue(1);
        boolean d = table.containsValue(99);
        
        System.out.println("Table contains key 'John':\t" + a);
        System.out.println("Table contains key 'Dave':\t" + b);
        
        System.out.println("Table contains value '82':\t" + c);
        System.out.println("Table contains value '99':\t" + d);
        
        
        /*Retrieve size of hashtable.*/
        int size = table.size(); 
        System.out.println("Total key/value pairs in table:\t" + size);
        
        
        /*Remove individual elements from the hashtable.*/
        table.remove("Ringo");
        
        boolean e = table.containsKey("Ringo");
        boolean f = table.containsValue(1);     //key AND value removed
        
        if(e == false && f == false){
            System.out.println("'Ringo/1' key-value pair removed!");
        }
        
        
        /*Remove all elements from table*/
        table.clear(); 
        
        //isEmpty checks if the table contains any values, returns true if empty
        if(table.isEmpty()){
            System.out.println("The table has been cleared successfully!");
        }
 
    }
    
    /**
     * Demonstrates the creation of a HashMap data structure as well as how to
     * access, add, and remove elements from it. 
     * 
     * Important to note is the similarities between this and the deprecated
     * HashTable function. 
     * 
     * For full specification of HashMap check:
     * https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
     */
    private static void hashMapExample(){
        
        /*Create HashMap*/
        HashMap<String,Integer>map = new HashMap();
        
        
        /*Inserting key/value pairs into the HashMap.*/ 
        map.put("John", 92);
        map.put("Paul", 82);
        map.put("George", 76);
        map.put("Ringo", 1);
        map.put(null, null);     //permits NULL keys and/or values
        
        /*Retrieve values using given key*/
        //NOTE: Using a non-existent key returns a NullPointerException.
        int val_1 = map.get("Ringo");
        int val_2 = map.get("Paul");
        
        System.out.println("'Ringo' lookup value:\t" + val_1);
        System.out.println("'Paul' lookup value:\t" + val_2);
        

        /*Check if HashMap contains certain keys or values.*/
        boolean a = map.containsKey("John");
        boolean b = map.containsKey("Dave");
        
        boolean c = map.containsValue(1);
        boolean d = map.containsValue(99);
        
        System.out.println("HashMap contains key 'John':\t" + a);
        System.out.println("HashMap contains key 'Dave':\t" + b);
        
        System.out.println("HashMap contains value '82':\t" + c);
        System.out.println("HashMap contains value '99':\t" + d);
               
        
        /*Retrieve size of HashMap.*/
        int size = map.size(); 
        System.out.println("Total key/value pairs in table:\t" + size);
        
        
        /*Remove individual elements from the HashMap.*/
        map.remove("Ringo");
        
        boolean e = map.containsKey("Ringo");
        boolean f = map.containsValue(1);     //key AND value removed
        
        if(e == false && f == false){
            System.out.println("'Ringo/1' key-value pair removed!");
        }
        
        
        /*Remove all elements from HashMap*/
        map.clear(); 
        
        //isEmpty checks if the table contains anything, returns true if empty
        if(map.isEmpty()){
            System.out.println("The HashMap has been cleared successfully!");
        }
    }
    /**
     * Demonstrates the creation of a HashSet data structure as well as how to
     * access, add, and remove elements from it. Functions in essentially the
     * same manner as the Set structure, however through hashing allows
     * for O(1) access, add and remove times. 
     * 
     * 
     * For full specification of HashSet check:
     * https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
     */
    private static void hashSetExample(){
        
        /*Create HashSet*/
        HashSet<String>set = new HashSet();
        
        
        /*Inserting values into the HashSet.*/ 
        set.add("John");
        set.add("Paul");
        set.add("George");
        set.add("Ringo");
        set.add(null);      //permits the use of NULL
        
        /*Checking if HashSet contains certain values*/
        boolean a = set.contains("John");
        boolean b = set.contains("Dave");
        
        System.out.println("HashSet contains key 'John':\t" + a);
        System.out.println("HashSet contains key 'Dave':\t" + b);
        
        
        /*Retrieve size of HashSet.*/
        int size = set.size(); 
        System.out.println("Total no. of values in table:\t" + size);
        
        
        /*Remove individual elements from the HashSet.*/
        set.remove("Ringo");
        
        boolean c = set.contains("Ringo");
        
        if(c == false){
            System.out.println("'Ringo' value removed!");
        }
        
        /*Remove all elements from HashMap*/
        set.clear(); 
        
        //isEmpty checks if the table contains anything, returns true if empty
        if(set.isEmpty()){
            System.out.println("The HashMap has been cleared successfully!");
        }
    }
    
}
