package bt3.model.design;

import bt3.model.entity.Product;

public interface IProduct extends IGenericDesign<Product,Integer> {

    int getNewId();
}
