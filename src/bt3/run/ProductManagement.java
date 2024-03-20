package bt3.run;

import bt3.confign.InputMethods;
import bt3.model.design.IProduct;
import bt3.model.designIpm.ProductImpl;

public class ProductManagement {
    private static final IProduct productImpl = new ProductImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("======================Product Management======================");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.println("------Nhập lựa chọn của bạn --------");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    productImpl.addNewProduct();
                    break;
                case 2:
                    productImpl.editProduct();
                    break;
                case 3:
                    productImpl.deleteProduct();
                    break;
                case 4:
                    productImpl.displayAll();
                    break;
                case 5:
                    productImpl.findByName();
                    break;
                case 6:
                    productImpl.arrangeProducts();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập không hợp lệ , thử lại !!!");
            }
        }
    }
}
