package lambdaPractice;

import lambdaPractice.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//        Stream是Java8的新特性，針對物件集合使用類似SQL語句從數據庫查詢數據，讓程式員得以乾淨、簡潔、高效率的代碼、達到聚合運算的目的。
//        Stream主要分為兩種操作， intermediate operation及 terminal operations，
//        前者常見方法有filter, map, sorted，是屬於惰性操作，可以想像成是資料的處理過程，程式執行到此不會產生新值，
//        需要有後續的terminal operations，常見的方法有 collect、 forEach、 reduce，屬於急性操作，
//        將前段處理後的資料進行收集的動作。區分惰性與急性的原因在於因應複雜操作的需求，我們往往會建構一系列串接的惰性操作，
//        而最後有個急性操作產生最後結果。

public class StreamPractice {

    public static void main(String[] args) {

        System.out.println("filter");
//      建立一個1到10的list
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//      stream() : 將list轉換成stream
//      filter() : 將stream中的數字大於5的數字取出，並且轉換成list
//      最後使用forEach()方法+lambda表示法，將取出的數字印出
        list.stream().filter(i -> i > 5).forEach(System.out::println);


        System.out.println("==============================");
        System.out.println("mapToInt");

//      mapToInt()方法，將list轉換成int型態的stream
        System.out.println(list.stream().mapToInt(s->s).sum());

        System.out.println("==============================");
        System.out.println("map");

//      map : 映射每個元素到對應的結果，並且把結果放到一個新的list中。
//      collect()方法，將stream轉換成一個集合。
        List<String> list2 = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        List<String> list3 = list2.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(list3);

        System.out.println("==============================");
        System.out.println("sorted");

//      sorted : 排序，並且把結果放到一個新的list中。
//      sorted會先依照natrule order排序，如果沒有指定排序方式，則預設是升序。
        List<String> list4 = Arrays.asList("a","k","c","d","e","f","g","h","i","j");
        List<String> list5 = list4.stream().sorted().collect(Collectors.toList());
        System.out.println(list4);
        System.out.println(list5);

        List<Product> productList = Arrays.asList(
                new Product("Apple", 100, 10),
                new Product("Banana", 200, 20),
                new Product("Orange", 300, 30),
                new Product("Watermelon", 400, 40),
                new Product("Pear", 500, 50),
                new Product("Grape", 600, 60),
                new Product("Pineapple", 700, 70),
                new Product("Strawberry", 800, 88),
                new Product("Cherry", 900, 90)
        );
        productList.stream().sorted((p1, p2) -> p1.getPrice() - p2.getPrice()).forEach(result -> System.out.println(result.getName()));
        System.out.println("------------------------------");
        productList.stream().sorted((p1, p2) -> p2.getPrice() - p1.getPrice()).forEach(result -> System.out.println(result.getName()));

        System.out.println("==============================");
        System.out.println("reduce");

//      reduce : 將stream中的元素進行聚合，並且把結果放到一個新的值中。
//      可以接收三個參數，第一個參數是初始值，第二個參數是一個函數，第三個參數是一個函數，
//      函數的內容是用來將兩個值進行聚合的。
        int sum = list.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);

        System.out.println("==============================");

    }

}
