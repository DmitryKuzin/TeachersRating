package ru.kpfu.itis.teachersrating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.teachersrating.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
