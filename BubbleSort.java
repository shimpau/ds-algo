package Sorting;

public class BubbleSort {
    //O(n^2)
    public static void sort(Comparable[] a) {
        int n = a.length;
        for(int i=0; i < n -1; i++) {
            for(int j= 0; j < n -i -1; j++) {
                if(SortingUtils.less(a[j+1],a[j])) {
                    SortingUtils.exchange(a,j,j+1);
                }
            }

        }
    }
}
