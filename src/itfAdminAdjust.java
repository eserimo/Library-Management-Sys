public interface itfAdminAdjust{
    void addAdmin(Admin admin);
    void deleteAdmin(int adminNumber);
    void showAdmins();
    boolean controlAdmin(Integer imp, Integer pw);
    void countAdmin();
}
