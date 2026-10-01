package com.google.android.exoplayer2.metadata.id3;

import android.adservices.common.AdTechIdentifier;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new Parcelable.Creator<ChapterFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.ChapterFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChapterFrame[] newArray(int i2) {
            return new ChapterFrame[i2];
        }
    };
    public static final String ID = "CHAP";
    public final String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final Id3Frame[] subFrames;

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public int describeContents() {
        return 0;
    }

    public ChapterFrame(String str, int i2, int i3, long j, long j2, Id3Frame[] id3FrameArr) {
        super(ID);
        this.chapterId = str;
        this.startTimeMs = i2;
        this.endTimeMs = i3;
        this.startOffset = j;
        this.endOffset = j2;
        this.subFrames = id3FrameArr;
    }

    ChapterFrame(Parcel parcel) {
        super(ID);
        this.chapterId = (String) Util.castNonNull(parcel.readString());
        this.startTimeMs = parcel.readInt();
        this.endTimeMs = parcel.readInt();
        this.startOffset = parcel.readLong();
        this.endOffset = parcel.readLong();
        int i2 = parcel.readInt();
        this.subFrames = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.subFrames[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    public Id3Frame getSubFrame(int i2) {
        return this.subFrames[i2];
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && Util.areEqual(this.chapterId, chapterFrame.chapterId) && Arrays.equals(this.subFrames, chapterFrame.subFrames);
    }

    public int hashCode() {
        int i2 = this.startTimeMs;
        int i3 = this.endTimeMs;
        int i4 = (int) this.startOffset;
        int i5 = (int) this.endOffset;
        String str = this.chapterId;
        return ((((((((i2 + 527) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.chapterId);
        parcel.writeInt(this.startTimeMs);
        parcel.writeInt(this.endTimeMs);
        parcel.writeLong(this.startOffset);
        parcel.writeLong(this.endOffset);
        parcel.writeInt(this.subFrames.length);
        for (AdTechIdentifier adTechIdentifier : this.subFrames) {
            parcel.writeParcelable(adTechIdentifier, 0);
        }
    }
}
