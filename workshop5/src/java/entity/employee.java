/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author tuans
 */
public class employee {
    private name name;
    private address address;

    public employee() {
    }

    public employee(name name, address address) {
        this.name = name;
        this.address = address;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public name getName() {
        return name;
    }

    public void setName(name name) {
        this.name = name;
    }

    
    
}
