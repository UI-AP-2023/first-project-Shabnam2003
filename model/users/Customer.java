package model.users;

import model.products.Product;
import model.products.ShoppingFactor;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Product> shoppingbasket = new ArrayList<>();
    private ArrayList<ShoppingFactor> shoppingHistory = new ArrayList<>();
    private double property = 0;

    public Customer() {
    }

    public void setter(String username, String email, String phoneNumber, String password) {
        super.setter(username, email, phoneNumber, password);
    }

    public ArrayList<Product> getShoppingbasket() {
        return this.shoppingbasket;
    }

    public ArrayList<ShoppingFactor> getShoppingHistory() {
        return this.shoppingHistory;
    }

    public Double getProperty() {
        return this.property;
    }

    public void setProperty(Double property) {
        this.property += property;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProperty= $ " + this.property;
    }

}
