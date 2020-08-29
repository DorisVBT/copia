package student;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentTests {

    @Test
    public void testStudentAVG(){
        //Arrange
        //GradeService gradeService = new GradeService();
        GradeService gradeService = mock(GradeService.class);
        List<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(5);
        grades.add(5);
        when(gradeService.getStudentGrades()).thenReturn(grades);
        Student student = new Student("Juan", gradeService);

        //Act
        int gradesAVG = student.calculateGradeAVG();

        //Assert
        Assert.assertEquals(gradesAVG, 5);
    }
}
