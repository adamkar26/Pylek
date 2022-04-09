package com.SKP.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeType){
        TreeType result = treeTypes.get(name);
        if(result == null){
            result = new TreeType(name,color, otherTreeType);
            treeTypes.put(name, result);
        }

        return result;
    }

}
