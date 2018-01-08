import java.util.*;

public class SuperArrayIterator implements Iterator<String>{
    private int current;
    private SuperArray data;

    public SuperArrayIterator(SuperArray array){
        data = array;
        current = 0;
    }

    public boolean hasNext(){
        return current <= data.size();
    }

    public String next(){
        if(hasNext()){
            current++;
        }else{
            System.exit(0);
        }
        return data.get(current - 1);
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

}