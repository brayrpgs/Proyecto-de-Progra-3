/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import domain.Employee;
import dataAccess.DataAccess;
import domain.Article;
import domain.Customer;
import domain.Sale;
import java.util.ArrayList;
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

    public Employee getEmployee(Employee employee) {
        List<Employee> list = new DataAccess().consultarTodosLosRegistrosEnBaseDeDatos();
        for (Employee data : list) {
            if (data.getPassword().equals(employee.getPassword())
                    && data.getUserName().equals(employee.getUserName())) {
                return data;
            }
        }
        return null;
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

    public List<Employee> getAllDataEmployee() {
        return new DataAccess().consultarTodosLosRegistrosEnBaseDeDatos();
    }

    public String[] tagName() {
        String[] tag = {"Id", "Cedula", "Nombre", "Apellidos", "Telefono", "Usuario", "Contraseña"};
        return tag;
    }

    public boolean update(Employee employee) {
        List<Employee> list = new DataAccess().modificarEnBaseDeDatos(employee);
        for (Employee data : list) {
            if (data.getIdCard().equals(employee.getIdCard())
                    || data.getUserName().equals(employee.getUserName())) {

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

    public List<Customer> getAllDataCustomer() {
        return new DataAccess().consultarTodosLosRegistrosEnBaseDeDatosCustomer();
    }

    public boolean updateCustomer(Customer customer) {
        List<Customer> list = new DataAccess().modificarEnBaseDeDatosCustomer(customer);
        for (Customer data : list) {
            if (data.getIdCard().equals(customer.getIdCard())) {
                return false;
            }
        }
        return new DataAccess().updateCustomer(customer);
    }

    public boolean deleteCustomer(Customer customer) {
        return new DataAccess().deleteCustomer(customer);
    }

    public String[] tagNameArticles() {
        String[] tag = {"Id", "Marca", "Descripcion", "Categoria", "Cantidad Disponible", "Precio Unitario"};
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
    
    public String[] tagNameSale() {
        String[] tag = {"Id", "Vendedor", "Cliente", "SubTotal", "Descuento", "Articulos", "Total"};
        return tag;
    }

    public Object[][] allDataSales() {
        List<Sale> list = new DataAccess().consultarTodosLosRegistrosEnBaseDeDatosSales();
        Object[][] dataResult = new Object[list.size()][7];
        int i = 0;
        for (Sale data : list) {
            dataResult[i][0] = data.getId();
            dataResult[i][1] = data.getEmployee().getName() + " " + data.getEmployee().getLastName();
            dataResult[i][2] = data.getCustomer().getName();
            dataResult[i][3] = data.getSubTotal();
             dataResult[i][4] = data.getDescount();
            dataResult[i][5] = data.getCountArticles();
            dataResult[i][6] = data.getTotal();
            i++;
        }
        return dataResult;
    }

    public boolean ArticleIsRepeat(Article article) {
        return new DataAccess().guardarEnBaseDeDatosArticle(article);
    }

    public List<Article> getAllDataArticle() {
        return new DataAccess().consultarTodosLosRegistrosEnBaseDeDatosArticle();
    }

    public boolean updateArticle(Article article) {
        List<Article> list = new DataAccess().modificarEnBaseDeDatosArticle(article);

        for (Article data : list) {

            if (article.getBrand().equals(data.getBrand())
                    && article.getDescription().equals(data.getDescription())
                    && article.getCategory().equals(data.getCategory())) {

                return false;
            }
        }
        return new DataAccess().updateArticle(article);
    }

    public boolean deleteArticle(Article article) {
        return new DataAccess().deleteArticle(article);
    }
    
    public boolean deleteSale(Sale sale) {
        return new DataAccess().deleteSale(sale);
    }

    //metodo de calculo de total
    public double total(double desc, double total) {
        return total - (total * (desc / 100));
    }

    //añadir objetos a la canasta 
    public Object[][] addArticletoCart(ArrayList<Article> list, Article art) {
        int i = 0;
        //ver si esta vacio y guardar
        if (list.isEmpty()) {
            list.add(art);
            //
            Object[][] dataResult = new Object[list.size()][6];
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
            
        } else {
            //verificar si esta repetido
            boolean isRepeat = false;
            for (Article data : list) {
                if (data.getId().equals(art.getId())) {
                    data.setQuantity(data.getQuantity() + art.getQuantity());
                    isRepeat = true;
                }
            }
            //si esta repetido en la lista
            if (isRepeat) {
                //
                Object[][] dataResult = new Object[list.size()][6];
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
            } else {
                //si no esta repetido enla lista
                list.add(art);//lo agrega sin sumar porque aun no estaba en la lista
                //
                Object[][] dataResult = new Object[list.size()][6];
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
        }
    }

    //verificar si se exede la cantidad de articulos que pretende comprar
    public boolean verifyArticle(ArrayList<Article> list, Article art, int cant, int lim) {
        //verifica si esta vacia la lista 
        if (list.isEmpty()) {
            if (cant > lim) {
                return false;
            }
        } else {
            for (Article data : list) {//recorro cada articulo en busca del id
                if (data.getId().equals(art.getId())) {//verifico que es el mismo id
                    
                    if (cant + data.getQuantity() > lim) {//verifico que no soble pase el limite
                        return false;
                    }
                }
            }

        }
        return true;//sale si paso todo
    }
    
    //para guardar el reporte de la venta
    public boolean setSale(Sale sale){
        return new DataAccess().createSale(sale);
    }
}
