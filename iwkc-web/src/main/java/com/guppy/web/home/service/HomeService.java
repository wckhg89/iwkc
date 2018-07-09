package com.guppy.web.home.service;

import com.guppy.domain.user.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * Created by guppy.kang on 2018. 7. 9.
 * email : guppy.kang@kakaocorp.com
 */

@Service
public class HomeService {

    private final UserRepository userRepository;

    public HomeService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
