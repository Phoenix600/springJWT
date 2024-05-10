package com.pranay.example.SpringJWT.services;

import com.pranay.example.SpringJWT.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService()
    {
        store.add(new User(UUID.randomUUID().toString(),"tanvi","tanvi@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"diya","diya@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"pranay","pranay@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"vedant","vedant@gmail.com"));
    }

    public List<User> getAllUser()
    {
        return store;
    }

}
