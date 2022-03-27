public class Recursion {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * array.length);
        }

        System.out.println("Array");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }


        System.out.println("Total array sum is: " + arraySum(0, 0, array));
    }

    private static int arraySum(int sum, int position, int[] array) {

        if (position < array.length) {
            sum += array[position];
            return arraySum(sum, position + 1, array);
        } else {
            return sum;
        }

    }


}
