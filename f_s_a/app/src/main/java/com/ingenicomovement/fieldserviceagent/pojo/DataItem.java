
package com.ingenicomovement.fieldserviceagent.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataItem implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("import_Date")
    @Expose
    private String importDate;
    @SerializedName("import_Ticket_Receive")
    @Expose
    private String importTicketReceive;
    @SerializedName("import_Bank")
    @Expose
    private String importBank;
    @SerializedName("bank")
    @Expose
    private String bank;
    @SerializedName("case")
    @Expose
    private String _case;
    @SerializedName("contract_Number")
    @Expose
    private String contractNumber;
    @SerializedName("ticket_Number")
    @Expose
    private String ticketNumber;
    @SerializedName("spk_Number")
    @Expose
    private String spkNumber;
    @SerializedName("work_Type")
    @Expose
    private String workType;
    @SerializedName("tid")
    @Expose
    private String tid;
    @SerializedName("tid_Cimb")
    @Expose
    private String tidCimb;
    @SerializedName("mid")
    @Expose
    private String mid;
    @SerializedName("merchant_Name")
    @Expose
    private String merchantName;
    @SerializedName("merchant_Address")
    @Expose
    private String merchantAddress;
    @SerializedName("merchant_Address_2")
    @Expose
    private String merchantAddress2;
    @SerializedName("postal_Code")
    @Expose
    private String postalCode;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("pic_Name")
    @Expose
    private String picName;
    @SerializedName("pic_Number")
    @Expose
    private String picNumber;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("damage_Type")
    @Expose
    private String damageType;
    @SerializedName("init_Code")
    @Expose
    private String initCode;
    @SerializedName("sla")
    @Expose
    private String sla;
    @SerializedName("sn_Edc")
    @Expose
    private String snEdc;
    @SerializedName("sn_Sim")
    @Expose
    private String snSim;
    @SerializedName("assign_To_Date")
    @Expose
    private String assignToDate;
    @SerializedName("assign_To_Status")
    @Expose
    private String assignToStatus;
    @SerializedName("sum_Month")
    @Expose
    private Object sumMonth;
    @SerializedName("sum_Week")
    @Expose
    private Object sumWeek;
    @SerializedName("sum_Today")
    @Expose
    private Object sumToday;
    public final static Creator<DataItem> CREATOR = new Creator<DataItem>() {


        @SuppressWarnings({
            "unchecked"
        })

        public DataItem createFromParcel(Parcel in) {
            return new DataItem(in);
        }

        public DataItem[] newArray(int size) {
            return (new DataItem[size]);
        }



    }
    ;

    protected DataItem(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.importDate = ((String) in.readValue((String.class.getClassLoader())));
        this.importTicketReceive = ((String) in.readValue((String.class.getClassLoader())));
        this.importBank = ((String) in.readValue((String.class.getClassLoader())));
        this.bank = ((String) in.readValue((String.class.getClassLoader())));
        this._case = ((String) in.readValue((String.class.getClassLoader())));
        this.contractNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.ticketNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.spkNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.workType = ((String) in.readValue((String.class.getClassLoader())));
        this.tid = ((String) in.readValue((String.class.getClassLoader())));
        this.tidCimb = ((String) in.readValue((String.class.getClassLoader())));
        this.mid = ((String) in.readValue((String.class.getClassLoader())));
        this.merchantName = ((String) in.readValue((String.class.getClassLoader())));
        this.merchantAddress = ((String) in.readValue((String.class.getClassLoader())));
        this.merchantAddress2 = ((String) in.readValue((String.class.getClassLoader())));
        this.postalCode = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.picName = ((String) in.readValue((String.class.getClassLoader())));
        this.picNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.note = ((String) in.readValue((String.class.getClassLoader())));
        this.damageType = ((String) in.readValue((String.class.getClassLoader())));
        this.initCode = ((String) in.readValue((String.class.getClassLoader())));
        this.sla = ((String) in.readValue((String.class.getClassLoader())));
        this.snEdc = ((String) in.readValue((String.class.getClassLoader())));
        this.snSim = ((String) in.readValue((String.class.getClassLoader())));
        this.assignToDate = ((String) in.readValue((String.class.getClassLoader())));
        this.assignToStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.sumMonth = ((Object) in.readValue((Object.class.getClassLoader())));
        this.sumWeek = ((Object) in.readValue((Object.class.getClassLoader())));
        this.sumToday = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataItem() {
    }

    /**
     * 
     * @param ticketNumber
     * @param note
     * @param assignToStatus
     * @param sumToday
     * @param city
     * @param postalCode
     * @param mid
     * @param tidCimb
     * @param picName
     * @param tid
     * @param snEdc
     * @param merchantName
     * @param bank
     * @param merchantAddress2
     * @param importDate
     * @param importTicketReceive
     * @param id
     * @param picNumber
     * @param sumWeek
     * @param sumMonth
     * @param importBank
     * @param initCode
     * @param _case
     * @param contractNumber
     * @param sla
     * @param spkNumber
     * @param assignToDate
     * @param workType
     * @param merchantAddress
     * @param snSim
     * @param damageType
     */
    public DataItem(String id, String importDate, String importTicketReceive, String importBank, String bank, String _case, String contractNumber, String ticketNumber, String spkNumber, String workType, String tid, String tidCimb, String mid, String merchantName, String merchantAddress, String merchantAddress2, String postalCode, String city, String picName, String picNumber, String note, String damageType, String initCode, String sla, String snEdc, String snSim, String assignToDate, String assignToStatus, Object sumMonth, Object sumWeek, Object sumToday) {
        super();
        this.id = id;
        this.importDate = importDate;
        this.importTicketReceive = importTicketReceive;
        this.importBank = importBank;
        this.bank = bank;
        this._case = _case;
        this.contractNumber = contractNumber;
        this.ticketNumber = ticketNumber;
        this.spkNumber = spkNumber;
        this.workType = workType;
        this.tid = tid;
        this.tidCimb = tidCimb;
        this.mid = mid;
        this.merchantName = merchantName;
        this.merchantAddress = merchantAddress;
        this.merchantAddress2 = merchantAddress2;
        this.postalCode = postalCode;
        this.city = city;
        this.picName = picName;
        this.picNumber = picNumber;
        this.note = note;
        this.damageType = damageType;
        this.initCode = initCode;
        this.sla = sla;
        this.snEdc = snEdc;
        this.snSim = snSim;
        this.assignToDate = assignToDate;
        this.assignToStatus = assignToStatus;
        this.sumMonth = sumMonth;
        this.sumWeek = sumWeek;
        this.sumToday = sumToday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }

    public String getImportTicketReceive() {
        return importTicketReceive;
    }

    public void setImportTicketReceive(String importTicketReceive) {
        this.importTicketReceive = importTicketReceive;
    }

    public String getImportBank() {
        return importBank;
    }

    public void setImportBank(String importBank) {
        this.importBank = importBank;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCase() {
        return _case;
    }

    public void setCase(String _case) {
        this._case = _case;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getSpkNumber() {
        return spkNumber;
    }

    public void setSpkNumber(String spkNumber) {
        this.spkNumber = spkNumber;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTidCimb() {
        return tidCimb;
    }

    public void setTidCimb(String tidCimb) {
        this.tidCimb = tidCimb;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getMerchantAddress2() {
        return merchantAddress2;
    }

    public void setMerchantAddress2(String merchantAddress2) {
        this.merchantAddress2 = merchantAddress2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicNumber() {
        return picNumber;
    }

    public void setPicNumber(String picNumber) {
        this.picNumber = picNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getInitCode() {
        return initCode;
    }

    public void setInitCode(String initCode) {
        this.initCode = initCode;
    }

    public String getSla() {
        return sla;
    }

    public void setSla(String sla) {
        this.sla = sla;
    }

    public String getSnEdc() {
        return snEdc;
    }

    public void setSnEdc(String snEdc) {
        this.snEdc = snEdc;
    }

    public String getSnSim() {
        return snSim;
    }

    public void setSnSim(String snSim) {
        this.snSim = snSim;
    }

    public String getAssignToDate() {
        return assignToDate;
    }

    public void setAssignToDate(String assignToDate) {
        this.assignToDate = assignToDate;
    }

    public String getAssignToStatus() {
        return assignToStatus;
    }

    public void setAssignToStatus(String assignToStatus) {
        this.assignToStatus = assignToStatus;
    }

    public Object getSumMonth() {
        return sumMonth;
    }

    public void setSumMonth(Object sumMonth) {
        this.sumMonth = sumMonth;
    }

    public Object getSumWeek() {
        return sumWeek;
    }

    public void setSumWeek(Object sumWeek) {
        this.sumWeek = sumWeek;
    }

    public Object getSumToday() {
        return sumToday;
    }

    public void setSumToday(Object sumToday) {
        this.sumToday = sumToday;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(importDate);
        dest.writeValue(importTicketReceive);
        dest.writeValue(importBank);
        dest.writeValue(bank);
        dest.writeValue(_case);
        dest.writeValue(contractNumber);
        dest.writeValue(ticketNumber);
        dest.writeValue(spkNumber);
        dest.writeValue(workType);
        dest.writeValue(tid);
        dest.writeValue(tidCimb);
        dest.writeValue(mid);
        dest.writeValue(merchantName);
        dest.writeValue(merchantAddress);
        dest.writeValue(merchantAddress2);
        dest.writeValue(postalCode);
        dest.writeValue(city);
        dest.writeValue(picName);
        dest.writeValue(picNumber);
        dest.writeValue(note);
        dest.writeValue(damageType);
        dest.writeValue(initCode);
        dest.writeValue(sla);
        dest.writeValue(snEdc);
        dest.writeValue(snSim);
        dest.writeValue(assignToDate);
        dest.writeValue(assignToStatus);
        dest.writeValue(sumMonth);
        dest.writeValue(sumWeek);
        dest.writeValue(sumToday);
    }

    public int describeContents() {
        return  0;
    }

}
