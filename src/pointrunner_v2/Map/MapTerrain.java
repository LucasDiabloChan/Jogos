/*
    Author: @asher_ren
    Description: enum responsible for store the types of strings that can be present on the map
    Created: 10/2023
    Update: 05/05/2024
*/

package pointrunner_v2.Map;

public enum MapTerrain {
    // Ground
    EMPTY(" . "), EMPTY_LN(" . \n"), BARRIER(" # "), BARRIER_LN(" # \n"),
    // ENITITIES
    PLAYER(" P "), PLAYER_LN(" P \n");
    
    
    public String terrain;
    
    MapTerrain(String value){
        terrain = value;
    }
    
    public String getTerrain(){
        return terrain;
    }
}
