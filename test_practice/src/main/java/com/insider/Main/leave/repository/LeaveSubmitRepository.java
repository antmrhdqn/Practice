package com.insider.Main.leave.repository;

import com.insider.Main.leave.entity.LeaveSubmit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveSubmitRepository extends JpaRepository<LeaveSubmit, Integer> {

    @Query("SELECT l FROM LeaveSubmit l WHERE l.leaveSubApplicant = :applicantId")
    List<LeaveSubmit> findByMemberId(String applicantId);

}
