
public class BubbleSort {

    private boolean ifSorted;
    private int[] sortedArray;


    private boolean checkIfArrayWasSorted(boolean ifChanged) {
        return ifChanged;
    }

    private int[] copySourceArrayToSortedArray(int[] notSortedArray) {

        for (int i = 0; i < notSortedArray.length; i++) {
            sortedArray[i] = notSortedArray[i];
        }
        return sortedArray;
    }

    public int[] bubbleSortAlgorithm(int[] notSortedArray) {

        if (notSortedArray.length == 0) {
            return null;
        }

        sortedArray = new int[notSortedArray.length];

        for (int i = 0; i < notSortedArray.length - 1; i++) {
            int temporaryValueKeeper;

            ifSorted = false;
            for (int j = 0; j < notSortedArray.length - 1; j++) {

                if (notSortedArray[j] > notSortedArray[j + 1]) {
                    temporaryValueKeeper = notSortedArray[j];
                    notSortedArray[j] = notSortedArray[j + 1];
                    notSortedArray[j + 1] = temporaryValueKeeper;
                    ifSorted = true;
                }
            }
        }

        if (checkIfArrayWasSorted(!ifSorted)) {
            copySourceArrayToSortedArray(notSortedArray);
        }

        return sortedArray;
    }
}
