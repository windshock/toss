package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class setHasShown implements Parcelable {
    public static final Parcelable.Creator<setHasShown> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<setHasShown> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setHasShown createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onExtraCallback(parcel);
                obj.hashCode();
                throw null;
            }
            setHasShown sethasshownOnExtraCallback = onExtraCallback(parcel);
            int i3 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return sethasshownOnExtraCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setHasShown[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent(i);
                throw null;
            }
            setHasShown[] sethasshownArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return sethasshownArrOnNavigationEvent;
        }

        public final setHasShown onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            setHasShown sethasshown = new setHasShown();
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return sethasshown;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final setHasShown[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            setHasShown[] sethasshownArr = new setHasShown[i];
            int i6 = i3 + 93;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return sethasshownArr;
        }
    }

    static {
        int i = onWarmupCompleted + 77;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        hasShown hasshown = hasShown.onWarmupCompleted;
        if (i3 == 0) {
            return hasshown.onExtraCallbackWithResult();
        }
        hasshown.onExtraCallbackWithResult();
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnExtraCallback = hasShown.onWarmupCompleted.onExtraCallback();
        int i4 = onExtraCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return function2OnExtraCallback;
    }

    public Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnNavigationEvent = hasShown.onWarmupCompleted.onNavigationEvent();
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return function2OnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
        int i5 = onExtraCallback + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }
}
