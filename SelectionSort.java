package Sorting;

public class SelectionSort {

    //O(n^2) even if array is sorted from before
    public static void sort(Comparable[] a) {
        for(int i=0; i < a.length; i++) {
            int min =i;
            for(int j= i +1; j < a.length; j++) {
                if(SortingUtils.less(a[j],a[min])) {
                    min = j;
                }
            }
            SortingUtils.exchange(a,i,min);
        }
    }
}
