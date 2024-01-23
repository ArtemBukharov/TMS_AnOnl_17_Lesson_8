package Post;

public class Accountent implements PrintPost {
    String post = "Accountent";

    public Accountent(String post) {
        this.post = post;
    }

    @Override
    public void print() {
System.out.println("your post" + post);
    }
}
