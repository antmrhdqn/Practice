package exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

        if (!(username.equals("user01") && password.equals("pass01"))) {
// 불일치 할 경우 InvalidCredentialsException 발생
            throw new InvalidCredentialsException("유효한 자격 증명 없음");
        }
// 일치할 경우 main으로 redirect
        return "redirect:/main";

    }
}
