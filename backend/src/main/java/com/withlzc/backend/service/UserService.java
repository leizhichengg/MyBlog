package com.withlzc.backend.service;

import com.withlzc.backend.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author Lei
 * @date 2019-07-31
 */

public interface UserService {


    User checkUser(String username, String password);



}
