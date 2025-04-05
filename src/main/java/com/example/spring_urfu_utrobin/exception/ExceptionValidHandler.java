package com.example.spring_urfu_utrobin.exception;

import com.example.spring_urfu_utrobin.violation.ValidationErrorResponse;
import com.example.spring_urfu_utrobin.violation.Violation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

@RestControllerAdvice
public class ExceptionValidHandler {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private LocaleResolver localeResolver;

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<ValidationErrorResponse> onConstraintValidationException(HttpServletRequest request, ConstraintViolationException e) {
        ValidationErrorResponse error = new ValidationErrorResponse();
        Locale locale = localeResolver.resolveLocale(request);
        for (ConstraintViolation violation : e.getConstraintViolations()) {
            String localizedMessage = messageSource.getMessage(violation.getMessage(), null, locale);
            error.getViolations().add(
                    new Violation(violation.getPropertyPath().toString(), localizedMessage));
        }
        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<ValidationErrorResponse> onMethodArgumentNotValidException(HttpServletRequest request, MethodArgumentNotValidException e) {
        Locale locale = localeResolver.resolveLocale(request);
        ValidationErrorResponse error = new ValidationErrorResponse();
        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            String localizedMessage = messageSource.getMessage(fieldError.getDefaultMessage(), null, locale);
            error.getViolations().add(
                    new Violation(fieldError.getField(), localizedMessage));
        }
        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
