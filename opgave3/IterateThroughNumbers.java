package opgave3;

import java.util.*;

public class IterateThroughNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,4,2,3,1,5,7,2));
        Iterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 3b
        Map<Integer, Integer> iterMap = new HashMap<>();
        iterMap.put(2,4);
        iterMap.put(3,9);
        iterMap.put(4,16);
        iterMap.put(5,25);
        iterMap.put(6,36);

        Set<Integer> keys = iterMap.keySet();
        Iterator<Integer> iterator1 = keys.iterator();

        while (iterator1.hasNext()){
            int key = iterator1.next();
            System.out.println(key + " " + iterMap.get(key));
        }



    }
}
