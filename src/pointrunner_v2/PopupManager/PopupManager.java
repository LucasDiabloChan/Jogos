/*
    Author: @asher_ren
    Description: this class was supposed to present some facilities in showing popups, but I'll reforge her later...
    Created: 10/2023
    Update: 05/05/2024
*/

package pointrunner_v2.PopupManager;

import javax.swing.JOptionPane;

public class PopupManager {
    public static void showVictoryMessage(String msg){
        JOptionPane.showInternalInputDialog(null, msg);
    }
}
