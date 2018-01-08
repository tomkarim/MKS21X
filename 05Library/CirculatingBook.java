public class CirculatingBook extends LibraryBook{
    private String currentHolder, dueDate;

    public CirculatingBook(String author, String title, String ISBN, String callNumber) {
        super(author, title, ISBN, callNumber);
        returned();
    }

    public String getCurrentHolder() {
        return currentHolder;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setCurrentHolder(String currentHolder) {
        this.currentHolder = currentHolder;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void checkout(String patron, String due) {
        currentHolder = patron;
        dueDate = due;
    }

    public void returned() {
        currentHolder = "";
        dueDate = "";
    }

    public String circulationStatus() {
        if (currentHolder.equals("")) {
            return "Book available on shelves";
        }
        return "book checked out by: " + currentHolder + " until: " + dueDate;

    }

    public String toString() {
        if (currentHolder.equals("")) {
            return super.toString();
        }
        return super.toString() + circulationStatus();
    }
}


