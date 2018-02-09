import org.junit.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();
    private int[] givenRawIntegerArray = {7, 6, 5, 8, 9, 1, 2, 4, 3};
    private int[] expectedBubbleSortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] emptyArray = {};


    @Test
    public void shouldReturnSortedArrayOfNumbers() {
        assertThat(bubbleSort.bubbleSortAlgorithm(givenRawIntegerArray), is(expectedBubbleSortedArray));
    }

    @Test
    public void shouldReturnNullWhenArrayLengthIsZero(){
        assertThat(bubbleSort.bubbleSortAlgorithm(emptyArray), is(nullValue()));
    }
}