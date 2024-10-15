public class LibraryItem {
    protected String title;
    protected int yearPublished;
    public LibraryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
    }
    public String getTitle() {
        return title;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void getDetails(){
        System.out.println("Title: " + title + " Year Published: " + yearPublished);
    }
}
