package randomCalculator.RandomNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();

        Set<Character> result = new HashSet<>();

        for (int i = 0 ; i < 50 ; i ++ ) {
            result.add(randomAlphabetGenerator.generator());
        }

        System.out.println(result);
    }
}
