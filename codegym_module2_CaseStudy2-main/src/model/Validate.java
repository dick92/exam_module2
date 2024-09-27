package model;

import model.products.*;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate implements Serializable {

    private static final String ID_GENUINEPHONE_REGEX = "^V[0-9]{3}$";
    private static final String ID_MOBILEPHONE_REGEX = "^S[0-9]{3}$";




    public static boolean validateSmartPhone(String regex) {
        Pattern pattern = Pattern.compile(ID_GENUINEPHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateSmartWatch(String regex) {
        Pattern pattern = Pattern.compile(ID_MOBILEPHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }



    //public static Products getProduct(String id, String name, double price) throws IDNotMatchException {
       // Products product;
        //if (validateLaptop(id)) {
            //product = new Laptop(Integer.parseInt(id), name, price);
        //} else if (validateSmartPhone(id)) {
            //product = new Genuinephone(Integer.parseInt(id), name, price);
        //} else if (validateSmartWatch(id)) {
           // product = new Mobilephone(Integer.parseInt(id), name, price);

        //} else if (validateTable(id)) {
           /// product = new Tablet(Integer.parseInt(id), name, price);
        //} else {
            //throw new IDNotMatchException("The ID you have entered is invalid");
        //}
        //product.setName(name);
        //product.setId(Integer.parseInt(id));
        //product.setPrice(price);
        //return product;
    }

