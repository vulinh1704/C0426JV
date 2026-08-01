package thuc_hanh.bai_1;

public class Retangle extends Shape{
    double width;
    double height;

    public Retangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double S = this.width * this.height;
        return S;
    }
}
