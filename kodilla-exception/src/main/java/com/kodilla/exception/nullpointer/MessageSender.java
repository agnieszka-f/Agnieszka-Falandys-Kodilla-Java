package com.kodilla.exception.nullpointer;

public class MessageSender {

    public void sendMessageTo(User user, String message) throws MessageNotSentException{

        if ( user == null ) {
            throw new MessageNotSentException("Pusty obiekt typu User");

        } else{
            System.out.println("Sending message: " + message + " to: " + user.getName());
        }
    }
}
