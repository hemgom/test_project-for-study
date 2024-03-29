package hello.postmanApiTest.repository;

import hello.postmanApiTest.member.Member;

import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long id);

}
