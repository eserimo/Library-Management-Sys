public interface itfUserAdjust{
    void addUser(User user);
    void deleteUser(int userNumber);
    void showUsers();
    boolean controlUser(Integer imp, Integer pw);
    void countUser();
}
