package com.kt.ollehusimmanager.rcvdata;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class AppletInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private String u;
    private String v;

    protected AppletInfo(Parcel parcel) {
        this.u = parcel.readString();
        this.v = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppletLock() {
        return this.v;
    }

    public String getAppletStatus() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.u);
        parcel.writeString(this.v);
    }
}
