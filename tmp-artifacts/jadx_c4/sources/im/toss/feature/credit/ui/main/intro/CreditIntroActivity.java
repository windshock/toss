package im.toss.feature.credit.ui.main.intro;

import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.intro.CreditIntroActivity$;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.ConvertByteArrayToFloatArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DeviceGradeJudgement;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.PlayerErrorCode;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access8100;
import o.component5;
import o.dequeImageProxy;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setFinalY;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditIntroActivity extends Hilt_CreditIntroActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallbackStub = {515996876, 1573672223, 689055608, 869248604, 682413722, -664484427, 1221835800, -1384145007, -164160349, -309148640, -1112617954, -1317422060, -1866740998, -217790780, -1944499052, -2041832545, 505825094, -905359284};
    private static int access000 = 1;
    private static int onTransact;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public setFinalY tossploreManager;
    private String asInterface = "";
    private String IAuthTabCallbackDefault = "";
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroActivity$$ExternalSyntheticLambda7
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.f$0};
            Boolean boolValueOf = Boolean.valueOf(((Boolean) CreditIntroActivity.onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, 1928810815, -1928810813, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback())).booleanValue());
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return boolValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditIntroActivity creditIntroActivity = (CreditIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(creditIntroActivity);
        int i4 = access000 + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnNavigationEvent);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditIntroActivity creditIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 81;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{creditIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1353259293, -1353259292, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        }
        Object[] objArr = {creditIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int i4 = 26 / 0;
        return (Unit) onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, 1353259293, -1353259292, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditIntroActivity creditIntroActivity = (CreditIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 59;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface(creditIntroActivity);
            throw null;
        }
        Unit unitAsInterface = asInterface(creditIntroActivity);
        int i3 = onTransact + 75;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditIntroActivity creditIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return asInterface(creditIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asInterface(creditIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~((~i5) | i7);
        int i9 = ~(i2 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i5;
        int i12 = ~(i7 | i5);
        int i13 = i4 + i5 + i3 + (1577873432 * i6) + (977123338 * i);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i4) - 865599488) + ((-647756440) * i5) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i3) + ((-767557632) * i6) + (1290797056 * i) + ((-539361280) * i14);
        int i16 = (i4 * (-1177406726)) + 1326046462 + (i5 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i3 * (-1177406223)) + (i6 * 1546282648) + (i * (-1884272278)) + (i14 * 70909952);
        int i17 = i15 + (i16 * i16 * 451280896);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditIntroActivity creditIntroActivity = (CreditIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 27;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(creditIntroActivity);
        }
        onWarmupCompleted(creditIntroActivity);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditIntroActivity creditIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 107;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 13;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditIntroActivity creditIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditIntroActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = access000 + 73;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditIntroActivity creditIntroActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(creditIntroActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(creditIntroActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return 1233791L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i2 = onTransact + 117;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onTransact + 63;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final setFinalY IAuthTabCallback() {
        int i = 2 % 2;
        setFinalY setfinaly = this.tossploreManager;
        if (setfinaly == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = access000 + 45;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return setfinaly;
    }

    private final boolean setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.asBinder.getValue()).booleanValue();
        int i4 = access000 + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean onNavigationEvent(CreditIntroActivity creditIntroActivity) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0 ? !(!StringsKt.equals(creditIntroActivity.IAuthTabCallbackDefault, "tossplore", true)) : StringsKt.equals(creditIntroActivity.IAuthTabCallbackDefault, "tossplore", false)) {
            if (creditIntroActivity.IAuthTabCallback().onWarmupCompleted()) {
                int i3 = onTransact + 91;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        int i5 = onTransact + 19;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        String stringExtra;
        int i = 2 % 2;
        int i2 = onTransact + 123;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        if (intent != null) {
            int i4 = access000 + 123;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(new int[]{-2114354602, 1397050432, 1644213244, 969531136}, 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        } else {
            int i6 = access000 + 93;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            stringExtra = null;
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{-2114354602, 1397050432, 1644213244, 969531136}, (Process.myPid() >> 22) + 8, objArr2);
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), stringExtra)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.main.intro.Hilt_CreditIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String stringExtra;
        String stringExtra2;
        int i = 2 % 2;
        int i2 = onTransact + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            int i4 = access000 + 51;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(new int[]{-2114354602, 1397050432, 1644213244, 969531136}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, objArr);
            stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        } else {
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.IAuthTabCallbackDefault = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            int i6 = onTransact + 83;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                intent2.getStringExtra("credit_redirect");
                throw null;
            }
            stringExtra2 = intent2.getStringExtra("credit_redirect");
        } else {
            stringExtra2 = null;
        }
        if (stringExtra2 == null) {
            int i7 = onTransact + 47;
            access000 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str = stringExtra2;
        }
        this.asInterface = str;
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(545355945, true, new CreditIntroActivity$.ExternalSyntheticLambda1(this))), 1, (Object) null);
    }

    private static final Unit onWarmupCompleted(CreditIntroActivity creditIntroActivity) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        creditIntroActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 115;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(final CreditIntroActivity creditIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object obj;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact;
            int i4 = i3 + 25;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 125;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access000 + 119;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1459996380, i, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CreditIntroActivity.kt:61)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditIntroActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnExtraCallback)) {
                Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroActivity$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 7;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            Object[] objArr = {this.f$0};
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Object[] objArr2 = {this.f$0};
                        Unit unit = (Unit) CreditIntroActivity.onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr2, -1377691434, 1377691437, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                        int i12 = onExtraCallback + 111;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                obj = function0;
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i10 = access000 + 101;
                onTransact = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = access000 + 125;
        onTransact = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    private static final Unit asInterface(CreditIntroActivity creditIntroActivity) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            creditIntroActivity.updateVisuals();
            Unit unit = Unit.INSTANCE;
            int i3 = onTransact + 113;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        creditIntroActivity.updateVisuals();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final CreditIntroActivity creditIntroActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i4 = access000 + 49;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i6 = onTransact + 21;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-679134461, i, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CreditIntroActivity.kt:68)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = onTransact + 13;
                access000 = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
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
            String strOnPostMessage = PlayerErrorCode.onPostMessage();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditIntroActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroActivity$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 57;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr = {this.f$0};
                        Unit unit = (Unit) CreditIntroActivity.onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, -1512761175, 1512761175, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                        int i12 = onWarmupCompleted + 69;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            DeviceGradeJudgement.onExtraCallbackWithResult(strOnPostMessage, (Function0<Unit>) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        final CreditIntroActivity creditIntroActivity = (CreditIntroActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onTransact + 55;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i4 = onTransact + 109;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = access000 + 31;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1807206911, iIntValue, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroActivity.onCreate.<anonymous>.<anonymous> (CreditIntroActivity.kt:59)");
                    int i6 = 9 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1807206911, iIntValue, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroActivity.onCreate.<anonymous>.<anonymous> (CreditIntroActivity.kt:59)");
                }
            }
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, ForwardingCameraControl.onExtraCallback(1459996380, true, new Function2() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroActivity$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnExtraCallback;
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 5;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        unitOnExtraCallback = CreditIntroActivity.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i9 = 72 / 0;
                    } else {
                        unitOnExtraCallback = CreditIntroActivity.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i10 = onExtraCallbackWithResult + 97;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(-679134461, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroActivity$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 39;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnWarmupCompleted = CreditIntroActivity.onWarmupCompleted(this.f$0, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = onNavigationEvent + 113;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 12582912, 131067);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = access000 + 27;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CreditIntroActivity creditIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = access000 + 7;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(545355945, i, -1, "im.toss.feature.credit.ui.main.intro.CreditIntroActivity.onCreate.<anonymous> (CreditIntroActivity.kt:58)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1807206911, true, new CreditIntroActivity$.ExternalSyntheticLambda4(creditIntroActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = access000 + 119;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = access000 + 99;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CreditIntroActivity creditIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{957084421, -1768172647, -1647689098, -15359592, -428573055, -329053570}, 12 - KeyEvent.keyCodeFromString(""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditIntroActivity.getString(R.string.intro_cta));
        Object[] objArr2 = new Object[1];
        a(new int[]{-2114354602, 1397050432, 1644213244, 969531136}, (KeyEvent.getMaxKeyCode() >> 16) + 8, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditIntroActivity.IAuthTabCallbackDefault);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 77;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateVisuals() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1233793L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.intro.CreditIntroActivity$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 39;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    CreditIntroActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = CreditIntroActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
                int i4 = IAuthTabCallback + 87;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        }, 14, null);
        SessionTrackerb.IAuthTabCallback(onNavigationEvent(), this, h5ScreenShotObserverOnChangeOpt.onNavigationEvent.onWarmupCompleted(h5ScreenShotObserverOnChangeOpt.onNavigationEvent.onExtraCallbackWithResult, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.access100.onNavigationEvent, false, this.IAuthTabCallbackDefault, false, null, 13, null), this.IAuthTabCallbackDefault, false, 4, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = access000 + 31;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.base.BaseActivity
    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault iAuthTabCallbackDefault;
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        int i;
        int i2 = 2 % 2;
        int i3 = access000 + 35;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            onNavigationEvent();
            StringsKt.isBlank(this.asInterface);
            throw null;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        SessionTrackerb sessionTrackerbOnNavigationEvent = onNavigationEvent();
        String strOnExtraCallbackWithResult = this.asInterface;
        if (StringsKt.isBlank(strOnExtraCallbackWithResult)) {
            int i4 = onTransact + 73;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                iAuthTabCallbackDefault = h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback;
                str = this.IAuthTabCallbackDefault;
                z = false;
                z2 = true;
                str2 = null;
                z3 = true;
                i = 26;
            } else {
                iAuthTabCallbackDefault = h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback;
                str = this.IAuthTabCallbackDefault;
                z = false;
                z2 = false;
                str2 = null;
                z3 = true;
                i = 13;
            }
            strOnExtraCallbackWithResult = h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallbackWithResult(iAuthTabCallbackDefault, z, str, z2, str2, z3, i, null);
        }
        SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, this, strOnExtraCallbackWithResult, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
        int i5 = access000 + 77;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.base.BaseActivity
    public boolean bg_() {
        int i = 2 % 2;
        if (!setEngagementSignalsCallback()) {
            boolean zBg_ = super.bg_();
            int i2 = onTransact + 5;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return zBg_;
        }
        int i4 = access000 + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            IAuthTabCallback().onWarmupCompleted(this, "CREDIT");
            return false;
        }
        IAuthTabCallback().onWarmupCompleted(this, "CREDIT");
        return true;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = IAuthTabCallbackStub;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr4 != null) {
            int i6 = $11 + 125;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i2 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i2 = 0;
            }
            while (i2 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), TextUtils.getCapsMode("", 0, 0) + 72, 8848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i2++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallbackStub;
        if (iArr6 != null) {
            int i7 = $11 + 29;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 37;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr6[i8]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 72 - KeyEvent.normalizeMetaState(i5), 8849 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i8 %= 0;
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr6[i8])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 72 - (ViewConfiguration.getWindowTouchSlop() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i10 = i5;
        System.arraycopy(iArr6, i10, iArr5, i10, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i10] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 22252), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 38, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
                int i13 = $11 + 75;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (KeyEvent.getMaxKeyCode() >> 16)), 78 - TextUtils.getCapsMode("", 0, 0), 7398 - KeyEvent.normalizeMetaState(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i10 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditIntroActivity creditIntroActivity) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{creditIntroActivity}, -1512761175, 1512761175, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditIntroActivity creditIntroActivity) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{creditIntroActivity}, -1377691434, 1377691437, iIAuthTabCallback3);
    }

    public static /* synthetic */ boolean onExtraCallback(CreditIntroActivity creditIntroActivity) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{creditIntroActivity}, 1928810815, -1928810813, iIAuthTabCallback3)).booleanValue();
    }

    private static final Unit onNavigationEvent(CreditIntroActivity creditIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, 1353259293, -1353259292, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
    }

    @Override // im.toss.feature.credit.ui.main.intro.Hilt_CreditIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.main.intro.Hilt_CreditIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.main.intro.Hilt_CreditIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 111;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.main.intro.Hilt_CreditIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 19;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }
}
