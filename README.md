# Java-Examples
A selection of Java programs for use by students of the GA10004 module. 

## FileInput
Example of a simple text parser. This program takes strings from the provided strings.txt file and prints them to the console until it reaches the end of the file.

## Grep
A guide on getting started with Grep in Java through the use of the [Unix4j](https://github.com/tools4j/unix4j) libraries, also includes descriptions of how the Java implementation compares with that of the Unix implementation. 

For further practice, an excellent tutorial can be found here: https://www.baeldung.com/grep-in-java

## HashCollections
Basic usage guide for HashMaps, HashSets and the deprecated Hashtable. Provides explicitly commented examples on how to add, remove, and access elements within each of the structures.

## HashTable
An implmentation of a hashtable that stores strings. 

It makes use of a hashing function to determine the location in the array that a string will be placed at. It sums the ASCII integer values of each character in a given string and then makes use of the modulo operator (%) to limit the size of the hash value, this results in the location of the array in which the string is placed.  

The hashtable itself is composed of one hundred ArrayLists, which allow for the storage of strings with duplicate hash values. Furthermore the structure also supports the storage of duplicate strings as well. 

The exact implementation of the hashing function is as follows: 
```java
public static int hash(String str){
        
        int sum = 0; 
        
        for(int i = 0; i < str.length(); i++){
            sum += (int) str.charAt(i); 
        }
        
        return sum % 100; 
    }
}
```
## Queue
An implementation of a Queue that stores Strings. It uses an ArrayList for its underlying data structure. 

A Queue makes use of the FIFO (First In, First Out) principle, whereby data that was pushed first to the Queue is the data that is popped first from the Queue. 

## Stack
An implementation of a Stack that stores Strings. It uses an ArrayList for its underlying data structure. 

A Stack makes use of the LIFO (Last In, First Out) principle, whereby data that was last pushed to the Stack is the data that is removed first from the Stack. 

## TimeCompare
An example of how Date classes can be used in Java to track the creation of objects as well as how they can be used to sort data by creation date.  

In this example, two lists are created for two types of users; Admins & Basic Users. Each generated User is randomly assigned an adminstrator status as well as a timestamp noting the date of account creation. The lists are then joined and transformed into an unsorted fixed-length array. This array is then sorted by the time at which each User instance was created using an Insertion sort.  
