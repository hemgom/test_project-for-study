package hello.jwtTest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Jwt {

    private String grantType;
    private String accessToken;
    private String refreshToken;

}
