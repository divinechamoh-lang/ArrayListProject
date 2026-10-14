import java.util.Comparator;
import java.util.List;

/**
 * SelectionSort.java
 * Divine Chamoh
 * Selection sort written from scratch (no Java collections sort method).
 * Works on any List and orders it with the Comparator that is passed in.
 */
public class SelectionSort {

    /**
     * Sorts the list in place. On each pass, finds the smallest element
     * in the unsorted part and swaps it into the next position.
     */
    public static <T> void sort(List<T> list, Comparator<? super T> comparator) {
        for (int start = 0; start < list.size() - 1; start++) {
            int smallest = start;
            for (int i = start + 1; i < list.size(); i++) {
                if (comparator.compare(list.get(i), list.get(smallest)) < 0) {
                    smallest = i;
                }
            }
            swap(list, start, smallest);
        }
    }

    private static <T> void swap(List<T> list, int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
