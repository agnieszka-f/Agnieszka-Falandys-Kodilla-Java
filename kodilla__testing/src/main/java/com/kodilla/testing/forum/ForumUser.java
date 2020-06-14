package com.kodilla.testing.forum;
import java.util.*;

public class ForumUser {
    private String name;
    private String realname;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realname) {
        this.name = name;
        this.realname = realname;
    }
    public void addPost(String author, String postBody){
        ///////
    }
    public void addComment(ForumPost thePost, String author, String commentBody){
        // do nothing
    }
    public int getPostsQuantity(){
        // return 100 temporarily
        return 1;
    }

    public int getCommentsQuantity(){
        // return 100 temporarily
        return 1;
    }
    public ForumPost getPost(int postNumber){
        // returning null means that the operation was unsuccessful
        return null;
    }

    public ForumComment getComment(int commentNumber){
        // returning null means that the operation was unsuccessful
        return null;
    }
    public boolean removePost(ForumPost thePost){
        // return true temporarily
        return true;
    }

    public boolean removeComment(ForumComment theComment){
        // return true temporarily
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realname;
    }
}
