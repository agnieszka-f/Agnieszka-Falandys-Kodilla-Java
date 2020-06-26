package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        }
        catch(MessageNotSentException m){
            System.out.println("Wiadomość nie została wysłana " +m);
        }
        System.out.println("Rozpoczynam wykonywanie innych instrukcji");
    }
}
