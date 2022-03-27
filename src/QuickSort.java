
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) Math.floor(Math.random() * array.length);
        }

        System.out.println("Unsorted");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

        quickSort(array, 0, array.length-1);

        System.out.println("\n\nSorted");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }

    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int p = partition(array, left, right);
            quickSort(array, left, p);
            quickSort(array, p + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int middle = (left + right) / 2;
        int pivot = array[middle];
        int i = left - 1;
        int j = right + 1;

        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);

            if (i >= j) {
                return j;
            }

            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }
    }
}
