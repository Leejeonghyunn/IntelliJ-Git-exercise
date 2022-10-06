package randomCalculator;

import java.util.HashMap;
import java.util.Map;

public class MapExcercise2 {
    public static void main(String[] args) {

        String repoAddr = "https://github.com/Leejeonghyunn/IntelliJ-Git-exercise/tree/main/src/main/java";

        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        for (int i = 0; i < repoAddr.length(); i++){
            //깃 주소를 문자 한개씩 받을 변수
            char c = repoAddr.charAt(i);
            //깃 주소를 문자 한개씩 받을 변수
            int num = (int)c;
            //대문자와 소문자 모두 담기위해, 처음 들어오는 값이면 value를 1로 초기화
            if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)
                    && alphabetCnt.get(c) == null ){
                alphabetCnt.put(c, 1);
                //이미 들어온 값이면 value++
            } else if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
                alphabetCnt.put(c, (alphabetCnt.get(c)+1));
            }
        }
        for (Map.Entry<Character,Integer> entry: alphabetCnt.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
