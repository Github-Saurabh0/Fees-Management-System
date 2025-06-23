/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.wearl.feesmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Saurabh
 */
public class Addfees extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Addfees.class.getName());

    /**
     * Creates new form SignUpPage
     */
    public void displayCashZero() {
        Cash_Label.setVisible(true);
        Cash_fields.setVisible(true);

        GooglePay_Label.setVisible(false);
        GooglePay_field.setVisible(false);

        PhonePe_Label.setVisible(false);
        PhonePe_field.setVisible(false);

        Cheque_Label.setVisible(false);
        Cheque_field.setVisible(false);

        bankname_label.setVisible(false);
        bank_name_field.setVisible(false);
        
        

    }

    public void displayGooglePayFirst() {
        Cash_Label.setVisible(false);
        Cash_fields.setVisible(false);

        GooglePay_Label.setVisible(true);
        GooglePay_field.setVisible(true);

        PhonePe_Label.setVisible(false);
        PhonePe_field.setVisible(false);

        Cheque_Label.setVisible(false);
        Cheque_field.setVisible(false);

        bankname_label.setVisible(true);
        bank_name_field.setVisible(true);

    }

    public void displayPhonepeSecond() {
        Cash_Label.setVisible(false);
        Cash_fields.setVisible(false);

        GooglePay_Label.setVisible(false);
        GooglePay_field.setVisible(false);

        PhonePe_Label.setVisible(true);
        PhonePe_field.setVisible(true);

        Cheque_Label.setVisible(false);
        Cheque_field.setVisible(false);

        bankname_label.setVisible(true);
        bank_name_field.setVisible(true);

    }

    public void displayChequethird() {
        Cash_Label.setVisible(false);
        Cash_fields.setVisible(false);

        GooglePay_Label.setVisible(false);
        GooglePay_field.setVisible(false);

        PhonePe_Label.setVisible(false);
        PhonePe_field.setVisible(false);

        Cheque_Label.setVisible(true);
        Cheque_field.setVisible(true);

        bankname_label.setVisible(true);
        bank_name_field.setVisible(true);

    }

    public Addfees() {
        initComponents();
        displayCashZero();
        fillComboBox();
    }

    boolean Validation() {

        if(Receipt_no_field.getText().trim().isEmpty() || !Receipt_no_field.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Please Enter Receipt No");
            return false;
        }

        if (DateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please Choose Date");
            return false;
        }
        
        if(payment_mode_dropdown.getSelectedItem().toString().equalsIgnoreCase("Cash"))
        {
            if (Cash_fields.getText().equals("")) 
            {
            JOptionPane.showMessageDialog(this, "Please Enter Cash Details");
            return false;
            }
        }

        

        if(payment_mode_dropdown.getSelectedItem().toString().equalsIgnoreCase("GooglePay"))
        {
            if (GooglePay_field.getText().equals("")) 
            {
            JOptionPane.showMessageDialog(this, "Please Enter GooglePay Details");
            return false;
            }
            if(bank_name_field.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please Enter Bank Details");
            return false;
            }
        }
        
        if(payment_mode_dropdown.getSelectedItem().toString().equalsIgnoreCase("PhonePe"))
        {
            if (PhonePe_field.getText().equals("")) 
            {
            JOptionPane.showMessageDialog(this, "Please Enter PhonePe Details");
            return false;
            }
            if(bank_name_field.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please Enter Bank Details");
            return false;
            }
        }
        
        if(payment_mode_dropdown.getSelectedItem().toString().equalsIgnoreCase("Cheque"))
        {
           if (Cheque_field.getText().equals("")) 
           {
            JOptionPane.showMessageDialog(this, "Please Enter Cheque Details");
            return false;
           }
           if(bank_name_field.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "Please Enter Bank Details");
            return false;
            }
        }
        
        if (receiver_field.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Receiver Name");
            return false;
        }
        
        
        if(Rollno_field.getText().trim().isEmpty() || !Rollno_field.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Please Enter Roll No.");
            return false;
        }

        if (Amount_field.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Head Amount Details");
            return false;
        }

        if (first_amount.getText().trim().isEmpty() || !first_amount.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please Enter Amount (In Numbers)");
            return false;
        }


        if (Remark_field.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Remark ");
            return false;
        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UnameEnterError = new javax.swing.JLabel();
        PwdEnterError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        date_label = new javax.swing.JLabel();
        payment_mode_label = new javax.swing.JLabel();
        Cash_Label = new javax.swing.JLabel();
        Cash_fields = new javax.swing.JTextField();
        GooglePay_Label = new javax.swing.JLabel();
        GooglePay_field = new javax.swing.JTextField();
        PhonePe_Label = new javax.swing.JLabel();
        PhonePe_field = new javax.swing.JTextField();
        Cheque_Label = new javax.swing.JLabel();
        Cheque_field = new javax.swing.JTextField();
        Gstin_label = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        Receipt_no_label = new javax.swing.JLabel();
        Receipt_no_field = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        received_month_field_2 = new javax.swing.JComboBox<>();
        Remark_label = new javax.swing.JLabel();
        Total_in_words_field = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        courses_label = new javax.swing.JLabel();
        sr_no_label = new javax.swing.JLabel();
        head__label = new javax.swing.JLabel();
        amount_label = new javax.swing.JLabel();
        Rollno_field = new javax.swing.JTextField();
        Amount_field = new javax.swing.JTextField();
        rollno_label = new javax.swing.JLabel();
        first_amount = new javax.swing.JTextField();
        Cgst_label = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Sgst_label = new javax.swing.JLabel();
        Signature_label = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Total_label = new javax.swing.JLabel();
        Totalwords_label = new javax.swing.JLabel();
        Print_button = new javax.swing.JButton();
        Remark_field_panel = new javax.swing.JScrollPane();
        Remark_field = new javax.swing.JTextArea();
        Courses_dropdown = new javax.swing.JComboBox<>();
        received_month_field_1 = new javax.swing.JComboBox<>();
        Receiver_label = new javax.swing.JLabel();
        receiver_field = new javax.swing.JTextField();
        total_field = new javax.swing.JTextField();
        cgst_field = new javax.swing.JTextField();
        sgst_field = new javax.swing.JTextField();
        payment_mode_dropdown = new javax.swing.JComboBox<>();
        bankname_label = new javax.swing.JLabel();
        bank_name_field = new javax.swing.JTextField();
        Home_button = new javax.swing.JButton();
        Search_button = new javax.swing.JButton();
        edit_course_button = new javax.swing.JButton();
        course_list_button = new javax.swing.JButton();
        all_record_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Fees - Saurabhh Fees Management System");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(700, 650));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(jLabel1);
        jLabel1.setText("Add Fees Fields...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 310, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 90));

        UnameEnterError.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        UnameEnterError.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(UnameEnterError, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        PwdEnterError.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PwdEnterError.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(PwdEnterError, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(700, 570));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 570));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(490, 570));
        jPanel3.setPreferredSize(new java.awt.Dimension(490, 570));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        date_label.setText("Date:");
        jPanel3.add(date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        payment_mode_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        payment_mode_label.setText("Mode of Payment:");
        jPanel3.add(payment_mode_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Cash_Label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Cash_Label.setText("Cash:");
        jPanel3.add(Cash_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Cash_fields.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        Cash_fields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cash_fieldsActionPerformed(evt);
            }
        });
        jPanel3.add(Cash_fields, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, 22));

        GooglePay_Label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        GooglePay_Label.setText("GooglePay:");
        jPanel3.add(GooglePay_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        GooglePay_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        GooglePay_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GooglePay_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(GooglePay_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, -1));

        PhonePe_Label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        PhonePe_Label.setText("PhonePe:");
        jPanel3.add(PhonePe_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        PhonePe_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        PhonePe_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhonePe_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(PhonePe_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, -1));

        Cheque_Label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Cheque_Label.setText("Cheque No:");
        jPanel3.add(Cheque_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Cheque_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        Cheque_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cheque_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(Cheque_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, -1));

        Gstin_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Gstin_label.setText("GSTIN:  09IUW88J1Z7 ");
        jPanel3.add(Gstin_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        DateChooser.setBackground(new java.awt.Color(255, 255, 255));
        DateChooser.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        jPanel3.add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 30, 140, 20));

        Receipt_no_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Receipt_no_label.setText("Receipt No. ");
        jPanel3.add(Receipt_no_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Receipt_no_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        Receipt_no_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Receipt_no_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(Receipt_no_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 90, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(490, 370));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("to");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 20, 20));

        received_month_field_2.setBackground(new java.awt.Color(255, 204, 0));
        received_month_field_2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        received_month_field_2.setForeground(new java.awt.Color(255, 255, 236));
        received_month_field_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        received_month_field_2.setSelectedIndex(7);
        jPanel4.add(received_month_field_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, -1));

        Remark_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Remark_label.setText("Remark: ");
        jPanel4.add(Remark_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 20));

        Total_in_words_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        Total_in_words_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_in_words_fieldActionPerformed(evt);
            }
        });
        jPanel4.add(Total_in_words_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, 22));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setText("Received from for the given month ");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 490, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 0, 51));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 267, 130, -1));

        courses_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        courses_label.setText("Course:");
        jPanel4.add(courses_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 40, 60, 20));

        sr_no_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        sr_no_label.setText("Sr No.");
        jPanel4.add(sr_no_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        head__label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        head__label.setText("Head");
        jPanel4.add(head__label, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, 30));

        amount_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        amount_label.setText("Amount");
        jPanel4.add(amount_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 30));

        Rollno_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        Rollno_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rollno_fieldActionPerformed(evt);
            }
        });
        jPanel4.add(Rollno_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 70, -1));

        Amount_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        Amount_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Amount_fieldActionPerformed(evt);
            }
        });
        jPanel4.add(Amount_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 160, 23));
        Amount_field.getAccessibleContext().setAccessibleDescription("");

        rollno_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rollno_label.setText("Roll No: ");
        jPanel4.add(rollno_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 20));

        first_amount.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        first_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                first_amountMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                first_amountMouseExited(evt);
            }
        });
        first_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_amountActionPerformed(evt);
            }
        });
        first_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                first_amountKeyTyped(evt);
            }
        });
        jPanel4.add(first_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 80, 23));
        first_amount.getAccessibleContext().setAccessibleName("");

        Cgst_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Cgst_label.setText("CGST 7%");
        jPanel4.add(Cgst_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 140, 70, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 0, 51));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 490, 10));

        Sgst_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Sgst_label.setText("SGST 6%");
        jPanel4.add(Sgst_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 70, 20));

        Signature_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Signature_label.setText("Signature");
        jPanel4.add(Signature_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 0, 51));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 490, 10));

        Total_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Total_label.setText("Total:");
        jPanel4.add(Total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 50, 20));

        Totalwords_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Totalwords_label.setText("Total in Words:");
        jPanel4.add(Totalwords_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, 20));

        Print_button.setBackground(new java.awt.Color(255, 0, 51));
        Print_button.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        Print_button.setForeground(new java.awt.Color(255, 255, 255));
        Print_button.setText("Print");
        Print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(Print_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        Remark_field.setColumns(20);
        Remark_field.setRows(5);
        Remark_field_panel.setViewportView(Remark_field);

        jPanel4.add(Remark_field_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        Courses_dropdown.setBackground(new java.awt.Color(255, 204, 0));
        Courses_dropdown.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Courses_dropdown.setForeground(new java.awt.Color(255, 255, 236));
        Courses_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Courses_dropdownActionPerformed(evt);
            }
        });
        jPanel4.add(Courses_dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, -1));

        received_month_field_1.setBackground(new java.awt.Color(255, 204, 0));
        received_month_field_1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        received_month_field_1.setForeground(new java.awt.Color(255, 255, 236));
        received_month_field_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        received_month_field_1.setSelectedIndex(5);
        jPanel4.add(received_month_field_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, -1));

        Receiver_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Receiver_label.setText("Receiver:");
        jPanel4.add(Receiver_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        receiver_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        receiver_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiver_fieldActionPerformed(evt);
            }
        });
        jPanel4.add(receiver_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 90, -1));

        total_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        total_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_fieldActionPerformed(evt);
            }
        });
        jPanel4.add(total_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 80, 23));

        cgst_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        cgst_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgst_fieldActionPerformed(evt);
            }
        });
        jPanel4.add(cgst_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 80, 23));

        sgst_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        sgst_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgst_fieldActionPerformed(evt);
            }
        });
        jPanel4.add(sgst_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 80, 23));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 490, -1));

        payment_mode_dropdown.setBackground(new java.awt.Color(0, 153, 0));
        payment_mode_dropdown.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        payment_mode_dropdown.setForeground(new java.awt.Color(255, 255, 236));
        payment_mode_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "GooglePay", "PhonePe", "Cheque" }));
        payment_mode_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_mode_dropdownActionPerformed(evt);
            }
        });
        jPanel3.add(payment_mode_dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        bankname_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bankname_label.setText("Bank Name:");
        jPanel3.add(bankname_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        bank_name_field.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        bank_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_name_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(bank_name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 90, 22));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 490, -1));

        Home_button.setBackground(new java.awt.Color(255, 51, 102));
        Home_button.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        Home_button.setForeground(new java.awt.Color(255, 255, 255));
        Home_button.setText("Home");
        Home_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_buttonMouseClicked(evt);
            }
        });
        Home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(Home_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 30));

        Search_button.setBackground(new java.awt.Color(255, 51, 102));
        Search_button.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        Search_button.setForeground(new java.awt.Color(255, 255, 255));
        Search_button.setText("Search record");
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(Search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 30));

        edit_course_button.setBackground(new java.awt.Color(255, 51, 102));
        edit_course_button.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        edit_course_button.setForeground(new java.awt.Color(255, 255, 255));
        edit_course_button.setText("Edit Course");
        edit_course_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_course_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(edit_course_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 30));

        course_list_button.setBackground(new java.awt.Color(255, 51, 102));
        course_list_button.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        course_list_button.setForeground(new java.awt.Color(255, 255, 255));
        course_list_button.setText("Course List");
        course_list_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_list_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(course_list_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 30));

        all_record_button.setBackground(new java.awt.Color(255, 51, 102));
        all_record_button.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        all_record_button.setForeground(new java.awt.Color(255, 255, 255));
        all_record_button.setText("View All Records");
        all_record_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_record_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(all_record_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 30));

        back_button.setBackground(new java.awt.Color(255, 51, 102));
        back_button.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        back_button.setForeground(new java.awt.Color(255, 255, 255));
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        logout_button.setBackground(new java.awt.Color(255, 51, 102));
        logout_button.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        logout_button.setForeground(new java.awt.Color(255, 255, 255));
        logout_button.setText("Logout");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, -1));

        setSize(new java.awt.Dimension(714, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Home_buttonActionPerformed

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_buttonActionPerformed

    private void edit_course_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_course_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_course_buttonActionPerformed

    private void course_list_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_list_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_list_buttonActionPerformed

    private void all_record_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_record_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_all_record_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void Home_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_buttonMouseClicked

        Dashboard Db = new Dashboard();
        Db.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Home_buttonMouseClicked

    private void Total_in_words_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_in_words_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_in_words_fieldActionPerformed

    private void Receipt_no_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Receipt_no_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Receipt_no_fieldActionPerformed

    private void Cash_fieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cash_fieldsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cash_fieldsActionPerformed

    private void bank_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_name_fieldActionPerformed

    private void Rollno_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rollno_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rollno_fieldActionPerformed

    private void Amount_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Amount_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Amount_fieldActionPerformed

    
    private void first_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_amountActionPerformed
    
        
    }//GEN-LAST:event_first_amountActionPerformed

    private void Print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_buttonActionPerformed
        Validation();
    }//GEN-LAST:event_Print_buttonActionPerformed

    private void payment_mode_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_mode_dropdownActionPerformed
        if (payment_mode_dropdown.getSelectedIndex() == 0) {
            displayCashZero();
        }
        if (payment_mode_dropdown.getSelectedIndex() == 1) {
            displayGooglePayFirst();
        }
        if (payment_mode_dropdown.getSelectedIndex() == 2) {
            displayPhonepeSecond();
        }
        if (payment_mode_dropdown.getSelectedIndex() == 3) {
            displayChequethird();
        }


    }//GEN-LAST:event_payment_mode_dropdownActionPerformed

    private void GooglePay_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GooglePay_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GooglePay_fieldActionPerformed

    private void PhonePe_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhonePe_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhonePe_fieldActionPerformed

    private void Cheque_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cheque_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cheque_fieldActionPerformed

    private void receiver_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiver_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiver_fieldActionPerformed

    private void first_amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_first_amountKeyTyped
        
    }//GEN-LAST:event_first_amountKeyTyped

    private void total_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_fieldActionPerformed

    private void cgst_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgst_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cgst_fieldActionPerformed

    private void sgst_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgst_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sgst_fieldActionPerformed

    private void first_amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_first_amountMouseClicked
        
    }//GEN-LAST:event_first_amountMouseClicked

    public static String convertToWords(int n) {
    final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                             "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                             "Eighteen", "Nineteen" };

    final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    if (n < 20) return units[n];

    if (n < 100) return tens[n / 10] + (n % 10 != 0 ? " " + convertToWords(n % 10) : "");

    if (n < 1000) return units[n / 100] + " Hundred" + (n % 100 != 0 ? " " + convertToWords(n % 100) : "");

    if (n < 100000) return convertToWords(n / 1000) + " Thousand" + (n % 1000 != 0 ? " " + convertToWords(n % 1000) : "");

    return "Number too large";
}

    private void first_amountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_first_amountMouseExited
        String amountNumber = first_amount.getText();
        float amt = Float.parseFloat(amountNumber);
        float cgst = amt * 0.07F;
        float sgst = amt * 0.06F;
        cgst_field.setText(Float.toString(cgst));
        sgst_field.setText(Float.toString(sgst));
        float Totalamt = amt+cgst+sgst;
        total_field.setText(Float.toString(Totalamt));
        
        String totalStr = total_field.getText();

        if (totalStr != null && !totalStr.isEmpty()) {
            try {
                float totalValue = Float.parseFloat(totalStr);
                int roundedTotal = Math.round(totalValue); // Decimal ignore karna ho to
                String words = convertToWords(roundedTotal);
                Total_in_words_field.setText(words + " Only");
            } catch (NumberFormatException e) {
                Total_in_words_field.setText("Invalid Amount");
            }
        }
        
    }//GEN-LAST:event_first_amountMouseExited

    private void Courses_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Courses_dropdownActionPerformed
        String s1 = Courses_dropdown.getSelectedItem().toString();
        Amount_field.setText(s1);
    }//GEN-LAST:event_Courses_dropdownActionPerformed

    public void fillComboBox(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/wtfmsdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            //2. Establishing Statement or Connection
            Connection con = DriverManager.getConnection(url, "root", "Jaimaiki12345#");
            // Ek normal insert query chala rha hu jisse me jo course table ke andar ka cname bala date mil jaye
            String sql = "Select Cname from course";
            //3. con ke pass ek prepareStatement nam ka function hota hai or ye preparedStatement naam ka data return krta hai  
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                Courses_dropdown.addItem(rs.getString("Cname"));
            }
            
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Addfees().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount_field;
    private javax.swing.JLabel Cash_Label;
    private javax.swing.JTextField Cash_fields;
    private javax.swing.JLabel Cgst_label;
    private javax.swing.JLabel Cheque_Label;
    private javax.swing.JTextField Cheque_field;
    private javax.swing.JComboBox<String> Courses_dropdown;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel GooglePay_Label;
    private javax.swing.JTextField GooglePay_field;
    private javax.swing.JLabel Gstin_label;
    private javax.swing.JButton Home_button;
    private javax.swing.JLabel PhonePe_Label;
    private javax.swing.JTextField PhonePe_field;
    private javax.swing.JButton Print_button;
    private javax.swing.JLabel PwdEnterError;
    private javax.swing.JTextField Receipt_no_field;
    private javax.swing.JLabel Receipt_no_label;
    private javax.swing.JLabel Receiver_label;
    private javax.swing.JTextArea Remark_field;
    private javax.swing.JScrollPane Remark_field_panel;
    private javax.swing.JLabel Remark_label;
    private javax.swing.JTextField Rollno_field;
    private javax.swing.JButton Search_button;
    private javax.swing.JLabel Sgst_label;
    private javax.swing.JLabel Signature_label;
    private javax.swing.JTextField Total_in_words_field;
    private javax.swing.JLabel Total_label;
    private javax.swing.JLabel Totalwords_label;
    private javax.swing.JLabel UnameEnterError;
    private javax.swing.JButton all_record_button;
    private javax.swing.JLabel amount_label;
    private javax.swing.JButton back_button;
    private javax.swing.JTextField bank_name_field;
    private javax.swing.JLabel bankname_label;
    private javax.swing.JTextField cgst_field;
    private javax.swing.JButton course_list_button;
    private javax.swing.JLabel courses_label;
    private javax.swing.JLabel date_label;
    private javax.swing.JButton edit_course_button;
    private javax.swing.JTextField first_amount;
    private javax.swing.JLabel head__label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton logout_button;
    private javax.swing.JComboBox<String> payment_mode_dropdown;
    private javax.swing.JLabel payment_mode_label;
    private javax.swing.JComboBox<String> received_month_field_1;
    private javax.swing.JComboBox<String> received_month_field_2;
    private javax.swing.JTextField receiver_field;
    private javax.swing.JLabel rollno_label;
    private javax.swing.JTextField sgst_field;
    private javax.swing.JLabel sr_no_label;
    private javax.swing.JTextField total_field;
    // End of variables declaration//GEN-END:variables
}
