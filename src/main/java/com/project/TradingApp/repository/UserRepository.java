package com.project.TradingApp.repository;

import com.project.TradingApp.Modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
