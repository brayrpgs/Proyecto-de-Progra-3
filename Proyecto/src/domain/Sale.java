/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;


/**
 *
 * @author BrayRPGs
 */
public class Sale {
    private String id;
    private Employee employee;
    private Customer customer;
    private double subTotal;
    private double descount;
    private int countArticles;
    private double total;

    public Sale() {
    }

    public Sale(String id, Employee employee, Customer customer, double subTotal, double descount, int countArticles, double total) {
        this.id = id;
        this.employee = employee;
        this.customer = customer;
        this.subTotal = subTotal;
        this.descount = descount;
        this.countArticles = countArticles;
        this.total = total;
    }

    public int getCountArticles() {
        return countArticles;
    }

    public void setCountArticles(int countArticles) {
        this.countArticles = countArticles;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescount() {
        return descount;
    }

    public void setDescount(double descount) {
        this.descount = descount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", employee=" + employee + ", customer=" + customer + ", subTotal=" + subTotal + ", descount=" + descount + ", total=" + total + '}';
    }

    
    
}
