package cal;

import static cal.Calculate.a;
import static cal.Calculate.b;

class Calculate {

    public static int a = 1;
    public static int b = 2;

    public void plus2(int a, int b) { //인스턴스 메서드

        System.out.println(a + b);
    }

    public void minus2(int a, int b) {

        System.out.println(a - b);
    }

    public void multiple2(int a, int b) {
        System.out.println(a * b);

    }

    public void divide2(int a, int b) {

        float result = (float)a / b; //타입 캐스팅 -> 0.5 정상 출력
        System.out.println(result);
    }
}

class CalculateMain {
    public static void main(String[] args) {

        Calculate cal = new Calculate();

        //정상 작동
        cal.plus2(a, b);
        cal.minus2(a, b);
        cal.multiple2(a, b);
        cal.divide2(a, b);

    }
}
