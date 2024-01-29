package Post;

public class Worker implements  PrintPost{
    private static final String YOURPOST = "Worker";


    @Override
    public void print() {
        System.out.println(YOURPOST);
    }
}
