package com.example.Service;


import com.example.Entity.User;
import com.example.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User>getAllUsers(){
        return repository.findAll();
    }

    public Optional<User>getUserById(Long id){
        return repository.findById(id);
    }
    public User createUser(User user){
        return repository.save(user);
    }

    public User updateUser(Long id , User userdetails){
        return repository.findById(id).map(user -> {
            user.setName(userdetails.getName());
            user.setEmail(userdetails.getEmail());
            return repository.save(user);
        }).orElseThrow(() -> new RuntimeException("User Not Found"));
        }
        public void deleteUser(Long id){
         repository.deleteById(id);
    }
}
