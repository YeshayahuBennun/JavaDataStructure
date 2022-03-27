public class QuickSortString {
    public static void main(String[] args) {
        char[] word = {'e', 'd', 'c', 'b', 'a'};

        System.out.println("Unsorted");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i] + " ");
        }

        quickSort(word, 0, word.length - 1);

        System.out.println("\n\nSorted");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i] + " ");
        }

    }

    private static void quickSort(char[] array, int left, int right) {
        if (left < right) {
            int p = partition(array, left, right);
            quickSort(array, left, p);
            quickSort(array, p + 1, right);
        }
    }

    private static int partition(char[] array, int left, int right) {
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

            char aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }
    }
}
