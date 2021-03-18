package Sorting;

import java.util.Random;

public class QuickSort {

    private static int partition(Comparable[] arr, int lo, int hi) {
        int i = lo;
        int j = hi +1;
        while(true) {
            while(SortingUtils.less(arr[++i],arr[lo])){//find element on left to swap
                if(i == hi)
                    break;
            }
            while(SortingUtils.less(arr[lo],arr[--j])){//find element on right to swap
                if(j == lo)
                    break;
            }
            if(i >= j) //check if pointers cross
                break;
            SortingUtils.exchange(arr,i,j);//swap
        }
        SortingUtils.exchange(arr,lo,j);//swap with partitioning item
        return j;//return index of item now known to be in place
    }



    //Quicksort is O(nlogn) performance
    public static void sort(Comparable[] arr){
        sort(arr,0, arr.length -1);
    }

    private static void sort(Comparable[] arr, int lo, int hi){
        if(hi <= lo)
            return;

        //int pivot = SortingUtils.getMedianOf3(arr, lo, lo + (hi-lo)/2, hi);
        //SortingUtils.exchange(arr, lo, pivot);

        int j = partition(arr,lo,hi);
        sort(arr,lo,j-1);
        sort(arr,j+1,hi);

    }


}
