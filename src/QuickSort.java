public class QuickSort {
    // O(n*log(n)) time complexity

    private static int partition(int[] l, int start, int end) {
        int pivot = end;
        int upperindex = start;
        int temp;
        for (int i = start; i < pivot; i++) {
            if (l[i] < l[pivot]) {
                temp = l[i];
                l[i] = l[upperindex];
                l[upperindex] = temp;
                upperindex++;
            }
        }

        if (l[upperindex] > l[pivot]) {
            temp = l[upperindex];
            l[upperindex] = l[pivot];
            l[pivot] = temp;
        }
        return upperindex;
    }

    public static int[] quickSort(int[] l, int start, int end) {
        if (start < end) {
            int pivot = partition(l, start, end);
            quickSort(l, start, pivot - 1);
            quickSort(l, pivot + 1, end);
        }
        return l;
    }
}
