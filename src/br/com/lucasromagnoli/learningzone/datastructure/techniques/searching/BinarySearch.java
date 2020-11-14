package br.com.lucasromagnoli.learningzone.datastructure.techniques.searching;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author github.com/lucasromagnoli
 * @since 11/2020
 */
public class BinarySearch {
    public static Integer search(Integer[] array, Integer target) {
        System.out.printf("Trying to find %d:%n", target);
        int left = 0;
        int right = array.length - 1;
        int loops = 0;
        while (left <= right) {
            loops++;
            int mid = (int) Math.floor((left + right) / 2);
            int midValue = array[mid];
            System.out.printf("left: %d | right: %d | mid: %d%n", left, right, mid);
            if (midValue == target) {
                System.out.println("Total of loops: "+loops);
                return midValue;
            } else if (target < midValue) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[100000];
        // Populate every array position with your index value
        for (int index = 0; index < array.length; index++) {
            array[index] = index;
        }
        Integer target = null;
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
        int search = search(array, target);
        if (search == -1) {
            System.out.printf("Number %d not found.%n", target);
        } else {
            System.out.printf("Number %d founded in index %d.%n", target, search);
        }
    }
}
