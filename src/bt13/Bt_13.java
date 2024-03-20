package bt13;

import java.util.Map;
import java.util.TreeMap;

public class Bt_13 {
    public static void main(String[] args) {
        // Khai báo và khới tạo một đối tượng TreeMap
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        // Đưa các phần tử vào treemap
        treeMap.put(3, "Ba");
        treeMap.put(1, "Một");
        treeMap.put(2, "Hai");
        treeMap.put(4, "Bốn");
        // Lấy giá trị của phần tử nhỏ nhất trong TreeMap

        Map.Entry<Integer, String> firstEntry = treeMap.firstEntry();
        System.out.println("Phần tử nhỏ nhất trong TreeMap:");
        System.out.println("Key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());

    }
}
