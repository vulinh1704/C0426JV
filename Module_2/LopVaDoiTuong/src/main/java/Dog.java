public class Dog { // khuôn mẫu dùng để tạo ra đối tượng cụ thể
    /*
    Thuộc tính:
    + là dữ liệu mà các đối tượng có thể mang.
    + Luôn có giá trị mặc định nếu không xét: String là null, int là 0, double 0.0, boolean: false,..
    */
    String name;
    String color = "No Color"; // set giá trị mặc định

    /*
    Constructor (Hàm tạo)
    + Là 1 hàm đặc biệt giống như một nhà máy nhận vào dữ liệu và tạo ra các đối tượng
    + Cùng tên với class
    + Có thể có nhiều hàm tạo, khi không khai báo thì mặc định sẽ có Dog(){}
    */
    Dog(String nameInput, String colorInput) {
        // this thể hiện cho đối tượng sẽ tạo ra
        this.name = nameInput;
        this.color = colorInput;
    }

    Dog(String name) {
        this.name = name;
    }


    void bark() { // phương thức: là các hành động mà các đối tượng có thể mang
        System.out.println(this.name + " Go Go");
        // this thể hiện cho đối tượng đang sử dụng hàm.
    }

    String run() {
        return "Dog is running";
    }

    void eat(String food) {
        System.out.println(this.name + " eat " + food);
    }

    @Override
    public String toString() {
        return "Dog name = " + this.name + " ,Color = " + color;
    }
}
