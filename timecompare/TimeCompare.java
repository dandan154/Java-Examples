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
package timecompare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * An example of how a sorting algorithm can be applied to a more complex data
 * type. In this instance, two different sets of user accounts are generated; 
 * Basic Users and Administrators. 
 * 
 * The administrator designation of a User is picked randomly, after which they 
 * are assigned to a unique list depending on this designation. (Either the
 * Administrator list or the Basic User list). 
 * 
 * These two lists are then concatenated, with the Basic User list being added
 * on to the end of the Administrator list. The combined list is then assigned 
 * to a static array for sorting. 
 * 
 * @author Daniel McGuinness
 */
public class TimeCompare {

    static final int WAIT = 1000000;    //Used to perform empty loop
    static final String[] USERNAMES = {"stevemc", "jeff", "paulmc", "johnlen", "rstarr", "geohar", "davey", "pablo"}; 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Used to generate random boolean for administator assignment. 
        Random r = new Random(); 
        
        //Linked Lists are flexible, can be used for Queues, Stacks, etc. 
        //NOTE: specific classes should usually be used to ensure superior
        //      readablity. 
        LinkedList<User> adminUserList = new LinkedList();
        LinkedList<User> basicUserList = new LinkedList();
        
        //The array that will store our full list of users. 
        User[] fullUserArray = new User[USERNAMES.length];
        
        User newUsr;
        boolean adminStatus; 
        
        //Generate Users
        for(int i = 0; i < USERNAMES.length; i++){
            
            adminStatus = r.nextBoolean(); 
            newUsr = new User(USERNAMES[i], i, adminStatus);
            
            //Randomly assign user to admin or basic queues
            if(adminStatus){
                adminUserList.add(newUsr);
            }else{
                basicUserList.add(newUsr); 
            }
            
            //Wait for short period of time to generate millisecond differences
            //This gives every User a unique creation date for more evident 
            //sorting. In an actual program, this is terrible practice, but for 
            //testing it is fine.
            for(int j =0; j < WAIT; j++);
            
        }
        
        //Combine users into single list & put into static array
        adminUserList.addAll(basicUserList);
        fullUserArray = adminUserList.toArray(fullUserArray);
        
        
        //NOTE: Don't stress too much about the syntax of combining lists, its 
        //all laid out in the documentation: 
        //https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
        

        //DEBUG - Print original order of combined lists
        for(int i = 0; i < fullUserArray.length; fullUserArray[i++].printUserDetails());

        //Sort the array by date that the account was created.  
        System.out.println("Running sort...");
        fullUserArray = userInsertionSort(fullUserArray);
        
        //DEBUG - Print the newly sorted array. 
        for(int i = 0; i < fullUserArray.length; fullUserArray[i++].printUserDetails());
        
    }
    
    /**
     * An example of how to use a sort with more complex classes. This function 
     * takes the creation time of the User class and orders based on earliest 
     * creation time. 
     * 
     * @param arr   The array to be sorted. 
     * @return      Reference to sorted array.  
     */
    public static User[] userInsertionSort(User[] arr){
        
        User toSwap;     //temporary variable to store value during swap 
        
        for(int i = 1; i < arr.length; i++){
            
            //Reiterate back through each previous array element
            //and swap if necessary.
            for(int j = i; j > 0 && arr[j-1].getCreationTime() > arr[j].getCreationTime(); j--){
                toSwap = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = toSwap; 
            }
        }
        
        return arr; 
    }
    
}
