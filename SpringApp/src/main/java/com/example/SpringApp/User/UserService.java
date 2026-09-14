package com.example.SpringApp.User;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public Users save(Users user){
        return userRepo.save(user);
    }

    public Users findById(Long id){
        return userRepo.findById(id).orElse(null);
    }

    public List<Users> findAll(){
        return userRepo.findAll();
    }
}
