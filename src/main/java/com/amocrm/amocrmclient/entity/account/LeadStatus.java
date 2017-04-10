package com.amocrm.amocrmclient.entity.account;


import com.google.gson.annotations.SerializedName;

public class LeadStatus {

    public Long id;

    public String name;

    @SerializedName("pipeline_id")
    public Long pipelineId;

    public Long sort;

    public String color;

    public String editable;
}
