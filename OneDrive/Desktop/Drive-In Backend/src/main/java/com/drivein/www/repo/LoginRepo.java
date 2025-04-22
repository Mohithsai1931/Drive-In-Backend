package com.drivein.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.drivein.www.model.Login;

public interface LoginRepo extends JpaRepository<Login, String> {
    Login findByUsername(String username);
}
