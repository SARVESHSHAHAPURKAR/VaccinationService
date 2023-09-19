package Repository;

import Models.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    Map<String, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public void addUser(User user) {

        users.put(user.getUniqueId(), user);
        System.out.println("User with id "+user.getUniqueId()+" added");
    }
}
