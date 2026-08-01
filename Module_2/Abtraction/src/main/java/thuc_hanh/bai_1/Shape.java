package thuc_hanh.bai_1;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();

    void display() {
        System.out.println("Shape: " + name + ",area: " + this.calculateArea());
    }
}


