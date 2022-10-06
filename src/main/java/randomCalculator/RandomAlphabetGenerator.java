package randomCalculator;

public class RandomAlphabetGenerator {
    public char generator() {
        int randomNum =(int)(Math.random() * 25)+65;
        char randomAlpha = (char) randomNum;
        return randomAlpha;
    }
}
