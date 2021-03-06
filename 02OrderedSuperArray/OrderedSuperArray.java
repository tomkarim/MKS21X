public class OrderedSuperArray extends SuperArray {

 public OrderedSuperArray() {
  super();
 }

 public OrderedSuperArray(int startingCapacity) {
  super(startingCapacity);
 }

 public OrderedSuperArray (String[] ary) {
   super(ary.length);
   for (int i = 0; i < ary.length; i++) {
     add(ary[i]);
   }
 }

 public String set(int index, String value) {
  throw new UnsupportedOperationException("Use the string version of the add function!");
 }

 public void add(int index, String value) {
  add(value);
 }

 private int findIndex (String value) {
   for (int i = 0; i < size(); i++) {
       if (value.compareTo(get(i)) < 0)
           return i;
   }
   return size();
 }

 private int findIndexBinary(String value){
     int start = 0;
     int end = size();
     while(size() != 0 && end != start){
         if(get(start + ((end - start)/2)).compareTo(value) < 0){
             if(end - start > 1){
                 start += ((end - start) / 2);
             } else{
                 start += 1;
             }
         } else{
             if(end - start > 1) {
                 end = end - ((end - start) / 2);
             } else{
                 end--;
             }
         }
     }
     return end;
 }

 public boolean add(String value) {
   super.add(findIndexBinary(value), value);
   return true;
   }
 }

