package quests;
import java.util.Scanner;

public class ForsIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("input number : ");
        int inputnumber = scanner.nextInt();

        // for (int count = 1 ; count <= inputnumber ; count = count + 1){
        for (int count = 0 ; count <= inputnumber ; count ++){
            int result = (int)Math.pow(2, count); // 지수연산
            int rest_result = result%4;
            if(rest_result==0) { // 나머지가 0일때 
                System.out.println("2**"+count+"="+result);
            } else { // 나머지가 0이 아닐때
                System.out.println("4의 배수가 아닙니다.");
            }
        }
        scanner.close();
    }    
}
