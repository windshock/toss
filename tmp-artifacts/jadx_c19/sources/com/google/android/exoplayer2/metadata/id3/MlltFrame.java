package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new Parcelable.Creator<MlltFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.MlltFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MlltFrame[] newArray(int i2) {
            return new MlltFrame[i2];
        }
    };
    public static final String ID = "MLLT";
    public final int bytesBetweenReference;
    public final int[] bytesDeviations;
    public final int millisecondsBetweenReference;
    public final int[] millisecondsDeviations;
    public final int mpegFramesBetweenReference;

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public int describeContents() {
        return 0;
    }

    public MlltFrame(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super(ID);
        this.mpegFramesBetweenReference = i2;
        this.bytesBetweenReference = i3;
        this.millisecondsBetweenReference = i4;
        this.bytesDeviations = iArr;
        this.millisecondsDeviations = iArr2;
    }

    MlltFrame(Parcel parcel) {
        super(ID);
        this.mpegFramesBetweenReference = parcel.readInt();
        this.bytesBetweenReference = parcel.readInt();
        this.millisecondsBetweenReference = parcel.readInt();
        this.bytesDeviations = (int[]) Util.castNonNull(parcel.createIntArray());
        this.millisecondsDeviations = (int[]) Util.castNonNull(parcel.createIntArray());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.mpegFramesBetweenReference == mlltFrame.mpegFramesBetweenReference && this.bytesBetweenReference == mlltFrame.bytesBetweenReference && this.millisecondsBetweenReference == mlltFrame.millisecondsBetweenReference && Arrays.equals(this.bytesDeviations, mlltFrame.bytesDeviations) && Arrays.equals(this.millisecondsDeviations, mlltFrame.millisecondsDeviations);
    }

    public int hashCode() {
        int i2 = this.mpegFramesBetweenReference;
        int i3 = this.bytesBetweenReference;
        return ((((((((i2 + 527) * 31) + i3) * 31) + this.millisecondsBetweenReference) * 31) + Arrays.hashCode(this.bytesDeviations)) * 31) + Arrays.hashCode(this.millisecondsDeviations);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.mpegFramesBetweenReference);
        parcel.writeInt(this.bytesBetweenReference);
        parcel.writeInt(this.millisecondsBetweenReference);
        parcel.writeIntArray(this.bytesDeviations);
        parcel.writeIntArray(this.millisecondsDeviations);
    }
}
