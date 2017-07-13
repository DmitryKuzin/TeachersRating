package ru.kpfu.itis.teachersrating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.teachersrating.model.Group;
import ru.kpfu.itis.teachersrating.model.Institute;
import ru.kpfu.itis.teachersrating.model.User;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {

    List<Group> findByInstitute(Institute institute);

    Group findByUsers(User user);
}
