# Java-Misc
A selection of Java programs for use by students of the GA10004 module. 

## FileInput
Example of a simple text parser. This program takes strings from the provided strings.txt file and prints them to the console until it reaches the end of the file. 

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
