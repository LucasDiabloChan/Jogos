/*
    Author: @asher_ren
    Description: class responsible to store player's itens and manage them
    Created: 10/2023
    Update: 05/05/2024
*/


package pointrunner_v2.Inventory;

import java.util.ArrayList;

public class Inventory {
    private String owner;
    private ArrayList<Item> bag;
    
    public Inventory(String owner){
        this.owner = owner;
        this.bag = new ArrayList<>();
    }
    
    public void addItem(Item item){
        bag.add(item);
    }
    
    public Item getItem(String name){
        for(Item i : bag){
            if(i.getName().equals(name)) {
                return i;
            } 
        }
        
        return null;
    }
    
    public void showList(){
        bag.forEach((t) -> {
            System.out.println(t);
        });
    }
}
