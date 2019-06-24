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

import java.util.Date;

/**
 * Represents the details stored in a system about a particular user, including 
 * their username, unique identification number, their administration status
 * and the date that their account was created. 
 * 
 * @author Daniel McGuinness
 */
public class User {
    
    private String username;
    private int userID; 
    private boolean isAdmin;
    private Date creationTime;  //NOTE: standard Java class for storing dates. 

    /**
     * Creates a new user with a creation time assigned using the JVMs internal 
     * time-source.
     * 
     * @param username
     * @param userID 
     */
    public User(String username, int userID, boolean isAdmin){
        this.username = username; 
        this.userID = userID; 
        this.isAdmin = isAdmin; 
        this.creationTime = new Date(System.currentTimeMillis());
        
    }
    
    /**
     * Print details about user to the console, primarily for debugging 
     * purposes.
     */
    public void printUserDetails(){
        
        System.out.println("USERNAME:\t" + username + "\tISADMIN:\t" + isAdmin + "\tID:\t" + userID + "\tCREATED:\t" + creationTime.toString());
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    
    /**]
     * 
     * @param username 
     */
    public void setUsername(String username){
        this.username = username; 
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * NOTE: Date object is not returned, instead, the long variable
     * equivalent is returned, for easier comparisons in the sort function. 
     * 
     * @return the creationTime
     */
    public long getCreationTime() {
        return creationTime.getTime();
    }

}
