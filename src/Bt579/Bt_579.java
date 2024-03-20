package Bt579;

import java.util.*;

public class Bt_579 {
        public static void main(String[] args) {
            // Khai báo và khởi tạo HashMap
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("apple", 50);
            hashMap.put("banana", 20);
            hashMap.put("orange", 30);
            hashMap.put("grape", 40);

            // Tạo danh sách các cặp key-value từ HashMap
            List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

            // Sắp xếp danh sách các phần tử theo giá trị tăng dần
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            // In ra các phần tử và giá trị của chúng theo thứ tự tăng dần
            System.out.println("Danh sách các phần tử của HashMap được sắp xếp theo giá trị tăng dần:");
            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + ": " + entry.getValue());

            }

            //    BT7

                // Khai báo một HashMap mới và sao chép từ HashMap gốc
                HashMap<String, Integer> copiedHashMap = new HashMap<>();
                copiedHashMap.putAll(hashMap);

                // Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa
                System.out.println("HashMap gốc: " + hashMap);
                System.out.println("HashMap đã sao chép: " + copiedHashMap);

            //   BT9

            String keyToCheck = "apple";
            if (hashMap.containsKey(keyToCheck)) {
                System.out.println("Phần tử \"" + keyToCheck + "\" tồn tại trong HashMap.");
            } else {
                System.out.println("Phần tử \"" + keyToCheck + "\" không tồn tại trong HashMap.");
            }

        }


}
