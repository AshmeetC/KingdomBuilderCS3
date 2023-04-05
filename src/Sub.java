import java.io.*;
import java.util.*;
public class Sub {
    Hex ctl;
    Hex[][] hexRay;
    BufferedReader b1;
    public Sub(String usethisone) throws IOException {
        b1 = new BufferedReader(new FileReader(usethisone));
        hexRay= new Hex[10][10];
        String[][] things = new String[10][10];
        for(int i =0; i<10; i++){
                String[] temp = b1.readLine().split(" ");
            for(int j = 0; j<10; j++){
                things[i][j]= temp[j];
            }
        }
        toHexRay(things);
        //System.out.println("");
        ctl = hexRay[0][0];
        System.out.println(ctl.toString());
    }
    public void toHexRay(String[][] x){
        //   takes an input matrix and turns it into a hexagon graph
        for(int i =0; i<10; i++){
            for(int j =0; j<10; j++){
                hexRay[i][j]= new Hex(x[i][j]);
            }
        }
        for(int i =0; i<10; i++){
            for(int j =0; j<10; j++){
                if(i!=0 && j!=0 && i!=9 && j!=9){
                    if(i%2==0){
                        hexRay[i][j].set(0, hexRay[i-1][j]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j-1]);
                    }
                    else{
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j+1]);
                        hexRay[i][j].set(3, hexRay[i+1][j]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                }
                if(i==0){
                    if(j==0){
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, null);
                        hexRay[i][j].set(5, null);
                    }
                    else if(j==9){
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, null);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, null);
                    }
                    else{
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, hexRay[i+1][j]);
                        hexRay[i][j].set(3, hexRay[i+1][j-1]);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, null);
                    }
                }
                if(i==9){
                    if(j==0){
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, null);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, null);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                    else if(j==9){
                        hexRay[i][j].set(0, null);
                        hexRay[i][j].set(1, null);
                        hexRay[i][j].set(2, null);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                    else{
                        hexRay[i][j].set(0, hexRay[i-1][j+1]);
                        hexRay[i][j].set(1, hexRay[i][j+1]);
                        hexRay[i][j].set(2, null);
                        hexRay[i][j].set(3, null);
                        hexRay[i][j].set(4, hexRay[i][j-1]);
                        hexRay[i][j].set(5, hexRay[i-1][j]);
                    }
                }
                if(j==0){
                    if(i!=0 && i!=9){
                        if(i%2==0){
                            hexRay[i][j].set(0, hexRay[i-1][j]);
                            hexRay[i][j].set(1, hexRay[i][j+1]);
                            hexRay[i][j].set(2, hexRay[i+1][j]);
                            hexRay[i][j].set(3, null);
                            hexRay[i][j].set(4, null);
                            hexRay[i][j].set(5, null);
                        }
                        else{
                            hexRay[i][j].set(0, hexRay[i-1][j+1]);
                            hexRay[i][j].set(1, hexRay[i][j+1]);
                            hexRay[i][j].set(2, hexRay[i+1][j+1]);
                            hexRay[i][j].set(3, hexRay[i+1][j]);
                            hexRay[i][j].set(4, null);
                            hexRay[i][j].set(5, hexRay[i-1][j]);
                        }
                    }
                }
                if(j==9){
                    if(i!=0 && i!=9){
                        if(i%2==0){
                            hexRay[i][j].set(0, hexRay[i-1][j]);
                            hexRay[i][j].set(1, null);
                            hexRay[i][j].set(2, hexRay[i+1][j]);
                            hexRay[i][j].set(3, hexRay[i+1][j-1]);
                            hexRay[i][j].set(4, hexRay[i][j-1]);
                            hexRay[i][j].set(5, hexRay[i-1][j-1]);
                        }
                        else{
                            hexRay[i][j].set(0, null);
                            hexRay[i][j].set(1, null);
                            hexRay[i][j].set(2, null);
                            hexRay[i][j].set(3, hexRay[i+1][j]);
                            hexRay[i][j].set(4, hexRay[i][j-1]);
                            hexRay[i][j].set(5, hexRay[i-1][j]);
                        }
                    }
                }
            }
        }
    }
}
