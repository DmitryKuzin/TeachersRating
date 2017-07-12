package ru.kpfu.itis.teachersrating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.teachersrating.model.Institute;

public interface InstituteRepository extends JpaRepository<Institute, Long> {
}
