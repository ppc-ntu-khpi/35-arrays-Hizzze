package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] arr = {128, 1241, 123, 4142};
        System.out.printf("The second largest in a given array: %d",
                Exercise.Calculate(arr));      
    }
}
