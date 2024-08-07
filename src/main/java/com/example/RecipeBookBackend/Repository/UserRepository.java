package com.example.RecipeBookBackend.Repository;

import com.example.RecipeBookBackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String email);
}
