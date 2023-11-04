/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author brayrpgs
 */
public class Employee {

    private String id;
    private String idCard;
    private String name;
    private String lastName;
    private String phone;
    private String userName;
    private String password;

    public Employee() {
    }

    public Employee(String id, String idCard, String name, String lastName, String phone, String userName, String password) {
        this.id = id;
        this.idCard = idCard;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", idCard=" + idCard + ", name=" + name + ", lastName=" + lastName + ", phone=" + phone + ", userName=" + userName + ", password=" + password + '}';
    }

    
    
    

}
