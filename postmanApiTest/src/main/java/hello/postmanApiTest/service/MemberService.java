package hello.postmanApiTest.service;

import hello.postmanApiTest.member.Member;

import java.util.Optional;

public interface MemberService {

    Member save(Member member);

    Optional<Member> findById(Long id);

}
