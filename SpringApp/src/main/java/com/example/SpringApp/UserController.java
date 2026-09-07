package com.example.SpringApp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public Users save(@RequestBody Users user){
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public Users findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping
    public List<Users> findAll(){
        return userService.findAll();
    }
}
