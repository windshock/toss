package com.kt.ollehusimmanager.wallet.data;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class c implements Parcelable {
    public static Parcelable.Creator CREATOR = new d();
    private byte[] X;
    private byte Y;
    private byte Z;
    private String aa;
    private String ab;

    private c(Parcel parcel) {
        this.Y = parcel.readByte();
        this.Z = parcel.readByte();
        this.aa = parcel.readString();
        this.ab = parcel.readString();
        this.X = parcel.createByteArray();
    }

    /* synthetic */ c(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.Y);
        parcel.writeByte(this.Z);
        parcel.writeString(this.aa);
        parcel.writeString(this.ab);
        parcel.writeByteArray(this.X);
    }
}
