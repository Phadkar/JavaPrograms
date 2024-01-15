package src.oops_13Jan2024.encapsulation;

public class Lab148 {
    public static void main(String[] args) {
        vmoLoginFixed vmoLogin = new vmoLoginFixed("admin","password");
        boolean check = vmoLogin.isLoggedin("admin","password");
        String u = vmoLogin.getUsername();
        //String u1 = vmoLogin.getPassword();
        System.out.println(u);
        System.out.println(check);
    }
}

class vmoLoginFixed {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;

    private void toCheck(){

    }

    public vmoLoginFixed(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isLoggedin(String username, String password) {
        if (username.toLowerCase().equals(username) && password.toLowerCase().equals(password)) {
            System.out.println("is Logged in!!!");
            return true;
        }else
        {
            System.out.println("Incorrect details");
            return false;
        }
    }
}


