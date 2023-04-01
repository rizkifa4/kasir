/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;


/**
 *
 * @author rizki
 */
public class Kasir extends javax.swing.JFrame {

    /**
     * Creates new form Kasir
     */
     public Kasir() {
        initComponents();
    }
    
    public void diskon(){
        int A; 
        double B = 5; 
        double C = 100;
        int D;
        int E;
        A = Integer.parseInt(jumlahharga.getText());
        D =  (int) (A * B / C);
        diskon.setText(String.valueOf(D));
        E = (int) (A - D);
        totalharga.setText(String.valueOf(E));
    }
    
    public void pajak(){
        int A; 
        double B = 10; 
        double C = 100;
        int D;
        int E;
        A = Integer.parseInt(totalharga.getText());
        D =  (int) ((A * B) / C);
        pajak.setText(String.valueOf(D));
        E = (int) (A + D);
        tagihan.setText(String.valueOf(E));
    }
    
    public void pembayaran(){
       int a = Integer.parseInt(tagihan.getText());
       int b = Integer.parseInt(pembayaran.getText());
       int c;
       
       c = b - a;
       kembalian.setText(String.valueOf(c));
    }
    
    public void batal(){
        porsi_sateayam.setText("");
        sateayam.setSelected(false);       
        porsi_satekambing.setText("");
        satekambing.setSelected(false);       
        porsi_ayambakar.setText("");
        ayambakar.setSelected(false);       
        porsi_ayamopor.setText("");
        ayamopor.setSelected(false);      
        porsi_ayampenyet.setText("");
        ayampenyet.setSelected(false);      
        porsi_igasapibakar.setText("");
        igasapibakar.setSelected(false);      
        porsi_dagingbalado.setText("");
        dagingbalado.setSelected(false);       
        porsi_dagingrendang.setText("");
        dagingrendang.setSelected(false);       
        porsi_dagingsemur.setText("");
        dagingsemur.setSelected(false);      
        porsi_sopiga.setText("");
        sopiga.setSelected(false);
        porsi_sotoayam.setText("");
        sotoayam.setSelected(false);        
        porsi_sotokambing.setText("");
        sotokambing.setSelected(false);        
        porsi_sayurasam.setText("");
        sayurasam.setSelected(false);       
        porsi_sayurbayam.setText("");
        sayurbayam.setSelected(false);       
        porsi_sayurcapcay.setText("");
        sayurcapcay.setSelected(false);        
        porsi_sayurkangkung.setText("");
        sayurkangkung.setSelected(false);       
        porsi_nasiputih.setText("");
        nasiputih.setSelected(false);      
        porsi_nasigorengayam.setText("");
        nasigorengayam.setSelected(false);       
        porsi_nasigorengkambing.setText("");
        nasigorengkambing.setSelected(false);       
        porsi_nasigorengistimewa.setText("");
        nasigorengistimewa.setSelected(false);
        airtawarairtawar.setText("");
        airtawar.setSelected(false);
        airmineralairmineral.setText("");
        airmineral.setSelected(false);
        airjerukhangatairjerukhangat.setText("");
        airjerukhangat.setSelected(false);
        esbuahesbuah.setText("");
        esbuah.setSelected(false);
        escincauescincau.setText("");
        escincau.setSelected(false);
        esjerukperasesjerukperas.setText("");
        esjerukperas.setSelected(false);
        eskelapamudaeskelapamuda.setText("");
        eskelapamuda.setSelected(false);
        eskopisusueskopisusu.setText("");
        eskopisusu.setSelected(false);
        essususodaessususoda.setText("");
        essususoda.setSelected(false);
        estehmanisestehmanis.setText("");
        estehmanis.setSelected(false);
        cappucinocincaucappucinocincau.setText("");
        cappucinocincau.setSelected(false);       
        jusbuahalpukatjusbuahalpukat.setText("");
        jusbuahalpukat.setSelected(false);       
        jusbuahapeljusbuahapel.setText("");
        jusbuahapel.setSelected(false);      
        jusbuahbitjusbuahbit.setText("");
        jusbuahbit.setSelected(false);      
        jusbuahjambubijijusbuahjambubiji.setText("");
        jusbuahjambubiji.setSelected(false);       
        jusbuahmanggajusbuahmangga.setText("");
        jusbuahmangga.setSelected(false);       
        jusbuahmelonjusbuahmelon.setText("");
        jusbuahmelon.setSelected(false);        
        jusbuahnagajusbuahnaga.setText("");
        jusbuahnaga.setSelected(false);       
        jusbuahstroberijusbuahstroberi.setText("");
        jusbuahstroberi.setSelected(false);       
        jusworteltomatjusworteltomat.setText("");
        jusworteltomat.setSelected(false);
        paket1paket1.setText("");
        paket1.setSelected(false);
        paket2paket2.setText("");
        paket2.setSelected(false); 
        paket3paket3.setText("");
        paket3.setSelected(false); 
        paket4paket4.setText("");
        paket4.setSelected(false); 
        paket5paket5.setText("");
        paket5.setSelected(false); 
        paket6paket6.setText("");
        paket6.setSelected(false); 
        
        jumlahharga.setText("");
        diskon.setText("");
        totalharga.setText("");
        pajak.setText("");
        tagihan.setText("");
        pembayaran.setText("");
        kembalian.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        sateayam = new javax.swing.JCheckBox();
        satekambing = new javax.swing.JCheckBox();
        ayambakar = new javax.swing.JCheckBox();
        ayamopor = new javax.swing.JCheckBox();
        ayampenyet = new javax.swing.JCheckBox();
        igasapibakar = new javax.swing.JCheckBox();
        sopiga = new javax.swing.JCheckBox();
        sayurbayam = new javax.swing.JCheckBox();
        sayurcapcay = new javax.swing.JCheckBox();
        sotoayam = new javax.swing.JCheckBox();
        sotokambing = new javax.swing.JCheckBox();
        sayurkangkung = new javax.swing.JCheckBox();
        sayurasam = new javax.swing.JCheckBox();
        dagingrendang = new javax.swing.JCheckBox();
        dagingsemur = new javax.swing.JCheckBox();
        dagingbalado = new javax.swing.JCheckBox();
        nasigorengayam = new javax.swing.JCheckBox();
        nasigorengkambing = new javax.swing.JCheckBox();
        nasiputih = new javax.swing.JCheckBox();
        nasigorengistimewa = new javax.swing.JCheckBox();
        porsi_sateayam = new javax.swing.JTextField();
        porsi_satekambing = new javax.swing.JTextField();
        porsi_ayambakar = new javax.swing.JTextField();
        porsi_ayamopor = new javax.swing.JTextField();
        porsi_ayampenyet = new javax.swing.JTextField();
        porsi_igasapibakar = new javax.swing.JTextField();
        porsi_dagingbalado = new javax.swing.JTextField();
        porsi_dagingrendang = new javax.swing.JTextField();
        porsi_sopiga = new javax.swing.JTextField();
        porsi_sotoayam = new javax.swing.JTextField();
        porsi_sayurasam = new javax.swing.JTextField();
        porsi_sayurbayam = new javax.swing.JTextField();
        porsi_sayurcapcay = new javax.swing.JTextField();
        porsi_sayurkangkung = new javax.swing.JTextField();
        porsi_nasiputih = new javax.swing.JTextField();
        porsi_nasigorengayam = new javax.swing.JTextField();
        porsi_nasigorengkambing = new javax.swing.JTextField();
        porsi_nasigorengistimewa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        porsi_dagingsemur = new javax.swing.JTextField();
        porsi_sotokambing = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        airtawar = new javax.swing.JCheckBox();
        airmineral = new javax.swing.JCheckBox();
        airjerukhangat = new javax.swing.JCheckBox();
        estehmanis = new javax.swing.JCheckBox();
        escincau = new javax.swing.JCheckBox();
        jusbuahjambubiji = new javax.swing.JCheckBox();
        jusbuahapel = new javax.swing.JCheckBox();
        cappucinocincau = new javax.swing.JCheckBox();
        jusbuahalpukat = new javax.swing.JCheckBox();
        jusbuahmangga = new javax.swing.JCheckBox();
        essususoda = new javax.swing.JCheckBox();
        eskelapamuda = new javax.swing.JCheckBox();
        eskopisusu = new javax.swing.JCheckBox();
        jusworteltomat = new javax.swing.JCheckBox();
        jusbuahmelon = new javax.swing.JCheckBox();
        jusbuahnaga = new javax.swing.JCheckBox();
        jusbuahbit = new javax.swing.JCheckBox();
        airtawarairtawar = new javax.swing.JTextField();
        airmineralairmineral = new javax.swing.JTextField();
        airjerukhangatairjerukhangat = new javax.swing.JTextField();
        esbuahesbuah = new javax.swing.JTextField();
        escincauescincau = new javax.swing.JTextField();
        esjerukperasesjerukperas = new javax.swing.JTextField();
        eskelapamudaeskelapamuda = new javax.swing.JTextField();
        eskopisusueskopisusu = new javax.swing.JTextField();
        essususodaessususoda = new javax.swing.JTextField();
        estehmanisestehmanis = new javax.swing.JTextField();
        cappucinocincaucappucinocincau = new javax.swing.JTextField();
        jusbuahalpukatjusbuahalpukat = new javax.swing.JTextField();
        jusbuahapeljusbuahapel = new javax.swing.JTextField();
        jusbuahbitjusbuahbit = new javax.swing.JTextField();
        jusbuahjambubijijusbuahjambubiji = new javax.swing.JTextField();
        jusbuahmanggajusbuahmangga = new javax.swing.JTextField();
        jusbuahmelonjusbuahmelon = new javax.swing.JTextField();
        jusbuahnagajusbuahnaga = new javax.swing.JTextField();
        jusbuahstroberijusbuahstroberi = new javax.swing.JTextField();
        jusworteltomatjusworteltomat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        esjerukperas = new javax.swing.JCheckBox();
        esbuah = new javax.swing.JCheckBox();
        jusbuahstroberi = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bt_jumlahharga = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        batal = new javax.swing.JButton();
        jumlahharga = new javax.swing.JTextField();
        bt_diskon = new javax.swing.JButton();
        diskon = new javax.swing.JTextField();
        totalharga = new javax.swing.JTextField();
        bt_tagihan = new javax.swing.JButton();
        pajak = new javax.swing.JTextField();
        tagihan = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        pembayaran = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        paket1 = new javax.swing.JCheckBox();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        paket2paket2 = new javax.swing.JTextField();
        paket3 = new javax.swing.JCheckBox();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        paket6paket6 = new javax.swing.JTextField();
        paket6 = new javax.swing.JCheckBox();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        paket2 = new javax.swing.JCheckBox();
        jLabel76 = new javax.swing.JLabel();
        paket1paket1 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        paket3paket3 = new javax.swing.JTextField();
        paket4 = new javax.swing.JCheckBox();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        paket4paket4 = new javax.swing.JTextField();
        paket5 = new javax.swing.JCheckBox();
        jLabel84 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        paket5paket5 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Menu Makanan");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        sateayam.setBackground(new java.awt.Color(204, 255, 255));
        sateayam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sateayam.setText("Sate Ayam");
        sateayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sateayamActionPerformed(evt);
            }
        });
        jPanel2.add(sateayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, -1));

        satekambing.setBackground(new java.awt.Color(204, 255, 255));
        satekambing.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        satekambing.setText("Sate Kambing");
        satekambing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satekambingActionPerformed(evt);
            }
        });
        jPanel2.add(satekambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        ayambakar.setBackground(new java.awt.Color(204, 255, 255));
        ayambakar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ayambakar.setText("Ayam Bakar");
        ayambakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayambakarActionPerformed(evt);
            }
        });
        jPanel2.add(ayambakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        ayamopor.setBackground(new java.awt.Color(204, 255, 255));
        ayamopor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ayamopor.setText("Ayam Opor");
        ayamopor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayamoporActionPerformed(evt);
            }
        });
        jPanel2.add(ayamopor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        ayampenyet.setBackground(new java.awt.Color(204, 255, 255));
        ayampenyet.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ayampenyet.setText("Ayam Penyet");
        ayampenyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayampenyetActionPerformed(evt);
            }
        });
        jPanel2.add(ayampenyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        igasapibakar.setBackground(new java.awt.Color(204, 255, 255));
        igasapibakar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        igasapibakar.setText("Iga Sapi Bakar");
        igasapibakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igasapibakarActionPerformed(evt);
            }
        });
        jPanel2.add(igasapibakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        sopiga.setBackground(new java.awt.Color(204, 255, 255));
        sopiga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sopiga.setText("Sop Iga");
        sopiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sopigaActionPerformed(evt);
            }
        });
        jPanel2.add(sopiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, -1));

        sayurbayam.setBackground(new java.awt.Color(204, 255, 255));
        sayurbayam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sayurbayam.setText("Sayur Bayam");
        sayurbayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayurbayamActionPerformed(evt);
            }
        });
        jPanel2.add(sayurbayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 140, -1));

        sayurcapcay.setBackground(new java.awt.Color(204, 255, 255));
        sayurcapcay.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sayurcapcay.setText("Sayur Capcay");
        sayurcapcay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayurcapcayActionPerformed(evt);
            }
        });
        jPanel2.add(sayurcapcay, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 140, -1));

        sotoayam.setBackground(new java.awt.Color(204, 255, 255));
        sotoayam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sotoayam.setText("Soto Ayam");
        sotoayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotoayamActionPerformed(evt);
            }
        });
        jPanel2.add(sotoayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 140, -1));

        sotokambing.setBackground(new java.awt.Color(204, 255, 255));
        sotokambing.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sotokambing.setText("Soto Kambing");
        sotokambing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotokambingActionPerformed(evt);
            }
        });
        jPanel2.add(sotokambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 140, -1));

        sayurkangkung.setBackground(new java.awt.Color(204, 255, 255));
        sayurkangkung.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sayurkangkung.setText("Sayur Kangkung");
        sayurkangkung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayurkangkungActionPerformed(evt);
            }
        });
        jPanel2.add(sayurkangkung, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 140, -1));

        sayurasam.setBackground(new java.awt.Color(204, 255, 255));
        sayurasam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sayurasam.setText("Sayur Asam");
        sayurasam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayurasamActionPerformed(evt);
            }
        });
        jPanel2.add(sayurasam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 140, -1));

        dagingrendang.setBackground(new java.awt.Color(204, 255, 255));
        dagingrendang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dagingrendang.setText("Daging Rendang");
        dagingrendang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dagingrendangActionPerformed(evt);
            }
        });
        jPanel2.add(dagingrendang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        dagingsemur.setBackground(new java.awt.Color(204, 255, 255));
        dagingsemur.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dagingsemur.setText("Daging Semur");
        dagingsemur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dagingsemurActionPerformed(evt);
            }
        });
        jPanel2.add(dagingsemur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));

        dagingbalado.setBackground(new java.awt.Color(204, 255, 255));
        dagingbalado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dagingbalado.setText("Daging Balado");
        dagingbalado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dagingbaladoActionPerformed(evt);
            }
        });
        jPanel2.add(dagingbalado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, -1));

        nasigorengayam.setBackground(new java.awt.Color(204, 255, 255));
        nasigorengayam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nasigorengayam.setText("Nasi Goreng Ayam");
        nasigorengayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasigorengayamActionPerformed(evt);
            }
        });
        jPanel2.add(nasigorengayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 140, -1));

        nasigorengkambing.setBackground(new java.awt.Color(204, 255, 255));
        nasigorengkambing.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nasigorengkambing.setText("Nasi Goreng Kambing");
        nasigorengkambing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasigorengkambingActionPerformed(evt);
            }
        });
        jPanel2.add(nasigorengkambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 140, -1));

        nasiputih.setBackground(new java.awt.Color(204, 255, 255));
        nasiputih.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nasiputih.setText("Nasi Putih");
        nasiputih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasiputihActionPerformed(evt);
            }
        });
        jPanel2.add(nasiputih, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 140, -1));

        nasigorengistimewa.setBackground(new java.awt.Color(204, 255, 255));
        nasigorengistimewa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nasigorengistimewa.setText("Nasi Goreng Istimewa");
        nasigorengistimewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasigorengistimewaActionPerformed(evt);
            }
        });
        jPanel2.add(nasigorengistimewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 140, -1));
        jPanel2.add(porsi_sateayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 50, -1));
        jPanel2.add(porsi_satekambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 50, -1));
        jPanel2.add(porsi_ayambakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 50, -1));
        jPanel2.add(porsi_ayamopor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 50, -1));
        jPanel2.add(porsi_ayampenyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 50, -1));
        jPanel2.add(porsi_igasapibakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 50, -1));
        jPanel2.add(porsi_dagingbalado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 50, -1));
        jPanel2.add(porsi_dagingrendang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 50, -1));
        jPanel2.add(porsi_sopiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 50, -1));
        jPanel2.add(porsi_sotoayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 50, -1));
        jPanel2.add(porsi_sayurasam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 50, -1));
        jPanel2.add(porsi_sayurbayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 50, -1));
        jPanel2.add(porsi_sayurcapcay, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 50, -1));
        jPanel2.add(porsi_sayurkangkung, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 50, -1));
        jPanel2.add(porsi_nasiputih, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 50, -1));
        jPanel2.add(porsi_nasigorengayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 50, -1));
        jPanel2.add(porsi_nasigorengkambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 50, -1));
        jPanel2.add(porsi_nasigorengistimewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 50, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel23.setText("Rp. 17,000/Porsi");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel24.setText("Rp. 22,000/Porsi");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel25.setText("Rp. 13,000/Porsi");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel26.setText("Rp. 10,000/Porsi");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel27.setText("Rp. 11,000/Porsi");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel28.setText("Rp. 14,000/Porsi");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel29.setText("Rp. 10,000/Porsi");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel30.setText("Rp. 10,000/Porsi");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel31.setText("Rp. 10,000/Porsi");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel32.setText("Rp. 13,000/Porsi");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel33.setText("Rp. 15,000/Porsi");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel34.setText("Rp. 16,000/Porsi");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel35.setText("Rp. 20,000/Porsi");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel36.setText("Rp.   4,000/Porsi");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel37.setText("Rp.   8,000/Porsi");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel38.setText("Rp.   8,000/Porsi");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel39.setText("Rp.   8,000/Porsi");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel40.setText("Rp.   8,000/Porsi");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel41.setText("Rp. 20,000/Porsi");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel42.setText("Rp. 18,000/Porsi");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel43.setText("Jumlah");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jLabel44.setText("Jumlah");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel46.setText("Menu Makanan");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel2.add(porsi_dagingsemur, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 50, -1));
        jPanel2.add(porsi_sotokambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 360));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Menu Minuman");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        airtawar.setBackground(new java.awt.Color(204, 255, 255));
        airtawar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        airtawar.setText("Air Tawar");
        airtawar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airtawarActionPerformed(evt);
            }
        });
        jPanel1.add(airtawar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, -1));

        airmineral.setBackground(new java.awt.Color(204, 255, 255));
        airmineral.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        airmineral.setText("Air Mineral");
        airmineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airmineralActionPerformed(evt);
            }
        });
        jPanel1.add(airmineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        airjerukhangat.setBackground(new java.awt.Color(204, 255, 255));
        airjerukhangat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        airjerukhangat.setText("Air Jeruk Hangat");
        airjerukhangat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airjerukhangatActionPerformed(evt);
            }
        });
        jPanel1.add(airjerukhangat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        estehmanis.setBackground(new java.awt.Color(204, 255, 255));
        estehmanis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        estehmanis.setText("Es Teh Manis");
        estehmanis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estehmanisActionPerformed(evt);
            }
        });
        jPanel1.add(estehmanis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, -1));

        escincau.setBackground(new java.awt.Color(204, 255, 255));
        escincau.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        escincau.setText("Es Cincau");
        escincau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escincauActionPerformed(evt);
            }
        });
        jPanel1.add(escincau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        jusbuahjambubiji.setBackground(new java.awt.Color(204, 255, 255));
        jusbuahjambubiji.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jusbuahjambubiji.setText("Jus Buah Jambu Biji");
        jusbuahjambubiji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusbuahjambubijiActionPerformed(evt);
            }
        });
        jPanel1.add(jusbuahjambubiji, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 130, -1));

        jusbuahapel.setBackground(new java.awt.Color(204, 255, 255));
        jusbuahapel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jusbuahapel.setText("Jus Buah Apel");
        jusbuahapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusbuahapelActionPerformed(evt);
            }
        });
        jPanel1.add(jusbuahapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 130, -1));

        cappucinocincau.setBackground(new java.awt.Color(204, 255, 255));
        cappucinocincau.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cappucinocincau.setText("Cappucino Cincau");
        cappucinocincau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappucinocincauActionPerformed(evt);
            }
        });
        jPanel1.add(cappucinocincau, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 130, -1));

        jusbuahalpukat.setBackground(new java.awt.Color(204, 255, 255));
        jusbuahalpukat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jusbuahalpukat.setText("Jus Buah Alpukat");
        jusbuahalpukat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusbuahalpukatActionPerformed(evt);
            }
        });
        jPanel1.add(jusbuahalpukat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 130, -1));

        jusbuahmangga.setBackground(new java.awt.Color(204, 255, 255));
        jusbuahmangga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jusbuahmangga.setText("Jus Buah Mangga");
        jusbuahmangga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusbuahmanggaActionPerformed(evt);
            }
        });
        jPanel1.add(jusbuahmangga, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 130, -1));

        essususoda.setBackground(new java.awt.Color(204, 255, 255));
        essususoda.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        essususoda.setText("Es Susu Soda");
        essususoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                essususodaActionPerformed(evt);
            }
        });
        jPanel1.add(essususoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));

        eskelapamuda.setBackground(new java.awt.Color(204, 255, 255));
        eskelapamuda.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        eskelapamuda.setText("Es Kelapa Muda");
        eskelapamuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eskelapamudaActionPerformed(evt);
            }
        });
        jPanel1.add(eskelapamuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, -1));

        eskopisusu.setBackground(new java.awt.Color(204, 255, 255));
        eskopisusu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        eskopisusu.setText("Es Kopi Susu");
        eskopisusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eskopisusuActionPerformed(evt);
            }
        });
        jPanel1.add(eskopisusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        jusworteltomat.setBackground(new java.awt.Color(204, 255, 255));
        jusworteltomat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jusworteltomat.setText("Jus Wortel Tomat");
        jusworteltomat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusworteltomatActionPerformed(evt);
            }
        });
        jPanel1.add(jusworteltomat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 130, -1));

        jusbuahmelon.setBackground(new java.awt.Color(204, 255, 255));
        jusbuahmelon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jusbuahmelon.setText("Jus Buah Melon");
        jusbuahmelon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusbuahmelonActionPerformed(evt);
            }
        });
        jPanel1.add(jusbuahmelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 130, -1));

        jusbuahnaga.setBackground(new java.awt.Color(204, 255, 255));
        jusbuahnaga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jusbuahnaga.setText("Jus Buah Naga");
        jusbuahnaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusbuahnagaActionPerformed(evt);
            }
        });
        jPanel1.add(jusbuahnaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 130, -1));

        jusbuahbit.setBackground(new java.awt.Color(204, 255, 255));
        jusbuahbit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jusbuahbit.setText("Jus Buah Bit");
        jusbuahbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusbuahbitActionPerformed(evt);
            }
        });
        jPanel1.add(jusbuahbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 130, -1));
        jPanel1.add(airtawarairtawar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 50, -1));
        jPanel1.add(airmineralairmineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 50, -1));
        jPanel1.add(airjerukhangatairjerukhangat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 50, -1));
        jPanel1.add(esbuahesbuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 50, -1));
        jPanel1.add(escincauescincau, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 50, -1));
        jPanel1.add(esjerukperasesjerukperas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));
        jPanel1.add(eskelapamudaeskelapamuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, -1));
        jPanel1.add(eskopisusueskopisusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 50, -1));
        jPanel1.add(essususodaessususoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 50, -1));
        jPanel1.add(estehmanisestehmanis, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 50, -1));
        jPanel1.add(cappucinocincaucappucinocincau, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 50, -1));
        jPanel1.add(jusbuahalpukatjusbuahalpukat, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 50, -1));
        jPanel1.add(jusbuahapeljusbuahapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 50, -1));
        jPanel1.add(jusbuahbitjusbuahbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 50, -1));
        jPanel1.add(jusbuahjambubijijusbuahjambubiji, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 50, -1));
        jPanel1.add(jusbuahmanggajusbuahmangga, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 50, -1));
        jPanel1.add(jusbuahmelonjusbuahmelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 50, -1));
        jPanel1.add(jusbuahnagajusbuahnaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 50, -1));
        jPanel1.add(jusbuahstroberijusbuahstroberi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 50, -1));
        jPanel1.add(jusworteltomatjusworteltomat, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 50, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Rp.   2,000");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Rp.   5,000");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Rp.   5,000");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Rp. 13,000");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Rp.   4,000");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Rp.   8,000");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Rp. 16,000");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Rp. 10,000");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Rp. 10,000");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Rp. 13,000");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Rp.   4,000");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Rp. 13,000");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("Rp.   6,000");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("Rp. 11,000");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("Rp. 10,000");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setText("Rp.   8,000");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("Rp.   8,000");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setText("Rp. 10,000");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setText("Rp. 10,000");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel21.setText("Rp. 11,000");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        esjerukperas.setBackground(new java.awt.Color(204, 255, 255));
        esjerukperas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        esjerukperas.setText("Es Jeruk Peras");
        esjerukperas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esjerukperasActionPerformed(evt);
            }
        });
        jPanel1.add(esjerukperas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        esbuah.setBackground(new java.awt.Color(204, 255, 255));
        esbuah.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        esbuah.setText("Es Buah");
        esbuah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esbuahActionPerformed(evt);
            }
        });
        jPanel1.add(esbuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        jusbuahstroberi.setBackground(new java.awt.Color(204, 255, 255));
        jusbuahstroberi.setText("Jus Buah Stroberi");
        jusbuahstroberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusbuahstroberiActionPerformed(evt);
            }
        });
        jPanel1.add(jusbuahstroberi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 130, -1));

        jLabel45.setText("Minuman");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel47.setText("Menu Minuman");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel48.setText("Minuman");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 540, 360));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel49.setText("Transaksi Pembayaran");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_jumlahharga.setText("Hitung Jumlah Harga");
        bt_jumlahharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_jumlahhargaActionPerformed(evt);
            }
        });
        jPanel5.add(bt_jumlahharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 150, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel50.setText("(Rp)");
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel51.setText("Promo Diskon 5%   (Rp)");
        jPanel5.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel52.setText("Jumlah Harga");
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel53.setText("Total Harga");
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel55.setText("PPN 10%");
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel54.setText("Total Tagihan");
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        batal.setText("Hapus");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel5.add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 140));
        jPanel5.add(jumlahharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 120, -1));

        bt_diskon.setText("Total Harga");
        bt_diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_diskonActionPerformed(evt);
            }
        });
        jPanel5.add(bt_diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, -1));
        jPanel5.add(diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, -1));
        jPanel5.add(totalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, -1));

        bt_tagihan.setText("Total Tagihan");
        bt_tagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tagihanActionPerformed(evt);
            }
        });
        jPanel5.add(bt_tagihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 150, -1));
        jPanel5.add(pajak, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 120, -1));
        jPanel5.add(tagihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel56.setText("(Rp)");
        jPanel5.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel57.setText("(Rp)");
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel60.setText("(Rp)");
        jPanel5.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 180));

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel59.setText("Pembayaran");
        jPanel6.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        pembayaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pembayaranKeyReleased(evt);
            }
        });
        jPanel6.add(pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel58.setText("(Rp)");
        jPanel6.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        kembalian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kembalianKeyReleased(evt);
            }
        });
        jPanel6.add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 110, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel61.setText("Kembalian");
        jPanel6.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel62.setText("(Rp)");
        jPanel6.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 480, 50));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 30, 70));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 30, 70));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 480, 20));

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 540, 300));

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setText("Menu Paket");
        jPanel11.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        paket1.setBackground(new java.awt.Color(204, 255, 255));
        paket1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        paket1.setText("Paket 1");
        paket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paket1ActionPerformed(evt);
            }
        });
        jPanel11.add(paket1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel64.setText("Ayam Bakar");
        jPanel11.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel65.setText("Nasi Putih");
        jPanel11.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel66.setText("Rp. 27,000/Paket");
        jPanel11.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel67.setText("Jus Buah Apel");
        jPanel11.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel11.add(paket2paket2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 50, -1));

        paket3.setBackground(new java.awt.Color(204, 255, 255));
        paket3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        paket3.setText("Paket 3");
        paket3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paket3ActionPerformed(evt);
            }
        });
        jPanel11.add(paket3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel68.setText("Ayam Penyet");
        jPanel11.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel69.setText("Nasi Putih");
        jPanel11.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel70.setText("Jus Buah Stroberi");
        jPanel11.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel72.setText("Rp. 34,000/Paket");
        jPanel11.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));
        jPanel11.add(paket6paket6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 50, -1));

        paket6.setBackground(new java.awt.Color(204, 255, 255));
        paket6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        paket6.setText("Paket 6");
        paket6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paket6ActionPerformed(evt);
            }
        });
        jPanel11.add(paket6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel73.setText("Iga Sapi Bakar");
        jPanel11.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel74.setText("Jus Buah Alpukat");
        jPanel11.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel75.setText("Nasi Putih");
        jPanel11.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        paket2.setBackground(new java.awt.Color(204, 255, 255));
        paket2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        paket2.setText("Paket 2");
        paket2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paket2ActionPerformed(evt);
            }
        });
        jPanel11.add(paket2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel76.setText("Rp. 24,000/Paket");
        jPanel11.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));
        jPanel11.add(paket1paket1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 50, -1));

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel77.setText("Nasi Goreng Kambing");
        jPanel11.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel78.setText("Jus Buah Naga");
        jPanel11.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel79.setText("Rp. 25,000/Paket");
        jPanel11.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));
        jPanel11.add(paket3paket3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 50, -1));

        paket4.setBackground(new java.awt.Color(204, 255, 255));
        paket4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        paket4.setText("Paket 4");
        paket4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paket4ActionPerformed(evt);
            }
        });
        jPanel11.add(paket4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel80.setText("Sate Kambing");
        jPanel11.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel81.setText("Nasi Putih");
        jPanel11.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel82.setText("Jus Buah Melon");
        jPanel11.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel83.setText("Rp. 31,000/Paket");
        jPanel11.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));
        jPanel11.add(paket4paket4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 50, -1));

        paket5.setBackground(new java.awt.Color(204, 255, 255));
        paket5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        paket5.setText("Paket 5");
        paket5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paket5ActionPerformed(evt);
            }
        });
        jPanel11.add(paket5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel84.setText("Nasi Goreng Istimewa");
        jPanel11.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel71.setText("Es Buah");
        jPanel11.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel85.setText("Rp. 32,000/Paket");
        jPanel11.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));
        jPanel11.add(paket5paket5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 50, -1));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 610, 300));

        jPanel13.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 680, 560, -1));

        jPanel14.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        jPanel12.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 630, -1));

        jPanel16.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 560, 10));

        jPanel17.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 560, -1));

        jPanel15.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 10, 690));

        jPanel18.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 630, -1));

        jPanel19.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 690));

        jPanel20.setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 10, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sateayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sateayamActionPerformed
        // TODO add your handling code here:
        if(sateayam.isSelected()==true){
            porsi_sateayam.setEditable(true);
        }else{porsi_sateayam.setEditable(false);
            porsi_sateayam.setText("");}
    }//GEN-LAST:event_sateayamActionPerformed

    private void satekambingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satekambingActionPerformed
        // TODO add your handling code here:
        if(satekambing.isSelected()==true){
            porsi_satekambing.setEditable(true);
        }else{porsi_satekambing.setEditable(false);
            porsi_satekambing.setText("");}
    }//GEN-LAST:event_satekambingActionPerformed

    private void ayambakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayambakarActionPerformed
        // TODO add your handling code here:
        if(ayambakar.isSelected()==true){
            porsi_ayambakar.setEditable(true);
        }else{porsi_ayambakar.setEditable(false);
            porsi_ayambakar.setText("");}
    }//GEN-LAST:event_ayambakarActionPerformed

    private void ayamoporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayamoporActionPerformed
        // TODO add your handling code here:
        if(ayamopor.isSelected()==true){
            porsi_ayamopor.setEditable(true);
        }else{porsi_ayamopor.setEditable(false);
            porsi_ayamopor.setText("");}
    }//GEN-LAST:event_ayamoporActionPerformed

    private void ayampenyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayampenyetActionPerformed
        // TODO add your handling code here:
        if(ayampenyet.isSelected()==true){
            porsi_ayampenyet.setEditable(true);
        }else{porsi_ayampenyet.setEditable(false);
            porsi_ayampenyet.setText("");}
    }//GEN-LAST:event_ayampenyetActionPerformed

    private void igasapibakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igasapibakarActionPerformed
        // TODO add your handling code here:
        if(igasapibakar.isSelected()==true){
            porsi_igasapibakar.setEditable(true);
        }else{porsi_igasapibakar.setEditable(false);
            porsi_igasapibakar.setText("");}
    }//GEN-LAST:event_igasapibakarActionPerformed

    private void dagingbaladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dagingbaladoActionPerformed
        // TODO add your handling code here:
        if(dagingbalado.isSelected()==true){
            porsi_dagingbalado.setEditable(true);
        }else{porsi_dagingbalado.setEditable(false);
            porsi_dagingbalado.setText("");}
    }//GEN-LAST:event_dagingbaladoActionPerformed

    private void dagingrendangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dagingrendangActionPerformed
        // TODO add your handling code here:
        if(dagingrendang.isSelected()==true){
            porsi_dagingrendang.setEditable(true);
        }else{porsi_dagingrendang.setEditable(false);
            porsi_dagingrendang.setText("");}
    }//GEN-LAST:event_dagingrendangActionPerformed

    private void dagingsemurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dagingsemurActionPerformed
        // TODO add your handling code here:
        if(dagingsemur.isSelected()==true){
            porsi_dagingsemur.setEditable(true);
        }else{porsi_dagingsemur.setEditable(false);
            porsi_dagingsemur.setText("");}
    }//GEN-LAST:event_dagingsemurActionPerformed

    private void sopigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sopigaActionPerformed
        // TODO add your handling code here:
        if(sopiga.isSelected()==true){
            porsi_sopiga.setEditable(true);
        }else{porsi_sopiga.setEditable(false);
            porsi_sopiga.setText("");}
    }//GEN-LAST:event_sopigaActionPerformed

    private void sotoayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotoayamActionPerformed
        // TODO add your handling code here:
        if(sotoayam.isSelected()==true){
            porsi_sotoayam.setEditable(true);
        }else{porsi_sotoayam.setEditable(false);
            porsi_sotoayam.setText("");}
    }//GEN-LAST:event_sotoayamActionPerformed

    private void sotokambingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotokambingActionPerformed
        // TODO add your handling code here:
        if(sotokambing.isSelected()==true){
            porsi_sotokambing.setEditable(true);
        }else{porsi_sotokambing.setEditable(false);
            porsi_sotokambing.setText("");}
    }//GEN-LAST:event_sotokambingActionPerformed

    private void sayurasamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayurasamActionPerformed
        // TODO add your handling code here:
        if(sayurasam.isSelected()==true){
            porsi_sayurasam.setEditable(true);
        }else{porsi_sayurasam.setEditable(false);
            porsi_sayurasam.setText("");}
    }//GEN-LAST:event_sayurasamActionPerformed

    private void sayurbayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayurbayamActionPerformed
        // TODO add your handling code here:
        if(sayurbayam.isSelected()==true){
            porsi_sayurbayam.setEditable(true);
        }else{porsi_sayurbayam.setEditable(false);
            porsi_sayurbayam.setText("");}
    }//GEN-LAST:event_sayurbayamActionPerformed

    private void sayurcapcayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayurcapcayActionPerformed
        // TODO add your handling code here:
        if(sayurcapcay.isSelected()==true){
            porsi_sayurcapcay.setEditable(true);
        }else{porsi_sayurcapcay.setEditable(false);
            porsi_sayurcapcay.setText("");}
    }//GEN-LAST:event_sayurcapcayActionPerformed

    private void sayurkangkungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayurkangkungActionPerformed
        // TODO add your handling code here:
        if(sayurkangkung.isSelected()==true){
            porsi_sayurkangkung.setEditable(true);
        }else{porsi_sayurkangkung.setEditable(false);
            porsi_sayurkangkung.setText("");}
    }//GEN-LAST:event_sayurkangkungActionPerformed

    private void nasiputihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasiputihActionPerformed
        // TODO add your handling code here:
        if(nasiputih.isSelected()==true){
            porsi_nasiputih.setEditable(true);
        }else{porsi_nasiputih.setEditable(false);
            porsi_nasiputih.setText("");}
    }//GEN-LAST:event_nasiputihActionPerformed

    private void nasigorengayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasigorengayamActionPerformed
        // TODO add your handling code here:
        if(nasigorengayam.isSelected()==true){
            porsi_nasigorengayam.setEditable(true);
        }else{porsi_nasigorengayam.setEditable(false);
            porsi_nasigorengayam.setText("");}
    }//GEN-LAST:event_nasigorengayamActionPerformed

    private void nasigorengkambingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasigorengkambingActionPerformed
        // TODO add your handling code here:
        if(nasigorengkambing.isSelected()==true){
            porsi_nasigorengkambing.setEditable(true);
        }else{porsi_nasigorengkambing.setEditable(false);
            porsi_nasigorengkambing.setText("");}
    }//GEN-LAST:event_nasigorengkambingActionPerformed

    private void nasigorengistimewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasigorengistimewaActionPerformed
        // TODO add your handling code here:
        if(nasigorengistimewa.isSelected()==true){
            porsi_nasigorengistimewa.setEditable(true);
        }else{porsi_nasigorengistimewa.setEditable(false);
            porsi_nasigorengistimewa.setText("");}
    }//GEN-LAST:event_nasigorengistimewaActionPerformed

    private void airtawarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airtawarActionPerformed
        // TODO add your handling code here:
        if(airtawar.isSelected()==true){
            airtawarairtawar.setEditable(true);
        }else{airtawarairtawar.setEditable(false);
            airtawarairtawar.setText("");}
    }//GEN-LAST:event_airtawarActionPerformed

    private void airmineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airmineralActionPerformed
        // TODO add your handling code here:
        if(airmineral.isSelected()==true){
            airmineralairmineral.setEditable(true);
        }else{airmineralairmineral.setEditable(false);
            airmineralairmineral.setText("");}
    }//GEN-LAST:event_airmineralActionPerformed

    private void airjerukhangatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airjerukhangatActionPerformed
        // TODO add your handling code here:
        if(airjerukhangat.isSelected()==true){
            airjerukhangatairjerukhangat.setEditable(true);
        }else{airjerukhangatairjerukhangat.setEditable(false);
            airjerukhangatairjerukhangat.setText("");}
    }//GEN-LAST:event_airjerukhangatActionPerformed

    private void esbuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esbuahActionPerformed
        // TODO add your handling code here:
        if(esbuah.isSelected()==true){
            esbuahesbuah.setEditable(true);
        }else{esbuahesbuah.setEditable(false);
            esbuahesbuah.setText("");}
    }//GEN-LAST:event_esbuahActionPerformed

    private void escincauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escincauActionPerformed
        // TODO add your handling code here:
        if(escincau.isSelected()==true){
            escincauescincau.setEditable(true);
        }else{escincauescincau.setEditable(false);
            escincauescincau.setText("");}
    }//GEN-LAST:event_escincauActionPerformed

    private void esjerukperasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esjerukperasActionPerformed
        // TODO add your handling code here:
        if(esjerukperas.isSelected()==true){
            esjerukperasesjerukperas.setEditable(true);
        }else{esjerukperasesjerukperas.setEditable(false);
            esjerukperasesjerukperas.setText("");}
    }//GEN-LAST:event_esjerukperasActionPerformed

    private void eskelapamudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eskelapamudaActionPerformed
        // TODO add your handling code here:
        if(eskelapamuda.isSelected()==true){
            eskelapamudaeskelapamuda.setEditable(true);
        }else{eskelapamudaeskelapamuda.setEditable(false);
            eskelapamudaeskelapamuda.setText("");}
    }//GEN-LAST:event_eskelapamudaActionPerformed

    private void eskopisusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eskopisusuActionPerformed
        // TODO add your handling code here:eskopisusu
        if(eskopisusu.isSelected()==true){
            eskopisusueskopisusu.setEditable(true);
        }else{eskopisusueskopisusu.setEditable(false);
            eskopisusueskopisusu.setText("");}
    }//GEN-LAST:event_eskopisusuActionPerformed

    private void essususodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_essususodaActionPerformed
        // TODO add your handling code here:
        if(essususoda.isSelected()==true){
            essususodaessususoda.setEditable(true);
        }else{essususodaessususoda.setEditable(false);
            essususodaessususoda.setText("");}
    }//GEN-LAST:event_essususodaActionPerformed

    private void estehmanisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estehmanisActionPerformed
        // TODO add your handling code here:
        if(estehmanis.isSelected()==true){
            estehmanisestehmanis.setEditable(true);
        }else{estehmanisestehmanis.setEditable(false);
            estehmanisestehmanis.setText("");}
    }//GEN-LAST:event_estehmanisActionPerformed

    private void cappucinocincauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappucinocincauActionPerformed
        // TODO add your handling code here:
        if(cappucinocincau.isSelected()==true){
            cappucinocincaucappucinocincau.setEditable(true);
        }else{cappucinocincaucappucinocincau.setEditable(false);
            cappucinocincaucappucinocincau.setText("");}
    }//GEN-LAST:event_cappucinocincauActionPerformed

    private void jusbuahalpukatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusbuahalpukatActionPerformed
        // TODO add your handling code here:
        if(jusbuahalpukat.isSelected()==true){
            jusbuahalpukatjusbuahalpukat.setEditable(true);
        }else{jusbuahalpukatjusbuahalpukat.setEditable(false);
            jusbuahalpukatjusbuahalpukat.setText("");}
    }//GEN-LAST:event_jusbuahalpukatActionPerformed

    private void jusbuahapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusbuahapelActionPerformed
        // TODO add your handling code here:
        if(jusbuahapel.isSelected()==true){
            jusbuahapeljusbuahapel.setEditable(true);
        }else{jusbuahapeljusbuahapel.setEditable(false);
            jusbuahapeljusbuahapel.setText("");}
    }//GEN-LAST:event_jusbuahapelActionPerformed

    private void jusbuahbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusbuahbitActionPerformed
        // TODO add your handling code here:
        if(jusbuahbit.isSelected()==true){
            jusbuahbitjusbuahbit.setEditable(true);
        }else{jusbuahbitjusbuahbit.setEditable(false);
            jusbuahbitjusbuahbit.setText("");}
    }//GEN-LAST:event_jusbuahbitActionPerformed

    private void jusbuahjambubijiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusbuahjambubijiActionPerformed
        // TODO add your handling code here:
        if(jusbuahjambubiji.isSelected()==true){
            jusbuahjambubijijusbuahjambubiji.setEditable(true);
        }else{jusbuahjambubijijusbuahjambubiji.setEditable(false);
            jusbuahjambubijijusbuahjambubiji.setText("");}
    }//GEN-LAST:event_jusbuahjambubijiActionPerformed

    private void jusbuahmanggaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusbuahmanggaActionPerformed
        // TODO add your handling code here:
        if(jusbuahmangga.isSelected()==true){
            jusbuahmanggajusbuahmangga.setEditable(true);
        }else{jusbuahmanggajusbuahmangga.setEditable(false);
            jusbuahmanggajusbuahmangga.setText("");}
    }//GEN-LAST:event_jusbuahmanggaActionPerformed

    private void jusbuahmelonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusbuahmelonActionPerformed
        // TODO add your handling code here:
        if(jusbuahmelon.isSelected()==true){
            jusbuahmelonjusbuahmelon.setEditable(true);
        }else{jusbuahmelonjusbuahmelon.setEditable(false);
            jusbuahmelonjusbuahmelon.setText("");}
    }//GEN-LAST:event_jusbuahmelonActionPerformed

    private void jusbuahnagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusbuahnagaActionPerformed
        // TODO add your handling code here:
        if(jusbuahnaga.isSelected()==true){
            jusbuahnagajusbuahnaga.setEditable(true);
        }else{jusbuahnagajusbuahnaga.setEditable(false);
            jusbuahnagajusbuahnaga.setText("");}
    }//GEN-LAST:event_jusbuahnagaActionPerformed

    private void jusbuahstroberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusbuahstroberiActionPerformed
        // TODO add your handling code here:
        if(jusbuahstroberi.isSelected()==true){
            jusbuahstroberijusbuahstroberi.setEditable(true);
        }else{jusbuahstroberijusbuahstroberi.setEditable(false);
            jusbuahstroberijusbuahstroberi.setText("");}
    }//GEN-LAST:event_jusbuahstroberiActionPerformed

    private void jusworteltomatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusworteltomatActionPerformed
        // TODO add your handling code here:
        if(jusworteltomat.isSelected()==true){
            jusworteltomatjusworteltomat.setEditable(true);
        }else{jusworteltomatjusworteltomat.setEditable(false);
            jusworteltomatjusworteltomat.setText("");}
    }//GEN-LAST:event_jusworteltomatActionPerformed

    private void bt_jumlahhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_jumlahhargaActionPerformed
        // TODO add your handling code here:
        int total = 0;
        if(sateayam.isSelected()){
            String sateayam = porsi_sateayam.getText();
            int porsisateayam = Integer.parseInt(sateayam);
            int hargasateayam  = porsisateayam * 17000;
            total = total + hargasateayam;
        }
        if(satekambing.isSelected()){
            String satekambing = porsi_satekambing.getText();
            int porsisatekambing = Integer.parseInt(satekambing);
            int hargasatekambing  = porsisatekambing * 22000;
            total = total + hargasatekambing;
        }
        if(ayambakar.isSelected()){
            String ayambakar = porsi_ayambakar.getText();
            int porsiayambakar = Integer.parseInt(ayambakar);
            int hargaayambakar  = porsiayambakar * 13000;
            total = total + hargaayambakar;
        }
        if(ayamopor.isSelected()){
            String ayamopor = porsi_ayamopor.getText();
            int porsiayamopor = Integer.parseInt(ayamopor);
            int hargaayamopor  = porsiayamopor * 10000;
            total = total + hargaayamopor;
        }
        if(ayampenyet.isSelected()){
            String ayampenyet = porsi_ayampenyet.getText();
            int porsiayampenyet = Integer.parseInt(ayampenyet);
            int hargaayampenyet  = porsiayampenyet * 11000;
            total = total + hargaayampenyet;
        }
        if(igasapibakar.isSelected()){
            String igasapibakar = porsi_igasapibakar.getText();
            int porsiigasapibakar = Integer.parseInt(igasapibakar);
            int hargaigasapibakar  = porsiigasapibakar * 20000;
            total = total + hargaigasapibakar;
        }
        if(dagingbalado.isSelected()){
            String dagingbalado = porsi_dagingbalado.getText();
            int porsidagingbalado = Integer.parseInt(dagingbalado);
            int hargadagingbalado  = porsidagingbalado * 10000;
            total = total + hargadagingbalado;
        }
        if(dagingrendang.isSelected()){
            String dagingrendang = porsi_dagingrendang.getText();
            int porsidagingrendang = Integer.parseInt(dagingrendang);
            int hargadagingrendang  = porsidagingrendang * 10000;
            total = total + hargadagingrendang;
        }
        if(dagingsemur.isSelected()){
            String dagingsemur = porsi_dagingsemur.getText();
            int porsidagingsemur = Integer.parseInt(dagingsemur);
            int hargadagingsemur  = porsidagingsemur * 10000;
            total = total + hargadagingsemur;
        }
        if(sopiga.isSelected()){
            String sopiga = porsi_sopiga.getText();
            int porsisopiga = Integer.parseInt(sopiga);
            int hargasopiga  = porsisopiga * 15000;
            total = total + hargasopiga;
        }
        if(sotoayam.isSelected()){
            String sotoayam = porsi_sotoayam.getText();
            int porsisotoayam = Integer.parseInt(sotoayam);
            int hargasotoayam  = porsisotoayam * 14000;
            total = total + hargasotoayam;
        }
        if(sotokambing.isSelected()){
            String sotokambing = porsi_sotokambing.getText();
            int porsisotokambing = Integer.parseInt(sotokambing);
            int hargasotokambing  = porsisotokambing * 18000;
            total = total + hargasotokambing;
        }
        if(sayurasam.isSelected()){
            String sayurasam = porsi_sayurasam.getText();
            int porsisayurasam = Integer.parseInt(sayurasam);
            int hargasayurasam  = porsisayurasam * 8000;
            total = total + hargasayurasam;
        }
        if(sayurbayam.isSelected()){
            String sayurbayam = porsi_sayurbayam.getText();
            int porsisayurbayam = Integer.parseInt(sayurbayam);
            int hargasayurbayam  = porsisayurbayam * 8000;
            total = total + hargasayurbayam;
        }
        if(sayurcapcay.isSelected()){
            String sayurcapcay = porsi_sayurcapcay.getText();
            int porsisayurcapcay = Integer.parseInt(sayurcapcay);
            int hargasayurcapcay  = porsisayurcapcay * 8000;
            total = total + hargasayurcapcay;
        }
        if(sayurkangkung.isSelected()){
            String sayurcapcay = porsi_sayurkangkung.getText();
            int porsisayurkangkung = Integer.parseInt(sayurcapcay);
            int hargasayurkangkung  = porsisayurkangkung * 8000;
            total = total + hargasayurkangkung;
        }
        if(nasiputih.isSelected()){
            String nasiputih = porsi_nasiputih.getText();
            int porsinasiputih = Integer.parseInt(nasiputih);
            int harganasiputih  = porsinasiputih * 4000;
            total = total + harganasiputih;
        }
        if(nasigorengayam.isSelected()){
            String nasigorengayam = porsi_nasigorengayam.getText();
            int porsinasigorengayam = Integer.parseInt(nasigorengayam);
            int harganasigorengayam  = porsinasigorengayam * 13000;
            total = total + harganasigorengayam;
        }
        if(nasigorengkambing.isSelected()){
            String nasigorengkambing = porsi_nasigorengkambing.getText();
            int porsinasigorengkambing = Integer.parseInt(nasigorengkambing);
            int harganasigorengkambing  = porsinasigorengkambing * 16000;
            total = total + harganasigorengkambing;
        }
        if(nasigorengistimewa.isSelected()){
            String nasigorengistimewa = porsi_nasigorengistimewa.getText();
            int porsinasigorengistimewa = Integer.parseInt(nasigorengistimewa);
            int harganasigorengistimewa  = porsinasigorengistimewa * 20000;
            total = total + harganasigorengistimewa;
        }    
        if(airtawar.isSelected()){
            String airtawar = airtawarairtawar.getText();
            int airtawarj = Integer.parseInt(airtawar);
            int airtawarh  = airtawarj * 2000;
            total = total + airtawarh;
        }
        if(airmineral.isSelected()){
            String airmineral = airmineralairmineral.getText();
            int airmineralj = Integer.parseInt(airmineral);
            int airmineralh  = airmineralj * 5000;
            total = total + airmineralh;
        }
        if(airjerukhangat.isSelected()){
            String airjerukhangat = airjerukhangatairjerukhangat.getText();
            int airjerukhangatj = Integer.parseInt(airjerukhangat);
            int airjerukhangath  = airjerukhangatj * 5000;
            total = total + airjerukhangath;
        }
        if(esbuah.isSelected()){
            String esbuah = esbuahesbuah.getText();
            int esbuahj = Integer.parseInt(esbuah);
            int esbuahh  = esbuahj * 13000;
            total = total + esbuahh;
        }
        if(escincau.isSelected()){
            String escincau = escincauescincau.getText();
            int escincauj = Integer.parseInt(escincau);
            int escincauh  = escincauj * 4000;
            total = total + escincauh;
        }
        if(esjerukperas.isSelected()){
            String esjerukperas = esjerukperasesjerukperas.getText();
            int esjerukperasj = Integer.parseInt(esjerukperas);
            int esjerukperash  = esjerukperasj * 6000;
            total = total + esjerukperash;
        }
        if(eskelapamuda.isSelected()){
            String eskelapamuda = eskelapamudaeskelapamuda.getText();
            int eskelapamudaj = Integer.parseInt(eskelapamuda);
            int eskelapamudah  = eskelapamudaj * 16000;
            total = total + eskelapamudah;
        }
        if(eskopisusu.isSelected()){
            String eskopisusu = eskopisusueskopisusu.getText();
            int eskopisusuj = Integer.parseInt(eskopisusu);
            int eskopisusuh  = eskopisusuj * 10000;
            total = total + eskopisusuh;
        }
        if(essususoda.isSelected()){
            String essususoda = essususodaessususoda.getText();
            int essususodaj = Integer.parseInt(essususoda);
            int essususodah  = essususodaj * 10000;
            total = total + essususodah;
        }
        if(estehmanis.isSelected()){
            String estehmanis = estehmanisestehmanis.getText();
            int estehmanisj = Integer.parseInt(estehmanis);
            int estehmanish  = estehmanisj * 4000;
            total = total + estehmanish;
        }
        if(cappucinocincau.isSelected()){
            String cappucinocincau = cappucinocincaucappucinocincau.getText();
            int cappucinocincauj = Integer.parseInt(cappucinocincau);
            int cappucinocincauh  = cappucinocincauj * 8000;
            total = total + cappucinocincauh;
        }
        if(jusbuahalpukat.isSelected()){
            String jusbuahalpukat = jusbuahalpukatjusbuahalpukat.getText();
            int jusbuahalpukatj = Integer.parseInt(jusbuahalpukat);
            int jusbuahalpukath  = jusbuahalpukatj * 11000;
            total = total + jusbuahalpukath;
        }
        if(jusbuahapel.isSelected()){
            String jusbuahapel = jusbuahapeljusbuahapel.getText();
            int jusbuahapelj = Integer.parseInt(jusbuahapel);
            int jusbuahapelh  = jusbuahapelj * 10000;
            total = total + jusbuahapelh;
        }
        if(jusbuahbit.isSelected()){
            String jusbuahbit = jusbuahbitjusbuahbit.getText();
            int jusbuahbitj = Integer.parseInt(jusbuahbit);
            int jusbuahbith  = jusbuahbitj * 8000;
            total = total + jusbuahbith;
        }
        if(jusbuahjambubiji.isSelected()){
            String jusbuahjambubiji = jusbuahjambubijijusbuahjambubiji.getText();
            int jusbuahjambubijij = Integer.parseInt(jusbuahjambubiji);
            int jusbuahjambubijih  = jusbuahjambubijij * 8000;
            total = total + jusbuahjambubijih;
        }
        if(jusbuahmangga.isSelected()){
            String jusbuahmangga = jusbuahmanggajusbuahmangga.getText();
            int jusbuahmanggaj = Integer.parseInt(jusbuahmangga);
            int jusbuahmanggah  = jusbuahmanggaj * 10000;
            total = total + jusbuahmanggah;
        }
        if(jusbuahmelon.isSelected()){
            String jusbuahmelon = jusbuahmelonjusbuahmelon.getText();
            int jusbuahmelonj = Integer.parseInt(jusbuahmelon);
            int jusbuahmelonh  = jusbuahmelonj * 11000;
            total = total + jusbuahmelonh;
        }
        if(jusbuahnaga.isSelected()){
            String jusbuahnaga = jusbuahnagajusbuahnaga.getText();
            int jusbuahnagaj = Integer.parseInt(jusbuahnaga);
            int jusbuahnagah  = jusbuahnagaj * 13000;
            total = total + jusbuahnagah;
        }
        if(jusbuahstroberi.isSelected()){
            String jusbuahstroberi = jusbuahstroberijusbuahstroberi.getText();
            int jusbuahstroberij = Integer.parseInt(jusbuahstroberi);
            int jusbuahstroberih  = jusbuahstroberij * 13000;
            total = total + jusbuahstroberih;
        }
        if(jusworteltomat.isSelected()){
            String jusworteltomat = jusworteltomatjusworteltomat.getText();
            int jusworteltomatj = Integer.parseInt(jusworteltomat);
            int jusworteltomath  = jusworteltomatj * 10000;
            total = total + jusworteltomath;
        }
        if(paket1.isSelected()){
            String paket1 = paket1paket1.getText();
            int paket1j = Integer.parseInt(paket1);
            int paket1h  = paket1j * 24000;
            total = total + paket1h;
        }
        if(paket2.isSelected()){
            String paket2 = paket2paket2.getText();
            int paket2j = Integer.parseInt(paket2);
            int paket2h  = paket2j * 25000;
            total = total + paket2h;
        }
        if(paket3.isSelected()){
            String paket3 = paket3paket3.getText();
            int paket3j = Integer.parseInt(paket3);
            int paket3h  = paket3j * 27000;
            total = total + paket3h;
        }
        if(paket4.isSelected()){
            String paket4 = paket4paket4.getText();
            int paket4j = Integer.parseInt(paket4);
            int paket4h  = paket4j * 32000;
            total = total + paket4h;
        }
        if(paket5.isSelected()){
            String paket5 = paket5paket5.getText();
            int paket5j = Integer.parseInt(paket5);
            int paket5h  = paket5j * 34000;
            total = total + paket5h;
        }
        if(paket6.isSelected()){
            String paket6 = paket6paket6.getText();
            int paket6j = Integer.parseInt(paket6);
            int paket6h  = paket6j * 31000;
            total = total + paket6h;
        }    
        jumlahharga.setText("" + total);
    }//GEN-LAST:event_bt_jumlahhargaActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_batalActionPerformed

    private void bt_diskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_diskonActionPerformed
        // TODO add your handling code here:
        diskon();
    }//GEN-LAST:event_bt_diskonActionPerformed

    private void bt_tagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tagihanActionPerformed
        // TODO add your handling code here:
        pajak();
    }//GEN-LAST:event_bt_tagihanActionPerformed

    private void pembayaranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pembayaranKeyReleased
        // TODO add your handling code here:
        pembayaran();
    }//GEN-LAST:event_pembayaranKeyReleased

    private void kembalianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kembalianKeyReleased
        // TODO add your handling code here:
        pembayaran();
    }//GEN-LAST:event_kembalianKeyReleased

    private void paket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paket1ActionPerformed
        // TODO add your handling code here:
        if(paket1.isSelected()==true){
            paket1paket1.setEditable(true);
        }else{paket1paket1.setEditable(false);
            paket1paket1.setText("");}
    }//GEN-LAST:event_paket1ActionPerformed

    private void paket2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paket2ActionPerformed
        // TODO add your handling code here:
        if(paket2.isSelected()==true){
            paket2paket2.setEditable(true);
        }else{paket2paket2.setEditable(false);
            paket2paket2.setText("");}
    }//GEN-LAST:event_paket2ActionPerformed

    private void paket3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paket3ActionPerformed
        // TODO add your handling code here:
        if(paket3.isSelected()==true){
            paket3paket3.setEditable(true);
        }else{paket3paket3.setEditable(false);
            paket3paket3.setText("");}
    }//GEN-LAST:event_paket3ActionPerformed

    private void paket4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paket4ActionPerformed
        // TODO add your handling code here:
        if(paket4.isSelected()==true){
            paket4paket4.setEditable(true);
        }else{paket4paket4.setEditable(false);
            paket4paket4.setText("");}
    }//GEN-LAST:event_paket4ActionPerformed

    private void paket5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paket5ActionPerformed
        // TODO add your handling code here:
        if(paket5.isSelected()==true){
            paket5paket5.setEditable(true);
        }else{paket5paket5.setEditable(false);
            paket5paket5.setText("");}
    }//GEN-LAST:event_paket5ActionPerformed

    private void paket6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paket6ActionPerformed
        // TODO add your handling code here:
        if(paket6.isSelected()==true){
            paket6paket6.setEditable(true);
        }else{paket6paket6.setEditable(false);
            paket6paket6.setText("");}
    }//GEN-LAST:event_paket6ActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox airjerukhangat;
    private javax.swing.JTextField airjerukhangatairjerukhangat;
    private javax.swing.JCheckBox airmineral;
    private javax.swing.JTextField airmineralairmineral;
    private javax.swing.JCheckBox airtawar;
    private javax.swing.JTextField airtawarairtawar;
    private javax.swing.JCheckBox ayambakar;
    private javax.swing.JCheckBox ayamopor;
    private javax.swing.JCheckBox ayampenyet;
    private javax.swing.JButton batal;
    private javax.swing.JButton bt_diskon;
    private javax.swing.JButton bt_jumlahharga;
    private javax.swing.JButton bt_tagihan;
    private javax.swing.JCheckBox cappucinocincau;
    private javax.swing.JTextField cappucinocincaucappucinocincau;
    private javax.swing.JCheckBox dagingbalado;
    private javax.swing.JCheckBox dagingrendang;
    private javax.swing.JCheckBox dagingsemur;
    private javax.swing.JTextField diskon;
    private javax.swing.JCheckBox esbuah;
    private javax.swing.JTextField esbuahesbuah;
    private javax.swing.JCheckBox escincau;
    private javax.swing.JTextField escincauescincau;
    private javax.swing.JCheckBox esjerukperas;
    private javax.swing.JTextField esjerukperasesjerukperas;
    private javax.swing.JCheckBox eskelapamuda;
    private javax.swing.JTextField eskelapamudaeskelapamuda;
    private javax.swing.JCheckBox eskopisusu;
    private javax.swing.JTextField eskopisusueskopisusu;
    private javax.swing.JCheckBox essususoda;
    private javax.swing.JTextField essususodaessususoda;
    private javax.swing.JCheckBox estehmanis;
    private javax.swing.JTextField estehmanisestehmanis;
    private javax.swing.JCheckBox igasapibakar;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jumlahharga;
    private javax.swing.JCheckBox jusbuahalpukat;
    private javax.swing.JTextField jusbuahalpukatjusbuahalpukat;
    private javax.swing.JCheckBox jusbuahapel;
    private javax.swing.JTextField jusbuahapeljusbuahapel;
    private javax.swing.JCheckBox jusbuahbit;
    private javax.swing.JTextField jusbuahbitjusbuahbit;
    private javax.swing.JCheckBox jusbuahjambubiji;
    private javax.swing.JTextField jusbuahjambubijijusbuahjambubiji;
    private javax.swing.JCheckBox jusbuahmangga;
    private javax.swing.JTextField jusbuahmanggajusbuahmangga;
    private javax.swing.JCheckBox jusbuahmelon;
    private javax.swing.JTextField jusbuahmelonjusbuahmelon;
    private javax.swing.JCheckBox jusbuahnaga;
    private javax.swing.JTextField jusbuahnagajusbuahnaga;
    private javax.swing.JCheckBox jusbuahstroberi;
    private javax.swing.JTextField jusbuahstroberijusbuahstroberi;
    private javax.swing.JCheckBox jusworteltomat;
    private javax.swing.JTextField jusworteltomatjusworteltomat;
    private javax.swing.JTextField kembalian;
    private javax.swing.JCheckBox nasigorengayam;
    private javax.swing.JCheckBox nasigorengistimewa;
    private javax.swing.JCheckBox nasigorengkambing;
    private javax.swing.JCheckBox nasiputih;
    private javax.swing.JTextField pajak;
    private javax.swing.JCheckBox paket1;
    private javax.swing.JTextField paket1paket1;
    private javax.swing.JCheckBox paket2;
    private javax.swing.JTextField paket2paket2;
    private javax.swing.JCheckBox paket3;
    private javax.swing.JTextField paket3paket3;
    private javax.swing.JCheckBox paket4;
    private javax.swing.JTextField paket4paket4;
    private javax.swing.JCheckBox paket5;
    private javax.swing.JTextField paket5paket5;
    private javax.swing.JCheckBox paket6;
    private javax.swing.JTextField paket6paket6;
    private javax.swing.JTextField pembayaran;
    private javax.swing.JTextField porsi_ayambakar;
    private javax.swing.JTextField porsi_ayamopor;
    private javax.swing.JTextField porsi_ayampenyet;
    private javax.swing.JTextField porsi_dagingbalado;
    private javax.swing.JTextField porsi_dagingrendang;
    private javax.swing.JTextField porsi_dagingsemur;
    private javax.swing.JTextField porsi_igasapibakar;
    private javax.swing.JTextField porsi_nasigorengayam;
    private javax.swing.JTextField porsi_nasigorengistimewa;
    private javax.swing.JTextField porsi_nasigorengkambing;
    private javax.swing.JTextField porsi_nasiputih;
    private javax.swing.JTextField porsi_sateayam;
    private javax.swing.JTextField porsi_satekambing;
    private javax.swing.JTextField porsi_sayurasam;
    private javax.swing.JTextField porsi_sayurbayam;
    private javax.swing.JTextField porsi_sayurcapcay;
    private javax.swing.JTextField porsi_sayurkangkung;
    private javax.swing.JTextField porsi_sopiga;
    private javax.swing.JTextField porsi_sotoayam;
    private javax.swing.JTextField porsi_sotokambing;
    private javax.swing.JCheckBox sateayam;
    private javax.swing.JCheckBox satekambing;
    private javax.swing.JCheckBox sayurasam;
    private javax.swing.JCheckBox sayurbayam;
    private javax.swing.JCheckBox sayurcapcay;
    private javax.swing.JCheckBox sayurkangkung;
    private javax.swing.JCheckBox sopiga;
    private javax.swing.JCheckBox sotoayam;
    private javax.swing.JCheckBox sotokambing;
    private javax.swing.JTextField tagihan;
    private javax.swing.JTextField totalharga;
    // End of variables declaration//GEN-END:variables
}
