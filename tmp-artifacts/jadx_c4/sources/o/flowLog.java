package o;

import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class flowLog {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final float[] onExtraCallbackWithResult;
    private final float[] onNavigationEvent;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i6 | i);
        int i11 = i9 | i10;
        int i12 = ~i6;
        int i13 = i9 | (~(i12 | i5)) | i10;
        int i14 = (~(i | i6 | i5)) | (~(i7 | i12 | i8));
        int i15 = i6 + i5 + i3 + (1322235619 * i2) + (440487356 * i4);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i6) - 2100690944) + ((-281430247) * i5) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i3) + ((-942931968) * i2) + ((-1410334720) * i4) + (1251606528 * i16);
        int i18 = (i6 * 157034417) + 1376579869 + (i5 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i3 * 157035401) + (i2 * (-982187909)) + (i4 * (-1869533796)) + (i16 * (-899022848));
        return i17 + ((i18 * i18) * (-511311872)) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public flowLog(@NotNull float[] fArr, @NotNull float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Intrinsics.checkNotNullParameter(fArr2, "");
        this.onNavigationEvent = fArr;
        this.onExtraCallbackWithResult = fArr2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        flowLog flowlog = (flowLog) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = ((i2 | 1) << 1) - ((i2 & (-2)) | ((~i2) & 1));
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        float[] fArr = flowlog.onNavigationEvent;
        int i5 = i2 ^ 123;
        int i6 = ((i2 & 123) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 & i7) + (i6 | i7);
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return fArr;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        flowLog flowlog = (flowLog) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 ^ 57;
        int i4 = -(-((i2 & 57) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        float[] fArr = flowlog.onExtraCallbackWithResult;
        if (i6 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = ((i2 ^ 31) - (~((i2 & 31) << 1))) - 1;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return fArr;
        }
        obj.hashCode();
        throw null;
    }

    public final float[] IAuthTabCallback() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (float[]) onExtraCallbackWithResult(iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 568905279, -568905278, new Object[]{this});
    }

    public final float[] onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (float[]) onExtraCallbackWithResult(iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1659346317, -1659346317, new Object[]{this});
    }
}
