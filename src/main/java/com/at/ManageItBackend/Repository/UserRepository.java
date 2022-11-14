package com.at.ManageItBackend.Repository;

import com.at.ManageItBackend.Entity.Users.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
