package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.repository.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll(); // db에 있는걸 있는 그대로 가져올거면 entity 로 가공할거면 dto 로

    UserDto getUserDetailsByEmail(String userName);
}
