package hello.jwtTest.controller;

import hello.jwtTest.dto.Jwt;
import hello.jwtTest.dto.SignInDto;
import hello.jwtTest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class JwtController {

    private final UserService userService;

    @PostMapping("/sign-in")
    public Jwt signIn(@RequestBody SignInDto signInDto) {
        String username = signInDto.getUsername();
        String password = signInDto.getPassword();
        return userService.signIn(username, password);
    }

    @PostMapping("/test")
    public String test() {
        return "success";
    }

}
