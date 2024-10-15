import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("The Great Gatsby", 1925, "F. Scott Fitzgenerald","9780743273565"));
        libraryItems.add(new Book("1984", 1949, "George Orwell", "9780451524935"));
        libraryItems.add(new Magazine("National Geographic", 2023, 745, "National Geographic Society"));
        libraryItems.add(new Magazine("TIME", 2023, 312, "Time USA, LLC"));
        for (LibraryItem item : libraryItems) {
            item.getDetails();
        }
    }
    }
