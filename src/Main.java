import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        DB arrList = new DB();
        Item bananaBread = new Item("Banana Bread",5.95,"11/30/2019",new String[]{"gluten ","soy ","egg "}, 20);
        Item mgWhiteBread = new Item("Multi-Grain White Bread",10.95,"11/15/2019",new String[]{"gluten ", "dairy ", "egg ", "soy "},15);
        Item cinnamonBread = new Item("Cinnamon Bread",10.95,"11/16/2019",new String[]{"gluten ","egg ", "peanut "},16);
        Item savoryRolls = new Item("Savory Rolls",3.00,"11/18/2019",new String[]{"peanut"},18);
        Collections.addAll(arrList.getInventory(),mgWhiteBread,bananaBread,cinnamonBread,savoryRolls);
        arrList.getDisplayText();

        }


    }

