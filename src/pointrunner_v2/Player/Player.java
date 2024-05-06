/*
    Author: @asher_ren
    Description: class responsible to control all player's status and items
    Created: 10/2023
    Update: 05/05/2024
*/


package pointrunner_v2.Player;

import pointrunner_v2.Inventory.*;

public class Player {

    private final int MAX_INITIAL_HP  = 5;
    private final int MIN_INITIAL_HP  = 5;
    private final int MAX_INITIAL_PWR = 5;
    private final int MIN_INITIAL_PWR = 2;
    private final int INITIAL_BOMBS = 3;
    
    
    private static int initialLife, currentLife, attack;
    private static double experience;
    private static int playerPosition[];
    private static PlayerLevel pl;
    
    private static boolean isDead = false;
    private static Inventory bag;
    
    public Player(){
        initialLife = (int) (Math.random() * MAX_INITIAL_HP) + MIN_INITIAL_HP;
        currentLife = initialLife;
        attack = (int) (Math.random() * MAX_INITIAL_PWR) + MIN_INITIAL_PWR;
        experience = 0.0;
        playerPosition = new int[2];
        pl = PlayerLevel.LVL0;
        
        bag = new Inventory("player");
        Item i = new Item("bomb", "can be used to break walls", INITIAL_BOMBS);
        bag.addItem(i);
    }
    
    public static void lifeUpdate(int newHP){
        currentLife = initialLife + newHP;
    }
    public static int getLife(){
        return Player.currentLife;
    }
    public static void damageTaken(int dmg){
        Player.currentLife -= (Player.currentLife > dmg) ? dmg : Player.currentLife;
        Player.isDead = (Player.currentLife <= 0);
    }
    
    public static void attackUpdate(int newPower){
        attack += newPower;
    }
    public static int getAttack(){
        return Player.attack;
    }
    
    
    public static void experienceUpdate(double xp){
        Player.experience += xp;
        
        if(Player.experience > Player.nextLevl().getRecquiredXp())
            Player.pl = Player.nextLevl();
        
        
    }
    public static int getCurrentXP(){
        return (int) Player.experience;
    }
    public static String getRecquiredXPLevel(int lvl){
        switch(lvl){
            case 1 -> {return String.valueOf(PlayerLevel.LVL1.getRecquiredXp());}
            case 2 -> {return String.valueOf(PlayerLevel.LVL2.getRecquiredXp());}
            case 3 -> {return String.valueOf(PlayerLevel.LVL3.getRecquiredXp());}
            case 4 -> {return String.valueOf(PlayerLevel.LVL4.getRecquiredXp());}
            case 5 -> {return String.valueOf(PlayerLevel.LVL5.getRecquiredXp());}
            case 6 -> {return "MAX";}
            default -> {return "0";}
        }
    }
    private static PlayerLevel nextLevl() {
        switch(Player.pl){
            case PlayerLevel.LVL0 -> {return PlayerLevel.LVL1;}
            case PlayerLevel.LVL1 -> {return PlayerLevel.LVL2;}
            case PlayerLevel.LVL2 -> {return PlayerLevel.LVL3;}
            case PlayerLevel.LVL3 -> {return PlayerLevel.LVL4;}
            case PlayerLevel.LVL4 -> {return PlayerLevel.LVL5;}
            case PlayerLevel.LVL5 -> {return PlayerLevel.MAX_LVL;}
            default -> {return PlayerLevel.LVL0;}
        }
    }
    
    public static void setPlayerPos(int x, int y){
        playerPosition[0] = x;
        playerPosition[1] = y;
    }
    
    public static int[] getPlayerPos(){
        return playerPosition;
    }
    
    public static int getPlayerLevel(){
        switch(Player.pl){
            case PlayerLevel.LVL0 -> {return 0;}
            case PlayerLevel.LVL1 -> {return 1;}
            case PlayerLevel.LVL2 -> {return 2;}
            case PlayerLevel.LVL3 -> {return 3;}
            case PlayerLevel.LVL4 -> {return 4;}
            case PlayerLevel.LVL5 -> {return 5;}
            default -> {return 0;}
        }
    }

    
    public static Item getItem(String name) {
        return bag.getItem(name);
    }
    
    public static int getQuantityInBag(String str) {
        return bag.getItem(str).getAmount();
    }
}


