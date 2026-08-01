package ly_thuyet;

/*
Interface: là 1 bản thiết kế của các class mô tả 1 tập hợp tính năng.
+ Có các phương thức trừu tượng (mặc định là public abstract.
+ Khi 1 class thường triển khai interface sẽ phải triển khai tất cả phương thức trong interface đó.
+ Không thể khởi tạo đối tượng từ interface.
 */
public interface VatTheBay {
    public abstract void bay();
    void showName();
}

class Chim implements VatTheBay {
    @Override
    public void bay() {

    }

    @Override
    public void showName() {

    }
}

class MayBay implements VatTheBay {

    @Override
    public void bay() {

    }

    @Override
    public void showName() {

    }
}

class Test {
    public static void main(String[] args) {
        VatTheBay vtb = new Chim();
        vtb = new MayBay();
    }
}

/*
Khi cần trừu tượng mà mối quan hệ là is-a thì nên sử dụng Abstract class.
Khi cần trừu tượng mà mối quan hệ là can-do th nên sử dụng Interface.
 */