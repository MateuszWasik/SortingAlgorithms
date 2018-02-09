import java.util.Random;

public class RandomNumbersGenerator {

    private int maxRange = 20;
    private int[] arrayWithRandomNumbers;

    public int[] generator(int arraySize) {

        createArrayWithProperSize(arraySize);

        Random generateRandom = new Random();

        for (int i = 0; i < arraySize; i++) {
            arrayWithRandomNumbers[i] = generateRandom.nextInt(maxRange);
        }
        return arrayWithRandomNumbers;
    }

    private int[] createArrayWithProperSize(int arraySize) {

        if (arraySize != 0) {
            return arrayWithRandomNumbers = new int[arraySize];
        }
        return null;
    }


}
