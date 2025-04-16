package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GyankunjDAO
{
    //	Database Credentials
    private String url = "jdbc:mysql://localhost:3306/advancejavacoursework";
    private String user = "root";
    private String password = "";


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    //Method to load MySQL JDBC Driver
    static
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException("Failed to load MySQL driver", e);
        }
    }

    //	Method to establish Database connection
    public static Connection getConnection(String url, String user, String password) throws SQLException
    {
        return DriverManager.getConnection(url, user, password);
    };

    //testing 1: Inserting new value in Database
//    public static void main (String [] Args)
//    {
//        try
//                (//sajflksad;lfkas;dlf;lsadfkasdfk
//                        String insertQuerry = "Insert into Book (BookId, Title, Author, Genre, Descripton, Availability) values(?,?,?,?,?,?);";
//                        Connection con = getConnection();
//                        PreparedStatement insert = con.prepareStatement(insertQuerry);
//                )
//        {
//            insert.setInt(1,7);
//            insert.setString(2, "A for ayush");
//            insert.setString(3, "Ayush Rai");
//            insert.setString(4, "Horror");
//            insert.setString(5, "Horror Book by Ayush Rai");
//            insert.setBoolean(6, true);
//
//            insert.executeUpdate();
//        }
//        catch (SQLException e)
//        {
//            throw new RuntimeException("Error in prepared statement block", e);
//        }

    }
}
