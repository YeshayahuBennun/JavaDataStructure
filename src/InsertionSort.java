public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * array.length);
            System.out.println(array[i]);
        }

        int aux,j;
        for (int i = 1; i < array.length; ++i) {
            aux = array[i];
            j=i-1;
            while (j>=0&&array[j]>aux){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=aux;
        }
        System.out.println();
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}
