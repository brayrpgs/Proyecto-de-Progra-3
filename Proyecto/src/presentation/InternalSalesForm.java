/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentation;

import domain.Article;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logic.Logic;

/**
 *
 * @author kenda
 */
public class InternalSalesForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalSalesForm
     */
    public InternalSalesForm() {
        initComponents();
        
        initialize();
    }

    public void initialize(){
    
        articleList = new ArrayList<>();
        Object[] clients = new Logic().getAllDataCustomer().toArray();
        cbClient.setModel(new DefaultComboBoxModel<Object>(clients));
        jTable2.setModel(new DefaultTableModel(new Logic().allDataArticles(), new Logic().tagNameArticles()));
        jTable2.removeColumn(jTable2.getColumn("Id"));
        
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbClient = new javax.swing.JComboBox<>();
        lblClient = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBrand = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAddToCard = new javax.swing.JButton();
        lblEmployeeName = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        lblDisponibility = new javax.swing.JLabel();
        txtDisponibility = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblDiscount = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        lblDiscount1 = new javax.swing.JLabel();
        lblDiscount2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Agregar venta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 29, 219, -1));

        lblClient.setText("Cliente");
        getContentPane().add(lblClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 34, -1, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 591, -1, -1));

        txtBrand.setEditable(false);
        getContentPane().add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 34, 116, -1));

        jLabel2.setText("Vendedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 6, -1, -1));

        btnAddToCard.setText("Agregar a la canasta");
        btnAddToCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCardActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddToCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 133, -1, -1));

        lblEmployeeName.setText("nombre o ced");
        getContentPane().add(lblEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 6, -1, -1));

        lblBrand.setText("Marca");
        getContentPane().add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        lblDescription.setText("Descripcion");
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        lblCategory.setText("Categoria");
        getContentPane().add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        lblPrice.setText("Precio");
        getContentPane().add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        txtDescription.setEditable(false);
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 116, -1));

        txtCategory.setEditable(false);
        getContentPane().add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 104, -1));

        txtPrice.setEditable(false);
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 104, -1));

        lblDisponibility.setText("Disponibles");
        getContentPane().add(lblDisponibility, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 127, -1, -1));

        txtDisponibility.setEditable(false);
        getContentPane().add(txtDisponibility, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 122, 117, -1));

        lblQuantity.setText("Cantidad");
        getContentPane().add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, -1));

        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 104, -1));

        jButton2.setText("Realizar venta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 133, 137, -1));

        lblDiscount.setText("Descuento");
        getContentPane().add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 86, -1, -1));

        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountKeyTyped(evt);
            }
        });
        getContentPane().add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 81, 116, -1));

        lblDiscount1.setText("SubTotal");
        getContentPane().add(lblDiscount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        lblDiscount2.setText("0");
        getContentPane().add(lblDiscount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 86, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Marca", "Descripcion", "Categoria", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 166, 400, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 166, 440, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != evt.VK_BACK_SPACE) {
         
            evt.consume();
						
        }
        
    }//GEN-LAST:event_txtQuantityKeyTyped

    private void btnAddToCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCardActionPerformed
        // TODO add your handling code here:
        
        if(txtQuantity.getText().isEmpty() || txtBrand.getText().isEmpty() || (Integer.parseInt(txtQuantity.getText()) > Integer.parseInt(txtDisponibility.getText()))){
        
            showMessage("No se pudo agregar a la canasta.", "Error al agregar en la canasta", JOptionPane.ERROR_MESSAGE);
            
        } else {
            
        try{
            article.setQuantity(Integer.parseInt(txtQuantity.getText()));
            
        } catch(Exception e){}
        
            Object[] aux = {"Id","Marca","Descripcion","Categoria","Cantidad","Precio"}; 
                       
            if(new Logic().verifyArticle(articleList, article, Integer.parseInt(txtQuantity.getText()), Integer.parseInt(txtDisponibility.getText()))){
                
                Object[][] temp = new Logic().addArticletoCart(articleList, article);
                jTable1.setModel(new DefaultTableModel(temp, aux));
                              
            } else {
                
                showMessage("La cantidad solicitada sobrepasa la cantidad disponible", "Error al agregar al carrito", JOptionPane.ERROR_MESSAGE);
            
            }
  
        }
    }//GEN-LAST:event_btnAddToCardActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int discount = 0;
        
        if(!txtDiscount.getText().isBlank()){
               discount = Integer.parseInt(txtDiscount.getText());        
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != evt.VK_BACK_SPACE) {
         
            evt.consume();
						
        }
        
    }//GEN-LAST:event_txtDiscountKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
            article = new Article();
            
            String id = String.valueOf(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0));
            String brand = String.valueOf(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 1));
            String description = String.valueOf(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 2));
            String category = String.valueOf(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 3));
            String quantity = String.valueOf(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 4));
            String price = String.valueOf(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 5));
    
            txtBrand.setText(brand.toUpperCase());
            txtDescription.setText(description.toUpperCase());
            txtCategory.setText(category.toUpperCase());
            txtDisponibility.setText(quantity);
            txtPrice.setText(price);
            
            article.setId(id);
            article.setBrand(brand.toUpperCase());
            article.setCategory(category.toUpperCase());
            article.setDescription(description.toUpperCase());
            article.setPrice(Double.parseDouble(price));
            
        
    }//GEN-LAST:event_jTable2MouseClicked

    //Metodo para imprimir
    public void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }
    
    
    private Article article;
    private ArrayList<Article> articleList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCard;
    private javax.swing.JComboBox<Object> cbClient;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDiscount1;
    private javax.swing.JLabel lblDiscount2;
    private javax.swing.JLabel lblDisponibility;
    public javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtDisponibility;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
