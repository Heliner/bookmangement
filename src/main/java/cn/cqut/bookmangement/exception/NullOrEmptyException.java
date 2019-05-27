package cn.cqut.bookmangement.exception;

public class NullOrEmptyException  extends RuntimeException{
    public NullOrEmptyException(String message) {
        super(message);
    }
}
