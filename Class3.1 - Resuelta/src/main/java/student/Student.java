package student;


import java.util.List;

public class Student {

    private String name;
    private GradeService gradeService;

    public Student(String name, GradeService gradeService){
        this.name = name;
        this.gradeService = gradeService;
    }

    public int calculateGradeAVG(){
        List<Integer> gradesList = gradeService.getStudentGrades();

        int sum = 0;
        for(int i=0;i<gradesList.size();i++){
            sum += gradesList.get(i);
        }

        return sum /gradesList.size();

    }

    public String getName() {
        return name;
    }
}
