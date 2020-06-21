package com.kodilla.stream.world;
import java.math.*;

public final class Country{
    final private String name;
    final private BigDecimal quantity;

    public Country(final String name, final BigDecimal q){
        this.name = name;
        this.quantity = q;
    }
    public BigDecimal numberOfPeople(){
        return quantity;
    }
    public String getCountryName(){
        return name;
    }
    public BigDecimal getQuantity(){
        return quantity;
    }
}