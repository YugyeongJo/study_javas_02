// 외부 입력을 받을 수 있는 것 = Scanners
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();
        
        //nextInt() = input 같은거

        scanner.close();
    }

        
}