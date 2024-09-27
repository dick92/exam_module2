package model.products;

import java.io.Serializable;

public class Genuinephone extends Products implements Serializable ,InterfaceProducts{

    public Genuinephone(int id, String name, String price) {
        super(id, name, price);
    }

    public Genuinephone(int id, String name, double price) {
        super(id, name, price);
    }
}
