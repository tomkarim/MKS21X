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
        int position;
        int len = data.length;
        for (int i = 1; i < len; i++) {
            position = data[i];
            for (int j = 1; j >= 0; j--) {
                if (j == 0) {
                    data[0] = position;
                } else if (position < data[j - 1]) {
                    data[j] = data[j - 1];
                } else {
                    data[j] = position;
                    j = 0;
                }
            }
        }
    }






    public static void main(String[]test){
      int[] ary = new int[15];
      for(int i =0; i< ary.length; i++){
        ary[i] = (int)(Math.random()*100);
      }
      System.out.println(ary);
      ary.SelectionSort;
      System.out.println(ary);
    }
}
