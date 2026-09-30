package o;

import android.content.Context;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.top.v2.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.mExternalSyntheticApiModelOutline1;
import o.mc;
import o.nExternalSyntheticLambda0;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.w5a;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda4;
import o.y1b;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class nExternalSyntheticLambda0 {
    private static int ICustomTabsCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    public static final nExternalSyntheticLambda0 onExtraCallbackWithResult = new nExternalSyntheticLambda0();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-1790809922, false, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = nExternalSyntheticLambda0.onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            if (i3 != 0) {
                int i4 = 47 / 0;
            }
            int i5 = IAuthTabCallback + 67;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-109571114, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda6
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            mc mcVar = (mc) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                nExternalSyntheticLambda0.onExtraCallback(mcVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitOnExtraCallback = nExternalSyntheticLambda0.onExtraCallback(mcVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallback + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(1072368921, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda7
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = nExternalSyntheticLambda0.onNavigationEvent((mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = IAuthTabCallback + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000 = ForwardingCameraControl.onExtraCallbackWithResult(428673179, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda8
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = nExternalSyntheticLambda0.onExtraCallbackWithResult((mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallback + 93;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallbackWithResult;
            }
            throw null;
        }
    });
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1535378113, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda9
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsBinder = nExternalSyntheticLambda0.asBinder((mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitAsBinder;
        }
    });
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(321311940, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda10
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            mc mcVar = (mc) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return nExternalSyntheticLambda0.IAuthTabCallback(mcVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            nExternalSyntheticLambda0.IAuthTabCallback(mcVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(656043052, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda11
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                return nExternalSyntheticLambda0.onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            nExternalSyntheticLambda0.onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
    });
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1696445585, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda12
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsInterface = nExternalSyntheticLambda0.asInterface((mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return unitAsInterface;
        }
    });
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(1958393266, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda13
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            mc mcVar = (mc) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return nExternalSyntheticLambda0.onWarmupCompleted(mcVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            nExternalSyntheticLambda0.onWarmupCompleted(mcVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback = ForwardingCameraControl.onExtraCallbackWithResult(99985204, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda14
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnTransact = nExternalSyntheticLambda0.onTransact((mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnTransact;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100 = ForwardingCameraControl.onExtraCallbackWithResult(1820900491, false, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 == 0) {
                nExternalSyntheticLambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Unit unitIAuthTabCallback = nExternalSyntheticLambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            int i3 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unitIAuthTabCallback;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder = ForwardingCameraControl.onExtraCallbackWithResult(1523979136, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda2
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = nExternalSyntheticLambda0.onNavigationEvent((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1335828872, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = nExternalSyntheticLambda0.onExtraCallback((y1b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 31 / 0;
            }
            int i5 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitOnExtraCallback;
        }
    });
    private static getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-28437617, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda4
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = nExternalSyntheticLambda0.onExtraCallback((y1ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = IAuthTabCallback + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-669447993, false, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda5
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            Unit unit = (Unit) nExternalSyntheticLambda0.IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -657055830, zzmr.onExtraCallbackWithResult(), objArr, 657055842, zzmr.onExtraCallbackWithResult());
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    });

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7;
        int i8 = ~(i5 | i);
        int i9 = ~i5;
        int i10 = ~i;
        int i11 = i9 | i10;
        int i12 = i8 | (~(i11 | i3));
        int i13 = i10 | i5;
        int i14 = i3 | (~i11);
        int i15 = i3 + i5 + i6 + ((-1587644119) * i2) + (1302866265 * i4);
        int i16 = i15 * i15;
        int i17 = ((i3 * (-855313886)) - 1253577507) + (i5 * (-855313886)) + (i12 * (-13)) + (i13 * 13) + (i14 * 13) + ((-855313873) * i6) + ((-1467678585) * i2) + (593082711 * i4) + (i16 * 74579968);
        switch ((i3 * (-1579585154)) + 1163788288 + ((-1579585154) * i5) + ((-914001539) * i12) + (i13 * 914001539) + (914001539 * i14) + ((-665583616) * i6) + (1500774400 * i2) + ((-1456209920) * i4) + ((-2144468992) * i16) + (i17 * i17 * (-1668153344))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                boolean z = false;
                mc mcVar = (mc) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i18 = 2 % 2;
                int i19 = extraCallbackWithResult + 53;
                writeTypedObject = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(mcVar, "");
                if ((iIntValue & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                        int i21 = extraCallbackWithResult + 123;
                        writeTypedObject = i21 % 128;
                        i7 = i21 % 2 == 0 ? 3 : 4;
                    } else {
                        i7 = 2;
                    }
                    iIntValue |= i7;
                }
                int i22 = iIntValue;
                if ((i22 & 19) != 18) {
                    int i23 = extraCallbackWithResult + 65;
                    writeTypedObject = i23 % 128;
                    int i24 = i23 % 2;
                    z = true;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i22 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                } else {
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i25 = extraCallbackWithResult + 113;
                        writeTypedObject = i25 % 128;
                        int i26 = i25 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1535378113, i22, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1535378113.<anonymous> (TdsAnimateTopV1.kt:359)");
                        int i27 = extraCallbackWithResult + 61;
                        writeTypedObject = i27 % 128;
                        int i28 = i27 % 2;
                    }
                    mcVar.onExtraCallbackWithResult("한줄\n두줄", mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), null, 0, null, 0L, 0L, 0L, 0.0f, null, null, 0L, null, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft, null, cameraCaptureResultEmptyCameraCaptureResult, 54, ((i22 << 15) & 458752) | 3072, 24572);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return access100(objArr);
            case 12:
                return access000(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 89;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 15;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 33;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 27 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 89;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(onextracallbackwithresult, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(onextracallbackwithresult, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 51;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess100 = access100(mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 21 / 0;
        }
        return unitAccess100;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1b y1bVar, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 61;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(y1bVar, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(y1bVar, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onTransact;
        int i5 = i3 + 17;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = extraCallbackWithResult + 27;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Context context = (Context) objArr[0];
        mc mcVar = (mc) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(context, mcVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = extraCallbackWithResult + 85;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i4 = extraCallbackWithResult + 29;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 35;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        if (i4 != 0) {
            return (Unit) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1984742168, zzmr.onExtraCallbackWithResult(), objArr, -1984742163, iOnExtraCallbackWithResult2);
        }
        int i5 = 41 / 0;
        return (Unit) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1984742168, zzmr.onExtraCallbackWithResult(), objArr, -1984742163, iOnExtraCallbackWithResult2);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStubProxy;
        int i5 = i3 + 99;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public static /* synthetic */ Unit asInterface(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 5;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWriteTypedObject = writeTypedObject(mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 10 / 0;
        }
        int i6 = writeTypedObject + 35;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unitWriteTypedObject;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Context context, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 47;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = writeTypedObject + 71;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 69;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallbackWithResult3, zzmr.onExtraCallbackWithResult(), -2031277708, zzmr.onExtraCallbackWithResult(), new Object[]{mcVar, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, 2031277712, iOnExtraCallbackWithResult4);
        int i5 = writeTypedObject + 81;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 119;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        int i6 = writeTypedObject + 19;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 27;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {y1bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        if (i4 == 0) {
            return (Unit) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -761429195, zzmr.onExtraCallbackWithResult(), objArr, 761429201, iOnExtraCallbackWithResult2);
        }
        int i5 = 22 / 0;
        return (Unit) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -761429195, zzmr.onExtraCallbackWithResult(), objArr, 761429201, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 75;
        extraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            asBinder(context, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(context, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = extraCallbackWithResult + 113;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 107;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 83;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -52639740, iOnExtraCallbackWithResult4, objArr, 52639750, iOnExtraCallbackWithResult2);
        int i4 = writeTypedObject + 109;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 75;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        if (i4 != 0) {
            return (Unit) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 303908492, zzmr.onExtraCallbackWithResult(), objArr, -303908491, iOnExtraCallbackWithResult2);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 67;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult = (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) objArr[0];
        mc mcVar = (mc) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(onextracallbackwithresult, mcVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = writeTypedObject + 109;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 107;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(context, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 79;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 27;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 121;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 31;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 78 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 65;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = writeTypedObject + 99;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 47;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = writeTypedObject + 5;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        Unit unitAccess000;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            unitAccess000 = access000();
            int i3 = 39 / 0;
        } else {
            unitAccess000 = access000();
        }
        int i4 = extraCallbackWithResult + 69;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 13;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {onextracallbackwithresult, mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1664459873, zzmr.onExtraCallbackWithResult(), objArr, -1664459870, zzmr.onExtraCallbackWithResult());
        int i5 = writeTypedObject + 69;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 89;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackStub(mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStub(mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 41;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        int i4 = i2 + 105;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = access000;
        int i5 = i3 + 103;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = access100;
        int i5 = i3 + 45;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackDefault;
        int i5 = i3 + 3;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface;
        }
        throw null;
    }

    public final getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i5 = i3 + 85;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<mc, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor;
        }
        throw null;
    }

    static {
        int i = ICustomTabsCallback + 95;
        readTypedObject = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, !((Boolean) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1958943075, zzmr.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor}, -1958943073, iOnExtraCallbackWithResult2)).booleanValue());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 31;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = writeTypedObject + 111;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mcVar, "");
            if ((i & 60) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                    int i6 = extraCallbackWithResult + 43;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(mcVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            z = true;
            int i8 = extraCallbackWithResult + 1;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i10 = extraCallbackWithResult + 99;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1915413240, i3, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1790809922.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:249)");
            }
            mcVar.IAuthTabCallback(onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<? extends List<String>>) cameraPresenceProviderExternalSyntheticLambda6), mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), null, 0, 0, 0, false, null, 0L, 0L, 0L, 0.0f, null, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, (i3 << 24) & 234881024, 262140);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = writeTypedObject + 113;
                extraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i13 = 28 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$context, access13800Var);
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 10 / 0;
            }
            int i5 = onExtraCallback + 35;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 86 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$context, CollectionsKt.listOf(new String[]{"동해 물과", "닳도록\n하느님이 보우하사", "동해 물과", "백두산이\n마르고"}), mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), null, 0, 0, 0, false, false, 504, null);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(Context context, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = writeTypedObject + 99;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                int i7 = extraCallbackWithResult + 1;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = extraCallbackWithResult + 37;
            writeTypedObject = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-192851717, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1790809922.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:256)");
                int i11 = writeTypedObject + 39;
                extraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = i2;
            mExternalSyntheticLambda8 mexternalsyntheticlambda8OnExtraCallback = mcVar.onExtraCallback(null, null, 0L, 0L, 0L, null, 0.0f, null, null, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, 0, (i13 << 3) & 112, 2047);
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback, context, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
            Object[] objArr = {mcVar, mexternalsyntheticlambda8OnExtraCallback, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i13 << 9) & 7168), 6};
            mc.IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = writeTypedObject + 117;
                extraCallbackWithResult = i14 % 128;
                if (i14 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i15 = 20 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Context $context;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$context, access13800Var);
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 27 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 41 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 9;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$context, CollectionsKt.listOf(new String[]{"동해\n물과", "닳도록\n하느님이\n보우하사", "동해 물과", "백두산이\n마르고"}), mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), null, 0, 0, 0, false, false, 504, null);
            Unit unit = Unit.INSTANCE;
            int i6 = onNavigationEvent + 109;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    private static final Unit asInterface(Context context, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 39;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = writeTypedObject + 97;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = writeTypedObject + 33;
                extraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-166705923, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1790809922.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:268)");
            }
            int i10 = i2;
            mExternalSyntheticLambda8 mexternalsyntheticlambda8OnExtraCallback = mcVar.onExtraCallback(null, null, 0L, 0L, 0L, null, 0.0f, null, null, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, 0, (i10 << 3) & 112, 2047);
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onWarmupCompleted(mexternalsyntheticlambda8OnExtraCallback, context, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
            Object[] objArr = {mcVar, mexternalsyntheticlambda8OnExtraCallback, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i10 << 9) & 7168), 6};
            mc.IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            int i4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2;
            int i5 = extraCallbackWithResult + 103;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = extraCallbackWithResult + 69;
            writeTypedObject = i7 % 128;
            z = i7 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = writeTypedObject + 3;
            extraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2092700321, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1790809922.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:284)");
            }
            mcVar.IAuthTabCallback(onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<? extends List<String>>) cameraPresenceProviderExternalSyntheticLambda6), mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), null, 0, 0, 0, false, null, 0L, 0L, 0L, 0.0f, null, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, (i2 << 24) & 234881024, 262140);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = extraCallbackWithResult + 15;
                writeTypedObject = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 1 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$context, access13800Var);
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$context, CollectionsKt.listOf(new String[]{"동해 물과", "닳도록\n하느님이 보우하사", "동해 물과", "백두산이\n마르고"}), mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), null, 0, 0, 0, false, false, 504, null);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(Context context, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = extraCallbackWithResult + 43;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            int i7 = writeTypedObject + 25;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 39 / 0;
                i3 = !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 2 : 4;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
            }
            int i9 = writeTypedObject + 105;
            extraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i11 = writeTypedObject + 55;
            extraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1020326940, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1790809922.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:291)");
            }
            int i13 = i2;
            mExternalSyntheticLambda8 mexternalsyntheticlambda8OnExtraCallback = mcVar.onExtraCallback(null, null, 0L, 0L, 0L, null, 0.0f, null, null, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, 0, (i13 << 3) & 112, 2047);
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback)) {
                int i14 = writeTypedObject + 47;
                extraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(mexternalsyntheticlambda8OnExtraCallback, context, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
                Object[] objArr = {mcVar, mexternalsyntheticlambda8OnExtraCallback, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i13 << 9) & 7168), 6};
                int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                mc.IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, objArr);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i16 = extraCallbackWithResult + 69;
                    writeTypedObject = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Context $context;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$context, access13800Var);
            int i2 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$context, CollectionsKt.listOf(new String[]{"동해\n물과", "닳도록\n하느님이\n보우하사", "동해 물과", "백두산이\n마르고"}), mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), null, 0, 0, 0, false, false, 504, null);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(Context context, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 93;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mcVar, "");
            if ((i & 44) == 0) {
                int i5 = extraCallbackWithResult + 79;
                writeTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar);
                    throw null;
                }
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(mcVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i6 = writeTypedObject + 55;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1664022682, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1790809922.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:302)");
            }
            int i8 = i2;
            mExternalSyntheticLambda8 mexternalsyntheticlambda8OnExtraCallback = mcVar.onExtraCallback(null, null, 0L, 0L, 0L, null, 0.0f, null, null, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, 0, (i8 << 3) & 112, 2047);
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallback(mexternalsyntheticlambda8OnExtraCallback, context, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
            Object[] objArr = {mcVar, mexternalsyntheticlambda8OnExtraCallback, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i8 << 9) & 7168), 6};
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            mc.IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, objArr);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        char c;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 79;
        int i4 = i3 % 128;
        extraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 11;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = extraCallbackWithResult + 43;
            writeTypedObject = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1790809922, i, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1790809922.<anonymous> (TdsAnimateTopV1.kt:232)");
            }
            final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i9 = extraCallbackWithResult + 123;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i11 = writeTypedObject + 111;
                extraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 5 / 3;
                }
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(((Boolean) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1958943075, zzmr.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor}, -1958943073, zzmr.onExtraCallbackWithResult())).booleanValue() ? CollectionsKt.listOf(new String[]{"가나다라 마바사", "아자차카\n타파하"}) : CollectionsKt.listOf(new String[]{"동해\n물과\n백두산이\n마르고\n닳도록", "닳도록\n하느님이\n보우하사", "동해 물과", "백두산이\n마르고"}), cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda19
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallback + 59;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unitOnExtraCallbackWithResult = nExternalSyntheticLambda0.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor);
                        if (i15 == 0) {
                            int i16 = 87 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"버튼", null, null, null, null, null, (Function0) objOnMinimized2, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 958}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i13 = extraCallbackWithResult + 15;
                writeTypedObject = i13 % 128;
                c = 2;
                int i14 = i13 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                c = 2;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            y1ExternalSyntheticLambda0.onNavigationEvent.onExtraCallback onextracallback2 = y1ExternalSyntheticLambda0.onNavigationEvent.Companion;
            y1ExternalSyntheticLambda0.onNavigationEvent onNavigationEvent2 = onextracallback2.onNavigationEvent();
            y1ExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallback onextracallback3 = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion;
            r8lambda4JCsOS_fRrbU6o4wWMePlfE_iLw.onExtraCallback(ForwardingCameraControl.onExtraCallback(1915413240, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda20
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallback + 105;
                    onExtraCallbackWithResult = i16 % 128;
                    Object obj4 = null;
                    if (i16 % 2 == 0) {
                        nExternalSyntheticLambda0.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = nExternalSyntheticLambda0.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i17 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i17 % 128;
                    if (i17 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), onNavigationEvent2, ForwardingCameraControl.onExtraCallback(-192851717, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda21
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnExtraCallback = nExternalSyntheticLambda0.onExtraCallback(context, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onNavigationEvent + 7;
                    onExtraCallbackWithResult = i18 % 128;
                    if (i18 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), onextracallback3.onExtraCallback(), ForwardingCameraControl.onExtraCallback(-166705923, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda22
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallbackWithResult + 49;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                    Unit unit = (Unit) nExternalSyntheticLambda0.IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1071879466, zzmr.onExtraCallbackWithResult(), new Object[]{context, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, 1071879477, zzmr.onExtraCallbackWithResult());
                    int i17 = onNavigationEvent + 117;
                    onExtraCallbackWithResult = i17 % 128;
                    int i18 = i17 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), onextracallback3.onNavigationEvent(), null, null, null, null, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResult, 1797510, 0, 16256);
            r8lambda4JCsOS_fRrbU6o4wWMePlfE_iLw.onExtraCallback(ForwardingCameraControl.onExtraCallback(2092700321, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda23
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallback + 15;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                    mc mcVar = (mc) obj;
                    if (i17 != 0) {
                        return nExternalSyntheticLambda0.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, mcVar, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    nExternalSyntheticLambda0.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, mcVar, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), onextracallback2.onExtraCallback(), ForwardingCameraControl.onExtraCallback(-1020326940, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda24
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onNavigationEvent + 11;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    Context context2 = context;
                    mc mcVar = (mc) obj;
                    if (i17 != 0) {
                        return nExternalSyntheticLambda0.onNavigationEvent(context2, mcVar, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnNavigationEvent = nExternalSyntheticLambda0.onNavigationEvent(context2, mcVar, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = 93 / 0;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), null, ForwardingCameraControl.onExtraCallback(-1664022682, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda25
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onNavigationEvent + 97;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnExtraCallbackWithResult = nExternalSyntheticLambda0.onExtraCallbackWithResult(context, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onNavigationEvent + 123;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), null, null, null, null, null, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResult, 200070, 0, 16336);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"사이즈 테스트입니다.", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i15 = writeTypedObject + 1;
                extraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        mc mcVar = (mc) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                int i3 = writeTypedObject + 13;
                extraCallbackWithResult = i3 % 128;
                i = i3 % 2 != 0 ? 5 : 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        int i4 = iIntValue;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i4 & 19) != 18, i4 & 1)) {
            int i5 = writeTypedObject + 121;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = writeTypedObject + 1;
                extraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-109571114, i4, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-109571114.<anonymous> (TdsAnimateTopV1.kt:336)");
                    int i8 = 42 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-109571114, i4, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-109571114.<anonymous> (TdsAnimateTopV1.kt:336)");
                }
            }
            mcVar.IAuthTabCallback(CollectionsKt.listOf(new String[]{"가나다라 마바사", "아자차카\n타파하"}), mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), null, 0, 0, 0, false, null, 0L, 0L, 0L, 0.0f, null, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, (i4 << 24) & 234881024, 262140);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i4 = writeTypedObject + 125;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1072368921, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$1072368921.<anonymous> (TdsAnimateTopV1.kt:342)");
            }
            mcVar.onExtraCallbackWithResult("동해 물과", mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), null, 0, null, 0L, 0L, 0L, 0.0f, null, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, (i2 << 15) & 458752, 32764);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = writeTypedObject + 23;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        long jIEngagementSignalsCallbackStub;
        long jMediaMetadataCompat;
        mc mcVar = (mc) objArr[0];
        boolean z = true;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((iIntValue & 6) == 0) {
            int i4 = extraCallbackWithResult + 19;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2;
        }
        int i6 = iIntValue;
        if ((i6 & 19) == 18) {
            int i7 = writeTypedObject + 63;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i6 & 1)) {
            int i9 = extraCallbackWithResult + 17;
            writeTypedObject = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(428673179, i6, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$428673179.<anonymous> (TdsAnimateTopV1.kt:348)");
            }
            mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.asInterface.Companion.onExtraCallbackWithResult();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-361928927);
                jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-361927999);
                jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IEngagementSignalsCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i11 = writeTypedObject + 77;
            extraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-361925212);
                jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-361924188);
                jMediaMetadataCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i13 = writeTypedObject + 111;
            extraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr2 = {mcVar, "백두산이 마르고", onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted(jIEngagementSignalsCallbackStub, jMediaMetadataCompat), null, 0, false, null, 0L, 0L, 0L, Float.valueOf(0.0f), null, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, Integer.valueOf((i6 << 18) & 3670016), 65532};
            mc.IAuthTabCallback(1231156830, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1231156829, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = extraCallbackWithResult + 99;
                writeTypedObject = i15 % 128;
                if (i15 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit access100(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        long smallIconId;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = writeTypedObject + 71;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(321311940, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$321311940.<anonymous> (TdsAnimateTopV1.kt:366)");
            }
            mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.asInterface.Companion.onExtraCallbackWithResult();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-456862613);
                smallIconId = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ITrustedWebActivityServiceStubProxy();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-456861653);
                smallIconId = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).getSmallIconId();
            }
            long j = smallIconId;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i6 = extraCallbackWithResult + 125;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                Object[] objArr = {mcVar, "텍스트", mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onWarmupCompleted.IAuthTabCallback(onwarmupcompletedOnExtraCallbackWithResult, j, 0L, 4, null), null, 0, true, null, 0L, 1L, 0L, Float.valueOf(2.0f), null, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 60, Integer.valueOf((i2 % 122) & 3670016), 65532};
                mc.IAuthTabCallback(1231156830, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1231156829, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                Object[] objArr2 = {mcVar, "텍스트", mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onWarmupCompleted.IAuthTabCallback(onwarmupcompletedOnExtraCallbackWithResult, j, 0L, 2, null), null, 0, false, null, 0L, 0L, 0L, Float.valueOf(0.0f), null, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, Integer.valueOf((i2 << 18) & 3670016), 65532};
                mc.IAuthTabCallback(1231156830, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1231156829, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = writeTypedObject + 25;
                int i5 = i4 % 128;
                extraCallbackWithResult = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 61;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i9 = writeTypedObject + 111;
            extraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = extraCallbackWithResult + 107;
                writeTypedObject = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(656043052, i, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$656043052.<anonymous> (TdsAnimateTopV1.kt:378)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(656043052, i, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$656043052.<anonymous> (TdsAnimateTopV1.kt:378)");
            }
            w5aVar.onExtraCallbackWithResult("사이즈 테스트입니다", (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedObject(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        long jLongValue;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1696445585, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1696445585.<anonymous> (TdsAnimateTopV1.kt:395)");
            }
            mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(150.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplApi21Parcelizer(), (toMetersPerSecond) null, 2, (Object) null);
            getHumanReadableName gethumanreadablenameIAuthTabCallbackStub = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallbackStub();
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1803378742);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                int i4 = extraCallbackWithResult + 21;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1803379702);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            mcVar.onExtraCallbackWithResult("ABFCD", iAuthTabCallbackIAuthTabCallbackDefault, quirksExternalSyntheticBackport0OnExtraCallback, 0, gethumanreadablenameIAuthTabCallbackStub, jLongValue, 0L, 0L, 0.0f, null, null, 0L, isRepeatingEnabled.onExtraCallback.onTransact(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center, null, cameraCaptureResultEmptyCameraCaptureResult, 24630, ((i2 << 15) & 458752) | 3456, 20424);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = writeTypedObject + 95;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        long jLongValue;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            int i4 = extraCallbackWithResult + 107;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = writeTypedObject + 61;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i7 = writeTypedObject + 43;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1958393266, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$1958393266.<anonymous> (TdsAnimateTopV1.kt:408)");
            }
            List<String> listListOf = CollectionsKt.listOf(new String[]{"ABFCD", "FGHIJ", "KLMNO"});
            mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(150.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplApi21Parcelizer(), (toMetersPerSecond) null, 2, (Object) null);
            getHumanReadableName gethumanreadablenameIAuthTabCallbackStub = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallbackStub();
            if (!(!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue())) {
                int i9 = writeTypedObject + 9;
                extraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(820267417);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(820268377);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            long j = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i11 = writeTypedObject + 89;
            extraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            mcVar.IAuthTabCallback(listListOf, iAuthTabCallbackIAuthTabCallbackDefault, quirksExternalSyntheticBackport0OnExtraCallback, 0, 0, 0, false, gethumanreadablenameIAuthTabCallbackStub, j, 0L, 0L, 0.0f, null, null, 0L, isRepeatingEnabled.onExtraCallback.onTransact(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft, null, cameraCaptureResultEmptyCameraCaptureResult, 12582966, ((i2 << 24) & 234881024) | 1769472, 163448);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        long jICustomTabsService;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = writeTypedObject + 21;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = writeTypedObject + 89;
                extraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(99985204, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$99985204.<anonymous> (TdsAnimateTopV1.kt:421)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(99985204, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$99985204.<anonymous> (TdsAnimateTopV1.kt:421)");
            }
            List<String> listListOf = CollectionsKt.listOf(new String[]{"ABFCD", "FGHIJ", "KLMNO"});
            mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(150.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplApi21Parcelizer(), (toMetersPerSecond) null, 2, (Object) null);
            getHumanReadableName gethumanreadablenameIAuthTabCallbackStub = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallbackStub();
            if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1596515931);
                jICustomTabsService = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1596514971);
                jICustomTabsService = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            }
            long j = jICustomTabsService;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            mcVar.IAuthTabCallback(listListOf, iAuthTabCallbackIAuthTabCallbackDefault, quirksExternalSyntheticBackport0OnExtraCallback, 0, 0, 0, false, gethumanreadablenameIAuthTabCallbackStub, j, 0L, 0L, 0.0f, null, null, 0L, isRepeatingEnabled.onExtraCallback.onTransact(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.CenterRight, null, cameraCaptureResultEmptyCameraCaptureResult, 12582966, ((i2 << 24) & 234881024) | 1769472, 163448);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 103;
        int i4 = i3 % 128;
        extraCallbackWithResult = i4;
        if (i3 % 2 == 0 ? (i & 3) == 2 : (i & 5) == 4) {
            z = false;
        } else {
            int i5 = i4 + 19;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1820900491, i, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$1820900491.<anonymous> (TdsAnimateTopV1.kt:390)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = extraCallbackWithResult + 113;
                writeTypedObject = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    int i8 = 47 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i9 = extraCallbackWithResult + 49;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            r8lambda4JCsOS_fRrbU6o4wWMePlfE_iLw.onExtraCallback(onExtraCallback, null, null, IAuthTabCallback_Parcel, null, extraCallback, null, null, null, null, null, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResult, 199686, 0, 16342);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        long jICustomTabsService_Parcel;
        long jExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            int i4 = extraCallbackWithResult + 117;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar);
                throw null;
            }
            int i5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2;
            int i6 = writeTypedObject + 105;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2043559120, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-669447993.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:447)");
            }
            mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.asInterface.Companion.onExtraCallbackWithResult();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1060268057);
                jICustomTabsService_Parcel = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1160806746, OverseasRrnInputTextField.IAuthTabCallback(), -1160806737)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1060269081);
                jICustomTabsService_Parcel = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService_Parcel();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i8 = extraCallbackWithResult + 51;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i10 = extraCallbackWithResult + 125;
                writeTypedObject = i10 % 128;
                if (i10 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1060272184);
                    jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 51).ICustomTabsCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1060272184);
                    jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsCallback();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1060273176);
                jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i11 = extraCallbackWithResult + 73;
            writeTypedObject = i11 % 128;
            int i12 = i11 % 2;
            Object[] objArr = {mcVar, "서브타이틀1", onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted(jExtraCallback, jICustomTabsService_Parcel), null, 0, false, null, 0L, 0L, 0L, Float.valueOf(0.0f), null, null, 0L, null, onextracallbackwithresult, null, cameraCaptureResultEmptyCameraCaptureResult, 6, Integer.valueOf((i2 << 18) & 3670016), 49148};
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            mc.IAuthTabCallback(1231156830, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1231156829, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, objArr);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z = false;
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult = (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) objArr[0];
        mc mcVar = (mc) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2;
        }
        int i4 = iIntValue;
        if ((i4 & 19) != 18) {
            int i5 = extraCallbackWithResult + 73;
            int i6 = i5 % 128;
            writeTypedObject = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 125;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i4 & 1)) {
            int i10 = writeTypedObject + 73;
            extraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1559864909, i4, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-669447993.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:457)");
            }
            mcVar.IAuthTabCallback(CollectionsKt.listOf(new String[]{onextracallbackwithresult.name(), "동해 물과\n백두 산이\n마르고 닳도록"}), mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), null, 0, 0, 0, false, null, 0L, 0L, 0L, 0.0f, null, null, 0L, null, onextracallbackwithresult, null, cameraCaptureResultEmptyCameraCaptureResult, 48, (i4 << 24) & 234881024, 196604);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = extraCallbackWithResult + 101;
            writeTypedObject = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            int i5 = extraCallbackWithResult + 69;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                i3 = 4;
            } else {
                int i7 = writeTypedObject + 53;
                extraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = extraCallbackWithResult + 97;
            writeTypedObject = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i11 = writeTypedObject + 29;
            extraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(150874510, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-669447993.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:467)");
            }
            mcVar.onExtraCallbackWithResult("동해 물과 백두 산이 마르고 닳도록", mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().onWarmupCompleted(), null, 0, null, 0L, 0L, 0L, 0.0f, null, null, 0L, null, onextracallbackwithresult, null, cameraCaptureResultEmptyCameraCaptureResult, 54, (i2 << 15) & 458752, 24572);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access000() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                i3 = 4;
            } else {
                int i5 = writeTypedObject + 9;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = extraCallbackWithResult + 5;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1523979136, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$1523979136.<anonymous> (TdsAnimateTopV1.kt:474)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda15
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + 41;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 != 0) {
                            nExternalSyntheticLambda0.onWarmupCompleted();
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = nExternalSyntheticLambda0.onWarmupCompleted();
                        int i11 = IAuthTabCallback + 63;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 63 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.onNavigationEvent("버튼", (QuirksExternalSyntheticBackport0) null, (Function0<Unit>) obj, (Function0<Unit>) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 390, (i2 << 3) & 112, 2042);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = writeTypedObject + 123;
                extraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = writeTypedObject + 51;
            extraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(y1b y1bVar, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = writeTypedObject + 33;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-231758363, i, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1335828872.<anonymous>.<anonymous> (TdsAnimateTopV1.kt:478)");
            }
            IntIterator it = new IntRange(1, 10).iterator();
            int i5 = writeTypedObject + 113;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                y1bVar.onNavigationEvent("뱃지 " + it.nextInt(), null, null, (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) CollectionsKt.random(AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.getEntries(), Random.onNavigationEvent), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 22);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = writeTypedObject + 21;
                extraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = extraCallbackWithResult + 25;
            writeTypedObject = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 / 5;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean z = false;
        final y1b y1bVar = (y1b) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        Object obj = null;
        if ((iIntValue & 6) == 0) {
            int i2 = writeTypedObject + 99;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar);
                throw null;
            }
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar) ? 4 : 2;
            int i3 = extraCallbackWithResult + 53;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((iIntValue & 19) != 18) {
            int i5 = writeTypedObject + 31;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = extraCallbackWithResult + 51;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1335828872, iIntValue, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-1335828872.<anonymous> (TdsAnimateTopV1.kt:477)");
            }
            y1bVar.onExtraCallback(ForwardingCameraControl.onExtraCallback(-231758363, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda26
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 11;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitIAuthTabCallback = nExternalSyntheticLambda0.IAuthTabCallback(y1bVar, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i11 = onExtraCallbackWithResult + 39;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = extraCallbackWithResult + 19;
        writeTypedObject = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 83;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 75;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4)) {
                int i5 = extraCallbackWithResult + 71;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-28437617, i2, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-28437617.<anonymous> (TdsAnimateTopV1.kt:487)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda27
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallback + 89;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
                            return (Unit) nExternalSyntheticLambda0.IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 572637714, zzmr.onExtraCallbackWithResult(), new Object[0], -572637705, iOnExtraCallbackWithResult2);
                        }
                        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
                        Unit unit = (Unit) nExternalSyntheticLambda0.IAuthTabCallback(iOnExtraCallbackWithResult3, zzmr.onExtraCallbackWithResult(), 572637714, zzmr.onExtraCallbackWithResult(), new Object[0], -572637705, iOnExtraCallbackWithResult4);
                        int i9 = 73 / 0;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i7 = writeTypedObject + 113;
                extraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
            y1externalsyntheticlambda4.onNavigationEvent("Lower", (Function0) objOnMinimized, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 27) & 1879048192) | 54, 508);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i2 = 2 % 2;
        boolean z2 = true;
        if ((i & 3) != 2) {
            int i3 = writeTypedObject + 61;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                Object obj = null;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = writeTypedObject + 97;
                    extraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-669447993, i, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-669447993.<anonymous> (TdsAnimateTopV1.kt:443)");
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-669447993, i, -1, "im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt.lambda$-669447993.<anonymous> (TdsAnimateTopV1.kt:443)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i5 = writeTypedObject + 83;
                    extraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-125565575);
                List entries = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.getEntries();
                int size = entries.size();
                int i6 = 0;
                while (i6 < size) {
                    final mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult2 = (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) entries.get(i6);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    r8lambda4JCsOS_fRrbU6o4wWMePlfE_iLw.onExtraCallback(ForwardingCameraControl.onExtraCallback(-1559864909, z2, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda16
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i7 = 2 % 2;
                            int i8 = onExtraCallbackWithResult + 79;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitOnWarmupCompleted = nExternalSyntheticLambda0.onWarmupCompleted(onextracallbackwithresult2, (mc) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            if (i9 != 0) {
                                int i10 = 4 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), null, null, ForwardingCameraControl.onExtraCallback(2043559120, z2, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda17
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i7 = 2 % 2;
                            int i8 = onExtraCallbackWithResult + 121;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitIAuthTabCallback = nExternalSyntheticLambda0.IAuthTabCallback(onextracallbackwithresult2, (mc) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i10 = onWarmupCompleted + 107;
                            onExtraCallbackWithResult = i10 % 128;
                            if (i10 % 2 == 0) {
                                return unitIAuthTabCallback;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), null, ForwardingCameraControl.onExtraCallback(150874510, z2, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.animatetop.ComposableSingletons$TdsAnimateTopV1Kt$$ExternalSyntheticLambda18
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i7 = 2 % 2;
                            int i8 = IAuthTabCallback + 59;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                            Object[] objArr = {onextracallbackwithresult2, (mc) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                            Unit unit = (Unit) nExternalSyntheticLambda0.IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -363561623, zzmr.onExtraCallbackWithResult(), objArr, 363561623, zzmr.onExtraCallbackWithResult());
                            int i10 = onExtraCallback + 77;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 21 / 0;
                            }
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), null, asBinder, null, IAuthTabCallback, IAuthTabCallbackStub, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResult2, 818088966, 6, 14678);
                    i6++;
                    size = size;
                    entries = entries;
                    z2 = z2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }
        int i7 = extraCallbackWithResult + 61;
        writeTypedObject = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 2 / 4;
        }
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i & 1)) {
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = extraCallbackWithResult + 33;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = writeTypedObject + 17;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final List<String> onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<? extends List<String>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = (List) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = extraCallbackWithResult + 59;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {context, mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1071879466, zzmr.onExtraCallbackWithResult(), objArr, 1071879477, zzmr.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -363561623, zzmr.onExtraCallbackWithResult(), objArr, 363561623, zzmr.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -657055830, zzmr.onExtraCallbackWithResult(), objArr, 657055842, zzmr.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 572637714, zzmr.onExtraCallbackWithResult(), new Object[0], -572637705, iOnExtraCallbackWithResult2);
    }

    private static final Unit access000(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 303908492, zzmr.onExtraCallbackWithResult(), objArr, -303908491, zzmr.onExtraCallbackWithResult());
    }

    private static final Unit getInterfaceDescriptor(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -2031277708, zzmr.onExtraCallbackWithResult(), objArr, 2031277712, zzmr.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -761429195, zzmr.onExtraCallbackWithResult(), objArr, 761429201, zzmr.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallbackStubProxy(mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1984742168, zzmr.onExtraCallbackWithResult(), objArr, -1984742163, zzmr.onExtraCallbackWithResult());
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1958943075, zzmr.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor}, -1958943073, iOnExtraCallbackWithResult2)).booleanValue();
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -52639740, zzmr.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutionsfor}, 52639750, iOnExtraCallbackWithResult2);
    }

    private static final Unit onNavigationEvent(mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1664459873, zzmr.onExtraCallbackWithResult(), objArr, -1664459870, zzmr.onExtraCallbackWithResult());
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Function2) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -527332732, zzmr.onExtraCallbackWithResult(), new Object[]{this}, 527332740, iOnExtraCallbackWithResult2);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (getBacktraceNote) IAuthTabCallback(iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -1108868082, zzmr.onExtraCallbackWithResult(), new Object[]{this}, 1108868089, iOnExtraCallbackWithResult2);
    }
}
