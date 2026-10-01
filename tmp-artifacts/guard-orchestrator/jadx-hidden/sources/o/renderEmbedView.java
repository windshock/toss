package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AUTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class renderEmbedView {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(renderEmbedView.class);

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | i2;
        int i10 = ~(i6 | i);
        int i11 = i9 | i10;
        int i12 = ~i2;
        int i13 = (~(i12 | i)) | (~(i12 | i6)) | i10;
        int i14 = (~(i7 | i)) | (~(i8 | i6));
        int i15 = i6 + i + i3 + (1040777104 * i4) + ((-1861505373) * i5);
        int i16 = i15 * i15;
        int i17 = (i6 * (-1036928585)) + 527892480 + ((-1036928585) * i) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i3) + (1608515584 * i4) + ((-1123418112) * i5) + ((-2114519040) * i16);
        int i18 = (i6 * 1703033811) + 1712528133 + (i * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i3 * 1703034565) + (i4 * (-2114876976)) + (i5 * 1880022383) + (i16 * (-720175104));
        switch (i17 + (i18 * i18 * (-739180544))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int iOnExtraCallbackWithResult;
        Function1 function1 = (Function1) objArr[0];
        v1 v1Var = (v1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1114);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 31) & 1) == 0) {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue);
        } else {
            int i5 = iIntValue & 1;
            int i6 = (~i5) & (iIntValue | 1);
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult((i5 & i6) | (i6 ^ i5));
        }
        onNavigationEvent((Function1<? super getInterceptor, Unit>) function1, v1Var, cameraCaptureResultEmptyCameraCaptureResult, iOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2462);
        if ((((((~i7) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i7)) >> 18) & 1) == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        getInterceptor getinterceptor = (getInterceptor) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4498);
        Unit unitOnWarmupCompleted = onWarmupCompleted(getinterceptor, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw = (r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2876);
        if ((1 & ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 22)) != 0) {
            return onNavigationEvent(function1, r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onNavigationEvent(function1, r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getInterceptor getinterceptor = (getInterceptor) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, getinterceptor);
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1851);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 27) & 1) != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getInterceptor getinterceptor = (getInterceptor) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5171);
        if ((1 & ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 19)) != 0) {
            Unit unitOnNavigationEvent = onNavigationEvent(getinterceptor, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
            return unitOnNavigationEvent;
        }
        onNavigationEvent(getinterceptor, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        v1 v1Var = (v1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1114);
        int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 14) & 1;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, v1Var, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
        int i6 = (~iOnWarmupCompleted2) & i5;
        int i7 = (~i5) & iOnWarmupCompleted2;
        if (((((i7 & i6) | (i6 ^ i7)) >> 26) & 1) != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0167 A[PHI: r0
      0x0167: PHI (r0v5 int) = (r0v4 int), (r0v6 int) binds: [B:28:0x0164, B:25:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r34) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.renderEmbedView.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        if (o.CameraConfigExternalSyntheticLambda0.asBinder() != true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
    
        if (o.CameraConfigExternalSyntheticLambda0.asBinder() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
    
        o.CameraConfigExternalSyntheticLambda0.onTransact();
        r12 = 3073;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStub(java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.renderEmbedView.IAuthTabCallbackStub(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getInterceptor getinterceptor = (getInterceptor) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4098);
        int i3 = i2 & iOnWarmupCompleted;
        if ((1 & ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 16)) == 0) {
            function1.invoke(getinterceptor);
            Unit unit = Unit.INSTANCE;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3393);
            return unit;
        }
        function1.invoke(getinterceptor);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [im.toss.global.features.kyc.test.GlobalKycTestFunnelSelectionBottomSheetKt$$ExternalSyntheticLambda2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r28) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.renderEmbedView.asBinder(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a2, code lost:
    
        if (o.CameraConfigExternalSyntheticLambda0.asBinder() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c7, code lost:
    
        if (o.CameraConfigExternalSyntheticLambda0.asBinder() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c9, code lost:
    
        o.CameraConfigExternalSyntheticLambda0.onTransact();
        r4 = 1823;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r31) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.renderEmbedView.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, getInterceptor getinterceptor) {
        return (Unit) IAuthTabCallback(1313707969, new Object[]{function1, getinterceptor}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1313707968);
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-914867387, new Object[]{function1, r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 914867395);
    }

    public static /* synthetic */ Unit onNavigationEvent(getInterceptor getinterceptor, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(1363482289, new Object[]{getinterceptor, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1363482279);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, v1 v1Var, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(-232703423, new Object[]{function1, v1Var, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 232703428);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getInterceptor getinterceptor, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-86830048, new Object[]{getinterceptor, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 86830052);
    }

    public static final void onNavigationEvent(@NotNull Function1<? super getInterceptor, Unit> function1, @NotNull v1 v1Var, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        IAuthTabCallback(278965940, new Object[]{function1, v1Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -278965940);
    }

    private static final Unit onNavigationEvent(Function1 function1, r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(608924652, new Object[]{function1, r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -608924645);
    }

    private static final Unit onNavigationEvent(getInterceptor getinterceptor, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-1672821453, new Object[]{getinterceptor, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1672821459);
    }

    private static final Unit onWarmupCompleted(getInterceptor getinterceptor, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-1461430232, new Object[]{getinterceptor, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1461430234);
    }

    private static final Unit onWarmupCompleted(Function1 function1, getInterceptor getinterceptor) {
        return (Unit) IAuthTabCallback(460811516, new Object[]{function1, getinterceptor}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -460811513);
    }

    private static final Unit IAuthTabCallback(Function1 function1, v1 v1Var, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(810018322, new Object[]{function1, v1Var, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -810018313);
    }
}
