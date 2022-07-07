package optionalPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FurtherUseOptional {

    public static void main(String[] args) {
        Optional<String> nickNameOptional = getNicekNameOptional("Justin");
        System.out.println(nickNameOptional.orElse("我是空的"));
    }

    private static Optional<String> getNicekNameOptional(String name) {
        Map<String, String> nickNames = new HashMap<>(); // 假裝的鍵值資料庫
        nickNames.put("Justin", "caterpillar");
        nickNames.put("Monica", "momor");
        nickNames.put("Irene", "hamimi");

        String nickName = nickNames.get(name);

//        ofNullable:如果nicke有值，則回傳一個帶值的optional，否則回傳一個空的optional
        return Optional.ofNullable(nickName);
    }

}
