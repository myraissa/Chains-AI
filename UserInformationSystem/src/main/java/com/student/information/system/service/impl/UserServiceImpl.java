package com.student.information.system.service.impl;

import com.student.information.system.repository.UserRepository;

import com.student.information.system.model.User;
import com.student.information.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ragcrix
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository UserRepository;





    @Override
    public User findByEmail(String email) {
        return UserRepository.findByEmail(email);
    }





    @Override
    public User saveOrUpdateUser(User User) {
        return UserRepository.save(User);
    }


}
