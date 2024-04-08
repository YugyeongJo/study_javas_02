import java.util.ArrayList;
import java.util.HashMap;

public class OopCasts {
    public static void main(String[] args) {
        /* Object을 사용하면 error 남.
         ArrayList<Object> listFirst = new ArrayList<>();
        // Array에 값 입력
        listFirst.add("Volvo");
        listFirst.add("3");
        listFirst.add("Ford");
        int index=0;
        for(Object obj:listFirst){
            String temp = obj;
        }
         */
        ArrayList<String> listFirst = new ArrayList<>();
        // Array에 값 입력
        listFirst.add("Volvo");
        listFirst.add("3");
        listFirst.add("Ford");
        int index=0;
        for(String obj:listFirst){
            String temp = obj;
        }
        // arraylist는 object를 사용하지 않고, 값을 명확하게 사용하는게 더 좋음.
        // 오히려 더 복잡해짐. 

        // 넣어줄때에는 object로 넣어주고, 밖으로 뽑아줄때에만 신경써서 casting 해주면 된다. 
        HashMap<String, Object> question = new HashMap<>();
        question.put("문제", "Python에서 변수를 선언하는 방법은? (점수: 10점)");
        question.put("답항", "1) var name, 2) name=value, 3) set name, 4) name == value");
        question.put("사용자답", 3);
        question.put("Cars", listFirst);

        // casting 해주기 위해 question 앞에 ()로 datatype 선언해줌. 
        String strFirst = (String)question.get("문제");
        int intSecond = (int)question.get("사용자답");
        ArrayList<Object> arrayList = (ArrayList<Object>)question.get("Cars")
        System.out.println("Hello Main !");
    }
}