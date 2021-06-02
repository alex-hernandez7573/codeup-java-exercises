package OOPlecture;

public class User {
    public String userName;
    public String passWord;
    public String email;
    public int id;

public String getPassword () {
    return passWord;
}

    public String setPassword (String passWord) {
        return this.passWord = passWord;
    }

    public static void main(String[] args) {
        User testUser = new User();

        testUser.id = 1;
        testUser.userName = "Alex23";
        testUser.passWord = "password";
        testUser.email = "Alex23@email.com";


//        UserTools.login(testUser);

        System.out.println("Userane: "+testUser.userName);
        System.out.println("Password: "+testUser.passWord);
        System.out.println("Email: "+testUser.email);
    }

}
