import java.util.*;
public class Sub {
    Hex cornerTopLeft;
    Hex[][] hexRay;
    public Sub(Hex ctl){
        cornerTopLeft = ctl;
        hexRay = new Hex[10][10];
        toMatrix();
    }
    public Sub(String[][] x){
        toHexRay(x);
    }
    public void toMatrix(){
        //   turns the hexagon graph into a matrix
    }
    public void toHexRay(String[][] x){
        //   takes an input matrix and turns it into a hexagon graph
    }
}
