public class Journal {
    private String journalName;
    private int journalNumber;
    private String journalEntry;

    public Journal(String journalName, int journalNumber) {
        this.journalName = journalName;
        this.journalNumber = journalNumber;
    }
    public String getJournalName() {
        return journalName;
    }
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }
    public int getJournalNumber() {
        return journalNumber;
    }
    public void setJournalNumber(int journalNumber) {
        this.journalNumber = journalNumber;
    }
    public void journalInformation(){
        System.out.println("Journal name : " + " " +getJournalName() + " , " +"Journal number : " + " " +getJournalNumber());
    }
}
