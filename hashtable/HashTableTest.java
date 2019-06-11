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

import java.io.File; 
import java.util.Scanner; 
/**
 *
 * @author Daniel McGuinness
 */
public class HashTableTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         final String toRemove = "Note";
        
        ChainedHashTable table = new ChainedHashTable();
        
        System.out.println("Adding values from strings.txt...");
        try{
            Scanner scan = new Scanner(new File("src/hashtable/strings.txt"));
            
            int i=0; 
            while(scan.hasNext()){
                table.insert(scan.next());
                ++i; 
            }
            System.out.println(i + " values added to hash table.");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        //table.print(); 
        System.out.println("Hash Table Size: " + table.size());
        
        System.out.print("Searching for '" + toRemove + "'...");
        boolean found = table.find(toRemove);
        
        if(found){
            System.out.println("Found!");
        }else{
            System.out.println("Not Found!");
        }
        
        System.out.print("Removing '" + toRemove + "' string...");
        table.remove(toRemove);
        System.out.println("Removed.");
        System.out.println("Hash Table Size: " + table.size());
    }
    
}
