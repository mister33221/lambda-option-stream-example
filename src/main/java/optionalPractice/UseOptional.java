package optionalPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UseOptional {

    public static void main(String[] args) {

        Optional<String> nickNameOptional = getNickNameOptional("william");
        String nickName;
//        isPresent : 如果有值，則回傳true，否則回傳false
        if (nickNameOptional.isPresent()) {
            nickName = nickNameOptional.get();
        } else {
            nickName = "我是空的";
        }
        System.out.println(nickName);

    }

    private static Optional<String> getNickNameOptional(String name) {
        Map<String, String> nickNames = new HashMap<>(); // 假裝的鍵值資料庫
        nickNames.put("Justin", "caterpillar");
        nickNames.put("Monica", "momor");
        nickNames.put("Irene", "hamimi");

        String nickName = nickNames.get(name);

        if (nickName == null) {
//          如果這個potional是空的 則回傳一個空的optional
            return Optional.empty();
        } else {
//          如果這個optional不是空得 則把這個值放到optional裡面回傳
            return Optional.of(nickName);
        }
    }

}
