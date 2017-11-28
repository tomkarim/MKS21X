abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    
    private String callNumber;

    public LibraryBook(String author, String title, String ISBN, String callNumber){
	setAuthor(author);
	setTitle(title);
	setISBN(ISBN);
	setCallNumber(callNumber);
    }

    public String getCallNumber(){
	return callNumber;
    }
