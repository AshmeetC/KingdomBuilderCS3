import java.util.*;
public class Hex {
    int terrain; //each terrain is assigned a number and that stays constant for the entire project
    int player; // 1 2 3 4 and 0 for none
    ArrayList<Hex> bordering;
    // 0 1 2 3 4 5
    // NE E SE SW W NW
    public Hex(int t){
        bordering = new ArrayList<Hex>();
        player = 0;
        terrain = t;
    }
    public ArrayList<Hex> getBordering(){
        return bordering;
    }
    public Hex get(int x){
        return bordering.get(x);
    }
    public int getColor(){
        return player;
    }
    public int getTerrain(){
        return terrain;
    }
}
