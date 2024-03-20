package bt12;
import java.util.Arrays;
import java.util.TreeMap;
public class Search {
        public static void main(String[] args) {
            // Khai báo và khởi tạo mảng các số nguyên
            int[] arr = {5, 2, 8, 10, 3, 1};
            // Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            // Đưa các phần tử của mảng vào TreeMap với giá trị là 0
            for (int num : arr) {
                treeMap.put(num, 0);
            }
            // Lấy giá trị của phần tử lớn nhất trong TreeMap
            int max = treeMap.lastKey();
            // Xóa phần tử lớn nhất khỏi TreeMap
            treeMap.remove(max);
            // Phần tử lớn thứ hai trong TreeMap là phần tử lớn thứ hai trong mảng
            int secondMax = treeMap.lastKey();
            System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondMax);
        }
    }

