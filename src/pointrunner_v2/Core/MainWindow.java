/*
    Author: @asher_ren
    Description: this class is the core of the game, without it, there is no game. The instance of the game is created here.
    Created: 10/2023
    Update: 05/05/2024
*/

package pointrunner_v2.Core;

public class MainWindow {
    public static void main(String[] args) {
        GameScreen gs;
        gs = new GameScreen(14, 24, 20);
        System.out.println("Classe criada...");
        gs.setVisible(true);
        
        System.out.println("Jogo criado...");
    }
}
