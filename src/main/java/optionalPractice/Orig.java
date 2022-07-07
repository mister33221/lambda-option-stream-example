package optionalPractice;

import java.util.HashMap;
import java.util.Map;

public class Orig {

    public static void main(String[] args) {
        String nickName = getNickName("william");
        if (nickName == null){
            System.out.println("我是空的");
        }else {
        System.out.println(nickName);
        }

    }


    private static String getNickName(String name) {
        Map<String, String> nickNames = new HashMap<>(); // 假裝的鍵值資料庫
        nickNames.put("Justin", "caterpillar");
        nickNames.put("Monica", "momor");
        nickNames.put("Irene", "hamimi");
        return nickNames.get(name); // 鍵不存在時會傳回null


    }


}
