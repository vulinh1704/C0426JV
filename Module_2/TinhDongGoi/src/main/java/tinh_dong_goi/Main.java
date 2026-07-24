package tinh_dong_goi;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        bankAccount.setBalance(-10);
        bankAccount.setBalance(5);
        System.out.println(bankAccount.getBalance());
    }
}



/*
Tính đóng gói:
+ Là 1 tính chất trong OOP
+ Là kỹ data hiding và chỉ cho phép truy cập những thông tin cần thiết.
+ Thể hiện trong code thông qua: Access Modifier.
======================================================================
Access Modifier:
+ là các từ khóa giới hạn phạm vi truy cập của dữ liệu trong class (thuộc tính và phương thức)
+ public, private, default và protected

Tính chất:
+ private: Chỉ sử dụng được trong phạm vi class.
+ public: Có thể sử dụng ở bất cứ đâu trong dự án.
+ default: Sẽ sử dụng khi không khai báo từ khóa nào trước dữ liệu, Chỉ cho phép truy cập trong phạm vị 1 package.
+ protected:
   + Cho phép trong cùng 1 package.
   + Cho phép ngoài package nhưng phải trong mối quan hệ kế thừa (extend)

=======================================================================
+ Get/set: là các phương thức lấy ra / cập nhật dữ liệu của các thuộc tính private
 */