public class Ifs {
    public static void main(String[] args){
        /* if (condition) {
            else if (condition) {
            else {
            
            }
        */


        /* <- 주석
            예제 : 시간에 따른 영어 인사, and 조건 추가 개선
            Good morning : 6 ~ 11
            Good day : 11 ~ 17
            Good evening : 18 ~ 23
        */

        int hour = 11;
        if (hour <= 11) { // Good morning : 6 ~ 11
            System.out.println("Good morning !");
        } else if (hour <= 17) { // Good day : 11 ~ 17
            System.out.println("Good day !");
        } else { // Good evening : 18 ~ 23
            System.out.println("Good evening !");
        }

        // error : Duplicate local variable hourJava, 해결 Datatype 정리   
        // int hour = 11;
        hour = 24;
        if ((hour >= 6) && (hour <= 11)) { // Good morning : 6 ~ 11
            System.out.println("Good morning !");
        } else if ((hour >= 12) && (hour <= 17)) { // Good day : 12 ~ 17
            System.out.println("Good day !");
        } else if ((hour >= 18) && (hour <= 23)) { // Good evening : 18 ~ 23
            System.out.println("Good evening !");
        } else { 
            System.out.println("Don't know !");
        }
        
        System.out.println("Hello Main !");
    }
}