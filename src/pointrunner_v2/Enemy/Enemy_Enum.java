/*
    Author: @asher_ren
    Description: enum responsible for storing and sharing the dropped xp from each enemy level
    Created: 10/2023
    Update: 05/05/2024
*/


package pointrunner_v2.Enemy;

public enum Enemy_Enum {
    LEVEL1 (10), LEVEL2 (15), LEVEL3 (25),
    LEVEL4 (30), LEVEL5 (37), LEVEL6 (48),
    LEVEL7 (60), LEVEL8 (71), LEVEL9 (83),
    LEVEL10 (110), LEVEL11 (125), LEVEL12 (155),
    LEVEL13 (199), LEVEL14 (255), LEVEL15 (300),
    LEVEL16 (350), LEVEL17 (410), LEVEL18 (500),
    LEVEL19 (750), LEVEL20 (1000);
    
    private final int enemyXp;
    
    Enemy_Enum(int strenght){
        enemyXp = strenght;
    }
    
    public int getExperience(){
        return enemyXp;
    }
}
