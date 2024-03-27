package APIManager.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import APIManager.Entity.UserEntity;
import APIManager.Service.UserService;


@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;
    private static final Logger logger =  LoggerFactory.getLogger(UserController.class);
    
    @GetMapping("/findAll")
    public List<UserEntity> getAllUsers() {
    	logger.info("getAllUsers");
        return userService.getAllUsers();
    }

    @GetMapping("/find/{ID}")
    public UserEntity getUserById(@PathVariable("ID") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create")

    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

   
	@PutMapping("/update/{ID}")
    public UserEntity updateUser(@PathVariable("ID") Long id, @RequestBody UserEntity user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{ID}")
    public void deleteUser(@PathVariable("ID") Long id) {
        userService.deleteUser(id);
    }
}