package chua_bai.bai_2;

import chua_bai.bai_1.Student;

public class Main {
    public static void main(String[] args) {
        Generic_Box<String> box = new Generic_Box<>();
        box.setValue("Tôi học về generic");
        Generic_Box<Integer> boxInt = new Generic_Box<>();
        boxInt.setValue(1);
        Generic_Box<Student> boxStudent = new Generic_Box();
        boxStudent.setValue(new Student("Ning", 10.0));
        System.out.println(box.getValue());
        System.out.println(boxInt.getValue());
        System.out.println(boxStudent.getValue());
    }
}
