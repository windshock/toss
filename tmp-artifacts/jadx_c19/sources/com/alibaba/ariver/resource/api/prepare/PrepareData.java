package com.alibaba.ariver.resource.api.prepare;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PrepareData implements Parcelable {
    public static final Parcelable.Creator<PrepareData> CREATOR = new Parcelable.Creator<PrepareData>() { // from class: com.alibaba.ariver.resource.api.prepare.PrepareData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrepareData createFromParcel(Parcel parcel) {
            return new PrepareData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrepareData[] newArray(int i2) {
            return new PrepareData[i2];
        }
    };
    private String appId;
    private String appType;
    private long beginTime;
    private Bundle data;
    private long downloadEndTime;
    private long downloadTime;
    private long endTime;
    private String errorDetail;
    private long installEndTime;
    private long installTime;
    private String nbUrl;
    private String offlineMode;
    private boolean originHasAppInfo;
    private long requestBeginTime;
    private long requestEndTime;
    private String requestMode;
    private String version;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getData() {
        return this.data;
    }

    public PrepareData() {
        this.data = new Bundle();
        clear();
    }

    protected PrepareData(Parcel parcel) {
        this.data = new Bundle();
        this.appType = parcel.readString();
        this.beginTime = parcel.readLong();
        this.requestBeginTime = parcel.readLong();
        this.requestEndTime = parcel.readLong();
        this.downloadTime = parcel.readLong();
        this.downloadEndTime = parcel.readLong();
        this.installTime = parcel.readLong();
        this.installEndTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.originHasAppInfo = parcel.readByte() != 0;
        this.requestMode = parcel.readString();
        this.offlineMode = parcel.readString();
        this.errorDetail = parcel.readString();
        this.nbUrl = parcel.readString();
        this.appId = parcel.readString();
        this.version = parcel.readString();
        this.data = parcel.readBundle();
    }

    public void clear() {
        this.downloadTime = 0L;
        this.requestEndTime = 0L;
        this.requestBeginTime = 0L;
        this.beginTime = 0L;
        this.endTime = 0L;
        this.installTime = 0L;
        this.originHasAppInfo = false;
        this.nbUrl = "";
        this.errorDetail = "";
        this.version = "";
        this.appId = "";
        this.offlineMode = "";
        this.requestMode = "";
    }

    public long getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(long j) {
        this.beginTime = j;
    }

    public long getRequestBeginTime() {
        return this.requestBeginTime;
    }

    public void setRequestBeginTime(long j) {
        this.requestBeginTime = j;
    }

    public long getRequestEndTime() {
        return this.requestEndTime;
    }

    public void setRequestEndTime(long j) {
        this.requestEndTime = j;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public void setDownloadTime(long j) {
        long j2 = this.downloadTime;
        if (j2 == 0 || j2 > j) {
            this.downloadTime = j;
        }
    }

    public long getInstallTime() {
        return this.installTime;
    }

    public void setInstallTime(long j) {
        this.installTime = j;
    }

    public long getDownloadEndTime() {
        return this.downloadEndTime;
    }

    public void setDownloadEndTime(long j) {
        this.downloadEndTime = j;
    }

    public long getInstallEndTime() {
        return this.installEndTime;
    }

    public void setInstallEndTime(long j) {
        this.installEndTime = j;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setAppType(String str) {
        this.appType = str;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public boolean getOriginHasAppInfo() {
        return this.originHasAppInfo;
    }

    public void setOriginHasAppInfo(boolean z) {
        this.originHasAppInfo = z;
    }

    public String getRequestMode() {
        return this.requestMode;
    }

    public void setRequestMode(UpdateMode updateMode) {
        this.requestMode = String.valueOf(updateMode.value);
    }

    public String getOfflineMode() {
        return this.offlineMode;
    }

    public void setOfflineMode(OfflineMode offlineMode) {
        this.offlineMode = String.valueOf(offlineMode.value);
    }

    public String getNbUrl() {
        return this.nbUrl;
    }

    public void setNbUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            this.nbUrl = "";
        } else {
            this.nbUrl = str;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "PrepareData{beginTime=" + this.beginTime + ", requestBeginTime=" + this.requestBeginTime + ", requestEndTime=" + this.requestEndTime + ", downloadTime=" + this.downloadTime + ", installTime=" + this.installTime + ", endTime=" + this.endTime + ", originHasAppInfo=" + this.originHasAppInfo + ", offlineMode=" + this.offlineMode + ", errorDetail=" + this.errorDetail + ", bundleData=" + this.data + ", nbUrl='" + this.nbUrl + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.appType);
        parcel.writeLong(this.beginTime);
        parcel.writeLong(this.requestBeginTime);
        parcel.writeLong(this.requestEndTime);
        parcel.writeLong(this.downloadTime);
        parcel.writeLong(this.downloadEndTime);
        parcel.writeLong(this.installTime);
        parcel.writeLong(this.installEndTime);
        parcel.writeLong(this.endTime);
        parcel.writeByte(this.originHasAppInfo ? (byte) 1 : (byte) 0);
        parcel.writeString(this.requestMode);
        parcel.writeString(this.offlineMode);
        parcel.writeString(this.errorDetail);
        parcel.writeString(this.nbUrl);
        parcel.writeString(this.appId);
        parcel.writeString(this.version);
        parcel.writeBundle(this.data);
    }
}
