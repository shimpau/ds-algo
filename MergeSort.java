package Sorting;

public class MergeSort {

    //Efficient Performance O(nlogn)
    public static void sort(Comparable[] a){
        //We are creating auxillary array here since creating it in recursive functions adds unnnecessary cost
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length -1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if(hi <= lo) {
            return;
        }
        int mid = lo + (hi-lo) /2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid +1, hi);
        if(!SortingUtils.less(a[mid +1], a[mid])) { //Performance Improvement
            return;
        }
        merge(a, aux, lo, mid, hi);
    }


    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
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
