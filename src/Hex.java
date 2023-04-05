import java.util.*;
public class Hex {
    private String terrain; //each terrain is assigned a number and that stays constant for the entire project
    private int player; // 1 2 3 4 and 0 for none
    private ArrayList<Hex> bordering;
    private ArrayList<String> borderingTerrain;
    // 0 1 2 3 4 5
    // NE E SE SW W NW
    public Hex(String t){
        bordering = new ArrayList<Hex>();
        for(int i =0; i<6; i++){
            bordering.add(null);
        }
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
    public String getTerrain(){
        return terrain;
    }
    public void set(int a, Hex b){
        bordering.set(a, b);
    }
    public String toString(){
        if(bordering.get(4)==null){
            if(bordering.get(3)==null){
                return terrain + " " + toString(bordering.get(1)) + "\n" + toString(bordering.get(2));
            }
            else{
                return terrain + " " + toString(bordering.get(1)) + "\n" + toString(bordering.get(3));
            }
        }
        return terrain + " " + toString(bordering.get(1));
    }
    public String toString(Hex x){
        if(x==null) return "";
        if(x.getBordering().get(4)!=null)
            return x.getTerrain() + " " + toString(x.getBordering().get(1));
        if(x.getBordering().get(3)==null){
            return terrain + " " + toString(x.getBordering().get(1)) + "\n" + toString(x.getBordering().get(2));
        }
        else{
            return terrain + " " + toString(x.getBordering().get(1)) + "\n" + toString(x.getBordering().get(3));
        }
    }
}