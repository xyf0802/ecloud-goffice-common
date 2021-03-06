package com.telecom.ecloudbpm.goffice.common.response;

/**
 * @author pong
 * @date 2020-08-28
 */
public class ParamCheckResult {
    private Boolean success;
    private int rowNum;
    private String keyWord;
    private String message;

    public ParamCheckResult() {

    }

    public ParamCheckResult(Boolean success, int rowNum, String keyWord, String message) {
        this.success = success;
        this.rowNum = rowNum;
        this.keyWord = keyWord;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
