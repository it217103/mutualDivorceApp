package com.project.mutualDivorce.Repository;

import com.project.mutualDivorce.Entity.Divorce;
import com.project.mutualDivorce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface DivorceRepository extends JpaRepository<Divorce, Long> {
    Divorce findById(long id);
    Optional<List<Divorce>> findAllByUser(User user);

    @Modifying
    @Transactional
    @Query("UPDATE Divorce d SET d.approved =true WHERE d.id = ?1")
    void updateStatusById(long id);
}