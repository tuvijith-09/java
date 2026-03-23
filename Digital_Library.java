abstract class LibraryItem {
    private String itemId;
    private String title;
    protected boolean isReserved;

    LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isReserved = false;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void showDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title);
    }

    abstract void processLoan();
}

class TextBook extends LibraryItem {
    TextBook(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    void processLoan() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Textbook '" + getTitle() + "' issued for 14 days.");
        } else {
            System.out.println("Error: '" + getTitle() + "' is already on loan.");
        }
    }
}

class ResearchPaper extends LibraryItem {
    ResearchPaper(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    void processLoan() {
        System.out.println("Generating secure PDF download link...");
    }
}

public class Digital_Library {
    public static void main(String[] args) {
        LibraryItem t1 = new TextBook("B101", "Java Core");
        t1.processLoan();
        t1.processLoan();

        LibraryItem r1 = new ResearchPaper("R99", "AI Ethics");
        r1.processLoan();
    }
}