/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import corecliente.Core;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Global;

/**
 *
 * @author Geeo
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public LoginPanel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbLogin = new javax.swing.JLabel();
        tFLogin = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        rBOnline = new javax.swing.JRadioButton();
        rBBusy = new javax.swing.JRadioButton();
        rBAway = new javax.swing.JRadioButton();
        rBInvisible = new javax.swing.JRadioButton();
        lbId = new javax.swing.JLabel();
        tfUserId = new javax.swing.JTextField();
        lbServidorIp = new javax.swing.JLabel();
        tFServidorIp = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(255, 240));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(255, 245));

        lbLogin.setText("NickName:");

        tFLogin.setText("user");
        tFLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFLoginActionPerformed(evt);
            }
        });

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBOnline);
        rBOnline.setText("Online");

        buttonGroup1.add(rBBusy);
        rBBusy.setText("Busy");
        rBBusy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBBusyActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBAway);
        rBAway.setText("Away");

        buttonGroup1.add(rBInvisible);
        rBInvisible.setText("Invisible");

        lbId.setText("UserId");

        tfUserId.setText("0001");
        tfUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserIdActionPerformed(evt);
            }
        });

        lbServidorIp.setText("ServidorIp");

        tFServidorIp.setText("localHost");
        tFServidorIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFServidorIpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbLogin)
                                .addGap(23, 23, 23)
                                .addComponent(tFLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rBOnline)
                                    .addComponent(rBAway)
                                    .addComponent(rBInvisible)
                                    .addComponent(rBBusy))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbId)
                        .addGap(23, 23, 23)
                        .addComponent(tfUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btEntrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbServidorIp)
                                .addGap(23, 23, 23)
                                .addComponent(tFServidorIp, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin)
                    .addComponent(tFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(rBOnline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBBusy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBAway)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBInvisible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbId)
                    .addComponent(tfUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbServidorIp)
                    .addComponent(tFServidorIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFLoginActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String nickname = this.tFLogin.getText();
        String str = this.tfUserId.getText();
        long id1 = Long.parseLong(str);
        String ip = this.tFServidorIp.getText();
        try {
            Global.core.logIn(nickname, id1, ip);
        } catch (IOException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btEntrarActionPerformed

    private void rBBusyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBBusyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBBusyActionPerformed

    private void tfUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserIdActionPerformed

    private void tFServidorIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFServidorIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFServidorIpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbServidorIp;
    private javax.swing.JRadioButton rBAway;
    private javax.swing.JRadioButton rBBusy;
    private javax.swing.JRadioButton rBInvisible;
    private javax.swing.JRadioButton rBOnline;
    private javax.swing.JTextField tFLogin;
    private javax.swing.JTextField tFServidorIp;
    private javax.swing.JTextField tfUserId;
    // End of variables declaration//GEN-END:variables
}
