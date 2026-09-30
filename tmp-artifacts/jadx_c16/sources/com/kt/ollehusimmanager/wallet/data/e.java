package com.kt.ollehusimmanager.wallet.data;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class e implements Parcelable {
    public static Parcelable.Creator CREATOR = new f();
    private String ac;
    private int type;

    public e() {
    }

    public e(Parcel parcel) {
        this.ac = parcel.readString();
        this.type = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ac);
        parcel.writeInt(this.type);
    }
}
