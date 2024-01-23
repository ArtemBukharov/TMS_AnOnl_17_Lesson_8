package Post;

public class Director implements PrintPost{
    String post = "Director";

    public Director(String post) {
        this.post = post;
    }

    @Override
    public void print() {
        System.out.println("your post" + post);
    }
}
