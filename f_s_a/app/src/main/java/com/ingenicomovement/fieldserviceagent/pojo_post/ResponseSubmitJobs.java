
package com.ingenicomovement.fieldserviceagent.pojo_post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseSubmitJobs {

    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Object data;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseSubmitJobs() {
    }

    /**
     * 
     * @param data
     * @param success
     * @param message
     */
    public ResponseSubmitJobs(String success, String message, Object data) {
        super();
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
