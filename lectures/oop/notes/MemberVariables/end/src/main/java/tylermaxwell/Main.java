package lectures.oop.notes.MemberVariables.end.src.main.java.tylermaxwell;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Josh";
        student.assignments_completed[0] = "FirstJavaProgram";

        System.out.println(student.name);
        System.out.println(student.assignments_completed);
        System.out.println(Arrays.toString(student.assignments_completed));
        System.out.println(student.assignments_completed.length);
    }
}