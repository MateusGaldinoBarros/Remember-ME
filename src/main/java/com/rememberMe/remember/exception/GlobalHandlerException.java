package com.rememberMe.remember.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.List;


@RestControllerAdvice
public class GlobalHandlerException {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiError> IllegalArgumentException(Exception ex) {
        ApiError apiError= new ApiError(LocalDateTime.now(), HttpStatus.UNPROCESSABLE_ENTITY.value(),HttpStatus.UNPROCESSABLE_ENTITY.name(), List.of(ex.getMessage()));

        return new ResponseEntity<>(apiError,HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
