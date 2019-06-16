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

/**
 * An example program that makes use of a Queue data structure built atop an 
 * ArrayList which is used to store Strings. 
 * 
 * A Queue makes use of the FIFO (First In, First Out) principle, whereby data 
 * that was pushed first to the Queue is the data that is popped first from the
 * Queue. 
 * 
 * @author Daniel McGuinness
 */
public class QueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StringQueue queue = new StringQueue(); 
        
        String ex1 = "Ed";
        String ex2 = "Edd";
        String ex3 = "Eddy";
        
        System.out.println("Pushing Value:\t" + ex1); 
        queue.push(ex1);
        
        System.out.println("Pushing Value:\t" + ex2); 
        queue.push(ex2);
        
        System.out.println("Pushing Value:\t" + ex3); 
        queue.push(ex3);
        
        System.out.println("Popped Value:\t" + queue.pop());
        System.out.println("Peeked Value:\t" + queue.peek());
        System.out.println("Current Size:\t" + queue.size());
        
        System.out.println("Clearing Stack...");
        queue.clear(); 
        
        System.out.println("Current Size:\t" + queue.size());
        
        
    }
    
}
