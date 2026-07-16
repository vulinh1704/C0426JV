import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Cấu trúc lặp: là cấu trúc cho phép thực hiện lặp lặp đi lặp lại 1 tác vụ dựa trên điều kiện cho trước
        // Lặp cái gì ? Điều kiện lặp ?
        // for , while, do...while

//        for (int i = 1; i <= 1000; i++) {
//            System.out.println(i);
//        }
        // break: khi gặp từ khóa này sẽ ngay lập tức dừng vòng lặp.
        // continue: khi gặp từ khóa này sẽ bỏ lượt lặp hiện tài và chuyển đến lượt lặp tiếp theo

//        for (int i = 0; i < 10; i++) {
//            if(i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

        /*
        while (<dieu_kien_lap>) {
            <khoi_lenh_thu_thi>
        }
        => <dieu_kien_lap> trả về true thì sẽ chay  <khoi_lenh_thu_thi>
        vòng lặp while sẽ phù hợp với những tác vụ không biết trước số lần lặp
         */

//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }

        /*
         Bài tập: Sử dụng while, cho người dùng nhập vào các số nguyên,
         đến khi nào tổng của các số đó lớn 10;
         */
//        Scanner input = new Scanner(System.in);
//        int total = 0;
//        while (total <= 10) {
//            System.out.println("Input a number: ");
//            int number = input.nextInt();
//            total += number;
//        }
//        System.out.println("Total = " + total);

        /*
        do {
          <khoi_lenh>
        } while (<dieu_kien_lap>);

        => Với vòng lặp do...while dù <dieu_kien_lap> true hay false thì cũng chạy ít nhất 1 lần
         */
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++; // 2
//        } while (i >= 10); // 2 >= 10 (false)

        // In ra menu cho người dùng.

//        String menu = "=========== Menu ============\n1.Add\n2.Edit\n0.Exit";
//        Scanner input = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println(menu);
//            System.out.println("Input your choice: ");
//            choice = input.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Add Function");
//                    break;
//                case 2:
//                    System.out.println("Edit Function");
//                    break;
//                case 0:
//                    System.out.println("See you again");
//                    break;
//                default:
//                    System.out.println("No that option");
//
//            }
//        }  while (choice != 0);

        // Một số chú ý khi sử dụng Scanner
        /*
        Khi sử dụng chung 1 đối tượng input nếu cho nhập Int, Boolean hoặc Double sau đó nhập String (nextLine)
        Thì dòng nhập String sẽ tự hiểu là người dùng đang nhập "" + Enter => Bỏ qua dòng nhập String
        Cách xử lý:
        1. Thêm 1 nexLine ở giữa.
                Scanner input = new Scanner(System.in);
                System.out.println("Input a number: "); // 1 > Enter
                int a = input.nextInt();
                input.nextLine(); // "" + Enter
                System.out.println("Input a string: ");
                String str = input.nextLine();
                System.out.println("Your number: " + a);
                System.out.println("Your string: " + str);

        2. Sử dụng 2 đối tượng input riêng 1 cái cho số và 1 cái cho chuỗi. (Khuyên dùng)
                Scanner inputNumber = new Scanner(System.in);
                Scanner inputString = new Scanner(System.in);
                System.out.println("Input a number: "); // 1 > Enter
                int a = inputNumber.nextInt();
                System.out.println("Input a string: ");
                String str = inputString.nextLine();
                System.out.println("Your number: " + a);
                System.out.println("Your string: " + str);
         */

        // Mảng trong Java

    }
}
