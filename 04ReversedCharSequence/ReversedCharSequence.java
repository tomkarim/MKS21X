import java.util.*;

public class ReversedCharSequence implements CharSequence{

    private String data;

    public ReversedCharSequence(String s) {
        data = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            data += s.charAt(i);
        }
    }

    public int length() {
        return data.length();
    }

    public char charAt(int index){
        return charAt(index);
    }

    public CharSequence subSequence(int start, int end){
        return data.substring(start, end);
    }

    public String toString(){
        return data;
    }

}
