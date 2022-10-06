package randomCalculator.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        // 중복을 허용X -> 똑같은거 두번 넣으면 하나는 걍 무시
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김경호");

        System.out.println(set1); // 두개값만 출력

        // -> 리스트에 있는 중복 데이터를 제거 하고 싶을 때,
        // set에 넣어버리면 된다!


    }
}