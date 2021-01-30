package Example_6;

import java.util.Arrays;

/* 
The following code reverses an array. What is its runtime?
*/

public class Example {
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        // return array;
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6 };

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    /*
     * public static int[] reverse(int[] array) { for (int i = 0; i < array.length /
     * 2; i++) { int other = array.length - i - 1; int temp = array[i]; array[i] =
     * array[other]; array[other] = temp; } return array; }
     * 
     * public static void main(String[] args) {
     * 
     * int[] a = { 1, 2, 3, 4, 5, 6 };
     * 
     * Arrays.sort(a); System.out.println(Arrays.toString(a)); reverse(a);
     * System.out.println(Arrays.toString(a)); }
     */
}
