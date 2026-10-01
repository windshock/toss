package com.alibaba.ariver.engine.api.bridge.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class NativeCallContext$StatData implements Parcelable {
    public static final Parcelable.Creator<NativeCallContext$StatData> CREATOR = new Parcelable.Creator<NativeCallContext$StatData>() { // from class: com.alibaba.ariver.engine.api.bridge.model.NativeCallContext$StatData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NativeCallContext$StatData createFromParcel(Parcel parcel) {
            return new NativeCallContext$StatData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NativeCallContext$StatData[] newArray(int i2) {
            return new NativeCallContext$StatData[i2];
        }
    };
    public long callbackTimeStamp;
    public long executeTimeStamp;
    public long triggerTimeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NativeCallContext$StatData() {
    }

    protected NativeCallContext$StatData(Parcel parcel) {
        this.triggerTimeStamp = parcel.readLong();
        this.executeTimeStamp = parcel.readLong();
        this.callbackTimeStamp = parcel.readLong();
    }

    public void copyData(NativeCallContext$StatData nativeCallContext$StatData) {
        if (nativeCallContext$StatData == null) {
            return;
        }
        this.triggerTimeStamp = nativeCallContext$StatData.triggerTimeStamp;
        this.executeTimeStamp = nativeCallContext$StatData.executeTimeStamp;
        this.callbackTimeStamp = nativeCallContext$StatData.callbackTimeStamp;
    }

    public String print() {
        return "total(" + (this.callbackTimeStamp - this.triggerTimeStamp) + ")|dispatch(" + (this.executeTimeStamp - this.triggerTimeStamp) + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.triggerTimeStamp);
        parcel.writeLong(this.executeTimeStamp);
        parcel.writeLong(this.callbackTimeStamp);
    }
}
