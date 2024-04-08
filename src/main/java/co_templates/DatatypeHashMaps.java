// refer : https://www.w3schools.com/java/java_hashmap.asp
import java.util.HashMap;

public class DatatypeHashMaps {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        // 값 넣기
        hashMap.put("England", "London");
        hashMap.put("Germany", "Berlin");
        hashMap.put("Norway", "Oslo");
        hashMap.put("Korea", "Seoul");

        /* Debug Console
         hashMap.size()
        4
        hashMap.remove("Germany")
        "Berlin"
        hashMap.size()
        3
        hashMap
         */

         for(String key:hashMap.keySet()) {
            System.out.println("hashMap value with key : " 
                                + key + ", value : " + hashMap.get(key))  ;
         }
        // hashmap은 순서 상관없이 출력

    }
}
