package APIManager.Service;

import java.util.List;
import APIManager.Entity.UserEntity;

public interface ServiceInterface {
    List<UserEntity> getAllUsers();
    UserEntity getUserById(Long id);
    UserEntity createUser(UserEntity user);
    UserEntity updateUser(Long id, UserEntity userDetails);
    void deleteUser(Long id);
}
