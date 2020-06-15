package bankaotomasyonu;

import bankaotomasyonu.musteri;
import bankaotomasyonu.yetkili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame implements ActionListener {

    public login() {
        initComponents();
        jLabelHesapNo.setVisible(false);
        jTextHesapNo.setVisible(false);
        jButton1.addActionListener(this);
    }
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DOMAIN_NAME = "localhost:3306";
    static final String DB_NAME = "banka?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static final String DB_URL = "jdbc:mysql://" + DOMAIN_NAME + "/" + DB_NAME;
    static final String USER = "root";
    static final String PASS = "toor";
    private PreparedStatement preparedStatement = null;
    private Connection conn = null;
    private ResultSet res;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelIsim = new javax.swing.JLabel();
        jRadioMusteri = new javax.swing.JRadioButton();
        jRadioPersonel = new javax.swing.JRadioButton();
        jLabelSoyisim = new javax.swing.JLabel();
        jLabelSifre = new javax.swing.JLabel();
        jTextIsim = new javax.swing.JTextField();
        jTextHesapNo = new javax.swing.JTextField();
        jLabelHesapNo = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jTextSoyisim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DUMAN BANK");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 47, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DUMAN BANKA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/icn.fw.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        jLabelIsim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIsim.setText("İsim:");
        jPanel1.add(jLabelIsim, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 196, 42, -1));

        jRadioMusteri.setBackground(new java.awt.Color(0, 47, 140));
        buttonGroup1.add(jRadioMusteri);
        jRadioMusteri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioMusteri.setText("Müşteri Girişi");
        jRadioMusteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMusteriActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioMusteri, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, -1));

        jRadioPersonel.setBackground(new java.awt.Color(0, 47, 140));
        buttonGroup1.add(jRadioPersonel);
        jRadioPersonel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioPersonel.setText("Personel Girişi");
        jRadioPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPersonelActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioPersonel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 128, -1));

        jLabelSoyisim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSoyisim.setText("Soyisim:");
        jPanel1.add(jLabelSoyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 230, 64, -1));

        jLabelSifre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSifre.setText("Şifre:");
        jPanel1.add(jLabelSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 263, 43, -1));
        jPanel1.add(jTextIsim, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 193, 207, -1));
        jPanel1.add(jTextHesapNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 291, 207, -1));

        jLabelHesapNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHesapNo.setText("Hesap Numarası:");
        jPanel1.add(jLabelHesapNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 294, 120, -1));
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 260, 207, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("GİRİŞ");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 110, -1));
        jPanel1.add(jTextSoyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 227, 207, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioMusteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMusteriActionPerformed
        jLabelHesapNo.setVisible(true);
        jTextHesapNo.setVisible(true);
    }//GEN-LAST:event_jRadioMusteriActionPerformed

    private void jRadioPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPersonelActionPerformed
        jLabelHesapNo.setVisible(false);
        jTextHesapNo.setVisible(false);
    }//GEN-LAST:event_jRadioPersonelActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHesapNo;
    private javax.swing.JLabel jLabelIsim;
    private javax.swing.JLabel jLabelSifre;
    private javax.swing.JLabel jLabelSoyisim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JRadioButton jRadioMusteri;
    private javax.swing.JRadioButton jRadioPersonel;
    private javax.swing.JTextField jTextHesapNo;
    private javax.swing.JTextField jTextIsim;
    private javax.swing.JTextField jTextSoyisim;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
        char[] input = jPassword.getPassword();
        String parola = new String(input);
        String ad = jTextIsim.getText();
        String soyad = jTextSoyisim.getText();
        
        if(jRadioMusteri.isSelected()){
            login.Func f = new login.Func();
            ResultSet rs = null;
            String isim = "isim";
            rs = f.find(jTextIsim.getText());
        try {
            if(rs.next()){
                musteri Musteri = new musteri();
                Musteri.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Bu bilgilere ait bir müşterimiz bulunmamaktadır");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, JOptionPane.PLAIN_MESSAGE);
        }
        }
        
        else if (jRadioPersonel.isSelected()){
            login.Function f = new login.Function();
            ResultSet rs = null;
            String isim = "isim";
            rs = f.find(jTextIsim.getText());
        try {
            if(rs.next()){
                yetkili Yetkili = new yetkili();
                Yetkili.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Bu bilgilere ait bir personel bulunamadı");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, JOptionPane.PLAIN_MESSAGE);
        }
        }
    }
    
    public class Function{
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        public ResultSet find(String s){
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banka?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","toor");
                ps = conn.prepareStatement("select * from personel where isim = ?");
                ps.setString(1, s);
                rs = ps.executeQuery();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }return rs;
        }
    }
    
    public class Func{
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        public ResultSet find(String s){
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banka?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","toor");
                ps = conn.prepareStatement("select * from musteri where ad = ?");
                ps.setString(1, s);
                rs = ps.executeQuery();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }return rs;
        }
    }
}
