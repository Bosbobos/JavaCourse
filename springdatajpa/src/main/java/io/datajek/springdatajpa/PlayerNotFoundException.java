package io.datajek.springdatajpa;

public class PlayerNotFoundException extends RuntimeException{
    public PlayerNotFoundException() {
        super();
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }

    public PlayerNotFoundException(int id) {
        super("Player with id " + id + " not found");
    }

    public PlayerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerNotFoundException(Throwable cause) {
        super(cause);
    }
}
