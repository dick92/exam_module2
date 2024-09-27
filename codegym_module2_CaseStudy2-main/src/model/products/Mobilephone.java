package model.products;

import java.io.Serializable;

public class Mobilephone extends Products implements Serializable ,InterfaceProducts{

    public Mobilephone(int id, String name, String price) {
        super(id, name, price);
    }

    public Mobilephone(int id, String name, double price) {
        super(id, name, price);
    }
}
