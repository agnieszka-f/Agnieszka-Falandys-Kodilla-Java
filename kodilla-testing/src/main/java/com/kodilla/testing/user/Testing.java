package com.kodilla.testing.user;
import com.kodilla.testing.user.SimpleUser;

public class Testing {

    public static void main(String[] args){

        SimpleUser user1 = new SimpleUser("Ania");

        String result = user1.getUserName();
        System.out.println(user1);

    }
}
