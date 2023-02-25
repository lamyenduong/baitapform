package com.example.baitapmobile2;

import java.io.Serializable;

public class info_save implements Serializable {
    protected String name;
    protected String phone;
    protected Boolean gender;
    protected String trinhdo;
    protected String tuoi;
    protected Boolean thethao;
    protected String amnhac;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Boolean getGender() {
        return gender;
    }
    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    public String getTrinhdo() {
        return trinhdo;
    }
    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
    public String getTuoi() {
        return tuoi;
    }
    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
    public Boolean getThethao() {
        return thethao;
    }
    public void setThethao(Boolean thethao) {
        this.thethao = thethao;
    }
    public String getAmnhac() {
        return amnhac;
    }
    public void setAmnhac(String amnhac) {
        this.amnhac = amnhac;
    }

    public info_save(String name, String phone, Boolean gender, String trinhdo, String tuoi, Boolean thethao, String amnhac) {
        super();
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.trinhdo = trinhdo;
        this.tuoi = tuoi;
        this.thethao = thethao;
        this.amnhac = amnhac;
    }
}