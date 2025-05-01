// implement your own hashmap with the following methods.
// 1.put(key,value)
// (A)returns void
// (b)insert updates
// 2.get(key)
// (a)returns value corresponding to key if it exists
// (b)return null if key doesn't exist
// 3.size
// (a)returns the number of entries in hashmap
// 4.remove(key)
// (a)removes an entry with key 'key' from the hashmap
// (b)return null or value

// both key and values can be of any type.

import java.util.LinkedList;

class MyHashMap<K, V> {
    // Define the size of the HashMap
    private static final int SIZE = 16; // Default size
    private LinkedList<Entry<K, V>>[] table;

    // Entry class to store key-value pair
    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the table
    public MyHashMap() {
        table = new LinkedList[SIZE];
    }

    // Hash function to calculate index
    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    // put() method to insert or update key-value pair
    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Check if the key already exists, update if it does
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing value
                return;
            }
        }

        // If key doesn't exist, insert a new entry
        table[index].add(new Entry<>(key, value));
    }

    // get() method to retrieve value by key
    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value; // Key found, return value
                }
            }
        }
        return null; // Key not found
    }

    // size() method to return the number of entries in the HashMap
    public int size() {
        int size = 0;
        for (LinkedList<Entry<K, V>> bucket : table) {
            if (bucket != null) {
                size += bucket.size();
            }
        }
        return size;
    }

    // remove() method to delete key-value pair
    public V remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    table[index].remove(entry); // Remove the entry
                    return entry.value; // Return the removed value
                }
            }
        }
        return null; // Key not found
    }

    // Main method for testing
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        // Insert some key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Get values by key
        System.out.println(map.get("Apple"));  // Output: 10
        System.out.println(map.get("Banana")); // Output: 20
        System.out.println(map.get("Mango"));  // Output: null (key doesn't exist)

        // Update value of existing key
        map.put("Apple", 100);
        System.out.println(map.get("Apple"));  // Output: 100

        // Get the size of the map
        System.out.println("Size: " + map.size()); // Output: 3

        // Remove a key-value pair
        System.out.println(map.remove("Banana")); // Output: 20
        System.out.println(map.get("Banana"));    // Output: null

        // Final size after removal
        System.out.println("Size after removal: " + map.size()); // Output: 2
    }
}
