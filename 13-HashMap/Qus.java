// HashMap is a part of the Java Collections Framework and is used to store key-value pairs. It allows for fast retrieval of values based on their keys. HashMap is not synchronized, which means it is not thread-safe, but it is faster than Hashtable. HashMap allows one null key and multiple null values.
import java.util.*;
// create a HashMap using java HashMap class to store the following pairs(Person,Age)and display them
public class Qus {
    static void HashMapMethods(){
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Harry", 18);
        // getting value of a key from the HashMap
        System.out.println(mp.get("Yash")); // 16//
        System.out.println(mp.get("Rahul")); // null
        // changing/updating value of a key in the HashMap
        mp.put("Yash", 20);
        System.out.println(mp.get("Yash")); // 20 
        // removing a key-value pair from the HashMap  
        System.out.println(mp.remove("Akash")); // 21
        System.out.println(mp.get("sheetal")); // null
        // checking if a key is present in the HashMap
        System.out.println(mp.containsKey("Yash")); // true
        System.out.println(mp.containsKey("Akash")); // false
        // adding a new entry if the new key does not exist already
        mp.putIfAbsent("Akash", 25); // does not update the value of akash as it already exists
        mp.putIfAbsent("Anika", 22); // adds the new key-value pair to the HashMap
        // get all keys in the hashmap
        System.out.println(mp.keySet()); // [Yash, Lav, Harry, Anika]
        // get all values in the hashmap
        System.out.println(mp.values()); // [20, 17, 18, 22]
        // get all entries in the hashmap
        System.out.println(mp.entrySet()); // [Yash=20, Lav=17, Harry=18, Anika=22]
        // get the size of the hashmap
        System.out.println(mp.size()); // 4
        // traversing all entries in the hashmap - multiple methods
        for(String key : mp.keySet()){
            System.out.println(key + " " + mp.get(key)); // Yash 20, Lav 17, Harry 18, Anika 22

        }
        // traverse through entry set
        for(Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue()); // Yash 20, Lav 17, Harry 18, Anika 22
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.println(e); // Yash=20, Lav=17, Harry=18, Anika=22
        }

    }
    public static void main(String[] args) {
        HashMapMethods();
    }
    
}
