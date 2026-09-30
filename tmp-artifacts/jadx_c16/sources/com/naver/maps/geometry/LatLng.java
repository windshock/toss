package com.naver.maps.geometry;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LatLng implements Parcelable {
    public static final double MAXIMUM_LATITUDE = 90.0d;
    public static final double MAXIMUM_LONGITUDE = 180.0d;
    public static final double MINIMUM_LATITUDE = -90.0d;
    public static final double MINIMUM_LONGITUDE = -180.0d;
    public final double latitude;
    public final double longitude;
    public static final LatLng INVALID = new LatLng(Double.NaN, Double.NaN);
    public static LatLngBounds COVERAGE = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
    public static final Parcelable.Creator<LatLng> CREATOR = new Parcelable.Creator<LatLng>() { // from class: com.naver.maps.geometry.LatLng.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public LatLng(@NonNull Location location) {
        this(location.getLatitude(), location.getLongitude());
    }

    public boolean onExtraCallback() {
        return (Double.isNaN(this.latitude) || Double.isNaN(this.longitude) || Double.isInfinite(this.latitude) || Double.isInfinite(this.longitude)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LatLng.class == obj.getClass()) {
            LatLng latLng = (LatLng) obj;
            if (Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public String toString() {
        return "LatLng{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
    }
}
