import java.util.ArrayList;

public class DB {
    private ArrayList<Item> inventory;

    public DB() {
        this.inventory=new ArrayList<>();
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void getDisplayText(){
        for(Item i : inventory){
            System.out.print(i.getName()+"\t");
            System.out.print(i.getPrice()+"\t");
            System.out.print(i.getDate()+"\t");
            System.out.print(i.getQuantity()+"\t");
            for (String j: i.getRestriction()){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
