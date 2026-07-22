public class Main {
    public static void main(String[] args) {
        /*
        Đối tượng:
        Là các thực thể cụ thể tạo từ class thông các constructor
        Sử dụng từ new (gọi constructor) -> tạo ra các đối tượng
         */
        Dog d = new Dog("Tommy", "Black");
        // Cách truy xuất thuộc tính và phương thức.
        d.name = "Muc";
        System.out.println("Dog Name: " + d.name);
        d.bark();

        Dog d2 = new Dog("Sam", "Pink");
        d2.bark();

        Dog d3 = new Dog("Bach");
        System.out.println("Color d3: " + d3.color);

        System.out.println(d); // <=> d3.toString() nếu có hàm toString()
    }
}
