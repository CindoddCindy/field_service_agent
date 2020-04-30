
package com.ingenicomovement.fieldserviceagent.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseDoneAssign {

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
    private List<DataDone> data = new ArrayList<DataDone>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseDoneAssign() {
    }

    /**
     * 
     * @param total
     * @param data
     * @param success
     * @param message
     */
    public ResponseDoneAssign(String success, Object message, String total, List<DataDone> data) {
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

    public List<DataDone> getData() {
        return data;
    }

    public void setData(List<DataDone> data) {
        this.data = data;
    }

}
