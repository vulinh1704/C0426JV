package thuc_hanh;

public class Calculator {
    private String name;

    Calculator() {
    }

    public Calculator(String name) {
        this.name = name;
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

/*
Overload Phương thức là các phương trong cùng MỘT class:
+ Cùng tên.
+ Khác tham số truyền vào (Kiểu dữ liệu or số lượng)*
+ Có thể khác giá trị trả về.

=> Thể hiện cho đa hình lúc biên dịch.
 */

class Test {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(1, 2); // dựa vào tham số truyền vào để biết được sẽ gọi đến hàm nào.
        cal.add(3.2, 3.4);
    }
}