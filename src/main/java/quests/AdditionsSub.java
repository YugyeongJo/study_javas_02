package quests;
import java.util.Scanner;

public class AdditionsSub {
    public int Additions(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();    

        int result = intFirst + intSecond ; 
        System.out.print("result : "+result);

        scanner.close();
        return result;
    }
    
}
