package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ANROptimizeSwitch$onExtraCallback implements Parcelable.Creator<ANROptimizeSwitch> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ ANROptimizeSwitch createFromParcel(Parcel parcel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ANROptimizeSwitch aNROptimizeSwitchOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
        int i5 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return aNROptimizeSwitchOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ ANROptimizeSwitch[] newArray(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallbackWithResult(i2);
            throw null;
        }
        ANROptimizeSwitch[] aNROptimizeSwitchArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i2);
        int i5 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return aNROptimizeSwitchArrOnExtraCallbackWithResult;
    }

    public final ANROptimizeSwitch onExtraCallbackWithResult(Parcel parcel) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        ANROptimizeSwitch aNROptimizeSwitch = new ANROptimizeSwitch(parcel.readString(), parcel.readString());
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return aNROptimizeSwitch;
    }

    public final ANROptimizeSwitch[] onExtraCallbackWithResult(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        ANROptimizeSwitch[] aNROptimizeSwitchArr = new ANROptimizeSwitch[i2];
        int i7 = i4 + 11;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return aNROptimizeSwitchArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
