package com.student.information.system.service;



import com.student.information.system.model.User;

import java.util.List;

/**
 * @author regcrix
 */
public interface UserService {



   User findByEmail(String email);



     User saveOrUpdateUser(User User);


}
