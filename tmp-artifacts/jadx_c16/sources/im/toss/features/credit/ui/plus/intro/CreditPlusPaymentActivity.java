package im.toss.features.credit.ui.plus.intro;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.credit.data.response.membership.CreditPlusPaymentResponse;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.intro.CreditPlusPaymentActivity$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.OptionMenu;
import o.ParamUtils;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.getTempFileString;
import o.getUserData;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.matcher;
import o.onPageExit;
import o.readIntokhttp;
import o.setAdVideoPlaybackListener;
import o.setBaseDeeplink;
import o.setColor;
import o.setOverride;
import o.setRubIn;
import o.transparentBackground;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusPaymentActivity extends Hilt_CreditPlusPaymentActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static char IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 0;
    private static char access100 = 0;
    private static int extraCallback = 1;
    private static char getInterfaceDescriptor = 0;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;

    @Inject
    public OptionMenu tossPayAutoPaymentRegisterLauncher;

    @Inject
    public SessionTrackerb tossRouter;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new CreditPlusPaymentActivity$.ExternalSyntheticLambda3(this));
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));
    private final Lazy access000 = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditPlusIntroViewModel.class), new asInterface(this), new onExtraCallbackWithResult(this), new IAuthTabCallbackStub(null, this));
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new CreditPlusPaymentActivity$.ExternalSyntheticLambda4(this));
    private final Lazy onTransact = isStopUpload.onNavigationEvent(this, 1488267, (Function1) null, (Function1) null, 6, (Object) null);

    static {
        onSessionEnded();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackStub = 8;
        int i = ICustomTabsCallback + 75;
        writeTypedObject = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(view);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = readTypedObject + 113;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPlusPaymentActivity creditPlusPaymentActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditPlusPaymentActivity, iEngagementSignalsCallbackDefault);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        int i5 = readTypedObject + 125;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ String onExtraCallback(CreditPlusPaymentActivity creditPlusPaymentActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(creditPlusPaymentActivity);
        }
        onNavigationEvent(creditPlusPaymentActivity);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditPlusPaymentActivity creditPlusPaymentActivity, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditPlusPaymentActivity, view);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditPlusPaymentResponse creditPlusPaymentResponse = (CreditPlusPaymentResponse) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 41;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (i3 == 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(-1324149613, 1324149613, new Object[]{creditPlusPaymentResponse, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2);
        int i4 = readTypedObject + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~((~i6) | i8)) | i7;
        int i10 = i | i8;
        int i11 = (~(i6 | i7 | i8)) | (~(i2 | i));
        int i12 = i2 + i + i4 + (2049387148 * i5) + ((-609071723) * i3);
        int i13 = i12 * i12;
        int i14 = ((1483459036 * i2) - 1284505600) + (2005429323 * i) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i4) + ((-243269632) * i5) + ((-895483904) * i3) + ((-1334837248) * i13);
        int i15 = ((i2 * 335895516) - 1139737737) + (i * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (i4 * 335896449) + (i5 * (-616405876)) + (i3 * 126640917) + (i13 * 2020605952);
        int i16 = i14 + (i15 * i15 * (-544210944));
        boolean z = true;
        if (i16 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i16 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 3) {
            return onNavigationEvent(objArr);
        }
        CreditPlusPaymentResponse creditPlusPaymentResponse = (CreditPlusPaymentResponse) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i17 = 2 % 2;
        int i18 = extraCallback;
        int i19 = i18 + 13;
        readTypedObject = i19 % 128;
        int i20 = i19 % 2;
        if ((iIntValue & 3) != 2) {
            int i21 = i18 + 73;
            readTypedObject = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i18 + 33;
            readTypedObject = i23 % 128;
            int i24 = i23 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(295044086, iIntValue, -1, "im.toss.features.credit.ui.plus.intro.CreditPlusPaymentActivity.initView.<anonymous> (CreditPlusPaymentActivity.kt:125)");
            }
            getTempFileString.onNavigationEvent(creditPlusPaymentResponse.IAuthTabCallback(), creditPlusPaymentResponse.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i25 = readTypedObject + 35;
                extraCallback = i25 % 128;
                int i26 = i25 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements Function0<matcher> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Activity onExtraCallback;

        public onWarmupCompleted(Activity activity) {
            this.onExtraCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final matcher onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            matcher matcherVarIAuthTabCallback = matcher.IAuthTabCallback(layoutInflater);
            int i4 = onWarmupCompleted + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return matcherVarIAuthTabCallback;
        }
    }

    public static final /* synthetic */ CreditPlusIntroViewModel IAuthTabCallback(CreditPlusPaymentActivity creditPlusPaymentActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusIntroViewModel creditPlusIntroViewModelOnVerticalScrollEvent = creditPlusPaymentActivity.onVerticalScrollEvent();
        int i4 = extraCallback + 71;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return creditPlusIntroViewModelOnVerticalScrollEvent;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(CreditPlusPaymentActivity creditPlusPaymentActivity, RegisterAutoPaymentRequest registerAutoPaymentRequest) {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onWarmupCompleted(-1729660509, 1729660510, new Object[]{creditPlusPaymentActivity, registerAutoPaymentRequest}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted);
        int i4 = extraCallback + 105;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ matcher onExtraCallbackWithResult(CreditPlusPaymentActivity creditPlusPaymentActivity) {
        matcher matcherVar;
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditPlusPaymentActivity};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i3 != 0) {
            matcherVar = (matcher) onWarmupCompleted(-1064115183, 1064115185, objArr, iOnWarmupCompleted4, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted);
            int i4 = 77 / 0;
        } else {
            matcherVar = (matcher) onWarmupCompleted(-1064115183, 1064115185, objArr, iOnWarmupCompleted4, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted);
        }
        int i5 = extraCallback + 57;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return matcherVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditPlusPaymentActivity creditPlusPaymentActivity, CreditPlusPaymentResponse creditPlusPaymentResponse) {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        creditPlusPaymentActivity.onExtraCallback(creditPlusPaymentResponse);
        int i4 = readTypedObject + 73;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditPlusPaymentActivity creditPlusPaymentActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        creditPlusPaymentActivity.IPostMessageServiceStub();
        int i4 = extraCallback + 85;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i3 = extraCallback + 101;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = readTypedObject + 65;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = readTypedObject + 115;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = extraCallback + 71;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.access200();
        }
        int i3 = 18 / 0;
        return super/*o.openJavaCrashMonitor*/.access200();
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.removeAttachLongUserData*/.aq_();
        }
        super/*o.removeAttachLongUserData*/.aq_();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = extraCallback + 95;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = extraCallback + 69;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getScreenId();
        }
        super.getScreenId();
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        Map<String, Object> screenParams;
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            screenParams = super.getScreenParams();
            int i3 = 40 / 0;
        } else {
            screenParams = super.getScreenParams();
        }
        int i4 = readTypedObject + 39;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return screenParams;
        }
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = extraCallback + 45;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = extraCallback + 61;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = extraCallback + 85;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = extraCallback + 3;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return setrubinValidateRelationship;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OptionMenu ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        OptionMenu optionMenu = this.tossPayAutoPaymentRegisterLauncher;
        if (optionMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 109;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 99;
        extraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 32 / 0;
        }
        return optionMenu;
    }

    private static final Unit onExtraCallback(CreditPlusPaymentActivity creditPlusPaymentActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            creditPlusPaymentActivity.onVerticalScrollEvent().IAuthTabCallbackStub();
        } else {
            creditPlusPaymentActivity.onVerticalScrollEvent().asInterface();
            int i2 = extraCallback + 5;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 63;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditPlusPaymentActivity creditPlusPaymentActivity = (CreditPlusPaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        matcher matcherVar = (matcher) creditPlusPaymentActivity.asBinder.getValue();
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 39;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return matcherVar;
        }
        obj.hashCode();
        throw null;
    }

    private final CreditPlusIntroViewModel onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusIntroViewModel creditPlusIntroViewModel = (CreditPlusIntroViewModel) this.access000.getValue();
        int i4 = extraCallback + 27;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return creditPlusIntroViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asInterface.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String onNavigationEvent(CreditPlusPaymentActivity creditPlusPaymentActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String referrerParam = creditPlusPaymentActivity.getReferrerParam();
        if (i3 == 0) {
            int i4 = 83 / 0;
            if (referrerParam == null) {
                referrerParam = "";
            }
        } else if (referrerParam == null) {
        }
        int i5 = extraCallback + 103;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return referrerParam;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onTransact.getValue();
        if (i3 == 0) {
            return (hasCrashWhenJavaCrash) value;
        }
        int i4 = 61 / 0;
        return (hasCrashWhenJavaCrash) value;
    }

    public static final class onExtraCallbackWithResult implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity onExtraCallback;

        public onExtraCallbackWithResult(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallbackWithResult;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.getDefaultViewModelProviderFactory();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onExtraCallback.getDefaultViewModelProviderFactory();
            int i3 = IAuthTabCallback + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return defaultViewModelProviderFactory;
        }
    }

    public static final class asInterface implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public asInterface(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ComponentActivity componentActivity = this.onNavigationEvent;
            if (i3 == 0) {
                return componentActivity.getViewModelStore();
            }
            componentActivity.getViewModelStore();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 IAuthTabCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallbackStub(Function0 function0, ComponentActivity componentActivity) {
            this.IAuthTabCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            Function0 function0 = this.IAuthTabCallback;
            if (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) {
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.onWarmupCompleted.getDefaultViewModelCreationExtras();
                int i2 = onNavigationEvent + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return defaultViewModelCreationExtras;
            }
            int i4 = onExtraCallback + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 35;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 89;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback_Parcel);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
                        int edgeSlop = 12434 - (ViewConfiguration.getEdgeSlop() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, maxKeyCode, edgeSlop, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (access100 ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getInterfaceDescriptor)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 10 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 16014), 14 - TextUtils.indexOf("", "", 0), 19901 - KeyEvent.keyCodeFromString(""), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i13 = $11 + 125;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusPaymentActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        setContentView(((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted)).onExtraCallbackWithResult());
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = ((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2)).onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnExtraCallbackWithResult, "");
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutOnExtraCallbackWithResult, ((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3)).onNavigationEvent, (View) null, (View) null, false, 14, (Object) null);
        IPostMessageServiceDefault();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        transparentBackground.onExtraCallback(((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted4)).onWarmupCompleted.asInterface());
        setBaseDeeplink.onNavigationEvent(this, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, new onNavigationEvent(this, (access13800) null), 1, (Object) null);
        onVerticalScrollEvent().asBinder();
        int i2 = extraCallback + 35;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
    }

    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            setToolbar(((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted)).onTransact);
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.IAuthTabCallbackStub(false);
                int i3 = extraCallback + 77;
                readTypedObject = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        setToolbar(((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2)).onTransact);
        getSupportActionBar();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 69;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(CreditPlusPaymentActivity creditPlusPaymentActivity, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        CreditPlusIntroViewModel.onExtraCallback(new Object[]{creditPlusPaymentActivity.onVerticalScrollEvent()}, 1978099072, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1978099070, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 3;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(CreditPlusPaymentResponse creditPlusPaymentResponse) {
        int i = 2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        ((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted)).IAuthTabCallback.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(295044086, true, new CreditPlusPaymentActivity$.ExternalSyntheticLambda0(creditPlusPaymentResponse))));
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        TdsBottomCtaV1View tdsBottomCtaV1View = ((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2)).onWarmupCompleted;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, creditPlusPaymentResponse.onWarmupCompleted(), new CreditPlusPaymentActivity$.ExternalSyntheticLambda1(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
        transparentBackground.onWarmupCompleted(tdsButtonV1ViewAsInterface);
        Object[] objArr = {tdsButtonV1ViewAsInterface, ParamUtils.LONG, new CreditPlusPaymentActivity$.ExternalSyntheticLambda2(this)};
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        tdsBottomCtaV1View.setGradientVisibility(0);
        Context context = tdsBottomCtaV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsBottomCtaV1View.setBottomCtaBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration)).onWarmupCompleted());
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        ((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5)).onExtraCallback.setVisibility(8);
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        ((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted6)).IAuthTabCallbackStub.setVisibility(8);
        int i2 = extraCallback + 39;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, im.toss.features.credit.ui.plus.intro.CreditPlusPaymentActivity] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ?? r0 = (CreditPlusPaymentActivity) objArr[0];
        RegisterAutoPaymentRequest registerAutoPaymentRequest = (RegisterAutoPaymentRequest) objArr[1];
        int i = 2 % 2;
        ((CreditPlusPaymentActivity) r0).IAuthTabCallbackDefault.onNavigationEvent(r0.ICustomTabsService_Parcel().onNavigationEvent((Context) r0, new setOverride(registerAutoPaymentRequest.onExtraCallbackWithResult(), registerAutoPaymentRequest.onExtraCallback(), registerAutoPaymentRequest.onNavigationEvent(), registerAutoPaymentRequest.onWarmupCompleted(), new setOverride.onNavigationEvent(registerAutoPaymentRequest.IAuthTabCallback()), new setColor(r0.IEngagementSignalsCallbackStub(), "credit_plus"), (String) null, (String) null, 192, (DefaultConstructorMarker) null)));
        int i2 = readTypedObject + 95;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceStub() throws Throwable {
        int i = 2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = ((matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted)).onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnExtraCallbackWithResult, "");
        String string = getString(R.string.credit_ui_plus_payment_success);
        Intrinsics.checkNotNullExpressionValue(string, "");
        BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(constraintLayoutOnExtraCallbackWithResult, string), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (Object) null), 500, (Integer) null, 0, 6, (Object) null);
        Intent intent = new Intent((Context) this, (Class<?>) CreditPlusSuccessPayActivity.class);
        Object[] objArr = new Object[1];
        a(new char[]{51065, 35248, 38544, 58461, 9400, 28232, 64568, 37435}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 8, objArr);
        intent.putExtra(((String) objArr[0]).intern(), IEngagementSignalsCallbackStub());
        startActivity(intent);
        setResult(-1);
        finish();
        int i2 = extraCallback + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallback {
        private static short[] onWarmupCompleted;
        private static final byte[] $$a = {1, Byte.MIN_VALUE, 109, Byte.MIN_VALUE};
        private static final int $$b = 181;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        private static int IAuthTabCallback = 2140951756;
        private static int onNavigationEvent = -1538795406;
        private static int onExtraCallbackWithResult = -2002443357;
        private static byte[] onExtraCallback = {5, -5, 8, 5, -9, 9, -5, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, int i2, int i3) {
            int i4;
            int i5;
            int i6 = 115 - (i2 * 4);
            byte[] bArr = $$a;
            int i7 = 3 - (i3 * 2);
            int i8 = (i * 4) + 1;
            byte[] bArr2 = new byte[i8];
            if (bArr == null) {
                int i9 = i7;
                i5 = 0;
                i6 += i7;
                i7 = i9;
                i4 = i5;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i6;
                if (i5 == i8) {
                    return new String(bArr2, 0);
                }
                int i10 = i7 + 1;
                i9 = i10;
                i7 = bArr[i10];
                i6 += i7;
                i7 = i9;
                i4 = i5;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i6;
                if (i5 == i8) {
                }
            } else {
                i4 = 0;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i6;
                if (i5 == i8) {
                }
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) CreditPlusPaymentActivity.class);
            Object[] objArr = new Object[1];
            a((short) Color.blue(0), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), 606368572 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-753072954) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-113) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onTransact + 39;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[PHI: r4
          0x0087: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v27 byte[]) binds: [B:19:0x0085, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ff A[PHI: r4
          0x00ff: PHI (r4v26 byte[]) = (r4v9 byte[]), (r4v27 byte[]) binds: [B:19:0x0085, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02ed  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0311  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            byte[] bArr;
            int i4;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                long j2 = 0;
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 43424), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, 22440 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    int i7 = $10 + 3;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        bArr = onExtraCallback;
                        int i8 = 81 / 0;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i9 = 0;
                            while (i9 < length) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 12843);
                                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55;
                                    int packedPositionGroup = 2167 - ExpandableListView.getPackedPositionGroup(j2);
                                    byte b2 = (byte) ($$a[0] - 1);
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetAfter, doubleTapTimeout, packedPositionGroup, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i9++;
                                j2 = 0;
                            }
                            int i10 = $11 + 5;
                            $10 = i10 % 128;
                            i4 = 2;
                            int i11 = i10 % 2;
                            bArr = bArr2;
                        } else {
                            i4 = 2;
                        }
                    } else {
                        bArr = onExtraCallback;
                        if (bArr != null) {
                        }
                    }
                    if (bArr != null) {
                        int i12 = $10 + 83;
                        $11 = i12 % 128;
                        if (i12 % i4 == 0) {
                            byte[] bArr3 = onExtraCallback;
                            Object[] objArr4 = new Object[i4];
                            objArr4[1] = Integer.valueOf(IAuthTabCallback);
                            objArr4[0] = Integer.valueOf(i);
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43424), Color.blue(0) + 42, 22438 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] % (-4629411779493505016L))) >> ((int) (onNavigationEvent / (-4629411779493505016L)));
                        } else {
                            byte[] bArr4 = onExtraCallback;
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 43424), 42 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                        }
                        iIntValue = (byte) i5;
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i13 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                    if (z) {
                        int i14 = $10 + 65;
                        $11 = i14 % 128;
                        int i15 = i14 % 2 == 0 ? 0 : 1;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i15;
                        Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 85 - ExpandableListView.getPackedPositionChild(0L), 9567 - (ViewConfiguration.getTapTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        byte[] bArr5 = onExtraCallback;
                        if (bArr5 != null) {
                            int i16 = $11 + 29;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            int i18 = 0;
                            while (i18 < length2) {
                                bArr6[i18] = (byte) (bArr5[i18] ^ (-4629411779493505016L));
                                i18++;
                                int i19 = $10 + 59;
                                $11 = i19 % 128;
                                int i20 = i19 % 2;
                            }
                            bArr5 = bArr6;
                        }
                        boolean z2 = bArr5 != null;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            int i21 = $10 + 43;
                            $11 = i21 % 128;
                            if (i21 % 2 == 0) {
                                int i22 = 49 / 0;
                                if (z2) {
                                    byte[] bArr7 = onExtraCallback;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                                } else {
                                    short[] sArr = onWarmupCompleted;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                                }
                            } else if (!(!z2)) {
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
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
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = IAuthTabCallback + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditPlusPaymentResponse creditPlusPaymentResponse, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditPlusPaymentResponse, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onWarmupCompleted(1428617990, -1428617987, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private final matcher IEngagementSignalsCallbackDefault() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (matcher) onWarmupCompleted(-1064115183, 1064115185, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private static final Unit IAuthTabCallback(CreditPlusPaymentResponse creditPlusPaymentResponse, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditPlusPaymentResponse, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-1324149613, 1324149613, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private final void onExtraCallback(RegisterAutoPaymentRequest registerAutoPaymentRequest) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onWarmupCompleted(-1729660509, 1729660510, new Object[]{this, registerAutoPaymentRequest}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted);
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusPaymentActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusPaymentActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallback + 63;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusPaymentActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = extraCallback + 77;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusPaymentActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 25;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onSessionEnded() {
        access100 = (char) 9174;
        getInterfaceDescriptor = (char) 12760;
        IAuthTabCallbackStubProxy = (char) 38315;
        IAuthTabCallback_Parcel = (char) 23787;
    }
}
