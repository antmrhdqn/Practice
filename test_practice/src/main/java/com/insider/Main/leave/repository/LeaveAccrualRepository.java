package com.insider.Main.leave.repository;

import com.insider.Main.leave.entity.LeaveAccrual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveAccrualRepository extends JpaRepository<LeaveAccrual, Integer> {
}
