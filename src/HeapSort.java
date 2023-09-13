import java.util.PriorityQueue;

public class HeapSort {
    // O(n*log(n)) time complexity

    public static void heapSort(int[] list) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int item : list) {
            minHeap.add(item);
        }

        for (int i = 0; i < list.length; i++) {
            list[i] = minHeap.poll();
        }
    }
}
