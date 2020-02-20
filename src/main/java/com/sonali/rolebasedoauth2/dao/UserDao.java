package com.sonali.rolebasedoauth2.dao;

import com.sonali.rolebasedoauth2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
}
