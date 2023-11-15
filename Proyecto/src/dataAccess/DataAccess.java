/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Connection;
import domain.Article;
import domain.Customer;
import java.sql.DriverManager;
import java.sql.ResultSet;
import domain.Employee;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ceasar
 */
public class DataAccess {

    private Connection connectionSQL() {
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbinventory", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    private PreparedStatement preparedStateent(String sentence) {

        PreparedStatement sentencia;
        try {
            sentencia = (PreparedStatement) connectionSQL().prepareStatement(sentence);
            return sentencia;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public boolean login(Employee employeeComeFromLogic) {
        /*
        Metodo para validar el login en la pantalla principal,con este booleano 
        llega a logica y en presentacion se pintan
         */
        try {
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbemployee WHERE username = ?  AND password = ?");
            sentencia.setString(1, employeeComeFromLogic.getUserName());
            sentencia.setString(2, employeeComeFromLogic.getPassword());
            ResultSet rs = sentencia.executeQuery();

            //¿Hay datos para este user?
            //Si si hay datos
            return rs.next();

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public List<Employee> consultarTodosLosRegistrosEnBaseDeDatos() {
        List<Employee> laListaDeRegistrosADevolver = new ArrayList<>();
        try {
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbemployee");
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) { //¿Existen registros?
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
            connectionSQL().close();
            return laListaDeRegistrosADevolver;
        } catch (SQLException e) {
            System.out.println(e);
            laListaDeRegistrosADevolver = null;
            return laListaDeRegistrosADevolver;
        }
    }

    public boolean createEmployee(Employee employeeComeFromLogic) {

        try {

            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("insert into tbemployee values (?,?,?,?,?,?,?)");
            sentencia.setString(1, "0"); //ID
            sentencia.setString(2, employeeComeFromLogic.getIdCard());
            sentencia.setString(3, employeeComeFromLogic.getName());
            sentencia.setString(4, employeeComeFromLogic.getLastName());
            sentencia.setString(5, employeeComeFromLogic.getPhone());
            sentencia.setString(6, employeeComeFromLogic.getUserName());
            sentencia.setString(7, employeeComeFromLogic.getPassword());

            sentencia.execute(); //Ejecuta el SQL 

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean guardarEnBaseDeDatos(Employee employeeComeFromLogic) {

        try {

            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbemployee");
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {

                if (rs.getString("idCard").equals(employeeComeFromLogic.getIdCard()) || rs.getString("username").equals(employeeComeFromLogic.getUserName())) {
                    sentencia.close();
                    rs.close();
                    connectionSQL().close();
                    return false;

                }
            }

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            createEmployee(employeeComeFromLogic);
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public List<Employee> modificarEnBaseDeDatos(Employee employeeComeFromLogic) {

        List<Employee> employeeList = new ArrayList<>();
        try {

            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbemployee WHERE id <> " + employeeComeFromLogic.getId());
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {

                Employee tempEmp = new Employee();

                tempEmp.setIdCard(rs.getString("idCard"));
                tempEmp.setName(rs.getString("name"));
                tempEmp.setLastName(rs.getString("lastName"));
                tempEmp.setPhone(rs.getString("phone"));
                tempEmp.setUserName(rs.getString("username"));
                tempEmp.setId(rs.getString("id")); //ID
                employeeList.add(tempEmp);
            }
            
            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return employeeList;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public boolean updateEmployee(Employee employeeComeFromLogic) {

        try {
            PreparedStatement sentencia = preparedStateent("UPDATE tbemployee SET idCard=?,name=?,lastName=?,phone=?,username=?,password=? WHERE id = ?");

            sentencia.setString(1, employeeComeFromLogic.getIdCard());
            sentencia.setString(2, employeeComeFromLogic.getName());
            sentencia.setString(3, employeeComeFromLogic.getLastName());
            sentencia.setString(4, employeeComeFromLogic.getPhone());
            sentencia.setString(5, employeeComeFromLogic.getUserName());
            sentencia.setString(6, employeeComeFromLogic.getPassword());
            sentencia.setString(7, employeeComeFromLogic.getId()); //ID

            sentencia.execute();
            sentencia.close();
            connectionSQL().close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean deleteEmployee(Employee employee) {

        try {
            //Abro conexiones

            // selecr
            PreparedStatement sentencia = preparedStateent("DELETE FROM tbemployee WHERE username = ?");
            sentencia.setString(1, employee.getUserName());

            sentencia.execute(); //Ejecuta el SQL 

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public List<Customer> consultarTodosLosRegistrosEnBaseDeDatosCustomer() {
        List<Customer> laListaDeRegistrosADevolver = new ArrayList<>();
        
        try {
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbcustomer");
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) { //¿Existen registros?
                //Seteo un empleado
                Customer aCustomer = new Customer();
                aCustomer.setId(rs.getString("id"));
                aCustomer.setIdCard(rs.getString("idCard"));
                aCustomer.setName(rs.getString("name"));
                aCustomer.setLastName(rs.getString("lastName"));
                aCustomer.setPhone(rs.getString("phone"));

                //Agrego el empleado a la Lista
                laListaDeRegistrosADevolver.add(aCustomer);
            }

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();
            return laListaDeRegistrosADevolver;
        } catch (SQLException e) {
            System.out.println(e);
            laListaDeRegistrosADevolver = null;
            return laListaDeRegistrosADevolver;
        }
    }

    public List<Customer> modificarEnBaseDeDatosCustomer(Customer customerComeFromLogic) {

        List<Customer> customerList = new ArrayList<>();
        try {

            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbcustomer WHERE id <> " + customerComeFromLogic.getId());
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {

                Customer tempCus = new Customer();

                tempCus.setIdCard(rs.getString("idCard"));
                tempCus.setName(rs.getString("name"));
                tempCus.setLastName(rs.getString("lastName"));
                tempCus.setPhone(rs.getString("phone"));
                tempCus.setId(rs.getString("id")); //ID
                customerList.add(tempCus);
            }
            
            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return customerList;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean createCustomer(Customer customerComeFromLogic) {

        try {

            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("insert into tbcustomer values (?,?,?,?,?)");
            sentencia.setString(1, "0"); //ID
            sentencia.setString(2, customerComeFromLogic.getIdCard());
            sentencia.setString(3, customerComeFromLogic.getName());
            sentencia.setString(4, customerComeFromLogic.getLastName());
            sentencia.setString(5, customerComeFromLogic.getPhone());

            sentencia.execute(); //Ejecuta el SQL 

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean guardarEnBaseDeDatosCustomer(Customer customerComeFromLogic) {

        try {

            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbcustomer");
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {

                if (rs.getString("idCard").equals(customerComeFromLogic.getIdCard())) {
                    sentencia.close();
                    rs.close();
                    connectionSQL().close();
                    return false;

                }
            }

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            createCustomer(customerComeFromLogic);
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean updateCustomer(Customer customerComeFromLogic) {

        try {
            PreparedStatement sentencia = preparedStateent("UPDATE tbcustomer SET idCard=?,name=?,lastName=?,phone=? WHERE id = ?");

            sentencia.setString(1, customerComeFromLogic.getIdCard());
            sentencia.setString(2, customerComeFromLogic.getName());
            sentencia.setString(3, customerComeFromLogic.getLastName());
            sentencia.setString(4, customerComeFromLogic.getPhone());
            sentencia.setString(5, customerComeFromLogic.getId()); //ID

            sentencia.execute();
            sentencia.close();
            connectionSQL().close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean deleteCustomer(Customer customer) {

        try {
            //Abro conexiones

            // selecr
            PreparedStatement sentencia = preparedStateent("DELETE FROM tbcustomer WHERE idCard = ?");
            sentencia.setString(1, customer.getIdCard());

            sentencia.execute(); //Ejecuta el SQL 

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public List<Article> consultarTodosLosRegistrosEnBaseDeDatosArticle() {
        List<Article> laListaDeRegistrosADevolver = new ArrayList<>();
        try {
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbarticles");
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) { //¿Existen registros?
                //Seteo un empleado
                Article aArticle = new Article();
                aArticle.setId(rs.getString("id"));
                aArticle.setBrand(rs.getString("brand"));
                aArticle.setDescription(rs.getString("description"));
                aArticle.setCategory(rs.getString("category"));
                aArticle.setQuantity(Integer.parseInt(rs.getString("quantityAvailable")));
                aArticle.setPrice(Double.parseDouble(rs.getString("unitPrice")));

                //Agrego el empleado a la Lista
                laListaDeRegistrosADevolver.add(aArticle);
            }

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();
            return laListaDeRegistrosADevolver;
        } catch (SQLException e) {
            System.out.println(e);
            laListaDeRegistrosADevolver = null;
            return laListaDeRegistrosADevolver;
        }
    }
    
    public List<Article> modificarEnBaseDeDatosArticle(Article articleComeFromLogic) {

        List<Article> articleList = new ArrayList<>();
        try {
       
            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbarticles WHERE id <> " + articleComeFromLogic.getId());
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {

                Article tempArt = new Article();

                tempArt.setBrand(rs.getString("brand"));
                tempArt.setDescription(rs.getString("description"));
                tempArt.setCategory(rs.getString("category"));
                tempArt.setQuantity(Integer.parseInt(rs.getString("quantityAvailable")));
                tempArt.setPrice(Double.parseDouble(rs.getString("unitPrice")));
                tempArt.setId(rs.getString("id")); //ID
                articleList.add(tempArt);
            }
            
            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return articleList;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean createArticle(Article articleComeFromLogic) {

        try {

            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("insert into tbarticles values (?,?,?,?,?,?)");
            sentencia.setString(1, "0"); //ID
            sentencia.setString(2, articleComeFromLogic.getBrand());
            sentencia.setString(3, articleComeFromLogic.getDescription());
            sentencia.setString(4, articleComeFromLogic.getCategory());
            sentencia.setString(5, String.valueOf(articleComeFromLogic.getQuantity()));
            sentencia.setString(6, String.valueOf(articleComeFromLogic.getPrice()));

            sentencia.execute(); //Ejecuta el SQL 

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean guardarEnBaseDeDatosArticle(Article articleComeFromLogic) {

        try {

            //Abro conexiones
            PreparedStatement sentencia = preparedStateent("SELECT * FROM tbarticles");
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {

                if (rs.getString("brand").equals(articleComeFromLogic.getBrand()) && rs.getString("description").equals(articleComeFromLogic.getDescription()) && rs.getString("category").equals(articleComeFromLogic.getCategory())) {
                    sentencia.close();
                    rs.close();
                    connectionSQL().close();
                    return false;

                }
            }

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            createArticle(articleComeFromLogic);
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean updateArticle(Article articleComeFromLogic) {

        try {
            PreparedStatement sentencia = preparedStateent("UPDATE tbarticles SET brand=?,description=?,category=?,quantityAvailable=?,unitPrice=? WHERE id = ?");

            sentencia.setString(1, articleComeFromLogic.getBrand());
            sentencia.setString(2, articleComeFromLogic.getDescription());
            sentencia.setString(3, articleComeFromLogic.getCategory());
            sentencia.setString(4, String.valueOf(articleComeFromLogic.getQuantity()));
            sentencia.setString(5, String.valueOf(articleComeFromLogic.getPrice()));
            sentencia.setString(6, articleComeFromLogic.getId());

            sentencia.execute();
            sentencia.close();
            connectionSQL().close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean deleteArticle(Article article) {

        try {
            //Abro conexiones

            // selecr
            PreparedStatement sentencia = preparedStateent("DELETE FROM tbarticles WHERE id = ?");
            sentencia.setString(1, article.getId());

            sentencia.execute(); //Ejecuta el SQL 

            //Cierro conexiones
            sentencia.close();
            connectionSQL().close();

            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
