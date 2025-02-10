package dev.lschen.booknet.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class AuthenticationResponse {

    private final String token;

}
