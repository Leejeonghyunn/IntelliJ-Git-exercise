package randomCalculator;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generator(int num){
        return (int)(Math.random()*num);
    }
}
