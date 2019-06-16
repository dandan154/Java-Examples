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
package queue;

import java.util.ArrayList; 

/**
 * An example class that defines a Queue data structure built atop an ArrayList
 * which is used to store Strings. 
 * 
 * A Queue makes use of the FIFO (First In, First Out) principle, whereby data 
 * that was pushed first to the Queue is the data that is popped first from the
 * Queue. 
 * 
 * @author Daniel McGuinness
 */
public class StringQueue {
    
    ArrayList<String> queue;
    
    public StringQueue(){
        queue = new ArrayList(); 
    }
    
    /**
     * Push a String value to the back of the Queue. 
     * 
     * @param str   String to be added to the top of the Queue.
     * @return      Was the value pushed successfully?
     */
    public boolean push(String str){
        
        //This implementation disallows nulls and empty strings. 
        if(str.equals("") | str.equals(null)){
            return false; 
        }
        
        queue.add(str);
        return true; 
    }
    
    /**
     * Pops a String value; returning it and then removing it from the Queue. 
     * 
     * @return  Value from the front of the Queue which has been popped.
     */
    public String pop(){
        
        //Simple error prevention, return null instead of causing runtime error.
        if(queue.isEmpty()){
            return null; 
        }
        
        //Arraylist remove() function automatically shifts data to left. 
        return queue.remove(0); 
    }
    
    /**
     * Peeks at the value at the front of the Queue but doesn't remove it from 
     * the structure. 
     * 
     * @return  Front value of the stack. Returns null if empty stack. 
     */
    public String peek(){
        
        //Simple error prevention, return null instead of causing runtime error.
        if(queue.isEmpty()){
            return null; 
        }
        return queue.get(0);
    }
    
    /**
     * Removes every String value currently held within the Queue.
     */
    public void clear(){
        queue.clear();
    }
    
    /**
     * Retrieve the total number of Strings currently stored on the Queue. 
     * 
     * An alternative solution to this is to use a running total every time a 
     * value is popped or pushed.
     * 
     * @return  Number of values stored in the Queue. 
     */
    public int size(){
        return queue.size(); 
    }
}
