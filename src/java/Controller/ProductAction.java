/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProductDAO;
import Model.Product;
import java.util.List;

/**
 *
 * @author phuch_cqzh776
 */
public class ProductAction {
    
    private List<Product> listProduct;

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
    
    
    
    public ProductAction() {
    }
    
    public String execute() throws Exception {
        ProductDAO productDAO = new ProductDAO();
        setListProduct(productDAO.getAllProduct());
        
        return "success";
    }
    
}
