package Sorting;

public class InsertionSort {
    //O(n^2)
    public static void sort(Comparable[] a) {
        int n = a.length;
        for(int i=0; i < n ; i++) {
            for(int j= i; j > 0; j --) {
                if(SortingUtils.less(a[j],a[j-1])) {
                    SortingUtils.exchange(a,j-1,j);
                }
                else
                    break;
            }

        }
    }
}
