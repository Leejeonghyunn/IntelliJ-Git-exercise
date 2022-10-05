public class UserDao { //Data Access Object

    public void plus(int first, int second) { //인스턴스 메서드

        System.out.println(first + second);
    }

    public void minus(int first, int second) {

        System.out.println(first - second);
    }

    public void multiple(int first, int second) {
        System.out.println(first * second);

    }

    public void divide(int first, int second) {
        System.out.println(first / second);
    }
}

class UserDaoMain{
    public static void main(String[] args) {

        UserDao userDao = new UserDao(); //UserDao 객체 생성 or static 메서드로 변경

        userDao.plus(1,2); //userDao객체가 없기 때문에 UserDao의 메서드를 사용할 수 없어서 에러가 생겼다.
    }
}