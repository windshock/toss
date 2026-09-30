package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.InterfaceC0083handshake;
import o.QuirksExternalSyntheticBackport0;
import o.SpannedDataExternalSyntheticLambda0;
import o.getViewTypeCount;
import o.toPreviewOnlyRange;
import o.w3a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w3a {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 0;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final w3a onWarmupCompleted = new w3a();
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
    private static final ConcurrentHashMap<String, AtomicInteger> onTransact = new ConcurrentHashMap<>();
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
    private static final float IAuthTabCallbackDefault = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
    private static final float asBinder = AppLovinAdType.onExtraCallbackWithResult.onNavigationEvent();
    private static final InterfaceC0083handshake.onNavigationEvent IAuthTabCallbackStub = ConnectionPool.onWarmupCompleted.onNavigationEvent();

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i5 | i6)) | i3;
        int i8 = (~((~i6) | i5)) | i3;
        int i9 = (~i3) | i5;
        int i10 = i3 + i5 + i + (440753341 * i4) + ((-634449194) * i2);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i3) + 1075183616 + ((-1421434046) * i5) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i) + (780402688 * i4) + ((-180879360) * i2) + (353763328 * i11);
        int i13 = (i3 * 892202253) + 1676176333 + (i5 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i * 892200819) + (i4 * (-770690073)) + (i2 * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        if (i14 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i14 != 2) {
            return i14 != 3 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i15 = 2 % 2;
        int i16 = getInterfaceDescriptor + 119;
        asInterface = i16 % 128;
        int i17 = i16 % 2;
        Unit unit = (Unit) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, -557553565, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 557553565, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        int i18 = getInterfaceDescriptor + 61;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w3a w3aVar, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, createCameraCaptureCallback createcameracapturecallback, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = getInterfaceDescriptor + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(w3aVar, accessgettlsversionsasstringp, j, graphicDeviceInfo, createcameracapturecallback, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asInterface + 25;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(gethumanreadablename, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        IAuthTabCallback(gethumanreadablename, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(w3a w3aVar, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, createCameraCaptureCallback createcameracapturecallback, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = getInterfaceDescriptor + 33;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            w3aVar.onWarmupCompleted(accessgettlsversionsasstringp, j, graphicDeviceInfo, createcameracapturecallback, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            w3aVar.onWarmupCompleted(accessgettlsversionsasstringp, j, graphicDeviceInfo, createcameracapturecallback, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    private w3a() {
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 73;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = onExtraCallbackWithResult;
        int i4 = i2 + 107;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final ConcurrentHashMap<String, AtomicInteger> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 125;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = onTransact;
        int i5 = i2 + 37;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float f = onExtraCallback;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float f = onNavigationEvent;
        int i5 = i2 + 25;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 61;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float f = IAuthTabCallbackDefault;
        int i5 = i2 + 15;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        float f = asBinder;
        int i5 = i3 + 43;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final InterfaceC0083handshake.onNavigationEvent asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC0083handshake.onNavigationEvent onnavigationevent = IAuthTabCallbackStub;
        int i5 = i2 + 41;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return onnavigationevent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        w3a w3aVar = (w3a) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            int i2 = getInterfaceDescriptor + 105;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                getViewTypeCount.onNavigationEvent.Companion.onExtraCallback().IAuthTabCallback();
                throw null;
            }
            fFloatValue = getViewTypeCount.onNavigationEvent.Companion.onExtraCallback().IAuthTabCallback();
        }
        if ((iIntValue & 2) != 0) {
            fFloatValue2 = getViewTypeCount.onTransact.Companion.onExtraCallback().onTransact();
            int i3 = getInterfaceDescriptor + 39;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        return w3aVar.onExtraCallbackWithResult(fFloatValue, fFloatValue2);
    }

    public final DeviceQuirksExternalSyntheticLambda0 onExtraCallbackWithResult(float f, float f2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(f, f2);
        int i4 = getInterfaceDescriptor + 65;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ DeviceQuirksExternalSyntheticLambda0 onNavigationEvent(w3a w3aVar, float f, float f2, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = asInterface + 55;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                getViewTypeCount.onNavigationEvent.Companion.onExtraCallback().IAuthTabCallback();
                obj2.hashCode();
                throw null;
            }
            f = getViewTypeCount.onNavigationEvent.Companion.onExtraCallback().IAuthTabCallback();
        }
        if ((i & 2) != 0) {
            int i4 = asInterface + 69;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                getViewTypeCount.onTransact.Companion.onExtraCallback().onTransact();
                obj2.hashCode();
                throw null;
            }
            f2 = getViewTypeCount.onTransact.Companion.onExtraCallback().onTransact();
        }
        if ((i & 4) != 0) {
            f3 = getViewTypeCount.onNavigationEvent.Companion.onExtraCallback().IAuthTabCallback();
        }
        if ((i & 8) != 0) {
            int i5 = asInterface + 79;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            f4 = getViewTypeCount.onTransact.Companion.onExtraCallback().onTransact();
            int i7 = asInterface + 55;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
        return w3aVar.onExtraCallbackWithResult(f, f2, f3, f4);
    }

    public final DeviceQuirksExternalSyntheticLambda0 onExtraCallbackWithResult(float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, f2, f3, f4);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = getInterfaceDescriptor + 49;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 123;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0 ? (iIntValue & 3) == 2 : (iIntValue & 2) == 5) {
            int i4 = i2 + 5;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = asInterface + 101;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(297756122, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1Defaults.RowText.<anonymous>.<anonymous> (TdsListRowV1Defaults.kt:103)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                int i8 = getInterfaceDescriptor + 35;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            getbacktracenote.invoke(RowScopeInstance.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = asInterface + 65;
                getInterfaceDescriptor = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = asInterface + 47;
        getInterfaceDescriptor = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(getHumanReadableName gethumanreadablename, final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 89;
        getInterfaceDescriptor = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 5) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1987379482, i, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1Defaults.RowText.<anonymous> (TdsListRowV1Defaults.kt:100)");
            }
            setPostviewFormatSelector.onNavigationEvent(PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(gethumanreadablename), ForwardingCameraControl.onExtraCallback(297756122, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Defaults$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 51;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = {getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                    int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                    Unit unit = (Unit) w3a.IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, 913226523, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -913226521, iIAuthTabCallback);
                    int i7 = IAuthTabCallback + 105;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 121;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, final long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable createCameraCaptureCallback createcameracapturecallback, @Nullable final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i4;
        final createCameraCaptureCallback createcameracapturecallback2;
        int i5;
        boolean z;
        final GraphicDeviceInfo graphicDeviceInfo3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        GraphicDeviceInfo graphicDeviceInfo4;
        boolean z2;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2026459476);
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(accessgettlsversionsasstringp.ordinal())) {
                i6 = 2;
            } else {
                int i8 = asInterface + 91;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                graphicDeviceInfo2 = graphicDeviceInfo;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    int i11 = getInterfaceDescriptor + 121;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    createcameracapturecallback2 = createcameracapturecallback;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(createcameracapturecallback2)) {
                        int i13 = asInterface + 11;
                        getInterfaceDescriptor = i13 % 128;
                        i5 = i13 % 2 == 0 ? 18713 : 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    int i14 = getInterfaceDescriptor + 97;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 131072 : 65536;
                    int i16 = asInterface + 27;
                    getInterfaceDescriptor = i16 % 128;
                    int i17 = i16 % 2;
                }
                boolean z3 = false;
                if ((74899 & i3) != 74898) {
                    int i18 = getInterfaceDescriptor + 105;
                    asInterface = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                    if (i10 != 0) {
                        int i20 = asInterface + 73;
                        getInterfaceDescriptor = i20 % 128;
                        int i21 = i20 % 2;
                        graphicDeviceInfo4 = null;
                    } else {
                        graphicDeviceInfo4 = graphicDeviceInfo2;
                    }
                    if (i4 != 0) {
                        createcameracapturecallback2 = null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2026459476, i3, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1Defaults.RowText (TdsListRowV1Defaults.kt:83)");
                    }
                    if (getbacktracenote != null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(194202116);
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        boolean z4 = (i3 & 14) == 4;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                        if ((i3 & 112) == 32) {
                            int i22 = getInterfaceDescriptor + 31;
                            asInterface = i22 % 128;
                            int i23 = i22 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z5 = (i3 & 896) == 256;
                        if ((i3 & 7168) == 2048) {
                            int i24 = asInterface + 97;
                            getInterfaceDescriptor = i24 % 128;
                            int i25 = i24 % 2;
                            z3 = true;
                        }
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(z4 | zOnNavigationEvent | z2 | z5 | z3)) {
                            int i26 = getInterfaceDescriptor + 97;
                            asInterface = i26 % 128;
                            int i27 = i26 % 2;
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new getHumanReadableName(j, AppLovinMediationProvider.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4, accessgettlsversionsasstringp), graphicDeviceInfo4, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, createcameracapturecallback2 != null ? createcameracapturecallback2.asInterface() : createCameraCaptureCallback.Companion.IAuthTabCallbackDefault(), 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16744440, (DefaultConstructorMarker) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            final getHumanReadableName gethumanreadablename = (getHumanReadableName) objOnMinimized;
                            dispatchPostbackRequest.onNavigationEvent(0.0f, null, 0, IAuthTabCallbackStub, null, ForwardingCameraControl.onExtraCallback(1987379482, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Defaults$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj, Object obj2) {
                                    Unit unit;
                                    int i28 = 2 % 2;
                                    int i29 = onExtraCallback + 103;
                                    onExtraCallbackWithResult = i29 % 128;
                                    if (i29 % 2 != 0) {
                                        Object[] objArr = {gethumanreadablename, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                                        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                                        unit = (Unit) w3a.IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, 647885662, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -647885661, iIAuthTabCallback);
                                        int i30 = 4 / 0;
                                    } else {
                                        Object[] objArr2 = {gethumanreadablename, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                                        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                                        unit = (Unit) w3a.IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr2, 647885662, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -647885661, iIAuthTabCallback2);
                                    }
                                    int i31 = onExtraCallbackWithResult + 103;
                                    onExtraCallback = i31 % 128;
                                    int i32 = i31 % 2;
                                    return unit;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 23);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(194949774);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    graphicDeviceInfo3 = graphicDeviceInfo4;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    graphicDeviceInfo3 = graphicDeviceInfo2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Defaults$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i28 = 2 % 2;
                            int i29 = onExtraCallback + 73;
                            onWarmupCompleted = i29 % 128;
                            int i30 = i29 % 2;
                            Unit unitOnExtraCallbackWithResult = w3a.onExtraCallbackWithResult(this.f$0, accessgettlsversionsasstringp, j, graphicDeviceInfo3, createcameracapturecallback2, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i31 = onWarmupCompleted + 77;
                            onExtraCallback = i31 % 128;
                            if (i31 % 2 == 0) {
                                int i32 = 66 / 0;
                            }
                            return unitOnExtraCallbackWithResult;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            createcameracapturecallback2 = createcameracapturecallback;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            boolean z32 = false;
            if ((74899 & i3) != 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        graphicDeviceInfo2 = graphicDeviceInfo;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        createcameracapturecallback2 = createcameracapturecallback;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        boolean z322 = false;
        if ((74899 & i3) != 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        getHumanReadableName gethumanreadablename2;
        getHumanReadableName gethumanreadablename3;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = asInterface + 53;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        getHumanReadableName gethumanreadablenameOnWarmupCompleted = null;
        if ((i2 & 4) != 0) {
            int i6 = asInterface + 89;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            gethumanreadablename2 = null;
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(708328512, i, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1Defaults.StyleMergedText (TdsListRowV1Defaults.kt:115)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2)) || (i & 6) == 4;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z) {
            if (str2 == null || StringsKt.isBlank(str)) {
                str2 = null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(str2);
            objOnMinimized = str2;
        } else {
            int i8 = asInterface + 17;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        String str3 = (String) objOnMinimized;
        if (str3 != null) {
            int i10 = asInterface + 67;
            getInterfaceDescriptor = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(640615934);
                gethumanreadablenameOnWarmupCompleted.hashCode();
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(640615934);
            if (gethumanreadablename2 == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(640647801);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(640647802);
                gethumanreadablenameOnWarmupCompleted = ((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted())).onWarmupCompleted(gethumanreadablename2);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (gethumanreadablenameOnWarmupCompleted == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2098877895);
                gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2098875849);
                gethumanreadablename3 = gethumanreadablenameOnWarmupCompleted;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str3, quirksExternalSyntheticBackport02, gethumanreadablename3, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 112), 0, 131064}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(640865794);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i11 = getInterfaceDescriptor + 13;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    static {
        int i = IAuthTabCallbackStubProxy + 49;
        access000 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getHumanReadableName gethumanreadablename, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {gethumanreadablename, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, 647885662, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -647885661, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, 913226523, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -913226521, iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, -557553565, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 557553565, iIAuthTabCallback);
    }

    public static /* synthetic */ DeviceQuirksExternalSyntheticLambda0 onExtraCallbackWithResult(w3a w3aVar, float f, float f2, int i, Object obj) {
        Object[] objArr = {w3aVar, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), obj};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (DeviceQuirksExternalSyntheticLambda0) IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, -998810847, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 998810850, iIAuthTabCallback);
    }
}
