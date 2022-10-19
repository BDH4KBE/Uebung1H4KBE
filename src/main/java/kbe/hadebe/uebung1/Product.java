package kbe.hadebe.uebung1;

import lombok.Getter;
import lombok.Setter;

public class Product {



    @Getter
    @Setter
    private int id;


    @Getter
    @Setter
    private String product_nr;

    @Getter
    @Setter
    private String productName;
    @Getter
    @Setter
    private int price;
    @Getter
    @Setter
    private Boolean hasSDSlot;

    @Getter
    @Setter
    private String name_manufacturer;

    @Getter
    @Setter
    private String ean;


    public Product(int id, String product_nr, String productName, int price, Boolean hasSDSlot, String name_manufacturer, String ean) {
        this.id = id;
        this.product_nr = product_nr;
        this.productName = productName;
        this.price = price;
        this.hasSDSlot = hasSDSlot;
        this.name_manufacturer = name_manufacturer;
        this.ean = ean;
    }

    public Product() {

    }


}
