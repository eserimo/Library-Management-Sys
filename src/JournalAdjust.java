import java.awt.print.Book;
import java.util.ArrayList;

public class JournalAdjust implements itfJournalAdjust {
    ArrayList<Journal> journals = new ArrayList<Journal>();
    public void addJournal(Journal journal){journals.add(journal);}
    public void deleteJournal(int journalNumber){journals.remove(journalNumber-1);}

    @Override
    public void controlJournals(Integer imp) {
        for (Journal journal: journals) {
            if (journal.getJournalNumber() ==imp) {
                System.out.println("Journal name :"  + "  " +journal.getJournalName()+ "  " + "Journal number :" +journal.getJournalNumber());
                return;
            }
        }
        System.out.println("Specified journal not found. ");
    }


    @Override
    public void countJournal() {
        System.out.println("The number of journals :"+journals.size());
    }
    public void showJournals(){
        if(journals.isEmpty()){
            System.out.println("There is no journal. ");
        }
        else
            for(Journal j:journals){
                j.journalInformation();
            }
    }
}



