package com.uniconnect.controller.user;
import com.uniconnect.model.user.LoginAuthForm;
import com.uniconnect.model.user.UserSaveForm;
import com.uniconnect.service.user.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("userSaveForm", new UserSaveForm());
        return "internalPages/user/create";
    }

    @PostMapping("save")
    public String save(@Valid UserSaveForm userSaveForm, BindingResult result) {
        userService.save(userSaveForm);
        return "redirect:/user/login";
    }

    // in the future this will be random
    @GetMapping("login")
    public String login(Model model) {
        model.addAttribute("loginSaveForm", new LoginAuthForm());
        return "internalPages/user/login";
    }

    @PostMapping("login/validate")
    public String saveLogin(@Valid LoginAuthForm loginAuthForm, HttpSession session, RedirectAttributes redirectAttributes) {
        if (userService.authLogin(loginAuthForm)) {
            redirectAttributes.addFlashAttribute("authenticated", loginAuthForm.getEmail());
        }
        return "redirect:/";
    }
}
