package quests;
import java.util.Scanner;
import java.util.HashMap;
public class EncapsulationInputOutput {

    // 값 받기
    public HashMap<String, Integer> input() {   
        HashMap<String, Integer> inputValues = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("intFirst : ");
            int intFirst = scanner.nextInt();
            System.out.print("intSecond : ");
            int intSecond = scanner.nextInt(); 
    
            inputValues.put("intFirst", intFirst);
            inputValues.put("intSecond", intSecond);
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }

        scanner.close();
        return inputValues;
    }

    // 출력하기 
    public void output(int result_Addition, int result_Subtraction, int result_Multiplication, int result_Division, int result_Remainder){   
        System.out.println("Addition result : "+ result_Addition);
        System.out.println("Subtraction result : "+ result_Subtraction);
        System.out.println("Multiplication result : "+ result_Multiplication);
        System.out.println("Division result : "+ result_Division);
        System.out.println("Remainder result : "+ result_Remainder);
    }
}
