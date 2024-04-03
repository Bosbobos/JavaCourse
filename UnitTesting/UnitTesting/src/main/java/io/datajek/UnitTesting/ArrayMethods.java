package io.datajek.UnitTesting;

public class ArrayMethods {
    int findIndex(int[] array, int number) {
        int index = -1;
        for(int i=0; i<array.length; i++){
            if(array[i]==number)
                index=i;
        }
        return index;
    }

    boolean searchForNumber(int[] array, int numberToSearchFor) {  //search for number, return true if found
        boolean found = false;
        for(int i:array) {
            if(i== numberToSearchFor) {
                found = true;
                return found;
            }
        }
        return found;
    }

    int getByIndex(int[] array, int index) {
        return array[index];
    }

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0)
            System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
