// refer : https://www.w3schools.com/java/java_while_loop.asp

public class LoopsWhiles {
    public static void main(String[] args){

        /*
         while 종료되는 상황 경우의 수
            1) while 내부에 빠져나올 수 있는 사항 만든 경우
            2) if문에서 break를 사용하는 경우

         while (condition) {
            
         }

         */

        // while문 내에서 종료 상황 만들기 
        int count = 0;
        while (count < 10) {
            count = count+1;
            System.out.println("종료 상황 만들기 count : "+count);
        }

        // while 종료 시 break문 같이 사용
        count = 0; // count = true;
        boolean whileFlag = true;
        while (whileFlag) {     // 무한루프
            count = count+1;
            System.out.println("break 같이 사용 count : "+count);
            if (count >= 10) {
                break;
            }
        }

        System.out.println("Hello Main !");
    }
}
