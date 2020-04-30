
package com.ingenicomovement.fieldserviceagent.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataStatus {

    @SerializedName("sum_Month")
    @Expose
    private String sumMonth;
    @SerializedName("sum_Week")
    @Expose
    private String sumWeek;
    @SerializedName("sum_Today")
    @Expose
    private String sumToday;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataStatus() {
    }

    /**
     * 
     * @param sumToday
     * @param sumWeek
     * @param sumMonth
     */
    public DataStatus(String sumMonth, String sumWeek, String sumToday) {
        super();
        this.sumMonth = sumMonth;
        this.sumWeek = sumWeek;
        this.sumToday = sumToday;
    }

    public String getSumMonth() {
        return sumMonth;
    }

    public void setSumMonth(String sumMonth) {
        this.sumMonth = sumMonth;
    }

    public String getSumWeek() {
        return sumWeek;
    }

    public void setSumWeek(String sumWeek) {
        this.sumWeek = sumWeek;
    }

    public String getSumToday() {
        return sumToday;
    }

    public void setSumToday(String sumToday) {
        this.sumToday = sumToday;
    }

}
