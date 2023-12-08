package com.uniconnect.service.user;
import com.uniconnect.model.user.LoginSaveForm;
import com.uniconnect.model.user.User;
import com.uniconnect.model.user.UserSaveForm;
import com.uniconnect.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void saveLogin(LoginSaveForm loginSaveForm) {
        User user = new User();
        user.setName(loginSaveForm.getName());
        user.setPassword(loginSaveForm.getPassword());

        userRepository.save(user);
    }
}
