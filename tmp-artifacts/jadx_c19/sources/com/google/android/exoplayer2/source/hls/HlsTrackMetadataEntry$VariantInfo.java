package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class HlsTrackMetadataEntry$VariantInfo implements Parcelable {
    public static final Parcelable.Creator<HlsTrackMetadataEntry$VariantInfo> CREATOR = new Parcelable.Creator<HlsTrackMetadataEntry$VariantInfo>() { // from class: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HlsTrackMetadataEntry$VariantInfo createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry$VariantInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HlsTrackMetadataEntry$VariantInfo[] newArray(int i2) {
            return new HlsTrackMetadataEntry$VariantInfo[i2];
        }
    };
    public final String audioGroupId;
    public final int averageBitrate;
    public final String captionGroupId;
    public final int peakBitrate;
    public final String subtitleGroupId;
    public final String videoGroupId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HlsTrackMetadataEntry$VariantInfo(int i2, int i3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.averageBitrate = i2;
        this.peakBitrate = i3;
        this.videoGroupId = str;
        this.audioGroupId = str2;
        this.subtitleGroupId = str3;
        this.captionGroupId = str4;
    }

    HlsTrackMetadataEntry$VariantInfo(Parcel parcel) {
        this.averageBitrate = parcel.readInt();
        this.peakBitrate = parcel.readInt();
        this.videoGroupId = parcel.readString();
        this.audioGroupId = parcel.readString();
        this.subtitleGroupId = parcel.readString();
        this.captionGroupId = parcel.readString();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry$VariantInfo.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry$VariantInfo hlsTrackMetadataEntry$VariantInfo = (HlsTrackMetadataEntry$VariantInfo) obj;
        return this.averageBitrate == hlsTrackMetadataEntry$VariantInfo.averageBitrate && this.peakBitrate == hlsTrackMetadataEntry$VariantInfo.peakBitrate && TextUtils.equals(this.videoGroupId, hlsTrackMetadataEntry$VariantInfo.videoGroupId) && TextUtils.equals(this.audioGroupId, hlsTrackMetadataEntry$VariantInfo.audioGroupId) && TextUtils.equals(this.subtitleGroupId, hlsTrackMetadataEntry$VariantInfo.subtitleGroupId) && TextUtils.equals(this.captionGroupId, hlsTrackMetadataEntry$VariantInfo.captionGroupId);
    }

    public int hashCode() {
        int i2 = this.averageBitrate;
        int i3 = this.peakBitrate;
        String str = this.videoGroupId;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.audioGroupId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.subtitleGroupId;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.captionGroupId;
        return (((((((((i2 * 31) + i3) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.averageBitrate);
        parcel.writeInt(this.peakBitrate);
        parcel.writeString(this.videoGroupId);
        parcel.writeString(this.audioGroupId);
        parcel.writeString(this.subtitleGroupId);
        parcel.writeString(this.captionGroupId);
    }
}
