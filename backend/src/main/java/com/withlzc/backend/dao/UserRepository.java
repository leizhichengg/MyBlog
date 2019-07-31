package com.withlzc.backend.dao;

import com.withlzc.backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lei
 * @date 2019-07-31
 */

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
