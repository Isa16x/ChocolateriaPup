/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolateriapup;

import javax.swing.JOptionPane;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import org.springframework.security.crypto.bcrypt.BCrypt;
/**
 *
 * @author Isabella
 */
public class Pag1 extends javax.swing.JFrame {

    /**
     * Creates new form Pag1
     */
    private String password, hashed_pass;
    public static String username;
    public static int userID;
    Inregistrare inreg = new Inregistrare();
    
    public Pag1() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label3 = new java.awt.Label();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        label4 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        label5 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        label1.setText("Login");

        label2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        label2.setText("Username:");

        textField1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        label3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        label3.setText("Parola:");

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Ready!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        label4.setName("parolaRecuperatText"); // NOI18N
        label4.setText("Ai uitat parola?");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton2.setText("Apasa aici.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        label5.setText("Nu ai cont?");

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton3.setText("Hai sa te ajutam.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(212, 212, 212))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(33, 33, 33))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resurse/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean apasareButonInregistrare=false;
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //BUTON INREGISTRARE/ HAI SA TE AJUTAM
        apasareButonInregistrare = true;
        Inregistrare inreg = new Inregistrare();
        inreg.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
//    public boolean verify_Password(String password, String hashed_password){
//        return BCrypt.checkpw(password, hashed_password);
//    }
    private String hashPassword(String pass){
        return BCrypt.hashpw(pass, "$2a$10$bd2CCvtz9ecKmyiUN2NuWu");
        
    }
//    
     public static boolean verify_Password(
        String password,
        String hashed_password)
    {
        return BCrypt.checkpw(
            password, hashed_password);
    }
     
    
    private int getUserID(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appslabit?characterEncoding=utf8","root","root");  
            Statement stmt=con.createStatement();
        //            String strSelect = "SELECT * FROM conturi WHERE username LIKE '"+username+"' AND password LIKE '"+password+"' " ;
            PreparedStatement search = con.prepareStatement("SELECT * FROM conturi WHERE username LIKE '"+Pag1.username+"' ");
            ResultSet rst = search.executeQuery();
            while(rst.next()){
                userID = rst.getInt("client_id");
            }

            con.close();
        }catch(Exception e){ System.out.println(e);}
        return userID;
        
    }
    
    LocalDate today = LocalDate.now( );
           SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
           DateTimeFormatter df = DateTimeFormatter.ofPattern( "dd.MM.yyyy" );
    public static String loginmode;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //BUTON READY
        loginmode = "login";
         username = textField1.getText();
         password = jPasswordField1.getText();
         
//         password = this.hashPassword(password);
//        System.out.println(password);
//        if(this.Verify_Password(password, inreg.hashedPassword)){
//            
//        }
//        hashed_pass= this.hashPassword(password);
//        System.out.println("hashed introdusa parola: "+hashed_pass);
//        Inregistrare inreg = new Inregistrare();
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appslabit?characterEncoding=utf8","root","root");  
            Statement stmt=con.createStatement();
            String strUpdate = "UPDATE `conturi` SET `LastLogin` = '"+today.format(df).toString()+"' WHERE `conturi`.`username` LIKE '"+inreg.username+"' AND `Adresa Mail` LIKE '"+inreg.adresa+"' ";
            stmt.executeUpdate(strUpdate);
            con.close();
            
//            this.sendMail(to);
        }catch(Exception e){ System.out.println(e);}
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appslabit?characterEncoding=utf8","root","root");  
            Statement stmt=con.createStatement();
//            String strSelect = "SELECT * FROM conturi WHERE username LIKE '"+username+"' AND password LIKE '"+password+"' " ;
            PreparedStatement search = con.prepareStatement("SELECT * FROM conturi WHERE username LIKE '"+username+"' ");
            ResultSet rst = search.executeQuery();
            int gasitCont=0;
             loginResult = false;
             String parolaSQL;
            while(rst.next()){
                String usernameSQL= rst.getString("username");
                 parolaSQL = rst.getString("password");
                gasitCont++;
//                System.out.println("password sql : "+parolaSQL);
//                mai jos: &&parolaSQL.equalsIgnoreCase(password)
                if(apasareButonInregistrare == true){
//                    System.out.println("parola hashuita: "+ inreg.hashedPassword);
                    if( (usernameSQL.equalsIgnoreCase(username)) && this.verify_Password(password, inreg.hashedPassword)){
                        loginResult = true;
                    }else{
                        loginResult = false;
                    }
                    
                }else if(apasareButonInregistrare == false && apasareButonUitatParola == true){
                    ParolaUitata par = new ParolaUitata();
                    if(usernameSQL.equalsIgnoreCase(username) && this.verify_Password(password, par.hashed_Password_Par_Uitata)){
                        loginResult = true;
                    }else{
                        loginResult = false;
                    }
                }else if(apasareButonInregistrare == false && apasareButonUitatParola == false){
                    if(usernameSQL.equalsIgnoreCase(username) && this.verify_Password(password, parolaSQL)){
                         loginResult = true;
                    }else{
                        loginResult = false;
                    }
                }
//                
            }
            con.close();
            if(gasitCont == 0){
                JOptionPane.showMessageDialog(null, "Nu am gasit niciun cont. Va rugam reincercati.");
            }
            
        }catch(Exception e){ System.out.println(e);}
        if(loginResult){
            JOptionPane.showMessageDialog(null, "Login successful");
            UserForm user = new UserForm();
            user.show();
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Wrong username/password");
        }
//        if(username.equals("root") && password.equals("root")){
//            JOptionPane.showMessageDialog(null, "Login successful");
//        }else{
//            JOptionPane.showMessageDialog(null, "Not good");
//        }
        
        UserForm.deleteAllDB();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private boolean apasareButonUitatParola = false;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: 
        //AI UITAT PAROLA BUTON
        apasareButonUitatParola= true;
        
        ParolaUitata par = new ParolaUitata();
        par.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
        
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
            java.util.logging.Logger.getLogger(Pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pag1().setVisible(true);
            }
        });
    }
    private boolean loginResult;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}