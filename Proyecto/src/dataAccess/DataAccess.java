/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import domain.Employee;
import java.sql.SQLException;


/**
 *
 * @author brayrpgs
 */
public class DataAccess {
    public Employee login(Employee employeeComeFromLogic){
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbinventory", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("SELECT * FROM tbemployee WHERE username = ? AND password = ?");
            sentencia.setString(1, employeeComeFromLogic.getUserName());
            sentencia.setString(2, employeeComeFromLogic.getPassword());
            
            ResultSet rs = sentencia.executeQuery();
            Employee e = new Employee();
            
            if (rs.next()) {//¿Hay datos para este user?
                //Si si hay datos
                e.setUserName(rs.getString("username"));
                e.setPassword(rs.getString("password"));
                sentencia.close();
                rs.close();
                return e;
            }else{
                //No no hay datos
                return null;
            }
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }

    
    
     
}
