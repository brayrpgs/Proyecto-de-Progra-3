/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import domain.Employee;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import logic.Logic;
import logic.LogicEncriptator;

/**
 *
 * @author brayrpgs
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_name = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        psw_password = new javax.swing.JPasswordField();
        tf_user = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Inventario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 520));
        setName("Login"); // NOI18N
        setSize(new java.awt.Dimension(800, 520));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        lbl_name.setBackground(java.awt.Color.white);
        lbl_name.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbl_name.setForeground(java.awt.Color.white);
        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_name.setText("Nombre de Usuario");
        lbl_name.setToolTipText("nombre de usuario registrado en el sistema previamente");

        lbl_pass.setBackground(java.awt.Color.white);
        lbl_pass.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lbl_pass.setForeground(java.awt.Color.white);
        lbl_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pass.setText("Contraseña");

        psw_password.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        psw_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                psw_passwordKeyTyped(evt);
            }
        });

        tf_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user.setAutoscrolls(false);

        btn_login.setText("Iniciar sesion");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        background.setMinimumSize(new java.awt.Dimension(800, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_name)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psw_password, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lbl_name)
                .addGap(18, 18, 18)
                .addComponent(tf_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lbl_pass)
                .addGap(18, 18, 18)
                .addComponent(psw_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        if ((tf_user.getText().isBlank() || tf_user.getText().isEmpty()) || this.psw_password.getPassword().length == 0) {
            showMessage("Los datos estan incorrectos o incompletos", "Error al iniciar sesion", JOptionPane.WARNING_MESSAGE);
           

          
        } else {

            Employee employee = new Employee();

            employee.setUserName(tf_user.getText());
            employee.setPassword(new LogicEncriptator().encriptation(String.valueOf(psw_password.getPassword())));
            
            if (new Logic().isEmployee(employee)) {
                dispose();
                PrincipalGUI pGUI = new PrincipalGUI();
                pGUI.employee = new Logic().getEmployee(employee);
            } else {

                showMessage("Los datos estan incorrectos o incompletos", "Error al iniciar sesion", JOptionPane.WARNING_MESSAGE);
             
            }

        }


    }//GEN-LAST:event_btn_loginActionPerformed
    public void resizeImage(JLabel label) {
        // TODO add your handling code here:
        //optengo la direccion de la imagen
        ImageIcon URL = (ImageIcon) label.getIcon();
        ImageIcon image = new ImageIcon(URL.getDescription().replace("file:", ""));
        //la redimenciono
        image.setImage(image.getImage().getScaledInstance(getWidth(), getHeight(), 4));
        //coloco la imagen
        label.setIcon(image);
    }

    public void resizeImage(JButton label) {
        // TODO add your handling code here:
        //optengo la direccion de la imagen
        ImageIcon URL = (ImageIcon) label.getIcon();
        ImageIcon image = new ImageIcon(URL.getDescription().replace("file:", ""));
        //la redimenciono
        image.setImage(image.getImage().getScaledInstance(getWidth(), getHeight(), 4));
        //coloco la imagen
        label.setIcon(image);
    }

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        resizeImage(background);
    }//GEN-LAST:event_formComponentResized

    private void psw_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psw_passwordKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == 10) {
            btn_login.doClick();
        }
    }//GEN-LAST:event_psw_passwordKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JPasswordField psw_password;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
