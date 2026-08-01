package thuc_hanh.bai_1;

public class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double S = Math.PI * Math.pow(this.radius, 2);
        return S;
    }
}
