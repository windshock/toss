package im.toss.feature.credit.ui.kcbsurvey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyConfirmExitActivity$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.ThreadOptimizeSwitch;
import o.TombstoneProtosMemoryMappingBuilder;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.findResAndMsg;
import o.getAdService;
import o.getAwbState;
import o.getBacktraceNote;
import o.getDispatcherokhttp;
import o.getPrivacyDestinationUri;
import o.getSpecialFeatureOptInStatus;
import o.getSubtitle;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.getUserData;
import o.getViewTypeCount;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.onPageLoadError;
import o.printDebugLog;
import o.readIntokhttp;
import o.resolveQuirkNames;
import o.rvInitOpt;
import o.setAdVideoPlaybackListener;
import o.setByteOrder;
import o.setRubIn;
import o.toPreviewOnlyRange;
import o.w4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyConfirmExitActivity extends Hilt_KcbSurveyConfirmExitActivity implements SetDetectingInterval {
    public static final IAuthTabCallback Companion;
    private static int access000;
    public static final int asBinder;
    private static int asInterface;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private final Lazy IAuthTabCallbackDefault = isStopUpload.onNavigationEvent(this, 1489057, (Function1) null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyConfirmExitActivity$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = KcbSurveyConfirmExitActivity.onExtraCallback(this.f$0, (initMiniApp.onWarmupCompleted) obj);
            int i4 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    }, 2, (Object) null);
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyConfirmExitActivity$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity = this.f$0;
            if (i3 == 0) {
                return KcbSurveyConfirmExitActivity.onExtraCallbackWithResult(kcbSurveyConfirmExitActivity);
            }
            KcbSurveyConfirmExitActivity.onExtraCallbackWithResult(kcbSurveyConfirmExitActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = 105 - (s * 3);
        int i5 = b * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i3];
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    static {
        access000 = 0;
        IEngagementSignalsCallbackDefault();
        Companion = new IAuthTabCallback(null);
        asBinder = 8;
        int i = IAuthTabCallback_Parcel + 51;
        access000 = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(kcbSurveyConfirmExitActivity, view);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = access100 + 117;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(kcbSurveyConfirmExitActivity, onwarmupcompleted);
        int i4 = access100 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i2)) | i8 | (~(i6 | i2));
        int i10 = (~(i7 | (~i2))) | i8;
        int i11 = (~(i2 | i)) | (~((~i6) | i));
        int i12 = i + i6 + i3 + (929125522 * i4) + (1849324972 * i5);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i) + 1146290176 + ((-1462591364) * i6) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i3) + ((-291241984) * i4) + (1012400128 * i5) + ((-1810169856) * i13);
        int i15 = ((i * (-2058557531)) - 518432259) + (i6 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i3 * (-2058558961)) + (i4 * 548722830) + (i5 * 1549712660) + (i13 * (-2087387136));
        int i16 = i14 + (i15 * i15 * (-343605248));
        return i16 != 1 ? i16 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(kcbSurveyConfirmExitActivity);
        }
        onNavigationEvent(kcbSurveyConfirmExitActivity);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(kcbSurveyConfirmExitActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStubProxy + 85;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity = (KcbSurveyConfirmExitActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(kcbSurveyConfirmExitActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = access100 + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(kcbSurveyConfirmExitActivity, view);
        }
        onExtraCallbackWithResult(kcbSurveyConfirmExitActivity, view);
        throw null;
    }

    private static final Unit onWarmupCompleted(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 107;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(183330341, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{kcbSurveyConfirmExitActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, -183330339);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStubProxy + 95;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements Function0<ThreadOptimizeSwitch> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onExtraCallback(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return searchBarKtExternalSyntheticLambda5IAuthTabCallback;
            }
            throw null;
        }

        public final ThreadOptimizeSwitch IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            ThreadOptimizeSwitch threadOptimizeSwitchOnWarmupCompleted = ThreadOptimizeSwitch.onWarmupCompleted(layoutInflater);
            int i4 = onNavigationEvent + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
            return threadOptimizeSwitchOnWarmupCompleted;
        }
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i3 = access100 + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = access100 + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return strICustomTabsServiceStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = access100 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return jAccess200;
        }
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.removeAttachLongUserData*/.aq_();
        }
        super/*o.removeAttachLongUserData*/.aq_();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.ar_();
        }
        super/*o.openJavaCrashMonitor*/.ar_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = IAuthTabCallbackStubProxy + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgAs_;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = IAuthTabCallbackStubProxy + 83;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return screenId;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = access100 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = IAuthTabCallbackStubProxy + 83;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = IAuthTabCallbackStubProxy + 17;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = access100 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = access100 + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsServiceStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i3 = access100 + 73;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.validateRelationship();
        }
        super/*o.openJavaCrashMonitor*/.validateRelationship();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 41;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final SessionTrackerb ICustomTabsService_Parcel() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i2 = IAuthTabCallbackStubProxy + 103;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = IAuthTabCallbackStubProxy + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackDefault.getValue();
        int i4 = IAuthTabCallbackStubProxy + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    private static final Unit onWarmupCompleted(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a(8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{65530, 65531, 65530, 7, 7, 65530, 7, 7}, true, 265 - TextUtils.getCapsMode("", 0, 0), objArr);
        onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), (String) onExtraCallbackWithResult(2039022899, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{kcbSurveyConfirmExitActivity}, -2039022898));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 119;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final ThreadOptimizeSwitch onVerticalScrollEvent() {
        ThreadOptimizeSwitch threadOptimizeSwitch;
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.onTransact.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            threadOptimizeSwitch = (ThreadOptimizeSwitch) value;
            int i3 = 93 / 0;
        } else {
            Object value2 = this.onTransact.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            threadOptimizeSwitch = (ThreadOptimizeSwitch) value2;
        }
        int i4 = IAuthTabCallbackStubProxy + 25;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return threadOptimizeSwitch;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity = (KcbSurveyConfirmExitActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) kcbSurveyConfirmExitActivity.IAuthTabCallbackStub.getValue();
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onNavigationEvent(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity) throws Throwable {
        String strOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyConfirmExitActivity.getIntent());
            int i3 = 85 / 0;
        } else {
            strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyConfirmExitActivity.getIntent());
        }
        int i4 = IAuthTabCallbackStubProxy + 33;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyConfirmExitActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            setContentView((View) onVerticalScrollEvent().onWarmupCompleted());
            onSessionEnded();
            int i3 = 79 / 0;
        } else {
            super.onCreate(bundle);
            setContentView((View) onVerticalScrollEvent().onWarmupCompleted());
            onSessionEnded();
        }
        int i4 = access100 + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 111;
        int i4 = i3 % 128;
        access100 = i4;
        if (i3 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 3) {
            z = false;
        } else {
            int i5 = i4 + 97;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallbackStubProxy + 77;
            access100 = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1957516203, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyConfirmExitActivity.initView.<anonymous> (KcbSurveyConfirmExitActivity.kt:67)");
            }
            onExtraCallbackWithResult(183330341, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{kcbSurveyConfirmExitActivity, cameraCaptureResultEmptyCameraCaptureResult, 0}, -183330339);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access100 + 55;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            kcbSurveyConfirmExitActivity.IPostMessageService();
            kcbSurveyConfirmExitActivity.setResult(-1);
            kcbSurveyConfirmExitActivity.finish();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyConfirmExitActivity.IPostMessageService();
        kcbSurveyConfirmExitActivity.setResult(-1);
        kcbSurveyConfirmExitActivity.finish();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSessionEnded() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        TdsTopV2View tdsTopV2View = onVerticalScrollEvent().IAuthTabCallbackDefault;
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            int i4 = access100 + 37;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback());
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent)).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            Object[] objArr = new Object[1];
            a(42 - (ViewConfiguration.getEdgeSlop() >> 16), 24 - View.resolveSize(0, 0), new char[]{65498, 65494, 20, 16, 65493, 26, 26, 22, 27, 65493, '\n', 16, 27, '\b', 27, 26, 65494, 65494, 65505, 26, 23, 27, 27, 15, 14, 21, 23, 65493, 65495, 65512, 65501, 65497, 28, 65494, 26, 16, 17, 22, 20, '\f', 65492, 11}, true, 247 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
            getdispatcherokhttpAccess100.onWarmupCompleted(((String) objArr[0]).intern());
        }
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        Intrinsics.checkNotNull(tdsTopV2View);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setTitleTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onUnminimized());
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        String string = getString(R.string.credit_kcb_survey_exit_confirm_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        onVerticalScrollEvent().IAuthTabCallback.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1957516203, true, new KcbSurveyConfirmExitActivity$.ExternalSyntheticLambda2(this))));
        TdsBottomCtaV1View tdsBottomCtaV1View = onVerticalScrollEvent().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string2 = getString(R.string.credit_kcb_survey_exit_confirm_cta);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new KcbSurveyConfirmExitActivity$.ExternalSyntheticLambda3(this), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, 8, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = onVerticalScrollEvent().onExtraCallbackWithResult;
        String string3 = getString(R.string.credit_kcb_survey_exit_confirm_secondary_cta);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        tdsBottomCtaV1View2.setSecondary(string3, new KcbSurveyConfirmExitActivity$.ExternalSyntheticLambda4(this), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null));
    }

    private static final Unit onExtraCallbackWithResult(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            kcbSurveyConfirmExitActivity.finish();
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyConfirmExitActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 25;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IPostMessageService() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
            if (!rvInitOpt.onExtraCallbackWithResult.onExtraCallback((String) onExtraCallbackWithResult(2039022899, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, -2039022898))) {
                int i4 = access100 + 57;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                SessionTrackerb.IAuthTabCallback(ICustomTabsService_Parcel(), this, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback, false, (String) onExtraCallbackWithResult(2039022899, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, -2039022898), false, null, 13, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            }
        } else {
            if (!rvInitOpt.onExtraCallbackWithResult.onExtraCallback((String) onExtraCallbackWithResult(2039022899, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, -2039022898))) {
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 3;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static final byte[] $$a = {34, -56, 26, -92};
        private static final int $$b = 7;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static int onExtraCallback = 478309030;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, byte b3) {
            int i;
            int i2 = b3 + 4;
            int i3 = 105 - (b2 * 3);
            int i4 = b * 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                i3 = i5;
                i3 += i6;
                i = i7;
                bArr2[i] = (byte) i3;
                i7 = i + 1;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                i2++;
                i6 = bArr[i2];
                i3 += i6;
                i = i7;
                bArr2[i] = (byte) i3;
                i7 = i + 1;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i3;
                i7 = i + 1;
                if (i == i5) {
                }
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0180  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            char[] cArr2;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr3 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35125), TextUtils.lastIndexOf("", '0', 0) + 24, TextUtils.lastIndexOf("", '0', 0) + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (KeyEvent.getMaxKeyCode() >> 16)), 55 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                int i7 = $10 + 65;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i9 = $10 + 63;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr2 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
                } else {
                    cArr2 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                }
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 12843), (Process.myTid() >> 22) + 55, 2167 - TextUtils.getOffsetBefore("", 0), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i10 = $10 + 59;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 5 % 3;
                    }
                    i4 = 2083011369;
                }
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyConfirmExitActivity.class);
            Object[] objArr = new Object[1];
            a(View.combineMeasuredStates(0, 0) + 8, 5 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{7, 65530, 65531, 65530, 7, 7, 65530, 7}, true, 250 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(asInterface)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.red(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54, 2167 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i7 = $10 + 73;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $10 + 41;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback + i];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.red(0)), TextUtils.getOffsetBefore("", 0) + 55, 2167 - TextUtils.indexOf("", "", 0, 0), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54, 2167 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1298711993, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        final KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity = (KcbSurveyConfirmExitActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1293553953);
        int i2 = iIntValue & 1;
        if (i2 != 0) {
            int i3 = IAuthTabCallbackStubProxy + 121;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1293553953, iIntValue, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyConfirmExitActivity.Content (KcbSurveyConfirmExitActivity.kt:91)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i5 = access100 + 63;
                IAuthTabCallbackStubProxy = i5 % 128;
                if (i5 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    int i6 = 74 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                int i7 = access100 + 91;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                int i9 = IAuthTabCallbackStubProxy + 91;
                access100 = i9 % 128;
                int i10 = i9 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            onPageLoadError.IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            printDebugLog printdebuglog = printDebugLog.onExtraCallback;
            w4.onExtraCallbackWithResult(printdebuglog.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, printdebuglog.onExtraCallbackWithResult(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 0, 131066);
            w4.onExtraCallbackWithResult(printdebuglog.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, printdebuglog.IAuthTabCallback(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 0, 131066);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyConfirmExitActivity$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 27;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitOnExtraCallbackWithResult = KcbSurveyConfirmExitActivity.onExtraCallbackWithResult(this.f$0, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i14 = IAuthTabCallback + 51;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KcbSurveyConfirmExitActivity kcbSurveyConfirmExitActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(1149543433, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{kcbSurveyConfirmExitActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1149543433);
    }

    private final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onExtraCallbackWithResult(183330341, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -183330339);
    }

    private final String IEngagementSignalsCallbackStub() {
        return (String) onExtraCallbackWithResult(2039022899, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, -2039022898);
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyConfirmExitActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 35;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyConfirmExitActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 119;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyConfirmExitActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyConfirmExitActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void IEngagementSignalsCallbackDefault() {
        asInterface = 478309047;
    }
}
