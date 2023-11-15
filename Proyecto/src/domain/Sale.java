/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;

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
    private ArrayList<Article> articles;
    private double total;

    public Sale(String id, Employee employee, Customer customer, double subTotal, double descount, ArrayList<Article> articles, double total) {
        this.id = id;
        this.employee = employee;
        this.customer = customer;
        this.subTotal = subTotal;
        this.descount = descount;
        this.articles = articles;
        this.total = total;
    }

    public Sale() {
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sale{" + "employee=" + employee + ", customer=" + customer + ", subTotal=" + subTotal + ", descount=" + descount + ", total=" + total + '}';
    }
    
}
