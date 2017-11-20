public class OrderedSuperArray extends SuperArray {

 public OrderedSuperArray() {
  super();
 }

 public OrderedSuperArray(int size) {
  super(size);
 }

 public OrderedSuperArray (String[] data) {
   super(data.length);
   for (int i = 0; i < data.length; i++) {
     add(data[i]);
   }
 }

 public void set(int index, String element) {
  throw new UnsupportedOperationException("Use the string version of the add function!");
 }

 public void add(int index, String element) {
  add(element);
 }

 private int location (String element) {
   for (int i = 0; i < super.data.length; i++) {
     if (i == super.size() - 1) return i;
     if (super.data[i].compareTo(element) < 0) return i;
   }
 }

 public void add(String element) {
   if (super.size == 0) {
     super.add(element);
 } else {
     int location = location(element);
     super.add(location, element);
   }
 }
}
