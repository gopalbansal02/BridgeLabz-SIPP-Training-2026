import java.util.*;
public class countfreq {
    public static void main (String[]args){
        int arr[]={1,22,31,22,1,5};
        Map<Integer,Integer> count=new HashMap<>();

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        System.out.println(count);
    }
    
}
