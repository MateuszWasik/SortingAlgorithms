public class QuickSort {

    private int temporaryValueKeeper;

    private boolean checkIfNotEmpty(int[] toBeSorted) {

        return toBeSorted.length != 0;
    }

    private int partition(int[] toBeSorted, int leftIndex, int rightIndex) {

        int pivot = toBeSorted[(leftIndex + rightIndex) / 2];

        while (leftIndex <= rightIndex) {
            while (toBeSorted[leftIndex] < pivot)
                leftIndex++;
            while (toBeSorted[rightIndex] > pivot)
                rightIndex--;
            if (leftIndex <= rightIndex) {
                temporaryValueKeeper = toBeSorted[leftIndex];
                toBeSorted[leftIndex] = toBeSorted[rightIndex];
                toBeSorted[rightIndex] = temporaryValueKeeper;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public int[] quickSortAlgorithm(int[] toBeSorted, int leftIndex, int rightIndex) {

        if (checkIfNotEmpty(toBeSorted)) {

            int index = partition(toBeSorted, leftIndex, rightIndex);

            if (leftIndex < index - 1) {
                quickSortAlgorithm(toBeSorted, leftIndex, index - 1);
            }
            if (index < rightIndex) {
                quickSortAlgorithm(toBeSorted, index, rightIndex);
            }

            return toBeSorted;

        } else
            return null;
    }
}
