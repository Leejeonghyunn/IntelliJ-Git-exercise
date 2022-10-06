package collectionFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * 멋사자 2기 학생의 이름이 들어있는 list를 return하는 메서드
 * 1. List를 생성하고 우리반 90명의 이름을 모두 넣는다.
 * 2. List를 생성하고 우리반 90명의 이름, 반, 깃 주소 3가지를 Student에 담아서 List에 넣는다
 */
public class LikeLion2th {

    private List<String> students = new ArrayList<>(); //List 생성
    //멤버변수는 외부에서 접근할 수 없게 private로 걸어준다.

    public LikeLion2th() { //생성자
        this.students.add("강동연");
        this.students.add("강수빈");
    }

    public List<String> getStudentList() {
        return this.students;
    }
}
