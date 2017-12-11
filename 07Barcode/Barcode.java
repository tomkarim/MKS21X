public class Barcode implements Comparable<Barcode>{
    private String zip;
    String[] codes = {"||:::",":::||","::|:|";"::||:",""}

    public Barcode(String zip){
        if(zip.length() != 5){
            throw new IllegalArgumentException("Code must only be 5 characaters long!");
        }
        if(!isInteger(zip)){
            throw new IllegalArgumentException("Code should only contain digits!");
        }
    }

    public String toString(){
    return   }

    public int compareTo(Barcode other){
      return Integer.parseInt(zip) - Integer.parseInt(other.zip);
    }

    public static String toCode(String zip){
      if(zip.length() != 5){
          throw new IllegalArgumentException("Code must only be 5 characaters long!");
      }
      if(!isInteger(zip)){
          throw new IllegalArgumentException("Code should only contain digits!");
      }
      String complete = zip +checkSum(zip);
      int len = complete.length();

    }

    public String toZip(String Code){

    }

    public String getCode(){
        return code;
    }

    public String getZip() {
        return zip;
    }
}
