package ru.kpfu.itis.teachersrating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.teachersrating.model.PhoneVerificationToken;

public interface PhoneVerificationTokenRepository extends JpaRepository<PhoneVerificationToken, Long> {
}
