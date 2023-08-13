package com.student.information.system.repository;


import com.student.information.system.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;





public interface UserRepository extends MongoRepository<User, String> {



    User findByEmail(String email);




}
