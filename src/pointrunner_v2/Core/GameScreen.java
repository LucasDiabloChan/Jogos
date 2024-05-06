/*
    Author: @asher_ren
    Description: class responsible to display the game and receive the player's inputs
    Created: 10/2023
    Update: 05/05/2024
*/


package pointrunner_v2.Core;

import pointrunner_v2.Map.Map;
import pointrunner_v2.Player.Player;

public class GameScreen extends javax.swing.JFrame {
    
    private Map map;
    private Player p;  
    
    public GameScreen(int width, int height, int enemies) {
        initComponents();
        
        p = new Player();
        updateAtributesGUI();
        updateInventoryGUI();
        
        map = new Map(width, height, enemies);
        setMapOnScreen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GameTitle = new javax.swing.JLabel();
        GameSubtitle = new javax.swing.JLabel();
        MapSlider = new javax.swing.JScrollPane();
        gameMap = new javax.swing.JTextArea();
        AtributesPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        levelLbl = new javax.swing.JLabel();
        levelTxtF = new javax.swing.JTextField();
        strenghtLbl = new javax.swing.JLabel();
        strenghtTxtF = new javax.swing.JTextField();
        XPLbl = new javax.swing.JLabel();
        XPTxtF = new javax.swing.JTextField();
        lifeTxtF = new javax.swing.JTextField();
        lifeLabel = new javax.swing.JLabel();
        Inventory = new javax.swing.JPanel();
        inventoryLbl = new javax.swing.JLabel();
        bombLbl = new javax.swing.JLabel();
        bombTxtF = new javax.swing.JTextField();
        ControlsPanel = new javax.swing.JPanel();
        downButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        controlsTitle = new javax.swing.JLabel();
        leftButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Point Runner v1.0.16");

        GameTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        GameTitle.setForeground(new java.awt.Color(51, 51, 51));
        GameTitle.setText("Point Runner (v1.0.16)");

        GameSubtitle.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        GameSubtitle.setForeground(new java.awt.Color(51, 51, 51));
        GameSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameSubtitle.setText("defeat all enemyes to win");

        MapSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        MapSlider.setName("scrollMap"); // NOI18N
        MapSlider.setRequestFocusEnabled(false);
        MapSlider.setWheelScrollingEnabled(false);

        gameMap.setEditable(false);
        gameMap.setBackground(new java.awt.Color(0, 0, 0));
        gameMap.setColumns(20);
        gameMap.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        gameMap.setForeground(new java.awt.Color(255, 255, 255));
        gameMap.setRows(5);
        gameMap.setAutoscrolls(false);
        gameMap.setCaretColor(new java.awt.Color(255, 255, 51));
        gameMap.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        gameMap.setEnabled(false);
        gameMap.setMaximumSize(new java.awt.Dimension(300, 480));
        gameMap.setMinimumSize(new java.awt.Dimension(300, 480));
        gameMap.setRequestFocusEnabled(false);
        gameMap.setSelectionColor(new java.awt.Color(0, 0, 0));
        MapSlider.setViewportView(gameMap);

        AtributesPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Title.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Atributes");

        levelLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        levelLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelLbl.setText("Level");

        levelTxtF.setEditable(false);
        levelTxtF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        levelTxtF.setText("1 / 10");
        levelTxtF.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        levelTxtF.setFocusable(false);
        levelTxtF.setMaximumSize(new java.awt.Dimension(70, 22));
        levelTxtF.setMinimumSize(new java.awt.Dimension(70, 22));

        strenghtLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        strenghtLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        strenghtLbl.setText("Attack");

        strenghtTxtF.setEditable(false);
        strenghtTxtF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        strenghtTxtF.setText("5");
        strenghtTxtF.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        strenghtTxtF.setFocusable(false);
        strenghtTxtF.setMaximumSize(new java.awt.Dimension(70, 22));
        strenghtTxtF.setMinimumSize(new java.awt.Dimension(70, 22));

        XPLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        XPLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XPLbl.setText("Experience");

        XPTxtF.setEditable(false);
        XPTxtF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XPTxtF.setText("999 / 9999");
        XPTxtF.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        XPTxtF.setFocusable(false);
        XPTxtF.setMaximumSize(new java.awt.Dimension(70, 22));
        XPTxtF.setMinimumSize(new java.awt.Dimension(70, 22));

        lifeTxtF.setEditable(false);
        lifeTxtF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lifeTxtF.setText("10 / 20");
        lifeTxtF.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        lifeTxtF.setFocusable(false);
        lifeTxtF.setMaximumSize(new java.awt.Dimension(70, 22));
        lifeTxtF.setMinimumSize(new java.awt.Dimension(70, 22));

        lifeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lifeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lifeLabel.setText("Life");

        javax.swing.GroupLayout AtributesPanelLayout = new javax.swing.GroupLayout(AtributesPanel);
        AtributesPanel.setLayout(AtributesPanelLayout);
        AtributesPanelLayout.setHorizontalGroup(
            AtributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtributesPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(AtributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(levelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(levelTxtF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(strenghtTxtF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strenghtLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(AtributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AtributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(XPLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(XPTxtF, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addComponent(lifeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lifeTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AtributesPanelLayout.setVerticalGroup(
            AtributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtributesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(AtributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AtributesPanelLayout.createSequentialGroup()
                        .addComponent(levelLbl)
                        .addGap(0, 0, 0)
                        .addComponent(levelTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AtributesPanelLayout.createSequentialGroup()
                        .addComponent(XPLbl)
                        .addGap(0, 0, 0)
                        .addComponent(XPTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AtributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AtributesPanelLayout.createSequentialGroup()
                        .addComponent(strenghtLbl)
                        .addGap(0, 0, 0)
                        .addComponent(strenghtTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AtributesPanelLayout.createSequentialGroup()
                        .addComponent(lifeLabel)
                        .addGap(0, 0, 0)
                        .addComponent(lifeTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Inventory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inventoryLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        inventoryLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventoryLbl.setText("Inventory");

        bombLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bombLbl.setText("Bombs");
        bombLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bombTxtF.setEditable(false);
        bombTxtF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bombTxtF.setText("0");
        bombTxtF.setFocusable(false);

        javax.swing.GroupLayout InventoryLayout = new javax.swing.GroupLayout(Inventory);
        Inventory.setLayout(InventoryLayout);
        InventoryLayout.setHorizontalGroup(
            InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventoryLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(InventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bombTxtF)
                    .addComponent(bombLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        InventoryLayout.setVerticalGroup(
            InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventoryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bombLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bombTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ControlsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        downButton.setText("↓");
        downButton.setMaximumSize(new java.awt.Dimension(30, 30));
        downButton.setMinimumSize(new java.awt.Dimension(30, 30));
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        upButton.setText("↑");
        upButton.setMaximumSize(new java.awt.Dimension(30, 30));
        upButton.setMinimumSize(new java.awt.Dimension(30, 30));
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        rightButton.setText("→");
        rightButton.setMaximumSize(new java.awt.Dimension(30, 30));
        rightButton.setMinimumSize(new java.awt.Dimension(30, 30));
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        controlsTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        controlsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        controlsTitle.setText("Controls");

        leftButton.setText("←");
        leftButton.setMaximumSize(new java.awt.Dimension(30, 30));
        leftButton.setMinimumSize(new java.awt.Dimension(30, 30));
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlsPanelLayout = new javax.swing.GroupLayout(ControlsPanel);
        ControlsPanel.setLayout(ControlsPanelLayout);
        ControlsPanelLayout.setHorizontalGroup(
            ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlsTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ControlsPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rightButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(leftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ControlsPanelLayout.setVerticalGroup(
            ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controlsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MapSlider)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(AtributesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ControlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GameSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GameSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MapSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AtributesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inventory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ControlsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        // Move o player para esquerda
        map.movePlayer(-1, 0);
        setMapOnScreen();
        updateAtributesGUI();
        updateInventoryGUI();
    }//GEN-LAST:event_leftButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        // Move o player para baixo
        map.movePlayer(0, -1);
        setMapOnScreen();
        updateAtributesGUI();
        updateInventoryGUI();
    }//GEN-LAST:event_downButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        // Move o player para cima
        map.movePlayer(0, 1);
        setMapOnScreen();
        updateAtributesGUI();
        updateInventoryGUI();

    }//GEN-LAST:event_upButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        // Move o player para direita
        map.movePlayer(1, 0);
        setMapOnScreen();
        updateAtributesGUI();
        updateInventoryGUI();
    }//GEN-LAST:event_rightButtonActionPerformed

    private void setMapOnScreen(){
        if(map != null)
            gameMap.setText(map.getDrawedMap());
    }
    
    private void updateAtributesGUI()
    {
        levelTxtF.setText(Player.getPlayerLevel() + " / 5" );
        XPTxtF.setText(Player.getCurrentXP() + " / " + Player.getRecquiredXPLevel(Player.getPlayerLevel() + 1));
        lifeTxtF.setText(String.valueOf(Player.getLife()));
        strenghtTxtF.setText(String.valueOf(Player.getAttack()));
    }
    
    private void updateInventoryGUI(){
        bombTxtF.setText(String.valueOf(p.getQuantityInBag("bomb")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AtributesPanel;
    private javax.swing.JPanel ControlsPanel;
    private javax.swing.JLabel GameSubtitle;
    private javax.swing.JLabel GameTitle;
    private javax.swing.JPanel Inventory;
    private javax.swing.JScrollPane MapSlider;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel XPLbl;
    private javax.swing.JTextField XPTxtF;
    private javax.swing.JLabel bombLbl;
    private javax.swing.JTextField bombTxtF;
    private javax.swing.JLabel controlsTitle;
    private javax.swing.JButton downButton;
    private javax.swing.JTextArea gameMap;
    private javax.swing.JLabel inventoryLbl;
    private javax.swing.JButton leftButton;
    private javax.swing.JLabel levelLbl;
    private javax.swing.JTextField levelTxtF;
    private javax.swing.JLabel lifeLabel;
    private javax.swing.JTextField lifeTxtF;
    private javax.swing.JButton rightButton;
    private javax.swing.JLabel strenghtLbl;
    private javax.swing.JTextField strenghtTxtF;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}
