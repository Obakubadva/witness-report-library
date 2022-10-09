package com.fbi.witnessreportlibrary;

import java.util.ArrayList;
import java.util.List;

public class CaseItem {
    private String title;
   private String reward, caution, remarks, details, ares;

   public CaseItem(){

   }

    public CaseItem(String title, String reward, String caution, String remarks, String details, String ares) {
        this.title = title;
        this.reward = reward;
        this.caution = caution;
        this.remarks = remarks;
        this.details = details;
        this.ares = ares;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getCaution() {
        return caution;
    }

    public void setCaution(String caution) {
        this.caution = caution;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAres() {
        return ares;
    }

    public void setAres(String ares) {
        this.ares = ares;
    }
}
