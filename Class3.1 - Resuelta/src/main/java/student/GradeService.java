package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeService {

    public List<Integer> getStudentGrades(){
        List<Integer> grades = new ArrayList<>();
        int max = 5;
        int min = 0;

        Random rand = new Random();

        for (int i =0;i<5;i++){
            int randomNum = rand.nextInt((max - min) + 1) + min;
            grades.add(randomNum);
        }

        return grades;
    }
}
