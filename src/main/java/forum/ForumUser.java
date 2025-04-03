package forum;

import java.util.ArrayList;
import java.util.List;

public class ForumUser {
    private String username;
    private String realName;
    private List<String> posts = new ArrayList<String>();
    private List<String> comments = new ArrayList<String>();

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public void addPost(String post) {
        posts.add(post);
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void deletePost(String post) {
        posts.remove(post);
    }

    public void deleteComment(String comment) {
        comments.remove(comment);
    }

    public String getUsername() {
        return username;
    }
    public String getRealName() {
        return realName;
    }
    public List<String> getPosts() {
        return posts;
    }
    public List<String> getComments() {
        return comments;
    }
}
