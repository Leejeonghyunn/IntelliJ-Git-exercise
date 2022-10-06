package randomCalculator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {

        // 랜덤 숫자 생성 객체 생성
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        // 랜덤 숫자가 들어갈 리스트 생성
        List<Integer> randomNumber = new ArrayList<>();

        // 랜덤 숫자 객체의 메소드 사용해서 리스트에 숫자 입력
        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generator(10);
            randomNumber.add(r);
        }

        // 리스트 숫자 확인
        System.out.println(randomNumber);

        // 중복 제거를 위한 set 생성
        Set<Integer> withoutD = new HashSet<>();

        // 리스트의 숫자를 set에 입력
        for (int i = 0; i < 50; i++) {
            withoutD.add(randomNumber.get(i));
        }
        // 중복이 제거된 set 출력
        System.out.println(withoutD);
    }
}