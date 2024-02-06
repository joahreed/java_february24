package lectures.oop.notes.MemberVariables.end.src.main.java.tylermaxwell;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "JoshL";
        student1.assignments_completed[0] = "FirstJavaProgram";
        student1.assignments_completed[1] = "Cafe Java";

        Student student2 = new Student();

        // System.out.println(student.name);
        // System.out.println(student.assignments_completed);
        System.out.println(Arrays.toString(student1.assignments_completed));
        // System.out.println(student.assignments_completed.length);
    }
}