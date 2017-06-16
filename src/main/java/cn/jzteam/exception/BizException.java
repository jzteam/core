package cn.jzteam.exception;

import javax.servlet.ServletException;

import cn.jzteam.utils.PropUtil;


public class BizException extends ServletException implements IMessageCode {

    private static final long serialVersionUID = 3474261298168855986L;

    private static final String DEFAULT_ERRCODE = "5000";

    private String errCode;

    public BizException(IMessageCode messageCode) {
        super(messageCode.message());
        setErrCode(messageCode);
    }

    public BizException(IMessageCode messageCode, Throwable cause) {
        super(messageCode.message(), cause);
        setErrCode(messageCode);
    }

    public BizException(String code, String message) {
        super(message);
        setErrCode(code);
    }

    public BizException(String message) {
        super(message);
        setErrCode(DEFAULT_ERRCODE);
    }

    private void setErrCode(IMessageCode messageCode) {
        setErrCode(messageCode.code());
    }

    private void setErrCode(String code) {
        this.errCode = code;
    }

    /**
     * 判断code是否业务异常
     * 
     * @param code
     * @return
     */
    public static boolean isBizException(String code) {
        return code.indexOf("_") != -1;
    }

    public void commit() {
        this.errCode = PropUtil.getInstance().get("project.client_id") + "_" + errCode;
    }

    public void recover() {
        int pos = errCode.indexOf("_");
        if (pos != -1) {
            this.errCode = errCode.substring(pos + 1);
        }
    }

    public String code() {
        return errCode;
    }

    public String message() {
        return getMessage();
    }
}
