package com.kodilla.stream.forumuser;
import java.util.*;
import java.time.*;

public final class Forum{
    List<ForumUser> listOfUsers = new ArrayList<>();

    public List<ForumUser> getUserList(){
        listOfUsers.add(new ForumUser(1000,"kaja",'F',LocalDate.of(1984,12,16),7));
        listOfUsers.add(new ForumUser(1001,"ewa",'F',LocalDate.of(1999,9,12),0));
        listOfUsers.add(new ForumUser(1002,"bartek",'M',LocalDate.of(1977,12,22),11));
        listOfUsers.add(new ForumUser(1003,"andrzej",'M',LocalDate.of(2001,4,18),5));
        listOfUsers.add(new ForumUser(1004,"sylwia",'F',LocalDate.of(1970,1,30),1));
        listOfUsers.add(new ForumUser(1005,"karol",'M',LocalDate.of(1998,10,28),1));

        return new ArrayList<ForumUser>(listOfUsers);
    }
}