package Post;

public class Director implements PrintPost{
    private static final String YOURPOST = "Direktor";


    @Override
    public void print() {
        System.out.println(YOURPOST);
    }
}
