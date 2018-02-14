import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class QuickSortTest {

    QuickSort quickSort = new QuickSort();
    private int[] givenRawIntegerArray = {7, 6, 5, 8, 9, 1, 2, 4, 3};
    private int[] emptyArray = {};
    private int[] expectedValuesInSortedArray = {1, 2, 4, 5, 6, 8 ,9};


    @Test
    public void shouldReturnQuickSortedArray() {
        assertThat(quickSort.quickSortAlgorithm(givenRawIntegerArray,0,8)).isSorted();
    }

    @Test
    public void shouldContainsNumbersFromArray(){
        assertThat(quickSort.quickSortAlgorithm(givenRawIntegerArray,1,7)).contains(expectedValuesInSortedArray);
    }

    @Test
    public void shouldReturnNullWhenArrayIsEmpty(){
        assertThat(quickSort.quickSortAlgorithm(emptyArray,0,0)).isNullOrEmpty();
    }

    @Test
    public void shouldNotHaveDoubledNumbers(){
        assertThat(quickSort.quickSortAlgorithm(givenRawIntegerArray,0,8)).doesNotHaveDuplicates();
    }

    @Test
    public void shouldNotBeNull(){
        assertThat(quickSort.quickSortAlgorithm(givenRawIntegerArray,0,8)).isNotNull();
    }

}