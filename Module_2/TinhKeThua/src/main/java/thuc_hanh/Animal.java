package thuc_hanh;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Main {
    public static void main(String[] args) {
        // Dog dog = new Dog("Dog 01");

        // Kiểu dữ liệu của lớp cha tham chiều đến đối tượng của lớp con.
        Animal dog = new Dog("Dog 01");
        /*
        Kiêu khai báo: Animal
        Kiểu thực tế: Dog
        => Khi gọi phương thức sẽ luôn dựa vào kiểu thực tế
        => Nếu có ghi đè thì sẽ gọi theo phương thức được cập nhật mới nhất
        => Đa hình lúc runtime (thể hiện qua override phương thức)
         */
        dog.makeSound();
        // Animal is making a sound. (Sai)
        // Woof! (Đúng)

        Animal cat = new Cat("Cat 01");
    }
}
