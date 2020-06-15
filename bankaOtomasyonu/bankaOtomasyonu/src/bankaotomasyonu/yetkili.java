package bankaotomasyonu;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Date;
import java.text.DateFormat;

public class yetkili extends javax.swing.JFrame {
    public yetkili() {
        initComponents();
        TabloDoldur();
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
            String sql = "select * from musteri";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            jTableBilgileri.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextKAd = new javax.swing.JTextField();
        jTextKSoyad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextKTc = new javax.swing.JTextField();
        jTextKTelNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateKDogumT = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jTextKAdres = new javax.swing.JTextField();
        jBtnKayit = new javax.swing.JButton();
        jBtnTemizle = new javax.swing.JButton();
        jBtnCikis = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBilgileri = new javax.swing.JTable();
        jBtnGuncelle = new javax.swing.JButton();
        jTextBAdres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateBDogumT = new com.toedter.calendar.JDateChooser();
        jTextBTelNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextBtc = new javax.swing.JTextField();
        jTextBSoyad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextBAd = new javax.swing.JTextField();
        jBtnSil = new javax.swing.JButton();
        jTextBHesapNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unutma Sen Bu Ekibin Bir Parçasısın!!!");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 47, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ad:");

        jTextKAd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextKSoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soyad:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("T.C.");

        jTextKTc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextKTelNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefon Numarası:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Doğum Tarihi:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Adres:");

        jTextKAdres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jBtnKayit.setBackground(new java.awt.Color(51, 204, 0));
        jBtnKayit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnKayit.setText("Kayıt Ekle");
        jBtnKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnKayitActionPerformed(evt);
            }
        });

        jBtnTemizle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnTemizle.setText("Temizle");
        jBtnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTemizleActionPerformed(evt);
            }
        });

        jBtnCikis.setBackground(new java.awt.Color(255, 0, 0));
        jBtnCikis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnCikis.setText("Çıkış");
        jBtnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCikisActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/icn2.fw_1.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MÜŞTERİ KAYIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextKAd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextKSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextKTc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextKTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jDateKDogumT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextKAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jBtnKayit)
                        .addGap(37, 37, 37)
                        .addComponent(jBtnTemizle)
                        .addGap(45, 45, 45)
                        .addComponent(jBtnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addGap(25, 25, 25))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDateKDogumT, jTextKAd, jTextKSoyad, jTextKTc, jTextKTelNo});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jTextKAd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextKSoyad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextKTc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextKTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateKDogumT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextKAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnKayit)
                    .addComponent(jBtnTemizle)
                    .addComponent(jBtnCikis))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Müşteri Kayıt", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        jTableBilgileri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableBilgileri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Hesap Numarası", "Ad", "Soyad", "T.C.", "Telefon Numarası", "Doğum Tarihi", "Adreas"
            }
        ));
        jTableBilgileri.setColumnSelectionAllowed(true);
        jTableBilgileri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBilgileriMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableBilgileriMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableBilgileri);
        jTableBilgileri.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jBtnGuncelle.setBackground(new java.awt.Color(0, 47, 140));
        jBtnGuncelle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnGuncelle.setText("Güncelle");
        jBtnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuncelleActionPerformed(evt);
            }
        });

        jTextBAdres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Adres:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Doğum Tarihi:");

        jTextBTelNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefon Numarası:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("T.C.");

        jTextBtc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextBSoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Soyad:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ad:");

        jTextBAd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jBtnSil.setBackground(new java.awt.Color(255, 0, 0));
        jBtnSil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSil.setText("Sil");
        jBtnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSilActionPerformed(evt);
            }
        });

        jTextBHesapNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hesap Numarası:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(47, 47, 47)
                        .addComponent(jDateBDogumT, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextBHesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7))
                            .addComponent(jTextBAd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jTextBAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jBtnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDateBDogumT, jTextBAd, jTextBHesapNo, jTextBSoyad, jTextBTelNo, jTextBtc});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextBAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextBHesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextBAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextBSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextBtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextBTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jDateBDogumT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnSil)
                    .addComponent(jBtnGuncelle))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateBDogumT, jTextBAd, jTextBHesapNo, jTextBSoyad, jTextBTelNo, jTextBtc});

        jTabbedPane1.addTab("Müşteri Bilgileri", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jTableBilgileriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBilgileriMousePressed
        jTextBHesapNo.setText(jTableBilgileri.getValueAt(jTableBilgileri.getSelectedRow(), 0).toString());
        jTextBtc.setText(jTableBilgileri.getValueAt(jTableBilgileri.getSelectedRow(), 1).toString());
        jTextBAd.setText(jTableBilgileri.getValueAt(jTableBilgileri.getSelectedRow(), 2).toString());
        jTextBSoyad.setText(jTableBilgileri.getValueAt(jTableBilgileri.getSelectedRow(), 3).toString());
        jTextBTelNo.setText(jTableBilgileri.getValueAt(jTableBilgileri.getSelectedRow(), 5).toString());
        jTextBAdres.setText(jTableBilgileri.getValueAt(jTableBilgileri.getSelectedRow(), 6).toString());
        try {
            TableModel model = jTableBilgileri.getModel();
            int index = jTableBilgileri.getSelectedRow();
            java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse((String)model.getValueAt(index, 4));
            jDateBDogumT.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(yetkili.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableBilgileriMousePressed

    private void jBtnKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnKayitActionPerformed
        String tc = jTextKTc.getText();
        String ad = jTextKAd.getText();
        String soyad = jTextKSoyad.getText();
        String telNo = jTextKTelNo.getText();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tarih = sdf.format(jDateKDogumT.getDate());
        DefaultTableModel model = (DefaultTableModel) jTableBilgileri.getModel();
        model.addRow(new Object[]{tarih});
        String adres = jTextKAdres.getText();
        
            KayitEkle(tc, ad, soyad,telNo, tarih, adres); 

    }//GEN-LAST:event_jBtnKayitActionPerformed
    public void KayitEkle(String tc, String ad, String soyad, String telNo,  String tarih, String adres){
        try{
            Statement st = baglantiAc();
            String sql = "INSERT INTO banka.musteri (tc, ad, soyad, telefon, dogum_t, adres) VALUES("+
            "'" + tc + "', " +
            "'" + ad + "', " +
            "'" + soyad + "', " +
            "'" + telNo + "', " +
            "'" + tarih + "', " +
            "'" + adres + "')" ;
            st.executeUpdate(sql);
            baglantiKapat();
            TabloDoldur();
            JOptionPane.showMessageDialog(null, "Kaydınız oluşturuldu Hayırlı Olsun");
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Kayıt eklenemedi", "Kişiler Tablosu", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
       
    
    private void jBtnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuncelleActionPerformed
        String eskiNo = jTableBilgileri.getValueAt(jTableBilgileri.getSelectedRow(),0).toString();
        String tc = jTextBtc.getText();
        String ad = jTextBAd.getText();
        String soyad = jTextBSoyad.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tarih = sdf.format(jDateBDogumT.getDate());
        DefaultTableModel model = (DefaultTableModel) jTableBilgileri.getModel();
        model.addRow(new Object[]{tarih});
        String telNo = jTextBTelNo.getText();
        String adres = jTextBAdres.getText();
        
        KayitGuncelle(tc, ad, soyad, tarih, telNo, adres, eskiNo);
    }//GEN-LAST:event_jBtnGuncelleActionPerformed
    public void KayitGuncelle(String tc, String ad, String soyad, String tarih, String telNo, String adres, String eskiNo){
        try {
            Statement st = baglantiAc();
            String sql = "UPDATE banka.musteri SET " +       
            "tc='" + tc + "', " +
            "ad='" + ad + "', " +
            "soyad='" + soyad + "', " +
            "dogum_t='" + tarih + "', " +
            "telefon='" + telNo + "', " +
            "adres='" + adres + "' " +
                "WHERE hesapNo=" + eskiNo;
            st.executeUpdate(sql);
            baglantiKapat();
            TabloDoldur();
            JOptionPane.showMessageDialog(null, "Kaydınız güncellendi");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void KayitSil (String no) {
        try{
            Statement st = baglantiAc();
            st.executeUpdate("Delete FROM banka.musteri where hesapNo=" + no);
            baglantiKapat();
            TabloDoldur();
            JOptionPane.showMessageDialog(null, "Seçilen Kayıt silindi");
        }catch ( Exception e){
            JOptionPane.showConfirmDialog(null, JOptionPane.PLAIN_MESSAGE);
        }
    }
    private void jBtnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSilActionPerformed
       String no = jTableBilgileri.getValueAt(jTableBilgileri.getSelectedRow(), 0).toString();
       KayitSil(no);
    }//GEN-LAST:event_jBtnSilActionPerformed

    private void jTableBilgileriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBilgileriMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableBilgileriMouseClicked

    private void jBtnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTemizleActionPerformed
        jTextKTc.setText(" ");
        jTextKAd.setText(" ");
        jTextKSoyad.setText(" ");
        jTextKTelNo.setText(" ");
        jTextKAdres.setText(" ");
    }//GEN-LAST:event_jBtnTemizleActionPerformed

    private void jBtnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCikisActionPerformed
        JOptionPane.showMessageDialog(null, "Bugün çok çalıştınız şimdi dinlenme zamanı");        
        
        login Login = new login();
        Login.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jBtnCikisActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yetkili().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCikis;
    private javax.swing.JButton jBtnGuncelle;
    private javax.swing.JButton jBtnKayit;
    private javax.swing.JButton jBtnSil;
    private javax.swing.JButton jBtnTemizle;
    private com.toedter.calendar.JDateChooser jDateBDogumT;
    private com.toedter.calendar.JDateChooser jDateKDogumT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableBilgileri;
    private javax.swing.JTextField jTextBAd;
    private javax.swing.JTextField jTextBAdres;
    private javax.swing.JTextField jTextBHesapNo;
    private javax.swing.JTextField jTextBSoyad;
    private javax.swing.JTextField jTextBTelNo;
    private javax.swing.JTextField jTextBtc;
    private javax.swing.JTextField jTextKAd;
    private javax.swing.JTextField jTextKAdres;
    private javax.swing.JTextField jTextKSoyad;
    private javax.swing.JTextField jTextKTc;
    private javax.swing.JTextField jTextKTelNo;
    // End of variables declaration//GEN-END:variables

    private void executeSQlQery(String query, String updates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}