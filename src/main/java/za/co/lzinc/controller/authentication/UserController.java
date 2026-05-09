package za.co.lzinc.controller.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.lzinc.domain.authentication.User;
import za.co.lzinc.service.authentication.impl.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(User user) {
        User createdUser = userService.create(user);
        return ResponseEntity.ok(createdUser);
    }
    
}
