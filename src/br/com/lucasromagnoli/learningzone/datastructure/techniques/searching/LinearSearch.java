package br.com.lucasromagnoli.learningzone.datastructure.techniques.searching;

/**
 * @author github.com/lucasromagnoli
 * @since 11/2020
 */
public class LinearSearch {
    public static Integer search(Integer[] array, Integer target) {
        System.out.printf("Trying to find %d:%n", target);
        int loops = 0;
        for (int index = 0; index < array.length; index++) {
            loops++;
            if (target.equals(array[index])) {
                System.out.println("Total of loops: "+loops);
                return index;
            }
        }

        System.out.println("Total of loops: "+loops);
        return -1;
    }
}
