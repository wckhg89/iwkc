package com.guppy.domain.user.repository;

import com.guppy.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by guppy.kang on 2018. 7. 9.
 * email : guppy.kang@kakaocorp.com
 */

public interface UserRepository extends JpaRepository<User, Long> {

}
