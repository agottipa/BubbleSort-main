import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    
    @Test
    public void testBubbleSort() {
        // Test case 1: Basic test
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        int[] expectedArr1 = {11, 12, 22, 25, 34, 64, 90};
        bubblesort.bubbleSort(arr1);
        assertArrayEquals(expectedArr1, arr1);
        System.out.println("Test 1......OK");

        // Test case 2: Empty array
        int[] arr2 = {};
        int[] expectedArr2 = {};
        bubblesort.bubbleSort(arr2);
        assertArrayEquals(expectedArr2, arr2);
        System.out.println("Test 2......OK");


        // Test case 3: Already sorted array
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] expectedArr3 = {1, 2, 3, 4, 5};
        bubblesort.bubbleSort(arr3);
        assertArrayEquals(expectedArr3, arr3);
        System.out.println("Test 3......OK");


        // Test case 4: Array with duplicate elements
        int[] arr4 = {5, 5, 4, 3, 3, 2, 1};
        int[] expectedArr4 = {1, 2, 3, 3, 4, 5, 5};
        bubblesort.bubbleSort(arr4);
        assertArrayEquals(expectedArr4, arr4);
        System.out.println("Test 4......OK");


        // Test case 5: Array with negative numbers
        int[] arr5 = {-5, 0, -3, 10, -2};
        int[] expectedArr5 = {-5, -3, -2, 0, 10};
        bubblesort.bubbleSort(arr5);
        assertArrayEquals(expectedArr5, arr5);
        System.out.println("Test 5......OK");

        // Test case 6: Array with all identical elements
        int[] arr6 = {7, 7, 7, 7, 7};
        int[] expectedArr6 = {7, 7, 7, 7, 7};
        bubblesort.bubbleSort(arr6);
        assertArrayEquals(expectedArr6, arr6);
        System.out.println("Test 6......OK");

        // Test case 7: Large array
        int[] arr7 = new int[10000];
        int[] expectedArr7 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr7[i] = 10000 - i;
            expectedArr7[i] = i + 1;
        }
        bubblesort.bubbleSort(arr7);
        assertArrayEquals(expectedArr7, arr7);
        System.out.println("Test 7......OK");
    }
}
