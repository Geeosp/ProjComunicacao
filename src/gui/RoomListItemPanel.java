/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import principal.OurFonts;
import atomics.Room;
import erros.UsuarioNaoEncontradoException;
import corecliente.GlobalClient;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Geeo
 */
public class RoomListItemPanel extends javax.swing.JPanel {

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * Creates new form RoomListItemPanel
     */
    private Room room;
    private int userCount;

    public RoomListItemPanel() {
        initComponents();
    }

    public RoomListItemPanel(Room room) {
        initComponents();
        this.room = room;
        this.userCount=room.getUsers_ID().size();
        this.lbRoomName.setText(room.getName());
        refreshUsersCount(0);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbRoomName = new javax.swing.JLabel();
        lbUsersQnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRoomName.setFont(OurFonts.getTextFont(18f)
        );
        lbRoomName.setText("roomName");
        jPanel1.add(lbRoomName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2, 330, 30));

        lbUsersQnt.setFont(OurFonts.getTextFont(18f));
        lbUsersQnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsersQnt.setText("n");
        jPanel1.add(lbUsersQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lista_salas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMouseClicked
        System.out.println("Clicou em " + this.room.getName());
        GlobalClient.gui.requestEnterRoom(this.room);

    }// GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbRoomName;
    private javax.swing.JLabel lbUsersQnt;
    // End of variables declaration//GEN-END:variables

    void refreshUsersCount(int add) {
        this.userCount += add;
        this.lbUsersQnt.setText(userCount+"");
    }
}
