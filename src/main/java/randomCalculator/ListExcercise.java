package randomCalculator;

import java.util.ArrayList;
import java.util.List;

public class ListExcercise {
    private List<String> students;
    public void ListExercise() {
        this.students=new ArrayList<>();
        students.add("김경록");
        students.add("김미지");
        students.add("김민경");
        students.add("김민지");
    }
    public List<String> getStudents(){
        return this.students;
    }
}
