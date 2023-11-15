package org.eric.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Beverage {
    public static int nextID = 1;

    private String id;
    private String name;
    private double price;
    private boolean alcoholic;

    public Beverage(String name, double price, boolean alcoholic) {
        this.id = String.format("B%03d", nextID++);
        this.name = name;
        this.price = price;
        this.alcoholic = alcoholic;
    }
}
