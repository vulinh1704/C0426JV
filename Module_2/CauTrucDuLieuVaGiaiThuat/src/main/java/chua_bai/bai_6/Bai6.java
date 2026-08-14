package chua_bai.bai_6;
import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        String str = "Tôi Tôi Chào Bạn Nhé Hi Hi Hô Ha ..";
        String[] strArr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String item: strArr) {
            if(map.get(item) == null) { // thêm từ vào map với số lượt là 1 nếu chưa có
                map.put(item, 1);
            } else { // nếu có rồi thì tăng lượt và cập nhật lại
                int count = map.get(item);
                count++;
                map.put(item, count);
            }
        }
        Set<String> keys = map.keySet(); // danh sách key
        for(String item: keys) {
            System.out.println("Key: '" + item + "' xuất hiện: " + map.get(item) + " lần");
        }


    }
}
