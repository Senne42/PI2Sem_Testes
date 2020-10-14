package yourcad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConexao {  
    private static final String USERNAME = "root";
    private static final String PASSWORD = "m1m2m3m4m5";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/yourcad";
    
    public static Connection createConnectionToMySQL() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        
        return connection;
    }
    
    public static void main(String[] args) throws Exception 
    {
      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;
        
        try{
         connection=DriverManager.getConnection
            (DATABASE_URL,USERNAME,PASSWORD);
         statement=connection.createStatement();
         resultSet=statement.executeQuery
            ("SELECT * FROM concessionaria");
         while(resultSet.next()){
            System.out.printf(
            resultSet.getString("concessionaria_id"));
         }

      }catch(SQLException ex){
      }finally{
            resultSet.close();
            statement.close();
            connection.close();
         }
    }    
}
