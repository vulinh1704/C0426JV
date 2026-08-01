package ly_thuyet;

// final với class thì sẽ không cho phép lớp nào kế thừa
public class TestFinal {
    final String NAME = "Final ly_thuyet.Test";

    // final đi method: không cho phép ghi đè
    final void finalMethod() {
        System.out.println("Final Method");
    }

    void go() {
        final double PI = 3.4;
        // Khởi tạo hằng số;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


//class ly_thuyet.Test extends ly_thuyet.TestFinal {
//    @Override
//    void finalMethod() {
//
//    }
//}


//* Tất cả class trong Java đều được kế thừa từ class Object

