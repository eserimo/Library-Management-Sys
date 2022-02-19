import java.util.ArrayList;


      public class AdminAdjust implements itfAdminAdjust {
        static ArrayList<Admin> admins = new ArrayList<Admin>();

        @Override
        public void addAdmin(Admin admin) {
            admins.add(admin);
        }

        @Override
        public void countAdmin() {
            System.out.println("The number of admins registered in the system : " + admins.size());
        }

        @Override
        public boolean controlAdmin(Integer imp, Integer pw) {
            for (Admin admins : admins) {
                if (admins.getAdminID() == imp && admins.getPassword()==pw) {
                    System.out.println("------------------------------");
                    System.out.println("Specified admin found.");
                    System.out.println("------------------------------");
                    System.out.println("Admin informations :" + " " + admins.getAdminName() + " " + admins.getAdminSurname() + " , " + "User ID number : " + " " + admins.getAdminID() + " , " + "Admin Password :" + " " + admins.getPassword());
                    System.out.println("------------------------------");
return true;
                }
            }
            System.out.println("------------------------------");

            return false;
        }

        @Override
        public void deleteAdmin(int adminNumber) {
            AdminAdjust.admins.remove(adminNumber - 1);
        }

        @Override
        public void showAdmins() {
            if (admins.isEmpty()) {
                System.out.println("There is no admin.");
            } else {
                for (Admin ad : admins) {
                    ad.adminInformation();
                }
            }
        }
    }

