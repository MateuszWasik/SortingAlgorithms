import java.util.List;

public class GenericBubbleSort<T extends String> {

    private boolean isNextElementBigger(T firstElement, T secondElement){
        return firstElement.compareTo(secondElement) > 0;
    }

    public List<T> sort(List<T> listToSort) {

        if (listToSort.isEmpty()) {
            return null;
        }

        for (int i = 0; i < listToSort.size() - 1; i++) {

            for (int j = 0; j < listToSort.size() - 1; j++) {
                T temporaryValueKeeper;
                T element = listToSort.get(j);
                T nextElement = listToSort.get(j+1);

                if (isNextElementBigger(element, nextElement)) {
                    temporaryValueKeeper = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j + 1));
                    listToSort.set(j + 1, temporaryValueKeeper);
                }
            }
        }
        return listToSort;
    }
}
