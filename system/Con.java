package bank.Management.system;

import java.sql.*;
public class Con {

        Connection Connection;

        Statement statement;
    public Con(){
        try{
            Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","ashif@0786");
        statement = Connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
