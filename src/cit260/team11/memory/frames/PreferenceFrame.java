/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.frames;

import cit260.team11.memory.control.GamePreferenceControl;
import cit260.team11.memory.build.Game;
import cit260.team11.memory.enums.Status;

/**
 *
 * @author Sony Style
 */
public class PreferenceFrame extends javax.swing.JFrame {
    private Game game = null;
    //private GamePreferenceControl gameCommands = new GamePreferenceControl();
    
    /**
     * Creates new form PreferenceFrame
     */
    public PreferenceFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /*
    public void initializeForm(){
        if(this.game.getStatus() == Status.NEW_GAME){
            
        }
    }*/    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlGameSetup = new javax.swing.JLabel();
        jpMenuItems = new javax.swing.JPanel();
        jbStart = new javax.swing.JButton();
        jbMainMenu = new javax.swing.JButton();
        jlRows = new javax.swing.JLabel();
        jlCols = new javax.swing.JLabel();
        boardColumns = new javax.swing.JTextField();
        boardRows = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtInstructions = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtHint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBody.setBackground(new java.awt.Color(204, 204, 255));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpTitle.setBackground(new java.awt.Color(204, 204, 255));

        jlGameSetup.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlGameSetup.setForeground(new java.awt.Color(0, 0, 51));
        jlGameSetup.setText("Memory Game Setup");

        jpMenuItems.setBackground(new java.awt.Color(204, 204, 255));
        jpMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbStart.setText("Start");
        jbStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartActionPerformed(evt);
            }
        });

        jbMainMenu.setText("Main Menu");
        jbMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMainMenuActionPerformed(evt);
            }
        });

        jlRows.setText("Rows:");

        jlCols.setText("Columns:");

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addGroup(jpMenuItemsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jlRows)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boardRows, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMenuItemsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlCols)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boardColumns, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuItemsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRows)
                    .addComponent(boardRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCols)
                    .addComponent(boardColumns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jbStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jbMainMenu)
                .addContainerGap())
        );

        boardColumns.getAccessibleContext().setAccessibleName("boardColumns");

        jtInstructions.setEditable(false);
        jtInstructions.setColumns(20);
        jtInstructions.setLineWrap(true);
        jtInstructions.setRows(5);
        jtInstructions.setText("Instructions: Enter a number 1-8 for the number of rows and 1-7 for the number of columns you would like in your board. Then click the \"Start\" button.");
        jtInstructions.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jtInstructions);

        jtHint.setEditable(false);
        jtHint.setColumns(20);
        jtHint.setLineWrap(true);
        jtHint.setRows(5);
        jtHint.setText("There needs to be an even number of cards so one of the numbers you chose needs to be an even number.");
        jtHint.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jtHint);

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlGameSetup)
                .addGap(87, 87, 87))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlGameSetup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jbStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartActionPerformed
        int rowCountInt = Integer.parseInt(boardRows.getText());  
        int columnCountInt = Integer.parseInt(boardColumns.getText());
        Game game = new Game(rowCountInt, columnCountInt);
        game.startGame();
        
        /*PreferenceFrame prefFrame = new PreferenceFrame();
        prefFrame.setVisible(true);*/
        
        /*if(rowCountInt)<1 || getRowCount()>8){
            displayError();
            System.out.println("Please input a number 1-8");
            setRowCount(getIn().nextInt());
        }
        System.out.println("Please enter the number of columns you would like, "
              + "between 1 and 7.");
        setColumnCount(getIn().nextInt());
     while(getColumnCount()<1 || getColumnCount()>7){
        displayError();
        System.out.println("Please enter a number between 1 and 7");
            setColumnCount(getIn().nextInt());*/
     
        //Game game = this.gameCommands.create();        
    }//GEN-LAST:event_jbStartActionPerformed

    private void jbMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMainMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbMainMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boardColumns;
    private javax.swing.JTextField boardRows;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbMainMenu;
    private javax.swing.JButton jbStart;
    private javax.swing.JLabel jlCols;
    private javax.swing.JLabel jlGameSetup;
    private javax.swing.JLabel jlRows;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTextArea jtHint;
    private javax.swing.JTextArea jtInstructions;
    // End of variables declaration//GEN-END:variables
}
