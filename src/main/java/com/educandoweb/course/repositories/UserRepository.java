package com.educandoweb.course.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
