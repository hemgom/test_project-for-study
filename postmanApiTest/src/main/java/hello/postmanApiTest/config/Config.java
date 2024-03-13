package hello.postmanApiTest.config;

import hello.postmanApiTest.repository.MemberRepository;
import hello.postmanApiTest.repository.MemberRepositoryImpl;
import hello.postmanApiTest.service.MemberService;
import hello.postmanApiTest.service.MemberServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private final EntityManager em;

    public Config(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepositoryImpl(em);
    }

}
