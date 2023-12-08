package com.uniconnect.service.user;
import com.uniconnect.model.user.LoginAuthForm;
import com.uniconnect.model.user.User;
import com.uniconnect.model.user.UserSaveForm;
import com.uniconnect.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Boolean authLogin(LoginAuthForm loginAuthForm) {
        User user = userRepository.findByEmail(loginAuthForm.getEmail());

        if (user == null) return false;
        if (!Objects.equals(user.getEmail(), loginAuthForm.getEmail())) return false;

        return Objects.equals(user.getPassword(), loginAuthForm.getPassword());
    }
}
