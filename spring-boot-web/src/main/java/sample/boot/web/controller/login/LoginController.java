package sample.boot.web.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sample.boot.service.user.auth.AuthUserService;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/login/form")
public class LoginController {
    @Resource
    private AuthUserService authUserService;

    @RequestMapping(method = RequestMethod.GET)
    public String form(final Model model) {
        model.addAttribute("userAuth", this.authUserService.prototype());
        return "login/form";
    }
}
