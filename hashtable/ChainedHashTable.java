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
package hashtable;

import java.util.ArrayList;
import java.util.ListIterator; 
/**
 *
 * @author Daniel McGuinness
 */
public class ChainedHashTable {
    
    static final int ARRAY_SIZE = 100; 
    ArrayList<String>[] arr;
    
    public ChainedHashTable(){
        arr = new ArrayList[ARRAY_SIZE];
        
        for (int i=0; i < ARRAY_SIZE; i++){
            arr[i] = new ArrayList();
        }
        
    }
    
    /**
     * Inserts a given string into the hash table.
     * 
     * @param str The string to be inserted
     */
    public void insert(String str){
        int h = hash(str);
        arr[h].add(str);
    }
    
    /**
     * Removes the first instance of the given string in the hash table.
     * If it is successful it returns true, else if the value was not found, it
     * returns false. 
     * 
     * @param str   The string to be inserted
     * @return      confirmation that the value has been removed successfully
     */
    public boolean remove(String str){
        int h = hash(str);
        return arr[h].remove(str); 
    }
    
    
    /**
     * Finds the first instance of a string occurring with the hash table and 
     * returns true. If the search was unsuccessful, it returns false. 
     * 
     * @param str   The string to be searched for
     * @return      confirmation that the value has been found successfully. 
     */
    public boolean find(String str){
        int h = hash(str); 
        return arr[h].contains(str);
    }
    
    /**
     * Adds up the sum of the ArrayList sizes within the base hash table array 
     * and returns the total size. 
     * 
     * NOTE: An alternative approach would be to keep a running total of the 
     * size to eliminate linear scaling with size calculation. 
     * 
     * @return      The number of values held within the hash table . 
     */
    public int size(){
        int size = 0; 
        
        for(int i = 0; i < ARRAY_SIZE; i++){
            size += arr[i].size(); 
        }
        return size; 
    }
    
    /**
     * Prints every string stored within the hash table to the console. 
     */
    public void print(){
        
        ListIterator li; 
        
        for(int i = 0; i < ARRAY_SIZE; i++ ){
            if(arr[i].size() > 0){
                
                li = arr[i].listIterator(); 
                
                while(li.hasNext()){
                    System.out.print(li.next() + " ");
                } 
                System.out.println("");
            }
        }
    }
    
    /**
     * Calculates the hash value of a string based on the sum of its
     * character ASCII values mod 100. As a result this function scales linearly
     * with the length of the string. 
     * 
     * @param str   The string to be hashed
     * @return      The resulting hash value
     */
    public static int hash(String str){
        
        int sum = 0; 
        
        for(int i = 0; i < str.length(); i++){
            sum += (int) str.charAt(i); 
        }
        
        return sum % 100; 
    }
}
