package com.proj.stsr_project_casino.data.repositories;

import com.proj.stsr_project_casino.data.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    boolean getById(Integer id);
}
