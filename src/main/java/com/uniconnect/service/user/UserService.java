package com.uniconnect.service.user;
import com.uniconnect.model.user.LoginAuthForm;
import com.uniconnect.model.user.User;
import com.uniconnect.model.user.UserSaveForm;
import com.uniconnect.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(UserSaveForm userSaveForm) {
        User user = new User();
        user.setName(userSaveForm.getName());
        user.setEmail(userSaveForm.getEmail());
        user.setPassword(userSaveForm.getPassword());

        userRepository.save(user);
    }

    public void authLogin(LoginAuthForm loginAuthForm, RedirectAttributes redirectAttributes) {
        User user = userRepository.findByEmail(loginAuthForm.getEmail());

        if (user == null) return;
        if (!Objects.equals(user.getEmail(), loginAuthForm.getEmail())) return;
        if (!Objects.equals(user.getPassword(), loginAuthForm.getPassword())) return;

        redirectAttributes.addFlashAttribute("authenticated", loginAuthForm.getEmail());
    }
}
