public class Main {




    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        RandomNumbersGenerator randomNumbersGenerator = new RandomNumbersGenerator();

       bubbleSort.bubbleSortAlgorithm(randomNumbersGenerator.generator(20));

    }


}
