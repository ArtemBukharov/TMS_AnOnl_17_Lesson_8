package Post;

public class Worker implements  PrintPost{
    String post = "Worker";

    public Worker(String post) {
        this.post = post;
    }

    @Override
    public void print() {
        System.out.println("your post" + post);
    }
}
