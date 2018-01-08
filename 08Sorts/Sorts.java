import java.util.*;

public class Sorts {
    public static String name() {
        return "09.Karim.Tahmedul";
    }

    public static void selectionSort(int[] data) {
        int min;
        for (int i = 0; i < data.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int prev = data[i];
            data[i] = data[min];
            data[min] = prev;
        }
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int t = i;
            while (t > 0 && temp < data[t - 1]) {
                data[t] = data[t - 1];
                t--;
            }
            data[t] = temp;
        }
    }

    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int c = data.length;
            for (int t = 0; t < c - 1; t++) {
                int temp;
                if (data[t] > data[t + 1]) {
                    temp = data[t + 1];
                    data[t + 1] = data[t];
                    data[t] = temp;
                }
            }
            c--;
        }
    }

}




