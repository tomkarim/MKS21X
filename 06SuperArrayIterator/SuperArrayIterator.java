import.java.util.*;

public class SuperArrayIterator implements Iterator<String>{
    int index = 0;
    SuperArray array;

    public SuperArrayIterator(SuperArray array){
        this.array = array;
    }

    public boolean hasNext(){
        return index < array.size();
    }

    public String next(){
        if(hasNext()){
            return array.get(index++);
        }else{
            throw new NoSuchElementException();
        }
    }

}