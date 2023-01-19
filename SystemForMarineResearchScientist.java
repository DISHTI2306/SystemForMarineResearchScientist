/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.awt.Toolkit;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dishti Chitapain
 */
public class SystemForMarineResearchScientist extends javax.swing.JFrame {
   Connection con = null;
   PreparedStatement ps = null;
   ResultSet rs = null;
   
    /**
     * Creates new form SystemForMarineResearchScientist
     */
    public SystemForMarineResearchScientist() {
        initComponents();
        con=ScientistConnect.connectDB();
        setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        setSize(xSize, ySize);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        updateScientistTable();
        chooseSCIENTISTSPECIESComboBox();
        selectSCIENTISTSPECIESComboBox(); 
    } 
    
    private void chooseSCIENTISTSPECIESComboBox() {
        try {
           String sql = "select SCIENTISTID from SCIENTISTS";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Populate Scientist error: "+e);
        }
    }
    
    private void selectSCIENTISTSPECIESComboBox(){
        try {
           String sql = "select SPECIESCODE from SPECIES";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Populate Species error: "+e);
        }
    }
        
    private void updateTable(){
        try {
           String sql = "select * from SCIENTISTS";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ScientistTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Message for Scientist Table: "+e);
        }
    }
    
    private void updateScientistTable(){
       try{
          String sql="select * from SCIENTISTS";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          ScientistTable.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Scientist table error: " + e);
       }
   }
    
    private void updateSTable(){
        try {
           String sql = "select * from SPECIES";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            SpeciesTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Message for Species Table: "+e);
        }
    }
    
    private void updateSpeciesTable(){
       try{
          String sql="select * from SPECIES";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          SpeciesTable.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Species table error: " + e);
       }
   }
    
    private void updateSamTable(){
        try {
           String sql = "select * from SAMPLES";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            sampleTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Message for Sample Table: "+e);
        }
    }
    
    private void updateSampleTable(){
       try{
          String sql="select * from SAMPLES";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          sampleTable.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Scientist table error: " + e);
       }
   }
    
    private void updateEquipTable(){
        try {
           String sql = "select * from EQUIPMENTS";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            EquipmentTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Message for Equipment Table: "+e);
        }
    }
    
    private void updateEquipmentTable(){
       try{
          String sql="select * from EQUIPMENTS";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          EquipmentTable.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Equipment table error: " + e);
       }
   }
    
    private void updateChemTable(){
        try {
           String sql = "select * from CHEMICAL";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ChemicalTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Message for Chemical Table: "+e);
        }
    }
    
    private void updateChemicalTable(){
       try{
          String sql="select * from CHEMICAL";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          ChemicalTable.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Chemical table error: " + e);
       }
   }
    
    private void updateDTable(){
        try {
           String sql = "select * from DATACOLLECTION";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            DataTable.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Message for data collection Table: "+e);
        }
    }
    
    private void updateDataTable(){
       try{
          String sql="select * from EQUIPMENTS";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          DataTable.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "data collection table error: " + e);
       }
   }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        scientistIdTxt = new javax.swing.JTextField();
        scientistLNameTxt = new javax.swing.JTextField();
        scientistFNameTxt = new javax.swing.JTextField();
        scientistEmailTxt = new javax.swing.JTextField();
        scientistAddressTxt = new javax.swing.JTextField();
        scientistNumberTxt = new javax.swing.JTextField();
        scientistGenderTxt = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        insertNewScientistBut = new java.awt.Button();
        SDateHiredDateChooser = new com.toedter.calendar.JDateChooser();
        SDOBDateChooser = new com.toedter.calendar.JDateChooser();
        panel4 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ScientistTable = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        viewscientistIdTxt = new javax.swing.JTextField();
        viewscientistFNameTxt = new javax.swing.JTextField();
        viewscientistLNameTxt = new javax.swing.JTextField();
        viewscientistEmailTxt = new javax.swing.JTextField();
        viewscientistAddressTxt = new javax.swing.JTextField();
        viewscientistSDateHiredDateChooser = new javax.swing.JTextField();
        UpdateNewScientistBut = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        viewscientistNumber = new javax.swing.JTextField();
        viewscientistSDOBDateChooser = new javax.swing.JTextField();
        viewscientistGender = new javax.swing.JTextField();
        panel5 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        button3 = new java.awt.Button();
        button5 = new java.awt.Button();
        DeleteScientistBut = new java.awt.Button();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        panel1 = new java.awt.Panel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        speciesCodeTxt = new javax.swing.JTextField();
        speciesNameTxt = new javax.swing.JTextField();
        speciesWeightTxt = new javax.swing.JTextField();
        speciesGenderTxt = new javax.swing.JTextField();
        speciesLifespanTxt = new javax.swing.JTextField();
        speciesLengthTxt = new javax.swing.JTextField();
        insertNewSpeciesBut = new javax.swing.JButton();
        panel7 = new java.awt.Panel();
        panel6 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SpeciesTable = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        viewspeciesCodeTxt = new javax.swing.JTextField();
        viewspeciesNameTxt = new javax.swing.JTextField();
        viewspeciesWeightTxt = new javax.swing.JTextField();
        viewspeciesGenderTxt = new javax.swing.JTextField();
        viewspeciesLifespanTxt = new javax.swing.JTextField();
        viewspeciesLengthTxt = new javax.swing.JTextField();
        UpdateNewSpeciesBut = new javax.swing.JButton();
        DeleteNewSpeciesBut = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        populateScientistComboBox = new javax.swing.JComboBox<>();
        populateSpeciesComboBox = new javax.swing.JComboBox<>();
        AssignScientistBuuton = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        panel8 = new java.awt.Panel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        sampleNumberTxt = new javax.swing.JTextField();
        sampleNameTxt = new javax.swing.JTextField();
        sampleLengthTxt = new javax.swing.JTextField();
        sampleSLengthTxt = new javax.swing.JTextField();
        sampleWeightTxt = new javax.swing.JTextField();
        sampleGenderTxt = new javax.swing.JTextField();
        sampleDateChooser = new com.toedter.calendar.JDateChooser();
        insertNewSampleBut = new javax.swing.JButton();
        panel10 = new java.awt.Panel();
        panel9 = new java.awt.Panel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sampleTable = new javax.swing.JTable();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        viewsampleNumberTxt = new javax.swing.JTextField();
        viewsampleLengthTxt = new javax.swing.JTextField();
        viewsampleSLengthTxt = new javax.swing.JTextField();
        viewsampleWeightTxt = new javax.swing.JTextField();
        viewsampleGenderTxt = new javax.swing.JTextField();
        InsertNewsampleBut = new javax.swing.JButton();
        SampleDeleteBut = new javax.swing.JButton();
        viewsampleNameTxt = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        viewsampleDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        panel12 = new java.awt.Panel();
        jScrollPane4 = new javax.swing.JScrollPane();
        EquipmentTable = new javax.swing.JTable();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        viewEquipmentIdTxt = new javax.swing.JTextField();
        viewEquipmentNameTxt = new javax.swing.JTextField();
        viewEquipmentCostTxt = new javax.swing.JTextField();
        viewEquipmentSizeTxt = new javax.swing.JTextField();
        viewEquipmentWDepthTxt = new javax.swing.JTextField();
        InsertNewEquipBut = new javax.swing.JButton();
        DeleteEquipBut = new javax.swing.JButton();
        panel13 = new java.awt.Panel();
        panel11 = new java.awt.Panel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        insertNewEquipmentsBut = new javax.swing.JButton();
        EquipmentIDTxt = new javax.swing.JTextField();
        EquipementNameTxt = new javax.swing.JTextField();
        EquipementCostTxt = new javax.swing.JTextField();
        EquipementSizeTxt = new javax.swing.JTextField();
        EquipementWDepthTxt = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        panel14 = new java.awt.Panel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        EcoTempTxt = new javax.swing.JTextField();
        EcoPLTxt = new javax.swing.JTextField();
        EcoNCTxt = new javax.swing.JTextField();
        EcoCDCTxt = new javax.swing.JTextField();
        EcoDepthTxt = new javax.swing.JTextField();
        EcosalinityTxt = new javax.swing.JTextField();
        insertNewEcoBut = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        EcoIdTxt = new javax.swing.JTextField();
        panel15 = new java.awt.Panel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ChemicalTable = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        viewChemicalIdTxt = new javax.swing.JTextField();
        viewTempTxt = new javax.swing.JTextField();
        viewpHLevelTxt = new javax.swing.JTextField();
        viewNCTxt = new javax.swing.JTextField();
        viewCDCTxt = new javax.swing.JTextField();
        viewdepthTxt = new javax.swing.JTextField();
        viewSalTxt = new javax.swing.JTextField();
        InsertChemicalBut = new javax.swing.JButton();
        DeleteChemicalBut = new javax.swing.JButton();
        panel16 = new java.awt.Panel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        panel17 = new java.awt.Panel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        DataCTxt = new javax.swing.JTextField();
        DataNTxt = new javax.swing.JTextField();
        TimeRTxt = new javax.swing.JTextField();
        inserNewDataBut = new javax.swing.JButton();
        panel18 = new java.awt.Panel();
        jScrollPane6 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        viewDataCodeTxt = new javax.swing.JTextField();
        viewDataNameTxt = new javax.swing.JTextField();
        viewTimeRecorTxt = new javax.swing.JTextField();
        InsertNewDataBut = new javax.swing.JButton();
        DelNewDataBut = new javax.swing.JButton();
        panel19 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "System For Marine Research Scientist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Unicode", 1, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 102));
        jTabbedPane1.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N

        jTabbedPane3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Scientist ID:");
        jLabel1.setFocusTraversalPolicyProvider(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Scientist Last Name:");
        jLabel2.setFocusTraversalPolicyProvider(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Scientist First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Date Hired:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Date-Of-Birth:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Gender:");

        scientistIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientistIdTxtActionPerformed(evt);
            }
        });

        button1.setLabel("button1");

        insertNewScientistBut.setLabel("Save");
        insertNewScientistBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewScientistButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scientistGenderTxt)
                            .addComponent(SDOBDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scientistIdTxt)
                            .addComponent(scientistFNameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scientistEmailTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scientistLNameTxt)
                            .addComponent(scientistAddressTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scientistNumberTxt)
                            .addComponent(SDateHiredDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addComponent(insertNewScientistBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(scientistIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(scientistLNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(scientistFNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(scientistEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(scientistAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(SDateHiredDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(scientistNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(SDOBDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(scientistGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(insertNewScientistBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Create Scientist", panel2);

        ScientistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScientistTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScientistTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ScientistTable);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Scientist ID:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("First Name:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Last Name:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Email:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Address:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Date Hired:");

        UpdateNewScientistBut.setText("Update");
        UpdateNewScientistBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateNewScientistButActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("Phone Number:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("Date-Of- Birth:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("Gender:");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewscientistIdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(viewscientistFNameTxt)
                            .addComponent(viewscientistLNameTxt)
                            .addComponent(viewscientistEmailTxt)
                            .addComponent(viewscientistAddressTxt)
                            .addComponent(viewscientistSDateHiredDateChooser)
                            .addComponent(viewscientistNumber)
                            .addComponent(viewscientistSDOBDateChooser)
                            .addComponent(viewscientistGender))
                        .addGap(38, 38, 38)
                        .addComponent(UpdateNewScientistBut)
                        .addGap(223, 223, 223))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(viewscientistIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(viewscientistFNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(viewscientistLNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(viewscientistEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(viewscientistAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(viewscientistSDateHiredDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(viewscientistNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(viewscientistSDOBDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewscientistGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateNewScientistBut)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Manage Scientist", panel4);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Search Scientist", panel5);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Scientist ID:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Scientist Last Name:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Scientist First Name:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Email:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Address:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Date Hired:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Phone Number:");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        button3.setLabel("button3");

        button5.setLabel("button5");

        DeleteScientistBut.setLabel("Delete");
        DeleteScientistBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteScientistButActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Date-Of-Birth:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Gender:");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(DeleteScientistBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DeleteScientistBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Delete Scientist", panel3);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Scientist", jPanel11);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Species Code:");

        jLabel26.setText("Species Name:");

        jLabel27.setText("Weight (Kg):");

        jLabel28.setText("Gender:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Lifespan:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Total Length (cm):");

        insertNewSpeciesBut.setText("Save");
        insertNewSpeciesBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewSpeciesButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insertNewSpeciesBut)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(speciesCodeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(speciesNameTxt)
                            .addComponent(speciesWeightTxt)
                            .addComponent(speciesGenderTxt)
                            .addComponent(speciesLifespanTxt)
                            .addComponent(speciesLengthTxt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(speciesCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(speciesNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(speciesWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(speciesGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29))
                    .addComponent(speciesLifespanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(speciesLengthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(insertNewSpeciesBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Create Species", panel1);

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Search Species", panel7);

        SpeciesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        SpeciesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SpeciesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(SpeciesTable);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("Species Code:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("Species Name:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Weight (Kg):");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("Gender:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("Lifespan:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("Total Length (cm):");

        UpdateNewSpeciesBut.setText("Update");
        UpdateNewSpeciesBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateNewSpeciesButActionPerformed(evt);
            }
        });

        DeleteNewSpeciesBut.setText("Delete");
        DeleteNewSpeciesBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteNewSpeciesButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                .addComponent(UpdateNewSpeciesBut)
                                .addGap(36, 36, 36)
                                .addComponent(DeleteNewSpeciesBut))
                            .addGroup(panel6Layout.createSequentialGroup()
                                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewspeciesNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(viewspeciesCodeTxt)
                                    .addComponent(viewspeciesWeightTxt)
                                    .addComponent(viewspeciesGenderTxt)
                                    .addComponent(viewspeciesLifespanTxt)
                                    .addComponent(viewspeciesLengthTxt))))
                        .addGap(0, 218, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(viewspeciesCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(viewspeciesNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(viewspeciesWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(viewspeciesGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(viewspeciesLifespanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(viewspeciesLengthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateNewSpeciesBut)
                    .addComponent(DeleteNewSpeciesBut))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Manage Species", panel6);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Species", jPanel12);

        populateScientistComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                populateScientistComboBoxMouseClicked(evt);
            }
        });

        populateSpeciesComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                populateSpeciesComboBoxMouseClicked(evt);
            }
        });

        AssignScientistBuuton.setText("Assign");
        AssignScientistBuuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignScientistBuutonActionPerformed(evt);
            }
        });

        jLabel82.setText("Choose a scientist:");

        jLabel85.setText("Choose a species:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AssignScientistBuuton)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(populateSpeciesComboBox, 0, 138, Short.MAX_VALUE)
                            .addComponent(populateScientistComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(populateScientistComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addGap(46, 46, 46)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(populateSpeciesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addGap(40, 40, 40)
                .addComponent(AssignScientistBuuton)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ScientistSpecies", jPanel13);

        jTabbedPane5.setForeground(new java.awt.Color(0, 0, 153));
        jTabbedPane5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("Sample Number:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("Sample Name:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("Date Taken:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("Total Length (cm):");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("Standard Length (cm):");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("Weight (Kg):");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("Gender:");

        insertNewSampleBut.setText("Save");
        insertNewSampleBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewSampleButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insertNewSampleBut)
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sampleWeightTxt)
                            .addComponent(sampleSLengthTxt)
                            .addComponent(sampleLengthTxt)
                            .addComponent(sampleDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(sampleNumberTxt)
                            .addComponent(sampleNameTxt)
                            .addComponent(sampleGenderTxt))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(sampleNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(sampleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(sampleDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(sampleLengthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(sampleSLengthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(sampleWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(sampleGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(insertNewSampleBut)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Create Samples", panel8);

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Search Samples", panel10);

        sampleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        sampleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sampleTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(sampleTable);

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setText("Sample Number:");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("Date Taken:");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel74.setText("Total Length (cm):");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("Standard Length (cm):");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel76.setText("Weight (Kg):");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("Gender:");

        InsertNewsampleBut.setText("Update");
        InsertNewsampleBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertNewsampleButActionPerformed(evt);
            }
        });

        SampleDeleteBut.setText("Delete");
        SampleDeleteBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SampleDeleteButMouseClicked(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel84.setText("Sample Name:");

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel9Layout.createSequentialGroup()
                                .addComponent(InsertNewsampleBut)
                                .addGap(47, 47, 47)
                                .addComponent(SampleDeleteBut))
                            .addGroup(panel9Layout.createSequentialGroup()
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(64, 64, 64))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel9Layout.createSequentialGroup()
                                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewsampleWeightTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(viewsampleSLengthTxt)
                                    .addComponent(viewsampleNumberTxt)
                                    .addComponent(viewsampleLengthTxt)
                                    .addComponent(viewsampleGenderTxt)
                                    .addComponent(viewsampleNameTxt)
                                    .addComponent(viewsampleDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(viewsampleNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewsampleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84))
                .addGap(18, 18, 18)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73)
                    .addComponent(viewsampleDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewsampleLengthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addGap(18, 18, 18)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel75)
                    .addComponent(viewsampleSLengthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel76)
                    .addComponent(viewsampleWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(viewsampleGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel77)
                        .addGap(11, 11, 11)))
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertNewsampleBut)
                    .addComponent(SampleDeleteBut))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Manage Samples", panel9);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Samples", jPanel14);

        jTabbedPane6.setForeground(new java.awt.Color(0, 0, 153));
        jTabbedPane6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N

        EquipmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        EquipmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EquipmentTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(EquipmentTable);

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel78.setText("Equipment ID:");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel79.setText("Name:");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel80.setText("Cost:");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setText("Size:");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel83.setText("Water Depth:");

        InsertNewEquipBut.setText("Update");
        InsertNewEquipBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertNewEquipButActionPerformed(evt);
            }
        });

        DeleteEquipBut.setText("Delete");
        DeleteEquipBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEquipButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addGroup(panel12Layout.createSequentialGroup()
                        .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel12Layout.createSequentialGroup()
                                .addComponent(InsertNewEquipBut)
                                .addGap(71, 71, 71)
                                .addComponent(DeleteEquipBut))
                            .addGroup(panel12Layout.createSequentialGroup()
                                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewEquipmentSizeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(viewEquipmentIdTxt)
                                    .addComponent(viewEquipmentNameTxt)
                                    .addComponent(viewEquipmentCostTxt)
                                    .addComponent(viewEquipmentWDepthTxt))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(viewEquipmentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(viewEquipmentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(viewEquipmentCostTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(viewEquipmentSizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(viewEquipmentWDepthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertNewEquipBut)
                    .addComponent(DeleteEquipBut))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Manage Equipment", panel12);

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Search Equipment", panel13);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("Equipment ID:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("Name:");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("Cost:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("Size:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("Water Depth (kHz):");

        insertNewEquipmentsBut.setText("Save");
        insertNewEquipmentsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewEquipmentsButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insertNewEquipmentsBut)
                    .addGroup(panel11Layout.createSequentialGroup()
                        .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EquipmentIDTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(EquipementNameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EquipementCostTxt)
                            .addComponent(EquipementSizeTxt)
                            .addComponent(EquipementWDepthTxt))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(EquipmentIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(EquipementNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(EquipementCostTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(EquipementSizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(EquipementWDepthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(insertNewEquipmentsBut)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Create new Equipment", panel11);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Equipments", jPanel15);

        jTabbedPane8.setForeground(new java.awt.Color(0, 0, 153));
        jTabbedPane8.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("Temperature:");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("pH level:");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("Nutrient Concentration:");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("Carbon Dioxide Concentration:");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("Depth:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("Salinity:");

        insertNewEcoBut.setText("Save");
        insertNewEcoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewEcoButActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel51.setText("Chemical ID:");

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EcosalinityTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(EcoDepthTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EcoCDCTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EcoNCTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EcoTempTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EcoPLTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EcoIdTxt))
                .addGap(48, 48, 48)
                .addComponent(insertNewEcoBut)
                .addGap(45, 45, 45))
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51)
                    .addComponent(EcoIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53)
                    .addComponent(EcoTempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54)
                    .addComponent(EcoPLTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55)
                    .addComponent(EcoNCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56)
                    .addComponent(EcoCDCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(EcoDepthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EcosalinityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertNewEcoBut)
                    .addComponent(jLabel59))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Create Chemical", panel14);

        ChemicalTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChemicalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        ChemicalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChemicalTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ChemicalTable);

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("Chemical ID:");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("Temperature");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setText("pH Level:");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("Nutrient Concentration:");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("Carbon Dioxide Concentration:");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("Depth:");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("Salinity:");

        InsertChemicalBut.setText("Update");
        InsertChemicalBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertChemicalButActionPerformed(evt);
            }
        });

        DeleteChemicalBut.setText("Delete");
        DeleteChemicalBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteChemicalButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel15Layout.createSequentialGroup()
                                    .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel15Layout.createSequentialGroup()
                            .addGap(157, 157, 157)
                            .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel15Layout.createSequentialGroup()
                                    .addComponent(InsertChemicalBut)
                                    .addGap(38, 38, 38)
                                    .addComponent(DeleteChemicalBut))
                                .addGroup(panel15Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(viewChemicalIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(panel15Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(viewTempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewpHLevelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewNCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewCDCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewdepthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(viewChemicalIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(viewTempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(viewpHLevelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(viewNCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(viewCDCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(viewdepthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(viewSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertChemicalBut)
                    .addComponent(DeleteChemicalBut))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Manage Chemical", panel15);

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("Search Chemical", panel16);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Chemical", jPanel16);

        jTabbedPane7.setForeground(new java.awt.Color(0, 0, 102));
        jTabbedPane7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("Data Code:");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("Data Name:");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("Time recorded:");

        inserNewDataBut.setText("Save");
        inserNewDataBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserNewDataButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel17Layout = new javax.swing.GroupLayout(panel17);
        panel17.setLayout(panel17Layout);
        panel17Layout.setHorizontalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inserNewDataBut)
                    .addGroup(panel17Layout.createSequentialGroup()
                        .addGroup(panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DataCTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(DataNTxt)
                            .addComponent(TimeRTxt))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        panel17Layout.setVerticalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel17Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(DataCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(DataNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(TimeRTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(inserNewDataBut)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Create Data", panel17);

        DataTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        DataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(DataTable);

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("Data Code:");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("Data Name:");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("Time Recorded:");

        InsertNewDataBut.setText("Update");
        InsertNewDataBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertNewDataButActionPerformed(evt);
            }
        });

        DelNewDataBut.setText("Delete");
        DelNewDataBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelNewDataButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel18Layout = new javax.swing.GroupLayout(panel18);
        panel18.setLayout(panel18Layout);
        panel18Layout.setHorizontalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel18Layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(InsertNewDataBut)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                            .addComponent(DelNewDataBut))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel18Layout.createSequentialGroup()
                            .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewDataCodeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(viewDataNameTxt)
                                .addComponent(viewTimeRecorTxt)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panel18Layout.setVerticalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(viewDataCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(viewDataNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(viewTimeRecorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertNewDataBut)
                    .addComponent(DelNewDataBut))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Manage Data", panel18);

        javax.swing.GroupLayout panel19Layout = new javax.swing.GroupLayout(panel19);
        panel19.setLayout(panel19Layout);
        panel19Layout.setHorizontalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        panel19Layout.setVerticalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Search Data", panel19);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Collection", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DelNewDataButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelNewDataButActionPerformed
        // TO
    }//GEN-LAST:event_DelNewDataButActionPerformed

    private void InsertNewDataButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertNewDataButActionPerformed
        // TO update data details: time recorded
        try{
            String s1, s2, s3;
            double e1;
            s1 = viewDataCodeTxt.getText();
            s2 = viewDataNameTxt.getText();
            s3 = viewTimeRecorTxt.getText();
            e1 = Double.parseDouble(s3);
            String updateSql = "update DATA set DATACODE=?, DATANAME=?, TIMERECORDED=?";
            ps=con.prepareStatement(updateSql);
            ps.setString(1, s1);
            ps.setString(2, s2);
            ps.setDouble(3, e1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Success!!!\nData updated");
            updateDTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_InsertNewDataButActionPerformed

    private void DataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataTableMouseClicked
        // TO register table to read data values using mouse click
        int row = DataTable.getSelectedRow();
        String tableClick = (DataTable.getModel().getValueAt(row, 5).toString());
        try{
            String sql = "select * from DATACOLLECTION where DATANAME='"+tableClick+"'";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                Double r1 = rs.getDouble(3);
                viewDataCodeTxt.setText(s1);
                viewDataNameTxt.setText(s2);
                viewTimeRecorTxt.setText(String.valueOf(r1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_DataTableMouseClicked

    private void inserNewDataButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserNewDataButActionPerformed
        // To create new data collection
        try{
            String Adddatacollectionsql="insert into DATACOLLECTION(DATACODE,DATANAME, TIMERECORDED)values(?,?,?)";
            ps = con.prepareStatement(Adddatacollectionsql);
            ps.setString(1, DataCTxt.getText());
            ps.setString(2, DataNTxt.getText());
            ps.setDouble(3, Double.parseDouble(TimeRTxt.getText()));
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!!\nNew Data Collection inserted!!!");
            DataCTxt.setText("");
            DataNTxt.setText("");
            TimeRTxt.setText("");
            updateDTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insertion Error!!" + e);
        }
    }//GEN-LAST:event_inserNewDataButActionPerformed

    private void DeleteChemicalButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteChemicalButActionPerformed
        // TO delete a record from the Chemical Table
        try {
            String deleteSql = "delete from CHEMICAL where CHEMICALID=?";
            ps = con.prepareStatement(deleteSql);
            ps.setString(1, viewChemicalIdTxt.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!\nOne record deleted!!");
            viewTempTxt.setText("");
            viewpHLevelTxt.getText();
            viewNCTxt.getText();
            viewCDCTxt.getText();
            viewdepthTxt.getText();
            viewSalTxt.getText();
            updateChemTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_DeleteChemicalButActionPerformed

    private void InsertChemicalButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertChemicalButActionPerformed
        // TO update the chemaical details: Temperature, pHlevel, Nutrient Concentration, C02 concentration
        String s1, s2, s3, s4, s5, s6, s7;
        double b1;
        int a1;
        s1 = viewChemicalIdTxt.getText();
        s2 = viewTempTxt.getText();
        s3 = viewpHLevelTxt.getText();
        s4 = viewNCTxt.getText();
        s5 = viewCDCTxt.getText();
        s6 = viewdepthTxt.getText();
        s7 = viewSalTxt.getText();
        a1 = Integer.parseInt(s3);
        b1  = Double.parseDouble(s6);
        String updateSql = "\"update CHEMICAL set TEMPERATURE=?, PHLEVEL=?, NUTRIENTCONCENTRATION=?, CARBONDIOXIDECONCENTRATION=?\"";
    }//GEN-LAST:event_InsertChemicalButActionPerformed

    private void ChemicalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChemicalTableMouseClicked
        // TO register table to read the data values using mouse click
        int row = ChemicalTable.getSelectedRow();
        String tableClick = (ChemicalTable.getModel().getValueAt(row, 4).toString());
        try{
            String sql = "select * from CHEMICAL where CHEMICALID=?";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                int a1 = rs.getInt(3);
                String s3 = rs.getString(4);
                String s4 = rs.getString(5);
                double b1 = rs.getDouble(6);
                String s5 = rs.getString(7);
                viewChemicalIdTxt.setText(s1);
                viewTempTxt.setText(s2);
                viewpHLevelTxt.setText(String.valueOf(b1));
                viewNCTxt.setText(s3);
                viewCDCTxt.setText(s4);
                viewdepthTxt.setText(String.valueOf(b1));
                viewSalTxt.setText(s5);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_ChemicalTableMouseClicked

    private void insertNewEcoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewEcoButActionPerformed
        // To createnew ecosystem
        try {
            String Addchemicalsql="insert into CHEMICAL(CHEMICALID,TEMPERATURE, pHLEVEL, NUTRIENTCONCENTRATION, CARBONDIOXIDECONCENTRATION, DEPTH, SALINITY)values(?,?,?,?,?,?,?)";
            ps = con.prepareStatement(Addchemicalsql);
            ps.setString(1, EcoIdTxt.getText());
            ps.setString(2, EcoTempTxt.getText());
            ps.setInt(3, Integer.parseInt(EcoPLTxt.getText()));
            ps.setString(4, EcoNCTxt.getText());
            ps.setString(5, EcoCDCTxt.getText());
            ps.setDouble(6, Double.parseDouble(EcoDepthTxt.getText()));
            ps.setString(7, EcosalinityTxt.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!!\nNew Data for chemical inserted!!!");
            EcoIdTxt.setText("");
            EcoTempTxt.setText("");
            EcoPLTxt.setText("");
            EcoNCTxt.setText("");
            EcoCDCTxt.setText("");
            EcoDepthTxt.setText("");
            EcosalinityTxt.setText("");
            updateChemTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insertion Error!!" + e);
        }
    }//GEN-LAST:event_insertNewEcoButActionPerformed

    private void insertNewEquipmentsButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewEquipmentsButActionPerformed
        // To insert a new equipment used to collect sample
        try {
            String AddEquipmentssql="insert into EQUIPMENTS(EQUIPMENTID, NAME, COST, SIZE, WATERDEPTH)values(?,?,?,?,?)";
            ps = con.prepareStatement(AddEquipmentssql);
            ps.setString(1, EquipmentIDTxt.getText());
            ps.setString(2, EquipementNameTxt.getText());
            ps.setDouble(3, Double.parseDouble(EquipementCostTxt.getText()));
            ps.setInt(4, Integer.parseInt(EquipementSizeTxt.getText()));
            ps.setInt(5, Integer.parseInt(EquipementWDepthTxt.getText()));
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!!\nNew Equipment inserted!!!");
            EquipmentIDTxt.setText("");
            EquipementNameTxt.setText("");
            EquipementCostTxt.setText("");
            EquipementSizeTxt.setText("");
            EquipementWDepthTxt.setText("");
            updateEquipTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insertion Error!!" + e);
        }
    }//GEN-LAST:event_insertNewEquipmentsButActionPerformed

    private void DeleteEquipButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEquipButActionPerformed
        // TO delete a record from the equipment table
        try {
            String deleteSql = "delete from EQUIPMENTS where EQUIPMENTID=?";
            ps = con.prepareStatement(deleteSql);
            ps.setString(1, viewEquipmentIdTxt.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!\nOne record deleted!!");
            viewEquipmentIdTxt.setText("");
            viewEquipmentNameTxt.getText();
            viewEquipmentCostTxt.getText();
            viewEquipmentSizeTxt.getText();
            viewEquipmentWDepthTxt.getText();
            updateEquipTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_DeleteEquipButActionPerformed

    private void InsertNewEquipButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertNewEquipButActionPerformed
        // TO update equipments details: cost, size, water depth
        try{
            String s1, s2, s3, s4, s5;
            Double b1;
            int a1, a2;
            s1 = viewEquipmentIdTxt.getText();
            s2 = viewEquipmentNameTxt.getText();
            s3 = viewEquipmentCostTxt.getText();
            s4 = viewEquipmentSizeTxt.getText();
            s5 = viewEquipmentWDepthTxt.getText();
            b1 = Double.parseDouble(s3);
            a1 = Integer.parseInt(s4);
            a2 = Integer.parseInt(s5);
            String updateSql = "update EQUIPMENTS set COST=?, SIZE=?, WATERDEPTH=?";
            ps=con.prepareStatement(updateSql);
            ps.setString(1, s1);
            ps.setString(2, s2);
            ps.setDouble(3, b1);
            ps.setInt(4, a1);
            ps.setInt(5, a2);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Success!Data Updated");
            updateEquipTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_InsertNewEquipButActionPerformed

    private void EquipmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquipmentTableMouseClicked
        // TO register table to read the data values using mouse click
        int row = EquipmentTable.getSelectedRow();
        String tableClick = (EquipmentTable.getModel().getValueAt(row, 3).toString());
        try{
            String sql = "select * from EQUIPMENTS='"+tableClick+"'";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                double b1 = rs.getDouble(3);
                int a1 = rs.getInt(4);
                int a2 = rs.getInt(5);
                viewEquipmentIdTxt.setText(s1);
                viewEquipmentNameTxt.setText(s2);
                viewEquipmentCostTxt.setText(String.valueOf(b1));
                viewEquipmentSizeTxt.setText(String.valueOf(a1));
                viewEquipmentWDepthTxt.setText(String.valueOf(a2));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_EquipmentTableMouseClicked

    private void SampleDeleteButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SampleDeleteButMouseClicked
        // TO delete a record from the Sample table
        try {
            String deleteSql = "delete from SAMPLES where SAMPLENUMBER=?";
            ps = con.prepareStatement(deleteSql);
            ps.setString(1, viewsampleNumberTxt.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!\nOne record deleted!!");
            viewsampleNumberTxt.setText("");
            viewsampleNameTxt.getText();
            viewsampleLengthTxt.getText();
            viewsampleSLengthTxt.getText();
            viewsampleWeightTxt.getText();
            viewsampleGenderTxt.getText();
            updateSamTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_SampleDeleteButMouseClicked

    private void InsertNewsampleButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertNewsampleButActionPerformed
        // To update sample details: total length, weight
        try {
            int a1;
            String s1, s2, s3, s4, s5, s6;
            Double b1, b2, b3;
            s1 = viewsampleNumberTxt.getText();
            s2 = viewsampleNameTxt.getText();
            s3 = viewsampleLengthTxt.getText();
            s4 = viewsampleSLengthTxt.getText();
            s5 = viewsampleWeightTxt.getText();
            s6 = viewsampleGenderTxt.getText();
            a1 = Integer.parseInt(s1);
            b1 = Double.parseDouble(s3);
            b2 = Double.parseDouble(s4);
            b3 = Double.parseDouble(s5);
            String updateSql = "update SAMPLES set TOTALLENGTH=?, WEIGHT=? where SAMPLENUMBER=?";
            ps.setInt(1, a1);
            ps.setString(2, s2);
            ps.setDouble(3, b1);
            ps.setDouble(4, b2);
            ps.setDouble(5, b3);
            ps.setString(6, s6);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Success!Data Updated");
            updateSamTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_InsertNewsampleButActionPerformed

    private void sampleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sampleTableMouseClicked
        // To register table to read the data values using mouse click
        int row = sampleTable.getSelectedRow();
        String tableClick = (sampleTable.getModel().getValueAt(row, 2).toString());
        try {
            String sql = "select * from SAMPLES where SAMPLENUMBER='"+tableClick+"'";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                int a1 = rs.getInt(1);
                String s2 = rs.getString(2);
                Date f1 = rs.getDate(3);
                double b1 = rs.getDouble(4);
                double b2 = rs.getDouble(5);
                double b3 = rs.getDouble(6);
                String s3 = rs.getString(7);
                viewsampleNumberTxt.setText(String.valueOf(a1));
                viewsampleNameTxt.setText(s2);
                viewsampleLengthTxt.setText(String.valueOf(b1));
                viewsampleSLengthTxt.setText(String.valueOf(b2));
                viewsampleWeightTxt.setText(String.valueOf(b3));
                viewsampleGenderTxt.setText(s3);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_sampleTableMouseClicked

    private void insertNewSampleButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewSampleButActionPerformed
        // To create new sample
        try {
            String AddSamplessql="insert into SAMPLES(SAMPLENUMBER, SAMPLENAME, DATETAKEN, TOTALLENGTH, STANDARDLENGTH, WEIGHT, GENDER)values(?,?,?,?,?,?,?)";
            ps = con.prepareStatement(AddSamplessql);
            ps.setInt(1, Integer.parseInt(sampleNumberTxt.getText()));
            ps.setString(2, sampleNameTxt.getText());
            Date d = (Date)sampleDateChooser.getDateEditor().getDate();
            ps.setDate(3, new java.sql.Date(d.getTime()));
            ps.setDouble(4, Double.parseDouble(sampleLengthTxt.getText()));
            ps.setDouble(5, Double.parseDouble(sampleSLengthTxt.getText()));
            ps.setDouble(6, Double.parseDouble(sampleWeightTxt.getText()));
            ps.setString(7, sampleGenderTxt.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!!\nNew Sample inserted!!!");
            sampleNumberTxt.setText("");
            sampleNameTxt.setText("");
            Date systemDATe = new Date();
            sampleDateChooser.setDate(systemDATe);
            sampleLengthTxt.setText("");
            sampleSLengthTxt.setText("");
            sampleWeightTxt.setText("");
            sampleGenderTxt.setText("");
            updateSamTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insertion Error!!" + e);
        }
    }//GEN-LAST:event_insertNewSampleButActionPerformed

    private void DeleteNewSpeciesButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteNewSpeciesButActionPerformed
        // To delete a record from the Scientist table
        try{
            String deleteSql = "delete from SPECIES where SPECIESCODE=?";
            ps = con.prepareStatement(deleteSql);
            ps.setString(1, viewspeciesCodeTxt.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!!\nOne record deleted!!!");
            viewspeciesCodeTxt.setText("");
            viewspeciesNameTxt.getText();
            viewspeciesWeightTxt.getText();
            viewspeciesGenderTxt.getText();
            viewspeciesLifespanTxt.getText();
            viewspeciesLengthTxt.getText();
            updateSTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_DeleteNewSpeciesButActionPerformed

    private void UpdateNewSpeciesButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateNewSpeciesButActionPerformed
        // To update the species details: weight, totallength
        try {
            String s1, s2, s3, s4, s5, s6;
            Double b1, b2;
            int a1;
            s1 = viewspeciesCodeTxt.getText();
            s2 = viewspeciesNameTxt.getText();
            s3 = viewspeciesWeightTxt.getText();
            b1 = Double.parseDouble(s3);
            s4 = viewspeciesGenderTxt.getText();
            s5 = viewspeciesLifespanTxt.getText();
            a1 = Integer.parseInt(s5);
            s6 = viewspeciesLengthTxt.getText();
            b2 = Double.parseDouble(s6);
            String updateSql = "update SPECIES set WEIGHT=?,TOTALLENGTH=?";
            ps=con.prepareStatement(updateSql);
            ps.setDouble(1, b1);
            ps.setDouble(2, b2);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Success!Species Record Updated");
            updateSTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error: " + e);
        }
    }//GEN-LAST:event_UpdateNewSpeciesButActionPerformed

    private void SpeciesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpeciesTableMouseClicked
        // T0 register table to read the data values using mouse click
        int row = SpeciesTable.getSelectedRow();
        String tableClick = (SpeciesTable.getModel().getValueAt(row, 1).toString());
        try {
            String sql = "select * from SPECIES where SPECIESNAME='"+tableClick+"'";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                double b1 = rs.getDouble(3);
                String s3 = rs.getString(4);
                int a1 = rs.getInt(5);
                double b2 = rs.getDouble(6);
                viewspeciesCodeTxt.setText(s1);
                viewspeciesNameTxt.setText(s2);
                viewspeciesWeightTxt.setText(String.valueOf(b1));
                viewspeciesGenderTxt.setText(s3);
                viewspeciesLifespanTxt.setText(String.valueOf(a1));
                viewspeciesLengthTxt.setText(String.valueOf(b2));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_SpeciesTableMouseClicked

    private void insertNewSpeciesButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewSpeciesButActionPerformed
        // To create new Species
        try {
            String AddSpeciessql="insert into SPECIES(SPECIESCODE, SPECIESNAME, WEIGHT, GENDER, LIFESPAN, TOTALLENGTH)values(?,?,?,?,?,?)";
            ps = con.prepareStatement(AddSpeciessql);
            ps.setString(1, speciesCodeTxt.getText());
            ps.setString(2, speciesNameTxt.getText());
            ps.setDouble(3, Double.parseDouble(speciesWeightTxt.getText()));
            ps.setString(4, speciesGenderTxt.getText());
            ps.setInt(5, Integer.parseInt(speciesLifespanTxt.getText()));
            ps.setDouble(6, Double.parseDouble(speciesLengthTxt.getText()));
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!!\nNew Species inserted!!!");
            speciesCodeTxt.setText("");
            speciesNameTxt.setText("");
            speciesWeightTxt.setText("");
            speciesGenderTxt.setText("");
            speciesLifespanTxt.setText("");
            speciesLengthTxt.setText("");
            updateSTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insertion Error!!" + e);
        }
    }//GEN-LAST:event_insertNewSpeciesButActionPerformed

    private void DeleteScientistButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteScientistButActionPerformed
        // To delete a record from the Scientist table
        try{
            String deleteSql = "delete from SCIENTISTS where SCIENTISTID=?";
            ps = con.prepareStatement(deleteSql);
            ps.setString(1, viewscientistIdTxt.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!!\nOne record deleted!!!");
            viewscientistIdTxt.setText("");
            viewscientistFNameTxt.getText();
            viewscientistLNameTxt.getText();
            viewscientistEmailTxt.getText();
            viewscientistAddressTxt.getText();
            viewscientistNumber.getText();
            viewscientistGender.getText();
            updateTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error: " + e);
        }
    }//GEN-LAST:event_DeleteScientistButActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void UpdateNewScientistButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateNewScientistButActionPerformed
        // To update the scientist details: email, address, phone number
        try{
            String s1, s2, s3, s4, s5, s6, s7;
            s1 = viewscientistIdTxt.getText();
            s2 = viewscientistFNameTxt.getText();
            s3 = viewscientistLNameTxt.getText();
            s4 = viewscientistEmailTxt.getText();
            s5 = viewscientistAddressTxt.getText();
            s6 = viewscientistNumber.getText();
            s7 = viewscientistGender.getText();
            String updateSql = "update SCIENTISTS set EMAIL=?, ADDRESS=?, PHONENUMBER=? where SCIENTISTID=?";
            ps=con.prepareStatement(updateSql);
            ps.setString(1, s4);
            ps.setString(2, s5);
            ps.setString(3, s6);
            ps.setString(4, s1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Success!!!New data for scientist is updated!!!");
            updateTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error: " + e);
        }
    }//GEN-LAST:event_UpdateNewScientistButActionPerformed

    private void ScientistTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScientistTableMouseClicked
        // To register table to read the data values using mouse click
        int row = ScientistTable.getSelectedRow();
        String tableClick = (ScientistTable.getModel().getValueAt(row, 0).toString());
        try {
            String sql = "select * from SCIENTISTS where FIRSTNAME='"+tableClick+"'";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                String s4 = rs.getString(4);
                String s5 = rs.getString(5);
                Date d1 = rs.getDate(6);
                String s6 = rs.getString(7);
                Date d2 = rs.getDate(8);
                String s7 = rs.getString(9);
                viewscientistIdTxt.setText(s1);
                viewscientistFNameTxt.setText(s2);
                viewscientistLNameTxt.setText(s3);
                viewscientistEmailTxt.setText(s4);
                viewscientistAddressTxt.setText(s5);
                viewscientistSDateHiredDateChooser.setText(String.valueOf(d1));
                viewscientistNumber.setText(s6);
                viewscientistSDOBDateChooser.setText(String.valueOf(d2));
                viewscientistGender.setText(s7);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL syntax Error:" + e);
        }
    }//GEN-LAST:event_ScientistTableMouseClicked

    private void insertNewScientistButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewScientistButActionPerformed
        // To create a new scientist
        try {
            String AddScientistsql="insert into SCIENTISTS(SCIENTISTID, FIRSTNAME, LASTNAME, EMAIL, ADDRESS, DATEHIRED, PHONENUMBER,DATEOFBIRTH, GENDER)values(?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(AddScientistsql);
            ps.setString(1, scientistIdTxt.getText());
            ps.setString(2, scientistFNameTxt.getText());
            ps.setString(3, scientistLNameTxt.getText());
            ps.setString(4, scientistEmailTxt.getText());
            ps.setString(5, scientistAddressTxt.getText());
            Date d = (Date)SDateHiredDateChooser.getDateEditor().getDate();
            ps.setDate(6, new java.sql.Date(d.getTime()));
            ps.setString(7, scientistNumberTxt.getText());
            Date D = (Date)SDOBDateChooser.getDateEditor().getDate();
            ps.setDate(8, new java.sql.Date(D.getTime()));
            ps.setString(9, scientistGenderTxt.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success!!\nNew Scientist inserted!!!");
            scientistIdTxt.setText("");
            scientistFNameTxt.setText("");
            scientistLNameTxt.setText("");
            scientistEmailTxt.setText("");
            scientistAddressTxt.setText("");
            Date systemDaTe = new Date();
            SDateHiredDateChooser.setDate(systemDaTe);
            scientistNumberTxt.setText("");
            Date SystemDaTe = new Date();
            SDOBDateChooser.setDate(SystemDaTe);
            scientistGenderTxt.setText("");
            updateTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insertion Error!!" + e);
        }
    }//GEN-LAST:event_insertNewScientistButActionPerformed

    private void scientistIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scientistIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scientistIdTxtActionPerformed

    private void populateScientistComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_populateScientistComboBoxMouseClicked
        try {
          String sql = "select SCIENTISTID from SCIENTISTS";
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          while(rs.next()){
              String a1 = rs.getString(1);
              String a2 = rs.getString(2);
              
          }  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Populate Scientist Combo Error: " + e);
        }
    }//GEN-LAST:event_populateScientistComboBoxMouseClicked

    private void populateSpeciesComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_populateSpeciesComboBoxMouseClicked
         try{
            String sql = "select SPECIESCODE from SPECIES";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){    
            String key = rs.getString(1); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Populate Species Combo Error: " + e);
        }
    }//GEN-LAST:event_populateSpeciesComboBoxMouseClicked

    private void AssignScientistBuutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignScientistBuutonActionPerformed
        // To assign scientist to species
        String sqlw = "select * from SCIENTISTPECIES where SPECIESID=? and SPECIESCODE=?";
        String sqlv = "insert into SCIENTISTPECIES(SPECIESID, SPECIESCODE) values (?, ?)";
        try{
        ps=con.prepareStatement(sqlw); 
        ps.setString(1, populateScientistComboBox.getSelectedItem().toString());
        ps.setString(2, populateScientistComboBox.getSelectedItem().toString()); 
        rs = ps.executeQuery();
        if(rs.next()){
            JOptionPane.showMessageDialog(null, "Scientist is already assigned to the species!"); 
        }else{
        ps = con.prepareStatement(sqlv); 
        String s4 = populateScientistComboBox.getSelectedItem().toString();
        ps.setString(1, s4);   
        ps.setString(2, populateScientistComboBox.getSelectedItem().toString()); 
        ps.execute();
        JOptionPane.showMessageDialog(null, "Success!!\nScientist assigned to Species!!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Assigning scientist to species Error: " + e);
        }
    }//GEN-LAST:event_AssignScientistBuutonActionPerformed

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
            java.util.logging.Logger.getLogger(SystemForMarineResearchScientist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemForMarineResearchScientist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemForMarineResearchScientist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemForMarineResearchScientist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemForMarineResearchScientist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignScientistBuuton;
    private javax.swing.JTable ChemicalTable;
    private javax.swing.JTextField DataCTxt;
    private javax.swing.JTextField DataNTxt;
    private javax.swing.JTable DataTable;
    private javax.swing.JButton DelNewDataBut;
    private javax.swing.JButton DeleteChemicalBut;
    private javax.swing.JButton DeleteEquipBut;
    private javax.swing.JButton DeleteNewSpeciesBut;
    private java.awt.Button DeleteScientistBut;
    private javax.swing.JTextField EcoCDCTxt;
    private javax.swing.JTextField EcoDepthTxt;
    private javax.swing.JTextField EcoIdTxt;
    private javax.swing.JTextField EcoNCTxt;
    private javax.swing.JTextField EcoPLTxt;
    private javax.swing.JTextField EcoTempTxt;
    private javax.swing.JTextField EcosalinityTxt;
    private javax.swing.JTextField EquipementCostTxt;
    private javax.swing.JTextField EquipementNameTxt;
    private javax.swing.JTextField EquipementSizeTxt;
    private javax.swing.JTextField EquipementWDepthTxt;
    private javax.swing.JTextField EquipmentIDTxt;
    private javax.swing.JTable EquipmentTable;
    private javax.swing.JButton InsertChemicalBut;
    private javax.swing.JButton InsertNewDataBut;
    private javax.swing.JButton InsertNewEquipBut;
    private javax.swing.JButton InsertNewsampleBut;
    private com.toedter.calendar.JDateChooser SDOBDateChooser;
    private com.toedter.calendar.JDateChooser SDateHiredDateChooser;
    private javax.swing.JButton SampleDeleteBut;
    private javax.swing.JTable ScientistTable;
    private javax.swing.JTable SpeciesTable;
    private javax.swing.JTextField TimeRTxt;
    private javax.swing.JButton UpdateNewScientistBut;
    private javax.swing.JButton UpdateNewSpeciesBut;
    private java.awt.Button button1;
    private java.awt.Button button3;
    private java.awt.Button button5;
    private javax.swing.JButton inserNewDataBut;
    private javax.swing.JButton insertNewEcoBut;
    private javax.swing.JButton insertNewEquipmentsBut;
    private javax.swing.JButton insertNewSampleBut;
    private java.awt.Button insertNewScientistBut;
    private javax.swing.JButton insertNewSpeciesBut;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField6;
    private java.awt.Panel panel1;
    private java.awt.Panel panel10;
    private java.awt.Panel panel11;
    private java.awt.Panel panel12;
    private java.awt.Panel panel13;
    private java.awt.Panel panel14;
    private java.awt.Panel panel15;
    private java.awt.Panel panel16;
    private java.awt.Panel panel17;
    private java.awt.Panel panel18;
    private java.awt.Panel panel19;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel panel9;
    private javax.swing.JComboBox<String> populateScientistComboBox;
    private javax.swing.JComboBox<String> populateSpeciesComboBox;
    private com.toedter.calendar.JDateChooser sampleDateChooser;
    private javax.swing.JTextField sampleGenderTxt;
    private javax.swing.JTextField sampleLengthTxt;
    private javax.swing.JTextField sampleNameTxt;
    private javax.swing.JTextField sampleNumberTxt;
    private javax.swing.JTextField sampleSLengthTxt;
    private javax.swing.JTable sampleTable;
    private javax.swing.JTextField sampleWeightTxt;
    private javax.swing.JTextField scientistAddressTxt;
    private javax.swing.JTextField scientistEmailTxt;
    private javax.swing.JTextField scientistFNameTxt;
    private javax.swing.JTextField scientistGenderTxt;
    private javax.swing.JTextField scientistIdTxt;
    private javax.swing.JTextField scientistLNameTxt;
    private javax.swing.JTextField scientistNumberTxt;
    private javax.swing.JTextField speciesCodeTxt;
    private javax.swing.JTextField speciesGenderTxt;
    private javax.swing.JTextField speciesLengthTxt;
    private javax.swing.JTextField speciesLifespanTxt;
    private javax.swing.JTextField speciesNameTxt;
    private javax.swing.JTextField speciesWeightTxt;
    private javax.swing.JTextField viewCDCTxt;
    private javax.swing.JTextField viewChemicalIdTxt;
    private javax.swing.JTextField viewDataCodeTxt;
    private javax.swing.JTextField viewDataNameTxt;
    private javax.swing.JTextField viewEquipmentCostTxt;
    private javax.swing.JTextField viewEquipmentIdTxt;
    private javax.swing.JTextField viewEquipmentNameTxt;
    private javax.swing.JTextField viewEquipmentSizeTxt;
    private javax.swing.JTextField viewEquipmentWDepthTxt;
    private javax.swing.JTextField viewNCTxt;
    private javax.swing.JTextField viewSalTxt;
    private javax.swing.JTextField viewTempTxt;
    private javax.swing.JTextField viewTimeRecorTxt;
    private javax.swing.JTextField viewdepthTxt;
    private javax.swing.JTextField viewpHLevelTxt;
    private com.toedter.calendar.JDateChooser viewsampleDateChooser;
    private javax.swing.JTextField viewsampleGenderTxt;
    private javax.swing.JTextField viewsampleLengthTxt;
    private javax.swing.JTextField viewsampleNameTxt;
    private javax.swing.JTextField viewsampleNumberTxt;
    private javax.swing.JTextField viewsampleSLengthTxt;
    private javax.swing.JTextField viewsampleWeightTxt;
    private javax.swing.JTextField viewscientistAddressTxt;
    private javax.swing.JTextField viewscientistEmailTxt;
    private javax.swing.JTextField viewscientistFNameTxt;
    private javax.swing.JTextField viewscientistGender;
    private javax.swing.JTextField viewscientistIdTxt;
    private javax.swing.JTextField viewscientistLNameTxt;
    private javax.swing.JTextField viewscientistNumber;
    private javax.swing.JTextField viewscientistSDOBDateChooser;
    private javax.swing.JTextField viewscientistSDateHiredDateChooser;
    private javax.swing.JTextField viewspeciesCodeTxt;
    private javax.swing.JTextField viewspeciesGenderTxt;
    private javax.swing.JTextField viewspeciesLengthTxt;
    private javax.swing.JTextField viewspeciesLifespanTxt;
    private javax.swing.JTextField viewspeciesNameTxt;
    private javax.swing.JTextField viewspeciesWeightTxt;
    // End of variables declaration//GEN-END:variables

   
}
