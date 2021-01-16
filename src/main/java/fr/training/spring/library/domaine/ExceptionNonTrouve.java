package fr.training.spring.library.domaine;


public class ExceptionNonTrouve extends RuntimeException {

    private String errorCode;


    public ExceptionNonTrouve(String message, String errorCode) {
        super (message);

        this.errorCode = errorCode;

    }
        public String getErrorCode() {
            return errorCode;
        }

    }


