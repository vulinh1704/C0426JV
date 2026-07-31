package ly_thuyet;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }
}
