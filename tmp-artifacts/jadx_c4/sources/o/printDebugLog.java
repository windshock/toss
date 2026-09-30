package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.RowScope;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.kcbsurvey.R;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.printDebugLog;
import o.w3b;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class printDebugLog {
    private static int $10 = 0;
    private static int $11 = 1;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = null;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static char access100;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder;
    private static char asInterface;
    private static int getInterfaceDescriptor;
    public static final printDebugLog onExtraCallback;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        boolean z;
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~i5) | i8;
        int i10 = ~(i5 | i8);
        int i11 = i2 + i4 + i3 + ((-714989572) * i) + (1142003473 * i6);
        int i12 = i11 * i11;
        int i13 = (i2 * (-1158907614)) + 1427560840 + (i4 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + ((-1158906635) * i3) + (1387703340 * i) + (1202573125 * i6) + (i12 * (-451215360));
        int i14 = (((-190873766) * i2) - 1983905792) + (1136689320 * i4) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i3) + ((-1891631104) * i) + ((-1355808768) * i6) + ((-1882259456) * i12) + (i13 * i13 * (-310837248));
        if (i14 == 1) {
            return onExtraCallback(objArr);
        }
        if (i14 != 2) {
            w5a w5aVar = (w5a) objArr[0];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i15 = 2 % 2;
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((iIntValue & 6) == 0) {
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i16 = access000 + 123;
                    IAuthTabCallback_Parcel = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1513737649, iIntValue, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt.lambda$1513737649.<anonymous> (KcbSurveyConfirmExitActivity.kt:122)");
                }
                w5aVar.onExtraCallback(asBinder, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
                if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i18 = IAuthTabCallback_Parcel + 29;
                    access000 = i18 % 128;
                    int i19 = i18 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
        w3b w3bVar = (w3b) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i20 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue2 & 17) != 16) {
            int i21 = IAuthTabCallback_Parcel + 121;
            access000 = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 5 / 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i23 = IAuthTabCallback_Parcel + 41;
            access000 = i23 % 128;
            int i24 = i23 % 2;
        } else {
            int i25 = access000 + 39;
            IAuthTabCallback_Parcel = i25 % 128;
            int i26 = i25 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i27 = access000 + 81;
                IAuthTabCallback_Parcel = i27 % 128;
                int i28 = i27 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1648817682, iIntValue2, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt.lambda$-1648817682.<anonymous> (KcbSurveyConfirmExitActivity.kt:96)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            Object[] objArr2 = new Object[1];
            a(new char[]{13996, 29277, 16528, 5838, 10270, 60030, 63567, 42640, 4463, 50890, 19898, 64280, 42337, 12216, 63318, 64755, 48280, 28390, 3780, 39433, 7170, 40191, 37962, 46494, 4925, 21818, 39269, 65223, 50832, 61214, 55312, 60616, 8108, 65009, 1714, 1644, 42337, 12216, 53944, 48880, 5745, 27861, 48399, 42557, 26738, 44343, 61806, 19759, 11249, 36925, 47608, 3657, 3863, 55506, 3645, 45355, 47214, 58900, 50375, 50250, 54158, 31944, 55565, 21068, 55312, 60616}, 66 - KeyEvent.normalizeMetaState(0), objArr2);
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) objArr2[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 54, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 61;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        int i6 = access000 + 125;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access000 + 21;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback_Parcel + 81;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 1;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 9;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 53;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        if (i4 == 0) {
            unit = (Unit) IAuthTabCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -944749588, objArr, iOnExtraCallback2, 944749590, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
            int i5 = 77 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -944749588, objArr, iOnExtraCallback2, 944749590, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        }
        int i6 = access000 + 97;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 41;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 754366432, new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -754366432, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        int i4 = access000 + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return unit;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 11;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i5 = i3 + 27;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        int i5 = i2 + 27;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 125;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onTransact;
        int i5 = i2 + 107;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    static {
        onNavigationEvent();
        onExtraCallback = new printDebugLog();
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1083179390, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                RowScope rowScope = (RowScope) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    return printDebugLog.IAuthTabCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                printDebugLog.IAuthTabCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1449461190, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
                if (i3 != 0) {
                    int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                    int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                Unit unit = (Unit) printDebugLog.IAuthTabCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -979016242, new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnExtraCallback4, 979016243, iOnExtraCallback3, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
                int i4 = onWarmupCompleted + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1648817682, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 53;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = printDebugLog.onNavigationEvent((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 15;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(1323229177, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = printDebugLog.onExtraCallbackWithResult((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i3 == 0) {
                    int i4 = 19 / 0;
                }
                int i5 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(1513737649, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = printDebugLog.onNavigationEvent((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        });
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1089290139, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                w3b w3bVar = (w3b) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return printDebugLog.IAuthTabCallback(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                printDebugLog.IAuthTabCallback(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        int i = IAuthTabCallbackStubProxy + 93;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 49;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 124) != 79;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = access000 + 47;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1083179390, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt.lambda$-1083179390.<anonymous> (KcbSurveyConfirmExitActivity.kt:104)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_exit_confirm_row_1, cameraCaptureResultEmptyCameraCaptureResult, 0), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = access000 + 17;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 31;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access100);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i3);
                        int iRed = 10 - Color.red(i3);
                        int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iRed, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12435 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i13 = $10 + 117;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 16015), 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19900, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 17;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i5 = access000 + 109;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i7 = IAuthTabCallback_Parcel + 117;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 62 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1449461190, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt.lambda$-1449461190.<anonymous> (KcbSurveyConfirmExitActivity.kt:102)");
                }
                w5aVar.onExtraCallback(onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = access000 + 31;
                    IAuthTabCallback_Parcel = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w5aVar.onExtraCallback(onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 43;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = access000 + 25;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = access000 + 123;
                IAuthTabCallback_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1089290139, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt.lambda$-1089290139.<anonymous> (KcbSurveyConfirmExitActivity.kt:116)");
                    int i8 = 46 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1089290139, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt.lambda$-1089290139.<anonymous> (KcbSurveyConfirmExitActivity.kt:116)");
                }
                int i9 = IAuthTabCallback_Parcel + 119;
                access000 = i9 % 128;
                int i10 = i9 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            Object[] objArr = new Object[1];
            a(new char[]{13996, 29277, 16528, 5838, 10270, 60030, 63567, 42640, 4463, 50890, 19898, 64280, 42337, 12216, 63318, 64755, 48280, 28390, 3780, 39433, 7170, 40191, 37962, 46494, 4925, 21818, 39269, 65223, 50832, 61214, 55312, 60616, 8108, 65009, 1714, 1644, 42337, 12216, 53944, 48880, 5745, 27861, 48399, 42557, 26738, 44343, 61806, 19759, 11249, 36925, 47608, 3657, 3863, 55506, 3645, 45355, 47214, 58900, 50375, 50250, 54158, 31944, 55565, 21068, 55312, 60616}, 66 - TextUtils.getOffsetAfter("", 0), objArr);
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback_Parcel + 51;
                access000 = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 89;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = access000;
            int i6 = i5 + 67;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 3;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1323229177, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyConfirmExitActivityKt.lambda$1323229177.<anonymous> (KcbSurveyConfirmExitActivity.kt:124)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_exit_confirm_row_2, cameraCaptureResultEmptyCameraCaptureResult, 0), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = IAuthTabCallback_Parcel + 31;
                access000 = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) IAuthTabCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -979016242, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 979016243, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) IAuthTabCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 754366432, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -754366432, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    private static final Unit onExtraCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) IAuthTabCallback(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -944749588, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 944749590, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = (char) 8860;
        asInterface = (char) 56615;
        IAuthTabCallbackDefault = (char) 1797;
        access100 = (char) 26931;
    }
}
