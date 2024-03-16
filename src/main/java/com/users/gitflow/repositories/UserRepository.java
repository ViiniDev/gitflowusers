package com.users.gitflow.repositories;

import com.users.gitflow.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
}
