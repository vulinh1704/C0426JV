import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        /*
         + Cấu trúc điều kiện: là cấu trúc cho phép chương trình
         lựa chọn khối lệnh cần thực thi điều kiện cho trước.
         + Trong Java thì hỗ trợ: if...else và switch...case

         // if
        boolean isSick = true;
        if(isSick) { // <dieu_kien> trong if chỉ được phép là giá trị boolean
            System.out.println("Nghi khoe");
        }
        // or
        int score = 10;
        if(score > 7) {
            System.out.println(score + " > 7");
        }

        // if ... else
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int score = input.nextInt();
        if(score >= 5) {
            System.out.println("Pass");
        } else {
            System.out.println("No Pass");
        }

        // if bậc thang => phù hợp cho những bài toán cần bắt nhiều trường hợp khác nhau.
        Scanner input = new Scanner(System.in);
        System.out.println("Input your avg score: ");
        double score = input.nextDouble();
        if(score >= 8) {
            System.out.println("Gioi");
        } else if(score >= 6) {
            System.out.println("Kha");
        } else if(score >= 5) {
            System.out.println("Trung Binh");
        } else {
            System.out.println("Yeu");
        }
         */

        // switch...case là cấu trúc điều kiện để bắt nhiều trường hợp nhưng chỉ sử dụng được với so sánh bằng;
        // nên sử dụng khi điều kiện nhiều và là so sánh bằng, khối lệnh thực thi ít
        // Nếu không có từ khóa break mà vào được case đó thì câu lệnh sẽ thực thi đến khi gặp từ khóa break hoặc hết câu lệnh.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input a number: ");
//        int number = input.nextInt();
//        switch (number) {
//            case 1: // <=> if(number == 1) {
//                System.out.println("Chu Nhat");
//                break;
//            case 2: // <=> else if(number == 2) {
//                System.out.println("Thu High");
//                break;
//            case 3:
//                System.out.println("Thu Bar");
//                break;
//            default: // else
//                System.out.println("Khong co thu nay");
//        }
    }
}
