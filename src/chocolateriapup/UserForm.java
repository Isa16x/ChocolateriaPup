/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolateriapup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Isabella
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form UserForm
     */
    
    public UserForm() {
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
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buton_prajituri = new java.awt.Button();
        buton_ornamente = new java.awt.Button();
        buton_torturi = new java.awt.Button();
        buton_ornamente1 = new java.awt.Button();
        buton_praj_japoneze = new java.awt.Button();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resurse/logo.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));

        buton_prajituri.setBackground(new java.awt.Color(255, 153, 153));
        buton_prajituri.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        buton_prajituri.setLabel("Prajituri");
        buton_prajituri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_prajituriActionPerformed(evt);
            }
        });

        buton_ornamente.setBackground(new java.awt.Color(255, 153, 153));
        buton_ornamente.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        buton_ornamente.setLabel("Ornamente");
        buton_ornamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_ornamenteActionPerformed(evt);
            }
        });

        buton_torturi.setBackground(new java.awt.Color(255, 153, 153));
        buton_torturi.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        buton_torturi.setLabel("Torturi");
        buton_torturi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_torturiActionPerformed(evt);
            }
        });

        buton_ornamente1.setBackground(new java.awt.Color(0, 204, 153));
        buton_ornamente1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        buton_ornamente1.setLabel("Cos de cumparaturi");

        buton_praj_japoneze.setBackground(new java.awt.Color(255, 153, 153));
        buton_praj_japoneze.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        buton_praj_japoneze.setLabel("Prajituri japoneze");
        buton_praj_japoneze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_praj_japonezeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buton_ornamente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_torturi, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_prajituri, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(buton_praj_japoneze, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_ornamente1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(970, 970, 970))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton_prajituri, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buton_torturi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buton_ornamente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buton_praj_japoneze, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(buton_ornamente1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void deleteAllDB(){
         try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appslabit?characterEncoding=utf8","root","root");  
            Statement stmt=con.createStatement();
            String strUpdate = "Delete from `cart_item`";
            stmt.executeUpdate(strUpdate);
            con.close();
            
//            this.sendMail(to);
        }catch(Exception e){ System.out.println(e);}
    }
    
    private void buton_prajituriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_prajituriActionPerformed
        // TODO add your handling code here:
        PrajituriForm prajForm = new PrajituriForm();
        prajForm.show();
        dispose();
        
    }//GEN-LAST:event_buton_prajituriActionPerformed
    
    private void buton_torturiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_torturiActionPerformed
        // TODO add your handling code here:
        TorturiForm tort = new TorturiForm();
        tort.show();
        dispose();
        
    }//GEN-LAST:event_buton_torturiActionPerformed

    private void buton_ornamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_ornamenteActionPerformed
        // TODO add your handling code here:
        OrnamenteForm orn = new OrnamenteForm();
        orn.show();
        dispose();
    }//GEN-LAST:event_buton_ornamenteActionPerformed

    private void buton_praj_japonezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_praj_japonezeActionPerformed
        // TODO add your handling code here:
        PrajituriJaponezeForm japan = new PrajituriJaponezeForm();
        japan.show();
        dispose();
    }//GEN-LAST:event_buton_praj_japonezeActionPerformed

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new UserForm().setVisible(true);
                deleteAllDB();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buton_ornamente;
    private java.awt.Button buton_ornamente1;
    private java.awt.Button buton_praj_japoneze;
    private java.awt.Button buton_prajituri;
    private java.awt.Button buton_torturi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
