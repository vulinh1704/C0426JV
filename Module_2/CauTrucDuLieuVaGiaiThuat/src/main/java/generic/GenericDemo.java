package generic;

public class GenericDemo<G> {
    private G giaTri;

    public void set(G giaTri) {
        this.giaTri = giaTri;
    }

    public G get() {
        return giaTri;
    }
}


class Main {
    public static void main(String[] args) {
        GenericDemo<Integer> g = new GenericDemo<>();
        g.set(1);
        System.out.println(g.get());

        GenericDemo<String> gStr = new GenericDemo<>();
        gStr.set("Test");
        System.out.println(gStr.get());

        /*
        int a = 10;
        // Kiểu nguyên thủy

        Integer a1 = 10;
        // Kiểu Wrapper là 1 class đại diện cho kiểu dữ liệu nguyên thủy tương ứng.
        // có thể có các hàm đem ra sử dụng 1 cách tiện lợi và tương thích với cơ chế Generic

         */
    }
}
