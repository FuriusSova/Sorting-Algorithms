import java.util.Arrays;

public class MergeSort {
    // O(n*log(n)) time complexity

    private static void merge(int[] mergedList, int[] list1, int[] list2) {
        int insertIndex = 0, indexList1 = 0, indexList2 = 0;
        while (list1.length > indexList1 && list2.length > indexList2) {
            if (list1[indexList1] <= list2[indexList2]) {
                mergedList[insertIndex] = list1[indexList1];
                indexList1++;
            } else {
                mergedList[insertIndex] = list2[indexList2];
                indexList2++;
            }
            insertIndex++;
        }

        while (indexList1 < list1.length) {
            mergedList[insertIndex] = list1[indexList1];
            indexList1++;
            insertIndex++;
        }

        while (indexList2 < list2.length) {
            mergedList[insertIndex] = list2[indexList2];
            indexList2++;
            insertIndex++;
        }
    }

    public static void mergeSort(int[] list) {
        if (list.length == 1)
            return;

        int medium = list.length / 2;
        int[] list1 = Arrays.copyOfRange(list, 0, medium);
        int[] list2 = Arrays.copyOfRange(list, medium, list.length);

        mergeSort(list1);
        mergeSort(list2);

        merge(list, list1, list2);
    }
}
