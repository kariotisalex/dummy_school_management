/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author proxc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setIcon();
    }
    
    public void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("binder_30px.png")));
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
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        vathmologiesMainButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mathitesMainButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kathigitesMainButton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rithmiseisMainButton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mathimataMainButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitMouseReleased(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 22, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("γυμνασίου λυκείου ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Πληροφοριακό σύστημα μηχανογράφησης ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 160));

        vathmologiesMainButton.setBackground(new java.awt.Color(240, 240, 240));
        vathmologiesMainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vathmologiesMainButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vathmologiesMainButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vathmologiesMainButtonMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Βαθμολογίες");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/exam_50px.png"))); // NOI18N

        javax.swing.GroupLayout vathmologiesMainButtonLayout = new javax.swing.GroupLayout(vathmologiesMainButton);
        vathmologiesMainButton.setLayout(vathmologiesMainButtonLayout);
        vathmologiesMainButtonLayout.setHorizontalGroup(
            vathmologiesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vathmologiesMainButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vathmologiesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        vathmologiesMainButtonLayout.setVerticalGroup(
            vathmologiesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vathmologiesMainButtonLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );

        jPanel1.add(vathmologiesMainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 140, 120));

        jPanel4.setBackground(new java.awt.Color(240, 240, 240));
        jPanel4.setForeground(new java.awt.Color(240, 240, 240));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 118, 232));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Σύνδεση");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/login_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, 120));

        mathitesMainButton.setBackground(new java.awt.Color(240, 240, 240));
        mathitesMainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mathitesMainButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mathitesMainButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mathitesMainButtonMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Μαθητές");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px.png"))); // NOI18N

        javax.swing.GroupLayout mathitesMainButtonLayout = new javax.swing.GroupLayout(mathitesMainButton);
        mathitesMainButton.setLayout(mathitesMainButtonLayout);
        mathitesMainButtonLayout.setHorizontalGroup(
            mathitesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mathitesMainButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mathitesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        mathitesMainButtonLayout.setVerticalGroup(
            mathitesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mathitesMainButtonLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18))
        );

        jPanel1.add(mathitesMainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 140, 120));

        kathigitesMainButton.setBackground(new java.awt.Color(240, 240, 240));
        kathigitesMainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kathigitesMainButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kathigitesMainButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kathigitesMainButtonMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 118, 232));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Καθηγητές");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/training_50px.png"))); // NOI18N

        javax.swing.GroupLayout kathigitesMainButtonLayout = new javax.swing.GroupLayout(kathigitesMainButton);
        kathigitesMainButton.setLayout(kathigitesMainButtonLayout);
        kathigitesMainButtonLayout.setHorizontalGroup(
            kathigitesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kathigitesMainButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kathigitesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        kathigitesMainButtonLayout.setVerticalGroup(
            kathigitesMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kathigitesMainButtonLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );

        jPanel1.add(kathigitesMainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 120));

        rithmiseisMainButton.setBackground(new java.awt.Color(240, 240, 240));
        rithmiseisMainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rithmiseisMainButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rithmiseisMainButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rithmiseisMainButtonMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 118, 232));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ρυθμίσεις");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/settings_48px.png"))); // NOI18N

        javax.swing.GroupLayout rithmiseisMainButtonLayout = new javax.swing.GroupLayout(rithmiseisMainButton);
        rithmiseisMainButton.setLayout(rithmiseisMainButtonLayout);
        rithmiseisMainButtonLayout.setHorizontalGroup(
            rithmiseisMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rithmiseisMainButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rithmiseisMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        rithmiseisMainButtonLayout.setVerticalGroup(
            rithmiseisMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rithmiseisMainButtonLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18))
        );

        jPanel1.add(rithmiseisMainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 120));

        mathimataMainButton.setBackground(new java.awt.Color(240, 240, 240));
        mathimataMainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mathimataMainButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mathimataMainButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mathimataMainButtonMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 118, 232));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Μαθήματα");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/school_50px.png"))); // NOI18N

        javax.swing.GroupLayout mathimataMainButtonLayout = new javax.swing.GroupLayout(mathimataMainButton);
        mathimataMainButton.setLayout(mathimataMainButtonLayout);
        mathimataMainButtonLayout.setHorizontalGroup(
            mathimataMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mathimataMainButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mathimataMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        mathimataMainButtonLayout.setVerticalGroup(
            mathimataMainButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mathimataMainButtonLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18))
        );

        jPanel1.add(mathimataMainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 140, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        setColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        resetColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited
     
    
    
    
    int xx,xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);  
    }//GEN-LAST:event_jPanel2MouseDragged

    private void mathitesMainButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathitesMainButtonMouseEntered
        // TODO add your handling code here:
        if(enableUI)
        setColor(mathitesMainButton);
    }//GEN-LAST:event_mathitesMainButtonMouseEntered

    private void mathitesMainButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathitesMainButtonMouseExited
        // TODO add your handling code here:
        resetColor(mathitesMainButton);
    }//GEN-LAST:event_mathitesMainButtonMouseExited

    private void kathigitesMainButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kathigitesMainButtonMouseEntered
        // TODO add your handling code here
        if(enableUI)
        setColor(kathigitesMainButton);
    }//GEN-LAST:event_kathigitesMainButtonMouseEntered

    private void kathigitesMainButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kathigitesMainButtonMouseExited
        // TODO add your handling code here:
        resetColor(kathigitesMainButton);
    }//GEN-LAST:event_kathigitesMainButtonMouseExited

    private void rithmiseisMainButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rithmiseisMainButtonMouseEntered
        // TODO add your handling code here:
        if(settingEnabler)
        setColor(rithmiseisMainButton);
    }//GEN-LAST:event_rithmiseisMainButtonMouseEntered

    private void rithmiseisMainButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rithmiseisMainButtonMouseExited
        // TODO add your handling code here:
        resetColor(rithmiseisMainButton);
        
    }//GEN-LAST:event_rithmiseisMainButtonMouseExited

    private void mathimataMainButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathimataMainButtonMouseEntered
        // TODO add your handling code here:
        if(enableUI)
        setColor(mathimataMainButton);
    }//GEN-LAST:event_mathimataMainButtonMouseEntered

    private void mathimataMainButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathimataMainButtonMouseExited
        // TODO add your handling code here:
        resetColor(mathimataMainButton);
    }//GEN-LAST:event_mathimataMainButtonMouseExited

    private void vathmologiesMainButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vathmologiesMainButtonMouseEntered
        // TODO add your handling code here:
        if(enableUI)
        setColor(vathmologiesMainButton);
    }//GEN-LAST:event_vathmologiesMainButtonMouseEntered

    private void vathmologiesMainButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vathmologiesMainButtonMouseExited
        // TODO add your handling code here:
        resetColor(vathmologiesMainButton);
    }//GEN-LAST:event_vathmologiesMainButtonMouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
            new SignInToProgram().show();
    }//GEN-LAST:event_jPanel4MousePressed

    private void exitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseReleased
        // TODO add your handling code here:
  
        int n = JOptionPane.showConfirmDialog(null, "Επιθυμείτε την έξοδο απο την εφαρμογή;", "Έξοδος", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION){
            if(DBPostresqlAdmin.isConnected())
                DBPostresqlAdmin.closeit();
            System.exit(0);
        }
        
    }//GEN-LAST:event_exitMouseReleased

    private void mathitesMainButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathitesMainButtonMouseReleased
        // TODO add your handling code here:
        if (enableUI)
            new Mathitis().show();
        else{
            notifier("Μαθητές");
            
        }
    }//GEN-LAST:event_mathitesMainButtonMouseReleased

    private void kathigitesMainButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kathigitesMainButtonMouseReleased
        // TODO add your handling code here:
        if (enableUI)
            new Kathigitis().show();
        else{
            notifier("Καθηγητές");
        }
    }//GEN-LAST:event_kathigitesMainButtonMouseReleased

    private void rithmiseisMainButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rithmiseisMainButtonMouseReleased
        // TODO add your handling code here:
        if (settingEnabler)
            new Settings().show();
        else{
        String messege = "<HTML>Η εισοδος στην καρτέλα 'Ρυθμίσεις' απετυχε<br>"
                       + "Παρακαλώ συνδεθειτε στην εφαρμογη μεσω της καρτελας 'Συνδεση'";
        JOptionPane.showMessageDialog(null, messege, "Ενημέρωση", JOptionPane.WARNING_MESSAGE); 
    }
    }//GEN-LAST:event_rithmiseisMainButtonMouseReleased

    private void mathimataMainButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathimataMainButtonMouseReleased
        // TODO add your handling code here:
        if (enableUI)
            new Mathima().show();
        else{
            notifier("Μαθήματα");
        }
    }//GEN-LAST:event_mathimataMainButtonMouseReleased

    private void vathmologiesMainButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vathmologiesMainButtonMouseReleased
        // TODO add your handling code here:
        if (enableUI)
            new Vathmologia().show();
        else{
            notifier("Βαθμογολίες");
        }
        
    }//GEN-LAST:event_vathmologiesMainButtonMouseReleased
 public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(197, 197, 197));
 }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(240,240,240));
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel kathigitesMainButton;
    private javax.swing.JPanel mathimataMainButton;
    private javax.swing.JPanel mathitesMainButton;
    private javax.swing.JPanel rithmiseisMainButton;
    private javax.swing.JPanel vathmologiesMainButton;
    // End of variables declaration//GEN-END:variables

    static boolean enableUI = false;
    static boolean signIn = false;
    static boolean settingEnabler = false;
    
void notifier(String a){
    if(!settingEnabler){
        String messege = "<HTML>Η εισοδος στην καρτέλα '" + a + "' απετυχε<br>"
                       + "Παρακαλώ συνδεθειτε στην εφαρμογη μεσω της καρτελας 'Συνδεση'";
        JOptionPane.showMessageDialog(null, messege, "Ενημέρωση", JOptionPane.WARNING_MESSAGE);
    }else{
        String messege = "<HTML>Η εισοδος στην καρτέλα '" + a + "' απετυχε<br>"
                + "Παρακαλώ συνδεθειτε στην <u>βαση δεδομένων</u> μεσω της καρτέλας 'Ρυθμίσεις'";
        JOptionPane.showMessageDialog(null, messege, "Ενημέρωση", JOptionPane.WARNING_MESSAGE);

    }
}










}
