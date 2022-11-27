package com.tro.tarotcardsimpl.exception.handler;

import com.tro.tarotcardsimpl.exception.ApiError;
import com.tro.tarotcardsimpl.exception.BaseApplicationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static com.tro.tarotcardsimpl.constant.ExceptionMessageConstants.SERVICE_EXCEPTION;

@Slf4j
@RestControllerAdvice
public class BusinessExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BaseApplicationException.class)
    public ApiError handleServiceException(BaseApplicationException exception) {
        log.info("Service exception: {}", exception.getMessage());
        return ApiError.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(exception.getMessage())
                .details(SERVICE_EXCEPTION).build();
    }
}
