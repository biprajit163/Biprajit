package oct05.auth;

<<<<<<< HEAD
import oct05.data.user;

import java.util.ArrayList;
import java.util.Scanner;

public class signup extends signin {
    public static void userSignup(ArrayList<user> users) {
        Scanner input = new Scanner(System.in);

        String username, password, data;
        System.out.println("Enter username");
        username = input.next();
        System.out.println("Enter password");
        password = input.next();
        System.out.println("Enter your data");
        data = input.next();

        users.add(new user(username, password, data));
        System.out.println("registered successfully");
    }
=======
public class signup
{
>>>>>>> 6914b5176717bf4ead903614fc79830df78a692e
}
