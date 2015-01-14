/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment.pkg1;

/**
 *
 * @author C0648301
 */
class Purchase {
    private String product_id;
    private int quantity;
    
    public Purchase (String product_id, int quantity){
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Purchase() {
    }
    
}
