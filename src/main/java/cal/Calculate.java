package cal;
/**
 * 계산기 출력
 */
public class Calculate {

    //public static int a,b;
    private int a,b;

    //생성자 - alt + insert
    public Calculate(int a, int b) { //생성자 : 값을 클래스 안쪽으로 넣어주고 싶을 때 사용
        this.a = a;
        this.b = b;
    }

    //메서드
    public void plus2() { //인스턴스 메서드 : 생성자 생성하면 매개변수 지워야함

        System.out.println(a + b);
    }
    public void minus2() {

        System.out.println(a - b);
    }
    public void multiple2() {
        System.out.println(a * b);

    }
    public void divide2() {

        float result = (float)a / b; //타입 캐스팅 -> 0.5 정상 출력
        //float result = a/b; -> 타입 캐스팅 하지 않음 -> int로 연산되기 때문에 0.0출력
        System.out.println(result);
    }
}

class CalculateMain {
    public static void main(String[] args) {

        Calculate cal = new Calculate(10,20);

        //정상 작동
        cal.plus2();
        cal.minus2();
        cal.multiple2();
        cal.divide2(); // 0.5 출력
    }
}
