package com.guppy.domain.user.repository;


import com.guppy.domain.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by guppy.kang on 2018. 7. 9.
 * email : guppy.kang@kakaocorp.com
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void SAVE_TEST () {
        User user = User.builder()
                .userName("guppy")
                .build();

        userRepository.save(user);
    }
}
