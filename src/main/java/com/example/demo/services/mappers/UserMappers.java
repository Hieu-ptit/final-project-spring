package com.example.demo.services.mappers;

import com.example.demo.models.entities.UserEntity;
import com.example.demo.models.in.UserRequest;
import com.example.demo.models.out.UserDto;
import java.util.List;
import java.util.stream.Collectors;

public class UserMappers {
    public List<UserDto> mapUserDto(List<UserEntity> userEntities){
        return  userEntities.stream().map(this::mapUserDto).collect(Collectors.toList());
    }

    public UserDto mapUserDto(UserEntity userEntity){
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setEmail(userEntity.getEmail());
        userDto.setCreatedAt(userEntity.getCreatedAt());
        userDto.setStatus(userEntity.isStatus());
        return userDto;
    }

    public UserEntity mapUserEntity(UserRequest userRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userRequest.getFirstName());
        userEntity.setLastName(userRequest.getLastName());
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setCreatedAt(userRequest.getCreatedAt());
        userEntity.setStatus(userRequest.isStatus());
        return userEntity;
    }

    public UserEntity maUserEntity(UserRequest userRequest,int id){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setFirstName(userRequest.getFirstName());
        userEntity.setLastName(userRequest.getLastName());
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setCreatedAt(userRequest.getCreatedAt());
        userEntity.setStatus(userRequest.isStatus());
        return userEntity;
    }
}
