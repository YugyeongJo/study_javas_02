package quests;
import java.util.Scanner;

public class WhilesIfsBreak {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean whileFlag = true;
        while (whileFlag) {
            System.out.print("점수를 입력해주세요.(종료를 원하면 -1을 입력해주세요) : ");
            int Score = scanner.nextInt();
            if (Score == -1) {
                System.out.print("프로그램이 종료됩니다.");
                break;
            } else {
                if (Score >= 90) {
                    System.out.println("A학점 입니다."); 
                } else if (Score >= 80) {
                    System.out.println("B학점 입니다."); 
                } else if (Score >= 70) {
                    System.out.println("C학점 입니다."); 
                } else {
                    System.out.println("F학점 입니다."); 
                }
            }
        }
        scanner.close();
    }
}
