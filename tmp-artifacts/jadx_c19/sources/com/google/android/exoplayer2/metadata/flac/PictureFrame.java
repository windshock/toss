package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new Parcelable.Creator<PictureFrame>() { // from class: com.google.android.exoplayer2.metadata.flac.PictureFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PictureFrame[] newArray(int i2) {
            return new PictureFrame[i2];
        }
    };
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    public int describeContents() {
        return 0;
    }

    public PictureFrame(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.pictureType = i2;
        this.mimeType = str;
        this.description = str2;
        this.width = i3;
        this.height = i4;
        this.depth = i5;
        this.colors = i6;
        this.pictureData = bArr;
    }

    PictureFrame(Parcel parcel) {
        this.pictureType = parcel.readInt();
        this.mimeType = (String) Util.castNonNull(parcel.readString());
        this.description = (String) Util.castNonNull(parcel.readString());
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = (byte[]) Util.castNonNull(parcel.createByteArray());
    }

    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        builder.maybeSetArtworkData(this.pictureData, this.pictureType);
    }

    public String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData);
    }

    public int hashCode() {
        int i2 = this.pictureType;
        int iHashCode = this.mimeType.hashCode();
        int iHashCode2 = this.description.hashCode();
        int i3 = this.width;
        int i4 = this.height;
        return ((((((((((((((i2 + 527) * 31) + iHashCode) * 31) + iHashCode2) * 31) + i3) * 31) + i4) * 31) + this.depth) * 31) + this.colors) * 31) + Arrays.hashCode(this.pictureData);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.pictureType);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.depth);
        parcel.writeInt(this.colors);
        parcel.writeByteArray(this.pictureData);
    }

    public static PictureFrame fromPictureBlock(ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        String string = parsableByteArray.readString(parsableByteArray.readInt(), Charsets.US_ASCII);
        String string2 = parsableByteArray.readString(parsableByteArray.readInt());
        int i3 = parsableByteArray.readInt();
        int i4 = parsableByteArray.readInt();
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        int i7 = parsableByteArray.readInt();
        byte[] bArr = new byte[i7];
        parsableByteArray.readBytes(bArr, 0, i7);
        return new PictureFrame(i2, string, string2, i3, i4, i5, i6, bArr);
    }
}
