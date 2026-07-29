
/*
 Thuộc tính và phương thức của lớp là các dữ liệu chung giữa các đối tượng được ta từ lớp đó.
 Trong Java để tạo ra được thuộc tính và phương thức CỦA LỚP thì sử dụng từ khóa "static".
 Khi khai báo static ta có thể sử dụng tên lớp để truy xuất
*/

public class Student {
    String name; // thuộc tính của các đối tuơng
    static int totalStudents = 0;

    Student(String name) {
        this.name = name;
        totalStudents++;
    }

    void showName() { // Phương thức của các đối tượng
        System.out.println("Student Name: " + this.name);
    }

    static void showTotal() {
        // Trong phương thức static chi có thể gọi đến thuộc tính static
        System.out.println("Total Student is " + totalStudents);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ning");
        System.out.println(s1.name);
        s1.showName();
        Student s2 = new Student("Jack");
        System.out.println(s2.name);
        Student s3 = new Student("J97");

        System.out.println(Student.totalStudents);
        Student.showTotal();
    }
}