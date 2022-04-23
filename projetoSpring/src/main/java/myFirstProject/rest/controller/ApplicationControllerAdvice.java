package myFirstProject.rest.controller;

import myFirstProject.exception.RegraNegocioException;
import myFirstProject.rest.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(RegraNegocioException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleRegraNegocioException(RegraNegocioException ex){
        String mensagemErro=ex.getMessage();
        return new ApiErrors(mensagemErro);
    }

}
