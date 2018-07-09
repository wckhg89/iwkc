package com.guppy.api.user.service;

import com.guppy.domain.user.entity.User;
import com.guppy.domain.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guppy.kang on 2018. 7. 9.
 * email : guppy.kang@kakaocorp.com
 */

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> findAllUsers () {
        return userRepository.findAll();
    }
}
