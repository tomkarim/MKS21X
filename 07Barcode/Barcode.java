import java.lang.Integer;
import java.util.ArrayList;

public class Barcode implements Comparable<Barcode>{
    private String zip;
    private String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

    public Barcode(String z){
        if(z.length() != 5){
            throw new IllegalArgumentException("Code must only be 5 characaters long!");
        } try{
            Integer.parseInt(z);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Code should only contain digits!");
        }
        zip = z;
    }

    static private ArrayList<String> x = new ArrayList<String>();

    private void add(String[] codes){
        for (int i = 0; i <codes.length; i++){
            x.add(codes[i]);
        }
    }

    public int compareTo(Barcode other){
        int a = Integer.parseInt(zip + checkSum(zip));
        int b = Integer.parseInt(other.zip + checkSum(other.zip));
        if (a > b) {
            return 1;
        }
        if (a < b) {
            return -1;
        } else{
            return 0;
        }
    }

    public static int checkSum(String z){
        int sum = 0;
        int temp = Integer.parseInt(z);
        int i =1;
        while(i<5){
            sum += (temp % 10 ^ i);
            i++;
        }
        return sum % 10;
    }

    public static String toCode(String z){
        String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
        String s = "|";
        String z1 = z + checkSum(z);
        if(z.length() != 5){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < z1.length(); i++){
            char e = z1.charAt(i);
            s += codes[Integer.parseInt("" + e)];
        }
        s += "|";
        return s;

    }

    public String toZip(String code){
        add(codes);
        String s = "";
        if((code.charAt(0) != '|'|| code.length() != 32) || code.charAt(31) != '|'){
            throw new IllegalArgumentException();
        }
        for (int i = 1; i < 27; i +=5){
            int sizeBefore = s.length();
            for (int e = 0; e < x.size() ; e ++){
                if (code.substring(i, i + 5).equals(x.get(e))){
                    s += e;
                }
            }
            if (sizeBefore == s.length()){
                throw new IllegalArgumentException();
            }
        }
        if (checkSum(s.substring(0,6)) != (Integer.parseInt(s) % 10)){
            throw new IllegalArgumentException();
        }
        return s.substring(0,5);
    }

    public String toString(){
        return toCode(zip) + " (" + zip + ")";
    }

    public String getCode(){
        return toCode(zip);
    }

    public String getZip() {
        return zip;
    }
}
