import java .util.*;
public class MapInterfaceExample {
  public static void main(String[] args) {
    TreeMap<Integer, String> mp = new TreeMap<>();
    Map<Integer, String> map = new HashMap<>();
    // HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");
    map.put(3, "Three");
    map.put(4, "Four");
    map.put(5, "Five");
    System.out.println(map); // {1=One, 2=Two, 3=Three, 4=Four, 5=Five}
    // iterate over key in our map
    for(Integer i : map.keySet()){
      System.out.println(i + " : " + map.get(i)); // print key and value
    }

    // iterate over values in our map
    for(String s : map.values()){
      System.out.println(s); // print value
    }
    // iterate over the key,value mappings in our map
    for(var e : mp.entrySet()){
      System.out.println(e.getKey() + " : " + e.getValue()); // print key and value
    }
    map.putIfAbsent(1, "three"); // will not add, key 1 already exists
    System.out.println(map); // {1=One, 2=Two, 3=Three, 4=Four, 5=Five}
    System.out.println(map.get(3)); // Three
    map.put(3, "Three Updated"); // update value for key 3
    System.out.println(map); // {1=One, 2=Two, 3=Three Updated, 4=Four, 5=Five}
    System.out.println(map.size()); // 5 (size of the map)
    map.remove(4); // remove key 4
    System.out.println(map); // {1=One, 2=Two, 3=Three Updated, 5=Five}
    System.out.println(map.containsKey(2)); // true
    System.out.println(map.keyset()); // [1, 2, 3, 5]
    System.out.println(map.values()); // [One, Two, Three Updated, Five]


  }  
}
