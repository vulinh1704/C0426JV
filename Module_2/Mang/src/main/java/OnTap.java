public class OnTap {
    public static void main(String[] args) {
//        int[] scores = {8, 7, 9, 6, 10};
//
//        for(int element: scores) {
//            System.out.println(element);
//        }

//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("scores[" + i + "] = " + scores[i]);
//        }

        showHello();
        String message = getMessage("Ning");
        System.out.println(message);
    }

    static String getMessage(String name) {
        String result = "Hello " + name;
        return result;
    }

    static void showHello() {
        System.out.println("Hello world");
    }

    /*
    static <kieu_du_lieu_tra_ve> <ten_ham>(<danh_sach_tham_so_truyen_vao>) {
            <Khoi_lenh_thu_thi>
            return <gia_tri_tra_ve>;
    }

    <ten_ham>(<doi_so>);
     */
}
