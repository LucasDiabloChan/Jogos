/*
    Author: @asher_ren
    Description: enum responsible to return the reqcquired amount of xp of each lvl of the player
    Created: 10/2023
    Update: 05/05/2024
*/


package pointrunner_v2.Player;

public enum PlayerLevel{
    LVL0(0), LVL1(30), LVL2(110),
    LVL3(400), LVL4(750), LVL5(1200),
    MAX_LVL(1000000);
    
    private final int recquiredXp;
    
    PlayerLevel(int xpReq){
        recquiredXp = xpReq;
    }
    
    public int getRecquiredXp(){
        return recquiredXp;
    }
}