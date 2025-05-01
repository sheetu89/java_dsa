// given an array find the most frequent element in it.if there are multiple elements that appear a maximum number of times,print any one of them.
// sample input:
// n=6
// arr[] = {1,3,2,1,4,1}
// expected output = 1;
import java.util.*;
public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1,5,5,9,3,2,1,2,1,4,1};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }else{
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int maxFreq = 0, anskey = -1;
        for(var e :freq.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", anskey, maxFreq);
    }    
}

