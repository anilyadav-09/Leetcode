package org.example;
import java.util.*;
/*Given an array of positive integers arr[], return the second-largest element from the array. If the second-largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.

Examples:
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second-largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second-largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second-largest element does not exist.*/

public class FindSecondHighestNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 10, 10, 10);

        List<Integer> sortedList = list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println("Sorted list in reverse order (distinct): " + sortedList);
        // Step 2: Check if second-largest exists
        if (sortedList.size() < 2) {
            int largest = sortedList.isEmpty() ? -1 : sortedList.get(0);
            System.out.println("The largest element of the array is " + largest +
                    ", and the second-largest element does not exist.");
            return;
        }


        // Step 3: Extract second-largest
        int secondHighestNo = sortedList.get(1);
        System.out.println("Second-highest Number is " + secondHighestNo);
    }
}