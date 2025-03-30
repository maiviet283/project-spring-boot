package maiviet.com.chuyen_de.controller;

import maiviet.com.chuyen_de.models.User;
import maiviet.com.chuyen_de.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/profile")
    public Map<String, Object> getProfile(@AuthenticationPrincipal UserDetails userDetails) {
        User user = userRepository.findByUsername(userDetails.getUsername());

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Lấy Thông Tin của Quý Khách Thành Công");
        response.put("data", user);

        return response;
    }
}
