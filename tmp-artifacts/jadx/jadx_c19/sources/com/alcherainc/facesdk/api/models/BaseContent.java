package com.alcherainc.facesdk.api.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BaseContent {

    @SerializedName("version")
    protected String version = "";

    @SerializedName("threshold")
    protected Threshold threshold = null;
}
