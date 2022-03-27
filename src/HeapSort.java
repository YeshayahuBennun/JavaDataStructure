public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random() * array.length);
        }

        System.out.println("Unsorted");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        //Heap Sort
        int length = array.length;

        for(int i = length / 2 - 1; i >= 0; i--){
            onHeap(array, length, i);
        }

        System.out.println("\n\nAlmost sorted");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        for(int j = length-1; j > 0; j--){
            int aux = array[0];
            array[0] = array[j];
            array[j] = aux;

            onHeap(array, j, 0);
        }

        System.out.println("\n\nSorted");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void onHeap(int[] array, int n, int i){
        int root = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && array[left] > array[root]){
            root = left;
        }
        if (right < n && array[right] > array[root]){
            root = right;
        }

        if (root != i){
            int aux = array[i];
            array[i] = array[root];
            array[root] = aux;

            onHeap(array, n, root);
        }
    }
}
