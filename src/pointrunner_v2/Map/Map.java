/*
    Author: @asher_ren
    Description: class responsible to control changes on map and it's view
    Created: 10/2023
    Update: 05/05/2024
*/

package pointrunner_v2.Map;

import java.util.Random;
import javax.swing.JOptionPane;
import pointrunner_v2.Enemy.Enemy;
import pointrunner_v2.Enemy.Enemy_Enum;
import pointrunner_v2.Player.Player;
import pointrunner_v2.PopupManager.PopupManager;

public class Map {
    private final int MAX_BARRIERS = 20;
    private final int MIN_BARRIERS = 10;
    
    private final StringBuffer[][] mapMatrix;
    public StringBuffer drawedMap;
    
    public Map(int lines, int colums, int enemies){
        mapMatrix = new StringBuffer[lines][colums];
        drawedMap = new StringBuffer();
        
        drawEmptyMap(mapMatrix.length, mapMatrix[0].length);
        
        // Generating world
        generateRandomEnemies(enemies);
        setPlayerOnMap();
        generateBarriers();
        redrawMap();
    }
    
    private void drawEmptyMap(int lines, int colums){
        int coordX;
        for(int coordY = 0; coordY < lines; coordY++){
            for(coordX = 0; coordX < colums; coordX++){
                mapMatrix[coordY][coordX] = new StringBuffer(" . ");
            }
            --coordX;
            mapMatrix[coordY][coordX].append("\n");
        }
    }

    private String redrawMap(){
        drawedMap = new StringBuffer("");
        
        for(StringBuffer[] axis : mapMatrix){
            for(StringBuffer point : axis){
                drawedMap.append(point);
            }
        }
        
        return drawedMap.toString();
    }
    
    private void generateRandomEnemies(int enemyQty){
        Random r = new Random();
        
        while(enemyQty > 0){
            int posY = r.nextInt(0, mapMatrix.length);
            int posX = r.nextInt(0, mapMatrix[0].length);
            
            if(!" . ".equals(mapMatrix[posY][posX].toString())){
                continue;
            }

            int enemyForce = r.nextInt(1, 10);

            if(posX == 47)
                mapMatrix[posY][posX] = new StringBuffer(" " + enemyForce + "\n");
            else
                mapMatrix[posY][posX] = new StringBuffer(" " + enemyForce + " ");
            
            enemyQty--;
        }
    }
    
    private void setPlayerOnMap(){
        while(true){
            int posY = (int)(Math.random() * mapMatrix.length);
            
            if(!mapMatrix[posY][0].toString().equals(" . ")){
                continue;
            }
            
            mapMatrix[posY][0] = new StringBuffer(" P ");
            Player.setPlayerPos(0, posY);
            
            break;
        }
    }
    
    private void generateBarriers(){
        Random r = new Random();
        int amountBarriers = r.nextInt(MIN_BARRIERS, MAX_BARRIERS);
        
        while(amountBarriers > 0){
            int randY = r.nextInt(0, mapMatrix.length);
            int randX = r.nextInt(0, mapMatrix[0].length);
            
            if(amountBarriers > 0 && mapMatrix[randY][randX].toString().equals(MapTerrain.EMPTY.getTerrain())
                || mapMatrix[randY][randX].toString().equals(MapTerrain.EMPTY_LN.getTerrain())
                ){
                
                if(randX == mapMatrix[0].length - 1)
                    mapMatrix[randY][randX] = new StringBuffer(" # \n");
                else
                    mapMatrix[randY][randX] = new StringBuffer(" # ");
                
                amountBarriers = amountBarriers - 1;
            }      
        }
    }

    public String getDrawedMap(){
        return drawedMap.toString();
    }

    public int movePlayer(int x, int y){
        int pPos[];
        pPos = Player.getPlayerPos();

        int path[] = new int[2];
        
        if(x == 1 && y == 0){
            path[0] = pPos[0] + 1;
            path[1] = pPos[1];
            
            if(checkDestinyPath(path) == 1){
                changeTerrainSpaces(path, pPos);
                redrawMap();
                return 1;
            }
        }
        
        else if(x == -1 && y == 0){
            path[0] = pPos[0] - 1;
            path[1] = pPos[1];
            
            if(checkDestinyPath(path) == 1){
                changeTerrainSpaces(path, pPos);
                redrawMap();
                return 1;
            }
        }
        
        else if(x == 0 && y == 1){
            path[0] = pPos[0];
            path[1] = pPos[1] - 1;
            
            if(checkDestinyPath(path) == 1){
                changeTerrainSpaces(path, pPos);
                redrawMap();
                return 1;
            }
        }
        
        else if(x == 0 && y == -1){
            path[0] = pPos[0];
            path[1] = pPos[1] + 1;
            
            if(checkDestinyPath(path) == 1){
                changeTerrainSpaces(path, pPos);
                redrawMap();
                return 1;
            }
        }
        
        else{
            System.out.println("Axis unknown...");
        }
        
        return 0;
    }

    private boolean isAcessiblePath(int coord[]){
        int x = coord[0];
        int y = coord[1];
        
        return mapMatrix[y][x].toString().equals(MapTerrain.EMPTY.getTerrain())
                || mapMatrix[y][x].toString().equals(MapTerrain.EMPTY_LN.getTerrain());
    }

    private boolean isBarriered(int path[]) {
        return mapMatrix[path[1]][path[0]].toString().equals(MapTerrain.BARRIER.getTerrain())
                || mapMatrix[path[1]][path[0]].toString().equals(MapTerrain.BARRIER_LN.getTerrain());
    }

    private boolean isOccupiedByEnemy(int[] path) {
        return mapMatrix[path[1]][path[0]].toString().trim().matches("[0-9]");
    }

    private boolean isEndWorld(int[] path) {
        return path[1] > (mapMatrix.length - 1) || path[1] < 0 
                || path[0] > (mapMatrix[0].length - 1) || path[0] < 0;
                
    }

    private boolean calculateSuccessRateAttack(int lvlDiff, int path[]) {
        boolean win = false;
        
        if(lvlDiff >= 3 && Math.random() > 0.96){
            win = true;
            if(path[0] == mapMatrix[0].length-1)
                mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.EMPTY_LN.getTerrain());
            else
                mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.EMPTY.getTerrain());
        }
        else if(lvlDiff == 2 && Math.random() > 0.70){
            win = true;
            if(path[0] == mapMatrix[0].length-1)
                mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.EMPTY_LN.getTerrain());
            else
                mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.EMPTY.getTerrain());
        }
        else if(lvlDiff == 1 && Math.random() > 0.40){
            win = true;
            if(path[0] == mapMatrix[0].length-1)
                mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.EMPTY_LN.getTerrain());
            else
                mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.EMPTY.getTerrain());
        }
        else
            System.out.println("no level diff");
        
        
        return win;
    }

    private int checkDestinyPath(int path[]) {
        // 1 = success, 0 = fail
        int success = 0;
        
        if(isEndWorld(path)){
            JOptionPane.showConfirmDialog(null, "You cannot run from your fate... Go straight, soldier.");
            return success;
        }
        
        if(!isAcessiblePath(path)){
            if(isBarriered(path)){
                int resp = JOptionPane.showConfirmDialog(null, "Do you want to use a bomb to break this wall?", "Action", 1, 1);

                if(resp == 0){
                    Player.getItem("bomb").reduceAmount(1);
                    if(path[0] == mapMatrix[0].length-1)
                        mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.EMPTY_LN.getTerrain());
                    else
                        mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.EMPTY.getTerrain());
                    
                    success = 1;
                }    
                else{
                    JOptionPane.showMessageDialog(null, "So you need to surround it, baka.");
                }
            }

            else if(isOccupiedByEnemy(path)){
                int enemy = Integer.parseInt(mapMatrix[path[1]][path[0]].toString().trim());

                if(Player.getAttack() >= enemy){
                    Player.experienceUpdate(Enemy.getEnemyDrop(enemy));
                    success = 1;
                }
                else if(Player.getAttack() < enemy){
                    int lvlDiff = enemy - Player.getAttack();
                    int atkTaken = (int) (enemy * 0.3);
                    Player.damageTaken(atkTaken);

                    if(calculateSuccessRateAttack(lvlDiff, path)){
                        PopupManager.showVictoryMessage("Well done! You beat up this beast!");
                        Player.experienceUpdate(Enemy.getEnemyDrop(enemy));
                        success = 1;
                    }
                    else
                        PopupManager.showVictoryMessage("Well... Maybe it's not your time... To win...");
                }
            }
            else{
                JOptionPane.showConfirmDialog(null, "You cannot run from your fate... Go straight, soldier.");
            }
        }
        else{
            success = 1;
        }
        return success;
    }

    private void changeTerrainSpaces(int[] path, int[] prevPos) {
        if(prevPos[0] == (mapMatrix[0].length-1))
            mapMatrix[prevPos[1]][prevPos[0]] = new StringBuffer(MapTerrain.EMPTY_LN.getTerrain());
        else
            mapMatrix[prevPos[1]][prevPos[0]] = new StringBuffer(MapTerrain.EMPTY.getTerrain());

        Player.setPlayerPos(path[0], path[1]);

        if(path[0] == (mapMatrix[0].length-1))
            mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.PLAYER_LN.getTerrain());
        else
            mapMatrix[path[1]][path[0]] = new StringBuffer(MapTerrain.PLAYER.getTerrain());
    }
} 
