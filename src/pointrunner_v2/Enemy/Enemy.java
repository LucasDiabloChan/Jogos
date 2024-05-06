/*
    Author: @asher_ren
    Description: class responsible for returning the experience dropped for each enemy, from lvl1 up to lvl20
    Created: 10/2023
    Update: 05/05/2024
*/

package pointrunner_v2.Enemy;

public class Enemy{
    public static int getEnemyDrop(int enemyLevel){
        return switch (enemyLevel) {
            case  1 -> Enemy_Enum.LEVEL1.getExperience();
            case  2 -> Enemy_Enum.LEVEL2.getExperience();
            case  3 -> Enemy_Enum.LEVEL3.getExperience();
            case  4 -> Enemy_Enum.LEVEL4.getExperience();
            case  5 -> Enemy_Enum.LEVEL5.getExperience();
            case  6 -> Enemy_Enum.LEVEL6.getExperience();
            case  7 -> Enemy_Enum.LEVEL7.getExperience();
            case  8 -> Enemy_Enum.LEVEL8.getExperience();
            case  9 -> Enemy_Enum.LEVEL9.getExperience();
            case 10 -> Enemy_Enum.LEVEL10.getExperience();
            case 11 -> Enemy_Enum.LEVEL11.getExperience();
            case 12 -> Enemy_Enum.LEVEL12.getExperience();
            case 13 -> Enemy_Enum.LEVEL13.getExperience();
            case 14 -> Enemy_Enum.LEVEL14.getExperience();
            case 15 -> Enemy_Enum.LEVEL15.getExperience();
            case 16 -> Enemy_Enum.LEVEL16.getExperience();
            case 17 -> Enemy_Enum.LEVEL17.getExperience();
            case 18 -> Enemy_Enum.LEVEL18.getExperience();
            case 19 -> Enemy_Enum.LEVEL19.getExperience();
            case 20 -> Enemy_Enum.LEVEL20.getExperience();
            default -> 0;
        };
    }
}
