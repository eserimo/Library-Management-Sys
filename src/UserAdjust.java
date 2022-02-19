import java.util.ArrayList;

public class UserAdjust implements itfUserAdjust{
    static ArrayList<User> users = new ArrayList<User>();
    @Override
    public void addUser(User user){
        users.add(user);
    }
    @Override
    public void countUser() {
        System.out.println("The number of users registered in the system : " +users.size());
    }
    @Override
    public boolean controlUser(Integer imp, Integer pw) {
        for (User users : users) {
            if (users.getUserID() == imp && users.getPassword() == pw) {
                System.out.println("Specified user found.");
                System.out.println("------------------------------");
                System.out.println("User informations :" + " " + users.getUserName() + " " + users.getUserSurname() + " " + "User ID number : " + users.getUserID());
                System.out.println("------------------------------");
return true;
            }
        }
        System.out.println("Specified user not found. ");


        return false;
    }
    @Override
    public void deleteUser(int userNumber){
        UserAdjust.users.remove(userNumber-1);
    }
    @Override
    public void showUsers(){
        if(users.isEmpty()){
            System.out.println("There is no user.");
        }
        else{
            for(User us:users){
                us.userInformation();
            }
        }
    }
}

