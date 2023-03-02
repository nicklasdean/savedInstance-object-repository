package com.example.user_registration;

import java.util.ArrayList;
import java.util.Arrays;

public class UserRepository {
    //This class represents a data store such as a database
    private static ArrayList<User> users = new ArrayList<User>(Arrays.asList(
            new User("Nicklas",false),
            new User("Freddy",true),
            new User("Jarl",true),
            new User("Jack",true),
            new User("Claus",true)
    ));

    public void addUser(User u){
        users.add(u);
    }

    public ArrayList<User> getAllUsers(){
        return users;
    }
}
