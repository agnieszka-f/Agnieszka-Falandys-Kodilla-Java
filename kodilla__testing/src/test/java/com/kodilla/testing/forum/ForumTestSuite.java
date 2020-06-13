package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void beforeTest(){
        System.out.println("Test case - begin");
    }
    @After
    public void afterTest(){
        System.out.println("Test case - end");
    }


    @Test
    public void testCaseUsername() {

        //Given
        SimpleUser user1 = new SimpleUser("Ania", "Ola");
        //When
        String result = user1.getUsername();
        //Then
        System.out.println("Test gdy username: " + result);
        if (result.equals("Ania")) {
            System.out.println(result + " test ok");
        } else {
            System.out.println("test faild ");
        }
        //then 2
        Assert.assertEquals("Ania", result);
    }
    @Test
    public void testCaseRealUsername(){
        SimpleUser user2 = new SimpleUser("Aga","Agnieszka");
        String result2 = user2.getRealUsername();
        System.out.println("Test dla realusername = " + result2);
        Assert.assertEquals("Agnieszka", result2);
    }
}
