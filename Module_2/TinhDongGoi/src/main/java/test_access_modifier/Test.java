package test_access_modifier;

import tinh_dong_goi.TestDefault;
import tinh_dong_goi.TestProtected;
import tinh_dong_goi.TestPublic;

public class Test extends TestProtected {

    public static void main(String[] args) {
//        TestPublic t = new TestPublic();
//        System.out.println(t.name);
//        t.go();

//        TestDefault testDefault = new TestDefault(); // Error vì khác package
//        System.out.println(testDefault.name);
//        testDefault.go();
    }

    public void layName() {
        System.out.println(this.name);
    }
}
