package student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {

        System.out.println("Entre el nombre del estudiante que necesita saber su nota promedio");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        GradeService gradeService = new GradeService();
        Student student = new Student(name, gradeService);

        System.out.println("La nota promedio es de: " + student.calculateGradeAVG());
    }
}
