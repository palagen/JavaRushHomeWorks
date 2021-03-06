package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        int[] subArray = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < subArray.length; i++)
        {
            String result = scanner.nextLine();
            int num = Integer.parseInt(result);
            subArray[i] = num;
        }

        return subArray;
    }

    public static int max(int[] array) {

        Arrays.sort(array);

        return array[19];
    }
}
