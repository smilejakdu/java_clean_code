package clean.code.houseutils.exception;

public class HouseUtilsException extends RuntimeException {
    private ErrorCode errorCode;
    private String message;

    public HouseUtilsException(ErrorCode errorCode) {
        this(errorCode, errorCode.getMessage());
    }

    public HouseUtilsException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }
}
