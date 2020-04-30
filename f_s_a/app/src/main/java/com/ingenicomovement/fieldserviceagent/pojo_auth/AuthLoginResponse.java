
package com.ingenicomovement.fieldserviceagent.pojo_auth;

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
    @SerializedName("total")
    @Expose
    private Object total;
    @SerializedName("data")
    @Expose
    private List<DataAuth> data = new ArrayList<DataAuth>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AuthLoginResponse() {
    }

    /**
     * 
     * @param total
     * @param data
     * @param success
     * @param message
     */
    public AuthLoginResponse(String success, Object message, Object total, List<DataAuth> data) {
        super();
        this.success = success;
        this.message = message;
        this.total = total;
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

    public Object getTotal() {
        return total;
    }

    public void setTotal(Object total) {
        this.total = total;
    }

    public List<DataAuth> getData() {
        return data;
    }

    public void setData(List<DataAuth> data) {
        this.data = data;
    }

    /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("success", success).append("message", message).append("total", total).append("data", data).toString();
    }

     */

}
