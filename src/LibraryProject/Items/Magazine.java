package LibraryProject;

public class Magazine extends LibraryItem implements PaperItem, BorrowableItem{
    long issueNumber;
    long issuer;
    public Magazine(int id, String name, boolean isAvailable, long issueNumber, long issuer){
        super(id, name, isAvailable);
        this.issueNumber = issueNumber;
        this.issuer = issuer;
    }

    public long getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(long issueNumber) {
        this.issueNumber = issueNumber;
    }

    public long getIssuer() {
        return issuer;
    }

    public void setIssuer(long issuer) {
        this.issuer = issuer;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[Magazine: %s, %s]", name, issuer);
    }

    @Override
    public void borrow() {
        
    }
}
