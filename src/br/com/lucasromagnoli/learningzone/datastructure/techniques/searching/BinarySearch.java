package br.com.lucasromagnoli.learningzone.datastructure.techniques.searching;

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

        System.out.println("Total of loops: "+loops);
        return -1;
    }
}
