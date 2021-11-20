package com.mycompany.test;
import java.sql.*;

public class ConectToSQL {
    private Connection connection;
    public ConectToSQL()
    {
        String URL = "jdbc:sqlserver://DESKTOP-9OGLLHH\\SQLEXPRESS;databaseName=Allele_Freq;user=root;password=root";
        try
        {
            connection = DriverManager.getConnection(URL);
            System.out.println("Done");
            
        }catch(SQLException e)
        {
            System.out.println("Failed");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
        new ConectToSQL();
    }
    
}
