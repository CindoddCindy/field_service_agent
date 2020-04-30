
package com.ingenicomovement.fieldserviceagent.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataDone {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("customer")
    @Expose
    private String customer;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataDone() {
    }

    /**
     * 
     * @param ticketNumber
     * @param note
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
     * @param importBank
     * @param initCode
     * @param _case
     * @param contractNumber
     * @param sla
     * @param spkNumber
     * @param workType
     * @param merchantAddress
     * @param snSim
     * @param category
     * @param damageType
     * @param customer
     */
    public DataDone(String id, String category, String customer, String importDate, String importTicketReceive, String importBank, String bank, String _case, String contractNumber, String ticketNumber, String spkNumber, String workType, String tid, String tidCimb, String mid, String merchantName, String merchantAddress, String merchantAddress2, String postalCode, String city, String picName, String picNumber, String note, String damageType, String initCode, String sla, String snEdc, String snSim) {
        super();
        this.id = id;
        this.category = category;
        this.customer = customer;
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
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
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

}
