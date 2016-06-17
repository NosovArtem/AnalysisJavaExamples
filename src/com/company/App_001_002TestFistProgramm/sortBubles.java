package com.company.App_001_002TestFistProgramm;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by Admin on 12.01.2016.
 */
public class sortBubles {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>(Arrays.asList(7, 8, 15, 1, 87, 150, 50, 96, 7, 25, 10));
        sort(numlist);
    }


    public static void sort(List<Integer> sortList) {
        for(int i=0; i<sortList.size(); i++){
            for(int j=0; j<sortList.size()-1; j++){
                if(sortList.get(j)>sortList.get(j+1)){
                    int tmp = sortList.get(j);
                    sortList.set(j, sortList.get(j+1));
                    sortList.set(j+1, tmp);
                }
            }

        }
        System.out.println(sortList);
    }
}
