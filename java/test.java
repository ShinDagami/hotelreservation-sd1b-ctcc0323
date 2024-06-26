
import static com.sun.source.util.DocTrees.instance;
import static com.sun.source.util.JavacTask.instance;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shinjiro
 */
public class test extends javax.swing.JFrame {
    
    private Object CIDate;
    
    private static test instance;
    
    public static test getInstance() {
        if (instance == null) {
            instance = new test();
        }
        return instance;
    }
    
    

    /**
     * Creates new form test
     */
    public test() {
        initComponents();
        
        this.setTitle("Hotel Reservation");
        instance = this;
    }
    
    public javax.swing.JLabel getPr1() {
        return pr1;
    }
    public javax.swing.JLabel getPr2() {
        return pr2;
    }
    public javax.swing.JLabel getPr3() {
        return pr3;
    }
    public javax.swing.JLabel getPr4() {
        return pr4;
    }
    public javax.swing.JLabel getPr5() {
        return pr5;
    }

    
    public javax.swing.JLabel getTime() {
        return time;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    int totalPrice = 0;
    int[] roomPrices = {1053, 1256, 1377, 1863, 6085};
    private hatdog hatdogInstance;
    private Room2 Room2Instance;
    private Room3 Room3Instance;
    private Room4 Room4Instance;
    private Room5 Room5Instance;
    private Cont contInstance;
    
    
    LocalDate currentDate = LocalDate.now();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Info1 = new javax.swing.JButton();
        Info3 = new javax.swing.JButton();
        Info4 = new javax.swing.JButton();
        Info5 = new javax.swing.JButton();
        Info2 = new javax.swing.JButton();
        pr5 = new javax.swing.JLabel();
        pr1 = new javax.swing.JLabel();
        pr2 = new javax.swing.JLabel();
        pr3 = new javax.swing.JLabel();
        pr4 = new javax.swing.JLabel();
        CIInput = new javax.swing.JTextField();
        COInput = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(555, 900));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setText("-> Queen Room");

        jLabel15.setText("----------------------------------------------------------------------------------------------------------------------------------");

        jLabel25.setText("(1 Large Double Bed)");

        jLabel12.setText("----------------------------------------------------------------------------------------------------------------------------------");

        jLabel22.setText("(2 Single Beds)");

        jLabel21.setText("----------------------------------------------------------------------------------------------------------------------------------");

        jLabel24.setText("----------------------------------------------------------------------------------------------------------------------------------");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setText("-> Deluxe Double Room");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\alvar\\Downloads\\byasd.jpg"));

        jLabel16.setText("(1 Double Bed)");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel8.setText("Hotel Reservation");

        jLabel14.setText("(1 Single Bed)");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("-> Standard Single Room");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("-> Standard Twin Room");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("-> Standard Double Room");

        jLabel13.setText("----------------------------------------------------------------------------------------------------------------------------------");

        jLabel19.setText("(2 Double Bed)");

        jLabel18.setText("----------------------------------------------------------------------------------------------------------------------------------");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Check in/Check out Date");

        Info1.setText("Info");
        Info1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info1ActionPerformed(evt);
            }
        });

        Info3.setText("Info");
        Info3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info3ActionPerformed(evt);
            }
        });

        Info4.setText("Info");
        Info4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info4ActionPerformed(evt);
            }
        });

        Info5.setText("Info");
        Info5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info5ActionPerformed(evt);
            }
        });

        Info2.setText("Info");
        Info2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info2ActionPerformed(evt);
            }
        });

        pr5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pr5.setText("Price: P6085 / night");

        pr1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pr1.setText("Price: P1053 / night");

        pr2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pr2.setText("Price: P1256 / night");

        pr3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pr3.setText("Price: P1377 / night");

        pr4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pr4.setText("Price: P1863 / night");

        CIInput.setText("Check in");
        CIInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIInputActionPerformed(evt);
            }
        });

        COInput.setText("Check out");
        COInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COInputActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel27.setText("Rooms type");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("mm/dd/yyyy");

        jLabel2.setText("mm/dd/yyyy");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9am", "2pm", "8pm" }));

        time.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        time.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addComponent(Info2)
                                .addGap(53, 53, 53)
                                .addComponent(pr2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58)
                                .addComponent(Info1)
                                .addGap(49, 49, 49)
                                .addComponent(pr3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(Info3)
                                .addGap(57, 57, 57)
                                .addComponent(pr1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)
                                .addComponent(Info5)
                                .addGap(50, 50, 50)
                                .addComponent(pr5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(Info4)
                                .addGap(48, 48, 48)
                                .addComponent(pr4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CIInput)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo, 0, 85, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(COInput, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE))
                        .addGap(40, 40, 40))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CIInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Info3)
                        .addComponent(pr1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Info2))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pr2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Info1)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pr3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Info4)
                    .addComponent(pr4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Info5)
                        .addComponent(pr5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Info1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info1ActionPerformed
        // TODO add your handling code here:
//        Room3 info3 = new Room3();
//        info3.setVisible(true);
            if (Room3Instance != null) {
            Room3Instance.setVisible(true);
            
        } else {
            Room3 info3 = new Room3();
            info3.setVisible(true);
           
        }
        
    }//GEN-LAST:event_Info1ActionPerformed

    private void Info3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info3ActionPerformed
        // TODO add your handling code here:
//        hatdog info1 = new hatdog();
//        info1.setVisible(true);
        
        if (hatdogInstance != null) {
            
            Cont con1 = new Cont();
            
            hatdogInstance.setVisible(true);
            
        } else {
            hatdog info1 = new hatdog();
            info1.setVisible(true);
            
        }
        
    }//GEN-LAST:event_Info3ActionPerformed

    private void Info4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info4ActionPerformed
        // TODO add your handling code here:
//        Room4 info4 = new Room4();
//        info4.setVisible(true);
        
        if (Room4Instance != null) {
            Room4Instance.setVisible(true);
            
        } else {
            Room4 info4 = new Room4();
            info4.setVisible(true);
            
        }
    }//GEN-LAST:event_Info4ActionPerformed

    private void Info5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info5ActionPerformed
        // TODO add your handling code here:
//        Room5 info5 = new Room5();
//        info5.setVisible(true);

        if (Room5Instance != null) {
            Room5Instance.setVisible(true);
            
        } else {
            Room5 info5 = new Room5();
            info5.setVisible(true);
            
        }
    }//GEN-LAST:event_Info5ActionPerformed

    private void Info2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info2ActionPerformed
        // TODO add your handling code here:
//        Room2 info2 = new Room2();
//        info2.setVisible(true);

        if (Room2Instance != null) {
            Room2Instance.setVisible(true);
            
        } else {
            Room2 info2 = new Room2();
            info2.setVisible(true);
            
        }
    }//GEN-LAST:event_Info2ActionPerformed

    private void CIInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIInputActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_CIInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//      hatdog bk = hatdog.Instance;
//      bk.book.setEnabled(true);
      
      

      String checkInDate = CIInput.getText();
      String checkOutDate = COInput.getText();
      
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
      LocalDate checkIn = LocalDate.parse(checkInDate, formatter);
      LocalDate checkOut = LocalDate.parse(checkOutDate, formatter);
      
      LocalDate currentDate = LocalDate.now();
      
      if (checkIn.isBefore(currentDate)) {
          JOptionPane.showMessageDialog(this, "Check-in date cannot be before current date");
          return;
      }else if (checkOut.isBefore(checkIn)) {
          JOptionPane.showMessageDialog(this, "Check-out date cannot be before Check-in date");
      } else {
          long nights = ChronoUnit.DAYS.between(checkIn, checkOut);
          pr1.setText("Price: P" + (1053 * nights) + " / " + nights + " night/s");
          pr2.setText("Price: P" + (1256 * nights) + " / " + nights + " night/s");
          pr3.setText("Price: P" + (1377 * nights) + " / " + nights + " night/s");
          pr4.setText("Price: P" + (1863 * nights) + " / " + nights + " night/s");
          pr5.setText("Price: P" + (6085 * nights) + " / " + nights + " night/s");
          
          time.setText(combo.getSelectedItem().toString());
          
          
          
          
          if (hatdogInstance == null) {
          hatdogInstance = new hatdog();
          
      }
      hatdogInstance.eneableBookButton();
      if (Room2Instance == null) {
          Room2Instance = new Room2();
          
      }
      Room2Instance.eneableBookButton();
      if (Room3Instance == null) {
          Room3Instance = new Room3();
          
      }
      Room3Instance.eneableBookButton();
      if (Room4Instance == null) {
          Room4Instance = new Room4();
          
      }
      Room4Instance.eneableBookButton();
      if (Room5Instance == null) {
          Room5Instance = new Room5();
          
      }
      Room5Instance.eneableBookButton();
      
      
//      Cont contInstance = new Cont();
//          hatdog hatdogInstance = new hatdog(contInstance);
//          hatdogInstance.setContInstance(contInstance);
          
      }
      
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void COInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COInputActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_COInputActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CIInput;
    private javax.swing.JTextField COInput;
    private javax.swing.JButton Info1;
    private javax.swing.JButton Info2;
    private javax.swing.JButton Info3;
    private javax.swing.JButton Info4;
    private javax.swing.JButton Info5;
    private javax.swing.JComboBox<String> combo;
    public javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pr1;
    private javax.swing.JLabel pr2;
    private javax.swing.JLabel pr3;
    private javax.swing.JLabel pr4;
    private javax.swing.JLabel pr5;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    
}
