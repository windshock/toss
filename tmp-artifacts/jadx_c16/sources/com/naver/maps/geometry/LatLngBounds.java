package com.naver.maps.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR;
    public static final LatLngBounds INVALID;
    public static final LatLngBounds WORLD;
    private final LatLng northEast;
    private final LatLng southWest;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        LatLng latLng = LatLng.INVALID;
        INVALID = new LatLngBounds(latLng, latLng);
        WORLD = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
        CREATOR = new Parcelable.Creator<LatLngBounds>() { // from class: com.naver.maps.geometry.LatLngBounds.3
            @Override // android.os.Parcelable.Creator
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public LatLngBounds createFromParcel(Parcel parcel) {
                return new LatLngBounds((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()), (LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public LatLngBounds[] newArray(int i) {
                return new LatLngBounds[i];
            }
        };
    }

    private LatLngBounds(double d, double d2, double d3, double d4) {
        this(new LatLng(d3, d4), new LatLng(d, d2));
    }

    public LatLngBounds(@NonNull LatLng latLng, @NonNull LatLng latLng2) {
        this.southWest = latLng;
        this.northEast = latLng2;
    }

    public LatLng onTransact() {
        return this.southWest;
    }

    public LatLng onWarmupCompleted() {
        return this.northEast;
    }

    public LatLng IAuthTabCallbackStub() {
        return new LatLng(asInterface(), IAuthTabCallback());
    }

    public LatLng onExtraCallback() {
        return new LatLng(onNavigationEvent(), IAuthTabCallbackDefault());
    }

    public double asInterface() {
        return this.southWest.latitude;
    }

    public double IAuthTabCallbackDefault() {
        return this.southWest.longitude;
    }

    public double onNavigationEvent() {
        return this.northEast.latitude;
    }

    public double IAuthTabCallback() {
        return this.northEast.longitude;
    }

    public LatLng[] asBinder() {
        return new LatLng[]{onTransact(), onExtraCallback(), onWarmupCompleted(), IAuthTabCallbackStub()};
    }

    public boolean access000() {
        return onTransact().onExtraCallback() && onExtraCallback().onExtraCallback();
    }

    public boolean getInterfaceDescriptor() {
        return !access000() || asInterface() >= onNavigationEvent() || IAuthTabCallbackDefault() >= IAuthTabCallback();
    }

    public LatLng onExtraCallbackWithResult() {
        return new LatLng((asInterface() + onNavigationEvent()) / 2.0d, (IAuthTabCallbackDefault() + IAuthTabCallback()) / 2.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LatLngBounds.class != obj.getClass()) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southWest.equals(latLngBounds.southWest) && this.northEast.equals(latLngBounds.northEast);
    }

    public int hashCode() {
        return (this.southWest.hashCode() * 31) + this.northEast.hashCode();
    }

    public String toString() {
        return "LatLngBounds{southWest=" + this.southWest + ", northEast=" + this.northEast + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.southWest, i);
        parcel.writeParcelable(this.northEast, i);
    }
}
