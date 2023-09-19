package Services;

import Models.User;
import Repository.UserRepository;
import enums.Gender;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(String id, String name, Gender gender, int age, String state, String district) {

        User user = new User(id,name,gender,age,state,district);
        repository.addUser(user);
    }
}
