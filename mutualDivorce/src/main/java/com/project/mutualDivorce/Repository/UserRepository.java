package com.project.mutualDivorce.Repository;

import com.project.mutualDivorce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserBySurname(String surname);

    void deleteById(long id);
}
