package tinh_dong_goi;

public class BankAccount {
    // Khi không có gì đặc biệt thì các thuộc tính nên để private.
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    // phương thức get để public
    public double getBalance() {
        return this.balance;
    }

    // Phương thức set để public
    public void setBalance(double amount) {
        if(amount < 0) {
            System.out.println("Số tiền nạp không được âm");
        } else {
            this.balance += amount;
        }
    }
}
