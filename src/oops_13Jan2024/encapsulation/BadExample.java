package src.oops_13Jan2024.encapsulation;

public class BadExample {
    public static void main(String[] args) {


        vmoLogin vmoLogin = new vmoLogin("admin", "admin");
        boolean check = vmoLogin.isLoggedin("admin", "password");
        System.out.println(check);
        boolean check1 = vmoLogin.isLoggedin("admin", "password");
        String uname =vmoLogin.getUsername();
        System.out.println(uname);
        // vmoLogin.password = "password";
        System.out.println(check1);
    }
}
class vmoLogin {


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String username;
    private String password;

    public vmoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isLoggedin(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
            System.out.println("You are Loggedin");
            return true;
        } else {
            System.out.println("You are not allowed");
            return false;
        }
    }
}


