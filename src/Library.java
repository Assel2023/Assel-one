public class Library {
    private int libraryId;
    private String librarianName;
    private String bookSection;
    private int totalBooks;

    public Library(int libraryId, String librarianName, String bookSection, int totalBooks) {
        this.libraryId = libraryId;
        this.librarianName = librarianName;
        this.bookSection = bookSection;
        this.totalBooks = totalBooks;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getBookSection() {
        return bookSection;
    }

    public void setBookSection(String bookSection) {
        this.bookSection = bookSection;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    public void libraryDetails() {
        System.out.println("Library ID: " + libraryId);
        System.out.println("Librarian Name: " + librarianName);
        System.out.println("Book Section: " + bookSection);
        System.out.println("Total Books: " + totalBooks);
    }

    public void searchBooks(String bookName) {
    }

    public void lendBooks(String bookName) {
    }

    public void returnBooks(String bookName) {

    }

    public void payFine(int fineAmount) {
    }
}