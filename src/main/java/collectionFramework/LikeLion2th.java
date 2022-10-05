package collectionFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * 멋사자 2기 학생의 이름이 들어있는 list를 return하는 메서드
 */
public class LikeLion2th {

    private List<String> students = new ArrayList<>();

    public LikeLion2th() {
        this.students.add("강동연");
        this.students.add("강수빈");
    }

    public List<String> getStudentList() {
        return this.students;
    }
}
