package APIManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import APIManager.Entity.UserEntity;
import APIManager.Repository.RepositoryInterface;

@Service
public class UserService implements ServiceInterface {

	@Autowired
    private RepositoryInterface userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id " + id));
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity updateUser(Long id, UserEntity userDetails) {
    	UserEntity user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id " + id));

        user.setNAME(userDetails.getNAME());
        user.setEMAIL(userDetails.getEMAIL());

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}