package map_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1112, "Ning"); // Thêm 1 entry (1 cặp key - value)
        map.put(22312, "Đạt");
        map.put(3322, "Hiếu");

        map.put(1112, "Vũ Ning"); // Sửa value dựa vào key
        System.out.println(map.get(1112)); // Lấy ra map.get(key);

        map.remove(1112); // xóa 1 entry với key
        // Set: là 1 cấu trúc dữ liệu tập hợp: các phần tử bên trong phải là duy nhất/
        // Lấy ra danh sách keys
        Set<Integer> keys = map.keySet();

        for(Integer item: keys) {
            System.out.println("Key: " + item + "; Value: " + map.get(item));
        }
    }
}
