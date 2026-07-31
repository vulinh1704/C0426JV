package ly_thuyet;

public class Dog extends Animal {
    String color;

    public Dog(String name, String color) {
        super(name);
        // super gọi đến constructor của lớp cha để lấy dữ liệu khai báo từ lớp cha
        this.color = color;
    }

    void bark() { // có thể khai báo thêm thuộc tính và phương thức mới
        System.out.println(this.name + " is barking");
    }

    @Override
    void eat() {
        System.out.println(this.name + " has " + this.color + " is eating");
    }

    void party() {
        super.eat(); // super: trỏ đến thuộc tính và phương thức của class cha
        System.out.println("Lien hoan de");
    }
}

/*
Ghi đè phương thức (Override):
+ Xảy ra trong mối quan hệ kế thừa.
+ Là các phương thức cùng tên, cùng tham số truyền vào, cùng giá trị trả về.
+ Có thể khác logic bên trong.
* Access Modifier của class con phải lớn hơn class cha
*/


class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom", "Black");
        System.out.println(dog.name);
        dog.eat();
//        dog.bark();
//        dog.party();
    }
}