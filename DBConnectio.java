package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    static String user="root";
    static String Pass="root";
    static String ServerName="jdbc:sqlserver://DESKTOP-9OGLLHH\\SQLEXPRESS;databaseName=Allele_Freq";
    //static String DBName="Allele_Freq";
    static Connection connection;
    
    public static void main(String[] args) throws SQLException 
    {
        connection = DriverManager.getConnection(ServerName,user,Pass);
        System.out.println("OK");
        
    }
    
}
