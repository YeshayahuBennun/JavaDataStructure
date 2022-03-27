import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
            System.out.println(array[i] + " ");
        }

        int count = 0;
        boolean found = false;
        int start = 0;
        int end = array.length - 1;
        int middle;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int seeker = sc.nextInt();


        while (start <= end) {
            middle = ((start + end) / 2);
            count++;// How many test does the search.
            if (array[middle] == seeker) {
                found = true;
                break;
            } else if (array[middle] < seeker) {
                start = middle + 1;
            } else {//For sure is less
                end = middle - 1;

            }
        }
        System.out.println("Total tests: " + count);
        if (found) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }
    }
}
