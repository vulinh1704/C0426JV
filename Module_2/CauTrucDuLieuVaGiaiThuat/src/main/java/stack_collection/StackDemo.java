package stack_collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("Ning");
        myStack.push("Đạt");
        myStack.push("Hưng");
        myStack.push("Hiếu");
        myStack.push("Lân");

        System.out.println(myStack.peek()); // Lấy ra phần tử cuối cùng được thêm nhưng không xóa.
        System.out.println(myStack.peek()); // Lân
//        System.out.println(myStack.pop()); // Lân
//        System.out.println(myStack.pop()); // Hiếu
//        System.out.println(myStack.pop()); // Hưng
//        System.out.println(myStack.pop()); // Đạt
//        System.out.println(myStack.pop()); // Ning

//        for(String item: myStack) {
//            System.out.println(item);
//        }
    }
}
