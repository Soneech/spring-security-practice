package org.soneech.springcourse.exception;

import org.springframework.security.core.AuthenticationException;

public class AuthException extends AuthenticationException {
    public AuthException(String message) {
        super(message);
    }
}
