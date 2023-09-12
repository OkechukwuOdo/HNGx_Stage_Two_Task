package com.HNGx.App.HNGx_Stage_Two_Task.service;

import com.HNGx.App.HNGx_Stage_Two_Task.entity.User;
import com.HNGx.App.HNGx_Stage_Two_Task.model.UserRequestDTO;
import com.HNGx.App.HNGx_Stage_Two_Task.model.UserResponseDTO;
import com.HNGx.App.HNGx_Stage_Two_Task.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService{
    private final UserRepo userRepo;
    @Override
    public UserResponseDTO createUser(UserRequestDTO userDTO) {
        User user= userRepo.save(mapUserRequestTOuser(userDTO));

        return mapUserToUserResponse(user);
    }

    private UserResponseDTO mapUserToUserResponse(User user) {
        return UserResponseDTO.builder()
                .name(user.getName())
                .phone_number(user.getPhone_number())
                .gender(user.getGender())
                .build();
    }

    private User mapUserRequestTOuser(UserRequestDTO userDTO) {
        return User.builder()
                .name(userDTO.getName())
                .phone_number(userDTO.getPhone_number())
                .gender(userDTO.getGender())
                .build();
    }

    @Override
    public String deleteUser(Long user_id) {
        User user= userRepo.findById(user_id).orElseThrow(()->new RuntimeException("user does not exist"));
        userRepo.deleteById(user_id);
        return "User by name "+user.getName()+" has been deleted from database";
    }

    @Override
    public UserResponseDTO fetchUser(Long user_id) {
        User user= userRepo.findById(user_id).orElseThrow(()->new RuntimeException("User does not exist"));
        return mapUserToUserResponse(user);
    }

    @Override
    public UserRequestDTO updateUser(Long user_id, UserRequestDTO userDTO) {
        User user= userRepo.findById(user_id).orElseThrow(()->new RuntimeException("User does not exist"));
        user.setName(userDTO.getName());
        user.setGender(userDTO.getGender());
        user.setPhone_number(userDTO.getPhone_number());
        return null;
    }
}
