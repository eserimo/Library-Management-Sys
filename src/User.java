public class User {
    private int userID;
    private String userName;
    private String userSurname;
    private int password;




    public User(int userID, String userName, String userSurname, int password) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.password = password;

    }
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserSurname() {
        return userSurname;
    }
    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
    public void userInformation(){
        System.out.println("User name : "+ " " +getUserName()+ " , " + "User surname : "+ " " + getUserSurname()+ " , " +" User number : "+ " " +getUserID());

    }
}

