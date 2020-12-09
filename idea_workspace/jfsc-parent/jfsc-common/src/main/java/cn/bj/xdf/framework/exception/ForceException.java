package cn.bj.xdf.framework.exception;

/**
 * @author liupeng
 * @date 2020/8/11-13:20
 **/
public class ForceException  extends Exception{
    public ForceException() {
        super();
    }

    public ForceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ForceException(String message) {
        super(message);
    }

    public ForceException(Throwable cause) {
        super(cause);
    }
}
