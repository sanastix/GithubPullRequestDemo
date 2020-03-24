package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {

    /*
    1) сделать fork
    2) Попрактиковаться со StreamApi и послать PullRequest
    3) Создать ISSUE в этом репозитории когда отправить пулл реквест
     */

    public static void main(String[] args) {

        averageNumber();
        sortedSquares();

    }

    private static void averageNumber() {
        // Заполнить массив из 10 элементов целыми числами.
        // Вывести среднее арифметическое.

        List<Integer> collection = Arrays.asList(25,46,85,74,16,89,13,78,94,12);
        OptionalDouble averageNumber = collection.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average();
        System.out.println(averageNumber);
    }

    private static void sortedSquares() {
        //Входящий параметр: отсортированный массив типа int который содержит отрицательные и положительные значения.
        //Вернуть отсортированный массив который состоит из квадратов значений.

        List<Integer> collection = Arrays.asList(2,6,45,-4,0,9,11,-23,-8);
        int[] arr = collection.stream().mapToInt((i) -> (int) Math.pow(i,2)).sorted().toArray();
        System.out.println(Arrays.toString(arr));
    }

}
