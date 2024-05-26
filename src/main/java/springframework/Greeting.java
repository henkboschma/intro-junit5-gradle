package springframework;

/**
 * Created by jt on 10/10/18.
 */
public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    int i =0;
    public String helloWorld(){
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name){
        return HELLO + " " + name;
    }
}
