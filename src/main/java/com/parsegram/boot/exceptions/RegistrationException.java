package com.parsegram.boot.exceptions;

public class RegistrationException extends RuntimeException {
    private final String id;

    public RegistrationException(String id) {
        super(id);
        this.id = id;
    }

    public RegistrationException(ID id) {
        super(id.getBaseText());
        this.id = id.name();
    }

    public RegistrationException(String id, String message) {
        super(message);
        this.id = id;
    }

    public enum ID {
        EMAIL_IS_USED("Пользователь с такми эмайлом уже существет"),
        EMAIL_NOT_VALID("Введенный email не валиден"),
       ;

        private final String baseText;

        ID(String baseText) {
            this.baseText = baseText;
        }

        public String getBaseText() {
            return baseText;
        }
    }
}
