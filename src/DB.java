import java.util.ArrayList;

public class DB {
    ArrayList<Inventory> database;

    public DB() {
        this.database = new ArrayList<>();
    }

    public DB(ArrayList<Inventory> database) {
        this.database = database;
    }

    public ArrayList<Inventory> getDatabase() {
        return database;
    }

    public void setDatabase(ArrayList<Inventory> database) {
        this.database = database;
    }

    public void add(Inventory x){
        this.database.add(x);
    }
}
