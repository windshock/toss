package com.kt.ollehusimmanager.wallet.data;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class a implements Parcelable {
    public static Parcelable.Creator CREATOR = new b();
    private byte H;
    private byte I;
    private byte[] J;
    private byte[] K;
    private byte[] L;
    private String M;
    private String N;
    private int O;
    private byte[] P;
    private int Q;
    private byte R;
    private byte S;
    private byte[] T;
    private byte U;
    private byte V;
    private byte W;
    private byte[] X;

    public a(Parcel parcel) {
        this.H = parcel.readByte();
        this.I = parcel.readByte();
        this.J = parcel.createByteArray();
        this.K = parcel.createByteArray();
        this.L = parcel.createByteArray();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.O = parcel.readInt();
        this.P = parcel.createByteArray();
        this.Q = parcel.readInt();
        this.R = parcel.readByte();
        this.S = parcel.readByte();
        this.T = parcel.createByteArray();
        this.U = parcel.readByte();
        this.V = parcel.readByte();
        this.W = parcel.readByte();
        this.X = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.H);
        parcel.writeByte(this.I);
        parcel.writeByteArray(this.J);
        parcel.writeByteArray(this.K);
        parcel.writeByteArray(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.O);
        parcel.writeByteArray(this.P);
        parcel.writeInt(this.Q);
        parcel.writeByte(this.R);
        parcel.writeByte(this.S);
        parcel.writeByteArray(this.T);
        parcel.writeByte(this.U);
        parcel.writeByte(this.V);
        parcel.writeByte(this.W);
        parcel.writeByteArray(this.X);
    }
}
