/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuans
 */
public class Cart {
    //a list of cart item
    private List<CartItem> items;

    public Cart() {
        items=new ArrayList<>();
    }

    //add a new item to the list
    public void addItem(CartItem item){
        //check out if give item is in the list item
        for (CartItem ci:items){
            if (ci.getId()==item.getId()){
                ci.setQuantity(ci.getQuantity()+1);
                return;
            }
        }
        items.add(item);
    }
    
    //remove an item
    //update quantity
    
    //get all items
    public List<CartItem> getItems() {
        return items;
    }
    
}
