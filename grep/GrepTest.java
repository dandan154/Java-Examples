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
package grep;

import java.io.File;
import java.util.List;

import org.unix4j.Unix4j;
import org.unix4j.line.Line;
import org.unix4j.unix.Grep;

/**
 * This program requires the Unix4j Libraries which can 
 * be downloaded at https://search.maven.org/search?q=g:org.unix4j
 * 
 * For further information on how this functions consult the documentation: 
 * https://github.com/tools4j/unix4j
 * 
 * For the documentation on the command that this seeks to emulate, see: 
 * http://linuxcommand.org/lc3_man_pages/grep1.html
 * 
 * @author Daniel McGuinness
 */
public class GrepTest {
    
    static final String ALICE = "src/grep/alice.txt";
    static final int LINES_TO_PRINT = 5; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File file = new File(ALICE); 
        List<Line> lines;     
       
        //When in doubt RTFM! - http://linuxcommand.org/lc3_man_pages/grep1.html
        
        /*
        EXAMPLE:
        The following code searches alice.txt for all the lines containing the 
        string "Alice" anywhere in each line. This is then loaded into the List
        of Line classes that was declared earlier in the function. 
        
        In grep the command would traditionally look like this:
        grep -F "Alice" alice.txt
        
        By examining the below call to Unix4j.grep we can see how each section
        of the command is emulated through arguments to the Unix4j.grep method
        */
        
        lines = Unix4j.grep(Grep.Options.F, "Alice", file).toLineList();

        /*
        In this case, the 'Grep.Options.F' argument tells the function that we 
        want to search for a fixed-string, a set of specific characters.
        
        '"Alice"' tells the function the string that we want to search for.
        
        'file' tells the function the file that we want to search for the given 
        string in. 
        
        Now that we have the results of the command, we can print out the total 
        number of lines that contain the word "Alice" using lines.size(). We can 
        also print the first few lines of our results, to check to make sure it 
        has been implemented correctly. 
        */
        
        
        System.out.println("Lines containing matching string: " + lines.size());
        for(int i =0; i< LINES_TO_PRINT; System.out.print(i + ". " + lines.get(i++).toString()));
        
                
        //Things to try and implement:
        //  Find lines that DONT contain "White Rabbit"
        //  Find lines with a word between 10-16 characters
        //  Find lines containing the 2 or more vowels in a row
        
        lines = Unix4j.grep(Grep.Options.v, "White Rabbit", file).toLineList(); 
        System.out.println("Lines not containing matching string: " + lines.size());
        //System.out.println(lines.get(0).toString());

        lines = Unix4j.grep("[AEIOUaeiou]{3,}", file).toLineList(); 
        System.out.println("Lines containing 3 or more vowels in a row: " + lines.size());
        //System.out.println(lines.get(0).toString());

        lines = Unix4j.grep("[A-Za-z]{10,16}", file).toLineList();
        System.out.println("Lines containing words between 10-16 characters: " + lines.size());
        //System.out.println(lines.get(0).toString());

    }
    
}
