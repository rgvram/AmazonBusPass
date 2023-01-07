package assests;

/*
* hard coded Admin login credentials <<temp>>
* storage & retrial of Admin credentials
* singleton implementation
*/

public class Admin {
    private static Admin adminObj;
    private String adminId;
    private String adminPassword;

    public static Admin getAdminInstance() {
        if(adminObj == null){
            adminObj = new Admin();
            adminObj.adminId = "admin";
            adminObj.adminPassword = "admin@123";
        }
        return adminObj;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }
}
