package com.ipageon.subsif;

import java.rmi.RemoteException;

import javax.lang.model.type.UnknownTypeException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExceptionController {

    // 400
    @ExceptionHandler(RemoteException.class)
    public ResponseEntity<Object> RemoteException(final RemoteException ex) {
        log.warn("Remote Exception error", ex);
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    // 400
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> BadRequestException(final RuntimeException ex) {
        log.warn("Runtime Exception error", ex);
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
    
    @ExceptionHandler( UnknownTypeException.class )
    public final ResponseEntity<Object> handleUserNotFoundException(UnknownTypeException ex, WebRequest request) {
        log.warn("UnknownType Exception error", ex);
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
    
    // 500
    @ExceptionHandler( Exception.class )
    public final ResponseEntity<Object> CommonException(final Exception ex) {
        log.info(ex.getClass().getName());
        log.error("error", ex);
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}