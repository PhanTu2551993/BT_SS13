package bt1;

import java.util.HashMap;

public class Count {
    public static void main(String[] args) {
        //Khai báo mảng các phần tử
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 5, 1};
        //Tạo HashMap để lưu trữ số lần xuất hiện của từng phần tử
        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();

        // Duyệt qua từng phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            // Kiểm tra xem phần tử đã có trong HashMap hay chưa
            if (occurrenceMap.containsKey(element)) {
                // Nếu đã có, tăng số lần xuất hiện lên 1
                occurrenceMap.put(element, occurrenceMap.get(element) + 1);
            } else {
                // Nếu chưa có, thêm phần tử vào HashMap với số lần xuất hiện ban đầu là 1
                occurrenceMap.put(element, 1);
            }
        }
        //Duyệt qua các phần tử trong HashMap và in ra số lần xuất hiện của từng phần tử
        for (Integer key : occurrenceMap.keySet()) {
            System.out.println("Phần tử " + key + " xuất hiện " + occurrenceMap.get(key) + " lần");
        }
    }
}
