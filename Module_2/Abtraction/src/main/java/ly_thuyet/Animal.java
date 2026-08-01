package ly_thuyet;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Phương thức abstract phải nằm trong class abstract
    public abstract void makeSound();

    public abstract void go();
}

/*
Abstract class là 1 class được khai báo với từ khóa abstract.
+ Có thuộc tính, constructor và phương thức như 1 class bình thường nhưng Abstract class không thể khởi tạo đối tượng
+ Có thể có các phương thức trừu tượng (là các phương thức được khai báo với từ khóa abstract và KHÔNG CÓ PHẦN THÂN);
+ Khi 1 class non-abstract kế 1 class abstract thì phải triển khai tất cả các phương thức trừu tượng.
+ Phù hợp với viêc thiết kế các thư viện, các module có sẵn để có thể dễ dàng sử dụng.
+ Abstract không đi được với final.
 */

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Wolf!");
    }

    @Override
    public void go() {
        System.out.println("ly_thuyet.Dog is going!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void go() {
        System.out.println("ly_thuyet.Cat is going!");
    }


}

class Main {
    public static void main(String[] args) {
        // ly_thuyet.Animal a = new ly_thuyet.Animal("Tom"); // Lỗi

        Dog dog = new Dog("Mực");
        dog.go();
        dog.makeSound();

        Animal animal = new Cat("Tom");
        animal.go();
        animal.makeSound();
    }
}