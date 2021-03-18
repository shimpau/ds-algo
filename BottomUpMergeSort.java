package Sorting;

/* Avoids Recursion O(nlogn)*/
public class BottomUpMergeSort {
    private static Comparable[] aux;
    public static void sort(Comparable[] a){
        int n = a.length;
        aux = new Comparable[n];
        //Takes size of subarray. Outer loop is executed only logn times since each time we are doubling size
        for(int sz=1; sz < n; sz+=sz) {
            for(int lo=0;lo < n-sz;lo +=sz+sz) {
                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,n-1));
            }
        }
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        for(int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        int i = lo, j = mid + 1;
        for(int k=lo; k <= hi; k++) {
            if(i > mid) {
                a[k] = aux[j++];
            } else if(j > hi) {
                a[k] = aux[i++];
            } else if(SortingUtils.less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
