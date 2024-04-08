// refer : https://www.w3schools.com/java/java_type_casting.asp
import java.util.Scanner;

public class TypeCastIntegers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 두 개의 값 받기
        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();

        int intFirst = Integer.parseInt(strFirst);
        int intSecond = Integer.parseInt(strSecond);
        
        /*  Debug Console
        strFirst + strSecond
        "12"
        intFirst + intSecond
        3
        */
        
        scanner.close();
    }
}
