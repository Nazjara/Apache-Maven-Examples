package com.nazjara;

import com.nazjara.domain.UserCommand;
import com.nazjara.entities.User;

public class UserController {

    User getUser(UserCommand userCommand) {
        return UserConverter.INSTANCE.userCommandToUser(userCommand);
    }
}
