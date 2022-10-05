package cal;

/**
 * 1. Interface를 생성하고
 * 2. Interface를 구현한 class를 만들고
 * 3. Interface를 멤버 변수로 class에 선언하고
 * 4. class를 인스턴스화 시킬 때 Interface구현체를 new 해서 DI 해준다.
 */

public class RandomCalculator  {

    private int firstNum;

    public RandomCalculator() {

    }
    public  int getRandomNumber() {

        for(int k = 0; k < 9; k++){
            k = (int)(Math.random() * 1);
        }
        return 0;
    }
    public void plus3(int firstNum) {

        System.out.println(firstNum + getRandomNumber());
    }

    public  void minus3(int firstNum) {
        System.out.println(firstNum - getRandomNumber());
    }

    public  void multiple3(int firstNum) {
        System.out.println(firstNum * getRandomNumber());
    }

    public  void divide3(int firstNum) {
        float result = (float) firstNum / getRandomNumber();
        System.out.println(result);
    }
}

class TestCalculator{
    public static void main(String[] args) {

        RandomCalculator cal2 = new RandomCalculator();

        cal2.plus3(5);
        cal2.minus3(5);
        cal2.multiple3(5);
        cal2.divide3(5);



    }
}
