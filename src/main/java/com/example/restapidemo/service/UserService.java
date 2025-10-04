package com.example.restapidemo.service;

import com.example.restapidemo.model.User;
import com.example.restapidemo.repository.UserRepository;
import lombok.Getter;
import org.springframework.stereotype.Service;
import java.util.List;

@Getter
@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {

        this.repo = repo;
    }
    public List<User> findAll() {
        return repo.findAll();
    }

    public User save(User user) {
        return repo.save(user);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
