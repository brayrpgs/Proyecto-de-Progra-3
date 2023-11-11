/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import domain.Employee;
import dataAccess.DataAccess;
import java.util.List;

/**
 *
 * @author brayrpgs
 */
public class Logic {

    public Logic() {
    }

    public boolean isEmployee(Employee employee) {
        return new DataAccess().login(employee);
    }

    public boolean isRepeat(Employee employee) {
        return new DataAccess().guardarEnBaseDeDatos(employee);
    }

    public Object[][] allData() {
        List<Employee> list = new DataAccess().consultarTodosLosRegistrosEnBaseDeDatos();
        Object[][] dataResult = new Object[list.size()][7];
        int i = 0;
        for (Employee data : list) {
            dataResult[i][0] = data.getId();
            dataResult[i][1] = data.getIdCard();
            dataResult[i][2] = data.getName();
            dataResult[i][3] = data.getLastName();
            dataResult[i][4] = data.getPhone();
            dataResult[i][5] = data.getUserName();
            dataResult[i][6] = data.getPassword();
            i++;
        }
        return dataResult;
    }

    public String[] tagName() {
        String[] tag = {"Id", "Cedula", "Nombre", "Apellidos", "Telefono", "Usuario", "Contraseña"};
        return tag;
    }
    
    public boolean update(Employee employee){
        return new DataAccess().updateEmployee(employee);
    }
    
    public boolean deleteEmployee(Employee employee){
        return new dataAccess.DataAccess().deleteEmployee(employee);
    }

}
