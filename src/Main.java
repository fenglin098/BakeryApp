
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DB test = new DB();
        Inventory bananaBread = new Inventory();
        bananaBread.setName("Banana Bread");
        bananaBread.setPrice(5.95);
        bananaBread.setDate("11/30/2019");
        bananaBread.setRestriction("gluten, dairy, egg, soy");
        bananaBread.setQuantity(20);
        test.add(bananaBread);

        Inventory mgWhiteBread = new Inventory();
        mgWhiteBread.setName("Multi-Grain White Bread");
        mgWhiteBread.setPrice(10.95);
        mgWhiteBread.setDate("11/15/2019");
        mgWhiteBread.setRestriction("gluten, dairy, egg, soy");
        mgWhiteBread.setQuantity(15);
        test.add(mgWhiteBread);

        Inventory cinnamonBread = new Inventory();
        cinnamonBread.setName("Cinnamon Bread");
        cinnamonBread.setPrice(10.95);
        cinnamonBread.setDate("11/16/2019");
        cinnamonBread.setRestriction("gluten, egg, soy");
        cinnamonBread.setQuantity(16);
        test.add(cinnamonBread);

        Inventory savoryRolls = new Inventory();
        savoryRolls.setName("Savory Rolls");
        savoryRolls.setPrice(3.00);
        savoryRolls.setDate("11/18/2019");
        savoryRolls.setRestriction("peanut");
        savoryRolls.setQuantity(18);
        test.add(savoryRolls);
        System.out.println(DB);

        }
    }
}
