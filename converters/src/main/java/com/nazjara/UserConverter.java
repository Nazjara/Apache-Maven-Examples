package com.nazjara;

import com.nazjara.domain.UserCommand;
import com.nazjara.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User userCommandToUser(UserCommand userCommand);
    UserCommand userToUserCommand(User userCommand);
}
