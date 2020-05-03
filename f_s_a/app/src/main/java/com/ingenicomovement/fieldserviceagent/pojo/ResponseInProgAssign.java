
package com.ingenicomovement.fieldserviceagent.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseInProgAssign {

    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("data")
    @Expose
    private List<DataInProgress> data = new ArrayList<DataInProgress>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseInProgAssign() {
    }

    /**
     * 
     * @param total
     * @param data
     * @param success
     * @param message
     */
    public ResponseInProgAssign(String success, Object message, String total, List<DataInProgress> data) {
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<DataInProgress> getData() {
        return data;
    }

    public void setData(List<DataInProgress> data) {
        this.data = data;
    }

}
