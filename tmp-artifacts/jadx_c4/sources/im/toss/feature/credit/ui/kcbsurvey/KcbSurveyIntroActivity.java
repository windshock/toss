package im.toss.feature.credit.ui.kcbsurvey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.android.gms.internal.ads.zzaq;
import com.tmoney.LiveCheckConstants;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CameraProviderInitRetryPolicy1;
import o.ConvertByteArrayToFloatArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.IPostMessageServiceStubProxy;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionTrackera;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.ThreadOptimizeSwitch;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access15300;
import o.access8100;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getAwbState;
import o.getBacktraceNote;
import o.getDevicePerformance;
import o.getDispatcherokhttp;
import o.getDummyAd;
import o.getHostnameVerifierokhttp;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getOriginalFullResponse;
import o.getPrivacyDestinationUri;
import o.getSpecialFeatureOptInStatus;
import o.getSubtitle;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.getViewTypeCount;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasProvider;
import o.maybeUpdateAnimatable;
import o.onPageLoadError;
import o.preRenderInitDegradeOpt;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.readIntokhttp;
import o.resolveQuirkNames;
import o.reverseAnimationSpeed;
import o.rvInitOpt;
import o.setAdVideoPlaybackListener;
import o.setAnimation;
import o.setByteOrder;
import o.setHasShown;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setRandomHost;
import o.setTaggedAddrCtrl;
import o.toPreviewOnlyRange;
import o.varyMatches;
import o.w4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyIntroActivity extends Hilt_KcbSurveyIntroActivity {
    public static final onExtraCallback Companion;
    private static char[] IAuthTabCallbackStubProxy;
    private static long IAuthTabCallback_Parcel;
    public static final int asBinder;
    private static int extraCallbackWithResult;

    @Inject
    public getDevicePerformance kcbSurveyApi;

    @Inject
    public getDummyAd termsIntent;
    private static final byte[] $$a = {113, 46, 90, -12};
    private static final int $$b = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 1;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackStub(this));
    private onNavigationEvent access100 = onNavigationEvent.STEP_1;
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda3
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = KcbSurveyIntroActivity.onWarmupCompleted(this.f$0);
            int i4 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda4
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(KcbSurveyIntroActivity.IAuthTabCallback(this.f$0));
            int i4 = onNavigationEvent + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return numValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final SessionTrackera IAuthTabCallbackDefault = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda5
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = KcbSurveyIntroActivity.onNavigationEvent(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
            int i4 = onExtraCallback + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.STEP_1.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 115;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 4 % 5;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.STEP_2.ordinal()] = 2;
                int i4 = onExtraCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onNavigationEvent.STEP_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 4 - (b * 3);
        int i4 = 1 - (s * 4);
        int i5 = (b2 * 3) + 97;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            i2 = 0;
            int i8 = i3 + i6;
            int i9 = i7 + 1;
            i = i2;
            i5 = i8;
            i3 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i10 = i5;
            i7 = i3;
            i3 = bArr[i3];
            i6 = i10;
            int i82 = i3 + i6;
            int i92 = i7 + 1;
            i = i2;
            i5 = i82;
            i3 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    static {
        extraCallbackWithResult = 0;
        onNavigationEvent();
        Companion = new onExtraCallback(null);
        asBinder = 8;
        int i = writeTypedObject + 21;
        extraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ int IAuthTabCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity) {
        int i = 2 % 2;
        int i2 = access000 + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {kcbSurveyIntroActivity};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 == 0) {
            ((Integer) onWarmupCompleted(objArr, 549896189, iOnWarmupCompleted, iOnWarmupCompleted2, -549896188, iOnWarmupCompleted3, iOnWarmupCompleted4)).intValue();
            throw null;
        }
        int iIntValue = ((Integer) onWarmupCompleted(objArr, 549896189, iOnWarmupCompleted, iOnWarmupCompleted2, -549896188, iOnWarmupCompleted3, iOnWarmupCompleted4)).intValue();
        int i4 = getInterfaceDescriptor + 73;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        KcbSurveyIntroActivity kcbSurveyIntroActivity = (KcbSurveyIntroActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 21;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = access000 + 21;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 121;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        kcbSurveyIntroActivity.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = access000 + 31;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, KcbSurveyIntroActivity kcbSurveyIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, kcbSurveyIntroActivity, setDetectableSize);
        int i4 = getInterfaceDescriptor + 23;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Map map, KcbSurveyIntroActivity kcbSurveyIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(map, kcbSurveyIntroActivity, setDetectableSize);
        int i4 = access000 + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        Map map = (Map) objArr[0];
        KcbSurveyIntroActivity kcbSurveyIntroActivity = (KcbSurveyIntroActivity) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(map, kcbSurveyIntroActivity, setDetectableSize);
        int i4 = access000 + 81;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(KcbSurveyIntroActivity kcbSurveyIntroActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 57;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i))}, 1862792549, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1862792545, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        } else {
            onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, 1862792549, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1862792545, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
        Unit unit = Unit.INSTANCE;
        int i5 = access000 + 61;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 35;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return onWarmupCompleted(kcbSurveyIntroActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(kcbSurveyIntroActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(kcbSurveyIntroActivity, view);
            throw null;
        }
        Unit unitOnTransact = onTransact(kcbSurveyIntroActivity, view);
        int i3 = getInterfaceDescriptor + 17;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveyIntroActivity kcbSurveyIntroActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 117;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(kcbSurveyIntroActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 45;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveyIntroActivity kcbSurveyIntroActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(kcbSurveyIntroActivity, view);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyIntroActivity kcbSurveyIntroActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 37;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(kcbSurveyIntroActivity, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 71;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyIntroActivity kcbSurveyIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 9;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access000 + 105;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyIntroActivity kcbSurveyIntroActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(kcbSurveyIntroActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i4 = access000 + 113;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [android.content.Context, im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [android.content.Context, im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity, java.lang.Object] */
    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i | i4);
        int i11 = i9 | i10 | (~(i | i2));
        int i12 = i8 | i;
        int i13 = (~((~i2) | i)) | i10;
        int i14 = i + i4 + i3 + (111814883 * i5) + (1975835455 * i6);
        int i15 = i14 * i14;
        int i16 = ((i * 961080817) - 60187382) + (i4 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (961079685 * i3) + (1618335983 * i5) + (193609403 * i6) + (i15 * 1988296704);
        int i17 = (((-1960851331) * i) - 1583611904) + (47848387 * i4) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i3) + ((-648806400) * i5) + (1432616960 * i6) + (442957824 * i15) + (i16 * i16 * 176226304);
        int i18 = 8;
        switch (i17) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                KcbSurveyIntroActivity kcbSurveyIntroActivity = (KcbSurveyIntroActivity) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i19 = 2 % 2;
                int i20 = access000 + 85;
                getInterfaceDescriptor = i20 % 128;
                int i21 = i20 % 2;
                Unit unit = (Unit) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, -906607100, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 906607102, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                int i22 = access000 + 65;
                getInterfaceDescriptor = i22 % 128;
                int i23 = i22 % 2;
                break;
            case 8:
                break;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                final ?? r3 = (KcbSurveyIntroActivity) objArr[0];
                int i24 = 2 % 2;
                ((KcbSurveyIntroActivity) r3).access100 = onNavigationEvent.STEP_3;
                ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onWarmupCompleted.smoothScrollTo(0, 0);
                getDispatcherokhttp getdispatcherokhttpAccess100 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault.access100();
                if (getdispatcherokhttpAccess100 != null) {
                    int i25 = getInterfaceDescriptor + 3;
                    access000 = i25 % 128;
                    if (i25 % 2 != 0) {
                        Object[] objArr2 = new Object[1];
                        a(94 >> Color.argb(1, 1, 1, 1), (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)) * 94, (char) (37288 >> KeyEvent.keyCodeFromString("")), objArr2);
                        getdispatcherokhttpAccess100.onWarmupCompleted(((String) objArr2[0]).intern());
                    } else {
                        Object[] objArr3 = new Object[1];
                        a(99 - Color.argb(0, 0, 0, 0), 67 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (KeyEvent.keyCodeFromString("") + 37288), objArr3);
                        getdispatcherokhttpAccess100.onWarmupCompleted(((String) objArr3[0]).intern());
                    }
                }
                TdsTopV2View tdsTopV2View = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault;
                String string = r3.getString(R.string.credit_kcb_survey_intro3_title);
                Intrinsics.checkNotNullExpressionValue(string, "");
                tdsTopV2View.setTitleText(string);
                ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
                TdsTopV2View tdsTopV2View2 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault;
                String string2 = r3.getString(R.string.credit_kcb_survey_intro3_description);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                tdsTopV2View2.setSubtitle2Text(string2);
                ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallback.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(343388255, true, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda6
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i26 = 2 % 2;
                        int i27 = onNavigationEvent + 87;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unit2 = (Unit) KcbSurveyIntroActivity.onWarmupCompleted(new Object[]{this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, 941864751, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -941864744, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                        int i29 = onNavigationEvent + 39;
                        onWarmupCompleted = i29 % 128;
                        if (i29 % 2 == 0) {
                            return unit2;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                })));
                TdsBottomCtaV1View tdsBottomCtaV1View = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult;
                String string3 = r3.getString(R.string.credit_kcb_survey_intro3_cta_top_description);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                tdsBottomCtaV1View.setTopDescription(string3);
                BaseTextView baseTextViewExtraCallbackWithResult = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult.extraCallbackWithResult();
                if (baseTextViewExtraCallbackWithResult != null) {
                    Configuration configuration = r3.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    baseTextViewExtraCallbackWithResult.setTextColor(new getUrlokhttp(new asInterface(configuration)).ICustomTabsServiceStubProxy());
                    int i26 = getInterfaceDescriptor + 125;
                    access000 = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 3 / 2;
                    }
                }
                ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onNavigationEvent.setVisibility(8);
                TdsBottomCtaV1View tdsBottomCtaV1View2 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r3}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
                String string4 = r3.getString(viva.republica.toss.R.string.init_guide_start);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, string4, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) throws Throwable {
                        int i28 = 2 % 2;
                        int i29 = onWarmupCompleted + 53;
                        onExtraCallback = i29 % 128;
                        int i30 = i29 % 2;
                        Unit unitOnExtraCallback = KcbSurveyIntroActivity.onExtraCallback(this.f$0, (View) obj);
                        int i31 = onExtraCallback + 113;
                        onWarmupCompleted = i31 % 128;
                        int i32 = i31 % 2;
                        return unitOnExtraCallback;
                    }
                }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                r3.onWarmupCompleted("time_limit_notice");
                break;
            default:
                final ?? r32 = (KcbSurveyIntroActivity) objArr[0];
                int i28 = 2 % 2;
                int i29 = getInterfaceDescriptor + 1;
                access000 = i29 % 128;
                int i30 = i29 % 2;
                ((KcbSurveyIntroActivity) r32).access100 = onNavigationEvent.STEP_2;
                ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r32}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onWarmupCompleted.smoothScrollTo(0, 0);
                getDispatcherokhttp getdispatcherokhttpAccess1002 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r32}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault.access100();
                if (getdispatcherokhttpAccess1002 != null) {
                    Object[] objArr4 = new Object[1];
                    a(51 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 48, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37908), objArr4);
                    getdispatcherokhttpAccess1002.onWarmupCompleted(((String) objArr4[0]).intern());
                    int i31 = getInterfaceDescriptor + 115;
                    access000 = i31 % 128;
                    int i32 = i31 % 2;
                }
                TdsTopV2View tdsTopV2View3 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r32}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault;
                String string5 = r32.getString(R.string.credit_kcb_survey_intro2_title);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                tdsTopV2View3.setTitleText(string5);
                ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r32}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault.setSubtitle2Type((TdsTopV2View.onExtraCallbackWithResult) null);
                ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r32}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallback.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-733165154, true, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda8
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i33 = 2 % 2;
                        int i34 = onExtraCallbackWithResult + 67;
                        onWarmupCompleted = i34 % 128;
                        int i35 = i34 % 2;
                        Unit unitOnNavigationEvent = KcbSurveyIntroActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i36 = onExtraCallbackWithResult + 117;
                        onWarmupCompleted = i36 % 128;
                        if (i36 % 2 != 0) {
                            int i37 = 99 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                })));
                ComposeView composeView = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r32}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(composeView, "");
                if (r32.validateRelationship()) {
                    int i33 = access000 + 27;
                    int i34 = i33 % 128;
                    getInterfaceDescriptor = i34;
                    int i35 = i33 % 2;
                    int i36 = i34 + 77;
                    access000 = i36 % 128;
                    int i37 = i36 % 2;
                } else {
                    i18 = 0;
                }
                composeView.setVisibility(i18);
                ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r32}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult.setTopDescription("");
                TdsBottomCtaV1View tdsBottomCtaV1View3 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{r32}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View3, "");
                String string6 = r32.getString(R.string.credit_kcb_survey_confirm_checked);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View3, string6, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) throws Throwable {
                        int i38 = 2 % 2;
                        int i39 = onNavigationEvent + 3;
                        IAuthTabCallback = i39 % 128;
                        int i40 = i39 % 2;
                        Unit unitOnExtraCallbackWithResult = KcbSurveyIntroActivity.onExtraCallbackWithResult(this.f$0, (View) obj);
                        int i41 = IAuthTabCallback + 113;
                        onNavigationEvent = i41 % 128;
                        int i42 = i41 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                r32.onWarmupCompleted("truthful_answer_notice");
                break;
        }
        return null;
    }

    public static /* synthetic */ String onWarmupCompleted(KcbSurveyIntroActivity kcbSurveyIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = asBinder(kcbSurveyIntroActivity);
        int i4 = access000 + 39;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return strAsBinder;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(KcbSurveyIntroActivity kcbSurveyIntroActivity, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 117;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        kcbSurveyIntroActivity.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = getInterfaceDescriptor + 61;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(KcbSurveyIntroActivity kcbSurveyIntroActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, view}, 602851945, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -602851942, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = getInterfaceDescriptor + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Map map, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(map, setDetectableSize);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = getInterfaceDescriptor + 39;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 121;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final class IAuthTabCallbackStub implements Function0<ThreadOptimizeSwitch> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Activity onNavigationEvent;

        public IAuthTabCallbackStub(Activity activity) {
            this.onNavigationEvent = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ThreadOptimizeSwitch onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                ThreadOptimizeSwitch threadOptimizeSwitchOnWarmupCompleted = ThreadOptimizeSwitch.onWarmupCompleted(layoutInflater);
                int i3 = 42 / 0;
                return threadOptimizeSwitchOnWarmupCompleted;
            }
            LayoutInflater layoutInflater2 = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
            return ThreadOptimizeSwitch.onWarmupCompleted(layoutInflater2);
        }
    }

    public static final /* synthetic */ String onExtraCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceDefault = kcbSurveyIntroActivity.ICustomTabsServiceDefault();
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return strICustomTabsServiceDefault;
    }

    public static final /* synthetic */ ThreadOptimizeSwitch onExtraCallbackWithResult(KcbSurveyIntroActivity kcbSurveyIntroActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {kcbSurveyIntroActivity};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        ThreadOptimizeSwitch threadOptimizeSwitch = (ThreadOptimizeSwitch) onWarmupCompleted(objArr, -1393930300, iOnWarmupCompleted, iOnWarmupCompleted2, 1393930308, iOnWarmupCompleted3, iOnWarmupCompleted4);
        int i4 = access000 + 83;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return threadOptimizeSwitch;
        }
        throw null;
    }

    public static final /* synthetic */ SessionTrackera onNavigationEvent(KcbSurveyIntroActivity kcbSurveyIntroActivity) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 111;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackera sessionTrackera = kcbSurveyIntroActivity.IAuthTabCallbackDefault;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 43;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackera;
    }

    public final getDevicePerformance IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 119;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getDevicePerformance getdeviceperformance = this.kcbSurveyApi;
        if (getdeviceperformance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 27;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return getdeviceperformance;
        }
        obj.hashCode();
        throw null;
    }

    public final getDummyAd onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 25;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        getDummyAd getdummyad = this.termsIntent;
        if (getdummyad != null) {
            int i5 = i3 + 123;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = getInterfaceDescriptor + 43;
        access000 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        KcbSurveyIntroActivity kcbSurveyIntroActivity = (KcbSurveyIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = kcbSurveyIntroActivity.IAuthTabCallbackStub.getValue();
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (ThreadOptimizeSwitch) value;
        }
        Intrinsics.checkNotNullExpressionValue(value, "");
        int i4 = 80 / 0;
        return (ThreadOptimizeSwitch) value;
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access000 + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asBinder(KcbSurveyIntroActivity kcbSurveyIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyIntroActivity.getIntent());
        int i4 = getInterfaceDescriptor + 41;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    private final int ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access000 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.asInterface.getValue()).intValue();
        int i4 = access000 + 23;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getHostnameVerifierokhttp gethostnameverifierokhttp = (KcbSurveyIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int intExtra = gethostnameverifierokhttp.getIntent().getIntExtra("EXTRA_KCB_SURVEY_ROUND", 0);
        int i4 = access000 + 125;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(intExtra);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            int i3 = 72 / 0;
            if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
                onWarmupCompleted(new Object[]{kcbSurveyIntroActivity}, -119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                int i4 = getInterfaceDescriptor + 99;
                access000 = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i6 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i7 == 0) {
                int i8 = 44 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public asInterface(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView((View) ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onWarmupCompleted());
        ConstraintLayout constraintLayoutOnWarmupCompleted = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutOnWarmupCompleted, ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallback, (View) null, (View) null, false, 14, (Object) null);
        updateVisuals();
        IEngagementSignalsCallback();
        int i4 = access000 + 121;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onTransact(this, (access13800) null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 5;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // im.toss.base.BaseActivity
    public boolean bg_() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult.IAuthTabCallback[this.access100.ordinal()];
        if (i2 == 1) {
            return super.bg_();
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = access000 + 115;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted(new Object[]{this}, -119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                return true;
            }
            onWarmupCompleted(new Object[]{this}, -119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
            return true;
        }
        if (!(!validateRelationship())) {
            int i4 = access000 + 81;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                ICustomTabsServiceStubProxy();
                return false;
            }
            ICustomTabsServiceStubProxy();
            return true;
        }
        return super.bg_();
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 47;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackStubProxy[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 59697), View.MeasureSpec.makeMeasureSpec(0, 0) + 17, 10973 - (ViewConfiguration.getPressedStateDuration() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback_Parcel), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 46135), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 20268 - AndroidCharacter.getMirror('0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 49123), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 21;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getCapsMode("", 0, 0)), 44 - TextUtils.getOffsetAfter("", 0), View.getDefaultSize(0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 44 - View.getDefaultSize(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private final void updateVisuals() throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 63;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onNavigationEvent(true);
                supportActionBar.IAuthTabCallbackStub(false);
            }
            TdsTopV2View tdsTopV2View = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault;
            tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
            getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
            if (getdispatcherokhttpAccess100 != null) {
                getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback());
                int iOnNavigationEvent = zzaq.onNavigationEvent();
                ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent)).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            }
            tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
            Intrinsics.checkNotNull(tdsTopV2View);
            Context context = tdsTopV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsTopV2View.setTitleTextColor(new getUrlokhttp(new IAuthTabCallback(configuration)).onUnminimized());
            tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
            tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
            if (validateRelationship()) {
                int i3 = getInterfaceDescriptor + 29;
                access000 = i3 % 128;
                if (i3 % 2 != 0) {
                    ICustomTabsServiceStubProxy();
                    ComposeView composeView = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onNavigationEvent;
                    Intrinsics.checkNotNullExpressionValue(composeView, "");
                    int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                    setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(composeView, ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{this, 95}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).intValue());
                    return;
                }
                ICustomTabsServiceStubProxy();
                ComposeView composeView2 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(composeView2, "");
                int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(composeView2, ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{this, 100}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2)).intValue());
                return;
            }
            onWarmupCompleted(new Object[]{this}, -119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
            ComposeView composeView3 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(composeView3, "");
            int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
            setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(composeView3, ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{this, 180}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback3)).intValue());
            return;
        }
        getSupportActionBar();
        throw null;
    }

    private static final Unit onWarmupCompleted(KcbSurveyIntroActivity kcbSurveyIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 117;
        getInterfaceDescriptor = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 2) != 5, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = getInterfaceDescriptor + 105;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1809718563, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity.setStep1.<anonymous> (KcbSurveyIntroActivity.kt:146)");
                int i6 = access000 + 75;
                getInterfaceDescriptor = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 5;
                }
            }
            kcbSurveyIntroActivity.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access000 + 67;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i9 == 0) {
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = getInterfaceDescriptor + 77;
        access000 = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KcbSurveyIntroActivity kcbSurveyIntroActivity = (KcbSurveyIntroActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyIntroActivity.onExtraCallbackWithResult("intro");
        kcbSurveyIntroActivity.access200();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 71;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStubProxy() throws Throwable {
        int i = 2 % 2;
        this.access100 = onNavigationEvent.STEP_1;
        ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onWarmupCompleted.smoothScrollTo(0, 0);
        getDispatcherokhttp getdispatcherokhttpAccess100 = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault.access100();
        if (getdispatcherokhttpAccess100 != null) {
            int i2 = getInterfaceDescriptor + 109;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(View.combineMeasuredStates(0, 0), 51 - TextUtils.indexOf("", "", 0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 3679), objArr);
            getdispatcherokhttpAccess100.onWarmupCompleted(((String) objArr[0]).intern());
            int i4 = access000 + 61;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        TdsTopV2View tdsTopV2View = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault;
        String string = getString(R.string.credit_kcb_survey_intro1_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault.setSubtitle2Type((TdsTopV2View.onExtraCallbackWithResult) null);
        ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallback.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1809718563, true, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Unit unit = (Unit) KcbSurveyIntroActivity.onWarmupCompleted(new Object[]{this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, -293525860, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 293525865, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                int i8 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }
        })));
        ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onNavigationEvent.setVisibility(0);
        ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult.setTopDescription("");
        TdsBottomCtaV1View tdsBottomCtaV1View = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string2 = getString(viva.republica.toss.R.string.next);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnWarmupCompleted = KcbSurveyIntroActivity.onWarmupCompleted(this.f$0, (View) obj);
                int i9 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return unitOnWarmupCompleted;
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        onWarmupCompleted("intro");
    }

    private static final Unit onExtraCallbackWithResult(KcbSurveyIntroActivity kcbSurveyIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 91;
        getInterfaceDescriptor = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 2, i & 1)) {
            int i4 = getInterfaceDescriptor + 75;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = getInterfaceDescriptor + 87;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-733165154, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity.setStep2.<anonymous> (KcbSurveyIntroActivity.kt:162)");
                int i8 = getInterfaceDescriptor + 65;
                access000 = i8 % 128;
                int i9 = i8 % 2;
            }
            kcbSurveyIntroActivity.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = access000 + 37;
                getInterfaceDescriptor = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyIntroActivity.onExtraCallbackWithResult("truthful_answer_notice");
        onWarmupCompleted(new Object[]{kcbSurveyIntroActivity}, -2108781532, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 2108781541, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        boolean z;
        KcbSurveyIntroActivity kcbSurveyIntroActivity = (KcbSurveyIntroActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = getInterfaceDescriptor + 95;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = access000 + 95;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(343388255, iIntValue, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity.setStep3.<anonymous> (KcbSurveyIntroActivity.kt:179)");
                    int i5 = 11 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(343388255, iIntValue, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity.setStep3.<anonymous> (KcbSurveyIntroActivity.kt:179)");
                }
            }
            onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, 0}, 1862792549, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1862792545, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(KcbSurveyIntroActivity kcbSurveyIntroActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyIntroActivity.onExtraCallbackWithResult("time_limit_notice");
        kcbSurveyIntroActivity.onVerticalScrollEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 9;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Map map, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback().putAll(map);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().putAll(map);
        int i3 = 57 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Map map, KcbSurveyIntroActivity kcbSurveyIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = access000 + 75;
        getInterfaceDescriptor = i2 % 128;
        hasProvider hasprovider = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback().putAll(map);
            ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault.IAuthTabCallback_Parcel();
            hasprovider.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().putAll(map);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel = ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).IAuthTabCallbackDefault.IAuthTabCallback_Parcel();
        if (getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel != null && (cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub = getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.IAuthTabCallbackStub()) != null) {
            int i3 = access000 + 91;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            hasprovider = (hasProvider) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub.onExtraCallbackWithResult();
            int i5 = access000 + 25;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr = new Object[1];
        a(177 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, (char) (41672 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), hasprovider);
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(String str) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(165 - TextUtils.getOffsetBefore("", 0), KeyEvent.normalizeMetaState(0) + 4, (char) ((-16777216) - Color.rgb(0, 0, 0)), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 169, TextUtils.indexOf("", "", 0, 0) + 8, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        final Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), ICustomTabsServiceDefault()), getWrite.IAuthTabCallback("round", Integer.valueOf(rvInitOpt.onExtraCallbackWithResult.IAuthTabCallback()))});
        ConvertByteArrayToFloatArray.onExtraCallback(1471147L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 121;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = KcbSurveyIntroActivity.onWarmupCompleted(mapIAuthTabCallback, (SetDetectableSize) obj);
                int i5 = onNavigationEvent + 107;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 14, null);
        ConvertByteArrayToFloatArray.onExtraCallback(1471149L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda14
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) KcbSurveyIntroActivity.onWarmupCompleted(new Object[]{mapIAuthTabCallback, this, (SetDetectableSize) obj}, 311370850, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -311370844, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                int i5 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
        ConvertByteArrayToFloatArray.onExtraCallback(1471157L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 73;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = KcbSurveyIntroActivity.IAuthTabCallback(mapIAuthTabCallback, this, (SetDetectableSize) obj);
                int i5 = IAuthTabCallback + 17;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 54 / 0;
                }
                return unitIAuthTabCallback;
            }
        }, 14, null);
        int i2 = access000 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(Map map, KcbSurveyIntroActivity kcbSurveyIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().putAll(map);
        setDetectableSize.onExtraCallback("cta_yn", "Y");
        setDetectableSize.onExtraCallback("enable_yn", "Y");
        Object[] objArr = new Object[1];
        a(177 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4 - Gravity.getAbsoluteGravity(0, 0), (char) (41672 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult.asInterface().getText());
        setDetectableSize.onExtraCallback("theme", "primary");
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 35;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(final String str) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1471159L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda12
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 77;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                if (i4 == 0) {
                    return KcbSurveyIntroActivity.IAuthTabCallback(str2, this, (SetDetectableSize) obj);
                }
                KcbSurveyIntroActivity.IAuthTabCallback(str2, this, (SetDetectableSize) obj);
                throw null;
            }
        }, 14, null);
        int i2 = access000 + 63;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(String str, KcbSurveyIntroActivity kcbSurveyIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(165 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 4 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 169, Color.green(0) + 8, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), kcbSurveyIntroActivity.ICustomTabsServiceDefault());
        setDetectableSize.onExtraCallback("round", Integer.valueOf(rvInitOpt.onExtraCallbackWithResult.IAuthTabCallback()));
        setDetectableSize.onExtraCallback("cta_yn", "Y");
        setDetectableSize.onExtraCallback("enable_yn", "Y");
        Object[] objArr3 = new Object[1];
        a(177 - View.MeasureSpec.getSize(0), MotionEvent.axisFromString("") + 5, (char) (41671 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), ((ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).onExtraCallbackWithResult.asInterface().getText());
        setDetectableSize.onExtraCallback("theme", "primary");
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 117;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onVerticalScrollEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 99;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            rvInitOpt.onExtraCallbackWithResult.onWarmupCompleted(ICustomTabsServiceStub());
            startActivity(KcbSurveyLabActivity.Companion.onExtraCallbackWithResult(this, ICustomTabsServiceDefault(), ICustomTabsServiceStub()));
            setResult(-1);
            finish();
            return;
        }
        rvInitOpt.onExtraCallbackWithResult.onWarmupCompleted(ICustomTabsServiceStub());
        startActivity(KcbSurveyLabActivity.Companion.onExtraCallbackWithResult(this, ICustomTabsServiceDefault(), ICustomTabsServiceStub()));
        setResult(-1);
        finish();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void access200() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = access000 + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onExtraCallback {
        private static short[] onWarmupCompleted;
        private static final byte[] $$a = {11, -55, -20, -91};
        private static final int $$b = 198;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback = -1354759860;
        private static int onExtraCallbackWithResult = -1538795445;
        private static int IAuthTabCallback = -1979932793;
        private static byte[] onNavigationEvent = {5, -5, 8, 5, -9, 9, -5, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, short s, short s2) {
            int i;
            int i2;
            byte[] bArr = $$a;
            int i3 = 1 - (b * 2);
            int i4 = 3 - (s * 4);
            int i5 = 115 - (s2 * 2);
            byte[] bArr2 = new byte[i3];
            if (bArr == null) {
                int i6 = i3;
                int i7 = i4;
                int i8 = 0;
                int i9 = (-i4) + i6;
                i = i8;
                int i10 = i7;
                i5 = i9;
                i4 = i10;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                int i11 = i4 + 1;
                if (i2 == i3) {
                    return new String(bArr2, 0);
                }
                int i12 = i5;
                i7 = i11;
                i4 = bArr[i11];
                i8 = i2;
                i6 = i12;
                int i92 = (-i4) + i6;
                i = i8;
                int i102 = i7;
                i5 = i92;
                i4 = i102;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                int i112 = i4 + 1;
                if (i2 == i3) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                int i1122 = i4 + 1;
                if (i2 == i3) {
                }
            }
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0195 A[PHI: r0
          0x0195: PHI (r0v9 int) = (r0v8 int), (r0v46 int) binds: [B:40:0x0193, B:37:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0197 A[PHI: r0
          0x0197: PHI (r0v43 int) = (r0v8 int), (r0v46 int) binds: [B:40:0x0193, B:37:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            boolean z;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                char c = '0';
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 43425), TextUtils.lastIndexOf("", '0') + 43, View.MeasureSpec.makeMeasureSpec(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                float f = 0.0f;
                if (z2) {
                    byte[] bArr = onNavigationEvent;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i7 = 0;
                        while (i7 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cLastIndexOf = (char) (12842 - TextUtils.lastIndexOf("", c, 0));
                                int defaultSize = 55 - View.getDefaultSize(0, 0);
                                int i8 = 2167 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, defaultSize, i8, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i7++;
                            c = '0';
                            f = 0.0f;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i9 = $11 + 61;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        byte[] bArr3 = onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getEdgeSlop() >> 16)), Color.argb(0, 0, 0, 0) + 42, KeyEvent.normalizeMetaState(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i11 = $10 + 17;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        i4 = ((i % iIntValue) % 3) * ((int) (onExtraCallback % (-4629411779493505016L)));
                        i5 = z2 ? 1 : 0;
                    } else {
                        i4 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                        if (z2) {
                        }
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 86 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i12 = 0;
                        while (i12 < length2) {
                            int i13 = $11 + 33;
                            $10 = i13 % 128;
                            if (i13 % 2 != 0) {
                                bArr5[i12] = (byte) (bArr4[i12] * (-4629411779493505016L));
                                i12 %= 0;
                            } else {
                                bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                                i12++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        z = true;
                    } else {
                        int i14 = $11 + 63;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = 5 / 3;
                        }
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    int i16 = $10 + 105;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private onExtraCallback() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull String str, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyIntroActivity.class);
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (ViewConfiguration.getTouchSlop() >> 8), (-185063749) - Process.getGidForName(""), (-767248158) - MotionEvent.axisFromString(""), KeyEvent.getDeadChar(0, 0) - 59, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str).putExtra("EXTRA_KCB_SURVEY_ROUND", i);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i3 = IAuthTabCallbackStub + 101;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return intentPutExtra;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = KcbSurveyIntroActivity.this.new onWarmupCompleted(access13800Var);
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 73 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity] */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 97;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyadOnExtraCallback = KcbSurveyIntroActivity.this.onExtraCallback();
                ?? r3 = KcbSurveyIntroActivity.this;
                String strOnExtraCallback = KcbSurveyIntroActivity.onExtraCallback((KcbSurveyIntroActivity) r3);
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnExtraCallback, (Context) r3, "STD_9365_KCB_CREDIT_SURVEY_TERMS", strOnExtraCallback, (String) null, 0L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388600, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 29;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            KcbSurveyIntroActivity.onNavigationEvent(KcbSurveyIntroActivity.this).onNavigationEvent((Intent) objOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i6 = onWarmupCompleted + 107;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private final boolean validateRelationship() {
        int i = 2 % 2;
        if (ICustomTabsServiceStub() == 1) {
            int i2 = access000 + 1;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = access000 + 61;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2068303804);
        int i3 = i & 1;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i3 != 0, i3)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2068303804, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity.Step1Content (KcbSurveyIntroActivity.kt:245)");
                int i4 = getInterfaceDescriptor + 67;
                access000 = i4 % 128;
                int i5 = i4 % 2;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            Object obj = null;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i6 = getInterfaceDescriptor + 77;
                access000 = i6 % 128;
                if (i6 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                int i7 = access000 + 77;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            onPageLoadError.IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 11, (Object) null);
            setAnimation.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult2 = new setAnimation.IAuthTabCallback.onExtraCallbackWithResult(1, null, 2, null);
            preRenderInitDegradeOpt prerenderinitdegradeopt = preRenderInitDegradeOpt.onExtraCallbackWithResult;
            reverseAnimationSpeed.IAuthTabCallback(onextracallbackwithresult2, (setTaggedAddrCtrl) preRenderInitDegradeOpt.IAuthTabCallback(new Object[]{prerenderinitdegradeopt}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1148873756, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1148873748), quirksExternalSyntheticBackport0OnExtraCallback, null, null, null, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 504);
            reverseAnimationSpeed.IAuthTabCallback(new setAnimation.IAuthTabCallback.onExtraCallbackWithResult(2, null, 2, null), prerenderinitdegradeopt.asInterface(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 11, (Object) null), null, null, null, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 504);
            reverseAnimationSpeed.IAuthTabCallback(new setAnimation.IAuthTabCallback.onNavigationEvent((getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult) getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1911429714, new Object[]{getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1911429715), null, null, null, 0.0f, null, prerenderinitdegradeopt.onTransact(), 62, null), (setTaggedAddrCtrl) preRenderInitDegradeOpt.IAuthTabCallback(new Object[]{prerenderinitdegradeopt}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1044517691, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1044517696), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 11, (Object) null), null, null, null, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1573302, 440);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 101;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    KcbSurveyIntroActivity kcbSurveyIntroActivity = this.f$0;
                    if (i11 != 0) {
                        return KcbSurveyIntroActivity.onNavigationEvent(kcbSurveyIntroActivity, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    KcbSurveyIntroActivity.onNavigationEvent(kcbSurveyIntroActivity, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    private final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(921763291);
        int i3 = i & 1;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i3 != 0, i3)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = getInterfaceDescriptor + 95;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(921763291, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity.Step2Content (KcbSurveyIntroActivity.kt:289)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i6 = getInterfaceDescriptor + 81;
                access000 = i6 % 128;
                if (i6 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            onPageLoadError.IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            preRenderInitDegradeOpt prerenderinitdegradeopt = preRenderInitDegradeOpt.onExtraCallbackWithResult;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(prerenderinitdegradeopt.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, prerenderinitdegradeopt.onWarmupCompleted(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 390, 0, 131066);
            w4.onExtraCallbackWithResult((getBacktraceNote) preRenderInitDegradeOpt.IAuthTabCallback(new Object[]{prerenderinitdegradeopt}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -96679067, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 96679076), (QuirksExternalSyntheticBackport0) null, prerenderinitdegradeopt.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 390, 0, 131066);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getInterfaceDescriptor + 99;
                access000 = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i8 = access000 + 91;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 99;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        KcbSurveyIntroActivity.onExtraCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnExtraCallback = KcbSurveyIntroActivity.onExtraCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = onExtraCallbackWithResult + 67;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final KcbSurveyIntroActivity kcbSurveyIntroActivity = (KcbSurveyIntroActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-224777222);
        int i2 = iIntValue & 1;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i2 != 0, i2)) {
            int i3 = access000 + 87;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-224777222, iIntValue, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity.Step3Content (KcbSurveyIntroActivity.kt:335)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i5 = access000 + 123;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            onPageLoadError.IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            preRenderInitDegradeOpt prerenderinitdegradeopt = preRenderInitDegradeOpt.onExtraCallbackWithResult;
            w4.onExtraCallbackWithResult(prerenderinitdegradeopt.IAuthTabCallbackStub(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) preRenderInitDegradeOpt.IAuthTabCallback(new Object[]{prerenderinitdegradeopt}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -678167974, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 678167978), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 0, 131066);
            w4.onExtraCallbackWithResult(prerenderinitdegradeopt.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, prerenderinitdegradeopt.IAuthTabCallback_Parcel(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 0, 131066);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyIntroActivity$$ExternalSyntheticLambda11
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 77;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    KcbSurveyIntroActivity kcbSurveyIntroActivity2 = this.f$0;
                    if (i8 == 0) {
                        return KcbSurveyIntroActivity.onExtraCallbackWithResult(kcbSurveyIntroActivity2, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    KcbSurveyIntroActivity.onExtraCallbackWithResult(kcbSurveyIntroActivity2, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            });
        }
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent STEP_1 = new onNavigationEvent("STEP_1", 0);
        public static final onNavigationEvent STEP_2 = new onNavigationEvent("STEP_2", 1);
        public static final onNavigationEvent STEP_3 = new onNavigationEvent("STEP_3", 2);
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = STEP_1;
            if (i3 != 0) {
                return new onNavigationEvent[]{onnavigationevent, STEP_2, STEP_3};
            }
            onNavigationEvent onnavigationevent2 = STEP_2;
            onNavigationEvent onnavigationevent3 = STEP_3;
            onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[5];
            onnavigationeventArr[1] = onnavigationevent;
            onnavigationeventArr[0] = onnavigationevent2;
            onnavigationeventArr[4] = onnavigationevent3;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 37;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i2 + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 34 / 0;
            }
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 123;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -293525860, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 293525865, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(Map map, KcbSurveyIntroActivity kcbSurveyIntroActivity, SetDetectableSize setDetectableSize) {
        return (Unit) onWarmupCompleted(new Object[]{map, kcbSurveyIntroActivity, setDetectableSize}, 311370850, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -311370844, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyIntroActivity kcbSurveyIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 941864751, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -941864744, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        onWarmupCompleted(new Object[]{this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1862792549, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1862792545, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final ThreadOptimizeSwitch setEngagementSignalsCallback() {
        return (ThreadOptimizeSwitch) onWarmupCompleted(new Object[]{this}, -1393930300, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1393930308, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final int IAuthTabCallbackStub(KcbSurveyIntroActivity kcbSurveyIntroActivity) {
        return ((Integer) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity}, 549896189, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -549896188, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).intValue();
    }

    private static final Unit onNavigationEvent(KcbSurveyIntroActivity kcbSurveyIntroActivity, View view) {
        return (Unit) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, view}, 602851945, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -602851942, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void ICustomTabsService_Parcel() throws Throwable {
        onWarmupCompleted(new Object[]{this}, -119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 119741135, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void writeTypedList() throws Throwable {
        onWarmupCompleted(new Object[]{this}, -2108781532, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 2108781541, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit asInterface(KcbSurveyIntroActivity kcbSurveyIntroActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{kcbSurveyIntroActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -906607100, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 906607102, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access000 + 115;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = getInterfaceDescriptor + 119;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyIntroActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStubProxy = new char[]{58339, 42846, 27325, 11800, 61820, 46228, 30818, 963, 50928, 35414, 19872, 4372, 54382, 40901, 9067, 59024, 43508, 27977, 12458, 62550, 49014, 17107, 1650, 51663, 36087, 20511, 7092, 57117, 25208, 9692, 59708, 44167, 30596, 15167, 65240, 33230, 17691, 2189, 52268, 38689, 23233, 7726, 41364, 25829, 10250, 62387, 46869, 31274, 15819, 49460, 33950, 31144, 15637, 61686, 46163, 27447, 11999, 57897, 39304, 23739, 4125, 55275, 35679, 20005, 1422, 47392, 31963, 13247, 63234, 43745, 28189, 9533, 55448, 39993, 21380, 5820, 51796, 33279, 17750, 63539, 49047, 29559, 14028, 60879, 41332, 25747, 7045, 57168, 37569, 22114, 3434, 49285, 33894, 15300, 65188, 45634, 27133, 11584, 57384, 31764, 14505, 62794, 45551, 28299, 11107, 59285, 39988, 22791, 5537, 53847, 36579, 19353, '2', 48284, 31079, 13827, 62142, 44893, 27553, 8321, 56612, 39301, 22072, 4864, 53226, 33861, 16619, 64911, 47650, 30409, 13172, 59445, 42190, 24955, 7762, 55999, 38731, 21499, 2207, 50553, 33238, 15994, 64280, 47027, 27738, 10431, 58781, 41507, 24259, 6947, 53249, 36029, 18756, 1512, 49806, 32566, 15240, 61543, 44311, 27054, 9798, 58028, 40851, 21586, 4346, 60832, 43276, 25830, 8274, 60838, 43280, 25840, 8274, 65314, 47747, 30327, 3521, 20328, 3032, 50726, 33419};
        IAuthTabCallback_Parcel = 8043120197090716021L;
    }
}
