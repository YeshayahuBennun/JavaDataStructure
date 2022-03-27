public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * array.length);
        }

        System.out.println("Unsorted");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }

        //Selection Sort O(n^2)
        int minorPosition, aux;
        for (int i = 0; i < array.length; ++i) {
            minorPosition = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[minorPosition]) {
                    minorPosition = j;
                }
            }
            aux = array[minorPosition];
            array[minorPosition] = array[i];
            array[i] = aux;
        }
        System.out.println("\n\nSorted");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }

    }
}
