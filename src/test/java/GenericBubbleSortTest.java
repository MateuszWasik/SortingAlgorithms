import Objects.Circle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericBubbleSortTest {

    private GenericBubbleSort genericBubbleSort = new GenericBubbleSort();
    private List<String> toBeSorted = new ArrayList<>();
    private List<String> empty = new ArrayList<>();
    private static int expectedArraySize = 6;


    private void generateRawList() {
        toBeSorted.add("Marcin");
        toBeSorted.add("Tadeusz");
        toBeSorted.add("Monika");
        toBeSorted.add("Adam");
        toBeSorted.add("Agnieszka");
        toBeSorted.add("Zbigniew");
    }

    private List<Circle> circleList = new ArrayList<>();

    private List<Circle> generate(){

        Random random = new Random();
        for(int i = 0; i < 10; i++){
            circleList.add(new Circle(random.nextInt(10)));
        }
        return circleList;
    }

    @Test
    public void shouldReturnSortedList() {
        generateRawList();
        assertThat(genericBubbleSort.sort(toBeSorted)).isSorted();
    }

    @Test
    public void ShouldNotHaveDuplicates() {
        generateRawList();
        assertThat(genericBubbleSort.sort(toBeSorted)).doesNotHaveDuplicates();
    }

    @Test
    public void shouldBeNullOrEmpty() {
        generateRawList();
        assertThat(genericBubbleSort.sort(empty)).isNullOrEmpty();
    }

    @Test
    public void shouldNotBeNull() {
        generateRawList();
        assertThat(genericBubbleSort.sort(toBeSorted)).isNotNull();
    }

    @Test
    public void shouldNotBeSmallerOrBigger() {
        generateRawList();
        assertThat(genericBubbleSort.sort(toBeSorted)).hasSize(expectedArraySize);
    }
}