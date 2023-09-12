package com.HNGx.App.HNGx_Stage_Two_Task.service;

import com.HNGx.App.HNGx_Stage_Two_Task.model.UserRequestDTO;
import com.HNGx.App.HNGx_Stage_Two_Task.model.UserResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponseDTO createUser(UserRequestDTO userDTO);
    String deleteUser(Long user_id);
    UserResponseDTO fetchUser(Long user_id);
    UserResponseDTO updateUser(Long user_id, UserRequestDTO userDTO);
}
