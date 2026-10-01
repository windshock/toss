package com.bytedance.adsdk.ugeno.jw;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx implements Parcelable {
    private final Parcelable zb;
    public static final ycx ycx = new ycx() { // from class: com.bytedance.adsdk.ugeno.jw.ycx.1
    };
    public static final Parcelable.Creator<ycx> CREATOR = new Parcelable.ClassLoaderCreator<ycx>() { // from class: com.bytedance.adsdk.ugeno.jw.ycx.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public ycx createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public ycx createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return ycx.ycx;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public ycx[] newArray(int i2) {
            return new ycx[i2];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ycx() {
        this.zb = null;
    }

    protected ycx(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.zb = parcelable == ycx ? null : parcelable;
    }

    protected ycx(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.zb = parcelable == null ? ycx : parcelable;
    }

    public final Parcelable ycx() {
        return this.zb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.zb, i2);
    }
}
