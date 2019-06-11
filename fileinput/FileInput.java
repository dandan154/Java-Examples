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
package fileinput;


import java.io.File; 
import java.util.Scanner;

/**
 * Instead of the two imports above you can also just use:
 * 
 * import java.io.*; 
 * import java.util.*; 
 * 
 * for all utilities and io options. Good for experimenting with features. 
 */
 

/**
 * Simple example of reading in a file from Java using the Scanner class.
 * 
 * @author Daniel McGuinness
 */
public class FileInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            /** 
             * Scanner class is used to parse text input, can also be used to
             * get user input directly. 
             */
            Scanner scan = new Scanner(new File("src/fileinput/strings.txt"));
            
            //Loop until end of file
            while(scan.hasNext()){
                System.out.println(scan.next());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
