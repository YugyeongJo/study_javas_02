package quests;
import java.util.Scanner;
import java.util.ArrayList;

public class pollsWithoutDB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // question
            ArrayList<String> questionlist = new ArrayList<String>();
            questionlist.add("1. 인터스텔라 선호도");
            questionlist.add("2. 해리포터 선호도");
            questionlist.add("3. 귀찮아ㅠ 선호도");
        // option
            ArrayList<String> optionlist = new ArrayList<String>();
            optionlist.add("1) 좋음 2) 중간 3) 나쁨");
        // answer
            ArrayList<String> answerlist = new ArrayList<String>();

        // for-loop
            for (int i = 0; i < questionlist.size(); i++) {
                System.out.println(questionlist.get(i));
                System.out.println(optionlist);
                String answer = scanner.nextLine();
                answerlist.add(answer);
            }
            System.out.println(answerlist);




        // answer
        answerlist = new ArrayList<String>();       

        // for-each
            for (String str:questionlist) {
                System.out.println(str);
                System.out.println(optionlist);
                String answer = scanner.nextLine();
                answerlist.add(answer);
            }
            System.out.println(answerlist);

    }
}
