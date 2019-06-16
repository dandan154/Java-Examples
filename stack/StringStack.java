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
package stack;

import java.util.ArrayList; 
/**
 * An example class that makes use of a Stack data structure built atop an 
 * ArrayList which is used to store Strings.
 * 
 * A Stack makes use of the LIFO (Last In, First Out) principle, whereby data
 * that was last pushed to the Stack is the data that is removed first from the
 * Stack. 
 * 
 * @author Daniel McGuinness
 */
public class StringStack {
    
    ArrayList<String> stk;
    int curpos; 
    
    public StringStack(){
        stk = new ArrayList(); 
        curpos = -1; 
    }
    
    /**
     * Push a String value to the top of the Stack. 
     * 
     * @param str   String to be added to the top of the Stack.
     * @return      Was the value pushed successfully?
     */
    public boolean push(String str){
        
        //This implementation disallows nulls and empty strings. 
        if(str.equals("") | str.equals(null)){
            return false; 
        }
        
        stk.add(str);
        curpos++;
        return true; 
    }
    
    /**
     * Pops a String value; returning it and then removing it from the Stack. 
     * 
     * @return  Top value of the Stack which has been popped.
     */
    public String pop(){
        
        //Simple error prevention, return null instead of causing runtime error.
        if(curpos == -1){
            return null; 
        }
        
        String str = stk.get(curpos);
        stk.remove(curpos--);   //postfix deincrement, original value is used. 
        return str; 
    }
    
    /**
     * Peeks at the value on the top of the Stack but doesn't remove it from the
     * structure. 
     * 
     * @return  Top value of the stack. Returns null if empty stack. 
     */
    public String peek(){
        
        //Return null if no values on stack. 
        if(curpos == -1){
            return null; 
        }
        
        return stk.get(curpos); 
    }
    
    /**
     * Removes every String value currently held within the Stack. Also resets 
     * the current position variable, 'curpos'. 
     */
    public void clear(){
        stk.clear();
        curpos = -1; 
    }
    
    /**
     * Retrieve the total number of Strings currently stored on the Stack. 
     * 
     * An alternative solution to this is to use a running total every time a 
     * value is popped or pushed, similar to the 'curpos' value (or just the 
     * value itself). 
     * 
     * @return  Number of values stored in the Stack. 
     */
    public int size(){
        return stk.size(); 
    }
}
