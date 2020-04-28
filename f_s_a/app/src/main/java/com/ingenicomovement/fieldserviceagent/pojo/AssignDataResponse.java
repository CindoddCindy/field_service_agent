
package com.ingenicomovement.fieldserviceagent.pojo;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AssignDataResponse implements Parcelable
{

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
    private List<DataItem> data = new ArrayList<DataItem>();
    public final static Creator<AssignDataResponse> CREATOR = new Creator<AssignDataResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public AssignDataResponse createFromParcel(Parcel in) {
            return new AssignDataResponse(in);
        }

        public AssignDataResponse[] newArray(int size) {
            return (new AssignDataResponse[size]);
        }

    }
    ;

    protected AssignDataResponse(Parcel in) {
        this.success = ((String) in.readValue((String.class.getClassLoader())));
        this.message = ((Object) in.readValue((Object.class.getClassLoader())));
        this.total = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data, (Datum.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public AssignDataResponse() {
    }

    /**
     * 
     * @param total
     * @param data
     * @param success
     * @param message
     */
    public AssignDataResponse(String success, Object message, String total, List<DataItem> data) {
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

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(success);
        dest.writeValue(message);
        dest.writeValue(total);
        dest.writeList(data);
    }

    public int describeContents() {
        return  0;
    }

}
