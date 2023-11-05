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
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ceasar
 */
public class DataAccess {
    
    public boolean login(Employee employeeComeFromLogic){
        /*
        Metodo para validar el login en la pantalla principal,con este booleano 
        llega a logica y en presentacion se pintan
        */
        try{
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbinventory", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("SELECT * FROM tbemployee WHERE username = ? AND password = ?");
            sentencia.setString(1, employeeComeFromLogic.getUserName());
            sentencia.setString(2, employeeComeFromLogic.getPassword());
            
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()) {//¿Hay datos para este user?
                //Si si hay datos
                return true;
            }else{
                //No no hay datos
                return false;
            }
        }catch(Exception e){
            System.out.println(e.toString());
            return false;
        }
    }
     public List<Employee> consultarTodosLosRegistrosEnBaseDeDatos(){
        List<Employee>laListaDeRegistrosADevolver = new ArrayList<>();
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbinventory", "root", "");
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("SELECT * FROM tbemployee");
            
            ResultSet rs = sentencia.executeQuery();
                        
            while(rs.next()) { //¿Existen registros?
                //Seteo un empleado
                Employee aEmployee = new Employee();    
                aEmployee.setId(rs.getString("id"));
                aEmployee.setIdCard(rs.getString("idCard"));
                aEmployee.setName(rs.getString("name"));
                aEmployee.setLastName(rs.getString("lastName"));
                aEmployee.setPhone(rs.getString("phone"));
                aEmployee.setUserName(rs.getString("username"));
                aEmployee.setPassword(rs.getString("password"));
                
                //Agrego el empleado a la Lista
                laListaDeRegistrosADevolver.add(aEmployee);
            }
            //Cierro conexiones
            sentencia.close();
            cn.close();
        }catch (Exception e){
            e.printStackTrace();
            laListaDeRegistrosADevolver = null;
        }
        return laListaDeRegistrosADevolver;
    }
     
}
