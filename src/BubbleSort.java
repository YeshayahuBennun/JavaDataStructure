public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * array.length);
            //System.out.print(array[i]);
        }

        long start = System.currentTimeMillis();
        long end;

        //Bubble Sort O(n^2)
        int aux;
        for (int i = 0; i < array.length; ++i) {//O(n)
            for (int j = i + 1; j < array.length; ++j) {//O(n-1) = O(n^2)
                if (array[i] > array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Time: "+(end-start));
        // System.out.println();
        // for (int i = 0; i < array.length; ++i) {
        //     System.out.print(array[i]);
        // }
    }
}
