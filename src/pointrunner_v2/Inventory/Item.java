/*
    Author: @asher_ren
    Description: class responsible to store an unique item and control it
    Created: 10/2023
    Update: 05/05/2024
*/

package pointrunner_v2.Inventory;

public class Item {
    private String name;
    private String description;
    private int amount;
    
    public Item(){
    }
    
    public Item(String name, String desc, int qty){
        this.name        = name;
        this.amount      = qty;
        this.description = desc;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public int getAmount(){
        return this.amount;
    }
    
    public void reduceAmount(int qty){
        this.amount-= (amount >= qty) ? qty : amount;
    }
}
