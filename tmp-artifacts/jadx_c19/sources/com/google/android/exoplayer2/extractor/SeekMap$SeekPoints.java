package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SeekMap$SeekPoints {
    public final SeekPoint first;
    public final SeekPoint second;

    public SeekMap$SeekPoints(SeekPoint seekPoint) {
        this(seekPoint, seekPoint);
    }

    public SeekMap$SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
        this.first = (SeekPoint) Assertions.checkNotNull(seekPoint);
        this.second = (SeekPoint) Assertions.checkNotNull(seekPoint2);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.first);
        if (this.first.equals(this.second)) {
            str = "";
        } else {
            str = ", " + this.second;
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekMap$SeekPoints.class != obj.getClass()) {
            return false;
        }
        SeekMap$SeekPoints seekMap$SeekPoints = (SeekMap$SeekPoints) obj;
        return this.first.equals(seekMap$SeekPoints.first) && this.second.equals(seekMap$SeekPoints.second);
    }

    public int hashCode() {
        return (this.first.hashCode() * 31) + this.second.hashCode();
    }
}
