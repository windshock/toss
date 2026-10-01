package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class enableEndSpmReportInIOThread$onExtraCallbackWithResult implements Parcelable.Creator<enableEndSpmReportInIOThread> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ enableEndSpmReportInIOThread createFromParcel(Parcel parcel) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        enableEndSpmReportInIOThread enableendspmreportiniothreadOnExtraCallback = onExtraCallback(parcel);
        if (i4 != 0) {
            int i5 = 95 / 0;
        }
        return enableendspmreportiniothreadOnExtraCallback;
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ enableEndSpmReportInIOThread[] newArray(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        enableEndSpmReportInIOThread[] enableendspmreportiniothreadArrOnExtraCallback = onExtraCallback(i2);
        if (i5 == 0) {
            int i6 = 48 / 0;
        }
        int i7 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return enableendspmreportiniothreadArrOnExtraCallback;
    }

    public final enableEndSpmReportInIOThread onExtraCallback(Parcel parcel) {
        boolean z;
        Object objCreateFromParcel;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        boolean z2 = parcel.readInt() != 0;
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        if (parcel.readInt() == 0) {
            int i3 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (parcel.readInt() == 0) {
            int i5 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            objCreateFromParcel = null;
        } else {
            objCreateFromParcel = enableContextFromLogger.CREATOR.createFromParcel(parcel);
        }
        enableEndSpmReportInIOThread enableendspmreportiniothread = new enableEndSpmReportInIOThread(z2, j, j2, z, (enableContextFromLogger) objCreateFromParcel, parcel.readString(), (ANROptimizeSwitch) (parcel.readInt() == 0 ? null : ANROptimizeSwitch.CREATOR.createFromParcel(parcel)), (enableEventTrackerAdd) (parcel.readInt() == 0 ? null : enableEventTrackerAdd.CREATOR.createFromParcel(parcel)));
        int i7 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return enableendspmreportiniothread;
        }
        obj.hashCode();
        throw null;
    }

    public final enableEndSpmReportInIOThread[] onExtraCallback(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 45;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        enableEndSpmReportInIOThread[] enableendspmreportiniothreadArr = new enableEndSpmReportInIOThread[i2];
        if (i4 % 2 != 0) {
            int i6 = 99 / 0;
        }
        int i7 = i5 + 1;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return enableendspmreportiniothreadArr;
    }
}
