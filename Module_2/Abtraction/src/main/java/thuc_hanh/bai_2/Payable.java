package thuc_hanh.bai_2;

public interface Payable {
    double calculatePayment();

    /*
    Bổ sung từ bản Java 8
    cho phép các class con dùng mà không cần override
     */
    default void printReceipt() {
        System.out.println("Payment: " + calculatePayment());
    }
}
