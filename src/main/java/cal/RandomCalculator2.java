package cal;

/**
 * interface NumberCreator를 구현한 클래스
 */
class RandomNumberCreator implements NumberCreator{

    public int getNum() {
        return (int) (Math.random() * 10);
    }
}

class Calculator{
    protected final int firstNum;
    protected final int inputNum;

    public Calculator(int firstNum, int inputNum) {
        this.firstNum = firstNum;
        this.inputNum = inputNum;
    }

    public void allResult() {
        System.out.println("firstNum = " + firstNum + ", 생성된 랜덤 숫자 inputNum = " + inputNum);
        System.out.println("firstNum + inputNum = " + (firstNum + inputNum));
        System.out.println("firstNum - inputNum = " + (firstNum - inputNum));
        System.out.println("firstNum * inputNum = " + (firstNum * inputNum));

        try {
            double result = ((double) firstNum / inputNum);

            if (Double.isInfinite(result) || Double.isNaN(result)) {
                throw new ArithmeticException();
            }
            System.out.println("firstNum / inputNum = " + ((double) firstNum / inputNum));
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("=====================");
    }
}

public class RandomCalculator2 extends Calculator {

    public RandomCalculator2(int firstNum, RandomNumberCreator nc) {
        super(firstNum, nc.getNum());
    }
}

class CalculatorMain{
    public static void main(String[] args) {
        Calculator randomCalculator = new RandomCalculator2(4, new RandomNumberCreator());
        randomCalculator.allResult();
    }
}