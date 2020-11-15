package br.com.lucasromagnoli.learningzone.datastructure.techniques.searching;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author github.com/lucasromagnoli
 * @since 11/2020
 */
public class SearchInitializr {
    private static Integer[] integerLinearArray = new Integer[100000];

    static {
        // Populate every array position with your index value
        for (int index = 0; index < integerLinearArray.length; index++) {
            integerLinearArray[index] = index;
        }
    }

    public static void main(String[] args) {
        Integer target = null;
        SearchOptionsEnum searchOption = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tip the number to be found on array. Remember, the array starts with 0 and ends with 99999");
        while (target == null) {
            try {
                target = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please, tip a valid number.");
                // Cleaning the buffer
                scanner.nextLine();
            }
        }

        System.out.println("Tip the search option. [0] = LinearSerach | [1] = BinarySearch");
        while (searchOption == null) {
            try {
                searchOption = SearchOptionsEnum.parse(scanner.nextInt());
            } catch (RuntimeException e) {
                System.out.println("Please, tip a valid option.");
                // Cleaning the buffer
                scanner.nextLine();
            }
        }
        int search = searchOption.equals(SearchOptionsEnum.LINEAR)
                ? LinearSearch.search(integerLinearArray, target)
                : BinarySearch.search(integerLinearArray, target);
        if (search == -1) {
            System.out.printf("Number %d not found.%n", target);
        } else {
            System.out.printf("Number %d founded in index %d.%n", target, search);
        }
    }

}
