package com.alibaba.griver.api.ui.splash;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SplashEntryInfo implements Parcelable {
    public static final Parcelable.Creator<SplashEntryInfo> CREATOR = new Parcelable.Creator<SplashEntryInfo>() { // from class: com.alibaba.griver.api.ui.splash.SplashEntryInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SplashEntryInfo createFromParcel(Parcel parcel) {
            return new SplashEntryInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SplashEntryInfo[] newArray(int i2) {
            return new SplashEntryInfo[i2];
        }
    };
    public static final String NEED_REFRESH = "needRefresh";
    public static final String PROGRESS = "progress";
    public String appId;
    public String appName;
    public String desc;
    public String iconUrl;
    public boolean needRefresh;
    public int progress;
    public String slogan;

    public SplashEntryInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SplashEntryInfo{appId='" + this.appId + "', appName='" + this.appName + "', iconUrl='" + this.iconUrl + "', desc='" + this.desc + "', slogan='" + this.slogan + "', progress=" + this.progress + ", needRefresh=" + this.needRefresh + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.appId);
        parcel.writeString(this.appName);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.desc);
        parcel.writeString(this.slogan);
        parcel.writeInt(this.progress);
        parcel.writeByte(this.needRefresh ? (byte) 1 : (byte) 0);
    }

    public SplashEntryInfo(Parcel parcel) {
        this.appId = parcel.readString();
        this.appName = parcel.readString();
        this.iconUrl = parcel.readString();
        this.desc = parcel.readString();
        this.slogan = parcel.readString();
        this.progress = parcel.readInt();
        this.needRefresh = parcel.readByte() != 0;
    }
}
