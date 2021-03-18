package Sorting;

public class SortingUtils {

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exchange(Comparable[] a,int i,int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=1; i< a.length; i++) {
            if(less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }



    public static int getMedianOf3(Comparable[] a, int left,int mid, int right){
        //int center = (left+right)/2;

        if(a[mid].compareTo(a[left]) < 0)
            exchange(a,left,mid);

        if(a[right].compareTo(a[left]) < 0)
            exchange(a,left, right);

        if(a[right].compareTo(a[mid]) < 0)
           exchange(a,mid, right);

        //exchange(a,center, right);
        return mid;
    }
}
