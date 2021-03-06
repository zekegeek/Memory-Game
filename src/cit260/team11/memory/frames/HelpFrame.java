/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.frames;

import cit260.team11.memory.control.HelpMenuControl;
import cit260.team11.memory.enums.Help;
import cit260.team11.memory.exceptions.MenuException;

/**
 *
 * @author Sony Style
 */
public class HelpFrame extends javax.swing.JFrame {
    private HelpMenuControl helpCommands = new HelpMenuControl();

    /**
     * Creates new form HelpFrame
     */
    public HelpFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public HelpMenuControl getHelpCommands(){
        return helpCommands;
    }
    
    private void displayHelpText(Help command){
        try{
            String helpText = this.helpCommands.getHelpText(command);
            this.jtHelpText.setText(helpText);
        } catch (MenuException ex) {
            this.jtHelpText.setText(ex.getMessage());
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

        jpBody = new javax.swing.JPanel();
        jpTItle = new javax.swing.JPanel();
        jlTItle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbGame = new javax.swing.JButton();
        jbBoard = new javax.swing.JButton();
        jbPlayer = new javax.swing.JButton();
        jbReturn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHelpText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBody.setBackground(new java.awt.Color(204, 204, 255));
        jpBody.setBorder(new javax.swing.border.MatteBorder(null));

        jpTItle.setBackground(new java.awt.Color(204, 204, 255));

        jlTItle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlTItle.setForeground(new java.awt.Color(0, 0, 51));
        jlTItle.setText("Memory Help Menu");

        javax.swing.GroupLayout jpTItleLayout = new javax.swing.GroupLayout(jpTItle);
        jpTItle.setLayout(jpTItleLayout);
        jpTItleLayout.setHorizontalGroup(
            jpTItleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTItleLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jlTItle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTItleLayout.setVerticalGroup(
            jpTItleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTItleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTItle)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbGame.setText("Game");
        jbGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGameActionPerformed(evt);
            }
        });

        jbBoard.setText("Board");
        jbBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBoardActionPerformed(evt);
            }
        });

        jbPlayer.setText("Player");
        jbPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlayerActionPerformed(evt);
            }
        });

        jbReturn.setText("Return");
        jbReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbReturn)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbGame)
                .addGap(18, 18, 18)
                .addComponent(jbBoard)
                .addGap(18, 18, 18)
                .addComponent(jbPlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jbReturn)
                .addContainerGap())
        );

        jtHelpText.setEditable(false);
        jtHelpText.setColumns(20);
        jtHelpText.setLineWrap(true);
        jtHelpText.setRows(5);
        jtHelpText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtHelpText);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTItle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTItle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGameActionPerformed
        displayHelpText(Help.GAME);
    }//GEN-LAST:event_jbGameActionPerformed

    private void jbBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBoardActionPerformed
        displayHelpText(Help.BOARD);
    }//GEN-LAST:event_jbBoardActionPerformed

    private void jbPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlayerActionPerformed
        displayHelpText(Help.PLAYER);
    }//GEN-LAST:event_jbPlayerActionPerformed

    private void jbReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbReturnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBoard;
    private javax.swing.JButton jbGame;
    private javax.swing.JButton jbPlayer;
    private javax.swing.JButton jbReturn;
    private javax.swing.JLabel jlTItle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpTItle;
    private javax.swing.JTextArea jtHelpText;
    // End of variables declaration//GEN-END:variables
}
