import java.sql.Connection;
import java.sql.DriverManager;

public class Config 
{

    // Variables
    private static final String URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";
    private static final String HOST = "";
    private static final String PORT = "";
    
    // URL
    private static final String URL_DATABASE = "jdbc:mysql://" + HOST + ":" + PORT + "/" + URL;

    // Main method
    public static Connection getConnection() throws IllegalArgumentException
    {
        Connection connection = null;
        try 
        {
            connection = DriverManager.getConnection(URL_DATABASE, USER, PASSWORD);
        } 
        catch (Exception e) 
        {
            throw new IllegalArgumentException("Error connecting to the database: " + e.getMessage());
        }
        return connection;
    }
}