package com.uniconnect.controller.user;
import com.uniconnect.model.event.EventSaveForm;
import com.uniconnect.model.user.LoginSaveForm;
import com.uniconnect.model.user.UserSaveForm;
import com.uniconnect.service.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("userSaveForm", new UserSaveForm());
        return "page/user/create";
    }

    @PostMapping("save")
    public String save(@Valid UserSaveForm userSaveForm, BindingResult result) {
        userService.save(userSaveForm);
        return "page/user/create";
    }

    // in the future this will be random
    @GetMapping("login/create")
    public String createLogin(Model model) {
        model.addAttribute("loginSaveForm", new LoginSaveForm());
        return "page/user/login/create";
    }

    @PostMapping("login/save")
    public String saveLogin(@Valid LoginSaveForm loginSaveForm, BindingResult result) {
        userService.saveLogin(loginSaveForm);
        return "page/user/login/create";
    }
}
