import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort quickSort = new QuickSort();
    private int[] givenRawIntegerArray = {7, 6, 5, 8, 9, 1, 2, 4, 3};
    private int[] expectedBubbleSortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] emptyArray = {};


    @Test
    public void shouldReturnQuickSortedArray() {

    assertThat(quickSort.quickSortAlgorithm(givenRawIntegerArray), is(expectedBubbleSortedArray));


    }


}