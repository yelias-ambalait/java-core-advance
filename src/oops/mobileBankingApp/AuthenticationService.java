package oops.mobileBankingApp;

public class AuthenticationService {
    private User[] validUsers = new User[]{new User("user", "password"), new User("username", "password")};

    public AuthenticationService() {
    }

    public boolean authenticate(String username, String password) {
        User[] var3 = this.validUsers;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            User user = var3[var5];
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }
}

