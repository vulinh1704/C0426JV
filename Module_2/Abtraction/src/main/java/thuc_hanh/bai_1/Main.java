package thuc_hanh.bai_1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Tron", 4.5);
        Shape rec = new Retangle("Tron", 4.5, 2.1);
        Shape[] shapes = {circle, rec};

        for (Shape item : shapes) {
            item.display();
        }
    }
}
