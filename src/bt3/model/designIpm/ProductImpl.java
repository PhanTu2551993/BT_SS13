package bt3.model.designIpm;
import bt3.confign.InputMethods;
import bt3.model.design.IProduct;
import bt3.model.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductImpl implements IProduct {
    private static List<Product> productList = new ArrayList<>();
    @Override
    public Product findById(Integer id) {
        for (Product p : productList) {
            if (p.getProductId() == id) {
                return p;
            }
        }
        return null;
    }


    @Override
    public void addNewProduct() {
        System.out.println("Nhập vào số lượng cần thêm");
        byte count = InputMethods.getByte();
        // duyệt
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin cho sản phẩm thứ " + i);
            Product product = inputData(true);
            // thêm vào list
            productList.add(product);
        }
        System.out.println("Đa thêm thanh công " + count + " sản phẩm");
    }

    @Override
    public Product findByName() {
        System.out.println("Nhập vào tên sản phẩm cần tìm kiếm");
        String searchName = InputMethods.getString();
        for (Product p : productList) {
            if (p.getName().equals(searchName)) {
                System.out.println(p);
            }
        }
        return null;
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập id của sản phẩm cần sử thông tin");
        int idEdit = InputMethods.getInteger();
        Product productEdit = findById(idEdit);
        if (productEdit == null) {
            System.err.println("Khong tim thay");
        } else {
            System.out.println("thông tin cũ là :");
            System.out.println(productEdit);
            System.out.println("Nhập thông tin mới");
            productEdit = inputData(false);
            productEdit.setProductId(idEdit); // ko thay đổi id
            productList.set(productList.indexOf(findById(idEdit)),productEdit);
            System.out.println("Đã cập nhật thông tin");
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập id của sản phẩm cần xóa");
        int idDel = InputMethods.getInteger();
        Product productDel = findById(idDel);
        if (productDel == null) {
            System.err.println("Khong tim thay");
        } else {
            productList.remove(productDel);
            System.out.println("Xóa thanh công");
        }
    }

    @Override
    public void displayAll() {
        if (productList.isEmpty()){
            System.err.println("Danh sach rỗng");
        }else {
            for (Product p : productList){
                System.out.println(p);
            }
        }
    }

    @Override
    public void arrangeProducts() {
        System.out.println("Chọn :");
        System.out.println("1. Sắp xếp tăng dần");
        System.out.println("2. Sắp xếp giảm dần");
        int choice = InputMethods.getInteger();
        switch (choice) {
            case 1:
                // Sắp xếp tăng dần
                Collections.sort(productList);
                System.out.println("Đã sắp xếp sản phẩm tăng dần theo giá.");
                break;
            case 2:
                // Sắp xếp giảm dần
                Collections.sort(productList, (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
                System.out.println("Đã sắp xếp sản phẩm giảm dần theo giá.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    @Override
    public Product inputData(boolean isAdd) {
        Product newProduct = new Product();
        if (isAdd) {
            newProduct.setProductId(getNewId()); // id tự tăng
            System.out.println("ID : " + newProduct.getProductId());
        }
        System.out.println("Nhập tên sản phảm :");
        newProduct.setName(InputMethods.getString());
        System.out.println("Nhập Giá :");
        newProduct.setPrice(InputMethods.getDouble());
        return newProduct;
    }

    @Override
    public int getNewId() {
        int idMax = 0;
        for (Product e : productList){
            if (idMax<e.getProductId()){
                idMax = e.getProductId();
            }
        }
        return idMax+1;
    }
}
