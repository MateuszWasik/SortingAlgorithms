import java.util.List;

public class GenericBubbleSort<T extends String> {

    public List<T> sort(List<T> listToSort) {

        if (listToSort.isEmpty()) {
            return null;
        }

        for (int i = 0; i < listToSort.size() - 1; i++) {

            boolean ifSorted = false;

            for (int j = 0; j < listToSort.size() - 1; j++) {
                T temporaryValueKeeper;

                if (listToSort.get(j).compareToIgnoreCase(listToSort.get(j + 1)) > 0) {
                    temporaryValueKeeper = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j + 1));
                    listToSort.set(j + 1, temporaryValueKeeper);
                    ifSorted = true;
                }
            }
        }
        return listToSort;
    }
}
