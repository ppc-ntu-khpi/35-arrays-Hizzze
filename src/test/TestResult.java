package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] arr = {128, 1241, 123, 4142};
        System.out.printf("Друге за величиною число у заданому масив: %d",
                Exercise.Calculate(arr));      
    }
}
