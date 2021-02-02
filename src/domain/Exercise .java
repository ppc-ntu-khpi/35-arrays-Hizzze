package domain;

import java.util.Arrays;

/**
 * Клас що являє собою завдання
 * @author Vlad
 */
public class Exercise {
    
    /**
     * Знаходить другий по велечині елемент у масиві
     * @param arr вхідний масив
     * @return друге за велечиною число
     */
    public static int Calculate(int[] arr) {
        
        if (arr.length < 2) {
            return arr[0];
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
        
        return arr[1];
}
    
}
