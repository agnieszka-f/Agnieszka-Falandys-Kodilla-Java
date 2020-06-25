package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String[] args) {

        SecondChallenge object1 = new SecondChallenge();
        try {

            String result = object1.probablyIWillThrowException(4,8);

            System.out.println(result);
        }
        catch (Exception e) {

            System.out.println("Wystąpił wyjątek: " + e);
        }
        finally{

            try {
                String result = object1.probablyIWillThrowException(1,8);
                System.out.println(result);
            }
            catch (Exception e) {

                System.out.println("Wystąpił wyjątek: " + e);
            }
        }
    }
}