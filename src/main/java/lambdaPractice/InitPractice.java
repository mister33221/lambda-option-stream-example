package lambdaPractice;

//Lambda 的精神來看，我們僅須關注 Runnable 的 input / logic / output
//使用lambd的優點
//語法精簡
//在 Java 中，許多只有一個方法的介面，如果要使用這些介面，往往需要寫個幾行程式碼才能完成，改用 Lambda 後只須短短一兩行
//效能提昇
//有別於一般 new 出物件實體後呼叫的行為，Lambda 在執行時不會 new 出一個物件實體，而是直接將 Lambda 的 body 程式碼存放在記憶體後直接呼叫，ByteCode 長度因此減少，效率提昇


public class InitPractice {

    public static void main(String[] args) {

//        原本我們這樣寫
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run me!");
            }
        };
        myRunnable.run();

        System.out.println("==============================");

//        改用lambda可以精簡成這樣
        Runnable newRunnable = () -> System.out.println("Hello World");
        newRunnable.run();
    }



}
