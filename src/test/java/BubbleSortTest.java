import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();
    private int[] givenRawIntegerArray = {7, 6, 5, 8, 9, 1, 2, 4, 3};
    private int[] emptyArray = {};


    @Test
    public void shouldReturnSortedArrayOfNumbers() {
        assertThat(bubbleSort.bubbleSortAlgorithm(givenRawIntegerArray)).isSorted();
    }

    @Test
    public void shouldReturnNullWhenArrayLengthIsZero() {
        assertThat(bubbleSort.bubbleSortAlgorithm(emptyArray)).isNullOrEmpty();
    }

    @Test
    public void shouldNotHaveDoubledNumbers() {
        assertThat(bubbleSort.bubbleSortAlgorithm(givenRawIntegerArray)).doesNotHaveDuplicates();
    }

    @Test
    public void shouldNotBeNull() {
        assertThat(bubbleSort.bubbleSortAlgorithm(givenRawIntegerArray)).isNotNull();
    }
}