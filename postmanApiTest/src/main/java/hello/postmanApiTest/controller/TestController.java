package hello.postmanApiTest.controller;

import hello.postmanApiTest.member.Member;
import hello.postmanApiTest.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {

    private final MemberService memberService;

    @GetMapping("/getTest")
    public String getTest() {
        return "get success";
    }

    @GetMapping("/getTest/{id}")
    public Optional<Member> findUser(@PathVariable Long id) {
        Member user = memberService.findById(id).get();
        return Optional.ofNullable(user);
    }

    @PostMapping("/postTest")
    public String postTest() {
        return "post success";
    }

    @PostMapping("/addUser")
    public Member addMember(@RequestBody Member member) {
        return memberService.save(member);
    }

}
