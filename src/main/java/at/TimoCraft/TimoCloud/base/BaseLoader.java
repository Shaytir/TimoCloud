package at.TimoCraft.TimoCloud.base;

/**
 * Created by Timo on 31.01.17.
 */
public class BaseLoader {

    private static Base base;

    public static void main(String[] args) {
        load();
    }

    public static void load() {
        base = new Base();
    }

    public static Base getBase() {
        return base;
    }
}
