package chua_bai.bai_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ning", 2));
        list.add(new Student("Ning01", 5));
        list.add(new Student("Ning02", 4));
        list.add(new Student("Ning03", 7.5));
        list.add(new Student("Ning04", 10));

        Iterator<Student> iterator =  list.iterator();
        System.out.println("Danh sách gốc: ");
        while (iterator.hasNext()) { // 📝 còn phần tử tiếp theo không?
            Student item = iterator.next(); // 📝 lấy phần tử kế tiếp
            System.out.println(item);
        }

        double maxScore = list.get(0).getScore();
        for(Student item: list) {
            if(item.getScore() > maxScore) {
                maxScore = item.getScore();
            }
        }
        System.out.println("Điểm cao nhất là: " + maxScore);

        ArrayList<Student> newList = new ArrayList<>();
        for(Student item: list) {
            if(item.getScore() >= 5) {
               newList.add(item);
            }
        }
        System.out.println("Số lượng sinh viên mới: " + newList.size());
    }
}
