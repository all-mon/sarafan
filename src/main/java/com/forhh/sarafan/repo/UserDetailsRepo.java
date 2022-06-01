package com.forhh.sarafan.repo;

import com.forhh.sarafan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User,String>{
}
