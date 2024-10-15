public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publisher;
    public Magazine(String title, int yearPublished, int issueNumber, String publisher) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void getDetails(){
        System.out.println("Magazine - Title: " + title + "Publisher: " + publisher + ", year Published: " +yearPublished + ", Issue Number: " +issueNumber);
    }
}
