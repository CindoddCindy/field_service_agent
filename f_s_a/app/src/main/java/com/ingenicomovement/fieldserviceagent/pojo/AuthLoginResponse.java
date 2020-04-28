
package com.ingenicomovement.fieldserviceagent.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class AuthLoginResponse {

    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("data")
    @Expose
    private List<Datum> data = new ArrayList<Datum>();

    /**
     * No args constructor for use in serialization
     *
     */
    public AuthLoginResponse() {
    }

    /**
     *
     * @param data
     * @param success
     * @param message
     */
    public AuthLoginResponse(String success, Object message, List<Datum> data) {
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

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }


}
