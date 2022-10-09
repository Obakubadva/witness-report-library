package com.fbi.witnessreportlibrary.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CaseModel {

    @JsonProperty("title")
    private String title;

    @JsonProperty("eyes_raw")
    private String eyes_raw;

    @JsonProperty("place_of_birth")
    private String place_of_birth;

    public CaseModel() {
    }

    public CaseModel(String title, String eyes_raw, String place_of_birth) {
        this.title = title;
        this.eyes_raw = eyes_raw;
        this.place_of_birth = place_of_birth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEyes_raw() {
        return eyes_raw;
    }

    public void setEyes_raw(String eyes_raw) {
        this.eyes_raw = eyes_raw;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }
}
