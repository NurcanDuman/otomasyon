package bankaotomasyonu;

import static bankaotomasyonu.yetkili.DB_URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class musteri extends javax.swing.JFrame implements ActionListener {
DefaultTableModel dtm = new DefaultTableModel();
    public musteri() {
        initComponents();
        jButton1.addActionListener(this);
        TabloDoldur();
        jTable1.setModel(dtm);
        dtm.setColumnIdentifiers(new String[]{"İşlem Tarihi","İşlem","Tutar"});
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
    
    public Statement baglantiAc() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    }
    
    public void baglantiKapat() throws Exception{
        conn.close();
    }
    private void TabloDoldur()
    {
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "select * from bakiye";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            conn.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelBakiye = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnCikis = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextHesap = new javax.swing.JTextField();
        jTextBakiye = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanelParaCekme = new javax.swing.JPanel();
        jTextCBakiye = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextParaCek = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBtnParaCek = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanelParaYatirma = new javax.swing.JPanel();
        jTextParaYatir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextYBakiye = new javax.swing.JTextField();
        jBtnParaYatir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanelHavale = new javax.swing.JPanel();
        jTextHavaleHesapNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextHBakiye = new javax.swing.JTextField();
        jBtnHavale = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextHavale = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanelPiyasaBilgileri = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanelHesapOzeti = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnHesapOzeti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DUMAN Banka Hoşgeldiniz");
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 0, 51));

        jPanelBakiye.setBackground(new java.awt.Color(0, 47, 140));
        jPanelBakiye.setForeground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanılabilir Bakiyeniz:");

        jBtnCikis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnCikis.setText("Çıkış");
        jBtnCikis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCikis.setMaximumSize(new java.awt.Dimension(67, 27));
        jBtnCikis.setMinimumSize(new java.awt.Dimension(67, 27));
        jBtnCikis.setPreferredSize(new java.awt.Dimension(67, 27));
        jBtnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCikisActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hesabınızın Güvenliği İçin Hesap Numaranızı Tekrar Girmeniz Gerekmektedir");

        jTextHesap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextBakiye.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Bakiye Görüntüle");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/icn2.fw_1.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("BAKİYE BİLGİSİ");

        javax.swing.GroupLayout jPanelBakiyeLayout = new javax.swing.GroupLayout(jPanelBakiye);
        jPanelBakiye.setLayout(jPanelBakiyeLayout);
        jPanelBakiyeLayout.setHorizontalGroup(
            jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBakiyeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextHesap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBakiyeLayout.createSequentialGroup()
                        .addGroup(jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBakiyeLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextBakiye, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCikis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBakiyeLayout.createSequentialGroup()
                        .addGroup(jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanelBakiyeLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel16)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBakiyeLayout.setVerticalGroup(
            jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBakiyeLayout.createSequentialGroup()
                .addGroup(jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBakiyeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(jPanelBakiyeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanelBakiyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        jTabbedPane1.addTab("Bakiye Görüntüleme", jPanelBakiye);

        jPanelParaCekme.setBackground(new java.awt.Color(51, 0, 51));

        jTextCBakiye.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kullanılabilir Bakiyeniz:");

        jTextParaCek.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Çekmek İstediğiniz Tutar:");

        jBtnParaCek.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnParaCek.setText("Onayla");
        jBtnParaCek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnParaCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnParaCekActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/icn.fw.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PARA ÇEKME");

        javax.swing.GroupLayout jPanelParaCekmeLayout = new javax.swing.GroupLayout(jPanelParaCekme);
        jPanelParaCekme.setLayout(jPanelParaCekmeLayout);
        jPanelParaCekmeLayout.setHorizontalGroup(
            jPanelParaCekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParaCekmeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelParaCekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelParaCekmeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelParaCekmeLayout.createSequentialGroup()
                        .addGroup(jPanelParaCekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelParaCekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCBakiye, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(jTextParaCek)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelParaCekmeLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelParaCekmeLayout.setVerticalGroup(
            jPanelParaCekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParaCekmeLayout.createSequentialGroup()
                .addGroup(jPanelParaCekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelParaCekmeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanelParaCekmeLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanelParaCekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanelParaCekmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jBtnParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jTabbedPane1.addTab("Para Çekme", jPanelParaCekme);

        jPanelParaYatirma.setBackground(new java.awt.Color(0, 47, 140));

        jTextParaYatir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Yatırmak İstediğiniz Tutar:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kullanılabilir Bakiyeniz:");

        jTextYBakiye.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jBtnParaYatir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnParaYatir.setText("Onayla");
        jBtnParaYatir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnParaYatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnParaYatirActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/icn2.fw_1.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PARA YATIRMA");

        javax.swing.GroupLayout jPanelParaYatirmaLayout = new javax.swing.GroupLayout(jPanelParaYatirma);
        jPanelParaYatirma.setLayout(jPanelParaYatirmaLayout);
        jPanelParaYatirmaLayout.setHorizontalGroup(
            jPanelParaYatirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParaYatirmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelParaYatirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelParaYatirmaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnParaYatir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelParaYatirmaLayout.createSequentialGroup()
                        .addGroup(jPanelParaYatirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelParaYatirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextYBakiye, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addComponent(jTextParaYatir)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelParaYatirmaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelParaYatirmaLayout.setVerticalGroup(
            jPanelParaYatirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParaYatirmaLayout.createSequentialGroup()
                .addGroup(jPanelParaYatirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelParaYatirmaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(jPanelParaYatirmaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanelParaYatirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextYBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(jPanelParaYatirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextParaYatir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jBtnParaYatir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jTabbedPane1.addTab("Para Yatırma", jPanelParaYatirma);

        jPanelHavale.setBackground(new java.awt.Color(51, 0, 51));

        jTextHavaleHesapNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Havale Yapmak İstediğiniz Hesap Numarası:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kullanılabilir Bakiyeniz:");

        jTextHBakiye.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jBtnHavale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnHavale.setText("Onayla");
        jBtnHavale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnHavale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHavaleActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Havale Notu:");

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/icn.fw.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("HAVALE");

        jTextHavale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Havale Yapmak İstediğiniz Tutar:");

        javax.swing.GroupLayout jPanelHavaleLayout = new javax.swing.GroupLayout(jPanelHavale);
        jPanelHavale.setLayout(jPanelHavaleLayout);
        jPanelHavaleLayout.setHorizontalGroup(
            jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHavaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHavaleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnHavale, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextHavaleHesapNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHavaleLayout.createSequentialGroup()
                        .addGroup(jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHavaleLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(jPanelHavaleLayout.createSequentialGroup()
                                .addGroup(jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14))
                                .addGroup(jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelHavaleLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextHBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelHavaleLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel18))))
                            .addGroup(jPanelHavaleLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(178, 178, 178)
                                .addComponent(jTextHavale, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelHavaleLayout.setVerticalGroup(
            jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHavaleLayout.createSequentialGroup()
                .addGroup(jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHavaleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(jPanelHavaleLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextHavaleHesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHavale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(17, 17, 17)
                .addGroup(jPanelHavaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jBtnHavale, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Havale", jPanelHavale);

        jPanelPiyasaBilgileri.setBackground(new java.awt.Color(0, 47, 140));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Piyasa Bilgileri");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Piyasa Bilgilerini Aktar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/icn2.fw_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanelPiyasaBilgileriLayout = new javax.swing.GroupLayout(jPanelPiyasaBilgileri);
        jPanelPiyasaBilgileri.setLayout(jPanelPiyasaBilgileriLayout);
        jPanelPiyasaBilgileriLayout.setHorizontalGroup(
            jPanelPiyasaBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiyasaBilgileriLayout.createSequentialGroup()
                .addGroup(jPanelPiyasaBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPiyasaBilgileriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel9))
                    .addGroup(jPanelPiyasaBilgileriLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPiyasaBilgileriLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jButton2)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanelPiyasaBilgileriLayout.setVerticalGroup(
            jPanelPiyasaBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiyasaBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPiyasaBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Piyasa Bilgileri", jPanelPiyasaBilgileri);

        jPanelHesapOzeti.setBackground(new java.awt.Color(51, 0, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "İşlem Tarihi", "İşlem", "Tutar"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jBtnHesapOzeti.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnHesapOzeti.setText("Hesap Özetini Görüntüle");
        jBtnHesapOzeti.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnHesapOzeti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHesapOzetiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHesapOzetiLayout = new javax.swing.GroupLayout(jPanelHesapOzeti);
        jPanelHesapOzeti.setLayout(jPanelHesapOzetiLayout);
        jPanelHesapOzetiLayout.setHorizontalGroup(
            jPanelHesapOzetiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHesapOzetiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnHesapOzeti, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanelHesapOzetiLayout.setVerticalGroup(
            jPanelHesapOzetiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHesapOzetiLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelHesapOzetiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnHesapOzeti, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hesap Özeti", jPanelHesapOzeti);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCikisActionPerformed
        JOptionPane.showMessageDialog(null, "Tekrar görüşmek dileğiyle");
        login Login = new login();
        Login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnCikisActionPerformed

    private void jBtnParaCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnParaCekActionPerformed
        String b = jTextCBakiye.getText();
        int bakiye = Integer.parseInt(b);
        String c = jTextParaCek.getText();
        int cekilen = Integer.parseInt(c);
        if ( bakiye >= cekilen){
            int sonuc = bakiye - cekilen;
            String guncel = String.valueOf(sonuc);
            jTextCBakiye.setText(guncel);
            jTextBakiye.setText(guncel);
            jTextHBakiye.setText(guncel);
            jTextYBakiye.setText(guncel);
            JOptionPane.showMessageDialog(null, "İşlem başarıyla gerçekleştirildi. Güncel bakiyeniz: "+guncel);
            String hesap = jTextHesap.getText();
            paraCek++;
            Guncelle(guncel, hesap);
        }else{
            JOptionPane.showMessageDialog(null, "Yetersiz Bakiye");
        }
    }//GEN-LAST:event_jBtnParaCekActionPerformed
    public void Guncelle(String guncel, String hesap){
        try{
            Statement st = baglantiAc();
            String sql = "UPDATE banka.bakiye SET " +
                "bakiye='" + guncel + "' " +
                    "WHERE hesapNO=" + hesap;
            st.executeUpdate(sql);
            baglantiKapat();
            TabloDoldur();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, JOptionPane.PLAIN_MESSAGE);
        }
    }
    private void jBtnParaYatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnParaYatirActionPerformed
        String b = jTextYBakiye.getText();
        int bakiye = Integer.parseInt(b);
        String yatirilan = jTextParaYatir.getText();
        int toplam = Integer.parseInt(yatirilan);
        
        int sonuc = bakiye + toplam;
        String guncel = String.valueOf(sonuc);
        jTextYBakiye.setText(guncel);
        jTextBakiye.setText(guncel);
        jTextCBakiye.setText(guncel);
        jTextHBakiye.setText(guncel);
        JOptionPane.showMessageDialog(null, "İşlem başarıyla gerçekleştirildi. Güncel bakiyeniz: "+guncel);
        paraYatir++;
        String hesap = jTextHesap.getText();
        Guncelle(guncel, hesap);
        
    }//GEN-LAST:event_jBtnParaYatirActionPerformed

    private void jBtnHavaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHavaleActionPerformed
        String b = jTextCBakiye.getText();
        int bakiye = Integer.parseInt(b);
        String havale = jTextHavale.getText();
        int gonderilen = Integer.parseInt(havale);
        String havaleHesapNo = jTextHavaleHesapNo.getText();
        if ( bakiye >= gonderilen){
            int sonuc = bakiye - gonderilen;
            String guncel = String.valueOf(sonuc);
            jTextCBakiye.setText(guncel);
            jTextBakiye.setText(guncel);
            jTextHBakiye.setText(guncel);
            jTextYBakiye.setText(guncel);
            JOptionPane.showMessageDialog(null, "İşlem başarıyla gerçekleştirildi. Güncel bakiyeniz: "+guncel);
            phavale++;
            String hesap = jTextHesap.getText();
            Havale(guncel, hesap, havaleHesapNo);
        }else{
            JOptionPane.showMessageDialog(null, "Yetersiz Bakiye");
            
        }

    }//GEN-LAST:event_jBtnHavaleActionPerformed

    public void Havale(String guncel, String hesap, String havaleHesapNo){
        try{
            Statement st = baglantiAc();
            String sql = "UPDATE banka.bakiye SET " +
                "bakiye='" + guncel + "' " +
                    "WHERE hesapNO=" + hesap;
            st.executeUpdate(sql);
            baglantiKapat();
            TabloDoldur();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Hocam bu jTextArea1 componentine merkez bankasından piyasa bilgilerini aktarmak için xml'i çok araştırıyordum ama yapamadım.");
    }//GEN-LAST:event_jButton2ActionPerformed
        int paraCek = 0;
        int paraYatir = 0;
        int phavale = 0;
        
    private void jBtnHesapOzetiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHesapOzetiActionPerformed
        Date zaman = new Date();
        System.out.println(zaman.toString());
        DateFormat sD = new SimpleDateFormat("dd");
        DateFormat sM = new SimpleDateFormat("MM");
        DateFormat sY = new SimpleDateFormat("yyyy");
        int x = Integer.parseInt(sD.format(zaman));
        int y = Integer.parseInt(sM.format(zaman));
        int z = Integer.parseInt(sY.format(zaman));
        String gun = String.valueOf(x);
        String ay = String.valueOf(y);
        String yil = String.valueOf(z);
        String para = null;
        if (paraCek != 0){
            para = "Para Cekme";
        }
        else if (paraYatir != 0){
            para = "Para Yatırma";
        }
        else if (phavale != 0){
            para = "Para Havale";
        }
    dtm.addRow(new String []{gun+"-"+ay+"-"+yil,para,jTextParaCek.getText()+jTextParaYatir.getText()+jTextHavale.getText()});
        if (paraCek != 0){
            jTextParaCek.setText(null);
            paraCek--;
        }
        else if (paraYatir != 0){
            jTextParaYatir.setText(null);
            paraYatir--;
        }
        else if (phavale != 0){
            jTextHavale.setText(null);
            phavale--;
        }
    
    
    
    }//GEN-LAST:event_jBtnHesapOzetiActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
       
    }//GEN-LAST:event_jTable1MousePressed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCikis;
    private javax.swing.JButton jBtnHavale;
    private javax.swing.JButton jBtnHesapOzeti;
    private javax.swing.JButton jBtnParaCek;
    private javax.swing.JButton jBtnParaYatir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelBakiye;
    private javax.swing.JPanel jPanelHavale;
    private javax.swing.JPanel jPanelHesapOzeti;
    private javax.swing.JPanel jPanelParaCekme;
    private javax.swing.JPanel jPanelParaYatirma;
    private javax.swing.JPanel jPanelPiyasaBilgileri;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextBakiye;
    private javax.swing.JTextField jTextCBakiye;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextHBakiye;
    private javax.swing.JTextField jTextHavale;
    private javax.swing.JTextField jTextHavaleHesapNo;
    private javax.swing.JTextField jTextHesap;
    private javax.swing.JTextField jTextParaCek;
    private javax.swing.JTextField jTextParaYatir;
    private javax.swing.JTextField jTextYBakiye;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Function f = new Function();
        ResultSet rs = null;
        String bky = "bakiye";
        rs = f.find(jTextHesap.getText());
        try {
            if(rs.next()){
                jTextBakiye.setText(rs.getString("bakiye"));
                jTextCBakiye.setText(rs.getString("bakiye"));
                jTextYBakiye.setText(rs.getString("bakiye"));
                jTextHBakiye.setText(rs.getString("bakiye"));
            }else{
                JOptionPane.showMessageDialog(null, "Bakiye Görüntülenemedi");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, JOptionPane.PLAIN_MESSAGE);
        }
    }

    private void yatir(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class Function{
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        public ResultSet find(String s){
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banka?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","toor");
                ps = conn.prepareStatement("select * from bakiye where hesapNo = ?");
                ps.setString(1, s);
                rs = ps.executeQuery();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            return rs;
        }
    }
}
