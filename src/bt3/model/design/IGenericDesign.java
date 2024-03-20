package bt3.model.design;

import bt3.model.entity.Product;

import java.util.List;

public interface IGenericDesign<T, E> {// T là kiểu dữ liệu của dối tượng, E là kiểu dữ liệu của ID đối tượng
    T findById(E id);
    void addNewProduct();
    T findByName();
    void editProduct();
    void deleteProduct();
    void displayAll();
    void arrangeProducts();
    T inputData(boolean isAdd);
}
