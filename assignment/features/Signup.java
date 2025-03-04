package features;

import java.util.*;

public class Signup {
    public ArrayList<User> users = new ArrayList<User>();

    public void addUser(String username, String password) {
        if(!users.contains(username)) {
            users.add(new User(username, password));
        } else {
            System.out.println("The user already exists: " + username);
        }
    }

    public User[] getAllUsers() {
        for(User userObj: users) {
            System.out.print(userObj.username);
            System.out.println();

//            System.out.print(userObj.password);
//            System.out.println();
        }

        User[] usersArr = new User[users.size()];
        users.toArray(usersArr);

        return usersArr;
    }
}


//class User {
//    String username;
//    String password;
//
//    User(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//}
