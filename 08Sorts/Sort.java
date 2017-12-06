public class Sorts{
  public static String name(){
    return "09.Karim.Tahmedul";
  }
    public static void SelectionSort(int[] data){
        int min;
        for(int i = 0; i < data.length -1; i++){
            min = i;
            for(int j = i+1; j < data.length; j++){
                if(data[j] < data[min]){
                    min = j;
                }
            }
            int prev = data[i];
            data[i] = data[min];
            data[min] = prev;
        }
    }
}
