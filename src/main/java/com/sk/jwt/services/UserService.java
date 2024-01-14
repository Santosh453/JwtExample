package com.sk.jwt.services;

import com.sk.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<User>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Ajay Kumar", "ajay@google.com"));
        store.add(new User(UUID.randomUUID().toString(),"Arun Kumar", "arun@google.com"));
        store.add(new User(UUID.randomUUID().toString(),"Vijay Singh", "vijay@amazon.com"));
        store.add(new User(UUID.randomUUID().toString(),"Sandeep Kumar", "sandeep@microsoft.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rohit Kumar", "rohit@facebook.com"));
        store.add(new User(UUID.randomUUID().toString(),"Sanjay Kumar", "sanjay@flipkart.com"));
    }

    public List<User> getAllUsers(){
        return this.store;
    }


}
