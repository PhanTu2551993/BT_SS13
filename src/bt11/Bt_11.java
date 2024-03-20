package bt11;
import java.util.Arrays;
import java.util.TreeMap;
public class Bt_11 {
        public static void main(String[] args) {
            //Khai báo và khởi tạo mảng các phần tử nguyên
            int[] array = {5, 2, 9, 1, 7};
            //Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            //Sắp xếp mảng và đưa các phần tử vào TreeMap
            Arrays.sort(array); // Sắp xếp mảng theo thứ tự tăng dần
            for (int num : array) {
                treeMap.put(num, 0);
            }

            //In ra các phần tử trong TreeMap (đã được sắp xếp theo thứ tự tăng dần của khóa)
            System.out.println("Các phần tử sau khi sắp xếp và lưu trữ trong TreeMap:");
            for (int key : treeMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
            }
        }
    }

