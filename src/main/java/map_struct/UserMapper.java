package map_struct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userCommandToUser(UserCommand userCommand);
    UserCommand userToUserCommand(User userCommand);
}
