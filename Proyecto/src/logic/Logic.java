/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import domain.Employee;
import dataAccess.DataAccess;
import domain.Article;
import domain.Customer;
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

    public boolean update(Employee employee) {
        List<Employee> list = new DataAccess().modificarEnBaseDeDatos(employee);
        for (Employee data : list) {
            if (data.getIdCard().equals(data.getIdCard())
                    || data.getUserName().equals(data.getIdCard())) {
                return false;
            }
        }
        return new DataAccess().updateEmployee(employee);
    }

    public boolean deleteEmployee(Employee employee) {
        return new dataAccess.DataAccess().deleteEmployee(employee);
    }

    public String[] tagNameCustomer() {
        String[] tag = {"Id", "Cedula", "Nombre", "Apellidos", "Telefono"};
        return tag;
    }

    public Object[][] allDataCustomer() {
        List<Customer> list = new DataAccess().consultarTodosLosRegistrosEnBaseDeDatosCustomer();
        Object[][] dataResult = new Object[list.size()][5];
        int i = 0;
        for (Customer data : list) {
            dataResult[i][0] = data.getId();
            dataResult[i][1] = data.getIdCard();
            dataResult[i][2] = data.getName();
            dataResult[i][3] = data.getLastName();
            dataResult[i][4] = data.getPhone();
            i++;
        }
        return dataResult;
    }

    public boolean customerIsRepeat(Customer customer) {
        return new DataAccess().guardarEnBaseDeDatosCustomer(customer);
    }

    public boolean updateCustomer(Customer customer) {
        List<Customer> list = new DataAccess().modificarEnBaseDeDatosCustomer(customer);
        for (Customer data : list) {
            if (data.getIdCard().equals(data.getIdCard())) {
                return false;
            }
        }
        return new DataAccess().updateCustomer(customer);
    }

    public boolean deleteCustomer(Customer customer) {
        return new DataAccess().deleteCustomer(customer);
    }

    public String[] tagNameArticles() {
        String[] tag = {"Id", "Marca", "Descricion", "Categoria", "Cantidad Disponible", "Precio Unitario"};
        return tag;
    }

    public Object[][] allDataArticles() {
        List<Article> list = new DataAccess().consultarTodosLosRegistrosEnBaseDeDatosArticle();
        Object[][] dataResult = new Object[list.size()][6];
        int i = 0;
        for (Article data : list) {
            dataResult[i][0] = data.getId();
            dataResult[i][1] = data.getBrand();
            dataResult[i][2] = data.getDescription();
            dataResult[i][3] = data.getCategory();
            dataResult[i][4] = data.getQuantity();
            dataResult[i][5] = data.getPrice();
            i++;
        }
        return dataResult;
    }

    public boolean ArticleIsRepeat(Article article) {
        return new DataAccess().guardarEnBaseDeDatosArticle(article);
    }

    public boolean updateArticle(Article article) {
        List<Article> list = new DataAccess().consultarTodosLosRegistrosEnBaseDeDatosArticle();
        for (Article data : list) {
            if (article.getBrand().equals(data.getBrand())
                    && article.getDescription().equals(data.getDescription()) 
                    && article.getBrand().equals(data.getBrand())) {
                return false;
            }
        }
        return new DataAccess().updateArticle(article);
    }

    public boolean deleteArticle(Article article) {
        return new DataAccess().deleteArticle(article);
    }
}
