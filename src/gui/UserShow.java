/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import corecliente.GlobalClient;
import javax.swing.JLabel;

/**
 *
 * @author geeo
 */
public class UserShow extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public UserShow() {
        initComponents();
        
    }

    public JLabel getLbUserNickname() {
        return lbUserNickname;
    }

    public void setLbUserNickname(JLabel lbUserNickname) {
        this.lbUserNickname = lbUserNickname;
    }

    public JLabel getLbWelcome() {
        return lbWelcome;
    }

    public void setLbWelcome(JLabel lbWelcome) {
        this.lbWelcome = lbWelcome;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbWelcome = new javax.swing.JLabel();
        lbUserNickname = new javax.swing.JLabel();

        lbWelcome.setText("Bem Vindo ");

        lbUserNickname.setText("<userNickname>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUserNickname)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWelcome)
                    .addComponent(lbUserNickname))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbUserNickname;
    private javax.swing.JLabel lbWelcome;
    // End of variables declaration//GEN-END:variables
}