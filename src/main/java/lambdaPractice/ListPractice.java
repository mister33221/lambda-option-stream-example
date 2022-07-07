package lambdaPractice;

import java.util.*;

public class ListPractice {

    private static List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    private static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {

//      以前我們可以用for迴圈來跑list
        for (Integer i : list) {
              System.out.println(i);
        }
        
        System.out.println("==============================");

//      但是現在我們可以用lambda來跑list，這樣可以讓我們更加簡潔，更加簡單。
        list.forEach(System.out::println);
        
        System.out.println("==============================");
        
        list.forEach(i -> System.out.println(i));


        System.out.println("==============================");
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
//      以前我們可以用for迴圈來跑map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("==============================");

//      但是現在我們可以用lambda來跑map，這樣可以讓我們更加簡潔，更加簡單。
        map.forEach((k,v) -> System.out.println(k + ":" + v));

    }

}
