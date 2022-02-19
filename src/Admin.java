public class Admin {
    private int AdminID;
    private String adminName;
    private String adminSurname;
    private int password;

    public Admin(int adminID, String adminName, String adminSurname, int password) {
        AdminID = adminID;
        this.adminName = adminName;
        this.adminSurname = adminSurname;
        this.password = password;

    }
        public int getAdminID() {
            return AdminID;
        }

    public void setAdminID(int adminID) {
        AdminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public void setAdminSurname(String adminSurname) {
        this.adminSurname = adminSurname;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void adminInformation(){
       System.out.println("Admin name : "+ " " +getAdminName()+ " , " + "Admin surname : " + " " + getAdminSurname()+  " , "  + " Admin number : " + " " + getAdminID());
}
}

