package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int len = this.playList.length;
        int shortestPath = len * 2;
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i<len; i++){
            if(this.playList[i].equals(selection)){
                int directRange = Math.abs(startIndex - i);
                if(directRange < len/2) temp = directRange;
                else temp = len - directRange;
            }
            if(temp<shortestPath)shortestPath = temp;
        }
        return shortestPath;
    }

}
//find selection index
// check start < selectionIndex
// selection - start = distance with no wrap
// startPOS + (len - selection)
//compare the 2 then return the lowest

//start>selection index




