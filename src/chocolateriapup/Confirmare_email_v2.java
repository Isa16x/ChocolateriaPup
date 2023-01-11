/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolateriapup;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Isabella
 */
public class Confirmare_email_v2 extends javax.swing.JFrame {

    /**
     * Creates new form Confirmare_email_v2
     */
    public Confirmare_email_v2() {
        initComponents();
    }

    Inregistrare inreg = new Inregistrare();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        label1.setText("Va rugam introduceti codul primit pe e-mail.");

        textField1.setFont(new java.awt.Font("Times New Roman", 0, 27)); // NOI18N

        label2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        label2.setText("Nu ai primit codul? ");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton1.setText("Retrimite codul.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 0, 51));
        button1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        button1.setLabel("Inapoi");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        //BUTONU ROSU
//        Inregistrare inreg = new Inregistrare();
        inreg.show();
        dispose();
    }//GEN-LAST:event_button1ActionPerformed
    private String autentifCode, cod_introdus;
    private String generateCode(){
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        autentifCode = String.format("%06d", number);
        return autentifCode;
    }
    
    private void sendMail(String t){
        // Recipient's email ID needs to be mentioned.
      String to = t;//change accordingly

      // Sender's email ID needs to be mentioned
      String from = "chocolateriapup@gmail.com";//change accordingly
      final String username = "chocolateriapup@gmail.com";//change accordingly
      final String passwordg = "abofajsvoxpoxape";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, passwordg);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message1 = new MimeMessage(session);

         // Set From: header field of the header.
         message1.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message1.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         // Set Subject: header field
         message1.setSubject("Confirmati contul dvs.");
          autentifCode = this.generateCode();
         // Now set the actual message
         message1.setText("Buna ziua, \n \n Noi suntem Chocolateria Pup si va multumim pentru contul facut in cadrul aplicatiei noastre.\n"
            + " Mai jos se afla codul dvs. de autentificare: "+ "\n" + autentifCode + "\n\n Va rugam sa va conectati in aplicatie folosind acest cont. "
                    + "\n \n \n Echipa Chocolateria Pup.");

         // Send message
         Transport.send(message1);

         System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
    }
    
    private static int apasare_buton=0;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //BUTON RETRIMITERE COD
        apasare_buton =1;
        autentifCode = this.generateCode();
//        Inregistrare inreg = new Inregistrare();
//        inreg.username;
//        String adresa = inreg.getAdresa();
        System.out.println("username: "+inreg.username + "\n adresa: "+inreg.adresa);
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appslabit?characterEncoding=utf8","root","root");  
            Statement stmt=con.createStatement();
            String strUpdate = "UPDATE `conturi` SET `ActivatingCode` = '"+autentifCode+"' WHERE `conturi`.`username` LIKE '"+inreg.username+"' AND `Adresa Mail` LIKE '"+inreg.adresa+"' ";
            stmt.executeUpdate(strUpdate);
//            Statement stmt2 = con.createStatement();
//            PreparedStatement search = con.prepareStatement("SELECT * FROM conturi WHERE username LIKE '"+inreg.username+"' ");
//            ResultSet rst = search.executeQuery();
//            String to;
//            while(rst.next()){
////                 String to= rst.getString("Adresa Mail");
////                String parolaSQL = rst.getString("password");
//               
//            }
            this.sendMail(inreg.adresa);
//            String strSelect = "SELECT * FROM conturi WHERE username LIKE '"+username+"' AND password LIKE '"+password+"' " ;
//            PreparedStatement search = con.prepareStatement("SELECT * FROM conturi WHERE username LIKE '"+username+"' ");
            
            con.close();
            
//            this.sendMail(to);
        }catch(Exception e){ System.out.println(e);}
        JOptionPane.showMessageDialog(null, "Un alt cod a fost trimis pe adresa dvs de mail introdusa anterior.");
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //NOTIFICARE COD CORECT
    public void displayTrayCodCorect() throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
//        Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("Cod corect", "Va rugam logati-va.", TrayIcon.MessageType.INFO);
    }
    
    public void notificareCodCorect() throws AWTException {
        try{
            if (SystemTray.isSupported()) {
                Confirmare_email_v2 td = new Confirmare_email_v2();
                td.displayTrayCodCorect();
            } else {
                System.err.println("System tray not supported!");
            }
        }catch(AWTException e){System.out.println(e); }
    }
    //SFARSIT NOTIFICARE
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          // TODO add your handling code here:
        ///BUTON OK
        cod_introdus = textField1.getText();
        if(apasare_buton ==0){
//            cod_introdus = textField1.getText();
            if(inreg.generatedCode.equals(cod_introdus) ) {
//                JOptionPane.showMessageDialog(null, "Cod corect, va rog logati-va.");
                    try{  
                    
                        Class.forName("com.mysql.jdbc.Driver");  
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appslabit?characterEncoding=utf8","root","root");  
                        Statement stmt=con.createStatement();
            //            String strSelect = "SELECT * FROM conturi WHERE username LIKE '"+username+"' AND password LIKE '"+password+"' " ;
                        String active = "Active";
                        String sqlUpdate = "UPDATE `conturi` SET `Active/Inactive` = '"+active+"' WHERE `conturi`.`username` = '"+Inregistrare.username+"' AND `conturi`.`Adresa Mail` = '"+Inregistrare.adresa+"';";

                        stmt.executeUpdate(sqlUpdate);


                        con.close();
                    }catch(Exception e){ System.out.println(e);}
            try{
                this.notificareCodCorect();
            }catch(AWTException ex){
                System.out.println(ex);
            }
                Pag1 pg1 = new Pag1();
                pg1.show();
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Cod gresit, reincercati.");
            }
        }else if(apasare_buton!=0){
            if(autentifCode.equals(cod_introdus)){
                JOptionPane.showMessageDialog(null, "Cod corect, va rog logati-va.");
                Pag1 pg1 = new Pag1();
                pg1.show();
                dispose();
            }else{
             JOptionPane.showMessageDialog(null, "Cod gresit, reincercati.");
            }
        }
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
            java.util.logging.Logger.getLogger(Confirmare_email_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmare_email_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmare_email_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmare_email_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmare_email_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
