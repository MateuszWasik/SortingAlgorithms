import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbersGenerator {


    private int arraySize;

    public ArrayList<Integer> generator(int minRange, int maxRange){

        int randomNum = ThreadLocalRandom.current().nextInt(minRange,maxRange + 1);


        return null;
    }


}
