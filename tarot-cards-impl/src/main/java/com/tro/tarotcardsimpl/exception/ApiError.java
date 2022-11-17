package com.tro.tarotcardsimpl.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(value = {"httpStatus", "message", "details", "timestamp"})
public class ApiError {

    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();
    private HttpStatus httpStatus;
    private String message;
    private String details;
}
