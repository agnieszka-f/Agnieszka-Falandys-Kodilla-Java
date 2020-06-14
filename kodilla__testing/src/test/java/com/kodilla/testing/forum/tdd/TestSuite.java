package com.kodilla.testing.forum.tdd;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class TestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTests(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmitch", "John Smith");
        //When
        forumUser.addPost("mrsmitch", "post tarlallalalla");
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmitch", "John Smith");
        ForumPost thePost = new ForumPost("ala ma kota a kot ma ale", "mrsmitch");
        //When
        forumUser.addComment(thePost, "mrsmitch", "to jest komentarz" );
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }
}
