/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Rivy
 */
public class DataBaseConnection {
    public static Connection connectDB(){
    Connection con=null;
    try{
    Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","kinan","1");
    return con;
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    return null;
    }

}
