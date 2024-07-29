
package cabalesjava;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Desiree
 */
public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
    }

    //this function will 
    public void addtable(String code ,String item, int quantity ,Double Price){
      DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
      Vector v = new Vector() ;
      v.add(code);
      v.add(item);
      v.add(quantity);
      v.add(Price);
      dt.addRow(v);
  }

    public void addtables(String code ,String item,int quantity ,Double Price){
       DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
       DecimalFormat df = new DecimalFormat("00.00") ;       
       double totPrice = Price * Double.valueOf(quantity) ;
       String TotalPrice = df.format(totPrice);
       
        //check if the product is already in the list
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (item == jTable1.getValueAt(row, 1)) {
                dt.removeRow(jTable1.convertRowIndexToModel(row));
            } 
        }
        
        Vector v = new Vector();
        v.add(code);
        v.add(item);
        v.add(quantity);
        v.add(TotalPrice);
        dt.addRow(v);
    }
    
    //this function will calculate total values
    public void calculate(){
    int numOfRow = jTable1.getRowCount() ;
    double total = 0.0 ;
       for (int i = 0; i < numOfRow; i++) {
           
           double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
          
           total += value ;
       }
       DecimalFormat df = new DecimalFormat("00.00") ;
       totallabel.setText(df.format(total));
   } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itempanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        headerpanel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        changelabel = new javax.swing.JLabel();
        totallabel = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        itempanel.setBackground(new java.awt.Color(255, 255, 204));
        itempanel.setForeground(new java.awt.Color(255, 255, 204));
        itempanel.setName("items"); // NOI18N
        itempanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 153));
        jLabel30.setText("Sinigang na baboy | Php 70.00");
        itempanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/o1.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        itempanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        q1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(0, 0, 153));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");
        itempanel.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 59, -1));

        jLabel8.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Abodo | Php 60.00");
        itempanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/o2.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        itempanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        q4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q4.setForeground(new java.awt.Color(0, 0, 153));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");
        itempanel.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 32, -1));

        jLabel10.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Kare-kare | Php 75.00");
        itempanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/o3.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        itempanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        q5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q5.setForeground(new java.awt.Color(0, 0, 153));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");
        itempanel.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 37, -1));

        jLabel12.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Lechong Kawali | Php 90.00");
        itempanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/o4.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        itempanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        q3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q3.setForeground(new java.awt.Color(0, 0, 153));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");
        itempanel.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 38, -1));

        jLabel4.setFont(new java.awt.Font("Artifakt Element Black", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dess-removebg-preview.png"))); // NOI18N
        itempanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Artifakt Element Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Select your order by clicking the picture");
        itempanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Sisig | Php 90.00");
        itempanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/o5.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        itempanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, 140));

        q2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q2.setForeground(new java.awt.Color(0, 0, 153));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");
        itempanel.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 23, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/o7.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        itempanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, -1, -1));

        jLabel15.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Halo Halo | Php 90.00");
        itempanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 690, -1, -1));

        q6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q6.setForeground(new java.awt.Color(0, 0, 153));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");
        itempanel.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, 37, -1));

        jLabel17.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Mais con Yelo | Php 70.00");
        itempanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, -1, -1));

        q7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q7.setForeground(new java.awt.Color(0, 0, 153));
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");
        itempanel.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, 37, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/o6.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        itempanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/o8.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        itempanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 170, 140));

        jLabel19.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setText("Leche flan | Php 80.00");
        itempanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 690, -1, -1));

        q8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q8.setForeground(new java.awt.Color(0, 0, 153));
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");
        itempanel.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 710, 37, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 51));
        jLabel25.setFont(new java.awt.Font("Artifakt Element Black", 2, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dish-removebg-preview.png"))); // NOI18N
        itempanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1010, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        itempanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1050, -1));

        jLabel27.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 153));
        jLabel27.setText("Abodo | Php 60.00");
        itempanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        headerpanel.setBackground(new java.awt.Color(137, 95, 54));
        headerpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hapagkainan.png"))); // NOI18N
        headerpanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/header.png"))); // NOI18N
        headerpanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exiticon.png"))); // NOI18N
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        headerpanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 10, -1, 40));

        jLabel37.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 204, 0));
        jLabel37.setText("ABOUT US");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        headerpanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 20, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b3.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        headerpanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Iteam", "Qty", "Price"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel20.setFont(new java.awt.Font("Artifakt Element Black", 2, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 51));
        jLabel20.setText("YOUR ORDER");

        receipt.setColumns(20);
        receipt.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        receipt.setRows(5);
        jScrollPane2.setViewportView(receipt);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("CONFIRM ORDER");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 150, -1));

        jLabel22.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel22.setText("Total :      Php");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel23.setText("Cash :        Php");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 33));

        jLabel24.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel24.setText("Change:    Php");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        changelabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        changelabel.setText(" ");
        jPanel3.add(changelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, -1));

        totallabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totallabel.setText(" ");
        jPanel3.add(totallabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 210, -1));

        pay.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel3.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 210, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b2.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 60));

        jLabel33.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("PRINT RECEIPT");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b2.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 60));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Artifakt Element Black", 2, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 51));
        jLabel21.setText("RECEIPT");

        jButton13.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jButton13.setText("Delete");
        jButton13.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 51));
        jLabel26.setText("Select a row and click delete to remove item.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itempanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(headerpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itempanel, javax.swing.GroupLayout.PREFERRED_SIZE, 912, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i)); //show quantity
        //add the selected to table
        addtables("M1", "Sinigang", i, 70.00);
        calculate();//compute total by calling the function calculate
    }//GEN-LAST:event_jLabel3MouseClicked

    //deleting an order
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        String r = dt.getValueAt(jTable1.getSelectedRow(), 0).toString();
        //remove product
        int rw = jTable1.getSelectedRow();
        dt.removeRow(rw);
        //remove quanty Lable
        System.out.println(r);
        switch (r) {

            case "1":
            q1.setText("0");
            break;

            case "2":
            q2.setText("0");
            break;

            case "3":
            q3.setText("0");
            break;

            case "4":
            q4.setText("0");
            break;

            case "5":
            q5.setText("0");
            break;

            case "6":
            q6.setText("0");

            case "7":
            q7.setText("0");
            break;

            case "8":
            q8.setText("0");
            break;

            default:
            System.out.println("over");
        }

        calculate();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        //add the selected to table
        addtables("M3", "Kare-kare", i, 75.00);
        calculate();//compute total by calling the function calculate
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        //add the selected to table
        addtables("M4", "Lech Kawali", i, 90.00);
        calculate();//compute total by calling the function calculate
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        //add the selected to table
        addtables("M5", "Sisig", i, 90.00);
        calculate();//compute total by calling the function calculate
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        //add the selected to table
        addtables("D1", "Halo-halo", i, 75.00);
        calculate();//compute total by calling the function calculate
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        //add the selected to table
        addtables("D2", "Mais con Yelo", i, 70.00);
        calculate();//compute total by calling the function calculate
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i)); //show quantity
        //add the selected to table
        addtables("D3", "Leche flan", i, 80.00);
        calculate();//compute total by calling the function calculate
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        //compute change
        double total = Double.valueOf(totallabel.getText());
        double payment = Double.valueOf(pay.getText());
        if (total > payment){
            JOptionPane.showMessageDialog(null, "The amount of payment is less than the total bill");
        }
        else{
            double change = payment - total ;
            DecimalFormat df = new DecimalFormat("00.00") ;   
            changelabel.setText(String.valueOf(df.format(change)));
        }    
        
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
       
        try {

            receipt.setText("                                                                          HAPAGKAINAN \n");
            receipt.setText(receipt.getText() + "                                                                              Santo Cristo, \n");
            receipt.setText(receipt.getText() + "                                                                            San Jose, Batangas \n");
            receipt.setText(receipt.getText() + "                                                                               +698 342 3723, \n");
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            receipt.setText(receipt.getText() + "  \tItem \t\tQty \tPrice" +"\n");
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                String item = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Price = df.getValueAt(i, 3).toString();
                receipt.setText(receipt.getText() +"  \t"+ item+"\t\t"+Qty +"\t"+Price + "\n");
            }

            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            receipt.setText(receipt.getText() + "                 Bill Total    :   Php " + totallabel.getText() +"\n");
            receipt.setText(receipt.getText() + "                 Cash           :   Php " + pay.getText() +"\n");
            receipt.setText(receipt.getText() + "                 Change        :   Php " + changelabel.getText() +"\n");
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            receipt.setText(receipt.getText() + "                                                THANK YOU FOR DINING WITH US! COME AGAIN"+"\n");
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            receipt.print(); //print

        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jLabel32MouseClicked
    

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        //add the selected to table
        addtables("M2", "Adobo", i, 60.00);
        calculate();//compute total by calling the function calculate
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
       setVisible(false);
       AboutUs window =new AboutUs();
       window.setVisible(true);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changelabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JPanel itempanel;
    private javax.swing.JButton jButton13;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JTextArea receipt;
    private javax.swing.JLabel totallabel;
    // End of variables declaration//GEN-END:variables
}
