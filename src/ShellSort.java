public class ShellSort {
    public static void main(String[] args) {
        int[] array = new int[1000];

        System.out.println("Unsorted");
        for(int i=0; i < array.length; i++){
            array[i] = (int) (Math.random() * array.length);
            System.out.print(array[i]+" ");
        }

        int h = 1;
        int n = array.length;
        while(h < n){
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);

        int element, j;
        while(h > 0){
            for(int i = h; i < n; i++){
                element = array[i];
                j = i;
                while(j >= h && array[j - h] > element){
                    array[j] = array[j - h];
                    j = j - h;
                }
                array[j] = element;
            }
            h = h / 2;
        }

        System.out.println("\n\nSorted");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
