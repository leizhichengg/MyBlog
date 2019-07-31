package com.withlzc.backend.service.impl;

import com.withlzc.backend.dao.UserRepository;
import com.withlzc.backend.domain.User;
import com.withlzc.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lei
 * @date 2019-07-31
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
