package fr.training.spring.library.exposition;


import fr.training.spring.library.domaine.ExceptionNonTrouve;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.logging.Logger;

@ControllerAdvice
public class ExceptionController extends Exception {

//     private static  Logger logger = (Logger) LoggerFactory.getLogger (ExceptionController.class);

    @ResponseBody
    @ExceptionHandler(ExceptionNonTrouve.class)

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String libraryNotFound(ExceptionNonTrouve exception){


        String errorCode= exception.getErrorCode ();
//        logger.info ("Erreur {} {}" , errorCode, exception.getErrorCode());
       return errorCode;
    }




}
