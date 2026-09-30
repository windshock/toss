package com.kt.ollehusimmanager.rcvdata;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class OTAResultData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    private Object C;

    public OTAResultData() {
    }

    protected OTAResultData(Parcel parcel) {
        this.C = parcel.readValue(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object getResultData() {
        return this.C;
    }

    public void setResultData(Object obj) {
        this.C = obj;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.C);
    }
}
