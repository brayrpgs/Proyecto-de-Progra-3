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
    private Employee employee;
    private Customer customer;
    private double subTotal;
    private double descount;
    private double total;

    public Sale() {
    }

    public Sale(Employee employee, Customer customer, double subTotal, double descount, double total) {
        this.employee = employee;
        this.customer = customer;
        this.subTotal = subTotal;
        this.descount = descount;
        this.total = total;
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
        return "Sale{" + "employee=" + employee + ", customer=" + customer + ", subTotal=" + subTotal + ", descount=" + descount + ", total=" + total + '}';
    }
    
}
