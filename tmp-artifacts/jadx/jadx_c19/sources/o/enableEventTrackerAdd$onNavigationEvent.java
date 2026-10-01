package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class enableEventTrackerAdd$onNavigationEvent implements Parcelable.Creator<enableEventTrackerAdd> {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ enableEventTrackerAdd createFromParcel(Parcel parcel) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(parcel);
        }
        onWarmupCompleted(parcel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ enableEventTrackerAdd[] newArray(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        enableEventTrackerAdd[] enableeventtrackeraddArrOnWarmupCompleted = onWarmupCompleted(i2);
        if (i5 == 0) {
            int i6 = 25 / 0;
        }
        return enableeventtrackeraddArrOnWarmupCompleted;
    }

    public final enableEventTrackerAdd onWarmupCompleted(Parcel parcel) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        enableEventTrackerAdd enableeventtrackeradd = new enableEventTrackerAdd(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        int i3 = onWarmupCompleted + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return enableeventtrackeradd;
        }
        throw null;
    }

    public final enableEventTrackerAdd[] onWarmupCompleted(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 121;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        enableEventTrackerAdd[] enableeventtrackeraddArr = new enableEventTrackerAdd[i2];
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i5 + 109;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return enableeventtrackeraddArr;
    }
}
