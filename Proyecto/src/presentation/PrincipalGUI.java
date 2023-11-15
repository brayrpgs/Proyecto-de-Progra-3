/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import domain.Employee;
import javax.swing.table.DefaultTableModel;
import logic.Logic;

/**
 *
 * @author kenda
 */
public class PrincipalGUI extends javax.swing.JFrame {

    /**
     * Creates new form aux
     */
    public PrincipalGUI() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmEmployee = new javax.swing.JMenu();
        mntmAddEmployee = new javax.swing.JMenuItem();
        mntmReadEmployee = new javax.swing.JMenuItem();
        mntmUpdateEmployee = new javax.swing.JMenuItem();
        mntmDeleteEmployee = new javax.swing.JMenuItem();
        jmCustomer = new javax.swing.JMenu();
        mntmAddCustomer = new javax.swing.JMenuItem();
        mntmReadCustomer = new javax.swing.JMenuItem();
        mntmUpdateCustomer = new javax.swing.JMenuItem();
        mntmDeleteCustomer = new javax.swing.JMenuItem();
        jmArticles = new javax.swing.JMenu();
        mntmAddArticle = new javax.swing.JMenuItem();
        mntmReadArticle = new javax.swing.JMenuItem();
        mntmUpdateArticle = new javax.swing.JMenuItem();
        mntmDeleteArticle = new javax.swing.JMenuItem();
        jmSales = new javax.swing.JMenu();
        mntmAddSale = new javax.swing.JMenuItem();
        mntmReadSale = new javax.swing.JMenuItem();
        mntmUpdateSale = new javax.swing.JMenuItem();
        mntmDeleteSale = new javax.swing.JMenuItem();
        jmSalesReport = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        jmEmployee.setText("Vendedores");

        mntmAddEmployee.setText("Agregar vendedores");
        mntmAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmAddEmployeeActionPerformed(evt);
            }
        });
        jmEmployee.add(mntmAddEmployee);

        mntmReadEmployee.setText("Consultar vendedores");
        mntmReadEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmReadEmployeeActionPerformed(evt);
            }
        });
        jmEmployee.add(mntmReadEmployee);

        mntmUpdateEmployee.setText("Modificar vendedores");
        mntmUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmUpdateEmployeeActionPerformed(evt);
            }
        });
        jmEmployee.add(mntmUpdateEmployee);

        mntmDeleteEmployee.setText("Eliminar vendedores");
        mntmDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmDeleteEmployeeActionPerformed(evt);
            }
        });
        jmEmployee.add(mntmDeleteEmployee);

        jMenuBar1.add(jmEmployee);

        jmCustomer.setText("Clientes");

        mntmAddCustomer.setText("Agregar clientes");
        mntmAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmAddCustomerActionPerformed(evt);
            }
        });
        jmCustomer.add(mntmAddCustomer);

        mntmReadCustomer.setText("Consultar clientes");
        mntmReadCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmReadCustomerActionPerformed(evt);
            }
        });
        jmCustomer.add(mntmReadCustomer);

        mntmUpdateCustomer.setText("Modificar clientes");
        mntmUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmUpdateCustomerActionPerformed(evt);
            }
        });
        jmCustomer.add(mntmUpdateCustomer);

        mntmDeleteCustomer.setText("Eliminar clientes");
        mntmDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmDeleteCustomerActionPerformed(evt);
            }
        });
        jmCustomer.add(mntmDeleteCustomer);

        jMenuBar1.add(jmCustomer);

        jmArticles.setText("Articulos");

        mntmAddArticle.setText("Agregar articulos");
        mntmAddArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmAddArticleActionPerformed(evt);
            }
        });
        jmArticles.add(mntmAddArticle);

        mntmReadArticle.setText("Consultar articulos");
        mntmReadArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmReadArticleActionPerformed(evt);
            }
        });
        jmArticles.add(mntmReadArticle);

        mntmUpdateArticle.setText("Modificar articulos");
        mntmUpdateArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmUpdateArticleActionPerformed(evt);
            }
        });
        jmArticles.add(mntmUpdateArticle);

        mntmDeleteArticle.setText("Eliminar articulos");
        mntmDeleteArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmDeleteArticleActionPerformed(evt);
            }
        });
        jmArticles.add(mntmDeleteArticle);

        jMenuBar1.add(jmArticles);

        jmSales.setText("Ventas");

        mntmAddSale.setText("Agregar ventas");
        mntmAddSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmAddSaleActionPerformed(evt);
            }
        });
        jmSales.add(mntmAddSale);

        mntmReadSale.setText("Consultar ventas");
        jmSales.add(mntmReadSale);

        mntmUpdateSale.setText("Modificar ventas");
        jmSales.add(mntmUpdateSale);

        mntmDeleteSale.setText("Eliminar ventas");
        jmSales.add(mntmDeleteSale);

        jMenuBar1.add(jmSales);

        jmSalesReport.setText("Reportes");
        jMenuBar1.add(jmSalesReport);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void mntmAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmAddEmployeeActionPerformed
        // TODO add your handling code here:
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Agregar vendedores");
        
        //Agregando labels
        c.jLabel1.setText("Cedula");
        c.jLabel2.setText("Nombre");
        c.jLabel3.setText("Apellidos");
        c.jLabel4.setText("Telefono");
        c.jLabel5.setText("Usuario");
        c.jLabel6.setText("Contraseña");
        
        //Agregando los botones
        c.btn1.setText("Agregar vendedor");       
        c.btn2.setVisible(false);
        
        //Apagando la tabla
        c.jTable1.setVisible(false);
        c.jScrollPane1.setVisible(false);
        
        //Ajustando la ventana
        c.setSize(891, 350);
        c.show();
    }//GEN-LAST:event_mntmAddEmployeeActionPerformed

    private void mntmReadArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmReadArticleActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Mostrar articulos");
        
        //Apagando labels
        c.jLabel1.setVisible(false);
        c.jLabel2.setVisible(false);
        c.jLabel3.setVisible(false);
        c.jLabel4.setVisible(false);
        c.jLabel5.setVisible(false);
        c.jLabel6.setVisible(false);
        
        //Apagando txt
        c.txt1.setVisible(false);
        c.txt2.setVisible(false);
        c.txt3.setVisible(false);
        c.txt4.setVisible(false);
        c.txt5.setVisible(false);
        c.txt6.setVisible(false);
                
        //Apagando los botones
        c.btn2.setVisible(false);       
        c.btn1.setVisible(false);
                 
        //Datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allDataArticles(), new Logic().tagNameArticles())); 
                
        c.show();
                
    }//GEN-LAST:event_mntmReadArticleActionPerformed

    private void mntmDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmDeleteEmployeeActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Eliminar vendedores");
        
        //Agregando labels
        c.jLabel1.setText("Cedula");
        c.jLabel2.setText("Nombre");
        c.jLabel3.setText("Apellidos");
        c.jLabel4.setText("Telefono");
        c.jLabel5.setText("Usuario");
        c.jLabel6.setText("Contraseña");
        
        c.txt1.setEditable(false);
        c.txt2.setEditable(false);
        c.txt3.setEditable(false);
        c.txt4.setEditable(false);
        c.txt5.setEditable(false);
        c.txt6.setEditable(false);
              
        
        //Agregando los botones      
        c.btn2.setVisible(false);
        c.btn1.setText("Eliminar vendedor");
           
        //Falta cargar datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allData(), new Logic().tagName()));
        c.jTable1.removeColumn(c.jTable1.getColumn("Id"));
        c.jTable1.removeColumn(c.jTable1.getColumn("Contraseña"));
        
        c.show();
        
    }//GEN-LAST:event_mntmDeleteEmployeeActionPerformed

    private void mntmReadEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmReadEmployeeActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Mostrar vendedores");
        
        //Apagando labels
        c.jLabel1.setVisible(false);
        c.jLabel2.setVisible(false);
        c.jLabel3.setVisible(false);
        c.jLabel4.setVisible(false);
        c.jLabel5.setVisible(false);
        c.jLabel6.setVisible(false);
        
        //Apagando txt
        c.txt1.setVisible(false);
        c.txt2.setVisible(false);
        c.txt3.setVisible(false);
        c.txt4.setVisible(false);
        c.txt5.setVisible(false);
        c.txt6.setVisible(false);
                
        //Apagando los botones
        c.btn2.setVisible(false);       
        c.btn1.setVisible(false);
                 
        //Datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allData(), new Logic().tagName()));
        c.jTable1.removeColumn(c.jTable1.getColumn("Id"));
        c.jTable1.removeColumn(c.jTable1.getColumn("Contraseña"));
        
        c.show();
        
    }//GEN-LAST:event_mntmReadEmployeeActionPerformed

    private void mntmUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmUpdateEmployeeActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Modificar vendedores");
        
        //Agregando labels
        c.jLabel1.setText("Cedula");
        c.jLabel2.setText("Nombre");
        c.jLabel3.setText("Apellidos");
        c.jLabel4.setText("Telefono");
        c.jLabel5.setText("Usuario");
        c.jLabel6.setText("Contraseña");
        
        //Agregando los botones
        c.btn2.setVisible(false);       
        c.btn1.setText("Modificar vendedor");
           
        //Datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allData(), new Logic().tagName()));
        c.jTable1.removeColumn(c.jTable1.getColumn("Id"));
        c.jTable1.removeColumn(c.jTable1.getColumn("Contraseña"));
        
        
        c.show();
        
    }//GEN-LAST:event_mntmUpdateEmployeeActionPerformed

    private void mntmAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmAddCustomerActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Agregar clientes");
        
        //Agregando labels
        c.jLabel1.setText("Cedula");
        c.jLabel2.setText("Nombre");
        c.jLabel3.setText("Apellidos");
        c.jLabel4.setText("Telefono");
        c.jLabel5.setVisible(false);
        c.jLabel6.setVisible(false);
        c.txt5.setVisible(false);
        c.txt6.setVisible(false);
        
        //Agregando los botones
        c.btn1.setText("Agregar cliente");       
        c.btn2.setVisible(false);
        
        //Apagando la tabla
        c.jTable1.setVisible(false);
        c.jScrollPane1.setVisible(false);
        
        //Ajustando la ventana
        c.setSize(650, 350);
        c.show();
        
    }//GEN-LAST:event_mntmAddCustomerActionPerformed

    private void mntmReadCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmReadCustomerActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Mostrar clientes");
        
        //Apagando labels
        c.jLabel1.setVisible(false);
        c.jLabel2.setVisible(false);
        c.jLabel3.setVisible(false);
        c.jLabel4.setVisible(false);
        c.jLabel5.setVisible(false);
        c.jLabel6.setVisible(false);
        
        //Apagando txt
        c.txt1.setVisible(false);
        c.txt2.setVisible(false);
        c.txt3.setVisible(false);
        c.txt4.setVisible(false);
        c.txt5.setVisible(false);
        c.txt6.setVisible(false);
                
        //Apagando los botones
        c.btn2.setVisible(false);       
        c.btn1.setVisible(false);
                 
        //Datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allDataCustomer(),new Logic().tagNameCustomer())); 
        c.jTable1.removeColumn(c.jTable1.getColumn("Id"));
        
        c.show();
        
    }//GEN-LAST:event_mntmReadCustomerActionPerformed

    private void mntmUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmUpdateCustomerActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Modificar clientes");
        
        //Agregando labels
        c.jLabel1.setText("Cedula");
        c.jLabel2.setText("Nombre");
        c.jLabel3.setText("Apellidos");
        c.jLabel4.setText("Telefono");
        c.jLabel5.setVisible(false);
        c.jLabel6.setVisible(false);
        c.txt5.setEnabled(false);
        c.txt6.setEnabled(false);
        
        //Agregando los botones
        c.btn2.setVisible(false);       
        c.btn1.setText("Modificar cliente");
           
        //Datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allDataCustomer(),new Logic().tagNameCustomer())); 
        c.jTable1.removeColumn(c.jTable1.getColumn("Id"));
        
        c.show();
        
    }//GEN-LAST:event_mntmUpdateCustomerActionPerformed

    private void mntmDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmDeleteCustomerActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Eliminar clientes");
        
        //Agregando labels
        c.jLabel1.setText("Cedula");
        c.jLabel2.setText("Nombre");
        c.jLabel3.setText("Apellidos");
        c.jLabel4.setText("Telefono");
        c.jLabel5.setVisible(false);
        c.jLabel6.setVisible(false);
        c.txt5.setEnabled(false);
        c.txt6.setEnabled(false);
        
        c.txt1.setEditable(false);
        c.txt2.setEditable(false);
        c.txt3.setEditable(false);
        c.txt4.setEditable(false);
              
        
        //Agregando los botones      
        c.btn2.setVisible(false);
        c.btn1.setText("Eliminar cliente");
           
        //Falta cargar datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allDataCustomer(),new Logic().tagNameCustomer())); 
        c.jTable1.removeColumn(c.jTable1.getColumn("Id"));
        
        c.show();
        
    }//GEN-LAST:event_mntmDeleteCustomerActionPerformed

    private void mntmAddArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmAddArticleActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Agregar articulos");
        
        //Agregando labels
        c.jLabel1.setText("Marca");
        c.jLabel2.setText("Descripcion");
        c.jLabel3.setText("Categoria");
        c.jLabel4.setText("Cantidad");
        c.jLabel5.setText("Precio");
        
        c.jLabel6.setVisible(false);
        c.txt6.setVisible(false);
        
        //Agregando los botones
        c.btn1.setText("Agregar articulo");       
        c.btn2.setVisible(false);
        
        //Apagando la tabla
        c.jTable1.setVisible(false);
        c.jScrollPane1.setVisible(false);
        
        //Ajustando la ventana
        c.setSize(750, 350);
        c.show();
        
    }//GEN-LAST:event_mntmAddArticleActionPerformed

    private void mntmUpdateArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmUpdateArticleActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Modificar articulos");
        
        //Agregando labels
        c.jLabel1.setText("Marca");
        c.jLabel2.setText("Descripcion");
        c.jLabel3.setText("Categoria");
        c.jLabel4.setText("Cantidad");
        c.jLabel5.setText("Precio");
        c.jLabel6.setText("Id");
        
        c.txt6.setEditable(false);
        
        //Agregando los botones
        c.btn2.setVisible(false);       
        c.btn1.setText("Modificar articulo");
           
        //Datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allDataArticles(), new Logic().tagNameArticles())); 
        
        c.show();
        
    }//GEN-LAST:event_mntmUpdateArticleActionPerformed

    private void mntmDeleteArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmDeleteArticleActionPerformed
        // TODO add your handling code here:
        
        CRUDInternalForm c = new CRUDInternalForm();
        jDesktopPane.add(c);
        c.setTitle("Eliminar articulos");
        
        //Agregando labels
        c.jLabel1.setText("Marca");
        c.jLabel2.setText("Descripcion");
        c.jLabel3.setText("Categoria");
        c.jLabel4.setText("Cantidad");
        c.jLabel5.setText("Precio");
        c.jLabel6.setText("Id");
                
        c.txt1.setEditable(false);
        c.txt2.setEditable(false);
        c.txt3.setEditable(false);
        c.txt4.setEditable(false);
        c.txt5.setEditable(false);
        c.txt6.setEditable(false);      
        
        //Agregando los botones      
        c.btn2.setVisible(false);
        c.btn1.setText("Eliminar articulo");
           
        //Cargar datos en la tabla
        c.jTable1.setModel(new DefaultTableModel(new Logic().allDataArticles(), new Logic().tagNameArticles())); 
        
        c.show();
        
    }//GEN-LAST:event_mntmDeleteArticleActionPerformed

    private void mntmAddSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmAddSaleActionPerformed
        // TODO add your handling code here:
        
        InternalSalesForm s = new InternalSalesForm();
        s.lblEmployeeName.setText(employee.getName() + " " + employee.getLastName());
        jDesktopPane.add(s);
       
        s.show();
        
    }//GEN-LAST:event_mntmAddSaleActionPerformed
                                                                                               
    public Employee employee;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmArticles;
    private javax.swing.JMenu jmCustomer;
    private javax.swing.JMenu jmEmployee;
    private javax.swing.JMenu jmSales;
    private javax.swing.JMenu jmSalesReport;
    private javax.swing.JMenuItem mntmAddArticle;
    private javax.swing.JMenuItem mntmAddCustomer;
    private javax.swing.JMenuItem mntmAddEmployee;
    private javax.swing.JMenuItem mntmAddSale;
    private javax.swing.JMenuItem mntmDeleteArticle;
    private javax.swing.JMenuItem mntmDeleteCustomer;
    private javax.swing.JMenuItem mntmDeleteEmployee;
    private javax.swing.JMenuItem mntmDeleteSale;
    private javax.swing.JMenuItem mntmReadArticle;
    private javax.swing.JMenuItem mntmReadCustomer;
    private javax.swing.JMenuItem mntmReadEmployee;
    private javax.swing.JMenuItem mntmReadSale;
    private javax.swing.JMenuItem mntmUpdateArticle;
    private javax.swing.JMenuItem mntmUpdateCustomer;
    private javax.swing.JMenuItem mntmUpdateEmployee;
    private javax.swing.JMenuItem mntmUpdateSale;
    // End of variables declaration//GEN-END:variables
}
