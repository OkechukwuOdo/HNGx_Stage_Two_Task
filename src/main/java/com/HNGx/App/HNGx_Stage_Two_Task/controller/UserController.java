package com.HNGx.App.HNGx_Stage_Two_Task.controller;

import com.HNGx.App.HNGx_Stage_Two_Task.model.UserRequestDTO;
import com.HNGx.App.HNGx_Stage_Two_Task.model.UserResponseDTO;
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
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userDTO){
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<UserResponseDTO> fetchUser(@PathVariable("user_id") Long user_id){
        return ResponseEntity.ok(userService.fetchUser(user_id));
    }
    @DeleteMapping("/{user_id}")
    public ResponseEntity<String> removeUser(@PathVariable("user_id") Long user_id){
        return ResponseEntity.ok(userService.deleteUser(user_id));
    }
    @PutMapping("/{user_id}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable("user_id") Long user_id,@RequestBody UserRequestDTO userDTO){
        return ResponseEntity.ok(userService.updateUser(user_id,userDTO));
    }
}
