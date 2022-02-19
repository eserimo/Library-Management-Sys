import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MagazineAdjust magazineAdjust = new MagazineAdjust();
        JournalAdjust journalAdjust = new JournalAdjust();
        BookAdjust bookAdjust = new BookAdjust();
        UserAdjust userAdjust = new UserAdjust();
        AdminAdjust adminAdjust = new AdminAdjust();

        Book book = new Book("Bülbülü Öldürmek", 1);
        Book book1 = new Book("Kaşağı", 2);
        Book book2 = new Book("Oyun", 3);
        Book book3 = new Book("Sefiller", 4);
        bookAdjust.addBook(book);
        bookAdjust.addBook(book1);
        bookAdjust.addBook(book2);
        bookAdjust.addBook(book3);

        Journal journal = new Journal("Animals", 1);
        Journal journal1 = new Journal("Cars", 2);
        Journal journal2 = new Journal("History", 3);
        Journal journal3 = new Journal("Space", 4);
        journalAdjust.addJournal(journal);
        journalAdjust.addJournal(journal1);
        journalAdjust.addJournal(journal2);
        journalAdjust.addJournal(journal3);

        Magazine magazine = new Magazine("GQ", 1);
        Magazine magazine1 = new Magazine("Football World", 2);
        Magazine magazine2 = new Magazine("Space and Time", 3);
        Magazine magazine3 = new Magazine("Fashion World", 4);
        magazineAdjust.addMagazine(magazine);
        magazineAdjust.addMagazine(magazine1);
        magazineAdjust.addMagazine(magazine2);
        magazineAdjust.addMagazine(magazine3);

        User user = new User(142,"Samet","Akbaş", 4580);
        User user1 = new User(107,"Neriman","Atak", 5723);
        User user2 = new User(108,"Kaan","Öngen", 7711);
        userAdjust.addUser(user);
        userAdjust.addUser(user1);
        userAdjust.addUser(user2);
        Admin admin = new Admin(89, "Fehmi", "Yılmaz",5656);
        Admin admin1 = new Admin(78, "Mehmet", "Öztürk",8889);
        adminAdjust.addAdmin(admin);
        adminAdjust.addAdmin(admin1);
        while(true){
        System.out.println("------ WELCOME TO THE LIBRARY MANAGEMENT SYSTEM ! ------");
        System.out.println(" **PLEASE SELECT 1 IF YOU HAVE AN ACCOUNT**"+"  "+ " "+
                "**PLEASE SELECT 2 TO REGISTER**");
        int number = input.nextInt();
        if (number == 1) {

            System.out.println("Please enter your ID number. ");
            int ID = input.nextInt();
            System.out.println("Please enter your password. ");
            int pw1= input.nextInt();





            if (adminAdjust.controlAdmin(ID, pw1)) {

                System.out.println("You are logged into the library system as an administrator. ");
                while (true) {
                    System.out.println("------------------------------");
                    System.out.println(" Please Enter 1 for Content Editing\n Please Enter 2 for Information Inquiry\n Please Enter 3 for User Editing \n Please Enter 4 for Quit ");
                    System.out.println("------------------------------");
                    int operation = input.nextInt();
                    switch (operation) {
                        case 1:
                            System.out.println("Please select which content you want to edit, 1-Book Editing, 2-Journals Editing, 3-Magazine Editing");

                            int editNum = input.nextInt();
                            if (editNum == 1) {


                                System.out.println("Please select the action you want to do about the books. Select 1 for add book, select 2 for delete book, select 3 for view all books.");
                                int choice = input.nextInt();

                                if (choice == 1) {


                                    Scanner cevap = new Scanner(System.in);
                                    System.out.println("Please enter the name of the book you want add. ");
                                    String bookName = cevap.nextLine();
                                    System.out.println("Please enter the number of the book you want add. ");
                                    int bookNumber = input.nextInt();

                                    Book book9 = new Book(bookName, bookNumber);
                                    bookAdjust.addBook(book9);


                                    System.out.println("You have successfully add the book to the book list :");
                                    bookAdjust.showBooks();


                                } else if (choice == 2) {

                                    bookAdjust.showBooks();
                                    System.out.println("Please enter the number of the book you want delete. ");
                                    Scanner del = new Scanner(System.in);
                                    int assignednumber = del.nextInt();

                                    bookAdjust.deleteBook(assignednumber);
                                    System.out.println("You have successfully delete the book you choice." + " " + "Updated book list:");
                                    bookAdjust.showBooks();
                                } else if (choice == 3) {


                                    bookAdjust.showBooks();
                                }


                            } else if (editNum == 2) {


                                System.out.println("Please select the action you want to do about the journals. Please select 1 for add journal, select 2 for delete journal, select 3 for view all journals. ");
                                int choice = input.nextInt();
                                if (choice == 1) {

                                    Scanner answer = new Scanner(System.in);
                                    System.out.println("Please enter the name of the journal you want add. ");
                                    String journalName = answer.nextLine();
                                    System.out.println("Please enter the number of the journal you want add. ");
                                    int journalNumber = input.nextInt();
                                    Journal journal8 = new Journal(journalName, journalNumber);

                                    journalAdjust.addJournal(journal8);


                                    System.out.println("You have successfully add the journal to the journal list :");
                                    journalAdjust.showJournals();
                                } else if (choice == 2) {

                                    journalAdjust.showJournals();
                                    System.out.println("Please enter the number of the journal you want delete. ");
                                    Scanner del = new Scanner(System.in);
                                    int assignednumber = del.nextInt();

                                    journalAdjust.deleteJournal(assignednumber);
                                    System.out.println("You have successfully delete the journal you choice." + " " + "Updated journal list:");
                                    journalAdjust.showJournals();
                                } else if (choice == 3) {

                                    journalAdjust.showJournals();
                                }


                            } else if (editNum == 3) {


                                System.out.println("Please select the action you want to do about the magazines. Please select 1 for add magazine, select 2 for delete magazine, select 3 for view all magazines. ");
                                int choice = input.nextInt();
                                if (choice == 1) {

                                    Scanner cevap = new Scanner(System.in);
                                    System.out.println("Please enter the name of the magazine you want add. ");
                                    String magazineName = cevap.nextLine();
                                    System.out.println("Please enter the number of the magazine you want add. ");
                                    int magazineNumber = input.nextInt();

                                    Magazine magazine9 = new Magazine(magazineName, magazineNumber);
                                    magazineAdjust.addMagazine(magazine9);


                                    System.out.println("You have successfully add the magazines to the magazine list :");
                                    magazineAdjust.showMagazines();
                                } else if (choice == 2) {

                                    magazineAdjust.showMagazines();
                                    System.out.println("Please enter the number of the magazine you want delete. ");
                                    Scanner del = new Scanner(System.in);
                                    int assignednumber = del.nextInt();

                                    magazineAdjust.deleteMagazine(assignednumber);
                                    System.out.println("You have successfully delete the magazine you choice." + " " + "Updated magazine list:");
                                    magazineAdjust.showMagazines();
                                } else if (choice == 3) {

                                    magazineAdjust.showMagazines();
                                }


                            }

                            break;
                        case 2:
                            System.out.println(" Welcome to the Information Query Screen.");
                            System.out.println(" Select 1 for User Information Query");
                            System.out.println(" Select 2 for User Count Query.");
                            System.out.println(" Select 3 for Content Information Query.");
                            System.out.println(" Select 4 for Content Count Query.");
                            System.out.println(" Select 5 for Admin Information Query.");
                            System.out.println(" Select 6 for Admin Count Query.");

                            int num = input.nextInt();
                            if (num == 1) {
                                userAdjust.showUsers();

                            } else if (num == 2) {

                                userAdjust.countUser();

                            } else if (num == 3) {

                                bookAdjust.showBooks();
                                journalAdjust.showJournals();
                                magazineAdjust.showMagazines();
                            } else if (num == 4) {

                                bookAdjust.countBook();
                                magazineAdjust.countMagazine();
                                journalAdjust.countJournal();
                            } else if (num == 5) {

                                adminAdjust.showAdmins();

                            } else if (num == 6) {

                                adminAdjust.countAdmin();

                            }
                            break;
                        case 3:
                            userAdjust.showUsers();
                            System.out.println("------------------------------");
                            System.out.println("Please enter user assigned number you want to delete");
                            int delus = input.nextInt();
                            userAdjust.deleteUser(delus);
                            System.out.println("The user belonging to the assigned number has been deleted from the system." + " " + "Updated user list:");
                            System.out.println("------------------------------");
                            userAdjust.showUsers();

                            break;
                        case 4:

                           return;

                        default:
                            System.out.println("Please enter between [1-4]");
                            break;
                    }
                }






            } else if (userAdjust.controlUser(ID, pw1)) {
                System.out.println("You are logged into the system as an student. ");
                while (true) {
                    System.out.println("------------------------------");
                    System.out.println(" Please enter the number of operation\n1- Lending Content System\n2-Product Return System\n3-Library Support System\n4-Quit.");
                    System.out.println("------------------------------");
                    int versıon = input.nextInt();

                    if (versıon == 1) {

                        System.out.println("Welcome to the Lending Content System\nSelect 1 for Return \nSelect 2 for Continue");
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1:

                                break;
                            case 2:

                                System.out.println("Which type of content you want to borrow?\nEnter 1 for Book\nEnter 2 for Journal\nEnter 3 for Magazine");
                                int type = input.nextInt();
                                if (type == 1) {
                                    System.out.println("Please select 1 for continue, Select 2 for exit. ");
                                    int th = input.nextInt();

                                    if (th == 1) {
                                        ArrayList<Integer> arrlist = new ArrayList<Integer>();
                                        bookAdjust.showBooks();
                                        System.out.println("Please enter the  assigned number of book you want to borrow. ");
                                        int lent = input.nextInt();
                                        arrlist.add(lent);
                                        System.out.println("Number of book you lent :" + arrlist.size());
                                        bookAdjust.controlBook(lent);
                                        bookAdjust.deleteBook(lent);
                                        System.out.println("Updated book list :");
                                        bookAdjust.showBooks();
                                    } else if (th == 2) {
                                        return;

                                    }


                                } else if (type == 2) {
                                    ArrayList<Integer> arrlist = new ArrayList<Integer>();
                                    journalAdjust.showJournals();
                                    System.out.println("Please enter the assigned number of journal you want to borrow. ");
                                    int lent = input.nextInt();
                                    arrlist.add(lent);
                                    System.out.println("Number of journal you lent :" + arrlist.size());
                                    journalAdjust.controlJournals(lent);
                                    journalAdjust.deleteJournal(lent);
                                    System.out.println("Updated journal list :");
                                    journalAdjust.showJournals();

                                } else if (type == 3) {

                                    ArrayList<Integer> arrlist = new ArrayList<Integer>();
                                    magazineAdjust.showMagazines();
                                    System.out.println("Please enter the  assigned number of magazine you want to borrow.");
                                    int lent = input.nextInt();
                                    arrlist.add(lent);
                                    System.out.println("Number of magazine you lent :" + arrlist.size());
                                    magazineAdjust.controlMagazines(lent);
                                    magazineAdjust.deleteMagazine(lent);
                                    System.out.println("Updated magazine list :");
                                    magazineAdjust.showMagazines();
                                } else {
                                    return;
                                }

                        }


                    } else if (versıon == 2) {

                        System.out.println("Which type of product you want to return? Select 1 for Book, Select 2 for Journal, Select 3 for Magazine.");
                        int inp = input.nextInt();
                        switch (inp) {

                            case 1:
                                Scanner upd = new Scanner(System.in);
                                bookAdjust.countBook();
                                bookAdjust.showBooks();
                                System.out.println("Please enter the name of book you want to return. ");
                                String pro = upd.nextLine();
                                System.out.println("Please enter the number of book you want to return.");
                                int no = input.nextInt();
                                Book book4 = new Book(pro, no);
                                bookAdjust.addBook(book4);
                                System.out.println("You have successfully return the book." + " " + " Updated book list :");
                                bookAdjust.showBooks();
                                bookAdjust.countBook();
                                break;
                            case 2:
                                Scanner upd1 = new Scanner(System.in);
                                journalAdjust.countJournal();
                                journalAdjust.showJournals();
                                System.out.println("Please enter the name of journal you want to return. ");
                                String pro1 = upd1.nextLine();
                                System.out.println("Please enter number of journal you want to return. ");
                                int no1 = input.nextInt();
                                Journal journal4 = new Journal(pro1, no1);
                                journalAdjust.addJournal(journal4);
                                System.out.println("You have successfully return the journal. " + "  " + "Updated journal list :");
                                journalAdjust.showJournals();
                                journalAdjust.countJournal();
                                break;
                            case 3:
                                Scanner upd2 = new Scanner(System.in);
                                magazineAdjust.countMagazine();
                                magazineAdjust.showMagazines();
                                System.out.println("Please enter the name of magazine you want to return. ");
                                String pro2 = upd2.nextLine();
                                System.out.println("Please enter number of magazine you want to return. ");
                                int no2 = input.nextInt();
                                Magazine magazine4 = new Magazine(pro2, no2);
                                magazineAdjust.addMagazine(magazine4);
                                System.out.println("You have successfully return the magazine." + " " + "Updated magazine list :");
                                magazineAdjust.showMagazines();
                                magazineAdjust.countMagazine();
                                break;
                        }

                    } else if (versıon == 3) {
                        System.out.println("------------------------------");
                        System.out.println(" The library is open 24 hours.\n" +
                                "The working hours of the library staff\n" +
                                "are between 07:30 and 21:30.\n" +
                                "You can get help from the staff\n" +
                                "during these working hours.\n" +
                                "Library contact number: 0 (232) 123 45 67\n" +
                                "Library e-mail address: ieu.library@gmail.com.");
                        System.out.println("------------------------------");
                    } else if (versıon == 4) {
                        return;
                    } else {

                        System.out.println("Please enter between [1-4]");
                    }
                }
            }else {
                System.out.println("You are not registered to our system. Try again please ");

            }



        } else if (number == 2) {

Scanner scanner =new Scanner(System.in);
                System.out.println("Please enter your name. ");
                String name = scanner.nextLine();
            System.out.println("Please enter your surname. ");
                String surname =scanner.nextLine();
                System.out.println("Please enter your ID number. ");
                Integer ID = input.nextInt();
                System.out.println("Please enter your password");
                Integer pw = input.nextInt();
                User User = new User(ID, name, surname, pw);
                userAdjust.addUser(User);
            System.out.println("You have successfully registered in the library management system. "+ " " +"Updated user list :");
            System.out.println("------------------------------------------------------------");
                userAdjust.showUsers();
            System.out.println("------------------------------------------------------------");




        }

    }
}}