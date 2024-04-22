package com.insider.Main.leave.controller;

import com.insider.Main.common.ResponseDTO;
import com.insider.Main.leave.service.LeaveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {

    private final LeaveService leaveService;

    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @GetMapping("leavesubmit")
    public ResponseEntity<ResponseDTO> selectSubmitList(
            @RequestParam(name = "memberId") String memberId,
            @RequestParam(name = "page") int page) {


        return null;
    }

}
