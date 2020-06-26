package com.kodilla.exception.test;

import java.util.*;

public class ClassFlight {

    public boolean findFilght(Flight flight) throws RouteNotFoundException{

        Map<String,Boolean> mapFlight = new HashMap<>();
        mapFlight.put("WMI", true);
        mapFlight.put("WRO", true);
        mapFlight.put("WAW", false);
        mapFlight.put("POZ", true);
        mapFlight.put("KRK", false);
        mapFlight.put("KTW", true);

        boolean result;

        if (mapFlight.containsKey(flight.getArrivalAirport())){

            result = mapFlight.get(flight.getArrivalAirport());

        } else {

            throw new RouteNotFoundException("Lotnisko nie istnieje");
        }


        return result;
    }
    public static void main(String [] args){

        ClassFlight classFlight = new ClassFlight();

        Flight flight1 =new Flight("WRO", "www");

        try {
            boolean arrivalPermit = classFlight.findFilght(flight1);

                if(arrivalPermit) System.out.println("Możesz lecieć na to lotnisko");
                else System.out.println("Lot na to lotnisko jest niedozwolony");
        }
        catch (RouteNotFoundException r){
            System.out.println(r);
        }
    }
}
