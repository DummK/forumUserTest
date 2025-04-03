package forum.tdd;

import forum.ForumUser;
import org.junit.jupiter.api.*;

public class ForumUserTestSuite {
    private ForumUser forumUser;

    @BeforeEach
        public void beforeEach() {
            System.out.println("Test started");
        }

    @AfterEach
        public void afterEach() {
            System.out.println("Test finished");
        }

    @DisplayName("Testing if posts gets added to forum")
        @Test
            public void testAddForumPost() {
                //Given
                forumUser = new ForumUser("John Doe", "John Doe");
                String post = "Hello World!";

                //When
                forumUser.addPost(post);

                //Then
                Assertions.assertTrue(forumUser.getPosts().contains(post));
        }

    @DisplayName("Testing if comments gets added to forum")
        @Test
            public void testAddForumComment() {
                //Given
                forumUser = new ForumUser("John Doe", "John Doe");
                String comment = "Hello World!";

                //When
                forumUser.addComment(comment);

                //Then
                Assertions.assertTrue(forumUser.getComments().contains(comment));
        }

    @DisplayName("Testing if posts gets deleted from forum")
        @Test
            public void testDeleteForumPost() {
                //Given
                forumUser = new ForumUser("John Doe", "John Doe");
                String post = "Hello World!";
                forumUser.addPost(post);

                //When
                forumUser.deletePost(post);

                //Then
                Assertions.assertFalse(forumUser.getPosts().contains(post));
        }

    @DisplayName("Testing if comments gets deleted from forum")
        @Test
            public void testDeleteForumComment() {
                //Given
                forumUser = new ForumUser("John Doe", "John Doe");
                String comment = "Hello World!";
                forumUser.addComment(comment);

                //When
                forumUser.deleteComment(comment);

                //Then
                Assertions.assertFalse(forumUser.getComments().contains(comment));
        }
}
