/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentation;

import domain.Article;
import domain.Customer;
import domain.Employee;
import domain.Sale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logic.Logic;
import logic.LogicEncriptator;

/**
 *
 * @author kenda
 */
public class CRUDInternalForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmployeeInternalForm
     */
    public CRUDInternalForm() {
        initComponents();
        setVisible(true);    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATA");

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4KeyTyped(evt);
            }
        });

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATA");

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(btn1.getText().equals("Agregar vendedor")){
            createEmployee();
            
        } else if(btn1.getText().equals("Agregar cliente")){
            createCustomer();
            
        } else if(btn1.getText().equals("Agregar articulo")){
        
            createArticle();
        
        }else if(btn1.getText().equals("Modificar vendedor")){
                
            
            if(isEmpty(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), txt5.getText(), txt6.getText())){
            
                showMessage("Datos incorrectos", "Error al actualizar el vendedor", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            
            employee.setIdCard(txt1.getText());
            employee.setName(txt2.getText());
            employee.setLastName(txt3.getText());
            employee.setPhone(txt4.getText());
            employee.setUserName(txt5.getText());
            
            if(txt6.getText().equals(String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6)))){
                
                employee.setPassword(txt6.getText());
                
                
            } else {
            
                employee.setPassword(new LogicEncriptator().encriptation(txt6.getText()));
                
            }
            
            
                
            if(new Logic().update(employee)){
                
                employee = null;
                showMessage("Vendedor actualizado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                
                refreshTable("Modificar vendedor");
                jTable1.removeColumn(jTable1.getColumn("Id"));
                jTable1.removeColumn(jTable1.getColumn("Contraseña"));
                cleanData();
                
            } else {
                
                showMessage("Datos incorrectos", "Error al actualizar el vendedor", JOptionPane.ERROR_MESSAGE);
                
            }
            
            
        } else if(btn1.getText().equals("Eliminar vendedor")){
        
            if(isEmpty(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), txt5.getText(), txt6.getText())){
            
                showMessage("Datos incorrectos", "Error al eliminar el vendedor", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            
            employee.setUserName(txt5.getText());
                
            if(new Logic().deleteEmployee(employee)){
                
                employee = null;
                showMessage("Vendedor eliminado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                
                refreshTable("Eliminar vendedor");
                jTable1.removeColumn(jTable1.getColumn("Id"));
                jTable1.removeColumn(jTable1.getColumn("Contraseña"));
                cleanData();
                
            } else {
                
                showMessage("Datos incorrectos", "Error al eliminar el vendedor", JOptionPane.ERROR_MESSAGE);
                
            }
        
        } else if(btn1.getText().equals("Modificar cliente")){
        
            if(isEmpty(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), ".", ".")){
            
                showMessage("Datos incorrectos", "Error al actualizar el cliente", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            
            customer.setIdCard(txt1.getText());
            customer.setName(txt2.getText());
            customer.setLastName(txt3.getText());
            customer.setPhone(txt4.getText());
                       
            if(new Logic().updateCustomer(customer)){ 
                
                customer = null;
                showMessage("Cliente actualizado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                
                refreshTable("Modificar cliente");
                jTable1.removeColumn(jTable1.getColumn("Id"));
                cleanData();
                
            } else {
                
                showMessage("Datos incorrectos", "Error al actualizar el cliente", JOptionPane.ERROR_MESSAGE);
                
            }
        
        } else if(btn1.getText().equals("Eliminar cliente")){
            
            if(isEmpty(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), ".", ".")){
            
                showMessage("Datos incorrectos", "Error al eliminar el cliente", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               
            customer.setIdCard(txt1.getText());
            
            if(new Logic().deleteCustomer(customer)){ 
                
                customer = null;
                showMessage("Cliente eliminado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                
                refreshTable("Eliminar cliente");
                jTable1.removeColumn(jTable1.getColumn("Id"));
                cleanData();
                
            } else {
                
                showMessage("Datos incorrectos", "Error al eliminar el cliente", JOptionPane.ERROR_MESSAGE);
                
            }
            
        } else if(btn1.getText().equals("Modificar articulo")){
        
            if(isEmpty(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), txt5.getText(), txt6.getText())){
            
                showMessage("Datos incorrectos", "Error al actualizar el articulo", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            
            article.setBrand(txt1.getText().toUpperCase());
            article.setDescription(txt2.getText().toUpperCase());
            article.setCategory(txt3.getText().toUpperCase());
            article.setQuantity(Integer.parseInt(txt4.getText()));
            article.setPrice(Double.parseDouble(txt5.getText()));
            article.setId(txt6.getText());
            
                       
            if(new Logic().updateArticle(article)){ 
                
                article = null;
                showMessage("Articulo actualizado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                
                refreshTable("Modificar articulo");
                
                cleanData();
                
            } else {
                
                showMessage("Datos incorrectos", "Error al actualizar el articulo", JOptionPane.ERROR_MESSAGE);
                
            }
        
        } else if(btn1.getText().equals("Eliminar articulo")){
            
            if(isEmpty(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), txt5.getText(), txt6.getText())){
            
                showMessage("Datos incorrectos", "Error al eliminar el articulo", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               
            article.setId(txt6.getText()); 
            
            if(new Logic().deleteArticle(article)){ 
                
                article = null;
                showMessage("Articulo eliminado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                
                refreshTable("Eliminar articulo");
           
                cleanData();
                
            } else {
                
                showMessage("Datos incorrectos", "Error al eliminar el articulo", JOptionPane.ERROR_MESSAGE);
                
            }
            
        } else if(btn1.getText().equals("Modificar venta")){
        
            if(isEmpty(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), txt5.getText(), txt6.getText())){
            
                showMessage("Datos incorrectos", "Error al actualizar el articulo", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            
            Employee e = new Employee();
            e.setName(txt1.getText().split(" ")[0]);
            e.setLastName(txt1.getText().split(" ")[1]);
            
            Customer c = new Customer();
            c.setName(txt2.getText());
            
            sale.setEmployee(e);
            sale.setCustomer(c);
            sale.setSubTotal(Double.parseDouble(txt3.getText()));
            sale.setDescount(Double.parseDouble(txt4.getText()));
            sale.setCountArticles(Integer.parseInt(txt5.getText()));
            sale.setTotal(Double.parseDouble(txt6.getText()));
                       
            if(new Logic().updateSale(sale)){ 
                
                sale = null;
                showMessage("Venta actualizada con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                
                refreshTable("Modificar venta");
                
                cleanData();
                
            } else {
                
                showMessage("Datos incorrectos", "Error al actualizar la venta", JOptionPane.ERROR_MESSAGE);
                
            }
        
        } else if(btn1.getText().equals("Eliminar venta")){
            
            if(isEmpty(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), txt5.getText(), txt6.getText())){
            
                showMessage("Datos incorrectos", "Error al eliminar la venta", JOptionPane.ERROR_MESSAGE);
                return;
            } 
                           
            if(new Logic().deleteSale(sale)){ 
                
                sale = null;
                showMessage("Venta eliminada con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                
                refreshTable("Eliminar venta");
           
                cleanData();
                
            } else {
                
                showMessage("Datos incorrectos", "Error al eliminar la venta", JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(btn1.getText().equals("Modificar vendedor")){
            
            employee = new Employee();
            
            String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            String idCard = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            String name = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            String lastName = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            String phone = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
            String username = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
            String password = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6));
                          
            txt1.setText(idCard);
            txt2.setText(name);
            txt3.setText(lastName);
            txt4.setText(phone);
            txt5.setText(username);
            txt6.setText(password);
            
            employee.setId(id);
            
            
        } else if(btn1.getText().equals("Eliminar vendedor")){
        
            employee = new Employee();
            
            String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            String idCard = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            String name = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            String lastName = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            String phone = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
            String username = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
            String password = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6));
                          
            txt1.setText(idCard);
            txt2.setText(name);
            txt3.setText(lastName);
            txt4.setText(phone);
            txt5.setText(username);
            txt6.setText(password);
            
            employee.setId(id);
        
        } else if(btn1.getText().equals("Modificar cliente")){
        
            customer = new Customer();
            
            String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            String idCard = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            String name = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            String lastName = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            String phone = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
                                      
            txt1.setText(idCard);
            txt2.setText(name);
            txt3.setText(lastName);
            txt4.setText(phone);
            
            customer.setId(id);
        
        } else if(btn1.getText().equals("Eliminar cliente")){
        
            customer = new Customer();
            
            String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            String idCard = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            String name = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            String lastName = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            String phone = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
                                      
            txt1.setText(idCard);
            txt2.setText(name);
            txt3.setText(lastName);
            txt4.setText(phone);
            
            customer.setId(id);
                    
        } else if(btn1.getText().equals("Modificar articulo")){
        
            article = new Article();
            
            String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            String brand = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            String description = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            String category = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            String quantity = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
            String price = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
    
            txt1.setText(brand.toUpperCase());
            txt2.setText(description.toUpperCase());
            txt3.setText(category.toUpperCase());
            txt4.setText(quantity);
            txt5.setText(price);
            txt6.setText(id);
            
            article.setId(id);
        
        } else if(btn1.getText().equals("Eliminar articulo")){
        
            article = new Article();
            
            String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            String brand = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            String description = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            String category = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            String quantity = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
            String price = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
                                      
            txt1.setText(brand);
            txt2.setText(description);
            txt3.setText(category); 
            txt4.setText(quantity);
            txt5.setText(price);
            txt6.setText(id);
            
            article.setId(id);
                    
        } else if(btn1.getText().equals("Modificar venta")){
        
            sale = new Sale();
            
            String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            String employee = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            String customer = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            String subTotal = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            String discount = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
            String articles = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
            String total = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6));
    
            txt1.setText(employee);
            txt2.setText(customer);
            txt3.setText(subTotal);
            txt4.setText(discount);
            txt5.setText(articles);
            txt6.setText(total);
            
            sale.setId(id);
        
        } else if(btn1.getText().equals("Eliminar venta")){
        
            sale = new Sale();
            
            String id = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            String employee = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            String customer = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            String subTotal = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            String discount = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
            String articles = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
            String total = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6));
    
            txt1.setText(employee);
            txt2.setText(customer);
            txt3.setText(subTotal);
            txt4.setText(discount);
            txt5.setText(articles);
            txt6.setText(total);
            
            sale.setId(id);
                    
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void txt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != evt.VK_BACK_SPACE) {
         
            evt.consume();
						
        }
    }//GEN-LAST:event_txt4KeyTyped

    //Agregar vendedor
    public void createEmployee(){
    
        Employee employee = new Employee();
        
        if(!isEmpty(txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),txt5.getText(),txt6.getText())){
            //Seteando la entidad
            employee.setIdCard(txt1.getText());
            employee.setName(txt2.getText());
            employee.setLastName(txt3.getText());
            employee.setPhone(txt4.getText());
            employee.setUserName(txt5.getText());
            employee.setPassword(new LogicEncriptator().encriptation(txt6.getText()));
            
            if(!new Logic().isRepeat(employee)){
            
                 showMessage("Datos incorrectos", "Error al guardar vendedor", JOptionPane.ERROR_MESSAGE);
            
            } else {
        
                 showMessage("Vendedor agregado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                 cleanData();
            }
            
        } else {
            showMessage("Datos incorrectos", "Error al guardar vendedor", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Crear cliente
    public void createCustomer(){
    
        Customer customer = new Customer();
        
        if(!isEmpty(txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),",",".")){
            //Seteando la entidad
            customer.setIdCard(txt1.getText());
            customer.setName(txt2.getText());
            customer.setLastName(txt3.getText());
            customer.setPhone(txt4.getText());
            
            
            if(!new Logic().customerIsRepeat(customer)){ 
            
                 showMessage("Datos incorrectos", "Error al guardar cliente", JOptionPane.ERROR_MESSAGE);
            
            } else {
        
                 showMessage("Cliente agregado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                 cleanData();
            }
            
        } else {
            showMessage("Datos incorrectos", "Error al guardar cliente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void createArticle(){
    
        Article article = new Article();
        
        if(!isEmpty(txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),txt5.getText(),".")){
            
            //Seteando la entidad
            article.setBrand(txt1.getText().toUpperCase());
            article.setDescription(txt2.getText().toUpperCase());
            article.setCategory(txt3.getText().toUpperCase());
            article.setQuantity(Integer.parseInt(txt4.getText()));
            article.setPrice(Double.parseDouble(txt5.getText()));
            
            if(!new Logic().ArticleIsRepeat(article)){ 
            
                 showMessage("Datos incorrectos", "Error al guardar el articulo", JOptionPane.ERROR_MESSAGE);
            
            } else {
        
                 showMessage("Articulo agregado con exito", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
                 cleanData();
            }
            
        } else {
            showMessage("Datos incorrectos", "Error al guardar el articulo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //Metodo para validar si algun dato esta vacio
    public boolean isEmpty(String t1, String t2, String t3, String t4, String t5, String t6){
        return t1.isBlank() || t2.isBlank() || t3.isBlank() || t4.isBlank() || t5.isBlank() || t6.isBlank();
    }
    
    //Metodo para imprimir
    public void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }
    
    //Metodo para actualizar tabla
    public void refreshTable(String buttonName){
    
        if(buttonName.equals("Eliminar vendedor") || buttonName.equals("Modificar vendedor")){
            
            jTable1.setModel(new DefaultTableModel(new Logic().allData(), new Logic().tagName()));
            
        } else if(buttonName.equals("Eliminar cliente") || buttonName.equals("Modificar cliente")){
        
            jTable1.setModel(new DefaultTableModel(new Logic().allDataCustomer(),new Logic().tagNameCustomer())); 
        
        } else if(buttonName.equals("Eliminar articulo") || buttonName.equals("Modificar articulo")){
        
            jTable1.setModel(new DefaultTableModel(new Logic().allDataArticles(), new Logic().tagNameArticles()));
        
        } else if(buttonName.equals("Eliminar venta") || buttonName.equals("Modificar venta")){
        
            jTable1.setModel(new DefaultTableModel(new Logic().allDataSales(),new Logic().tagNameSale())); 
        
        }
        
        
    }
    
    //Metodo para limpiar datos
    public void cleanData(){
    
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
        txt4.setText(null);
        txt5.setText(null);
        txt6.setText(null);

    }

    private Employee employee;
    private Customer customer;
    private Article article;
    private Sale sale;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt2;
    public javax.swing.JTextField txt3;
    public javax.swing.JTextField txt4;
    public javax.swing.JTextField txt5;
    public javax.swing.JTextField txt6;
    // End of variables declaration//GEN-END:variables
}
