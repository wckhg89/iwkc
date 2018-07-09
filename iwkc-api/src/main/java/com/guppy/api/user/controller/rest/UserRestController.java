package com.guppy.api.user.controller.rest;

import com.guppy.api.user.service.UserService;
import com.guppy.domain.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by guppy.kang on 2018. 7. 9.
 * email : guppy.kang@kakaocorp.com
 */

@RestController
@RequestMapping("/rest/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getUser () {
        return userService.findAllUsers();
    }


}
