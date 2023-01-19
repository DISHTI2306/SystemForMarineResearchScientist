/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dishti
 */
public class ScientistConnect {
    Connection conn = null;
    public static Connection connectDB(){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/SystemForMarineResearchScientist ", 
                    "DishtiChitapain", "Dishti@1234");
            return conn;
        }catch(Exception korona){
            JOptionPane.showMessageDialog(null, "Connection Error!!!\n\nPlease check: " + korona);
            return null;
        }
    }
}
