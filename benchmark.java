public class benchmark {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            bubblesort.bubbleSort(arr);
        }
        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1e9;
        System.out.println("Time taken for 10000 iterations: " + timeTaken + " seconds");
    }
}

