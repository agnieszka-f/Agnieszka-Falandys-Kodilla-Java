package com.kodilla.stream.world;
import java.math.*;

public final class Country{
    final String name;
    final BigDecimal q;

    public Country(final String name, final BigDecimal q){
        this.name = name;
        this.q = q;
    }
    public BigDecimal numberOfPeople(){
        return q;
    }
}