
package com.ingenicomovement.fieldserviceagent.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseDetailAssign {

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
    private List<DataDetail> data = new ArrayList<DataDetail>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseDetailAssign() {
    }

    /**
     * 
     * @param total
     * @param data
     * @param success
     * @param message
     */
    public ResponseDetailAssign(String success, Object message, Object total, List<DataDetail> data) {
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

    public List<DataDetail> getData() {
        return data;
    }

    public void setData(List<DataDetail> data) {
        this.data = data;
    }

}
