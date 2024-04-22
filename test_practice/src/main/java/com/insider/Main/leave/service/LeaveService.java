package com.insider.Main.leave.service;

import com.insider.Main.leave.repository.LeaveAccrualRepository;
import com.insider.Main.leave.repository.LeaveRepository;
import com.insider.Main.leave.repository.LeaveSubmitRepository;
import org.springframework.stereotype.Service;

@Service
public class LeaveService {

    // 2. 테스트 코드 작성 시 발생한 에러 해결하기 위해 서비스에도 필드와 생성자 초기화
    private LeaveAccrualRepository leaveAccrualRepository;
    private LeaveRepository leaveRepository;
    private LeaveSubmitRepository leaveSubmitRepository;

    public LeaveService(LeaveAccrualRepository leaveAccrualRepository, LeaveRepository leaveRepository, LeaveSubmitRepository leaveSubmitRepository) {
        this.leaveAccrualRepository = leaveAccrualRepository;
        this.leaveRepository = leaveRepository;
        this.leaveSubmitRepository = leaveSubmitRepository;
    }


}
