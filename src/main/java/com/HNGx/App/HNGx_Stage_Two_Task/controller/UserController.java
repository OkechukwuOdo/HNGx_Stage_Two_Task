package com.HNGx.App.HNGx_Stage_Two_Task.controller;

import com.HNGx.App.HNGx_Stage_Two_Task.entity.User;
import com.HNGx.App.HNGx_Stage_Two_Task.model.UserRequestDTO;
import com.HNGx.App.HNGx_Stage_Two_Task.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<User> createUser(UserRequestDTO userDTO){
        return null;
    }

    @GetMapping("/user_id")
    public ResponseEntity<User> fetchUser(Long user_id){
        return null;
    }
    @DeleteMapping("/user_id")
    public ResponseEntity<String> removeUser(Long user_id){
        return null;}
    @PutMapping("/user_id")
    public ResponseEntity<User> updateUser(Long user_id, UserRequestDTO userDTO){
        return null;
    }
}
