package randomCalculator;

import java.util.HashMap;
import java.util.Map;

/**
 * string의 알파벳 하나씩 출력하기 + isAlphabet()기능 추가 + map에 개수 세어 넣는 기능 추가
 */
public class AlphabetCnt {
    static boolean isAlphabet(char c){
        if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
            return false;
        }return true;
    }


    public static void main(String[] args) {
        String str = "so what".toUpperCase();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        for(char c = 'A'; c < 'Z'; c ++){
            alphabetMap.put(c, 0);
        }

        for (int i =0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i+"번째 알파벳은 "+ ch + "입니다.");
            if (isAlphabet(ch)){ //isAlphabet(char c) 가 true이면,
                int value = alphabetMap.get(ch); //c의 value값 반환
                value += 1;
                alphabetMap.put(ch, value);
            }
            /**
             * if (isAlphabet(str.charAt(i))){
             *             System.out.println(str.charAt(i)+"은 알파벳입니다.");
             *             }else{
             *              System.out.println(str.charAt(i)+"은 알파벳이 아닙니다.");
             *    };
             */
        }

        System.out.println(alphabetMap);
    }
}
