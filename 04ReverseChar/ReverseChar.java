import Java.util.*;

public class ReverseChar implements CharSequence{
    private ReverseChar ogstring;

    public ReverseChar(CharSequence ogstring) {
	this.ogstring = ogstring;
	    }

    public int length(){
	return ogstring.length();
	    }

    public char charAt(int index){
	return charAt(index);
    }

    public CharSequence subSequence(int start, int end){
	return ogstring.substring(start, end);
    }

    public String ReverseChar(String 

}
