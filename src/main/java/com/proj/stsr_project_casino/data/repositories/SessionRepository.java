package com.proj.stsr_project_casino.data.repositories;

import com.proj.stsr_project_casino.data.entities.Session;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<Session, String> {
}
