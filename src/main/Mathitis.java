/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author proxc
 */
public class Mathitis extends javax.swing.JFrame {

    /**
     * Creates new form Home_Data
     */
    public Mathitis() {
        fillCombos();
        initComponents();
        viewPanel.setBackground(new java.awt.Color(35,90,190));
        showAllInTable();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        viewPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        botPanel = new javax.swing.JPanel();
        viewStudent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refreshListStudents = new javax.swing.JButton();
        searchYear = new javax.swing.JComboBox<>();
        editStudent = new javax.swing.JPanel();
        addStudent = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        onomaLabel = new javax.swing.JLabel();
        eponimoTF = new javax.swing.JTextField();
        onomaTF = new javax.swing.JTextField();
        kataxorisiBtn = new javax.swing.JButton();
        eponimoLabel = new javax.swing.JLabel();
        etoseisLabel = new javax.swing.JLabel();
        onomamLabel = new javax.swing.JLabel();
        onomapLabel = new javax.swing.JLabel();
        onomapTF = new javax.swing.JTextField();
        onomamTF = new javax.swing.JTextField();
        year = new javax.swing.JComboBox<>();

        jPanel3.setBackground(new java.awt.Color(45, 118, 232));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px_1.png"))); // NOI18N
        jLabel15.setText(" Μαθητές");

        viewPanel.setBackground(new java.awt.Color(45, 118, 232));
        viewPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPanelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Προβολή");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        addPanel.setBackground(new java.awt.Color(45, 118, 232));
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Προσθήκη");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        editPanel.setBackground(new java.awt.Color(45, 118, 232));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPanelMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Επεξεργασία");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botPanel.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΑΜ", "Όνομα", "Επώνυμο", "Όνομα πατέρα", "Όνομα μητέρας", "Έτος Εισαγωγής"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        refreshListStudents.setText("Ανανέωση");
        refreshListStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshListStudentsActionPerformed(evt);
            }
        });

        searchYear.setModel(new javax.swing.DefaultComboBoxModel<>(etosCombo));
        searchYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                searchYearItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout viewStudentLayout = new javax.swing.GroupLayout(viewStudent);
        viewStudent.setLayout(viewStudentLayout);
        viewStudentLayout.setHorizontalGroup(
            viewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewStudentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchYear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(viewStudentLayout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(refreshListStudents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewStudentLayout.setVerticalGroup(
            viewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStudentLayout.createSequentialGroup()
                .addComponent(searchYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshListStudents)
                .addContainerGap())
        );

        botPanel.add(viewStudent, "card2");

        javax.swing.GroupLayout editStudentLayout = new javax.swing.GroupLayout(editStudent);
        editStudent.setLayout(editStudentLayout);
        editStudentLayout.setHorizontalGroup(
            editStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        editStudentLayout.setVerticalGroup(
            editStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        botPanel.add(editStudent, "card4");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Φόρμα εισαγωγής μαθητών"));
        jPanel5.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N

        onomaLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        onomaLabel.setText("Όνομα :");

        eponimoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eponimoTFActionPerformed(evt);
            }
        });

        kataxorisiBtn.setText("Καταχώρηση");
        kataxorisiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kataxorisiBtnActionPerformed(evt);
            }
        });

        eponimoLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        eponimoLabel.setText("Επώνυμο :");

        etoseisLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        etoseisLabel.setText("Έτος Εισαγωγής:");

        onomamLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        onomamLabel.setText("Όνομα μητέρας :");

        onomapLabel.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        onomapLabel.setText("Όνομα πατέρα :");

        year.setModel(new javax.swing.DefaultComboBoxModel<>(etosCombo));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(onomaLabel)
                            .addComponent(onomapLabel)
                            .addComponent(eponimoLabel)
                            .addComponent(onomamLabel)
                            .addComponent(etoseisLabel))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onomamTF)
                            .addComponent(onomapTF)
                            .addComponent(eponimoTF)
                            .addComponent(onomaTF))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(kataxorisiBtn)
                        .addGap(336, 336, 336))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onomaLabel)
                    .addComponent(onomaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eponimoLabel)
                    .addComponent(eponimoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onomapLabel)
                    .addComponent(onomapTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onomamLabel)
                    .addComponent(onomamTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etoseisLabel)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(kataxorisiBtn)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout addStudentLayout = new javax.swing.GroupLayout(addStudent);
        addStudent.setLayout(addStudentLayout);
        addStudentLayout.setHorizontalGroup(
            addStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudentLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        addStudentLayout.setVerticalGroup(
            addStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudentLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        botPanel.add(addStudent, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eponimoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eponimoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eponimoTFActionPerformed

    private void viewPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPanelMouseClicked
        // TODO add your handling code here:
        viewStudent.setVisible(true);
        addStudent.setVisible(false);
        editStudent.setVisible(false);
        viewPanel.setBackground(new java.awt.Color(35,90,190));
        addPanel.setBackground(new java.awt.Color(45,118,232));
        editPanel.setBackground(new java.awt.Color(45,118,232));
        showAllInTable();
        
    }//GEN-LAST:event_viewPanelMouseClicked

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        // TODO add your handling code here:
        viewStudent.setVisible(false);
        addStudent.setVisible(true);
        editStudent.setVisible(false);
        addPanel.setBackground(new java.awt.Color(35,90,190));
        viewPanel.setBackground(new java.awt.Color(45,118,232));
        editPanel.setBackground(new java.awt.Color(45,118,232));
    }//GEN-LAST:event_addPanelMouseClicked

    private void refreshListStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshListStudentsActionPerformed
        // TODO add your handling code here:
        showAllInTable();
    }//GEN-LAST:event_refreshListStudentsActionPerformed

    private void kataxorisiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kataxorisiBtnActionPerformed
        // TODO add your handling code here:
        MathitisAdmin.addNewStudent(onomaTF.getText(), 
                                    eponimoTF.getText(), 
                                    onomapTF.getText(), 
                                    onomamTF.getText(), 
                                    year.getSelectedItem());

  
    }//GEN-LAST:event_kataxorisiBtnActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        
        viewStudent.setVisible(true);
        addStudent.setVisible(false);
        editStudent.setVisible(false);
        viewPanel.setBackground(new java.awt.Color(35,90,190));
        addPanel.setBackground(new java.awt.Color(45,118,232));
        editPanel.setBackground(new java.awt.Color(45,118,232));
        showAllInTable();
        
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void searchYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_searchYearItemStateChanged
        // TODO add your handling code here:
        showOnlyOnYear(String.valueOf(searchYear.getSelectedItem()));
    }//GEN-LAST:event_searchYearItemStateChanged

    private void editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseClicked
        // TODO add your handling code here:
        viewStudent.setVisible(false);
        addStudent.setVisible(false);
        editStudent.setVisible(true);
        viewPanel.setBackground(new java.awt.Color(45,118,232));
        addPanel.setBackground(new java.awt.Color(45,118,232));
        editPanel.setBackground(new java.awt.Color(35,90,190));
    }//GEN-LAST:event_editPanelMouseClicked

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
            java.util.logging.Logger.getLogger(Mathitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mathitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mathitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mathitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mathitis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel addStudent;
    private javax.swing.JPanel botPanel;
    private javax.swing.JPanel editPanel;
    private javax.swing.JPanel editStudent;
    private javax.swing.JLabel eponimoLabel;
    private javax.swing.JTextField eponimoTF;
    private javax.swing.JLabel etoseisLabel;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kataxorisiBtn;
    private javax.swing.JLabel onomaLabel;
    private javax.swing.JTextField onomaTF;
    private javax.swing.JLabel onomamLabel;
    private javax.swing.JTextField onomamTF;
    private javax.swing.JLabel onomapLabel;
    private javax.swing.JTextField onomapTF;
    private javax.swing.JButton refreshListStudents;
    private javax.swing.JComboBox<String> searchYear;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JPanel viewStudent;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
   

     String[] etosCombo = new String[61];
    
    
    void fillCombos() {
        for (int i = 0; i < 61; i++) {
            int etos = 2020;
            etosCombo[i] = String.valueOf(etos - i);
        }
    }
    
    
    private void showAllInTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String selectString = "SELECT showtablemathitis();";
        Statement aStatePG = DBPostresqlAdmin.getStatement();
        model.setRowCount(0);
        ResultSet rs = DBPostresqlAdmin.getResultset();
        try {
          rs = aStatePG.executeQuery(selectString);
            Object[] row = new Object[8];
            String columnvalue;
            
            while (rs.next()) {
                columnvalue = rs.getString(1);
                String[] a = columnvalue.substring(1, columnvalue.length()-1).split(",");
                for (int i = 0; i < a.length; i++) {
                    row[i] =a[i];
                }
                model.addRow(row);
            }
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        } 
    }
    

    private void showOnlyOnYear(String ext){
        int num  = Integer.valueOf(ext);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String selectString = "SELECT showtablemathitisyearly(?)";
        PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(selectString);
        
        model.setRowCount(0);
        ResultSet rs = DBPostresqlAdmin.getResultset();
        try {
            aStatePG.setInt(1, num);
            rs = aStatePG.executeQuery();
            Object[] row = new Object[8];
            String columnvalue;
            
            while (rs.next()) {
                columnvalue = rs.getString(1);
                String[] a = columnvalue.substring(1, columnvalue.length()-1).split(",");
                for (int i = 0; i < a.length; i++) {
                    row[i] = a[i];
                }
                
                model.addRow(row);
            }
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        }
    }



}