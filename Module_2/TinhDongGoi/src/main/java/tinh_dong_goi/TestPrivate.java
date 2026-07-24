package tinh_dong_goi;

// public sử dụng với class thể hiện cho việc export class cho phép nơi khác có thể sử dụng được
// pulic với class thì chỉ có 1 trong 1 file java và class đó phải trùng tên file.
public class TestPrivate {
    private String name;

    private TestPrivate() {
    }

    private void go() {
        System.out.println("Go Go");
    }

    public static void main(String[] args) {
        TestPrivate testPrivate = new TestPrivate();
        System.out.println(testPrivate.name);
        testPrivate.go();
    }
}


//class Test {
//
//    public static void main(String[] args) {
//        TestPrivate testPrivate = new TestPrivate();
//        System.out.println(testPrivate.name);
//        testPrivate.go();
//    }
//}