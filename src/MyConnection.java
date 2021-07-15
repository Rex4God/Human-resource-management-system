

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class MyConnection {

    
    public static Connection getConnection(){
        Connection con  = null;
        
        try{
            
           try{
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost/human resource management","root","");
               
           }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
               
           }
            
        }catch (Exception e){
            
        }
        return con;
    } 
       
}
