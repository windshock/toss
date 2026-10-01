package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.u4;
import o.v2b;
import o.v5b;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v2b {
    private static int $10 = 0;
    private static int $11 = 1;
    private static getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub = null;
    private static getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy = null;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel = null;
    private static char ICustomTabsCallback = 0;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000 = null;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100 = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback = null;
    private static char extraCallbackWithResult = 0;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor = null;
    private static int onActivityLayout = 0;
    private static int onActivityResized = 0;
    private static getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = null;
    private static int onMessageChannelReady = 1;
    private static char onMinimized = 0;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = null;
    private static int onPostMessage = 1;
    private static getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact;
    public static final v2b onWarmupCompleted;
    private static char readTypedObject;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 119;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onMessageChannelReady + 121;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 39;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 59;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMessageChannelReady + 69;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 125;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(v5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 41;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 47;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess100 = access100(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 109;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess100;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 117;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onMessageChannelReady + 3;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return unitAccess000;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 33;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMessageChannelReady + 19;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 39;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(v5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMessageChannelReady + 9;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onActivityResized + 27;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[0];
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(iOnExtraCallback4, objArr2, iOnExtraCallback, -2051449555, 2051449562, iOnExtraCallback3, iOnExtraCallback2);
        int i4 = onMessageChannelReady + 19;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityResized + 103;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject();
        int i4 = onMessageChannelReady + 117;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 33;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMessageChannelReady + 1;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 51;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMessageChannelReady + 47;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 31;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(v5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMessageChannelReady + 17;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 115;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallbackDefault;
        int i4 = i2 + 45;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 47;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWriteTypedObject = writeTypedObject(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 9;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit onNavigationEvent(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 23;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, -1463568045, 1463568050, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2);
        int i5 = onActivityResized + 109;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 75;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(v5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMessageChannelReady + 83;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i2)) | i8;
        int i10 = ~i3;
        int i11 = ~(i10 | i4);
        int i12 = i8 | i11 | (~(i10 | i2));
        int i13 = (~((~i2) | i10)) | i8 | i11;
        int i14 = i4 + i3 + i6 + ((-369695973) * i5) + (1794320298 * i);
        int i15 = i14 * i14;
        int i16 = ((i4 * 1872133577) - 2052485254) + (i3 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (1872134975 * i6) + ((-1328892763) * i5) + ((-1296121642) * i) + (i15 * (-1691287552));
        int i17 = 4;
        switch (((-1820121865) * i4) + 1478230016 + (776760710 * i3) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i6) + (217841664 * i5) + ((-410517504) * i) + ((-175177728) * i15) + (i16 * i16 * (-1729036288))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                u4 u4Var = (u4) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i18 = 2 % 2;
                Intrinsics.checkNotNullParameter(u4Var, "");
                if ((iIntValue & 6) == 0) {
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                        int i19 = onActivityResized + 71;
                        onMessageChannelReady = i19 % 128;
                        int i20 = i19 % 2;
                        i17 = 2;
                    }
                    iIntValue |= i17;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i21 = onActivityResized + 125;
                        onMessageChannelReady = i21 % 128;
                        int i22 = i21 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1261274700, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$1261274700.<anonymous> (TdsDialogV1.kt:290)");
                    }
                    u4Var.onNavigationEvent("아니오", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, iIntValue & 14, 1022);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 5:
                u4 u4Var2 = (u4) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i23 = 2 % 2;
                Intrinsics.checkNotNullParameter(u4Var2, "");
                if ((iIntValue2 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u4Var2)) {
                        int i24 = onMessageChannelReady + 57;
                        onActivityResized = i24 % 128;
                        if (i24 % 2 != 0) {
                            i17 = 3;
                        }
                    } else {
                        i17 = 2;
                    }
                    iIntValue2 |= i17;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1072315547, iIntValue2, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$1072315547.<anonymous> (TdsDialogV1.kt:386)");
                    }
                    u4Var2.onNavigationEvent("레이블이 길어지는 경우", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult2, 6, iIntValue2 & 14, 1022);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i25 = onActivityResized + 1;
                        onMessageChannelReady = i25 % 128;
                        int i26 = i25 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 9;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 29;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback5 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback6 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnExtraCallback4, 1359600666, -1359600660, iOnExtraCallback6, iOnExtraCallback5);
        int i5 = onActivityResized + 95;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 61;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, 1347684173, -1347684169, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2);
        int i5 = onActivityResized + 19;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 95;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i2 + 59;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return getbacktracenote;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 59;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallbackStub;
        int i4 = i2 + 47;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 39;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = writeTypedObject;
        int i5 = i3 + 109;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 25;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = getInterfaceDescriptor;
        int i5 = i3 + 95;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 7;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = extraCallback;
        int i5 = i2 + 125;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 123;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            getbacktracenote = onTransact;
            int i4 = 77 / 0;
        } else {
            getbacktracenote = onTransact;
        }
        int i5 = i2 + 55;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 1;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            function2 = asInterface;
            int i4 = 57 / 0;
        } else {
            function2 = asInterface;
        }
        int i5 = i2 + 85;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 55;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i2 + 77;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 1;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = asBinder;
        int i5 = i2 + 97;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 35;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return getbacktracenote;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 111;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 97;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (ICustomTabsCallback ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onMinimized);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cRed = (char) Color.red(i3);
                        int iResolveSize = View.resolveSize(i3, i3) + 10;
                        int iIndexOf = TextUtils.indexOf("", "", i3, i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, iResolveSize, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (extraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(readTypedObject)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 9 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.lastIndexOf("", '0') + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 16014), Color.argb(0, 0, 0, 0) + 14, 19902 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit access000(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 105;
        int i4 = i3 % 128;
        onMessageChannelReady = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 113;
            onActivityResized = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onMessageChannelReady + 71;
                onActivityResized = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-827084266, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-827084266.<anonymous> (TdsDialogV1.kt:232)");
                int i10 = onMessageChannelReady + 89;
                onActivityResized = i10 % 128;
                int i11 = i10 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"다시 촬영해주세요", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1))) {
            int i3 = onActivityResized + 115;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onActivityResized + 39;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(744150517, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$744150517.<anonymous> (TdsDialogV1.kt:235)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"정보가 맞게 인식됐는지 다시 확인해주세요..", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onActivityResized + 31;
                onMessageChannelReady = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onActivityResized + 27;
        onMessageChannelReady = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    static {
        getInterfaceDescriptor();
        onWarmupCompleted = new v2b();
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-1769567803, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = v2b.onExtraCallbackWithResult((v5b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-827084266, false, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
                Unit unit = (Unit) v2b.onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, -967311097, 967311105, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2);
                int i4 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        extraCallback = ForwardingCameraControl.onExtraCallbackWithResult(744150517, false, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) v2b.onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, ICustomTabsCallbackStubProxy.onExtraCallback(), 2008639518, -2008639517, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
                int i4 = IAuthTabCallback + 57;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 52 / 0;
                }
                return unit;
            }
        });
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1123165941, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda9
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object obj4 = null;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    v2b.IAuthTabCallback(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    obj4.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = v2b.IAuthTabCallback(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onExtraCallback + 47;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        });
        access000 = ForwardingCameraControl.onExtraCallbackWithResult(1261274700, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 97;
                onExtraCallback = i2 % 128;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    v2b.onWarmupCompleted(u4Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitOnWarmupCompleted = v2b.onWarmupCompleted(u4Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = onExtraCallback + 51;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1188121441, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = v2b.onNavigationEvent((v5b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = IAuthTabCallback + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        });
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(-245637904, false, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i3 == 0) {
                    return v2b.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                v2b.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(1325596879, false, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                Unit unitOnExtraCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onExtraCallback = i2 % 128;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                Integer num = (Integer) obj2;
                if (i2 % 2 == 0) {
                    unitOnExtraCallback = v2b.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                    int i3 = 7 / 0;
                } else {
                    unitOnExtraCallback = v2b.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                }
                int i4 = IAuthTabCallback + 41;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        });
        IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(1936444193, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda14
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                v5b v5bVar = (v5b) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    return v2b.onExtraCallback(v5bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                v2b.onExtraCallback(v5bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-326836816, false, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onExtraCallback + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object obj3 = null;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i3 == 0) {
                    v2b.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = v2b.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = IAuthTabCallback + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj3.hashCode();
                throw null;
            }
        });
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1563694863, false, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                IAuthTabCallback = i2 % 128;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                Integer num = (Integer) obj2;
                if (i2 % 2 != 0) {
                    v2b.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = v2b.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                int i3 = onExtraCallback + 97;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitOnWarmupCompleted;
            }
        });
        access100 = ForwardingCameraControl.onExtraCallbackWithResult(1072315547, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return v2b.onNavigationEvent(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                v2b.onNavigationEvent(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(1780341818, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                onExtraCallback = i2 % 128;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    v2b.onExtraCallbackWithResult(u4Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = v2b.onExtraCallbackWithResult(u4Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = onWarmupCompleted + 37;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1682599289, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = v2b.IAuthTabCallback((v5b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 87;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        });
        writeTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(349086998, false, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda5
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = v2b.IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i4 = onWarmupCompleted + 111;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-887771049, false, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                IAuthTabCallback = i2 % 128;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                Integer num = (Integer) obj2;
                if (i2 % 2 == 0) {
                    v2b.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = v2b.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                int i3 = IAuthTabCallback + 3;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return unitOnNavigationEvent;
            }
        });
        int i = onActivityLayout + 13;
        onPostMessage = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 37;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 23;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        Object objOnMinimized;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(v5bVar, "");
        if ((i & 6) == 0) {
            int i4 = 4;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v5bVar)) {
                int i5 = onMessageChannelReady + 33;
                onActivityResized = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 / 5;
                }
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onMessageChannelReady + 35;
            onActivityResized = i7 % 128;
            z = i7 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = onMessageChannelReady + 87;
            onActivityResized = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1769567803, i2, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-1769567803.<anonymous> (TdsDialogV1.kt:238)");
                    int i10 = onActivityResized + 25;
                    onMessageChannelReady = i10 % 128;
                    int i11 = i10 % 2;
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda16
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i12 = 2 % 2;
                            int i13 = onNavigationEvent + 99;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            Object obj = null;
                            Object[] objArr = new Object[0];
                            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                            if (i14 != 0) {
                                int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
                                obj.hashCode();
                                throw null;
                            }
                            int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
                            Unit unit = (Unit) v2b.onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, 1845030086, -1845030086, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback3);
                            int i15 = IAuthTabCallback + 115;
                            onNavigationEvent = i15 % 128;
                            if (i15 % 2 != 0) {
                                return unit;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i12 = onActivityResized + 71;
                    onMessageChannelReady = i12 % 128;
                    int i13 = i12 % 2;
                }
                Object[] objArr = new Object[1];
                a(new char[]{34420, 12992}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, objArr);
                v5bVar.onWarmupCompleted(((String) objArr[0]).intern(), (Function0) objOnMinimized, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 12) & 57344) | 54, 12);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = onActivityResized + 113;
                    onMessageChannelReady = i14 % 128;
                    if (i14 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                Object[] objArr2 = new Object[1];
                a(new char[]{34420, 12992}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, objArr2);
                v5bVar.onWarmupCompleted(((String) objArr2[0]).intern(), (Function0) objOnMinimized, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 12) & 57344) | 54, 12);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access100(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 83;
        onMessageChannelReady = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 2) != 2, i & 1)) {
            int i4 = onActivityResized + 57;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-245637904, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-245637904.<anonymous> (TdsDialogV1.kt:279)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"재발급 불가 안내", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onActivityResized + 83;
                onMessageChannelReady = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1))) {
            int i3 = onMessageChannelReady + 67;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onMessageChannelReady + 113;
                onActivityResized = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1325596879, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$1325596879.<anonymous> (TdsDialogV1.kt:282)");
                    int i6 = 86 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1325596879, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$1325596879.<anonymous> (TdsDialogV1.kt:282)");
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"현재 새로운 카드 출시를 준비 중인 관계로, 카드 재발급 신청이 어려운 점 양해 부탁드립니다.", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onMessageChannelReady + 103;
                onActivityResized = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i4 = onMessageChannelReady + 117;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onMessageChannelReady + 23;
                onActivityResized = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1123165941, i2, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-1123165941.<anonymous> (TdsDialogV1.kt:287)");
                    int i7 = 99 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1123165941, i2, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-1123165941.<anonymous> (TdsDialogV1.kt:287)");
                }
            }
            u4Var.onNavigationEvent("예", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onMessageChannelReady + 65;
            onActivityResized = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(v5bVar, "");
        boolean z = true;
        if ((i & 6) == 0) {
            i |= !(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v5bVar) ^ true) ? 4 : 2;
            int i3 = onMessageChannelReady + 39;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 19) != 18) {
            int i5 = onMessageChannelReady + 47;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onActivityResized + 95;
                onMessageChannelReady = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1188121441, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-1188121441.<anonymous> (TdsDialogV1.kt:285)");
            }
            v5bVar.onNavigationEvent((QuirksExternalSyntheticBackport0) null, onNavigationEvent, access000, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 432, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onMessageChannelReady + 121;
                onActivityResized = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onActivityResized;
        int i4 = i3 + 13;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 73;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-326836816, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-326836816.<anonymous> (TdsDialogV1.kt:330)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"다시 촬영해주세요", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        boolean z = true;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onActivityResized;
            int i3 = i2 + 41;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 71;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i7 = onMessageChannelReady + 11;
            onActivityResized = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 53 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1563694863, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-1563694863.<anonymous> (TdsDialogV1.kt:333)");
                    int i9 = onMessageChannelReady + 35;
                    onActivityResized = i9 % 128;
                    int i10 = i9 % 2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"- 만보기 정책이 변경되었어요. 최신 버전으로 업데이트 후 이용해주세요.\n- 보상금 지급은 최신 버전에서 변경된 정책을 따르며, 업데이트를 하지 않는 경우 보상금 지급 및 서비스 이용이 제한됩니다.", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"- 만보기 정책이 변경되었어요. 최신 버전으로 업데이트 후 이용해주세요.\n- 보상금 지급은 최신 버전에서 변경된 정책을 따르며, 업데이트를 하지 않는 경우 보상금 지급 및 서비스 이용이 제한됩니다.", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedObject() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 47;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 1;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        Object objOnMinimized;
        int i2;
        int i3 = 2 % 2;
        int i4 = onMessageChannelReady + 73;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(v5bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v5bVar)) {
                int i6 = onActivityResized + 3;
                int i7 = i6 % 128;
                onMessageChannelReady = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 59;
                onActivityResized = i9 % 128;
                int i10 = i9 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
            int i11 = onActivityResized + 39;
            onMessageChannelReady = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((i & 19) != 18) {
            int i13 = onActivityResized + 81;
            onMessageChannelReady = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i15 = onMessageChannelReady + 33;
            onActivityResized = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = onActivityResized + 91;
            onMessageChannelReady = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 86 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1936444193, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$1936444193.<anonymous> (TdsDialogV1.kt:336)");
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt$$ExternalSyntheticLambda17
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i19 = 2 % 2;
                            int i20 = onWarmupCompleted + 53;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitOnExtraCallbackWithResult = v2b.onExtraCallbackWithResult();
                            int i22 = onNavigationEvent + 109;
                            onWarmupCompleted = i22 % 128;
                            if (i22 % 2 != 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                    obj = obj2;
                }
                v5bVar.onWarmupCompleted("레이블이 길어지는 경우", (Function0) obj, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onMessageChannelReady + 39;
                    onActivityResized = i19 % 128;
                    int i20 = i19 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                Object obj3 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                v5bVar.onWarmupCompleted("레이블이 길어지는 경우", (Function0) obj3, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onMessageChannelReady + 125;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(349086998, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$349086998.<anonymous> (TdsDialogV1.kt:378)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"다시 촬영해주세요", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onActivityResized + 89;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedObject(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 119;
        int i4 = i3 % 128;
        onMessageChannelReady = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i4 + 63;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onMessageChannelReady + 73;
                onActivityResized = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-887771049, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-887771049.<anonymous> (TdsDialogV1.kt:381)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-887771049, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-887771049.<anonymous> (TdsDialogV1.kt:381)");
                int i9 = onMessageChannelReady + 123;
                onActivityResized = i9 % 128;
                int i10 = i9 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"- 만보기 정책이 변경되었어요. 최신 버전으로 업데이트 후 이용해주세요.\n- 보상금 지급은 최신 버전에서 변경된 정책을 따르며, 업데이트를 하지 않는 경우 보상금 지급 및 서비스 이용이 제한됩니다.", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onMessageChannelReady + 1;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 107) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    int i6 = onActivityResized + 121;
                    onMessageChannelReady = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    int i8 = onMessageChannelReady + 19;
                    onActivityResized = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onMessageChannelReady + 97;
                onActivityResized = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1780341818, i3, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$1780341818.<anonymous> (TdsDialogV1.kt:389)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1780341818, i3, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$1780341818.<anonymous> (TdsDialogV1.kt:389)");
            }
            u4Var.onNavigationEvent("레이블이 길어지는 경우", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i3 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onMessageChannelReady + 87;
                onActivityResized = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i12 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = onActivityResized + 119;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(v5bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v5bVar)) {
                int i6 = onActivityResized + 15;
                onMessageChannelReady = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i8 = onActivityResized + 25;
            onMessageChannelReady = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1682599289, i, -1, "im.toss.tds.compose.component.compound.dialog.ComposableSingletons$TdsDialogV1Kt.lambda$-1682599289.<anonymous> (TdsDialogV1.kt:384)");
            }
            v5bVar.onNavigationEvent((QuirksExternalSyntheticBackport0) null, access100, IAuthTabCallback_Parcel, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 432, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onActivityResized + 63;
                onMessageChannelReady = i10 % 128;
                if (i10 % 2 == 0) {
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

    public static /* synthetic */ Unit onExtraCallback() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[0], iOnExtraCallback, 1845030086, -1845030086, iOnExtraCallback3, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit asInterface(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, 2008639518, -2008639517, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, -967311097, 967311105, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit onExtraCallback(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, -1463568045, 1463568050, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallbackStub(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, 1347684173, -1347684169, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallback_Parcel(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, iOnExtraCallback, 1359600666, -1359600660, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit ICustomTabsCallback() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[0], iOnExtraCallback, -2051449555, 2051449562, iOnExtraCallback3, iOnExtraCallback2);
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Function2) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{this}, iOnExtraCallback, 161343106, -161343103, iOnExtraCallback3, iOnExtraCallback2);
    }

    public final getBacktraceNote<v5b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (getBacktraceNote) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{this}, iOnExtraCallback, 1720700962, -1720700960, iOnExtraCallback3, iOnExtraCallback2);
    }

    static void getInterfaceDescriptor() {
        extraCallbackWithResult = (char) 7726;
        readTypedObject = (char) 38925;
        ICustomTabsCallback = (char) 9401;
        onMinimized = (char) 29053;
    }
}
