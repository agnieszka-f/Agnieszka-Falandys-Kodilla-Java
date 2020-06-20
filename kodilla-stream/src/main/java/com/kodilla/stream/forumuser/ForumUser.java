package com.kodilla.stream.forumuser;
import java.time.LocalDate;

public final class ForumUser{
    private final Integer id;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int quantity;

    public ForumUser(final Integer id, final String username, final char sex, final LocalDate dateOfBirth, final int quantity){
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.quantity = quantity;
    }
    public String getUsername(){
        return this.username;
    }
    public char getSex(){
        return this.sex;
    }
    public Integer getId(){
        return this.id;
    }
    public LocalDate getDate(){
        return this.dateOfBirth;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String toString(){
        return "Username = "+this.username+", date of birth = "+this.dateOfBirth+", sex = "+this.sex+", quantity = "+this.quantity;
    }
}
