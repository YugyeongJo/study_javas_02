public class DataTypeStrings {
    public static void main(String[] args){
        String strFirst = "Hello !";
        String strSecond = new String("Hello !");
        // strFirst instanceof String
        // true
        // strSecond instanceof String
        // true

        // strSecond instanceof String
        // true
        // strFirst.length()
        // 7
        // strSecond.length()
        // 7
        // strSecond.concat(strFirst)
        // "Hello !Hello !"
        // strFirst.replaceAll("l", "R")
        // "HeRRo !"
        // System.out.println(strFirst);
    }
}
