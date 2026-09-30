package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class networkAvailableOpt extends setHasShown implements Parcelable {
    public static final Parcelable.Creator<networkAvailableOpt> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final class onNavigationEvent implements Parcelable.Creator<networkAvailableOpt> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final networkAvailableOpt IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            networkAvailableOpt networkavailableopt = new networkAvailableOpt();
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return networkavailableopt;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ networkAvailableOpt createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            networkAvailableOpt networkavailableoptIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 != 0) {
                int i4 = 21 / 0;
            }
            return networkavailableoptIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ networkAvailableOpt[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            networkAvailableOpt[] networkavailableoptArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallback + 33;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return networkavailableoptArrOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final networkAvailableOpt[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 123;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            networkAvailableOpt[] networkavailableoptArr = new networkAvailableOpt[i];
            int i6 = i4 + 29;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return networkavailableoptArr;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 13;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            disclaimerOptEnabled.onExtraCallback.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2IAuthTabCallback = disclaimerOptEnabled.onExtraCallback.IAuthTabCallback();
        int i3 = onExtraCallbackWithResult + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return function2IAuthTabCallback;
    }

    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnWarmupCompleted = disclaimerOptEnabled.onExtraCallback.onWarmupCompleted();
        int i4 = onExtraCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return function2OnWarmupCompleted;
    }

    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        disclaimerOptEnabled disclaimeroptenabled = disclaimerOptEnabled.onExtraCallback;
        if (i3 != 0) {
            return disclaimeroptenabled.onNavigationEvent();
        }
        disclaimeroptenabled.onNavigationEvent();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
        int i5 = onExtraCallbackWithResult + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
