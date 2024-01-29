package Post;

public class Accountent implements PrintPost {
    private static final String YOURPOST = "Accountent";


    @Override
    public void print() {
        System.out.println(YOURPOST);
    }
}
