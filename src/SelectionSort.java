public class SelectionSort {
    // O(n^2) time complexity

    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if(list[j] < list[indexOfMin]) indexOfMin = j;
            }
            int temp = list[i];
            list[i] = list[indexOfMin];
            list[indexOfMin] = temp;
        }
        
        return list;
    }
}
