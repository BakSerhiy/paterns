package creational.singleton;

public class Database {
    private static Database instance;

    private Database() {
        // Private constructor to prevent instantiation
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }
}