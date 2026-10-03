package viva.republica.toss.guest;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.global.features.useronboarding.model.GlobalOnboardingEventId;
import im.toss.network.throwable.TossApiCallException;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.state.spec.SessionState;
import im.toss.uikit.R;
import im.toss.uikit.widget.AppBarLayout;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ACAuthRequest;
import o.ACHttpProxyRequestInfo;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_PKCS8Prikey;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.EncryptedContentInfoParser;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.GeckoHubImp;
import o.GraniteBrownfieldModule_closeView;
import o.IndicatorView;
import o.LifecyclesKtawaitStarted21;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UTF8Decoder;
import o._get_isNull_lambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access8100;
import o.addPolicy;
import o.asMaplambda6;
import o.createPaints;
import o.dangerouslyReset;
import o.deserializeIp;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getBillingPeriod;
import o.getDummyAd;
import o.getLogUploadURLMap;
import o.getNavigationBar;
import o.getNightColor;
import o.getPackageType;
import o.getSWidth;
import o.getSpecialFeatureOptInStatus;
import o.getWrite;
import o.isHttp;
import o.isJacksonCreator;
import o.isNumber;
import o.maybeUpdateAnimatable;
import o.notifyVerticalEdgeReached;
import o.readIntokhttp;
import o.setBitmapDecoderFactory;
import o.setCommonNetworkProxy;
import o.setFinalY;
import o.setInstallResult;
import o.setRandomHost;
import o.setTestMode;
import o.startRearDisplaySession;
import o.wasLastName;
import o.writeRaw;
import o.zzad;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.guest.ConfirmPasswordActivity$;
import viva.republica.toss.guest.GuestPasswordResetActivity;
import viva.republica.toss.password.PasswordFragment;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ConfirmPasswordActivity extends Hilt_ConfirmPasswordActivity implements PasswordFragment.onExtraCallback {
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallbackDefault;
    private static short[] ICustomTabsCallbackDefault;
    private static int ICustomTabsCallbackStub;
    private static int ICustomTabsCallback_Parcel;
    private static int onMinimized;
    private static long onPostMessage;
    private static int onRelationshipValidationResult;
    private static byte[] onUnminimized;
    private long IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean access000;
    private boolean access100;
    private Long asBinder;

    @Inject
    public zzad environments;

    @Inject
    public ACAuthRequest euOnboardingBiometricCheckDialog;
    private getLogUploadURLMap extraCallbackWithResult;
    private boolean getInterfaceDescriptor;

    @Inject
    public ACHttpProxyRequestInfo globalOnboardingIntentProvider;

    @Inject
    public notifyVerticalEdgeReached guestLoginManager;

    @Inject
    public setCommonNetworkProxy loginTokenStore;
    private Long onActivityLayout;
    private boolean onActivityResized;
    private getPackageType onTransact;

    @Inject
    public getNightColor profileRepository;
    private String readTypedObject;

    @Inject
    public getBillingPeriod regionManager;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public setFinalY tossploreManager;

    @Inject
    public isHttp visitorOnboardingIntentProvider;
    private PasswordFragment writeTypedObject;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 224;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int mayLaunchUrl = 0;
    private static int ICustomTabsCallbackStubProxy = 0;
    private static int extraCommand = 1;
    private final Lazy onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            return ConfirmPasswordActivity.onNavigationEvent();
        }
    });
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback_Parcel(this));
    private final Lazy ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda2
        public final Object invoke() {
            return ConfirmPasswordActivity.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda3
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return Boolean.valueOf(((Boolean) ConfirmPasswordActivity.onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr, 1144163636, -1144163635)).booleanValue());
        }
    });

    static final class access100 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmPasswordActivity.onNavigationEvent(ConfirmPasswordActivity.this, (access13800) this);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmPasswordActivity.onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{ConfirmPasswordActivity.this, null, false, null, null, this}, 977369653, -977369642);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, short r7) {
        /*
            byte[] r0 = viva.republica.toss.guest.ConfirmPasswordActivity.$$a
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 * 2
            int r6 = r6 + 115
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            r3 = r0[r5]
        L28:
            int r5 = r5 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.$$c(int, int, short):java.lang.String");
    }

    static {
        ICustomTabsCallback_Parcel = 1;
        IPostMessageServiceStub();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallbackDefault = 8;
        int i = mayLaunchUrl + 15;
        ICustomTabsCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(th, setDetectableSize);
        int i4 = extraCommand + 31;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ConfirmPasswordActivity confirmPasswordActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 105;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(confirmPasswordActivity, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        int i5 = extraCommand + 119;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ConfirmPasswordActivity confirmPasswordActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, String str, String str2, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 57;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(confirmPasswordActivity, graniteBrownfieldModule_closeView, str, str2, th);
        int i4 = extraCommand + 109;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 21;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        int i4 = ICustomTabsCallbackStubProxy + 9;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 83;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(confirmPasswordActivity, deserializeurinullablecollection);
        }
        onExtraCallbackWithResult(confirmPasswordActivity, deserializeurinullablecollection);
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 113;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipAccess000 = access000(function1, obj);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 9;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return deserializeipAccess000;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 89;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = ICustomTabsCallbackStubProxy + 99;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 125;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 71;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity}, -16717617, 16717625)).booleanValue();
        int i4 = extraCommand + 111;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i5 = 98 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th, ConfirmPasswordActivity confirmPasswordActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 19;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{th, confirmPasswordActivity, setDetectableSize}, -125954828, 125954838);
        int i4 = extraCommand + 45;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 7;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(ConfirmPasswordActivity confirmPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 77;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return access000(confirmPasswordActivity);
        }
        access000(confirmPasswordActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ConfirmPasswordActivity confirmPasswordActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(confirmPasswordActivity, graniteBrownfieldModule_closeView, z, bool);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, ConfirmPasswordActivity confirmPasswordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 89;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(z, confirmPasswordActivity);
        }
        onNavigationEvent(z, confirmPasswordActivity);
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(boolean z, ConfirmPasswordActivity confirmPasswordActivity, boolean z2, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, writeRaw writeraw, Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 63;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {Boolean.valueOf(z), confirmPasswordActivity, Boolean.valueOf(z2), graniteBrownfieldModule_closeView, writeraw, bool};
            throw null;
        }
        Object[] objArr2 = {Boolean.valueOf(z), confirmPasswordActivity, Boolean.valueOf(z2), graniteBrownfieldModule_closeView, writeraw, bool};
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr2, 413183710, -413183698);
        int i3 = ICustomTabsCallbackStubProxy + 55;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return deserializeip;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th, ConfirmPasswordActivity confirmPasswordActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 53;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(th, confirmPasswordActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallback(th, confirmPasswordActivity, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCommand + 93;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(setDetectableSize);
        }
        onWarmupCompleted(setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ConfirmPasswordActivity confirmPasswordActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCommand + 9;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(confirmPasswordActivity, bool);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ConfirmPasswordActivity confirmPasswordActivity, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 103;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(confirmPasswordActivity, z);
        int i4 = extraCommand + 9;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i5)) | (~(i7 | i2)) | (~(i5 | i2));
        int i9 = (~(i6 | i2)) | i5;
        int i10 = (~(i6 | i5 | i2)) | (~(i7 | (~i5) | (~i2)));
        int i11 = i6 + i5 + i + (862446602 * i3) + (395103901 * i4);
        int i12 = i11 * i11;
        int i13 = (i6 * 1384179468) + 550727958 + (i5 * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (1384179971 * i) + (1640285726 * i3) + (120803543 * i4) + (i12 * 2025127936);
        switch ((((-1892237052) * i6) - 438566912) + ((-683246085) * i5) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i) + ((-128450560) * i3) + ((-674496512) * i4) + ((-1108934656) * i12) + (i13 * i13 * (-275709952))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                BaseActivity baseActivity = (ConfirmPasswordActivity) objArr[0];
                int i14 = 2 % 2;
                int i15 = extraCommand + 83;
                ICustomTabsCallbackStubProxy = i15 % 128;
                int i16 = i15 % 2;
                boolean zIAuthTabCallback = isJacksonCreator.Companion.IAuthTabCallback(baseActivity);
                int i17 = ICustomTabsCallbackStubProxy + 99;
                extraCommand = i17 % 128;
                int i18 = i17 % 2;
                return Boolean.valueOf(zIAuthTabCallback);
            case 9:
                return asInterface(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
                GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                String str = (String) objArr[3];
                String str2 = (String) objArr[4];
                access13800 access13800Var = (access13800) objArr[5];
                int i19 = 2 % 2;
                int i20 = extraCommand + 19;
                ICustomTabsCallbackStubProxy = i20 % 128;
                int i21 = i20 % 2;
                Object objOnNavigationEvent = onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity, graniteBrownfieldModule_closeView, Boolean.valueOf(zBooleanValue), str, str2, access13800Var}, -1437536286, 1437536289);
                int i22 = extraCommand + 111;
                ICustomTabsCallbackStubProxy = i22 % 128;
                int i23 = i22 % 2;
                return objOnNavigationEvent;
            case 12:
                return access000(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 125;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        String smallIconId = getSmallIconId();
        int i4 = extraCommand + 59;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return smallIconId;
    }

    public static /* synthetic */ Unit onNavigationEvent(ConfirmPasswordActivity confirmPasswordActivity, Throwable th, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 69;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(confirmPasswordActivity, th, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(confirmPasswordActivity, th, dialogInterface);
        int i3 = ICustomTabsCallbackStubProxy + 31;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ UTF8Decoder onNavigationEvent(ConfirmPasswordActivity confirmPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 55;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        UTF8Decoder uTF8DecoderOnTransact = onTransact(confirmPasswordActivity);
        int i4 = ICustomTabsCallbackStubProxy + 7;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return uTF8DecoderOnTransact;
    }

    public static /* synthetic */ void onNavigationEvent(ConfirmPasswordActivity confirmPasswordActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCommand + 3;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(confirmPasswordActivity, dialogInterface);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCommand + 37;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        int i4 = extraCommand + 81;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 105;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(confirmPasswordActivity, function1);
        }
        onNavigationEvent(confirmPasswordActivity, function1);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ConfirmPasswordActivity confirmPasswordActivity, boolean z, String str, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 71;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(confirmPasswordActivity, z, str, bool);
        }
        IAuthTabCallback(confirmPasswordActivity, z, str, bool);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 45;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 87;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.guest.LoginBaseActivity
    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 121;
        int i3 = i2 % 128;
        extraCommand = i3;
        boolean z = i2 % 2 != 0;
        int i4 = i3 + 5;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback_Parcel implements Function0<CERT_PKCS8Prikey> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CERT_PKCS8Prikey invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_PKCS8Prikey.IAuthTabCallback(layoutInflater);
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public asInterface(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onTransact(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19627 - View.MeasureSpec.makeMeasureSpec(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onPostMessage ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 59 - Gravity.getAbsoluteGravity(0, 0), 6383 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i4 = $10 + 17;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 55;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 59, 6383 - View.MeasureSpec.getSize(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public static final /* synthetic */ void IAuthTabCallback(ConfirmPasswordActivity confirmPasswordActivity, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 45;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        confirmPasswordActivity.onActivityResized = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 115;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        confirmPasswordActivity.notifyNotificationWithChannel();
        int i4 = extraCommand + 115;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return null;
    }

    public static final /* synthetic */ PasswordFragment IAuthTabCallbackStub(ConfirmPasswordActivity confirmPasswordActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        PasswordFragment passwordFragment = confirmPasswordActivity.writeTypedObject;
        int i5 = i3 + 73;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return passwordFragment;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 67;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getPackageType getpackagetype = confirmPasswordActivity.onTransact;
        int i5 = i3 + 29;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return getpackagetype;
    }

    public static final /* synthetic */ long asInterface(ConfirmPasswordActivity confirmPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 23;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        long j = confirmPasswordActivity.IAuthTabCallbackStub;
        int i5 = i2 + 49;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        getPackageType getpackagetype = (getPackageType) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 57;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        confirmPasswordActivity.onTransact = getpackagetype;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 41;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ Object onNavigationEvent(ConfirmPasswordActivity confirmPasswordActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = extraCommand + 71;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            return onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity, access13800Var}, 424920161, -424920157);
        }
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity, access13800Var}, 424920161, -424920157);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Intent onWarmupCompleted(ConfirmPasswordActivity confirmPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 119;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intent intentIPostMessageService = confirmPasswordActivity.IPostMessageService();
        int i4 = extraCommand + 91;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return intentIPostMessageService;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ boolean IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean zIEngagementSignalsCallbackStub = super.IEngagementSignalsCallbackStub();
        int i4 = ICustomTabsCallbackStubProxy + 105;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return zIEngagementSignalsCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ boolean IEngagementSignalsCallbackStubProxy() {
        boolean zIEngagementSignalsCallbackStubProxy;
        int i = 2 % 2;
        int i2 = extraCommand + 109;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            zIEngagementSignalsCallbackStubProxy = super.IEngagementSignalsCallbackStubProxy();
            int i3 = 79 / 0;
        } else {
            zIEngagementSignalsCallbackStubProxy = super.IEngagementSignalsCallbackStubProxy();
        }
        int i4 = extraCommand + 63;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return zIEngagementSignalsCallbackStubProxy;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ String updateVisuals() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 51;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            super.updateVisuals();
            throw null;
        }
        String strUpdateVisuals = super.updateVisuals();
        int i3 = extraCommand + 93;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return strUpdateVisuals;
        }
        throw null;
    }

    private final String ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = extraCommand + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onMessageChannelReady.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        String str = (String) value;
        int i4 = extraCommand + 5;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String getSmallIconId() {
        int i = 2 % 2;
        int i2 = extraCommand + 57;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            UUID.randomUUID().toString();
            throw null;
        }
        String string = UUID.randomUUID().toString();
        int i3 = ICustomTabsCallbackStubProxy + 47;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static final class onWarmupCompleted {
        private static final byte[] $$a = {87, -2, 11, -41};
        private static final int $$b = 135;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onWarmupCompleted = -2614283941238487998L;
        private static int IAuthTabCallback = -1776194565;
        private static char onNavigationEvent = 27643;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Type inference failed for: r6v2, types: [int] */
        /* JADX WARN: Type inference failed for: r8v1, types: [int] */
        /* JADX WARN: Type inference failed for: r8v6, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, int r7, byte r8) {
            /*
                int r7 = r7 * 3
                int r0 = r7 + 1
                byte[] r1 = viva.republica.toss.guest.ConfirmPasswordActivity.onWarmupCompleted.$$a
                int r6 = r6 * 4
                int r6 = 4 - r6
                int r8 = r8 + 109
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2b
            L15:
                r3 = r2
            L16:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2b:
                int r6 = r6 + 1
                int r8 = r8 + r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.onWarmupCompleted.$$c(short, int, byte):java.lang.String");
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(onWarmupCompleted onwarmupcompleted, Context context, long j, Long l, String str, boolean z, boolean z2, boolean z3, getLogUploadURLMap getloguploadurlmap, boolean z4, Long l2, boolean z5, int i, Object obj) {
            boolean z6;
            getLogUploadURLMap getloguploadurlmap2;
            boolean z7;
            int i2 = 2 % 2;
            boolean z8 = (i & 16) != 0 ? false : z;
            if ((i & 32) != 0) {
                int i3 = onExtraCallback + 103;
                onExtraCallbackWithResult = i3 % 128;
                z6 = i3 % 2 == 0;
            } else {
                z6 = z2;
            }
            boolean z9 = (i & 64) != 0 ? false : z3;
            Object obj2 = null;
            if ((i & 128) != 0) {
                int i4 = onExtraCallbackWithResult + 39;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                getloguploadurlmap2 = null;
            } else {
                getloguploadurlmap2 = getloguploadurlmap;
            }
            boolean z10 = (i & 256) != 0 ? false : z4;
            Long l3 = (i & 512) != 0 ? null : l2;
            if ((i & 1024) != 0) {
                int i5 = onExtraCallbackWithResult + 119;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 % 3;
                }
                z7 = false;
            } else {
                z7 = z5;
            }
            return onwarmupcompleted.IAuthTabCallback(context, j, l, str, z8, z6, z9, getloguploadurlmap2, z10, l3, z7);
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $11 + 119;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 44 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1451 - TextUtils.indexOf("", "", 0, 0), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16826339), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.alpha(0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 23972), 49 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf("", "") + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45848), 28 - TextUtils.lastIndexOf("", '0', 0), 12577 - View.combineMeasuredStates(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i6 = $10 + 99;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        @JvmStatic
        public final Intent IAuthTabCallback(@NotNull Context context, long j, @Nullable Long l, @Nullable String str, boolean z, boolean z2, boolean z3, @Nullable getLogUploadURLMap getloguploadurlmap, boolean z4, @Nullable Long l2, boolean z5) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) ConfirmPasswordActivity.class).putExtra("EXTRA_IS_GLOBAL_CROSS_REGION_SIGN_UP", z5);
            long jLongValue = 0;
            Object[] objArr = new Object[1];
            a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Process.myTid() >> 22, new char[]{40940, 10200, 4731, 31136, 51811, 49342, 64422, 38646, 19614, 19535, 33513, 40346, 14340, 4810, 328, 6716, 11502, 10386, 39557, 21294, 33576, 17437}, new char[]{44985, 53849, 16045, 46978}, new char[]{34498, 17140, 31142, 62791}, objArr);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr[0]).intern(), j);
            Object[] objArr2 = new Object[1];
            a((char) (10946 - (KeyEvent.getMaxKeyCode() >> 16)), 1154624179 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{55512, 2768, 5206, 61620, 16410, 49480, 52856, 21691, 26389, 46050, 45635, 63267, 8320, 35878, 20335}, new char[]{44985, 53849, 16045, 46978}, new char[]{45707, 53802, 49732, 37162}, objArr2);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr2[0]).intern(), l).putExtra("EXTRA_REFERRER", str);
            Object[] objArr3 = new Object[1];
            a((char) (46721 - TextUtils.getOffsetAfter("", 0)), 1571648983 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{59136, 36843, 681, 38458, 41304, 3150, 52729, 11623, 55335, 15763, 15531, 9955, 16870, 37285, 26122, 61404, 39435, 51001, 5905, 23116, 63278, 62790, 8003, 40931, 24455, 44689, 52154, 29814, 64889}, new char[]{44985, 53849, 16045, 46978}, new char[]{55128, 44405, 33117, 21686}, objArr3);
            Intent intentPutExtra4 = intentPutExtra3.putExtra(((String) objArr3[0]).intern(), z);
            Object[] objArr4 = new Object[1];
            a((char) Color.blue(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1816903335, new char[]{10788, 52832, 32807, 60313, 42355, 43740, 23396, 8722, 45205, 5529, 8443, 19114, 5857, 51502, 11121, 21461, 48290, 38643, 57109, 10909, 23974, 40847, 57525}, new char[]{44985, 53849, 16045, 46978}, new char[]{42984, 19390, 51820, 3487}, objArr4);
            Intent intentPutExtra5 = intentPutExtra4.putExtra(((String) objArr4[0]).intern(), z2).putExtra("EXTRA_IS_SHOW_LOGIN_TOKEN_CONSENT_PAGE", z3).putExtra("EXTRA_LOGIN_TOKEN_CONSENT_TYPE", (Serializable) getloguploadurlmap);
            Object[] objArr5 = new Object[1];
            a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19644), Process.myTid() >> 22, new char[]{35076, 63410, 26287, 12893, 26091, 34540, 696, 32332, 61603, 19643, 9547, 50546, 56368, 29601, 31475, 19559}, new char[]{44985, 53849, 16045, 46978}, new char[]{50491, 19842, 48300, 43596}, objArr5);
            Intent intentPutExtra6 = intentPutExtra5.putExtra(((String) objArr5[0]).intern(), z4);
            if (l2 != null) {
                int i2 = onExtraCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    l2.longValue();
                    throw null;
                }
                jLongValue = l2.longValue();
            } else {
                int i3 = onExtraCallbackWithResult + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            Intent intentPutExtra7 = intentPutExtra6.putExtra("EXTRA_VISITOR_SELFIE_SESSION_ID", jLongValue);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra7, "");
            return intentPutExtra7;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 15;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object value = confirmPasswordActivity.asInterface.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CERT_PKCS8Prikey cERT_PKCS8Prikey = (CERT_PKCS8Prikey) value;
        int i4 = extraCommand + 101;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return cERT_PKCS8Prikey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand + 69;
        viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 15;
        viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.notifyVerticalEdgeReached IEngagementSignalsCallback() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand
            int r1 = r1 + 43
            int r2 = r1 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            o.notifyVerticalEdgeReached r1 = r4.guestLoginManager
            r3 = 37
            int r3 = r3 / 0
            if (r1 == 0) goto L23
            goto L1b
        L17:
            o.notifyVerticalEdgeReached r1 = r4.guestLoginManager
            if (r1 == 0) goto L23
        L1b:
            int r2 = r2 + 15
            int r3 = r2 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r3
            int r2 = r2 % r0
            return r1
        L23:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.IEngagementSignalsCallback():o.notifyVerticalEdgeReached");
    }

    public final setFinalY onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 27;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        setFinalY setfinaly = this.tossploreManager;
        if (setfinaly == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 31;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return setfinaly;
    }

    public final getBillingPeriod ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 115;
        ICustomTabsCallbackStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getBillingPeriod getbillingperiod = this.regionManager;
        if (getbillingperiod == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 97;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return getbillingperiod;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r4 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = r1 + 1;
        viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r4 = r1 + 67;
        viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SessionTrackerb onSessionEnded() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand
            int r2 = r1 + 51
            int r3 = r2 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L18
            o.SessionTrackerb r2 = r6.tossRouter
            r4 = 35
            int r4 = r4 / 0
            if (r2 == 0) goto L34
            goto L1c
        L18:
            o.SessionTrackerb r2 = r6.tossRouter
            if (r2 == 0) goto L34
        L1c:
            int r4 = r1 + 67
            int r5 = r4 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L30
            int r1 = r1 + 1
            int r4 = r1 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L2f
            return r2
        L2f:
            throw r3
        L30:
            r3.hashCode()
            throw r3
        L34:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.onSessionEnded():o.SessionTrackerb");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r0 = 12 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r3 = r1 + 43;
        viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r3 % 128;
        r3 = r3 % 2;
        r1 = r1 + 41;
        viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ACHttpProxyRequestInfo ICustomTabsService_Parcel() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand
            int r2 = r1 + 75
            int r3 = r2 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            o.ACHttpProxyRequestInfo r2 = r5.globalOnboardingIntentProvider
            r3 = 58
            int r3 = r3 / 0
            if (r2 == 0) goto L30
            goto L1b
        L17:
            o.ACHttpProxyRequestInfo r2 = r5.globalOnboardingIntentProvider
            if (r2 == 0) goto L30
        L1b:
            int r3 = r1 + 43
            int r4 = r3 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r4
            int r3 = r3 % r0
            int r1 = r1 + 41
            int r3 = r1 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L2f
            r0 = 12
            int r0 = r0 / 0
        L2f:
            return r2
        L30:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsService_Parcel():o.ACHttpProxyRequestInfo");
    }

    public final isHttp onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 113;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        isHttp ishttp = this.visitorOnboardingIntentProvider;
        if (ishttp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 93;
        int i6 = i5 % 128;
        ICustomTabsCallbackStubProxy = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 87;
        extraCommand = i8 % 128;
        int i9 = i8 % 2;
        return ishttp;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 59;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        getDummyAd getdummyad = confirmPasswordActivity.standardTermsV2Intent;
        if (getdummyad != null) {
            int i5 = i2 + 101;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = ICustomTabsCallbackStubProxy + 9;
        extraCommand = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 31 / 0;
        }
        return null;
    }

    public final getNightColor writeTypedList() {
        int i = 2 % 2;
        getNightColor getnightcolor = this.profileRepository;
        if (getnightcolor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 25;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return getnightcolor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 7;
        viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ACAuthRequest ICustomTabsServiceDefault() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy
            int r1 = r1 + 31
            int r2 = r1 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            o.ACAuthRequest r1 = r4.euOnboardingBiometricCheckDialog
            r3 = 13
            int r3 = r3 / 0
            if (r1 == 0) goto L23
            goto L1b
        L17:
            o.ACAuthRequest r1 = r4.euOnboardingBiometricCheckDialog
            if (r1 == 0) goto L23
        L1b:
            int r2 = r2 + 7
            int r3 = r2 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r3
            int r2 = r2 % r0
            return r1
        L23:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsServiceDefault():o.ACAuthRequest");
    }

    public final zzad validateRelationship() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 83;
        int i3 = i2 % 128;
        extraCommand = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 123;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 27;
        ICustomTabsCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return zzadVar;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 117;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        UTF8Decoder uTF8Decoder = (UTF8Decoder) confirmPasswordActivity.ICustomTabsCallback.getValue();
        int i4 = extraCommand + 59;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return uTF8Decoder;
        }
        throw null;
    }

    private static final UTF8Decoder onTransact(ConfirmPasswordActivity confirmPasswordActivity) {
        int i = 2 % 2;
        if (!confirmPasswordActivity.ICustomTabsServiceStubProxy().onExtraCallback()) {
            return UTF8Decoder.SIGN_IN;
        }
        int i2 = extraCommand + 89;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        UTF8Decoder uTF8Decoder = UTF8Decoder.SIGN_IN_GLOBAL;
        int i4 = ICustomTabsCallbackStubProxy + 61;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return uTF8Decoder;
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 107;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("act_type", "enrollment_funnel")});
        }
        Pair[] pairArr = new Pair[1];
        pairArr[1] = getWrite.IAuthTabCallback("act_type", "enrollment_funnel");
        return access8100.IAuthTabCallback(pairArr);
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 67;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return 1498525L;
        }
        Long.valueOf(1498525L);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public String IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCommand + 109;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strITrustedWebActivityService = ITrustedWebActivityService();
        int i4 = extraCommand + 121;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strITrustedWebActivityService;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ConfirmPasswordActivity confirmPasswordActivity = (ConfirmPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 29;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) confirmPasswordActivity.extraCallback.getValue()).booleanValue();
        int i4 = ICustomTabsCallbackStubProxy + 9;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public Map<String, Object> ICustomTabsServiceStub() throws Throwable {
        String loginYN;
        String logValue;
        int i = 2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("pin_uuid", ITrustedWebActivityService());
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("variant_type", _get_isNull_lambda0.onExtraCallbackWithResult.onWarmupCompleted());
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("6pin_yn", zzaz.onExtraCallbackWithResult(setTestMode.IAuthTabCallbackDefault()));
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        if (indicatorViewAccess100 != null) {
            loginYN = indicatorViewAccess100.getLoginYN();
        } else {
            int i2 = ICustomTabsCallbackStubProxy + 1;
            extraCommand = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 5;
            }
            loginYN = null;
        }
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("login_yn", loginYN);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("funnel_id", this.asBinder);
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        if (indicatorViewAccess1002 != null) {
            int i4 = ICustomTabsCallbackStubProxy + 61;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            logValue = indicatorViewAccess1002.getLogValue();
        } else {
            logValue = null;
        }
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("inflow_type", logValue);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 29 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 30 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getSize(0) + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback("attempt_cnt", Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue() + 1)), getWrite.IAuthTabCallback("is_showing_neo_pin", zzaz.onExtraCallbackWithResult(((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1571935772, -1571935767)).booleanValue()))});
            mapIAuthTabCallback.putAll(getScreenParams());
            return mapIAuthTabCallback;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void c(int i, byte b, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(ICustomTabsCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, 22439 - ExpandableListView.getPackedPositionType(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = onUnminimized;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $11 + 51;
                        $10 = i8 % 128;
                        int i9 = i8 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myTid() >> 22)), Color.red(0) + 55, 2167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i7++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onUnminimized;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onMinimized)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 43424), 43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (ICustomTabsCallbackStub ^ (-4629411779493505016L))));
                    int i10 = $10 + 117;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (ICustomTabsCallbackDefault[i + ((int) (onMinimized ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (ICustomTabsCallbackStub ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (onMinimized ^ j));
                if (!z) {
                    i4 = 0;
                } else {
                    int i13 = $11 + 99;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onRelationshipValidationResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 86 - ExpandableListView.getPackedPositionType(0L), 9567 - Color.green(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onUnminimized;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i15 = 0;
                    while (i15 < length2) {
                        int i16 = $11 + 81;
                        int i17 = i16 % 128;
                        $10 = i17;
                        if (i16 % 2 != 0) {
                            bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                            i15 /= 0;
                        } else {
                            bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                            i15++;
                        }
                        int i18 = i17 + 123;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onUnminimized;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = ICustomTabsCallbackDefault;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i20 = $11 + 13;
                        $10 = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = 5 / 5;
                        }
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

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public String setEngagementSignalsCallback() {
        int i = 2 % 2;
        if (!setTestMode.IAuthTabCallbackDefault()) {
            return getScreenName();
        }
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 29;
        extraCommand = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 89;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return ConfirmPasswordActivity.this.new IAuthTabCallback(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            ConfirmPasswordActivity confirmPasswordActivity;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ConfirmPasswordActivity confirmPasswordActivity2 = ConfirmPasswordActivity.this;
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                this.L$0 = confirmPasswordActivity2;
                this.label = 1;
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "certify.log.sms.equal.to.pin.enable", boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                confirmPasswordActivity = confirmPasswordActivity2;
                obj = objOnExtraCallback;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                confirmPasswordActivity = (ConfirmPasswordActivity) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            ConfirmPasswordActivity.IAuthTabCallback(confirmPasswordActivity, ((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.guest.Hilt_ConfirmPasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        getLogUploadURLMap getloguploadurlmap;
        getLogUploadURLMap getloguploadurlmap2;
        ConstraintLayout root;
        AppBarLayout appBarLayout;
        View view;
        View view2;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 65;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        if (((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1571935772, -1571935767)).booleanValue()) {
            overridePendingTransition(0, 0);
            getDelegate().onNavigationEvent(2);
        } else {
            setTheme(R.style.DarkTheme);
        }
        super.onCreate(bundle);
        setContentView(((CERT_PKCS8Prikey) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, -2124942030, 2124942030)).getRoot());
        if (!((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1571935772, -1571935767)).booleanValue()) {
            int i5 = ICustomTabsCallbackStubProxy + 93;
            extraCommand = i5 % 128;
            if (i5 % 2 == 0) {
                root = ((CERT_PKCS8Prikey) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, -2124942030, 2124942030)).getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                appBarLayout = ((CERT_PKCS8Prikey) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, -2124942030, 2124942030)).onNavigationEvent;
                view = null;
                view2 = null;
                z = false;
                i = 30;
            } else {
                root = ((CERT_PKCS8Prikey) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, -2124942030, 2124942030)).getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                appBarLayout = ((CERT_PKCS8Prikey) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, -2124942030, 2124942030)).onNavigationEvent;
                view = null;
                view2 = null;
                z = false;
                i = 14;
            }
            disableImageViewPreallocationAndroid.onNavigationEvent(root, appBarLayout, view, view2, z, i, (Object) null);
        }
        if (bundle != null) {
            int i6 = ICustomTabsCallbackStubProxy + 41;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 958476612, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 2121684157, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 12), 1 - Drawable.resolveOpacity(0, 0), objArr);
            this.IAuthTabCallbackStub = bundle.getLong(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 958476535, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132027970).substring(0, 4).codePointAt(0) - 37), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2121684071, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 72), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 121, objArr2);
            Long lValueOf = Long.valueOf(bundle.getLong(((String) objArr2[0]).intern(), 0L));
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            this.asBinder = lValueOf;
            this.readTypedObject = bundle.getString("EXTRA_REFERRER");
            Object[] objArr3 = new Object[1];
            a(new char[]{51536, 13050, 15919, 14946, 10120, 9177, 12054, 11079, 5362, 4140, 7286, 6554, 1480, 280, 3422, 30441, 29217, 32365, 31623, 26575, 25374, 28511, 26849, 21563, 20585, 23941, 22984, 17693, 16735}, TextUtils.indexOf("", "", 0, 0) + 64439, objArr3);
            this.getInterfaceDescriptor = bundle.getBoolean(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a(new char[]{51536, 18354, 54463, 26042, 62120, 945, 37030, 8639, 48818, 53175, 23725, 60836, 31396, 35764, 6328, 43426, 9898, 47023, 50345, 21932, 58044, 29627, 32945}, 36607 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
            this.access000 = bundle.getBoolean(((String) objArr4[0]).intern(), false);
            getLogUploadURLMap serializable = bundle.getSerializable("EXTRA_LOGIN_TOKEN_CONSENT_TYPE");
            if (serializable instanceof getLogUploadURLMap) {
                int i8 = extraCommand + 7;
                ICustomTabsCallbackStubProxy = i8 % 128;
                if (i8 % 2 != 0) {
                    getloguploadurlmap2 = serializable;
                    int i9 = 3 / 0;
                } else {
                    getloguploadurlmap2 = serializable;
                }
            } else {
                getloguploadurlmap2 = null;
            }
            this.extraCallbackWithResult = getloguploadurlmap2;
            Object[] objArr5 = new Object[1];
            a(new char[]{51536, 38076, 29347, 53396, 48784, 7423, 64250, 22737, 9922, 33850, 25142, 49181, 44560, 3196, 60020, 18520}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) + 23934, objArr5);
            this.IAuthTabCallbackStubProxy = bundle.getBoolean(((String) objArr5[0]).intern());
            Long lValueOf2 = Long.valueOf(bundle.getLong("EXTRA_VISITOR_SELFIE_SESSION_ID", 0L));
            if (lValueOf2.longValue() == 0) {
                int i10 = extraCommand + 87;
                ICustomTabsCallbackStubProxy = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                lValueOf2 = null;
            }
            this.onActivityLayout = lValueOf2;
            this.access100 = bundle.getBoolean("EXTRA_IS_GLOBAL_CROSS_REGION_SIGN_UP", false);
        } else {
            Intent intent = getIntent();
            Object[] objArr6 = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 958476585, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019722).substring(0, 6).codePointAt(3) - 114), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 2121684163, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132025562).substring(0, 2).length() + 29), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022859).substring(0, 10).codePointAt(5) - 120, objArr6);
            this.IAuthTabCallbackStub = intent.getLongExtra(((String) objArr6[0]).intern(), 0L);
            Intent intent2 = getIntent();
            Object[] objArr7 = new Object[1];
            c(Gravity.getAbsoluteGravity(0, 0) + 958476554, (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 2121684053, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 72), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 104, objArr7);
            Long lValueOf3 = Long.valueOf(intent2.getLongExtra(((String) objArr7[0]).intern(), 0L));
            if (lValueOf3.longValue() == 0) {
                lValueOf3 = null;
            }
            this.asBinder = lValueOf3;
            this.readTypedObject = getIntent().getStringExtra("EXTRA_REFERRER");
            Intent intent3 = getIntent();
            Object[] objArr8 = new Object[1];
            a(new char[]{51536, 13050, 15919, 14946, 10120, 9177, 12054, 11079, 5362, 4140, 7286, 6554, 1480, 280, 3422, 30441, 29217, 32365, 31623, 26575, 25374, 28511, 26849, 21563, 20585, 23941, 22984, 17693, 16735}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 64331, objArr8);
            this.getInterfaceDescriptor = intent3.getBooleanExtra(((String) objArr8[0]).intern(), false);
            Intent intent4 = getIntent();
            Object[] objArr9 = new Object[1];
            a(new char[]{51536, 18354, 54463, 26042, 62120, 945, 37030, 8639, 48818, 53175, 23725, 60836, 31396, 35764, 6328, 43426, 9898, 47023, 50345, 21932, 58044, 29627, 32945}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022973).substring(6, 7).length() + 36606, objArr9);
            this.access000 = intent4.getBooleanExtra(((String) objArr9[0]).intern(), false);
            getLogUploadURLMap serializableExtra = getIntent().getSerializableExtra("EXTRA_LOGIN_TOKEN_CONSENT_TYPE");
            if (serializableExtra instanceof getLogUploadURLMap) {
                int i11 = ICustomTabsCallbackStubProxy + 119;
                extraCommand = i11 % 128;
                if (i11 % 2 == 0) {
                    getloguploadurlmap = serializableExtra;
                    int i12 = 85 / 0;
                } else {
                    getloguploadurlmap = serializableExtra;
                }
            } else {
                getloguploadurlmap = null;
            }
            this.extraCallbackWithResult = getloguploadurlmap;
            Intent intent5 = getIntent();
            Object[] objArr10 = new Object[1];
            a(new char[]{51536, 38076, 29347, 53396, 48784, 7423, 64250, 22737, 9922, 33850, 25142, 49181, 44560, 3196, 60020, 18520}, 24049 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
            this.IAuthTabCallbackStubProxy = intent5.getBooleanExtra(((String) objArr10[0]).intern(), false);
            Long lValueOf4 = Long.valueOf(getIntent().getLongExtra("EXTRA_VISITOR_SELFIE_SESSION_ID", 0L));
            if (lValueOf4.longValue() == 0) {
                int i13 = extraCommand + 111;
                ICustomTabsCallbackStubProxy = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 4 / 5;
                }
                lValueOf4 = null;
            }
            this.onActivityLayout = lValueOf4;
            this.access100 = getIntent().getBooleanExtra("EXTRA_IS_GLOBAL_CROSS_REGION_SIGN_UP", false);
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
        LoginBaseActivity.onExtraCallback(this, null, false, 1, null);
        getSmallIconBitmap();
        if (((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1571935772, -1571935767)).booleanValue()) {
            ITrustedWebActivityServiceDefault();
        }
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        long jLongValue;
        long jLongValue2;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 35;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        Object obj = null;
        Object[] objArr = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 958476612, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19), (-2121684088) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022911).substring(0, 4).codePointAt(2), (short) (31 - View.resolveSizeAndState(0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 96, objArr);
        bundle.putLong(((String) objArr[0]).intern(), this.IAuthTabCallbackStub);
        Long l = this.asBinder;
        if (l != null) {
            int i4 = extraCommand + 95;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                l.longValue();
                obj.hashCode();
                throw null;
            }
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Object[] objArr2 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 958476449, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021835).substring(0, 4).codePointAt(1) - 49), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031488).substring(0, 1).length() - 2121684053, (short) ((-53) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 123, objArr2);
        bundle.putLong(((String) objArr2[0]).intern(), jLongValue);
        bundle.putString("EXTRA_REFERRER", this.readTypedObject);
        Object[] objArr3 = new Object[1];
        a(new char[]{51536, 13050, 15919, 14946, 10120, 9177, 12054, 11079, 5362, 4140, 7286, 6554, 1480, 280, 3422, 30441, 29217, 32365, 31623, 26575, 25374, 28511, 26849, 21563, 20585, 23941, 22984, 17693, 16735}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022900).substring(0, 23).length() + 64416, objArr3);
        bundle.putBoolean(((String) objArr3[0]).intern(), this.getInterfaceDescriptor);
        Object[] objArr4 = new Object[1];
        a(new char[]{51536, 18354, 54463, 26042, 62120, 945, 37030, 8639, 48818, 53175, 23725, 60836, 31396, 35764, 6328, 43426, 9898, 47023, 50345, 21932, 58044, 29627, 32945}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 36493, objArr4);
        bundle.putBoolean(((String) objArr4[0]).intern(), this.access000);
        bundle.putSerializable("EXTRA_LOGIN_TOKEN_CONSENT_TYPE", this.extraCallbackWithResult);
        Object[] objArr5 = new Object[1];
        a(new char[]{51536, 38076, 29347, 53396, 48784, 7423, 64250, 22737, 9922, 33850, 25142, 49181, 44560, 3196, 60020, 18520}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132032306).substring(0, 26).codePointAt(7) + 24017, objArr5);
        bundle.putBoolean(((String) objArr5[0]).intern(), this.IAuthTabCallbackStubProxy);
        Long l2 = this.onActivityLayout;
        if (l2 != null) {
            int i5 = ICustomTabsCallbackStubProxy + 25;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
            jLongValue2 = l2.longValue();
            if (i6 == 0) {
                int i7 = 82 / 0;
            }
        } else {
            jLongValue2 = 0;
        }
        bundle.putLong("EXTRA_VISITOR_SELFIE_SESSION_ID", jLongValue2);
    }

    @Override // viva.republica.toss.guest.Hilt_ConfirmPasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (validateRelationship().AudioAttributesImplApi21Parcelizer()) {
            onExtraCallback("impression__enrollment_password_input_type_check", (Function1<? super SetDetectableSize, Unit>) new ConfirmPasswordActivity$.ExternalSyntheticLambda23());
        }
        int i4 = extraCommand + 91;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        String logValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        IndicatorView indicatorViewAccess100 = createPaints.IAuthTabCallback.access100();
        if (indicatorViewAccess100 != null) {
            logValue = indicatorViewAccess100.getLogValue();
            int i2 = ICustomTabsCallbackStubProxy + 125;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = extraCommand + 77;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            logValue = null;
        }
        setDetectableSize.onExtraCallback("input_type", logValue);
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent implements PasswordFragment.IAuthTabCallback {
        onNavigationEvent() {
        }

        @Override // viva.republica.toss.password.PasswordFragment.IAuthTabCallback
        public void IAuthTabCallback() {
            getSWidth.onExtraCallback.onNavigationEvent(ConfirmPasswordActivity.asInterface(ConfirmPasswordActivity.this));
            LoginBaseActivity.onWarmupCompleted(ConfirmPasswordActivity.this, "click__enrollment_reset_password", null, 2, null);
            LoginBaseActivity.onExtraCallbackWithResult(ConfirmPasswordActivity.this, ConfirmPasswordActivity.onWarmupCompleted(ConfirmPasswordActivity.this), null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ITrustedWebActivityServiceDefault() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy
            int r1 = r1 + 99
            int r2 = r1 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L21
            r4.setRequestedOrientation(r2)
            android.view.Window r1 = r4.getWindow()
            r1.setNavigationBarColor(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 < r2) goto L41
            goto L31
        L21:
            r4.setRequestedOrientation(r2)
            android.view.Window r1 = r4.getWindow()
            r1.setNavigationBarColor(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L41
        L31:
            int r1 = viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy
            int r1 = r1 + 67
            int r2 = r1 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r2
            int r1 = r1 % r0
            android.view.Window r1 = r4.getWindow()
            r1.setNavigationBarContrastEnforced(r3)
        L41:
            android.view.Window r1 = r4.getWindow()
            r1.setStatusBarColor(r3)
            android.view.Window r1 = r4.getWindow()
            o.RepeatableSpec.onExtraCallbackWithResult(r1, r3)
            int r1 = viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy
            int r1 = r1 + 81
            int r2 = r1 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.ITrustedWebActivityServiceDefault():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Intent IPostMessageService() {
        String str;
        int i = 2 % 2;
        if (this.IAuthTabCallbackStubProxy) {
            return onVerticalScrollEvent().onExtraCallbackWithResult(this, this.IAuthTabCallbackStub);
        }
        str = "";
        if (this.access100) {
            ACHttpProxyRequestInfo aCHttpProxyRequestInfoICustomTabsService_Parcel = ICustomTabsService_Parcel();
            long jOnExtraCallbackWithResult = GlobalOnboardingEventId.onExtraCallbackWithResult(this.IAuthTabCallbackStub);
            String str2 = this.readTypedObject;
            return aCHttpProxyRequestInfoICustomTabsService_Parcel.onExtraCallbackWithResult(this, jOnExtraCallbackWithResult, str2 != null ? str2 : "");
        }
        if (!ICustomTabsServiceStubProxy().onExtraCallback()) {
            Intent intentOnExtraCallback = GuestPasswordResetActivity.onExtraCallbackWithResult.onExtraCallback(GuestPasswordResetActivity.Companion, this, false, this.IAuthTabCallbackStub, this.asBinder, this.readTypedObject, this.getInterfaceDescriptor, this.access000, false, this.extraCallbackWithResult, false, 640, null);
            int i2 = ICustomTabsCallbackStubProxy + 67;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            return intentOnExtraCallback;
        }
        ACHttpProxyRequestInfo aCHttpProxyRequestInfoICustomTabsService_Parcel2 = ICustomTabsService_Parcel();
        long jOnExtraCallbackWithResult2 = GlobalOnboardingEventId.onExtraCallbackWithResult(this.IAuthTabCallbackStub);
        String str3 = this.readTypedObject;
        if (str3 != null) {
            int i4 = extraCommand + 107;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = str3;
        }
        return aCHttpProxyRequestInfoICustomTabsService_Parcel2.onWarmupCompleted(this, jOnExtraCallbackWithResult2, str);
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return ConfirmPasswordActivity.this.new IAuthTabCallbackStub(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            ConfirmPasswordActivity.this.bo_();
            ACAuthRequest aCAuthRequestICustomTabsServiceDefault = ConfirmPasswordActivity.this.ICustomTabsServiceDefault();
            BaseActivity baseActivity = ConfirmPasswordActivity.this;
            this.label = 1;
            Object objOnNavigationEvent = aCAuthRequestICustomTabsServiceDefault.onNavigationEvent(baseActivity, this);
            return objOnNavigationEvent == objOnWarmupCompleted ? objOnWarmupCompleted : objOnNavigationEvent;
        }
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 37;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = extraCommand + 15;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(ConfirmPasswordActivity confirmPasswordActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCommand + 89;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            BaseActivity.IAuthTabCallback(confirmPasswordActivity, (String) null, true, 2, (Object) null);
        } else {
            BaseActivity.IAuthTabCallback(confirmPasswordActivity, (String) null, false, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final deserializeIp access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 27;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = ICustomTabsCallbackStubProxy + 97;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return deserializeip;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context, viva.republica.toss.guest.ConfirmPasswordActivity] */
    private static /* synthetic */ Object access000(Object[] objArr) {
        String str;
        Boolean bool;
        wasLastName waslastnameOnWarmupCompleted;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        ?? r4 = (ConfirmPasswordActivity) objArr[1];
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[3];
        writeRaw writeraw = (writeRaw) objArr[4];
        Boolean bool2 = (Boolean) objArr[5];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bool2, "");
        if (zBooleanValue || ((ConfirmPasswordActivity) r4).IAuthTabCallbackStubProxy || zBooleanValue2) {
            notifyVerticalEdgeReached notifyverticaledgereachedIEngagementSignalsCallback = r4.IEngagementSignalsCallback();
            if (((ConfirmPasswordActivity) r4).access100) {
                int i2 = ICustomTabsCallbackStubProxy + 51;
                extraCommand = i2 % 128;
                int i3 = i2 % 2;
                str = "CROSS_REGION_SIGN_UP";
            } else {
                str = "SIGN_IN";
            }
            String str2 = str;
            long j = ((ConfirmPasswordActivity) r4).IAuthTabCallbackStub;
            boolean zBooleanValue3 = bool2.booleanValue();
            Long l = ((ConfirmPasswordActivity) r4).asBinder;
            String str3 = ((ConfirmPasswordActivity) r4).readTypedObject;
            boolean z = ((ConfirmPasswordActivity) r4).getInterfaceDescriptor;
            getLogUploadURLMap getloguploadurlmap = ((ConfirmPasswordActivity) r4).extraCallbackWithResult;
            if (getloguploadurlmap == null) {
                int i4 = extraCommand + 87;
                ICustomTabsCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    getloguploadurlmap = getLogUploadURLMap.None;
                    int i5 = 57 / 0;
                } else {
                    getloguploadurlmap = getLogUploadURLMap.None;
                }
            }
            bool = bool2;
            waslastnameOnWarmupCompleted = notifyVerticalEdgeReached.onWarmupCompleted(notifyverticaledgereachedIEngagementSignalsCallback, (Context) r4, str2, j, graniteBrownfieldModule_closeView, zBooleanValue3, l, str3, z, false, getloguploadurlmap, ((ConfirmPasswordActivity) r4).IAuthTabCallbackStubProxy, ((ConfirmPasswordActivity) r4).onActivityLayout, false, writeraw, 4352, (Object) null);
        } else {
            int i6 = extraCommand + 125;
            ICustomTabsCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.checkNotNull(wasLastName.IAuthTabCallback());
                throw null;
            }
            waslastnameOnWarmupCompleted = wasLastName.IAuthTabCallback();
            Intrinsics.checkNotNull(waslastnameOnWarmupCompleted);
            bool = bool2;
        }
        return waslastnameOnWarmupCompleted.IAuthTabCallback(bool);
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 39;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(ConfirmPasswordActivity confirmPasswordActivity, boolean z, String str, Boolean bool) throws Throwable {
        String loginYN;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 15;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        if (!confirmPasswordActivity.IAuthTabCallbackStubProxy && z) {
            int i5 = i2 + 105;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            c(958476587 - View.MeasureSpec.getSize(0), (byte) Color.blue(0), (-2121684041) - View.combineMeasuredStates(0, 0), (short) (TextUtils.indexOf("", "") + 33), (ViewConfiguration.getScrollBarSize() >> 8) + 9, objArr);
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), true);
            int i7 = ICustomTabsCallbackStubProxy + 3;
            extraCommand = i7 % 128;
            int i8 = i7 % 2;
        }
        SessionState.Companion.onExtraCallback().IAuthTabCallback_Parcel();
        asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        String strValueOf = String.valueOf(indicatorViewAccess100 != null ? indicatorViewAccess100.getLogValue() : null);
        String eventName = isNumber.PASSWORD.getEventName();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        String string = confirmPasswordActivity.getString(onextracallbackwithresult.onExtraCallbackWithResult((UTF8Decoder) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity}, 639958438, -639958424)));
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = confirmPasswordActivity.getString(onextracallbackwithresult.IAuthTabCallback((UTF8Decoder) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity}, 639958438, -639958424)));
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 30, 24887 - Color.red(0), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 29 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue();
            Long l = confirmPasswordActivity.asBinder;
            long jLongValue = l != null ? l.longValue() : 0L;
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                int i9 = ICustomTabsCallbackStubProxy + 119;
                extraCommand = i9 % 128;
                int i10 = i9 % 2;
                loginYN = indicatorViewAccess1002.getLoginYN();
            } else {
                loginYN = null;
            }
            asMaplambda6.onNavigationEvent(asmaplambda6, strValueOf, eventName, "success", "", string, string2, iIntValue, jLongValue, null, loginYN, confirmPasswordActivity.ITrustedWebActivityService(), str, ((UTF8Decoder) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity}, 639958438, -639958424)).getEventValue(), null, 8192, null);
            confirmPasswordActivity.onGreatestScrollPercentageIncreased().IAuthTabCallback("SIGN_IN");
            PasswordFragment passwordFragment = confirmPasswordActivity.writeTypedObject;
            if (passwordFragment == null) {
                int i11 = extraCommand + 55;
                ICustomTabsCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragment = null;
            }
            PasswordFragment.onNavigationEvent(-374755430, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 374755433, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment, null, 1, null});
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 77;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 105;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(ConfirmPasswordActivity confirmPasswordActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCommand + 95;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
            i = 4;
        } else {
            z = false;
            i = 3;
        }
        BaseActivity.IAuthTabCallback(confirmPasswordActivity, (String) null, z, i, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 17;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 15;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(ConfirmPasswordActivity confirmPasswordActivity, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 97;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        confirmPasswordActivity.startActivity(confirmPasswordActivity.IEngagementSignalsCallback().onWarmupCompleted(confirmPasswordActivity, GlobalOnboardingEventId.onExtraCallbackWithResult(confirmPasswordActivity.IAuthTabCallbackStub), confirmPasswordActivity.access100, z));
        confirmPasswordActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 71;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(ConfirmPasswordActivity confirmPasswordActivity, Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 35;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        if (!confirmPasswordActivity.access100) {
            SessionTrackerb sessionTrackerbOnSessionEnded = confirmPasswordActivity.onSessionEnded();
            Object[] objArr = new Object[1];
            c((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 958476615, (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-2121684006) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((-106) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (-4) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnSessionEnded, confirmPasswordActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            confirmPasswordActivity.finish();
            int i5 = ICustomTabsCallbackStubProxy + 37;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = i3 + 57;
            extraCommand = i7 % 128;
            if (i7 % 2 == 0) {
                function1.invoke(Boolean.TRUE);
                int i8 = 95 / 0;
            } else {
                function1.invoke(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 71;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 69;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unit;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return ConfirmPasswordActivity.this.new asBinder(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
        
            if (viva.republica.toss.guest.ConfirmPasswordActivity.onNavigationEvent(r5, (o.access13800) r14) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
        
            if (viva.republica.toss.guest.ConfirmPasswordActivity.onNavigationEvent(r1, (o.access13800) r14) != r0) goto L37;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r14.label
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 0
                r7 = 1
                if (r1 == 0) goto L4c
                if (r1 == r7) goto L42
                if (r1 == r5) goto L34
                if (r1 == r4) goto L27
                if (r1 != r3) goto L1f
                java.lang.Object r0 = r14.L$0
                java.lang.Exception r0 = (java.lang.Exception) r0
                kotlin.ResultKt.onNavigationEvent(r15)
                goto Lec
            L1f:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L27:
                java.lang.Object r1 = r14.L$1
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r14.L$0
                java.lang.String r1 = (java.lang.String) r1
                kotlin.ResultKt.onNavigationEvent(r15)     // Catch: java.lang.Exception -> Ld8
                goto Lec
            L34:
                java.lang.Object r1 = r14.L$0
                java.lang.String r1 = (java.lang.String) r1
                kotlin.ResultKt.onNavigationEvent(r15)     // Catch: java.lang.Exception -> Ld8
                kotlin.Result r15 = (kotlin.Result) r15     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r15 = r15.onNavigationEvent()     // Catch: java.lang.Exception -> Ld8
                goto L72
            L42:
                kotlin.ResultKt.onNavigationEvent(r15)     // Catch: java.lang.Exception -> Ld8
                kotlin.Result r15 = (kotlin.Result) r15     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r15 = r15.onNavigationEvent()     // Catch: java.lang.Exception -> Ld8
                goto L5d
            L4c:
                kotlin.ResultKt.onNavigationEvent(r15)
                viva.republica.toss.guest.ConfirmPasswordActivity r15 = viva.republica.toss.guest.ConfirmPasswordActivity.this     // Catch: java.lang.Exception -> Ld8
                o.getNightColor r15 = r15.writeTypedList()     // Catch: java.lang.Exception -> Ld8
                r14.label = r7     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r15 = r15.onWarmupCompleted(r6, r14)     // Catch: java.lang.Exception -> Ld8
                if (r15 == r0) goto Leb
            L5d:
                kotlin.ResultKt.onNavigationEvent(r15)     // Catch: java.lang.Exception -> Ld8
                im.toss.featurescommon.profile.library.model.Profile r15 = (im.toss.featurescommon.profile.library.model.Profile) r15     // Catch: java.lang.Exception -> Ld8
                java.lang.String r1 = r15.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld8
                o.UST_CERT_GetSignatureAlgorithm r15 = o.UST_CERT_GetSignatureAlgorithm.onExtraCallback     // Catch: java.lang.Exception -> Ld8
                r14.L$0 = r1     // Catch: java.lang.Exception -> Ld8
                r14.label = r5     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r15 = o.UST_CERT_GetSignatureAlgorithm.onExtraCallback(r15, r6, r14, r7, r2)     // Catch: java.lang.Exception -> Ld8
                if (r15 == r0) goto Leb
            L72:
                kotlin.ResultKt.onNavigationEvent(r15)     // Catch: java.lang.Exception -> Ld8
                java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Ld8
                int r10 = im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()     // Catch: java.lang.Exception -> Ld8
                int r9 = im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()     // Catch: java.lang.Exception -> Ld8
                int r7 = im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()     // Catch: java.lang.Exception -> Ld8
                int r13 = im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()     // Catch: java.lang.Exception -> Ld8
                r8 = -1756374204(0xffffffff974fdb44, float:-6.716206E-25)
                r11 = 1756374207(0x68b024bf, float:6.654515E24)
                java.lang.Object r15 = o.PlayerErrorCode.IAuthTabCallback(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Ld8
                java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Exception -> Ld8
                if (r1 == 0) goto L9b
                boolean r5 = kotlin.text.StringsKt.isBlank(r1)     // Catch: java.lang.Exception -> Ld8
                if (r5 == 0) goto Lc1
            L9b:
                boolean r5 = kotlin.text.StringsKt.isBlank(r15)     // Catch: java.lang.Exception -> Ld8
                if (r5 == 0) goto Lc1
                viva.republica.toss.guest.ConfirmPasswordActivity r15 = viva.republica.toss.guest.ConfirmPasswordActivity.this     // Catch: java.lang.Exception -> Ld8
                java.lang.Object[] r8 = new java.lang.Object[]{r15}     // Catch: java.lang.Exception -> Ld8
                int r5 = com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld8
                int r4 = com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld8
                int r6 = com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld8
                int r7 = com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld8
                r10 = 1605510697(0x5fb22629, float:2.5673986E19)
                r9 = -1605510690(0xffffffffa04dd9de, float:-1.7436262E-19)
                viva.republica.toss.guest.ConfirmPasswordActivity.onNavigationEvent(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Ld8
                goto Lec
            Lc1:
                viva.republica.toss.guest.ConfirmPasswordActivity r5 = viva.republica.toss.guest.ConfirmPasswordActivity.this     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r1 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> Ld8
                r14.L$0 = r1     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r15 = o.access15400.onNavigationEvent(r15)     // Catch: java.lang.Exception -> Ld8
                r14.L$1 = r15     // Catch: java.lang.Exception -> Ld8
                r14.label = r4     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r15 = viva.republica.toss.guest.ConfirmPasswordActivity.onNavigationEvent(r5, r14)     // Catch: java.lang.Exception -> Ld8
                if (r15 != r0) goto Lec
                goto Leb
            Ld8:
                r15 = move-exception
                viva.republica.toss.guest.ConfirmPasswordActivity r1 = viva.republica.toss.guest.ConfirmPasswordActivity.this
                java.lang.Object r15 = o.access15400.onNavigationEvent(r15)
                r14.L$0 = r15
                r14.L$1 = r2
                r14.label = r3
                java.lang.Object r15 = viva.republica.toss.guest.ConfirmPasswordActivity.onNavigationEvent(r1, r14)
                if (r15 != r0) goto Lec
            Leb:
                return r0
            Lec:
                kotlin.Unit r15 = kotlin.Unit.INSTANCE
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.asBinder.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 47;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 65;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(final ConfirmPasswordActivity confirmPasswordActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, Boolean bool) {
        int i = 2 % 2;
        confirmPasswordActivity.bo_();
        if (confirmPasswordActivity.ICustomTabsServiceStubProxy().onExtraCallback()) {
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda17
                public final Object invoke(Object obj) {
                    return ConfirmPasswordActivity.onExtraCallbackWithResult(this.f$0, ((Boolean) obj).booleanValue());
                }
            };
            setBitmapDecoderFactory.IAuthTabCallback(confirmPasswordActivity, new Function0() { // from class: viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda18
                public final Object invoke() {
                    Object[] objArr = {this.f$0, function1};
                    return (Unit) ConfirmPasswordActivity.onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr, 196504149, -196504147);
                }
            }, new Function0() { // from class: viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda19
                public final Object invoke() {
                    return ConfirmPasswordActivity.onExtraCallback(function1);
                }
            });
        } else if (confirmPasswordActivity.IAuthTabCallbackStubProxy) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(confirmPasswordActivity), (CoroutineContext) null, (setRandomHost) null, confirmPasswordActivity.new asBinder(null), 3, (Object) null);
        } else {
            notifyVerticalEdgeReached notifyverticaledgereachedIEngagementSignalsCallback = confirmPasswordActivity.IEngagementSignalsCallback();
            long j = confirmPasswordActivity.IAuthTabCallbackStub;
            Intrinsics.checkNotNull(bool);
            boolean zBooleanValue = bool.booleanValue();
            Long l = confirmPasswordActivity.asBinder;
            String str = confirmPasswordActivity.readTypedObject;
            boolean z2 = confirmPasswordActivity.getInterfaceDescriptor;
            getLogUploadURLMap getloguploadurlmap = confirmPasswordActivity.extraCallbackWithResult;
            if (getloguploadurlmap == null) {
                int i2 = extraCommand + 1;
                ICustomTabsCallbackStubProxy = i2 % 128;
                if (i2 % 2 != 0) {
                    getloguploadurlmap = getLogUploadURLMap.None;
                    int i3 = 19 / 0;
                } else {
                    getloguploadurlmap = getLogUploadURLMap.None;
                }
            }
            confirmPasswordActivity.startActivity(notifyVerticalEdgeReached.onExtraCallbackWithResult(notifyverticaledgereachedIEngagementSignalsCallback, confirmPasswordActivity, "SIGN_IN", j, graniteBrownfieldModule_closeView, zBooleanValue, l, str, z2, false, getloguploadurlmap, z, false, false, 6400, (Object) null));
            confirmPasswordActivity.finish();
            int i4 = extraCommand + 119;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = extraCommand + 97;
        ICustomTabsCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 7;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        TossApiCallException.ApiError apiError = (TossApiCallException.ApiError) th;
        Object[] objArr = new Object[1];
        c(TextUtils.getCapsMode("", 0, 0) + 958476572, (byte) Color.green(0), View.resolveSizeAndState(0, 0, 0) - 2121684005, (short) (64 - ((Process.getThreadPriority(0) + 20) >> 6)), View.combineMeasuredStates(0, 0) - 16, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), apiError.onTransact());
        Object[] objArr2 = new Object[1];
        a(new char[]{51569, 52263, 50120, 55667, 56379, 54223, 59759, 60416, 58308, 63861, 64541}, 1368 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), apiError.getMessage());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 81;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        TossApiCallException.ApiError apiError = (Throwable) objArr[0];
        BaseActivity baseActivity = (ConfirmPasswordActivity) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        TossApiCallException.ApiError apiError2 = apiError;
        Object[] objArr2 = new Object[1];
        c(Color.blue(0) + 958476572, (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-2121684005) - View.MeasureSpec.getSize(0), (short) (63 - TextUtils.lastIndexOf("", '0', 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 17, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), apiError2.onTransact());
        Object[] objArr3 = new Object[1];
        a(new char[]{51569, 52263, 50120, 55667, 56379, 54223, 59759, 60416, 58308, 63861, 64541}, 1367 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), apiError2.getMessage());
        Object[] objArr4 = new Object[1];
        c(TextUtils.indexOf("", "", 0, 0) + 958476576, (byte) TextUtils.indexOf("", "", 0, 0), (-2121684023) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((ViewConfiguration.getLongPressTimeout() >> 16) + 16), (ViewConfiguration.getPressedStateDuration() >> 16) - 9, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), baseActivity.getString(R.string.uikit_confirm));
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 15;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(final viva.republica.toss.guest.ConfirmPasswordActivity r10, final java.lang.Throwable r11, android.content.DialogInterface r12) {
        /*
            r12 = 2
            int r0 = r12 % r12
            int r0 = viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy
            int r0 = r0 + 17
            int r1 = r0 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r1
            int r0 = r0 % r12
            if (r0 != 0) goto L20
            o.createPaints r0 = o.createPaints.IAuthTabCallback
            o.IndicatorView r1 = o.IndicatorView.RESET_PASSWORD_DEMAND_BY_INVALID_PASSWORD
            r0.onExtraCallbackWithResult(r1)
            boolean r0 = o.setTestMode.IAuthTabCallbackDefault()
            r1 = 42
            int r1 = r1 / 0
            if (r0 == 0) goto L32
            goto L2d
        L20:
            o.createPaints r0 = o.createPaints.IAuthTabCallback
            o.IndicatorView r1 = o.IndicatorView.RESET_PASSWORD_DEMAND_BY_INVALID_PASSWORD
            r0.onExtraCallbackWithResult(r1)
            boolean r0 = o.setTestMode.IAuthTabCallbackDefault()
            if (r0 == 0) goto L32
        L2d:
            r0 = 1264439(0x134b37, double:6.24716E-318)
        L30:
            r2 = r0
            goto L36
        L32:
            r0 = 1265765(0x135065, double:6.25371E-318)
            goto L30
        L36:
            r4 = 0
            r5 = 0
            r6 = 0
            viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda16 r7 = new viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda16
            r7.<init>()
            r8 = 14
            r9 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r2, r4, r5, r6, r7, r8, r9)
            o.AppLovinError r10 = r10.ITrustedWebActivityCallbackStub()
            r11 = 1
            r10.IAuthTabCallback(r11)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            int r11 = viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand
            int r11 = r11 + 81
            int r0 = r11 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r0
            int r11 = r11 % r12
            if (r11 != 0) goto L5a
            return r10
        L5a:
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.onWarmupCompleted(viva.republica.toss.guest.ConfirmPasswordActivity, java.lang.Throwable, android.content.DialogInterface):kotlin.Unit");
    }

    private static final Unit onExtraCallback(final Throwable th, final ConfirmPasswordActivity confirmPasswordActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(((TossApiCallException.ApiError) th).getMessage());
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda24
            public final Object invoke(Object obj) {
                return ConfirmPasswordActivity.onNavigationEvent(this.f$0, th, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 53;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class IAuthTabCallbackDefault implements dangerouslyReset {
        IAuthTabCallbackDefault() {
        }

        public void onExtraCallback(DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            ConfirmPasswordActivity confirmPasswordActivity = ConfirmPasswordActivity.this;
            LoginBaseActivity.onExtraCallbackWithResult(confirmPasswordActivity, ConfirmPasswordActivity.onWarmupCompleted(confirmPasswordActivity), null, 2, null);
            dialogInterface.dismiss();
        }

        public void onNavigationEvent(DialogInterface dialogInterface) {
            PasswordFragment passwordFragmentIAuthTabCallbackStub = ConfirmPasswordActivity.IAuthTabCallbackStub(ConfirmPasswordActivity.this);
            if (passwordFragmentIAuthTabCallbackStub == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragmentIAuthTabCallbackStub = null;
            }
            passwordFragmentIAuthTabCallbackStub.extraCommand();
        }
    }

    private static final void onWarmupCompleted(ConfirmPasswordActivity confirmPasswordActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 111;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        confirmPasswordActivity.ITrustedWebActivityCallbackStub().IAuthTabCallback(true);
        int i4 = extraCommand + 93;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(final ConfirmPasswordActivity confirmPasswordActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(confirmPasswordActivity.getString(viva.republica.toss.R.string.error_retry_whole_message));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new DialogInterface.OnDismissListener() { // from class: viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ConfirmPasswordActivity.onNavigationEvent(this.f$0, dialogInterface);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackStubProxy + 55;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return unit;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e5  */
    /* JADX WARN: Type inference failed for: r11v18, types: [viva.republica.toss.password.PasswordFragment] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r3v26, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r41v0, types: [android.content.Context, im.toss.base.BaseActivity, java.lang.Object, viva.republica.toss.guest.ConfirmPasswordActivity, viva.republica.toss.guest.LoginBaseActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(final viva.republica.toss.guest.ConfirmPasswordActivity r41, o.GraniteBrownfieldModule_closeView r42, java.lang.String r43, java.lang.String r44, final java.lang.Throwable r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.onExtraCallback(viva.republica.toss.guest.ConfirmPasswordActivity, o.GraniteBrownfieldModule_closeView, java.lang.String, java.lang.String, java.lang.Throwable):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public boolean bg_() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityCallbackStubProxy();
        int i4 = extraCommand + 61;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyNotificationWithChannel() {
        Intent intentOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = extraCommand + 37;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            addPolicy.MediaMetadataCompat().onNavigationEvent("SHOULD_SHOW_EMAIL_PHONE_INPUT", true);
            intentOnExtraCallbackWithResult = onVerticalScrollEvent().onExtraCallbackWithResult(this);
        } else {
            addPolicy.MediaMetadataCompat().onNavigationEvent("SHOULD_SHOW_EMAIL_PHONE_INPUT", true);
            intentOnExtraCallbackWithResult = onVerticalScrollEvent().onExtraCallbackWithResult(this);
        }
        getNavigationBar.IAuthTabCallback(intentOnExtraCallbackWithResult, this);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit access000(ConfirmPasswordActivity confirmPasswordActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 51;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getNavigationBar.IAuthTabCallback(confirmPasswordActivity.onVerticalScrollEvent().IAuthTabCallback(confirmPasswordActivity, false), confirmPasswordActivity);
        confirmPasswordActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 45;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(boolean z, ConfirmPasswordActivity confirmPasswordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 121;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (z) {
            getNavigationBar.IAuthTabCallback(confirmPasswordActivity.onVerticalScrollEvent().IAuthTabCallback(confirmPasswordActivity, true), confirmPasswordActivity);
            confirmPasswordActivity.finish();
            int i3 = extraCommand + 99;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        } else {
            SessionTrackerb sessionTrackerbOnSessionEnded = confirmPasswordActivity.onSessionEnded();
            Object[] objArr = new Object[1];
            c(TextUtils.indexOf("", "") + 958476616, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), ImageFormat.getBitsPerPixel(0) - 2121684005, (short) ((-106) - View.MeasureSpec.getMode(0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 5, objArr);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnSessionEnded, confirmPasswordActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            confirmPasswordActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, java.lang.Object, viva.republica.toss.guest.ConfirmPasswordActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r13) {
        /*
            r0 = 0
            r1 = r13[r0]
            viva.republica.toss.guest.ConfirmPasswordActivity r1 = (viva.republica.toss.guest.ConfirmPasswordActivity) r1
            r2 = 1
            r13 = r13[r2]
            o.access13800 r13 = (o.access13800) r13
            r3 = 2
            int r4 = r3 % r3
            int r4 = viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand
            int r4 = r4 + 41
            int r5 = r4 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r5
            int r4 = r4 % r3
            boolean r4 = r13 instanceof viva.republica.toss.guest.ConfirmPasswordActivity.access100
            if (r4 == 0) goto L38
            r4 = r13
            viva.republica.toss.guest.ConfirmPasswordActivity$access100 r4 = (viva.republica.toss.guest.ConfirmPasswordActivity.access100) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L38
            int r13 = viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy
            int r13 = r13 + 79
            int r7 = r13 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r7
            int r13 = r13 % r3
            if (r13 != 0) goto L34
            int r5 = r5 + r6
            r4.label = r5
            goto L3d
        L34:
            int r5 = r5 + r6
            r4.label = r5
            goto L3d
        L38:
            viva.republica.toss.guest.ConfirmPasswordActivity$access100 r4 = new viva.republica.toss.guest.ConfirmPasswordActivity$access100
            r4.<init>(r13)
        L3d:
            java.lang.Object r13 = r4.result
            java.lang.Object r5 = o.access14300.onWarmupCompleted()
            int r6 = r4.label
            if (r6 == 0) goto L6c
            int r0 = viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand
            int r0 = r0 + 57
            int r4 = r0 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.ICustomTabsCallbackStubProxy = r4
            int r0 = r0 % r3
            if (r6 != r2) goto L64
            int r4 = r4 + 19
            int r0 = r4 % 128
            viva.republica.toss.guest.ConfirmPasswordActivity.extraCommand = r0
            int r4 = r4 % r3
            if (r4 == 0) goto L5f
            kotlin.ResultKt.onNavigationEvent(r13)
            goto L9a
        L5f:
            kotlin.ResultKt.onNavigationEvent(r13)
            r13 = 0
            throw r13
        L64:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L6c:
            kotlin.ResultKt.onNavigationEvent(r13)
            java.lang.Object[] r10 = new java.lang.Object[]{r1}
            int r7 = com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()
            int r6 = com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()
            int r8 = com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()
            int r9 = com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()
            r12 = -1235540703(0xffffffffb65b2521, float:-3.2655155E-6)
            r11 = 1235540712(0x49a4dae8, float:1350493.0)
            java.lang.Object r13 = onNavigationEvent(r6, r7, r8, r9, r10, r11, r12)
            o.getDummyAd r13 = (o.getDummyAd) r13
            r4.label = r2
            java.lang.String r2 = "STD_104_VISITOR_ONBOADING_AGREEMENT_GRADIENT"
            java.lang.Object r13 = r13.onExtraCallback(r2, r0, r4)
            if (r13 != r5) goto L9a
            return r5
        L9a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda25 r0 = new viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda25
            r0.<init>()
            viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda26 r13 = new viva.republica.toss.guest.ConfirmPasswordActivity$$ExternalSyntheticLambda26
            r13.<init>()
            o.setBitmapDecoderFactory.IAuthTabCallback(r1, r0, r13)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.ConfirmPasswordActivity.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    private final void onExtraCallbackWithResult(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) throws Throwable {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = extraCommand + 7;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(new char[]{51582, 35545, 20030, 945, 51138, 39733, 23696, 4309, 54319, 43393, 28155, 8484, 58000, 42725, 31325, 16279, 62433, 46963, 2195, 52479, 32853, 17833}, 12908 / TextUtils.indexOf((CharSequence) "", 'r', 1), objArr);
            strIAuthTabCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.IAuthTabCallback(((String) objArr[0]).intern());
            if (strIAuthTabCallback == null) {
                return;
            }
        } else {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2 = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr2 = new Object[1];
            a(new char[]{51582, 35545, 20030, 945, 51138, 39733, 23696, 4309, 54319, 43393, 28155, 8484, 58000, 42725, 31325, 16279, 62433, 46963, 2195, 52479, 32853, 17833}, TextUtils.indexOf((CharSequence) "", '0', 0) + 17322, objArr2);
            strIAuthTabCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2.IAuthTabCallback(((String) objArr2[0]).intern());
            if (strIAuthTabCallback == null) {
                return;
            }
        }
        if (!StringsKt.contentEquals(graniteBrownfieldModule_closeView, strIAuthTabCallback)) {
            return;
        }
        int i3 = ICustomTabsCallbackStubProxy + 13;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1333573L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        int i5 = ICustomTabsCallbackStubProxy + 115;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.finish();
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        if (((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1571935772, -1571935767)).booleanValue()) {
            int i4 = extraCommand + 61;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                overridePendingTransition(0, 1);
            } else {
                overridePendingTransition(0, 0);
            }
        }
        int i5 = ICustomTabsCallbackStubProxy + 87;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void getSmallIconBitmap() throws Throwable {
        int i = 2 % 2;
        setInstallResult.IAuthTabCallback.onExtraCallbackWithResult();
        PasswordFragment passwordFragmentOnWarmupCompleted = PasswordFragment.onExtraCallbackWithResult.onWarmupCompleted(PasswordFragment.Companion, setTestMode.onExtraCallback.onTransact(), ((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1571935772, -1571935767)).booleanValue(), false, 4, null);
        passwordFragmentOnWarmupCompleted.onExtraCallbackWithResult((PasswordFragment.onWarmupCompleted) new onExtraCallbackWithResult(this, passwordFragmentOnWarmupCompleted));
        passwordFragmentOnWarmupCompleted.onExtraCallbackWithResult(new onNavigationEvent());
        Bundle bundle = new Bundle();
        Object[] objArr = new Object[1];
        a(new char[]{51553, 20743, 63923, '1'}, 39019 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        bundle.putSerializable(((String) objArr[0]).intern(), (UTF8Decoder) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 639958438, -639958424));
        Long l = this.asBinder;
        long jLongValue = l != null ? l.longValue() : -1L;
        Object[] objArr2 = new Object[1];
        c(ExpandableListView.getPackedPositionType(0L) + 958476554, (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (-2121684052) - TextUtils.indexOf("", ""), (short) ((-53) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-5) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        bundle.putLong(((String) objArr2[0]).intern(), jLongValue);
        passwordFragmentOnWarmupCompleted.setArguments(bundle);
        this.writeTypedObject = passwordFragmentOnWarmupCompleted;
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = getSupportFragmentManager().onExtraCallbackWithResult();
        int i2 = viva.republica.toss.R.id.login_container;
        Fragment fragment = this.writeTypedObject;
        if (fragment == null) {
            int i3 = ICustomTabsCallbackStubProxy + 125;
            extraCommand = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 17 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            fragment = null;
        }
        Object[] objArr3 = new Object[1];
        c(958476568 - View.resolveSizeAndState(0, 0, 0), (byte) View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) - 2121684019, (short) (View.getDefaultSize(0, 0) - 97), (-16) - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(i2, fragment, ((String) objArr3[0]).intern()).onExtraCallbackWithResult();
        if (((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1571935772, -1571935767)).booleanValue()) {
            View viewFindViewById = findViewById(viva.republica.toss.R.id.app_bar_layout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            viewFindViewById.setVisibility(8);
        }
        int i5 = extraCommand + 123;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ConfirmPasswordActivity confirmPasswordActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity, deserializeurinullablecollection}, 195855609, -195855603);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ConfirmPasswordActivity confirmPasswordActivity, Function1 function1) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity, function1}, 196504149, -196504147);
    }

    public static /* synthetic */ boolean IAuthTabCallback(ConfirmPasswordActivity confirmPasswordActivity) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity}, 1144163636, -1144163635)).booleanValue();
    }

    public static final /* synthetic */ getPackageType onExtraCallbackWithResult(ConfirmPasswordActivity confirmPasswordActivity) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (getPackageType) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity}, -441497860, 441497875);
    }

    public static final /* synthetic */ Object onExtraCallback(ConfirmPasswordActivity confirmPasswordActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, String str, String str2, access13800 access13800Var) {
        Object[] objArr = {confirmPasswordActivity, graniteBrownfieldModule_closeView, Boolean.valueOf(z), str, str2, access13800Var};
        return onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr, 977369653, -977369642);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(ConfirmPasswordActivity confirmPasswordActivity, getPackageType getpackagetype) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity, getpackagetype}, 412196427, -412196414);
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(ConfirmPasswordActivity confirmPasswordActivity) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity}, -1605510690, 1605510697);
    }

    private final CERT_PKCS8Prikey IEngagementSignalsCallback_Parcel() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (CERT_PKCS8Prikey) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, -2124942030, 2124942030);
    }

    private final UTF8Decoder IPostMessageServiceDefault() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (UTF8Decoder) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 639958438, -639958424);
    }

    private final boolean ITrustedWebActivityCallback_Parcel() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1571935772, -1571935767)).booleanValue();
    }

    private final Object onExtraCallbackWithResult(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, String str, String str2, access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, graniteBrownfieldModule_closeView, Boolean.valueOf(z), str, str2, access13800Var};
        return onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr, -1437536286, 1437536289);
    }

    private static final Unit onWarmupCompleted(Throwable th, ConfirmPasswordActivity confirmPasswordActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{th, confirmPasswordActivity, setDetectableSize}, -125954828, 125954838);
    }

    private static final deserializeIp onExtraCallbackWithResult(boolean z, ConfirmPasswordActivity confirmPasswordActivity, boolean z2, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, writeRaw writeraw, Boolean bool) {
        Object[] objArr = {Boolean.valueOf(z), confirmPasswordActivity, Boolean.valueOf(z2), graniteBrownfieldModule_closeView, writeraw, bool};
        return (deserializeIp) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr, 413183710, -413183698);
    }

    private static final boolean asBinder(ConfirmPasswordActivity confirmPasswordActivity) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{confirmPasswordActivity}, -16717617, 16717625)).booleanValue();
    }

    private final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this, access13800Var}, 424920161, -424920157);
    }

    public final getDummyAd access200() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (getDummyAd) onNavigationEvent(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1235540712, -1235540703);
    }

    @Override // viva.republica.toss.guest.Hilt_ConfirmPasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 23;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCommand + 7;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.Hilt_ConfirmPasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCommand + 41;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.guest.Hilt_ConfirmPasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 71;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCommand + 93;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    static void IPostMessageServiceStub() {
        onPostMessage = 6304907996667137058L;
        onMinimized = 1654200062;
        ICustomTabsCallbackStub = -1538795491;
        onRelationshipValidationResult = -634286959;
        onUnminimized = new byte[]{56, 23, 64, 52, 36, 61, 38, 76, 20, 91, 44, 59, 57, 64, 106, 106, 98, 108, -79, -80, -61, -67, -31, -32, -13, -19, 13, -23, -25, -29, -8, -25, 11, -24, -46, -37, -27, -49, -8, -28, -43, -57, -37, -26, -41, -26, -55, -17, -17, -18, -36, -37, -14, -42, -41, -34, -58, -29, -28, -24, -38, -23, 103, 122, 86, -96, 98, 87, 57, 98, 102, 109, 100, Byte.MAX_VALUE, 87, 109, 100, -44, -61, -6, -24, -17, -33, -23, -25, -37, -35, -28, -22, -25, -39, -25, -63, -9, -40, -41, -43, -4, 8, 8, 8, 8, 8, 8, 8};
    }
}
