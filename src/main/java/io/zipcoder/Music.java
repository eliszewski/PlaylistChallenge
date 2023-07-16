package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int shortestPath = this.playList.length * 2;
        int temp = Integer.MAX_VALUE;

        for (int i = 0; i < this.playList.length; i++) {
            if (this.playList[i].equals(selection)) {
                int directRange = Math.abs(startIndex - i);
                if (directRange < this.playList.length / 2) {
                    temp = directRange;
                } else {
                    temp = this.playList.length - directRange;
                }
                if (temp < shortestPath) {
                    shortestPath = temp;
                }
            }
        }

        return shortestPath;
    }


}





