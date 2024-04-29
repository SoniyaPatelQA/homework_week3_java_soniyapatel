package homeworkWeek3;
/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;
public class Programme17SortNumericAndStringArray {

    public static void main(String[] args) {

        //declare numeric array
        int num[] = {99, 21, 45, 75, 56};
        System.out.println("Numeric Array before sorting: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Numeric Array after sorting: " + Arrays.toString(num));

        //declare string array
        String fruitsName[] = {"Grapes", "Apple", "Kiwi", "Orange", "Blueberry"};
        System.out.println("String Array before sorting: " + Arrays.toString(fruitsName));
        Arrays.sort(fruitsName);
        System.out.println("String Array before sorting: " + Arrays.toString(fruitsName));

    }
}
