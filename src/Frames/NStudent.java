/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Classes.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author karan
 */
public class NStudent extends javax.swing.JFrame {

    /**
     * Creates new form NStudent
     */
    public NStudent() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jTName = new javax.swing.JTextField();
        jTSurname = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTAge = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMessage = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(475, 225));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Student ID : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Surname : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Age : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Faculty : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jTID.setBackground(new java.awt.Color(255, 255, 204));
        jTID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 190, -1));

        jTName.setBackground(new java.awt.Color(255, 255, 204));
        jTName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 190, -1));

        jTSurname.setBackground(new java.awt.Color(255, 255, 204));
        jTSurname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 190, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engineering", "Law", "Medicine", "Physic", "Chemistry", "Literature" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 190, -1));

        jTAge.setBackground(new java.awt.Color(255, 255, 204));
        jTAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-icon--1.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 98, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 90, 30));

        jMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 280, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arayüz.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        if(Student.searhId(Integer.parseInt(jTID.getText()))){
            JOptionPane.showMessageDialog(this,"This ID is in use, please use another ID.");
        }
        else{
            Student.addStu((Integer.parseInt(jTID.getText())),jTName.getText(),jTSurname.getText(),Integer.parseInt(jTAge.getText()),jComboBox1.getSelectedItem().toString());
            jMessage.setText("The student has been added to the system.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTID.setText("");
        jTName.setText("");
        jTSurname.setText("");
        jTAge.setText("");
        jMessage.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTAge;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTName;
    private javax.swing.JTextField jTSurname;
    // End of variables declaration//GEN-END:variables
}
