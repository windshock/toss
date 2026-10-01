package o;

import android.content.res.Configuration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.common.collect.Synchronized;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ExtensionsManager1;
import o.MaxAppOpenAd;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.getSwitchMinWidth;
import o.isContainerClickable;
import o.readFully;
import o.removeAdapter;
import o.removeObserverLocked;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda24;
import o.x2ExternalSyntheticLambda25;
import o.x2ExternalSyntheticLambda28;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda24 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i6 | i9;
        int i11 = ~i6;
        int i12 = i9 | (~(i11 | i));
        int i13 = (~(i2 | i7 | i6)) | (~(i8 | i11 | i7));
        int i14 = i + i6 + i5 + ((-619979367) * i3) + (68302741 * i4);
        int i15 = i14 * i14;
        int i16 = (i * 561304900) + 382271488 + (561304900 * i6) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i5) + (1615200256 * i3) + ((-1821507584) * i4) + (428933120 * i15);
        int i17 = ((i * (-96142684)) - 56799437) + (i6 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i5 * (-96141863)) + (i3 * (-1380774991)) + (i4 * (-1175232947)) + (i15 * (-118947840));
        int i18 = i16 + (i17 * i17 * (-1369505792));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(maxAppOpenAd);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(maxAppOpenAd);
        int i3 = onExtraCallback + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getBacktraceNote getbacktracenote, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, x2ExternalSyntheticLambda30 x2externalsyntheticlambda30, getBacktraceNote getbacktracenote2, float f, x2ExternalSyntheticLambda25.onExtraCallback onextracallback, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, j, getsupportedhighspeedresolutionsfor, getbacktracenote, cameraPresenceProviderExternalSyntheticLambda6, x2externalsyntheticlambda30, getbacktracenote2, f, onextracallback, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 21;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(removeadapter);
        int i4 = onExtraCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallback(x2ExternalSyntheticLambda25.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x2ExternalSyntheticLambda28 x2externalsyntheticlambda28, x2ExternalSyntheticLambda25.onExtraCallback onextracallback, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(iAuthTabCallback, quirksExternalSyntheticBackport0, x2externalsyntheticlambda28, onextracallback, j, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 123;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(long j, long j2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(j, j2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 105;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x2ExternalSyntheticLambda28 x2externalsyntheticlambda28, x2ExternalSyntheticLambda25.onExtraCallback onextracallback, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback((getBacktraceNote<? super x2ExternalSyntheticLambda32, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, (getBacktraceNote<? super x2ExternalSyntheticLambda27, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, quirksExternalSyntheticBackport0, x2externalsyntheticlambda28, onextracallback, j, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 97;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(-1823428807, iOnExtraCallback3, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, 1823428808, new Object[]{readfully, setorientationdegrees});
        int i3 = onExtraCallbackWithResult + 41;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        removeAdapter removeadapter = (removeAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(removeadapter);
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, long j2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(j, j2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 3;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult;
        long jLongValue = ((Number) objArr[0]).longValue();
        long jLongValue2 = ((Number) objArr[1]).longValue();
        long jLongValue3 = ((Number) objArr[2]).longValue();
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(jLongValue, jLongValue2, jLongValue3, sessionProcessorCaptureCallback);
            int i3 = 97 / 0;
        } else {
            removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(jLongValue, jLongValue2, jLongValue3, sessionProcessorCaptureCallback);
        }
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        x2ExternalSyntheticLambda25.IAuthTabCallback iAuthTabCallback = (x2ExternalSyntheticLambda25.IAuthTabCallback) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        x2ExternalSyntheticLambda28 x2externalsyntheticlambda28 = (x2ExternalSyntheticLambda28) objArr[2];
        x2ExternalSyntheticLambda25.onExtraCallback onextracallback = (x2ExternalSyntheticLambda25.onExtraCallback) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue3 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(iAuthTabCallback, quirksExternalSyntheticBackport0, x2externalsyntheticlambda28, onextracallback, jLongValue, deviceQuirksExternalSyntheticLambda0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        int i3 = 31 / 0;
        return IAuthTabCallback(iAuthTabCallback, quirksExternalSyntheticBackport0, x2externalsyntheticlambda28, onextracallback, jLongValue, deviceQuirksExternalSyntheticLambda0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x2ExternalSyntheticLambda28 x2externalsyntheticlambda28, x2ExternalSyntheticLambda25.onExtraCallback onextracallback, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, getbacktracenote2, quirksExternalSyntheticBackport0, x2externalsyntheticlambda28, onextracallback, j, deviceQuirksExternalSyntheticLambda0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 17;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor, extensionsManager1);
        int i4 = onExtraCallbackWithResult + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final x2ExternalSyntheticLambda25.IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable x2ExternalSyntheticLambda28 x2externalsyntheticlambda28, @Nullable x2ExternalSyntheticLambda25.onExtraCallback onextracallback, long j, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        x2ExternalSyntheticLambda28 x2externalsyntheticlambda282;
        x2ExternalSyntheticLambda25.onExtraCallback onextracallback2;
        int i4;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        int i5;
        int i6;
        boolean z;
        long j2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final x2ExternalSyntheticLambda28 x2externalsyntheticlambda283;
        final x2ExternalSyntheticLambda25.onExtraCallback onextracallback3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        x2ExternalSyntheticLambda28 x2externalsyntheticlambda28OnExtraCallbackWithResult;
        x2ExternalSyntheticLambda25.onExtraCallback onwarmupcompleted;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
        x2ExternalSyntheticLambda25.onExtraCallback onextracallback4;
        int i7;
        long jOnNavigationEvent = j;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-762928843);
        Object obj = null;
        if ((i & 6) == 0) {
            int i9 = onExtraCallbackWithResult + 77;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback);
                obj.hashCode();
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            int i11 = onExtraCallbackWithResult + 57;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    x2externalsyntheticlambda282 = x2externalsyntheticlambda28;
                    int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x2externalsyntheticlambda282) ? 256 : 128;
                    i3 |= i13;
                } else {
                    x2externalsyntheticlambda282 = x2externalsyntheticlambda28;
                }
                i3 |= i13;
            } else {
                x2externalsyntheticlambda282 = x2externalsyntheticlambda28;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    onextracallback2 = onextracallback;
                    int i14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 2048 : 1024;
                    i3 |= i14;
                } else {
                    onextracallback2 = onextracallback;
                }
                i3 |= i14;
            } else {
                onextracallback2 = onextracallback;
            }
            if ((i & 24576) == 0) {
                int i15 = onExtraCallbackWithResult;
                int i16 = i15 + 33;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                if ((i2 & 16) == 0) {
                    int i18 = i15 + 87;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnNavigationEvent);
                        throw null;
                    }
                    int i19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnNavigationEvent) ? 16384 : 8192;
                    i3 |= i19;
                }
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda02)) {
                        int i20 = onExtraCallbackWithResult + 35;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i6 = i5 | i3;
                }
                if ((74899 & i6) != 74898) {
                    int i22 = onExtraCallbackWithResult + 13;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i6 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        quirksExternalSyntheticBackport04 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if ((i2 & 4) != 0) {
                            x2externalsyntheticlambda28OnExtraCallbackWithResult = x2ExternalSyntheticLambda3.onExtraCallbackWithResult(false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                            i6 &= -897;
                        } else {
                            x2externalsyntheticlambda28OnExtraCallbackWithResult = x2externalsyntheticlambda282;
                        }
                        if ((i2 & 8) != 0) {
                            onwarmupcompleted = new x2ExternalSyntheticLambda25.onExtraCallback.onWarmupCompleted(3);
                            i6 &= -7169;
                        } else {
                            onwarmupcompleted = onextracallback2;
                        }
                        if ((i2 & 16) != 0) {
                            jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                            i6 &= -57345;
                        }
                        if (i4 != 0) {
                            int i24 = onExtraCallbackWithResult + 15;
                            onExtraCallback = i24 % 128;
                            int i25 = i24 % 2;
                            int i26 = i6;
                            deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                            onextracallback4 = onwarmupcompleted;
                            i7 = i26;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-762928843, i7, -1, "im.toss.tds.compose.component.compound.skeleton.TdsSkeleton (TdsSkeleton.kt:130)");
                        }
                        IAuthTabCallback(iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onNavigationEvent(), quirksExternalSyntheticBackport04, x2externalsyntheticlambda28OnExtraCallbackWithResult, onextracallback4, jOnNavigationEvent, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i7 << 3) & 4194176, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                        onextracallback3 = onextracallback4;
                        long j3 = jOnNavigationEvent;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        x2externalsyntheticlambda283 = x2externalsyntheticlambda28OnExtraCallbackWithResult;
                        j2 = j3;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 4) != 0) {
                            int i27 = onExtraCallbackWithResult + 55;
                            onExtraCallback = i27 % 128;
                            i6 = i27 % 2 == 0 ? i6 & 7947 : i6 & (-897);
                        }
                        if ((i2 & 8) != 0) {
                            int i28 = onExtraCallback + 1;
                            onExtraCallbackWithResult = i28 % 128;
                            int i29 = i28 % 2;
                            i6 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            int i30 = onExtraCallbackWithResult + 43;
                            onExtraCallback = i30 % 128;
                            if (i30 % 2 == 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            i6 &= -57345;
                        }
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        x2externalsyntheticlambda28OnExtraCallbackWithResult = x2externalsyntheticlambda282;
                        onwarmupcompleted = onextracallback2;
                    }
                    onextracallback4 = onwarmupcompleted;
                    i7 = i6;
                    deviceQuirksExternalSyntheticLambda0IAuthTabCallback = deviceQuirksExternalSyntheticLambda02;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    IAuthTabCallback(iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onNavigationEvent(), quirksExternalSyntheticBackport04, x2externalsyntheticlambda28OnExtraCallbackWithResult, onextracallback4, jOnNavigationEvent, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i7 << 3) & 4194176, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                    onextracallback3 = onextracallback4;
                    long j32 = jOnNavigationEvent;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    x2externalsyntheticlambda283 = x2externalsyntheticlambda28OnExtraCallbackWithResult;
                    j2 = j32;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    j2 = jOnNavigationEvent;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    x2externalsyntheticlambda283 = x2externalsyntheticlambda282;
                    onextracallback3 = onextracallback2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final long j4 = j2;
                    final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda02;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i31 = 2 % 2;
                            int i32 = IAuthTabCallback + 5;
                            onNavigationEvent = i32 % 128;
                            int i33 = i32 % 2;
                            x2ExternalSyntheticLambda25.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                            x2ExternalSyntheticLambda28 x2externalsyntheticlambda284 = x2externalsyntheticlambda283;
                            x2ExternalSyntheticLambda25.onExtraCallback onextracallback5 = onextracallback3;
                            long j5 = j4;
                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda03;
                            int i34 = i;
                            int i35 = i2;
                            int iIntValue = ((Integer) obj4).intValue();
                            Object[] objArr = {iAuthTabCallback2, quirksExternalSyntheticBackport05, x2externalsyntheticlambda284, onextracallback5, Long.valueOf(j5), deviceQuirksExternalSyntheticLambda04, Integer.valueOf(i34), Integer.valueOf(i35), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                            Unit unit = (Unit) x2ExternalSyntheticLambda24.IAuthTabCallback(787119148, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -787119148, objArr);
                            int i36 = onNavigationEvent + 99;
                            IAuthTabCallback = i36 % 128;
                            int i37 = i36 % 2;
                            return unit;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
            i6 = i3;
            if ((74899 & i6) != 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
        i6 = i3;
        if ((74899 & i6) != 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onNavigationEvent(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.IAuthTabCallback(removeadapter, (Integer) 1000, (Integer) null, (setOnQueryTextListener) getCallToActionButton.onExtraCallback.onTransact(), 1.0f, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.IAuthTabCallback(removeadapter, (Integer) 400, (Integer) null, (setOnQueryTextListener) getCallToActionButton.onExtraCallback.onExtraCallback(), 0.0f, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.TRUE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 41;
                IAuthTabCallback = i3 % 128;
                removeAdapter removeadapter = (removeAdapter) obj;
                if (i3 % 2 != 0) {
                    x2ExternalSyntheticLambda24.IAuthTabCallback(removeadapter);
                    throw null;
                }
                Unit unitIAuthTabCallback = x2ExternalSyntheticLambda24.IAuthTabCallback(removeadapter);
                int i4 = IAuthTabCallback + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.FALSE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                Unit unit = (Unit) x2ExternalSyntheticLambda24.IAuthTabCallback(-369383260, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 369383264, new Object[]{(removeAdapter) obj});
                int i5 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(extensionsManager1.onExtraCallbackWithResult())};
        IAuthTabCallback(907177337, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -907177335, objArr);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, long j, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getBacktraceNote getbacktracenote, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, x2ExternalSyntheticLambda30 x2externalsyntheticlambda30, getBacktraceNote getbacktracenote2, float f, x2ExternalSyntheticLambda25.onExtraCallback onextracallback, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable)) {
                int i6 = onExtraCallback + 71;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                int i8 = onExtraCallback + 57;
                onExtraCallbackWithResult = i8 % 128;
                i3 = i8 % 2 != 0 ? 9 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1342728929, i2, -1, "im.toss.tds.compose.component.compound.skeleton.TdsSkeleton.<anonymous> (TdsSkeleton.kt:168)");
            }
            if (((Boolean) getswitchminwidth.IAuthTabCallback()).booleanValue() || ((Boolean) getswitchminwidth.access000()).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2087730642);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj) {
                            int i9 = 2 % 2;
                            int i10 = IAuthTabCallback + 17;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitIAuthTabCallback = x2ExternalSyntheticLambda24.IAuthTabCallback((MaxAppOpenAd) obj);
                            int i12 = onExtraCallback + 45;
                            IAuthTabCallback = i12 % 128;
                            if (i12 % 2 != 0) {
                                return unitIAuthTabCallback;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = iscontainerclickable.onExtraCallback(quirksExternalSyntheticBackport0, getswitchminwidth, (Function1) objOnMinimized);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i9 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
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
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda4
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i11 = 2 % 2;
                            int i12 = IAuthTabCallback + 27;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % 2;
                            Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda24.onWarmupCompleted(getsupportedhighspeedresolutionsfor, (ExtensionsManager1) obj);
                            int i14 = IAuthTabCallback + 39;
                            onWarmupCompleted = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i15 = 1 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    int i11 = onExtraCallbackWithResult + 117;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized2), deviceQuirksExternalSyntheticLambda0);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback3);
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
                getbacktracenote.invoke(onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<x2ExternalSyntheticLambda32>) cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 0);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback2);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i13 = onExtraCallback + 23;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                long jOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor);
                int iIAuthTabCallback = x2externalsyntheticlambda30.IAuthTabCallback();
                boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jOnExtraCallbackWithResult);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIAuthTabCallback);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnWarmupCompleted | zOnExtraCallback) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new x2ExternalSyntheticLambda27(f, (int) onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor), x2externalsyntheticlambda30.IAuthTabCallback(), onextracallback);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                getbacktracenote2.invoke((x2ExternalSyntheticLambda27) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                onExtraCallback(j, onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2086451551);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallback + 45;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[PHI: r1
      0x004f: PHI (r1v40 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v41 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1
      0x003a: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v41 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final getBacktraceNote<? super x2ExternalSyntheticLambda32, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull final getBacktraceNote<? super x2ExternalSyntheticLambda27, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable x2ExternalSyntheticLambda28 x2externalsyntheticlambda28, @Nullable x2ExternalSyntheticLambda25.onExtraCallback onextracallback, long j, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        x2ExternalSyntheticLambda28 x2externalsyntheticlambda28OnExtraCallbackWithResult;
        x2ExternalSyntheticLambda25.onExtraCallback onwarmupcompleted;
        long jOnNavigationEvent;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final x2ExternalSyntheticLambda28 x2externalsyntheticlambda282;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        final x2ExternalSyntheticLambda25.onExtraCallback onextracallback2;
        final long j2;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        x2ExternalSyntheticLambda28 x2externalsyntheticlambda283;
        x2ExternalSyntheticLambda25.onExtraCallback onextracallback3;
        long j3;
        int i6;
        int i7;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
        int i8 = 2 % 2;
        int i9 = onExtraCallback + 77;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            Intrinsics.checkNotNullParameter(getbacktracenote2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1528589313);
            if ((i & 106) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                    int i10 = onExtraCallback + 125;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            Intrinsics.checkNotNullParameter(getbacktracenote2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1528589313);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(getbacktracenote2) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            int i13 = onExtraCallbackWithResult + 93;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport04);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport04) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i14 = onExtraCallbackWithResult + 47;
            onExtraCallback = i14 % 128;
            if (i14 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 45) != 0) {
                x2externalsyntheticlambda28OnExtraCallbackWithResult = x2externalsyntheticlambda28;
            } else {
                x2externalsyntheticlambda28OnExtraCallbackWithResult = x2externalsyntheticlambda28;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x2externalsyntheticlambda28OnExtraCallbackWithResult)) {
                    int i15 = onExtraCallback + 109;
                    onExtraCallbackWithResult = i15 % 128;
                    i7 = i15 % 2 != 0 ? 5487 : 2048;
                }
                i4 |= i7;
            }
            i7 = 1024;
            i4 |= i7;
        } else {
            x2externalsyntheticlambda28OnExtraCallbackWithResult = x2externalsyntheticlambda28;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                onwarmupcompleted = onextracallback;
                int i16 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(onwarmupcompleted) ? 16384 : 8192;
                i4 |= i16;
            } else {
                onwarmupcompleted = onextracallback;
            }
            i4 |= i16;
        } else {
            onwarmupcompleted = onextracallback;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                jOnNavigationEvent = j;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(jOnNavigationEvent)) {
                    int i17 = onExtraCallbackWithResult + 49;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    i6 = 131072;
                }
                i4 |= i6;
            } else {
                jOnNavigationEvent = j;
            }
            i6 = 65536;
            i4 |= i6;
        } else {
            jOnNavigationEvent = j;
        }
        int i19 = i2 & 64;
        if (i19 != 0) {
            i4 |= 1572864;
            deviceQuirksExternalSyntheticLambda0IAuthTabCallback = deviceQuirksExternalSyntheticLambda0;
        } else {
            deviceQuirksExternalSyntheticLambda0IAuthTabCallback = deviceQuirksExternalSyntheticLambda0;
            if ((i & 1572864) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(deviceQuirksExternalSyntheticLambda0IAuthTabCallback)) {
                    int i20 = onExtraCallbackWithResult + 3;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i4 |= i5;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((599187 & i4) != 599186, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage()) {
                if (i12 != 0) {
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                }
                if ((i2 & 8) != 0) {
                    int i22 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    z = true;
                    i4 &= -7169;
                    x2externalsyntheticlambda28OnExtraCallbackWithResult = x2ExternalSyntheticLambda3.onExtraCallbackWithResult(false, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1);
                } else {
                    z = true;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    onwarmupcompleted = new x2ExternalSyntheticLambda25.onExtraCallback.onWarmupCompleted(3);
                }
                if ((i2 & 32) != 0) {
                    int i24 = onExtraCallback + 95;
                    onExtraCallbackWithResult = i24 % 128;
                    int i25 = i24 % 2;
                    jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6).onNavigationEvent();
                    i4 &= -458753;
                }
                if (i19 != 0) {
                    deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                x2externalsyntheticlambda283 = x2externalsyntheticlambda28OnExtraCallbackWithResult;
                onextracallback3 = onwarmupcompleted;
                j3 = jOnNavigationEvent;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i4 &= -458753;
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                x2externalsyntheticlambda283 = x2externalsyntheticlambda28OnExtraCallbackWithResult;
                onextracallback3 = onwarmupcompleted;
                j3 = jOnNavigationEvent;
                z = true;
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i26 = onExtraCallbackWithResult + 97;
                onExtraCallback = i26 % 128;
                int i27 = i26 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1528589313, i4, -1, "im.toss.tds.compose.component.compound.skeleton.TdsSkeleton (TdsSkeleton.kt:151)");
            }
            final float f = ((Configuration) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())).fontScale;
            final x2ExternalSyntheticLambda30 x2externalsyntheticlambda30IAuthTabCallback = x2ExternalSyntheticLambda31.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(new x2ExternalSyntheticLambda32(x2externalsyntheticlambda30IAuthTabCallback, f), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            boolean zOnExtraCallback = x2externalsyntheticlambda283.onExtraCallback();
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda03;
            final long j4 = j3;
            final x2ExternalSyntheticLambda25.onExtraCallback onextracallback4 = onextracallback3;
            setTaggedAddrCtrl settaggedaddrctrl = new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i28 = 2 % 2;
                    int i29 = onNavigationEvent + 47;
                    onExtraCallbackWithResult = i29 % 128;
                    int i30 = i29 % 2;
                    Unit unitIAuthTabCallback = x2ExternalSyntheticLambda24.IAuthTabCallback(quirksExternalSyntheticBackport05, deviceQuirksExternalSyntheticLambda04, j4, getsupportedhighspeedresolutionsfor, getbacktracenote, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, x2externalsyntheticlambda30IAuthTabCallback, getbacktracenote2, f, onextracallback4, (isContainerClickable) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i31 = onNavigationEvent + 53;
                    onExtraCallbackWithResult = i31 % 128;
                    int i32 = i31 % 2;
                    return unitIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{Boolean.valueOf(zOnExtraCallback), null, 0, 0, ForwardingCameraControl.onExtraCallback(1342728929, z, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult3, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            x2externalsyntheticlambda282 = x2externalsyntheticlambda283;
            onextracallback2 = onextracallback3;
            j2 = j3;
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda03;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            x2externalsyntheticlambda282 = x2externalsyntheticlambda28OnExtraCallbackWithResult;
            long j5 = jOnNavigationEvent;
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
            onextracallback2 = onwarmupcompleted;
            j2 = j5;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i28 = 2 % 2;
                    int i29 = IAuthTabCallback + 105;
                    onNavigationEvent = i29 % 128;
                    int i30 = i29 % 2;
                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda24.onWarmupCompleted(getbacktracenote, getbacktracenote2, quirksExternalSyntheticBackport02, x2externalsyntheticlambda282, onextracallback2, j2, deviceQuirksExternalSyntheticLambda02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i31 = onNavigationEvent + 49;
                    IAuthTabCallback = i31 % 128;
                    int i32 = i31 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    private static final removeObserverLocked onExtraCallbackWithResult(long j, long j2, long j3, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyOnExtraCallback = readFully.onExtraCallback.onExtraCallback(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), setByteOrder.onNavigationEvent(j)}), j2, j3, 0, 8, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = x2ExternalSyntheticLambda24.onExtraCallback(readfullyOnExtraCallback, (setOrientationDegrees) obj);
                int i5 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        });
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long j;
        long j2;
        float f;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int i2;
        readFully readfully = (readFully) objArr[0];
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[1];
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            j = 1;
            j2 = 1;
            f = 0.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 1;
            i2 = 53;
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            j = 0;
            j2 = 0;
            f = 0.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 0;
            i2 = 126;
        }
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, j, j2, f, hasmoreelements, seekVar, i, i2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 31;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final long j, final long j2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-737243875);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i6 = onExtraCallback + 53;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            int i8 = onExtraCallbackWithResult + 95;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i10 = onExtraCallbackWithResult + 43;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallback + 41;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-737243875, i2, -1, "im.toss.tds.compose.component.compound.skeleton.CoverGradient (TdsSkeleton.kt:208)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            if ((i2 & 112) == 32) {
                int i14 = onExtraCallbackWithResult + 59;
                onExtraCallback = i14 % 128;
                boolean z2 = i14 % 2 != 0;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z2) {
                    int i15 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        double radians = Math.toRadians(65.0d);
                        float fCos = (float) Math.cos(radians);
                        float fSin = (float) Math.sin(radians);
                        r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                        float fCoerceAtLeast = (float) ((RangesKt.coerceAtLeast(r11, r12) * Math.sqrt(2.0d)) / 2.0d);
                        float f = ((int) (j2 >> 32)) / 2.0f;
                        float f2 = fCos * fCoerceAtLeast;
                        float f3 = ((int) j2) / 2.0f;
                        float f4 = fSin * fCoerceAtLeast;
                        objOnMinimized = getWrite.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(f - f2) << 32) | (Float.floatToRawIntBits(f3 - f4) & 4294967295L))), setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(f + f2) << 32) | (Float.floatToRawIntBits(f3 + f4) & 4294967295L))));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    } else {
                        r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                    }
                    Pair pair = (Pair) objOnMinimized;
                    final long jOnExtraCallback = ((setUseCaseAttached) pair.onExtraCallbackWithResult()).onExtraCallback();
                    final long jOnExtraCallback2 = ((setUseCaseAttached) pair.IAuthTabCallback()).onExtraCallback();
                    boolean z3 = true;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) j2));
                    if ((i2 & 14) == 4) {
                        int i17 = onExtraCallback + 57;
                        onExtraCallbackWithResult = i17 % 128;
                        int i18 = i17 % 2;
                    } else {
                        z3 = false;
                    }
                    boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnExtraCallback);
                    boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnExtraCallback2);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((zOnWarmupCompleted | z3) || zOnWarmupCompleted2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        i3 = 0;
                        objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda8
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj) {
                                int i19 = 2 % 2;
                                int i20 = onExtraCallback + 35;
                                onWarmupCompleted = i20 % 128;
                                if (i20 % 2 == 0) {
                                    long j3 = j;
                                    long j4 = jOnExtraCallback;
                                    long j5 = jOnExtraCallback2;
                                    Long lValueOf = Long.valueOf(j3);
                                    Long lValueOf2 = Long.valueOf(j4);
                                    Long lValueOf3 = Long.valueOf(j5);
                                    int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                                    int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                                    return (removeObserverLocked) x2ExternalSyntheticLambda24.IAuthTabCallback(749369795, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -749369792, new Object[]{lValueOf, lValueOf2, lValueOf3, (SessionProcessorCaptureCallback) obj});
                                }
                                long j6 = j;
                                long j7 = jOnExtraCallback;
                                long j8 = jOnExtraCallback2;
                                Long lValueOf4 = Long.valueOf(j6);
                                Long lValueOf5 = Long.valueOf(j7);
                                Long lValueOf6 = Long.valueOf(j8);
                                int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                                int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                                removeObserverLocked removeobserverlocked = (removeObserverLocked) x2ExternalSyntheticLambda24.IAuthTabCallback(749369795, iOnExtraCallback3, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, -749369792, new Object[]{lValueOf4, lValueOf5, lValueOf6, (SessionProcessorCaptureCallback) obj});
                                int i21 = 33 / 0;
                                return removeobserverlocked;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    } else {
                        i3 = 0;
                    }
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i19 = onExtraCallback + 33;
                        onExtraCallbackWithResult = i19 % 128;
                        int i20 = i19 % 2;
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.TdsSkeletonKt$$ExternalSyntheticLambda9
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i21 = 2 % 2;
                    int i22 = onWarmupCompleted + 21;
                    onExtraCallbackWithResult = i22 % 128;
                    int i23 = i22 % 2;
                    Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda24.onExtraCallbackWithResult(j, j2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i24 = onWarmupCompleted + 11;
                    onExtraCallbackWithResult = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 58 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    private static final x2ExternalSyntheticLambda32 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<x2ExternalSyntheticLambda32> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        x2ExternalSyntheticLambda32 x2externalsyntheticlambda32 = (x2ExternalSyntheticLambda32) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return x2externalsyntheticlambda32;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final long onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor) {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            jOnExtraCallbackWithResult = extensionsManager1.onExtraCallbackWithResult();
            int i4 = 98 / 0;
        } else {
            jOnExtraCallbackWithResult = extensionsManager1.onExtraCallbackWithResult();
        }
        int i5 = onExtraCallback + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return jOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(jLongValue));
            return null;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(jLongValue));
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda25.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x2ExternalSyntheticLambda28 x2externalsyntheticlambda28, x2ExternalSyntheticLambda25.onExtraCallback onextracallback, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {iAuthTabCallback, quirksExternalSyntheticBackport0, x2externalsyntheticlambda28, onextracallback, Long.valueOf(j), deviceQuirksExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(787119148, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -787119148, objArr);
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(long j, long j2, long j3, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), sessionProcessorCaptureCallback};
        return (removeObserverLocked) IAuthTabCallback(749369795, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -749369792, objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(removeAdapter removeadapter) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) IAuthTabCallback(-369383260, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 369383264, new Object[]{removeadapter});
    }

    private static final Unit onNavigationEvent(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) IAuthTabCallback(-1823428807, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 1823428808, new Object[]{readfully, setorientationdegrees});
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(j)};
        IAuthTabCallback(907177337, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -907177335, objArr);
    }
}
