package com.insider.Main.leave;

import com.insider.Main.leave.entity.LeaveSubmit;
import com.insider.Main.leave.repository.LeaveAccrualRepository;
import com.insider.Main.leave.repository.LeaveRepository;
import com.insider.Main.leave.repository.LeaveSubmitRepository;
import com.insider.Main.leave.service.LeaveService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class LeaveServiceTests {

    // 1. 필드랑 생성자 초기화
    private LeaveService leaveService;
    @Mock
    private LeaveAccrualRepository leaveAccrualRepository;
    @Mock
    private LeaveRepository leaveRepository;
    @Mock
    private LeaveSubmitRepository leaveSubmitRepository;

    @BeforeEach
    public void initialize() {
        leaveService = new LeaveService(leaveAccrualRepository, leaveRepository, leaveSubmitRepository);
    }


    // 3. 테스트 코드 작성
    @Test
    @DisplayName("휴가 신청 내역 조회")
    void testSelectLeaveSubmitListByMemberId() {
        // given
        String applicantId = "2023123-XXXXX";
        String ApproverId = "2020123-XXXXX";

        LeaveSubmit leaveSubmit1 = new LeaveSubmit(ApproverId,
                Date.valueOf("2024-04-10"), Date.valueOf("2024-04-11"), Date.valueOf("2024-04-05"), "연차");
        LeaveSubmit leaveSubmit2 = new LeaveSubmit(applicantId,
                Date.valueOf("2024-04-12"), Date.valueOf("2024-04-13"), Date.valueOf("2024-04-07"), "반차");

        List<LeaveSubmit> leaveSubmits = Arrays.asList(leaveSubmit1, leaveSubmit2);

        // 4. Mock 객체가 실제 데이터베이스에 엑세스 하지 않고 가짜 데이터를 반환하도록 함
        when(leaveSubmitRepository.findByMemberId(applicantId)).thenReturn(leaveSubmits);

        // when
        // 5. 사용할 메소드 레포지토리에도 작성
        List<LeaveSubmit> result = leaveSubmitRepository.findByMemberId(applicantId);

        // then
        for (LeaveSubmit submit : result) {
            System.out.println(submit);
        }
    }
}
