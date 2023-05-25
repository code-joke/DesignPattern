package java;

public class JDBCSingleton {
    private static JDBCSingleton jdbc;

    private JDBCSingleton() {

    }

    public static JDBCSingleton getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingleton();
        }

        return jdbc;
    }
}
