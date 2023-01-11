
package chocolateriapup;
//import package org.vandeseer.integrationtest;
import java.awt.Color;
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;   
import java.io.IOException;  

import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;  
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDSimpleFont;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.*;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.joda.time.DateTime;
import rst.pdfbox.layout.text.Alignment;
import rst.pdfbox.layout.elements.render.ColumnLayout;
import rst.pdfbox.layout.elements.*;
import rst.pdfbox.layout.elements.Document;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeBodyPart;

//import de.redsix.pdfcompare.CompareResult;
//import de.redsix.pdfcompare.PdfComparator;
//import org.junit.Test;
import org.vandeseer.easytable.*;
import org.vandeseer.easytable.structure.Row;
import org.vandeseer.easytable.structure.Table;
import org.vandeseer.easytable.structure.Table.TableBuilder;
import org.vandeseer.easytable.structure.cell.ImageCell;
import org.vandeseer.easytable.structure.cell.ImageCell.ImageCellBuilder;
import org.vandeseer.easytable.structure.cell.TextCell;
import org.vandeseer.easytable.structure.cell.TextCell.TextCellBuilder;
import static org.vandeseer.easytable.settings.HorizontalAlignment.*;
import static org.vandeseer.easytable.settings.VerticalAlignment.MIDDLE;
import static org.vandeseer.easytable.settings.VerticalAlignment.TOP;

//import java.awt.color.*;



/**
 *
 * @author Isabella
 */
public class FacturareInterface extends javax.swing.JFrame {

    /**
     * Creates new form FacturareInterface
     */
    
    private static int nr_Produse;
    private static String[] cantitate_string = new String[20];
    private static String[] pret_string = new String[20];
    private static String[] produse_cart = new String[20];
    private static int[] cantitate = new int[20];
    private static double[] preturi = new double[20];
    private static int[] discount = new int[20];
    private static String[] discount_string = new String[20];
//    private static String[] preturi_string = new String[20];
//    private static String[] cantitate_string = new String[20];
    private static int nr_BD;
    
    private static void init_array(String[] cart_item){
        for(int i=0; i<cart_item.length; i++){
            cart_item[i]= "";
        }
    }
    //PENTRU AFLAREA PRODUSELOR DIN CART_ITEM
    public static void initializare_produse(){
        init_array(produse_cart);
        init_array(cantitate_string);
        init_array(pret_string);
        try{  
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appslabit?characterEncoding=utf8","root","root");  
            Statement stmt=con.createStatement();
            //SELECT * FROM conturi WHERE username LIKE '"+username+"' AND password LIKE '"+password+"'
//            String strUpdate = "Select * from produse where denumire LIKE '"+denumire+"' AND tip LIKE '"+tip+"'";
//            stmt.executeUpdate(strUpdate);
            PreparedStatement search = con.prepareStatement("Select * from `cart_item`");
            ResultSet rst = search.executeQuery();
            nr_BD=0;
            nr_Produse =0;
            int i=0;
            while(rst.next() ){
//                 String to= rst.getString("Adresa Mail");
//                String parolaSQL = rst.getString("password");
               
               nr_BD++; 
//               for(i=0;i<20;i++){
                    cantitate[i] = rst.getInt("repetare");
                    produse_cart[i] = rst.getString("denumire");
                    preturi[i] = rst.getDouble("pret");
                    cantitate_string[i] = ""+cantitate[i]+"";
                    pret_string[i] = ""+preturi[i]+"";
                    discount[i] = rst.getInt("discount");
                    discount_string[i]=""+discount[i]+"";
                    
//               }
               i++;
               nr_Produse++;
            }
            con.close();
            System.out.println("nr de prod : " +nr_BD);
//            this.sendMail(to);
        }catch(Exception e){ System.out.println(e);}
        
    }
    
    
    
    
    
    public static String nume, adresaStr, telefon, judet, tara;
    public static int id_user;
    public static void getDateClient(String username){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appslabit?characterEncoding=utf8","root","root");  
            Statement stmt=con.createStatement();
            //SELECT * FROM conturi WHERE username LIKE '"+username+"' AND password LIKE '"+password+"'
//            String strUpdate = "Select * from produse where denumire LIKE '"+denumire+"' AND tip LIKE '"+tip+"'";
//            stmt.executeUpdate(strUpdate);
            PreparedStatement search = con.prepareStatement("Select * from conturi where username LIKE '"+username+"' ");
            ResultSet rst = search.executeQuery();
            
            while(rst.next()){
//                 String to= rst.getString("Adresa Mail");
//                String parolaSQL = rst.getString("password");
                id_user= rst.getInt("client_id");
                nume = rst.getString("Nume");
                adresaStr = rst.getString("adresa_livrare");
                email =rst.getString("Adresa Mail");
                telefon = rst.getString("NrTelefon");
                judet = rst.getString("judet");
                tara= rst.getString("tara");
              
            }
            con.close();
            
//            this.sendMail(to);
        }catch(Exception e){ System.out.println(e);}
//        return nume, adresaStr;
//             return nume;
    }
    
    
    
    
    private static String accountName, accNr, accBranch, accBranchCode, mobileNo, address, debitCardNo;
    public static String email;
    LocalDate today = LocalDate.now( );
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    DateTimeFormatter df = DateTimeFormatter.ofPattern( "dd.MM.yyyy" );
    
    LocalDate dataScadenta = today.plusDays(15);
    
    
    
    private final static Color BLUE_DARK = new Color(76, 129, 190);
    private final static Color BLUE_LIGHT_1 = new Color(186, 206, 230);
    private final static Color BLUE_LIGHT_2 = new Color(218, 230, 242);

    private final static Color GRAY_LIGHT_1 = new Color(245, 245, 245);
    private final static Color GRAY_LIGHT_2 = new Color(240, 240, 240);
    private final static Color GRAY_LIGHT_3 = new Color(216, 216, 216);
    
    private final static Object[][] DATA =new Object[20][20];
//    private static void initializare_DATA(){
//        
//    }
    
//    private Table createSimpleExampleTable() {
//        
//        final TableBuilder tableBuilder = Table.builder()
//                .addColumnsOfWidth(100, 50, 50, 50)
//                .fontSize(8)
//                
//                .borderColor(Color.WHITE);
//
//        // Add the header row ...
//        tableBuilder.addRow(Row.builder()
//                .add(TextCell.builder().text("Product").horizontalAlignment(LEFT).borderWidth(1).build())
//                .add(TextCell.builder().text("2018").borderWidth(1).build())
//                .add(TextCell.builder().text("2019").borderWidth(1).build())
//                .add(TextCell.builder().text("Total").borderWidth(1).build())
//                .backgroundColor(BLUE_DARK)
//                .textColor(Color.WHITE)
//                
//                .fontSize(9)
//                .horizontalAlignment(CENTER)
//                .build());
//
//        // ... and some data rows
//        
//        double grandTotal = 0;
//        for (int i = 0; i < DATA.length; i++) {
//            final Object[] dataRow = DATA[i];
//            final double total = (double) dataRow[1] + (double) dataRow[2];
//            grandTotal += total;
//
//            tableBuilder.addRow(Row.builder()
//                    .add(TextCell.builder().text(String.valueOf(dataRow[0])).horizontalAlignment(LEFT).borderWidth(1).build())
//                    .add(TextCell.builder().text(dataRow[1] + " €").borderWidth(1).build())
//                    .add(TextCell.builder().text(dataRow[2] + " €").borderWidth(1).build())
//                    .add(TextCell.builder().text(total + " €").borderWidth(1).build())
//                    .backgroundColor(i % 2 == 0 ? BLUE_LIGHT_1 : BLUE_LIGHT_2)
//                    .horizontalAlignment(RIGHT)
//                    .build());
//        }
//
//        // Add a final row
//        tableBuilder.addRow(Row.builder()
//                .add(TextCell.builder().text("This spans over 3 cells, is right aligned and its text is so long that it even breaks. " +
//                        "Also it shows the grand total in the next cell and furthermore vertical alignment is shown:")
//                        .colSpan(3)
//                        .lineSpacing(1f)
//                        .borderWidthTop(1)
//                        .textColor(WHITE)
//                        .backgroundColor(BLUE_DARK)
//                        .fontSize(6)
//                        .font(HELVETICA_OBLIQUE)
//                        .borderWidth(1)
//                        .build())
//                .add(TextCell.builder().text(grandTotal + " €").backgroundColor(LIGHT_GRAY)
//                        .font(HELVETICA_BOLD_OBLIQUE)
//                        .verticalAlignment(TOP)
//                        .borderWidth(1)
//                        .build())
//                .horizontalAlignment(RIGHT)
//                .build());
//
//        return tableBuilder.build();
//    }

    
    
    
    public int facturaNo ;
    public void facturareInPDF_v2() throws IOException{
        facturaNo =100000;
        facturaNo++;
        getDateClient(Pag1.username);
        initializare_produse();
        PDDocument doc= new PDDocument();  
        PDPage page = new PDPage();
        doc.addPage(page);
        
        PDPageContentStream contentStream = new PDPageContentStream(doc, page);  
        String imgFileName = "C:\\Users\\User\\Desktop\\ChocolateriaPup\\src\\resurse\\logo.png";
        
        PDImageXObject pdImage = PDImageXObject.createFromFile(imgFileName, doc);
        PDRectangle mediaBox = page.getMediaBox();
        
            int iw = 140;//IMAGE WIDTH
            int ih = 90;//IMG HEIGHT
            
//            float offset = 20f; 
//                                       x                   y            imgwid imgheight
        contentStream.drawImage(pdImage, 60, mediaBox.getHeight() - 2 * 60, iw, ih);
        
        Document document = new Document();
        contentStream.beginText();
//        ColumnLayout layout = new ColumnLayout(2,10);
//        document.add(layout);
        String linie = "________________________________________________________________________________";
        
        contentStream.newLine();
        contentStream.newLineAtOffset(30,630); //
        contentStream.setFont(PDType1Font.TIMES_BOLD, 16);
        contentStream.setLeading(12.5f);  
        facturaNo++;
        String titlu = "FACTURA NR. "+ facturaNo;
        contentStream.showText(titlu);  
        contentStream.newLine();
        contentStream.newLine();
        String dataFactura = "Data facturarii: "+ today.format(df)
                +"                                                               Data scadenta: "+ dataScadenta.format(df);
        contentStream.setFont(PDType1Font.TIMES_BOLD, 14);
        contentStream.showText(dataFactura);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.showText(linie);
        contentStream.newLine();
        contentStream.newLine();
        Inregistrare inreg = new Inregistrare();
        
        contentStream.setFont(PDType1Font.TIMES_BOLD, 14);
        String adresaL1 = "Adresa inregistrata vanzator: "
                +"                                                      Detalii cumparator:";
        contentStream.showText(adresaL1);
        contentStream.newLine();
        contentStream.newLine();
        
        String adresaL2 = "CHOCOLATERIA PUP SRL"+
                "                                                       "+this.nume.toUpperCase();
        contentStream.showText(adresaL2);
        contentStream.newLine();
        contentStream.newLine();
        
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 14);
        String adresaL3 = "Romania, Ploiesti"+
                "                                                                             "+this.tara+", "+this.judet;
        contentStream.showText(adresaL3);
        contentStream.newLine();
        
        String adresaL4 = "Soseaua Bucuresti-Ploiesti, nr. 39"+
                "                                                    "+this.adresaStr;
        contentStream.showText(adresaL4);
        contentStream.newLine();
        contentStream.newLine();
        
        contentStream.setFont(PDType1Font.TIMES_BOLD, 14);
        String adresaL5 = "Detalii bancare: "+
                "                                                                             Telefon: "+this.telefon;
        contentStream.showText(adresaL5);
        contentStream.newLine();
        contentStream.newLine();
        
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 14);
        String adresaL6 = "BRD - Groupe Societe Generale"+
                "                                                   Email: "+this.email;;
        contentStream.showText(adresaL6);
        contentStream.newLine();
        
        String adresaL7 = "Romania, Ploiesti";
        contentStream.showText(adresaL7);
        contentStream.newLine();
        
        String adresaL8 = "Str. Cuza Voda, nr. 8";
        contentStream.showText(adresaL8);
        contentStream.newLine();
        contentStream.newLine();
        
        String contBancar = "IBAN: RO49 AAAA 1B31 0075 9384 0000" ;
        contentStream.showText(contBancar);
        contentStream.newLine();
        
        contentStream.showText(linie);
        contentStream.newLine();
        contentStream.newLine();
        String linieTitlu_Prod = "                                             Denumire                                    | Cantitate | Pret | Discount | #NR ";
        contentStream.showText(linieTitlu_Prod);
        contentStream.newLine();
        contentStream.newLine();
        
        contentStream.showText(linie);
        contentStream.newLine();
        contentStream.newLine();
        
        int nr=1;
        for(int i=0;i<nr_BD;i++){
            
            String spatiiProd = "";
            for(int j=1;j<=90-produse_cart[i].length();j++){
                spatiiProd +=" ";
            }
            System.out.println(" ");
            System.out.println("spatii prod: " +spatiiProd.length());
              System.out.println("prod: " + produse_cart[i].length());
            String spatiiCant="";
            for(int a=1;a<=12-cantitate_string[i].length();a++){
                spatiiCant+= " ";
            }
            System.out.println("spatii cant: " +spatiiCant.length());
              System.out.println("cant: " + cantitate_string[i].length());
            String spatiiPret="";
            for(int a=1;a<=7-pret_string[i].length();a++){
                spatiiPret+=" ";
            }
            
            System.out.println("spatii pret: " +spatiiPret.length());
              System.out.println("pret: " + pret_string[i].length());
            String spatiiDisc= "";
            for(int a=1;a<=11-discount_string[i].length();a++){
                spatiiDisc += " ";
            }
            
            System.out.println("spatii disc: " +spatiiDisc.length());
              System.out.println("disc: " +discount_string[i].length());
              
             
            String prod = this.produse_cart[i] + spatiiProd + this.cantitate_string[i] + spatiiCant + this.preturi[i] + spatiiPret + discount_string[i] + spatiiDisc + " " + nr +"/" + nr_BD + " "; 
            nr++;
            contentStream.showText(prod);
            contentStream.newLine();
            contentStream.newLine();
        }
        
        
        
        contentStream.endText();
        contentStream.close();  
        
        
        //path where the PDF file will be store  
        doc.save("C:\\Users\\User\\Desktop\\ChocolateriaPup\\src\\resurse\\FacturaImag_nr"+facturaNo+".pdf");
        
        System.out.println("pdf created.");
        
        doc.close();
    }
    
    
//    public int spatii(int length){
//        
//    }
    
    public void trimitereFactEmail(String t){
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
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));
         // Set Subject: header field
         message.setSubject("Factura din data de "+today.format(df));
           MimeBodyPart attachmentPart = new MimeBodyPart();
           MimeMultipart multipart = new MimeMultipart();
           MimeBodyPart textPart = new MimeBodyPart();
           
           try {

                File f =new File("C:\\Users\\User\\Desktop\\ChocolateriaPup\\src\\resurse\\FacturaImag_nr"+facturaNo+".pdf");
                
                attachmentPart.attachFile(f);
                textPart.setText("Buna ziua, \n\nAtasat se afla factura dvs. din data de "+today.format(df)+" cu numarul 100001\n \n \n Echipa Chocolateria Pup.");
                 multipart.addBodyPart(textPart);
                multipart.addBodyPart(attachmentPart);

            } catch (IOException e) {

                e.printStackTrace();

            }

//         // Set Subject: header field
//         message.setSubject("Factura din data de "+today.format(df));
//          
//         // Now set the actual message
//         message.setText("Buna ziua, \n\nAtasat se afla factura dvs. din data de "+today.format(df)+"cu numarul "+facturaNo+ "\n \n \n Echipa Chocolateria Pup.");
        message.setContent(multipart);
         // Send message
         Transport.send(message);

         System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
    }
    
    
    public FacturareInterface() {
        initComponents();
        accountName = "Isabela Hasnas";
        accNr = "1434526221111";
        accBranch = "Bucharest";
        accBranchCode = "17622";
        mobileNo= "0768193119";
        address = "Ploiesti, Bd. Bucuresti, nr. 39";
        email = "isabela_hasnas@yahoo.com";
        debitCardNo = "1283687374827823";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jButton1.setText("Genereaza pdf");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Trimite fact pe email");
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
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //GENEREAZA PDF BUTTON
        try{
        this.facturareInPDF_v2();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Inregistrare inreg = new Inregistrare();
        this.trimitereFactEmail(inreg.adresa);
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
            java.util.logging.Logger.getLogger(FacturareInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturareInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturareInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturareInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturareInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
