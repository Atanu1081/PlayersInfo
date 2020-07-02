package com.espninfo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PlayerInfoNotFoundException extends RuntimeException {
    public PlayerInfoNotFoundException(String s) {
    }
}
