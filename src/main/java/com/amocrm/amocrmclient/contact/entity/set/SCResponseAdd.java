package com.amocrm.amocrmclient.contact.entity.set;


import com.google.gson.annotations.SerializedName;

public class SCResponseAdd {

    public Long id;

    @SerializedName("request_id")
    public Long requestId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }
}
