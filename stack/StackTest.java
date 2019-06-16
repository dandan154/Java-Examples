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

/**
 * An example program that makes use of a Stack data structure built atop an 
 * ArrayList which is used to store Strings. 
 * 
 * A Stack makes use of the LIFO (Last In, First Out) principle, whereby data
 * that was last pushed to the Stack is the data that is removed first from the
 * Stack. 
 * 
 * @author Daniel McGuinness
 */
public class StackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StringStack stk = new StringStack(); 
        String ex1 = "Huey";
        String ex2 = "Dewey";
        String ex3 = "Louie"; 
        
        System.out.println("Pushing Value:\t" + ex1); 
        stk.push(ex1);
        
        System.out.println("Pushing Value:\t" + ex2); 
        stk.push(ex2);
        
        System.out.println("Pushing Value:\t" + ex3); 
        stk.push(ex3);
        
        System.out.println("Popped Value:\t" + stk.pop());
        System.out.println("Peeked Value:\t" + stk.peek());
        System.out.println("Current Size:\t" + stk.size());
        
        System.out.println("Clearing Stack...");
        stk.clear(); 
        
        System.out.println("Current Size:\t" + stk.size());
    }
    
}
