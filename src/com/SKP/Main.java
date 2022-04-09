package com.SKP;

import com.SKP.forest.Forest;

import java.awt.*;

public class Main {

    static int CANVAS_SIZE = 500;
    static  int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for(int i=0; i<Math.floor(TREES_TO_DRAW/TREE_TYPES);i++){
            forest.plantTree(random(0, CANVAS_SIZE),random(0, CANVAS_SIZE),"dab letni", Color.GREEN,
                    "Dab latem");
            forest.plantTree(random(0, CANVAS_SIZE),random(0, CANVAS_SIZE),"dab jesienny", Color.ORANGE,
                    "Dab jesienia");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " drzew");
        System.out.println("--------------------------------------");
        System.out.println("Zużyta pamięć: ");
        System.out.println("Drzewa (8B) * "+ TREES_TO_DRAW);
        System.out.println("+ Typy drzew (~30B) *" + TREE_TYPES + "");
        System.out.println("----------------------------------------");
        System.out.println("Razem: "+ ((TREES_TO_DRAW*8+TREE_TYPES*30)/1024/1024)+ "MB zamiast "+ ((TREES_TO_DRAW*38)/1024/1024));
    }


    private static int random(int min, int max){
      return  min+(int)(Math.random()*((max-min) +1));
    }
}
