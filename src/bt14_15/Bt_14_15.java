package bt14_15;
import java.util.*;
public class Bt_14_15 {
        public static void main(String[] args) {
            //Khởi tạo TreeMap với comparator reverseOrder()
            TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());

            //Thêm các phần tử vào TreeMap
            treeMap.put(3, "Ba");
            treeMap.put(1, "Một");
            treeMap.put(2, "Hai");
            treeMap.put(4, "Bốn");

            //In ra các phần tử của treemap
            System.out.println("Các phần tử của TreeMap được sắp xếp theo thứ tự giảm dần của giá trị:");
            for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // BT15

            //In ra TreeMap để kiểm tra
            System.out.println("TreeMap ban đầu:");
            System.out.println(treeMap);

            //Thực hiện xóa bằng phương thức remove()
            int keyToRemove = 2;
            treeMap.remove(keyToRemove);

            //In ra để kiểm tra sau khi xóa
            System.out.println("TreeMap sau khi xóa phần tử có key = " + keyToRemove + ":");
            System.out.println(treeMap);
        }
    }


