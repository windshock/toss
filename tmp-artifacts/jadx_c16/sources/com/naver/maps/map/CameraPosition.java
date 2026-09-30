package com.naver.maps.map;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.naver.maps.geometry.LatLng;
import o.findFirstVisibleItemPosition;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CameraPosition implements Parcelable {
    public final double bearing;
    public final LatLng target;
    public final double tilt;
    public final double zoom;
    public static final CameraPosition onExtraCallbackWithResult = new CameraPosition(LatLng.INVALID, Double.NaN, Double.NaN, Double.NaN);
    public static final Parcelable.Creator<CameraPosition> CREATOR = new Parcelable.Creator<CameraPosition>() { // from class: com.naver.maps.map.CameraPosition.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public CameraPosition createFromParcel(Parcel parcel) {
            return new CameraPosition(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CameraPosition(@NonNull LatLng latLng, double d, double d2, double d3) {
        this.target = latLng;
        this.zoom = findFirstVisibleItemPosition.onExtraCallback(d, 0.0d, 21.0d);
        this.tilt = findFirstVisibleItemPosition.onExtraCallback(d2, 0.0d, 63.0d);
        this.bearing = findFirstVisibleItemPosition.onNavigationEvent(d3, 0.0d, 360.0d);
    }

    protected CameraPosition(Parcel parcel) {
        this.target = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.zoom = parcel.readDouble();
        this.tilt = parcel.readDouble();
        this.bearing = parcel.readDouble();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraPosition.class != obj.getClass()) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (Double.compare(cameraPosition.zoom, this.zoom) == 0 && Double.compare(cameraPosition.tilt, this.tilt) == 0 && Double.compare(cameraPosition.bearing, this.bearing) == 0) {
            return this.target.equals(cameraPosition.target);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.target.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.zoom);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.tilt);
        int i2 = (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.bearing);
        return (((((iHashCode * 31) + i) * 31) + i2) * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3));
    }

    public String toString() {
        return "CameraPosition{target=" + this.target + ", zoom=" + this.zoom + ", tilt=" + this.tilt + ", bearing=" + this.bearing + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.target, i);
        parcel.writeDouble(this.zoom);
        parcel.writeDouble(this.tilt);
        parcel.writeDouble(this.bearing);
    }
}
