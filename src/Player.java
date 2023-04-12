import java.util.TreeSet;
public class Player {
    private int points;
    private int playerNum;
    private int settlements;
    private TreeSet<LocationTile> locTiles;

    public Player(int num) {
        points=0;
        playerNum = num;
        settlements = 40;
        locTiles = new TreeSet<>();
    }
    public int getSettlementNum() {
        return settlements;
    }
    public int getPoints() {
        return points;
    }
    public TreeSet getLocTiles() {
        return locTiles;
    }
    public void addLocTiles(LocationTile tile) {
        locTiles.add(tile);
    }
    public void removeSettlements(int num) {
        settlements-=num;
    }
    public void useSettlements() {
        settlements-=3;
    }

}

