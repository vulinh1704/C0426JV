package client; // package: nếu class nằm trong 1 package nào đó thì cần được khai báo ở đầu file.

import food.cake.Cake; // import: sử dụng class ở package khác.

import java.util.Date;
import java.util.List; // thư viện được cấp sẵn

public class Customer {
    Cake cake;
    List<Integer> list;
    Date date;
}
