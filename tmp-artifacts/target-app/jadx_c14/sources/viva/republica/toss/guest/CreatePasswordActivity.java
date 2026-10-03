package viva.republica.toss.guest;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import androidx.fragment.app.Fragment;
import im.toss.base.BaseActivity;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.global.features.useronboarding.model.GlobalOnboardingEventId;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.state.spec.SessionState;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.ACAuthRequest;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AppLovinError;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_VerifyVID;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DynamicFromArrayCompanion;
import o.EncryptedContentInfoParser;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.GraniteBrownfieldModule_closeView;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IndicatorView;
import o.PlayerErrorCode;
import o.ReactNativeFeatureFlagsExternalSyntheticLambda0;
import o.RepeatableSpec;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.access8100;
import o.accesssetMapp;
import o.addAllCommandLine;
import o.addPolicy;
import o.asArray;
import o.checkImageLoaded;
import o.clearFaultAdjacentMetadata;
import o.createPaints;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.findResAndMsg;
import o.getBillingPeriod;
import o.getDummyAd;
import o.getLogUploadURLMap;
import o.getNavigationBar;
import o.getNightColor;
import o.getParamImp;
import o.getPreRenderJob;
import o.getWrite;
import o.initMiniApp;
import o.isHttp;
import o.isJacksonCreator;
import o.isOneShot;
import o.maybeUpdateAnimatable;
import o.noStore;
import o.notifyVerticalEdgeReached;
import o.onPageExit;
import o.setBitmapDecoderFactory;
import o.setCommonNetworkProxy;
import o.setFinalY;
import o.setRandomHost;
import o.setTestMode;
import o.startRearDisplaySession;
import o.useSystemImageDecoderByte;
import o.wasLastName;
import o.writeRaw;
import o.zzad;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.guest.CreatePasswordActivity;
import viva.republica.toss.guest.CreatePasswordActivity$;
import viva.republica.toss.password.PasswordFragment;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreatePasswordActivity extends Hilt_CreatePasswordActivity implements PasswordFragment.onExtraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallbackDefault;
    private static int ICustomTabsCallback_Parcel = 0;
    private static int ICustomTabsService = 0;
    public static final int asInterface;
    private static boolean extraCommand = false;
    private static boolean isEngagementSignalsApiAvailable = false;
    private static char[] mayLaunchUrl = null;
    private static int newAuthTabSession = 0;
    private static int newSession = 1;
    private static long onRelationshipValidationResult = 0;
    private static int prefetch = 1;
    private String IAuthTabCallbackStubProxy;
    private Long ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private PasswordFragment access000;
    private Long access100;
    private PasswordFragment asBinder;

    @Inject
    public zzad environments;

    @Inject
    public ACAuthRequest euOnboardingBiometricCheckDialog;
    private boolean extraCallback;
    private long getInterfaceDescriptor;

    @Inject
    public notifyVerticalEdgeReached guestLoginManager;

    @Inject
    public setCommonNetworkProxy loginTokenStore;
    private getLogUploadURLMap onActivityLayout;
    private checkImageLoaded onMessageChannelReady;
    private PasswordFragment onMinimized;
    private String onPostMessage;

    @Inject
    public getNightColor profileRepository;

    @Inject
    public getBillingPeriod regionManager;

    @Inject
    public SessionState sessionState;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public setFinalY tossploreManager;

    @Inject
    public isHttp visitorOnboardingIntentProvider;
    private boolean writeTypedObject;
    private final ObservableProperty onActivityResized = ReactNativeFeatureFlagsExternalSyntheticLambda0.IAuthTabCallback(new GraniteBrownfieldModule_closeView((char[]) null, 1, (DefaultConstructorMarker) null));
    private final Lazy readTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda10
        public final Object invoke() {
            return Boolean.valueOf(CreatePasswordActivity.onWarmupCompleted(this.f$0));
        }
    });
    private final Lazy onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda11
        public final Object invoke() {
            return CreatePasswordActivity.validateRelationship();
        }
    });
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onTransact(this));
    private final Lazy extraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda12
        public final Object invoke() {
            return Boolean.valueOf(CreatePasswordActivity.onNavigationEvent(this.f$0));
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> ICustomTabsCallback = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda13
        public final Object invoke(Object obj) {
            return CreatePasswordActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda14
        public final Object invoke(Object obj) {
            return CreatePasswordActivity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final Lazy ICustomTabsCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda15
        public final Object invoke() {
            return Boolean.valueOf(CreatePasswordActivity.onExtraCallback(this.f$0));
        }
    });

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreatePasswordActivity.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{CreatePasswordActivity.this, this}, 1565704486, R.drawable.IAuthTabCallback(), -1565704486);
        }
    }

    static final class asBinder extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreatePasswordActivity.onExtraCallback(CreatePasswordActivity.this, (access13800) this);
        }
    }

    static {
        IEngagementSignalsCallback_Parcel();
        IAuthTabCallbackDefault = new addAllCommandLine[]{new MutablePropertyReference1Impl<>(CreatePasswordActivity.class, "newPassword", "getNewPassword()Lim/toss/uikit/utils/SecureString;", 0)};
        Companion = new onExtraCallback(null);
        asInterface = 8;
        int i = newAuthTabSession + 61;
        newSession = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 39;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
        int i4 = prefetch + 87;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreatePasswordActivity createPasswordActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 57;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(createPasswordActivity, iEngagementSignalsCallbackDefault);
        int i4 = prefetch + 63;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(CreatePasswordActivity createPasswordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 53;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        onUnminimized(createPasswordActivity);
        int i4 = ICustomTabsCallback_Parcel + 43;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 97;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(createPasswordActivity);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback_Parcel + 25;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 13;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zICustomTabsCallbackStub = ICustomTabsCallbackStub(createPasswordActivity);
        int i4 = prefetch + 35;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zICustomTabsCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = prefetch + 21;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(th);
        int i4 = ICustomTabsCallback_Parcel + 123;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 87;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(createPasswordActivity);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return unitICustomTabsCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, CreatePasswordActivity createPasswordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 25;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, createPasswordActivity);
        int i4 = prefetch + 45;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i4);
        int i11 = i9 | i10 | (~(i8 | i4));
        int i12 = i10 | i;
        int i13 = ~i4;
        int i14 = (~(i | i13 | i6)) | (~(i7 | i13 | i8)) | (~(i8 | i6 | i4));
        int i15 = i6 + i4 + i3 + ((-1329026341) * i5) + ((-1277752516) * i2);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i6) - 1912602624) + ((-659060787) * i4) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i3) + (494927872 * i5) + (1577058304 * i2) + ((-1783103488) * i16);
        int i18 = (i6 * 595972471) + 129777640 + (i4 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i3 * 595972219) + (i5 * (-1341978823)) + (i2 * 731850196) + (i16 * 1869086720);
        switch (i17 + (i18 * i18 * (-846725120))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
                int i19 = 2 % 2;
                int i20 = ICustomTabsCallback_Parcel + 119;
                prefetch = i20 % 128;
                int i21 = i20 % 2;
                createPasswordActivity.ITrustedWebActivityServiceDefault();
                int i22 = ICustomTabsCallback_Parcel + 95;
                prefetch = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                CreatePasswordActivity createPasswordActivity2 = (CreatePasswordActivity) objArr[0];
                int i24 = 2 % 2;
                getDummyAd getdummyad = createPasswordActivity2.standardTermsV2Intent;
                if (getdummyad != null) {
                    int i25 = prefetch + 37;
                    ICustomTabsCallback_Parcel = i25 % 128;
                    int i26 = i25 % 2;
                    return getdummyad;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i27 = prefetch + 31;
                ICustomTabsCallback_Parcel = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return asBinder(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                CreatePasswordActivity createPasswordActivity3 = (CreatePasswordActivity) objArr[0];
                access13800<? super Unit> access13800Var = (access13800) objArr[1];
                int i29 = 2 % 2;
                int i30 = ICustomTabsCallback_Parcel + 101;
                prefetch = i30 % 128;
                int i31 = i30 % 2;
                Object objOnExtraCallbackWithResult = createPasswordActivity3.onExtraCallbackWithResult(access13800Var);
                int i32 = ICustomTabsCallback_Parcel + 41;
                prefetch = i32 % 128;
                int i33 = i32 % 2;
                return objOnExtraCallbackWithResult;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CreatePasswordActivity createPasswordActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 19;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(createPasswordActivity, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreatePasswordActivity createPasswordActivity, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(createPasswordActivity, z);
        int i4 = prefetch + 119;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 11;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 35;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnPostMessage = onPostMessage(createPasswordActivity);
        int i4 = prefetch + 23;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(createPasswordActivity, zBooleanValue);
        }
        onExtraCallback(createPasswordActivity, zBooleanValue);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = prefetch + 123;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        if (i4 == 0) {
            onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, objArr, -2060442221, iIAuthTabCallback3, 2060442235);
        } else {
            onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, objArr, -2060442221, iIAuthTabCallback3, 2060442235);
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 65;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = prefetch + 67;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity}, 1217584259, iIAuthTabCallback3, -1217584249)).booleanValue();
        int i4 = prefetch + 77;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static /* synthetic */ String validateRelationship() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 89;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        String str = (String) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[0], 958168555, iIAuthTabCallback3, -958168540);
        int i4 = ICustomTabsCallback_Parcel + 121;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 61;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return -1L;
    }

    @Override // viva.republica.toss.guest.LoginBaseActivity
    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 31;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static final class onTransact implements Function0<CERT_VerifyVID> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onTransact(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CERT_VerifyVID invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_VerifyVID.onExtraCallback(layoutInflater);
        }
    }

    public static final class onNavigationEvent extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ CreatePasswordActivity IAuthTabCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, CreatePasswordActivity createPasswordActivity) {
            super(onwarmupcompleted);
            this.IAuthTabCallback = createPasswordActivity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            CreatePasswordActivity.onMessageChannelReady(this.IAuthTabCallback);
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
            int i3 = $11 + 63;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getPressedStateDuration() >> 16) + 24, 19627 - View.MeasureSpec.makeMeasureSpec(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() * (5407414049857832247L | onRelationshipValidationResult);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 59 - Color.argb(0, 0, 0, 0), 6384 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = (5407414049857832247L ^ onRelationshipValidationResult) ^ ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue();
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59, View.resolveSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 59 - View.MeasureSpec.getMode(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i6 = $10 + 21;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    public static final /* synthetic */ void IAuthTabCallback(CreatePasswordActivity createPasswordActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) {
        int i = 2 % 2;
        int i2 = prefetch + 51;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        createPasswordActivity.onWarmupCompleted(graniteBrownfieldModule_closeView, z);
        int i4 = ICustomTabsCallback_Parcel + 113;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(CreatePasswordActivity createPasswordActivity, checkImageLoaded checkimageloaded, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        createPasswordActivity.onExtraCallback(checkimageloaded, graniteBrownfieldModule_closeView, z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getLogUploadURLMap IAuthTabCallbackStub(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 83;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getLogUploadURLMap getloguploadurlmap = createPasswordActivity.onActivityLayout;
        if (i4 != 0) {
            int i5 = 42 / 0;
        }
        int i6 = i2 + 13;
        ICustomTabsCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return getloguploadurlmap;
    }

    public static final /* synthetic */ String IAuthTabCallbackStubProxy(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 97;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        String str = createPasswordActivity.onPostMessage;
        int i5 = i2 + 121;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 13;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(createPasswordActivity.getInterfaceDescriptor);
        }
        long j = createPasswordActivity.getInterfaceDescriptor;
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 59;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        boolean z = createPasswordActivity.ICustomTabsCallbackStub;
        int i5 = i2 + 65;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ boolean ICustomTabsCallback(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 95;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            createPasswordActivity.ITrustedWebActivityServiceStub();
            obj.hashCode();
            throw null;
        }
        boolean zITrustedWebActivityServiceStub = createPasswordActivity.ITrustedWebActivityServiceStub();
        int i3 = prefetch + 3;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return zITrustedWebActivityServiceStub;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ asArray access000(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 33;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return createPasswordActivity.ITrustedWebActivityService();
        }
        createPasswordActivity.ITrustedWebActivityService();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        checkImageLoaded checkimageloaded = (checkImageLoaded) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 35;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity, checkimageloaded}, -1411322475, iIAuthTabCallback3, 1411322488);
        int i4 = prefetch + 111;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ PasswordFragment asBinder(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 101;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        PasswordFragment passwordFragment = createPasswordActivity.asBinder;
        int i5 = i2 + 47;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return passwordFragment;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 57;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        boolean z = createPasswordActivity.writeTypedObject;
        int i5 = i3 + 107;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public static final /* synthetic */ boolean extraCallback(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 25;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean z = createPasswordActivity.read();
        int i4 = ICustomTabsCallback_Parcel + 55;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static final /* synthetic */ checkImageLoaded getInterfaceDescriptor(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 53;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        checkImageLoaded checkimageloaded = createPasswordActivity.onMessageChannelReady;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 87;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return checkimageloaded;
    }

    public static final /* synthetic */ boolean onActivityResized(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 67;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        boolean z = createPasswordActivity.extraCallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 13;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ Object onExtraCallback(CreatePasswordActivity createPasswordActivity, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 79;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = createPasswordActivity.onExtraCallback((access13800<? super Unit>) access13800Var);
        int i4 = ICustomTabsCallback_Parcel + 3;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return objOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView;
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {createPasswordActivity};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        if (i3 != 0) {
            graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) onNavigationEvent(iIAuthTabCallback, iIAuthTabCallback4, iIAuthTabCallback2, objArr2, 1153926833, iIAuthTabCallback3, -1153926825);
            int i4 = 70 / 0;
        } else {
            graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) onNavigationEvent(iIAuthTabCallback, iIAuthTabCallback4, iIAuthTabCallback2, objArr2, 1153926833, iIAuthTabCallback3, -1153926825);
        }
        int i5 = ICustomTabsCallback_Parcel + 109;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return graniteBrownfieldModule_closeView;
    }

    public static final /* synthetic */ void onMessageChannelReady(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 97;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        createPasswordActivity.ITrustedWebActivityService_Parcel();
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(CreatePasswordActivity createPasswordActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = prefetch + 91;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        createPasswordActivity.IAuthTabCallbackStub(th);
        int i4 = prefetch + 107;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(CreatePasswordActivity createPasswordActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 53;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        createPasswordActivity.IAuthTabCallback(graniteBrownfieldModule_closeView);
        int i4 = ICustomTabsCallback_Parcel + 35;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    public static final /* synthetic */ Long onTransact(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 17;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Long l = createPasswordActivity.access100;
        if (i3 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Long writeTypedObject(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 109;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Long l = createPasswordActivity.ICustomTabsCallbackDefault;
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        int i6 = i2 + 11;
        ICustomTabsCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return l;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ boolean IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = prefetch + 87;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return super.IEngagementSignalsCallbackStub();
        }
        super.IEngagementSignalsCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ boolean IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 61;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return super.IEngagementSignalsCallbackStubProxy();
        }
        super.IEngagementSignalsCallbackStubProxy();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ String updateVisuals() {
        int i = 2 % 2;
        int i2 = prefetch + 43;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strUpdateVisuals = super.updateVisuals();
        int i4 = prefetch + 87;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return strUpdateVisuals;
    }

    public static final class onExtraCallback {
        private static final byte[] $$a = {29, -26, 91, 68};
        private static final int $$b = 120;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onNavigationEvent = {60817, 30844, 50784, 11350, 47701, ';', 28211, 62481, 16913, 43255, 14048, 40155, 60103, 28833, 56999, 9367, 45725, 6507, 26490, 52571, 23389, 41248, 34254, 4131, 44607, 17417, 53770, 26724, 1645, 40014, 10821, 49333, 24238, 62615, 33428, 6386, 46831, 60817, 30844, 50784, 11350, 47701, ';', 28221, 62487, 16907, 43250, 14065, 40150, 60125, 28834, 57021, 9345, 45712, 6523, 26488, 52555, 23379, 41261, 3898, 38171, 58112, 18923, 55295, 15809, 35802, 9767, 46026, 3542, 59360, 29155, 52109, 42379, 16289, 35261, 25412, 64843, 22369, 8555, 47878, 5389, 61216};
        private static long onWarmupCompleted = 127453105403099172L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, int r7, short r8) {
            /*
                byte[] r0 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallback.$$a
                int r6 = r6 * 3
                int r6 = 97 - r6
                int r7 = r7 * 4
                int r7 = r7 + 1
                int r8 = r8 * 2
                int r8 = r8 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r7
                r6 = r8
                r3 = r2
                goto L2a
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2a:
                int r4 = -r4
                int r8 = r8 + r4
                int r6 = r6 + 1
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onExtraCallback.$$c(short, int, short):java.lang.String");
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01a2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onExtraCallback.a(int, int, char, java.lang.Object[]):void");
        }

        public static /* synthetic */ Intent onWarmupCompleted(onExtraCallback onextracallback, Context context, boolean z, long j, Long l, String str, boolean z2, getLogUploadURLMap getloguploadurlmap, boolean z3, boolean z4, Long l2, checkImageLoaded checkimageloaded, int i, Object obj) {
            boolean z5;
            Long l3;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            boolean z6 = (i & 32) != 0 ? false : z2;
            getLogUploadURLMap getloguploadurlmap2 = (i & 64) != 0 ? null : getloguploadurlmap;
            if ((i & 128) != 0) {
                int i6 = i4 + 79;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z5 = false;
            } else {
                z5 = z3;
            }
            boolean z7 = (i & 256) != 0 ? false : z4;
            if ((i & 512) != 0) {
                int i8 = i4 + 65;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                l3 = null;
            } else {
                l3 = l2;
            }
            return onextracallback.onNavigationEvent(context, z, j, l, str, z6, getloguploadurlmap2, z5, z7, l3, (i & 1024) != 0 ? null : checkimageloaded);
        }

        @JvmStatic
        public final Intent onNavigationEvent(@NotNull Context context, boolean z, long j, @Nullable Long l, @Nullable String str, boolean z2, @Nullable getLogUploadURLMap getloguploadurlmap, boolean z3, boolean z4, @Nullable Long l2, @Nullable checkImageLoaded checkimageloaded) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) CreatePasswordActivity.class).putExtra("EXTRA_ONBOARDING_CONVERSION_TYPE", checkimageloaded).putExtra("EXTRA_SIGN_UP", z);
            long jLongValue = 0;
            Object[] objArr = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, (char) TextUtils.getCapsMode("", 0, 0), objArr);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr[0]).intern(), j);
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0) + 23, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (Process.getGidForName("") + 26720), objArr2);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr2[0]).intern(), l).putExtra("EXTRA_REFERRER", str);
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, ExpandableListView.getPackedPositionChild(0L) + 30, (char) View.getDefaultSize(0, 0), objArr3);
            Intent intentPutExtra4 = intentPutExtra3.putExtra(((String) objArr3[0]).intern(), z2).putExtra("EXTRA_LOGIN_TOKEN_CONSENT_TYPE", (Serializable) getloguploadurlmap).putExtra("EXTRA_FOR_CREATE_CERT", z3);
            Object[] objArr4 = new Object[1];
            a(MotionEvent.axisFromString("") + 67, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, (char) (52150 - TextUtils.indexOf("", "", 0, 0)), objArr4);
            Intent intentPutExtra5 = intentPutExtra4.putExtra(((String) objArr4[0]).intern(), z4);
            if (l2 != null) {
                int i2 = onExtraCallback + 53;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 9 / 0;
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = l2.longValue();
                }
            }
            Intent intentPutExtra6 = intentPutExtra5.putExtra("EXTRA_VISITOR_SELFIE_SESSION_ID", jLongValue);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra6, "");
            return intentPutExtra6;
        }
    }

    private final void IAuthTabCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 5;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        this.onActivityResized.setValue(this, IAuthTabCallbackDefault[0], graniteBrownfieldModule_closeView);
        int i4 = prefetch + 101;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 19;
        ICustomTabsCallback_Parcel = i2 % 128;
        return (GraniteBrownfieldModule_closeView) createPasswordActivity.onActivityResized.getValue(createPasswordActivity, i2 % 2 != 0 ? IAuthTabCallbackDefault[0] : IAuthTabCallbackDefault[0]);
    }

    private final boolean read() {
        int i = 2 % 2;
        int i2 = prefetch + 93;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) this.readTypedObject.getValue();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        BaseActivity baseActivity = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 101;
        prefetch = i2 % 128;
        boolean booleanExtra = baseActivity.getIntent().getBooleanExtra("EXTRA_FOR_CREATE_CERT", i2 % 2 == 0);
        int i3 = prefetch + 99;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(booleanExtra);
    }

    private final String getSmallIconBitmap() {
        int i = 2 % 2;
        int i2 = prefetch + 69;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onUnminimized.getValue();
        int i4 = prefetch + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetch + 57;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        UUID uuidRandomUUID = UUID.randomUUID();
        if (i3 == 0) {
            return uuidRandomUUID.toString();
        }
        uuidRandomUUID.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final CERT_VerifyVID IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 121;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackStub.getValue();
        if (i3 != 0) {
            return (CERT_VerifyVID) value;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 83;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        notifyVerticalEdgeReached notifyverticaledgereached = createPasswordActivity.guestLoginManager;
        if (notifyverticaledgereached != null) {
            int i5 = i2 + 99;
            prefetch = i5 % 128;
            int i6 = i5 % 2;
            return notifyverticaledgereached;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = prefetch + 41;
        ICustomTabsCallback_Parcel = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final setFinalY onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 33;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        setFinalY setfinaly = this.tossploreManager;
        Object obj = null;
        if (setfinaly == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 85;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return setfinaly;
        }
        obj.hashCode();
        throw null;
    }

    public final getBillingPeriod ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 79;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getBillingPeriod getbillingperiod = this.regionManager;
        if (getbillingperiod != null) {
            int i4 = i2 + 97;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return getbillingperiod;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = prefetch + 59;
        ICustomTabsCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 1;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = createPasswordActivity.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = prefetch + 71;
            ICustomTabsCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i3 + 57;
        prefetch = i7 % 128;
        if (i7 % 2 != 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    public final isHttp IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 45;
        ICustomTabsCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        isHttp ishttp = this.visitorOnboardingIntentProvider;
        if (ishttp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 109;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return ishttp;
    }

    public static final class onExtraCallbackWithResult implements PasswordFragment.onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        final /* synthetic */ CreatePasswordActivity onExtraCallback;
        final /* synthetic */ PasswordFragment onExtraCallbackWithResult;
        final /* synthetic */ CreatePasswordActivity onWarmupCompleted;
        private static char[] onNavigationEvent = {32460, 32455, 32456, 32467, 32435, 32416, 32428, 32430, 32447, 32473, 32434, 32419, 32426, 32436, 32439, 32444};
        private static int IAuthTabCallback = -1184333960;
        private static boolean asBinder = true;
        private static boolean asInterface = true;

        public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 61;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(function1, obj);
            int i4 = IAuthTabCallbackDefault + 49;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(CreatePasswordActivity createPasswordActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, PasswordFragment passwordFragment) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 65;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(createPasswordActivity, graniteBrownfieldModule_closeView, passwordFragment);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallbackDefault + 49;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ Unit onNavigationEvent(PasswordFragment passwordFragment, CreatePasswordActivity createPasswordActivity, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 1;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback(passwordFragment, createPasswordActivity, th);
            }
            onExtraCallback(passwordFragment, createPasswordActivity, th);
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int length;
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onNavigationEvent;
            if (cArr3 != null) {
                int i3 = $10;
                int i4 = i3 + 15;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i5 = i3 + 113;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 77, 20952 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 75 - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                long j = 0;
                if (!(!asInterface)) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i8 = $11 + 9;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] >>> iIntValue);
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 63 - (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), TextUtils.lastIndexOf("", '0') + 64, 12215 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        }
                        j = 0;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!asBinder) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    int i9 = $11 + 41;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    try {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 63 - View.combineMeasuredStates(0, 0), 12215 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        onExtraCallbackWithResult(PasswordFragment passwordFragment, CreatePasswordActivity createPasswordActivity, CreatePasswordActivity createPasswordActivity2) {
            this.onExtraCallbackWithResult = passwordFragment;
            this.onWarmupCompleted = createPasswordActivity;
            this.onExtraCallback = createPasswordActivity2;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void IAuthTabCallback(viva.republica.toss.guest.CreatePasswordActivity r10, o.GraniteBrownfieldModule_closeView r11, viva.republica.toss.password.PasswordFragment r12) throws java.lang.Throwable {
            /*
                r0 = 2
                int r1 = r0 % r0
                o.GraniteBrownfieldModule_closeView r1 = new o.GraniteBrownfieldModule_closeView
                r1.<init>(r11)
                viva.republica.toss.guest.CreatePasswordActivity.onNavigationEvent(r10, r1)
                boolean r11 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback(r10)
                r1 = 1
                r11 = r11 ^ r1
                r2 = 0
                if (r11 == 0) goto L15
                goto L3c
            L15:
                int r11 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackStub
                int r11 = r11 + 51
                int r3 = r11 % 128
                viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackDefault = r3
                int r11 = r11 % r0
                if (r11 == 0) goto L2a
                boolean r11 = viva.republica.toss.guest.CreatePasswordActivity.IAuthTabCallback_Parcel(r10)
                r3 = 24
                int r3 = r3 / r2
                if (r11 != 0) goto L3c
                goto L30
            L2a:
                boolean r11 = viva.republica.toss.guest.CreatePasswordActivity.IAuthTabCallback_Parcel(r10)
                if (r11 != 0) goto L3c
            L30:
                int r11 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackStub
                int r11 = r11 + 3
                int r3 = r11 % 128
                viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackDefault = r3
                int r11 = r11 % r0
                o.UTF8Decoder r11 = o.UTF8Decoder.SIGN_IN_RESET_RECHECK_GLOBAL
                goto L6b
            L3c:
                boolean r11 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback(r10)
                if (r11 == 0) goto L4e
                int r11 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackStub
                int r11 = r11 + 103
                int r3 = r11 % 128
                viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackDefault = r3
                int r11 = r11 % r0
                o.UTF8Decoder r11 = o.UTF8Decoder.SIGN_UP_GLOBAL_RECHECK
                goto L6b
            L4e:
                boolean r11 = viva.republica.toss.guest.CreatePasswordActivity.extraCallback(r10)
                if (r11 == 0) goto L69
                int r11 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackDefault
                int r11 = r11 + 105
                int r3 = r11 % 128
                viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackStub = r3
                int r11 = r11 % r0
                o.UTF8Decoder r11 = o.UTF8Decoder.SIGN_UP_WITH_CERT_RECHECK
                int r3 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackDefault
                int r3 = r3 + 71
                int r4 = r3 % 128
                viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackStub = r4
                int r3 = r3 % r0
                goto L6b
            L69:
                o.UTF8Decoder r11 = o.UTF8Decoder.SIGN_UP_RECHECK
            L6b:
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 4
                byte[] r4 = new byte[r4]
                r4 = {x00ce: FILL_ARRAY_DATA , data: [-124, -125, -126, -127} // fill-array
                int r5 = android.view.ViewConfiguration.getLongPressTimeout()
                int r5 = r5 >> 16
                int r5 = r5 + 127
                java.lang.Object[] r6 = new java.lang.Object[r1]
                r7 = 0
                a(r7, r7, r4, r5, r6)
                r4 = r6[r2]
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r4 = r4.intern()
                r3.putSerializable(r4, r11)
                java.lang.Long r10 = viva.republica.toss.guest.CreatePasswordActivity.onTransact(r10)
                if (r10 == 0) goto L9a
                long r4 = r10.longValue()
                goto L9c
            L9a:
                r4 = -1
            L9c:
                r10 = 15
                byte[] r10 = new byte[r10]
                r10 = {x00d4: FILL_ARRAY_DATA , data: [-112, -113, -118, -114, -123, -115, -115, -116, -117, -118, -119, -120, -121, -122, -123} // fill-array
                r8 = 0
                int r6 = android.widget.ExpandableListView.getPackedPositionChild(r8)
                int r6 = r6 + 128
                java.lang.Object[] r1 = new java.lang.Object[r1]
                a(r7, r7, r10, r6, r1)
                r10 = r1[r2]
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r10 = r10.intern()
                r3.putLong(r10, r4)
                r12.setArguments(r3)
                viva.republica.toss.password.PasswordFragment$onNavigationEvent r10 = viva.republica.toss.password.PasswordFragment.onNavigationEvent.CONFIRM
                r12.onNavigationEvent(r10, r11)
                int r10 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackDefault
                int r10 = r10 + 21
                int r11 = r10 % 128
                viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackStub = r11
                int r10 = r10 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallback(viva.republica.toss.guest.CreatePasswordActivity, o.GraniteBrownfieldModule_closeView, viva.republica.toss.password.PasswordFragment):void");
        }

        private static final void onWarmupCompleted(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 121;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            if (i3 == 0) {
                int i4 = 67 / 0;
            }
            int i5 = IAuthTabCallbackStub + 119;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onExtraCallback(PasswordFragment passwordFragment, CreatePasswordActivity createPasswordActivity, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 117;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            isOneShot.onExtraCallbackWithResult(passwordFragment, noStore.Companion.onWarmupCompleted());
            String string = passwordFragment.getString(viva.republica.toss.R.string.create_password_another_password);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Intrinsics.checkNotNull(th);
            passwordFragment.onNavigationEvent(string, accesssetMapp.onWarmupCompleted(th, createPasswordActivity));
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallbackDefault + 47;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00c7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00c8, code lost:
        
            r9 = new java.lang.Object[]{r17.onWarmupCompleted};
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00f8, code lost:
        
            if ((!java.util.Arrays.equals(((o.GraniteBrownfieldModule_closeView) viva.republica.toss.guest.CreatePasswordActivity.onNavigationEvent(im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), r9, -1466573771, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 1466573772)).onWarmupCompleted(), r18.onWarmupCompleted())) == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00fa, code lost:
        
            o.isOneShot.onExtraCallbackWithResult(r17.onExtraCallbackWithResult, o.noStore.Companion.onWarmupCompleted());
            r0 = r17.onExtraCallbackWithResult;
            r3 = r0.getString(viva.republica.toss.R.string.create_password_wrong_password_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "");
            r5 = r17.onExtraCallbackWithResult.getString(viva.republica.toss.R.string.create_password_wrong_password_subtitle);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r0.onNavigationEvent(r3, r5);
            r0 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackDefault + 15;
            viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackStub = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0127, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0128, code lost:
        
            r3 = viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackDefault + 27;
            viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.IAuthTabCallbackStub = r3 % 128;
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0138, code lost:
        
            if ((r3 % 2) != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x013a, code lost:
        
            r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x013e, code lost:
        
            if (r0 != null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0140, code lost:
        
            r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 1), 29 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 24887 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), -265239605, false, "onWarmupCompleted", (java.lang.Class[]) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0163, code lost:
        
            r0 = ((java.lang.reflect.Field) r0).get(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0169, code lost:
        
            r2 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(256741507);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x016d, code lost:
        
            if (r2 != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x016f, code lost:
        
            r2 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) android.view.KeyEvent.getDeadChar(0, 0), android.graphics.Color.green(0) + 30, android.view.KeyEvent.normalizeMetaState(0) + 24887, 1041067539, false, "onExtraCallbackWithResult", new java.lang.Class[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x018c, code lost:
        
            ((java.lang.reflect.Method) r2).invoke(r0, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0191, code lost:
        
            viva.republica.toss.guest.CreatePasswordActivity.extraCallback(r17.onWarmupCompleted);
            r7.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0199, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x019a, code lost:
        
            r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x01a0, code lost:
        
            if (r3 != null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x01a2, code lost:
        
            r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 30 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 24888 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), -265239605, false, "onWarmupCompleted", (java.lang.Class[]) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x01c3, code lost:
        
            r3 = ((java.lang.reflect.Field) r3).get(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x01c9, code lost:
        
            r2 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(256741507);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x01cd, code lost:
        
            if (r2 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x01cf, code lost:
        
            r2 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.KeyEvent.keyCodeFromString("") + 30, 24886 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), 1041067539, false, "onExtraCallbackWithResult", new java.lang.Class[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x01f2, code lost:
        
            ((java.lang.reflect.Method) r2).invoke(r3, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x01fd, code lost:
        
            if (viva.republica.toss.guest.CreatePasswordActivity.extraCallback(r17.onWarmupCompleted) == false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x01ff, code lost:
        
            viva.republica.toss.guest.CreatePasswordActivity.onNavigationEvent(im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), new java.lang.Object[]{r17.onWarmupCompleted}, 999988762, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -999988758);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x021e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x021f, code lost:
        
            viva.republica.toss.guest.CreatePasswordActivity.IAuthTabCallback(r17.onWarmupCompleted, r18, r19);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0226, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0227, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0228, code lost:
        
            r2 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x022c, code lost:
        
            if (r2 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x022e, code lost:
        
            throw r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x022f, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
        
            if (((viva.republica.toss.password.PasswordFragment.onNavigationEvent) viva.republica.toss.password.PasswordFragment.onNavigationEvent(-853005714, im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 853005718, im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new java.lang.Object[]{r17.onExtraCallbackWithResult})) == viva.republica.toss.password.PasswordFragment.onNavigationEvent.INPUT) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
        
            if (((viva.republica.toss.password.PasswordFragment.onNavigationEvent) viva.republica.toss.password.PasswordFragment.onNavigationEvent(-853005714, im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 853005718, im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new java.lang.Object[]{r17.onExtraCallbackWithResult})) == viva.republica.toss.password.PasswordFragment.onNavigationEvent.INPUT) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
        
            r2 = o.DynamicFromArrayCompanion.onExtraCallback(o.DynamicFromArrayCompanion.onExtraCallbackWithResult, viva.republica.toss.guest.CreatePasswordActivity.access000(r17.onWarmupCompleted), r18, r17.onExtraCallback, java.lang.Long.valueOf(((java.lang.Long) viva.republica.toss.guest.CreatePasswordActivity.onNavigationEvent(im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), new java.lang.Object[]{r17.onWarmupCompleted}, 2394694, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -2394678)).longValue()), null, 16, null);
            r4 = r17.onWarmupCompleted;
            r5 = r17.onExtraCallbackWithResult;
            r3 = new viva.republica.toss.guest.CreatePasswordActivity$initLayout$1$2$$ExternalSyntheticLambda0(r4, r18, r5);
            r4 = r17.onExtraCallbackWithResult;
            r5 = r17.onWarmupCompleted;
            r0 = new viva.republica.toss.guest.CreatePasswordActivity$initLayout$1$2$$ExternalSyntheticLambda1(r4, r5);
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2.onWarmupCompleted(r3, new viva.republica.toss.guest.CreatePasswordActivity$initLayout$1$2$$ExternalSyntheticLambda2(r0)));
         */
        @Override // viva.republica.toss.password.PasswordFragment.onWarmupCompleted
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onWarmupCompleted(final o.GraniteBrownfieldModule_closeView r18, boolean r19, java.lang.String r20, java.lang.String r21, boolean r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 560
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult.onWarmupCompleted(o.GraniteBrownfieldModule_closeView, boolean, java.lang.String, java.lang.String, boolean):void");
        }
    }

    private static void c(byte[] bArr, char[] cArr, int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = mayLaunchUrl;
        char c = '0';
        if (cArr2 != null) {
            int i3 = $10 + 99;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 49;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", c, 0) + 78, 20953 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $11 + 69;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(ICustomTabsService)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 75, 16037 - (ViewConfiguration.getTapTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (isEngagementSignalsApiAvailable) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 63, 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (extraCommand) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 63 - View.resolveSizeAndState(0, 0, 0), 12214 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $11 + 95;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] >>> iIntValue);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        objArr[0] = new String(cArr6);
    }

    public final getNightColor IEngagementSignalsCallback() {
        int i = 2 % 2;
        getNightColor getnightcolor = this.profileRepository;
        if (getnightcolor != null) {
            int i2 = ICustomTabsCallback_Parcel + 23;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            return getnightcolor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = prefetch + 111;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        CreatePasswordActivity createPasswordActivity = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 91;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        SessionState sessionState = createPasswordActivity.sessionState;
        if (i4 == 0) {
            throw null;
        }
        if (sessionState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 63;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i2 + 17;
        prefetch = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 90 / 0;
        }
        return sessionState;
    }

    public final ACAuthRequest writeTypedList() {
        int i = 2 % 2;
        int i2 = prefetch + 63;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ACAuthRequest aCAuthRequest = this.euOnboardingBiometricCheckDialog;
        if (aCAuthRequest != null) {
            return aCAuthRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = ICustomTabsCallback_Parcel + 85;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final zzad ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 79;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 43;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return zzadVar;
        }
        throw null;
    }

    private final boolean ITrustedWebActivityServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 81;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.extraCallbackWithResult.getValue()).booleanValue();
        int i4 = ICustomTabsCallback_Parcel + 9;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean onPostMessage(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 113;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = createPasswordActivity.ICustomTabsService_Parcel().onExtraCallback();
        int i4 = ICustomTabsCallback_Parcel + 103;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(CreatePasswordActivity createPasswordActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 15;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = ICustomTabsCallback_Parcel + 13;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            createPasswordActivity.RemoteActionCompatParcelizer();
        } else {
            createPasswordActivity.ITrustedWebActivityCallbackStub().IAuthTabCallback(true);
            int i6 = prefetch + 61;
            ICustomTabsCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(viva.republica.toss.guest.CreatePasswordActivity r5, o.IEngagementSignalsCallbackDefault r6) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            int r2 = r6.onNavigationEvent()
            r3 = 30030(0x754e, float:4.2081E-41)
            if (r2 != r3) goto L9b
            android.content.Intent r6 = r6.onExtraCallbackWithResult()
            if (r6 == 0) goto L45
            int r2 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r2 = r2 + 107
            int r3 = r2 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r3
            int r2 = r2 % r0
            r2 = 26
            char[] r2 = new char[r2]
            r2 = {x00a2: FILL_ARRAY_DATA , data: [17900, -15912, 19883, -13950, 21886, -11963, 23859, -9970, 25854, -7983, 27826, -6018, 29765, -4036, 31750, -1055, 1985, -31809, 3991, -29846, 5959, -27854, 7919, -25894, 9905, -23920} // fill-array
            int r3 = android.view.ViewConfiguration.getScrollBarSize()
            int r3 = r3 >> 8
            r4 = 33827(0x8423, float:4.7402E-41)
            int r3 = r3 + r4
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            a(r2, r3, r4)
            r2 = 0
            r2 = r4[r2]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r6 = r6.getStringExtra(r2)
            if (r6 != 0) goto L4e
        L45:
            int r6 = viva.republica.toss.R.string.retry_input_password_when_error_message
            java.lang.String r6 = r5.getString(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
        L4e:
            o.FlowMeasureLazyPolicyExternalSyntheticLambda3 r2 = r5.getSupportFragmentManager()
            int r2 = r2.extraCallbackWithResult()
            if (r2 <= 0) goto L68
            int r2 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r2 = r2 + 5
            int r3 = r2 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r3
            int r2 = r2 % r0
            o.FlowMeasureLazyPolicyExternalSyntheticLambda3 r2 = r5.getSupportFragmentManager()
            r2.newAuthTabSession()
        L68:
            viva.republica.toss.password.PasswordFragment r2 = r5.onMinimized
            r3 = 0
            if (r2 == 0) goto L77
            if (r2 != 0) goto L73
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r2 = r3
        L73:
            viva.republica.toss.password.PasswordFragment.onExtraCallbackWithResult(r2, r6, r3, r0, r3)
            goto L9e
        L77:
            viva.republica.toss.password.PasswordFragment r2 = r5.access000
            if (r2 == 0) goto L98
            if (r2 != 0) goto L94
            int r5 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r5 = r5 + 65
            int r2 = r5 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r2
            int r5 = r5 % r0
            if (r5 == 0) goto L8d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r2 = r3
            goto L94
        L8d:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r3.hashCode()
            throw r3
        L94:
            viva.republica.toss.password.PasswordFragment.onExtraCallbackWithResult(r2, r6, r3, r0, r3)
            goto L9e
        L98:
            r5.IAuthTabCallbackStubProxy = r6
            goto L9e
        L9b:
            r5.finish()
        L9e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onWarmupCompleted(viva.republica.toss.guest.CreatePasswordActivity, o.IEngagementSignalsCallbackDefault):kotlin.Unit");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 55;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            setTestMode.onExtraCallback.onTransact();
            throw null;
        }
        asArray asarrayOnTransact = setTestMode.onExtraCallback.onTransact();
        int i3 = ICustomTabsCallback_Parcel + 119;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        return asarrayOnTransact;
    }

    private final asArray ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = prefetch + 11;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        asArray interfaceDescriptor = setTestMode.onExtraCallback.getInterfaceDescriptor();
        int i4 = prefetch + 67;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = prefetch + 37;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("act_type", "enrollment_funnel")});
        }
        Pair[] pairArr = new Pair[0];
        pairArr[0] = getWrite.IAuthTabCallback("act_type", "enrollment_funnel");
        return access8100.IAuthTabCallback(pairArr);
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 125;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(setTestMode.onExtraCallback.onActivityResized() ? 1222813L : getScreenId());
        int i4 = prefetch + 109;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return lValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public String IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 61;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        String smallIconBitmap = getSmallIconBitmap();
        int i4 = prefetch + 59;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return smallIconBitmap;
    }

    private final boolean getSmallIconId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 29;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.ICustomTabsCallbackStubProxy.getValue()).booleanValue();
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean ICustomTabsCallbackStub(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 13;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            isJacksonCreator.Companion.IAuthTabCallback(createPasswordActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = isJacksonCreator.Companion.IAuthTabCallback(createPasswordActivity);
        int i3 = prefetch + 61;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public Map<String, Object> ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        prefetch = i2 % 128;
        String logValue = null;
        if (i2 % 2 == 0) {
            setTestMode.onExtraCallback.onActivityResized();
            throw null;
        }
        if (!setTestMode.onExtraCallback.onActivityResized()) {
            return getScreenParams();
        }
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("login_yn", indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null);
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        if (indicatorViewAccess1002 != null) {
            int i3 = ICustomTabsCallback_Parcel + 79;
            prefetch = i3 % 128;
            int i4 = i3 % 2;
            logValue = indicatorViewAccess1002.getLogValue();
            int i5 = ICustomTabsCallback_Parcel + 5;
            prefetch = i5 % 128;
            int i6 = i5 % 2;
        }
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("inflow_type", logValue), getWrite.IAuthTabCallback("is_showing_neo_pin", zzaz.onExtraCallbackWithResult(getSmallIconId()))});
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return getScreenName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (o.setTestMode.onExtraCallback.onActivityResized() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (o.setTestMode.onExtraCallback.onActivityResized() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel + 77;
        r2 = r1 % 128;
        viva.republica.toss.guest.CreatePasswordActivity.prefetch = r2;
        r1 = r1 % 2;
        r2 = r2 + 23;
        viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel = r2 % 128;
        r2 = r2 % 2;
     */
    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String setEngagementSignalsCallback() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r1 = r1 + 29
            int r2 = r1 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            o.setTestMode r1 = o.setTestMode.onExtraCallback
            boolean r1 = r1.onActivityResized()
            r2 = 68
            int r2 = r2 / 0
            if (r1 == 0) goto L36
            goto L23
        L1b:
            o.setTestMode r1 = o.setTestMode.onExtraCallback
            boolean r1 = r1.onActivityResized()
            if (r1 == 0) goto L36
        L23:
            int r1 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r2
            int r1 = r1 % r0
            int r2 = r2 + 23
            int r1 = r2 % 128
            viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel = r1
            int r2 = r2 % r0
            java.lang.String r0 = ""
            return r0
        L36:
            java.lang.String r0 = r3.getScreenName()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.setEngagementSignalsCallback():java.lang.String");
    }

    public static final class asInterface implements DynamicFromArrayCompanion.onExtraCallbackWithResult {
        asInterface() {
        }

        @Override // o.DynamicFromArrayCompanion.onExtraCallbackWithResult
        public String onExtraCallbackWithResult() {
            String strIAuthTabCallback = createPaints.IAuthTabCallback.IAuthTabCallback();
            if (strIAuthTabCallback.length() <= 0) {
                strIAuthTabCallback = null;
            }
            if (strIAuthTabCallback != null) {
                return strIAuthTabCallback;
            }
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            return (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        }

        @Override // o.DynamicFromArrayCompanion.onExtraCallbackWithResult
        public String onNavigationEvent() {
            Object obj;
            String strOnNavigationEvent = createPaints.IAuthTabCallback.onNavigationEvent();
            if (strOnNavigationEvent.length() <= 0) {
                strOnNavigationEvent = null;
            }
            if (strOnNavigationEvent != null) {
                return strOnNavigationEvent;
            }
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(StringsKt.takeLast(PlayerErrorCode.extraCallback(), 6));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(obj) != null) {
                obj = "";
            }
            return (String) obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r3 = 38 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r3.RemoteActionCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r3.write() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r3.write() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3.ITrustedWebActivityServiceStubProxy();
        r3 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel + 53;
        viva.republica.toss.guest.CreatePasswordActivity.prefetch = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onUnminimized(viva.republica.toss.guest.CreatePasswordActivity r3) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.CreatePasswordActivity.prefetch
            int r1 = r1 + 73
            int r2 = r1 % 128
            viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = r3.write()
            r2 = 20
            int r2 = r2 / 0
            if (r1 == 0) goto L32
            goto L1f
        L19:
            boolean r1 = r3.write()
            if (r1 == 0) goto L32
        L1f:
            r3.ITrustedWebActivityServiceStubProxy()
            int r3 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r3 = r3 + 53
            int r1 = r3 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L31
            r3 = 38
            int r3 = r3 / 0
        L31:
            return
        L32:
            r3.RemoteActionCompatParcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onUnminimized(viva.republica.toss.guest.CreatePasswordActivity):void");
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetch + 19;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = prefetch + 83;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 113;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // viva.republica.toss.guest.Hilt_CreatePasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyNotificationWithChannel() {
        int i = 2 % 2;
        int i2 = prefetch + 97;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        overridePendingTransition(0, 0);
        setRequestedOrientation(1);
        getWindow().setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 29) {
            int i4 = ICustomTabsCallback_Parcel + 29;
            prefetch = i4 % 128;
            int i5 = i4 % 2;
            getWindow().setNavigationBarContrastEnforced(false);
        }
        getWindow().setStatusBarColor(0);
        View viewFindViewById = findViewById(viva.republica.toss.R.id.app_bar_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setVisibility(8);
        RepeatableSpec.onExtraCallbackWithResult(getWindow(), false);
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        long jLongValue;
        int i = 2 % 2;
        int i2 = prefetch + 99;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("EXTRA_SIGN_UP", this.ICustomTabsCallbackStub);
        Object[] objArr = new Object[1];
        c(new byte[]{-111, -114, -118, -112, -113, -114, -115, -115, -123, -115, -118, -121, -115, -123, -116, -117, -118, -119, -120, -121, -122, -123}, null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026391).substring(0, 11).codePointAt(2) + 91, objArr);
        bundle.putLong(((String) objArr[0]).intern(), this.getInterfaceDescriptor);
        Long l = this.access100;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            int i4 = prefetch + 61;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            jLongValue = 0;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{17915, 43451, 40272, 33019, 62603, 55344, 53206, 13152, 10008, 2741, 32345, 25101, 20925, 17742, 43244}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031232).substring(0, 2).codePointAt(1) + 60394, objArr2);
        bundle.putLong(((String) objArr2[0]).intern(), jLongValue);
        bundle.putString("EXTRA_REFERRER", this.onPostMessage);
        Object[] objArr3 = new Object[1];
        a(new char[]{17915, 10427, 40784, 3579, 61579, 26416, 54745, 47206, 12041, 40365, 'Y', 63251, 26027, 51265, 48865, 11656, 36906, 1740, 62840, 22550, 52925, 48470, 8206, 38586, 1362, 60388, 24199, 52532, 46044}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 27978, objArr3);
        bundle.putBoolean(((String) objArr3[0]).intern(), this.writeTypedObject);
        bundle.putSerializable("EXTRA_LOGIN_TOKEN_CONSENT_TYPE", this.onActivityLayout);
        Object[] objArr4 = new Object[1];
        c(new byte[]{-120, -113, -121, -114, -115, -114, -110, -118, -115, -114, -118, -119, -120, -121, -122, -123}, null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) + 12, objArr4);
        bundle.putBoolean(((String) objArr4[0]).intern(), this.extraCallback);
        Long l2 = this.ICustomTabsCallbackDefault;
        bundle.putLong("EXTRA_VISITOR_SELFIE_SESSION_ID", l2 != null ? l2.longValue() : 0L);
    }

    @Override // viva.republica.toss.guest.Hilt_CreatePasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStart();
            if (ICustomTabsServiceDefault().AudioAttributesImplApi21Parcelizer()) {
                onExtraCallback("impression__enrollment_password_input_type_check", (Function1<? super SetDetectableSize, Unit>) new CreatePasswordActivity$.ExternalSyntheticLambda2());
                int i3 = prefetch + 27;
                ICustomTabsCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        super.onStart();
        ICustomTabsServiceDefault().AudioAttributesImplApi21Parcelizer();
        throw null;
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        String logValue;
        int i = 2 % 2;
        int i2 = prefetch + 17;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        IndicatorView indicatorViewAccess100 = createPaints.IAuthTabCallback.access100();
        if (indicatorViewAccess100 != null) {
            int i4 = prefetch + 115;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            logValue = indicatorViewAccess100.getLogValue();
        } else {
            logValue = null;
        }
        setDetectableSize.onExtraCallback("input_type", logValue);
        return Unit.INSTANCE;
    }

    private final boolean write() {
        int i = 2 % 2;
        if (this.ICustomTabsCallbackStub) {
            return false;
        }
        int i2 = prefetch + 101;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (ITrustedWebActivityService() != asArray.PW_6_DIGIT) {
            return false;
        }
        int i4 = prefetch + 35;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return ((asArray) onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this}, -1715855679, R.drawable.IAuthTabCallback(), 1715855681)) != ITrustedWebActivityService();
        }
        ITrustedWebActivityService();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void RemoteActionCompatParcelizer() throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r1 = r1 + 89
            int r2 = r1 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L25
            o.CERT_VerifyVID r1 = r9.IPostMessageServiceDefault()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.getRoot()
            r9.setContentView(r1)
            boolean r1 = r9.getSmallIconId()
            r3 = 56
            int r3 = r3 / 0
            if (r1 == r2) goto L5d
            goto L38
        L25:
            o.CERT_VerifyVID r1 = r9.IPostMessageServiceDefault()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.getRoot()
            r9.setContentView(r1)
            boolean r1 = r9.getSmallIconId()
            r1 = r1 ^ r2
            if (r1 == r2) goto L38
            goto L5d
        L38:
            o.CERT_VerifyVID r1 = r9.IPostMessageServiceDefault()
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.getRoot()
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            o.CERT_VerifyVID r1 = r9.IPostMessageServiceDefault()
            im.toss.uikit.widget.AppBarLayout r3 = r1.onNavigationEvent
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            o.disableImageViewPreallocationAndroid.onNavigationEvent(r2, r3, r4, r5, r6, r7, r8)
            int r1 = viva.republica.toss.guest.CreatePasswordActivity.prefetch
            int r1 = r1 + 113
            int r2 = r1 % 128
            viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel = r2
            int r1 = r1 % r0
        L5d:
            r9.getActiveNotifications()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.RemoteActionCompatParcelizer():void");
    }

    public static final class IAuthTabCallback implements PasswordFragment.onWarmupCompleted {
        final /* synthetic */ CreatePasswordActivity onNavigationEvent;
        final /* synthetic */ PasswordFragment onWarmupCompleted;

        IAuthTabCallback(CreatePasswordActivity createPasswordActivity, PasswordFragment passwordFragment) {
            this.onNavigationEvent = createPasswordActivity;
            this.onWarmupCompleted = passwordFragment;
        }

        @Override // viva.republica.toss.password.PasswordFragment.onWarmupCompleted
        public void onWarmupCompleted(final GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, String str, String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
            DynamicFromArrayCompanion dynamicFromArrayCompanion = DynamicFromArrayCompanion.onExtraCallbackWithResult;
            asArray asarrayAccess000 = CreatePasswordActivity.access000(CreatePasswordActivity.this);
            CreatePasswordActivity createPasswordActivity = this.onNavigationEvent;
            Object[] objArr = {CreatePasswordActivity.this};
            wasLastName waslastnameOnExtraCallback = DynamicFromArrayCompanion.onExtraCallback(dynamicFromArrayCompanion, asarrayAccess000, graniteBrownfieldModule_closeView, createPasswordActivity, Long.valueOf(((Long) CreatePasswordActivity.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 2394694, R.drawable.IAuthTabCallback(), -2394678)).longValue()), null, 16, null);
            final CreatePasswordActivity createPasswordActivity2 = CreatePasswordActivity.this;
            deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.CreatePasswordActivity$initLayout$2$1$$ExternalSyntheticLambda0
                public final void run() {
                    CreatePasswordActivity.IAuthTabCallback.onWarmupCompleted(createPasswordActivity2, graniteBrownfieldModule_closeView);
                }
            };
            final PasswordFragment passwordFragment = this.onWarmupCompleted;
            final CreatePasswordActivity createPasswordActivity3 = CreatePasswordActivity.this;
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.CreatePasswordActivity$initLayout$2$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return CreatePasswordActivity.IAuthTabCallback.onWarmupCompleted(passwordFragment, createPasswordActivity3, (Throwable) obj);
                }
            };
            waslastnameOnExtraCallback.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: viva.republica.toss.guest.CreatePasswordActivity$initLayout$2$1$$ExternalSyntheticLambda2
                public final void accept(Object obj) {
                    CreatePasswordActivity.IAuthTabCallback.onExtraCallback(function1, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onWarmupCompleted(CreatePasswordActivity createPasswordActivity, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
            CreatePasswordActivity.onNavigationEvent(createPasswordActivity, new GraniteBrownfieldModule_closeView(graniteBrownfieldModule_closeView));
            FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4IAuthTabCallback = createPasswordActivity.getSupportFragmentManager().onExtraCallbackWithResult().onExtraCallback(viva.republica.toss.R.anim.slide_in_left, viva.republica.toss.R.anim.slide_out_left, viva.republica.toss.R.anim.slide_in_right, viva.republica.toss.R.anim.slide_out_right).IAuthTabCallback("confirm");
            int i = viva.republica.toss.R.id.password_setting_container;
            Fragment fragmentAsBinder = CreatePasswordActivity.asBinder(createPasswordActivity);
            if (fragmentAsBinder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentAsBinder = null;
            }
            flowRowOverflowCompanionExternalSyntheticLambda4IAuthTabCallback.onExtraCallback(i, fragmentAsBinder, "confirm").onExtraCallbackWithResult();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallback(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit onWarmupCompleted(PasswordFragment passwordFragment, CreatePasswordActivity createPasswordActivity, Throwable th) throws Throwable {
            isOneShot.onExtraCallbackWithResult(passwordFragment, noStore.Companion.onWarmupCompleted());
            String string = passwordFragment.getString(viva.republica.toss.R.string.create_password_another_password);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Intrinsics.checkNotNull(th);
            passwordFragment.onNavigationEvent(string, accesssetMapp.onWarmupCompleted(th, createPasswordActivity));
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackStub implements PasswordFragment.onWarmupCompleted {
        final /* synthetic */ PasswordFragment onExtraCallback;

        IAuthTabCallbackStub(PasswordFragment passwordFragment) {
            this.onExtraCallback = passwordFragment;
        }

        @Override // viva.republica.toss.password.PasswordFragment.onWarmupCompleted
        public void onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, String str, String str2, boolean z2) throws Throwable {
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
            Object[] objArr = {CreatePasswordActivity.this};
            PasswordFragment passwordFragment = null;
            if (Arrays.equals(((GraniteBrownfieldModule_closeView) CreatePasswordActivity.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -1466573771, R.drawable.IAuthTabCallback(), 1466573772)).onWarmupCompleted(), graniteBrownfieldModule_closeView.onWarmupCompleted())) {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 30, 24887 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -265239605, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(256741507);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29, Drawable.resolveOpacity(0, 0) + 24887, 1041067539, false, "onExtraCallbackWithResult", new Class[0]);
                    }
                    ((Method) objOnExtraCallback2).invoke(obj, null);
                    if (CreatePasswordActivity.extraCallback(CreatePasswordActivity.this)) {
                        Object[] objArr2 = {CreatePasswordActivity.this};
                        CreatePasswordActivity.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, 999988762, R.drawable.IAuthTabCallback(), -999988758);
                        return;
                    }
                    CreatePasswordActivity.IAuthTabCallback(CreatePasswordActivity.this, graniteBrownfieldModule_closeView, z);
                    return;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            isOneShot.onExtraCallbackWithResult(this.onExtraCallback, noStore.Companion.onWarmupCompleted());
            PasswordFragment passwordFragmentAsBinder = CreatePasswordActivity.asBinder(CreatePasswordActivity.this);
            if (passwordFragmentAsBinder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                passwordFragment = passwordFragmentAsBinder;
            }
            String string = this.onExtraCallback.getString(viva.republica.toss.R.string.create_password_wrong_password_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = this.onExtraCallback.getString(viva.republica.toss.R.string.create_password_wrong_password_subtitle);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            passwordFragment.onNavigationEvent(string, string2);
        }
    }

    private static final void onMinimized(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 3;
        ICustomTabsCallback_Parcel = i2 % 128;
        LoginBaseActivity.onExtraCallback(createPasswordActivity, null, i2 % 2 == 0 ? createPasswordActivity.getSupportFragmentManager().extraCallbackWithResult() == 1 : createPasswordActivity.getSupportFragmentManager().extraCallbackWithResult() == 0, 1, null);
        int i3 = prefetch + 125;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void getActiveNotifications() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.getActiveNotifications():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityServiceStubProxy() {
        int i = 2 % 2;
        this.ICustomTabsCallback.onNavigationEvent(new Intent((Context) this, (Class<?>) CreatePasswordIntroActivity.class));
        int i2 = prefetch + 75;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public boolean bg_() {
        UTF8Decoder uTF8Decoder;
        int i = 2 % 2;
        PasswordFragment passwordFragment = this.onMinimized;
        if (passwordFragment == null) {
            if (getSupportFragmentManager().extraCallbackWithResult() > 0) {
                return super.bg_();
            }
            ITrustedWebActivityCallbackStubProxy();
            return true;
        }
        int i2 = prefetch + 17;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        PasswordFragment passwordFragment2 = null;
        if (passwordFragment == null) {
            int i5 = i3 + 113;
            prefetch = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            passwordFragment = null;
        }
        if (((PasswordFragment.onNavigationEvent) PasswordFragment.onNavigationEvent(-853005714, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 853005718, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment})) == PasswordFragment.onNavigationEvent.CONFIRM) {
            int i7 = prefetch + 23;
            ICustomTabsCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            if (ITrustedWebActivityServiceStub() && !this.ICustomTabsCallbackStub) {
                uTF8Decoder = UTF8Decoder.SIGN_IN_RESET_GLOBAL;
            } else if (ITrustedWebActivityServiceStub()) {
                uTF8Decoder = UTF8Decoder.SIGN_UP_GLOBAL;
            } else if (read()) {
                uTF8Decoder = UTF8Decoder.SIGN_UP_WITH_CERT;
            } else {
                uTF8Decoder = UTF8Decoder.SIGN_UP;
                int i9 = ICustomTabsCallback_Parcel + 121;
                prefetch = i9 % 128;
                int i10 = i9 % 2;
            }
            PasswordFragment passwordFragment3 = this.onMinimized;
            if (passwordFragment3 == null) {
                int i11 = ICustomTabsCallback_Parcel + 41;
                prefetch = i11 % 128;
                if (i11 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                passwordFragment2 = passwordFragment3;
            }
            passwordFragment2.onExtraCallbackWithResult(PasswordFragment.onNavigationEvent.INPUT, uTF8Decoder);
            int i12 = prefetch + 71;
            ICustomTabsCallback_Parcel = i12 % 128;
            int i13 = i12 % 2;
        } else {
            ITrustedWebActivityCallbackStubProxy();
        }
        return true;
    }

    private final void onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), new onNavigationEvent(CoroutineExceptionHandler.extraCallbackWithResult, this), (setRandomHost) null, new onWarmupCompleted(z, graniteBrownfieldModule_closeView, null), 2, (Object) null);
        int i2 = prefetch + 93;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ GraniteBrownfieldModule_closeView $inputPassword;
        final /* synthetic */ boolean $needFingerprintRegister;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        boolean Z$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(boolean z, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$needFingerprintRegister = z;
            this.$inputPassword = graniteBrownfieldModule_closeView;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CreatePasswordActivity.this.new onWarmupCompleted(this.$needFingerprintRegister, this.$inputPassword, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        
            if (r4 != r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0154, code lost:
        
            if (viva.republica.toss.guest.CreatePasswordActivity.onExtraCallback(r10, (o.access13800) r24) == r0) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010d A[Catch: Exception -> 0x0046, CancellationException -> 0x0049, WebResourceResponseModel -> 0x004c, TryCatch #2 {Exception -> 0x0046, WebResourceResponseModel -> 0x004c, CancellationException -> 0x0049, blocks: (B:8:0x001c, B:48:0x015a, B:13:0x0041, B:39:0x00e4, B:41:0x010d, B:42:0x012b, B:44:0x0131, B:47:0x0157, B:35:0x00a6), top: B:58:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x012b A[Catch: Exception -> 0x0046, CancellationException -> 0x0049, WebResourceResponseModel -> 0x004c, TryCatch #2 {Exception -> 0x0046, WebResourceResponseModel -> 0x004c, CancellationException -> 0x0049, blocks: (B:8:0x001c, B:48:0x015a, B:13:0x0041, B:39:0x00e4, B:41:0x010d, B:42:0x012b, B:44:0x0131, B:47:0x0157, B:35:0x00a6), top: B:58:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x017f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ boolean $adjustNeedFingerprintRegister;
            final /* synthetic */ GraniteBrownfieldModule_closeView $inputPassword;
            final /* synthetic */ checkImageLoaded $onboardingConversionType;
            int label;
            final /* synthetic */ CreatePasswordActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(CreatePasswordActivity createPasswordActivity, checkImageLoaded checkimageloaded, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = createPasswordActivity;
                this.$onboardingConversionType = checkimageloaded;
                this.$inputPassword = graniteBrownfieldModule_closeView;
                this.$adjustNeedFingerprintRegister = z;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onNavigationEvent(this.this$0, this.$onboardingConversionType, this.$inputPassword, this.$adjustNeedFingerprintRegister, access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {this.this$0};
                    notifyVerticalEdgeReached notifyverticaledgereached = (notifyVerticalEdgeReached) CreatePasswordActivity.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 1652803685, R.drawable.IAuthTabCallback(), -1652803682);
                    BaseActivity baseActivity = this.this$0;
                    String strName = this.$onboardingConversionType.name();
                    Object[] objArr2 = {this.this$0};
                    long jLongValue = ((Long) CreatePasswordActivity.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, 2394694, R.drawable.IAuthTabCallback(), -2394678)).longValue();
                    GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$inputPassword;
                    boolean z = this.$adjustNeedFingerprintRegister;
                    Long lOnTransact = CreatePasswordActivity.onTransact(this.this$0);
                    String strIAuthTabCallbackStubProxy = CreatePasswordActivity.IAuthTabCallbackStubProxy(this.this$0);
                    Object[] objArr3 = {this.this$0};
                    boolean zBooleanValue = ((Boolean) CreatePasswordActivity.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr3, 5621707, R.drawable.IAuthTabCallback(), -5621700)).booleanValue();
                    getLogUploadURLMap getloguploadurlmapIAuthTabCallbackStub = CreatePasswordActivity.IAuthTabCallbackStub(this.this$0);
                    if (getloguploadurlmapIAuthTabCallbackStub == null) {
                        getloguploadurlmapIAuthTabCallbackStub = getLogUploadURLMap.None;
                    }
                    wasLastName waslastnameOnWarmupCompleted = notifyVerticalEdgeReached.onWarmupCompleted(notifyverticaledgereached, baseActivity, strName, jLongValue, graniteBrownfieldModule_closeView, z, lOnTransact, strIAuthTabCallbackStubProxy, zBooleanValue, false, getloguploadurlmapIAuthTabCallbackStub, CreatePasswordActivity.onActivityResized(this.this$0), CreatePasswordActivity.writeTypedObject(this.this$0), false, (writeRaw) null, 12544, (Object) null);
                    this.label = 1;
                    if (RxAwaitKt.onWarmupCompleted(waslastnameOnWarmupCompleted, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, viva.republica.toss.guest.CreatePasswordActivity] */
    private static /* synthetic */ Object access000(Object[] objArr) {
        long jLongValue;
        final ?? r0 = (CreatePasswordActivity) objArr[0];
        checkImageLoaded checkimageloaded = (checkImageLoaded) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (checkimageloaded == checkImageLoaded.SIGN_IN_WITH_RESET_PASSWORD) {
            int i4 = prefetch + 123;
            ICustomTabsCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                setTestMode.IAuthTabCallbackDefault();
                Long l = ((CreatePasswordActivity) r0).access100;
                obj.hashCode();
                throw null;
            }
            boolean zIAuthTabCallbackDefault = setTestMode.IAuthTabCallbackDefault();
            Long l2 = ((CreatePasswordActivity) r0).access100;
            if (l2 != null) {
                jLongValue = l2.longValue();
                int i5 = prefetch + 13;
                ICustomTabsCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = ICustomTabsCallback_Parcel + 83;
                prefetch = i7 % 128;
                int i8 = i7 % 2;
                jLongValue = 0;
            }
            Object[] objArr2 = {Boolean.valueOf(zIAuthTabCallbackDefault), Long.valueOf(jLongValue)};
            useSystemImageDecoderByte.onWarmupCompleted(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1582545112, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1582545111, objArr2, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        }
        final boolean zContains = clearFaultAdjacentMetadata.onExtraCallback(new checkImageLoaded[]{checkImageLoaded.SIGN_UP, checkImageLoaded.CROSS_REGION_SIGN_UP, checkImageLoaded.CROSS_REGION_SIGN_UP_WITH_RESET_PASSWORD}).contains(checkimageloaded);
        setBitmapDecoderFactory.IAuthTabCallback(r0, new Function0() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda4
            public final Object invoke() {
                Object[] objArr3 = {this.f$0, Boolean.valueOf(zContains)};
                return (Unit) CreatePasswordActivity.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr3, 1906511523, R.drawable.IAuthTabCallback(), -1906511512);
            }
        }, new Function0() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda5
            public final Object invoke() {
                return CreatePasswordActivity.onNavigationEvent(this.f$0, zContains);
            }
        });
        return null;
    }

    private static final Unit onExtraCallback(CreatePasswordActivity createPasswordActivity, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 61;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        createPasswordActivity.IAuthTabCallback(true, z);
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 45;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(CreatePasswordActivity createPasswordActivity, boolean z) {
        int i = 2 % 2;
        int i2 = prefetch + 51;
        ICustomTabsCallback_Parcel = i2 % 128;
        createPasswordActivity.IAuthTabCallback(i2 % 2 != 0, z);
        Unit unit = Unit.INSTANCE;
        int i3 = prefetch + 95;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r6) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
    
        if (onExtraCallbackWithResult((o.access13800<? super kotlin.Unit>) r3) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0159, code lost:
    
        if (onExtraCallbackWithResult((o.access13800<? super kotlin.Unit>) r3) != r5) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[Catch: Exception -> 0x014a, PHI: r0 r6
      0x00d6: PHI (r0v13 java.lang.Object) = (r0v12 java.lang.Object), (r0v24 java.lang.Object) binds: [B:36:0x00d4, B:27:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:36:0x00d4, B:27:0x007b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x014a, blocks: (B:24:0x0072, B:27:0x007b, B:37:0x00d6, B:40:0x0102, B:46:0x0135, B:42:0x0108, B:45:0x0117, B:28:0x0085, B:35:0x00c1, B:33:0x00b5), top: B:55:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135 A[Catch: Exception -> 0x014a, TRY_LEAVE, TryCatch #0 {Exception -> 0x014a, blocks: (B:24:0x0072, B:27:0x007b, B:37:0x00d6, B:40:0x0102, B:46:0x0135, B:42:0x0108, B:45:0x0117, B:28:0x0085, B:35:0x00c1, B:33:0x00b5), top: B:55:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(o.access13800<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onExtraCallback(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(checkImageLoaded checkimageloaded, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z) throws Throwable {
        getLogUploadURLMap getloguploadurlmap;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 107;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a(new char[]{17902, 22037, 25097, 32275, 2569, 9788, 12838, 52788, 55859, 63035, 33371, 40542, 43610, 18004, 21111, 28278, 31343, 5735, 8812, 16026, 51865, 59024, 62105, 36527, 39609, 46760, 17057, 24244, 27334, 1742}, ExpandableListView.getPackedPositionChild(0L) + 5114, objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), true);
        onVerticalScrollEvent().IAuthTabCallback(checkimageloaded.name());
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        notifyVerticalEdgeReached notifyverticaledgereached = (notifyVerticalEdgeReached) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, 1652803685, iIAuthTabCallback3, -1652803682);
        String strName = checkimageloaded.name();
        long j = this.getInterfaceDescriptor;
        Long l = this.access100;
        String str = this.onPostMessage;
        boolean z2 = this.writeTypedObject;
        getLogUploadURLMap getloguploadurlmap2 = this.onActivityLayout;
        if (getloguploadurlmap2 == null) {
            int i4 = ICustomTabsCallback_Parcel + 59;
            prefetch = i4 % 128;
            if (i4 % 2 == 0) {
                getLogUploadURLMap getloguploadurlmap3 = getLogUploadURLMap.None;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getloguploadurlmap = getLogUploadURLMap.None;
        } else {
            getloguploadurlmap = getloguploadurlmap2;
        }
        this.onTransact.onNavigationEvent(notifyVerticalEdgeReached.onExtraCallbackWithResult(notifyverticaledgereached, this, strName, j, graniteBrownfieldModule_closeView, z, l, str, z2, false, getloguploadurlmap, true, false, false, 6400, (Object) null));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context, viva.republica.toss.guest.CreatePasswordActivity] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ?? r5 = (CreatePasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 7;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.MediaMetadataCompat().onNavigationEvent("SHOULD_SHOW_EMAIL_PHONE_INPUT", true);
        getNavigationBar.IAuthTabCallback(r5.IPostMessageServiceStub().onExtraCallbackWithResult((Context) r5), (Context) r5);
        r5.finish();
        int i4 = prefetch + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsCallbackDefault(CreatePasswordActivity createPasswordActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getNavigationBar.IAuthTabCallback(createPasswordActivity.IPostMessageServiceStub().IAuthTabCallback(createPasswordActivity, false), createPasswordActivity);
        createPasswordActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 99;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(boolean r13, viva.republica.toss.guest.CreatePasswordActivity r14) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.CreatePasswordActivity.prefetch
            int r1 = r1 + 47
            int r2 = r1 % 128
            viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 95
            int r1 = r1 / r3
            if (r13 == 0) goto L18
            goto L66
        L16:
            if (r13 == r2) goto L66
        L18:
            java.lang.Object[] r7 = new java.lang.Object[]{r14}
            int r4 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r6 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r9 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r5 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            r10 = -1908841266(0xffffffff8e3964ce, float:-2.2851546E-30)
            r8 = 1908841271(0x71c69b37, float:1.9669016E30)
            java.lang.Object r13 = onNavigationEvent(r4, r5, r6, r7, r8, r9, r10)
            r4 = r13
            o.SessionTrackerb r4 = (o.SessionTrackerb) r4
            r13 = 16
            char[] r13 = new char[r13]
            r13 = {x0084: FILL_ARRAY_DATA , data: [17869, -13144, 22280, -9742, 24640, -5339, 32131, -31624, 3797, -28161, 6223, -23856, 13687, -16424, -14659, 18717} // fill-array
            r0 = 35171(0x8963, float:4.9285E-41)
            java.lang.String r1 = ""
            int r1 = android.text.TextUtils.indexOf(r1, r1, r3)
            int r1 = r1 + r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            a(r13, r1, r0)
            r13 = r0[r3]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r6 = r13.intern()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 60
            r12 = 0
            r5 = r14
            o.SessionTrackerb.IAuthTabCallback(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.finish()
            goto L81
        L66:
            o.isHttp r13 = r14.IPostMessageServiceStub()
            android.content.Intent r13 = r13.IAuthTabCallback(r14, r2)
            o.getNavigationBar.IAuthTabCallback(r13, r14)
            r14.finish()
            int r13 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r13 = r13 + 33
            int r14 = r13 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r14
            int r13 = r13 % r0
            if (r13 != 0) goto L81
            r13 = 3
            int r13 = r13 / r13
        L81:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onWarmupCompleted(boolean, viva.republica.toss.guest.CreatePasswordActivity):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(o.access13800<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r13 instanceof viva.republica.toss.guest.CreatePasswordActivity.IAuthTabCallbackDefault
            if (r1 == 0) goto L1f
            int r1 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r1 = r1 + 7
            int r2 = r1 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r2
            int r1 = r1 % r0
            r1 = r13
            viva.republica.toss.guest.CreatePasswordActivity$IAuthTabCallbackDefault r1 = (viva.republica.toss.guest.CreatePasswordActivity.IAuthTabCallbackDefault) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.label = r2
            goto L24
        L1f:
            viva.republica.toss.guest.CreatePasswordActivity$IAuthTabCallbackDefault r1 = new viva.republica.toss.guest.CreatePasswordActivity$IAuthTabCallbackDefault
            r1.<init>(r13)
        L24:
            java.lang.Object r13 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L59
            int r1 = viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.guest.CreatePasswordActivity.prefetch = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3d
            if (r3 != 0) goto L51
            goto L3f
        L3d:
            if (r3 != r4) goto L51
        L3f:
            int r2 = r2 + 47
            int r1 = r2 % 128
            viva.republica.toss.guest.CreatePasswordActivity.ICustomTabsCallback_Parcel = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L4c
            kotlin.ResultKt.onNavigationEvent(r13)
            goto L88
        L4c:
            kotlin.ResultKt.onNavigationEvent(r13)
            r13 = 0
            throw r13
        L51:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L59:
            kotlin.ResultKt.onNavigationEvent(r13)
            java.lang.Object[] r8 = new java.lang.Object[]{r12}
            int r5 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r7 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r10 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r6 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            r11 = 385711541(0x16fd7db5, float:4.0953687E-25)
            r9 = -385711532(0xffffffffe9028254, float:-9.860988E24)
            java.lang.Object r13 = onNavigationEvent(r5, r6, r7, r8, r9, r10, r11)
            o.getDummyAd r13 = (o.getDummyAd) r13
            r1.label = r4
            java.lang.String r0 = "STD_104_VISITOR_ONBOADING_AGREEMENT_GRADIENT"
            r3 = 0
            java.lang.Object r13 = r13.onExtraCallback(r0, r3, r1)
            if (r13 != r2) goto L88
            return r2
        L88:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda0 r0 = new viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda0
            r0.<init>()
            viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda1 r13 = new viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda1
            r13.<init>()
            o.setBitmapDecoderFactory.IAuthTabCallback(r12, r0, r13)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.CreatePasswordActivity.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityServiceDefault() throws Throwable {
        int i = 2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        ((SessionState) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, -1764287588, iIAuthTabCallback3, 1764287605)).IAuthTabCallback_Parcel();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 30 - Color.green(0), TextUtils.lastIndexOf("", '0') + 24888, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = null;
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(256741507);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 30, 24935 - AndroidCharacter.getMirror('0'), 1041067539, false, "onExtraCallbackWithResult", new Class[0]);
            }
            ((Method) objOnExtraCallback2).invoke(obj2, null);
            Intent intent = new Intent();
            Object[] objArr = new Object[1];
            a(new char[]{17915, 57197, 28924, 35405, 12243, 16726, 55986, 31798, 37297, 11010, 19584, 58886, 31593, 40162, 13939, 19412, 60764, 1729}, 39562 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
            Intent intentPutExtra = intent.putExtra(strIntern, ((GraniteBrownfieldModule_closeView) onNavigationEvent(iIAuthTabCallback4, R.drawable.IAuthTabCallback(), iIAuthTabCallback5, new Object[]{this}, 1153926833, iIAuthTabCallback6, -1153926825)).onWarmupCompleted());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            setResult(-1, intentPutExtra);
            finish();
            int i2 = ICustomTabsCallback_Parcel + 15;
            prefetch = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 93;
        prefetch = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.finish();
            if (getSmallIconId()) {
                overridePendingTransition(0, 0);
            }
            int i3 = prefetch + 33;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        super.finish();
        getSmallIconId();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 27;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        startActivity(((notifyVerticalEdgeReached) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, 1652803685, iIAuthTabCallback3, -1652803682)).onWarmupCompleted(this, GlobalOnboardingEventId.onExtraCallbackWithResult(this.getInterfaceDescriptor), z2, z));
        finish();
        int i4 = prefetch + 123;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackStub(Throwable th) {
        int i = 2 % 2;
        getParamImp.onWarmupCompleted(th, this, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        PasswordFragment passwordFragment = this.asBinder;
        PasswordFragment passwordFragment2 = null;
        if (passwordFragment != null) {
            if (passwordFragment == null) {
                int i2 = prefetch + 3;
                ICustomTabsCallback_Parcel = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragment = null;
            }
            passwordFragment.asInterface();
            int i3 = ICustomTabsCallback_Parcel + 27;
            prefetch = i3 % 128;
            int i4 = i3 % 2;
        }
        PasswordFragment passwordFragment3 = this.onMinimized;
        if (passwordFragment3 != null) {
            if (passwordFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                passwordFragment2 = passwordFragment3;
            }
            passwordFragment2.asInterface();
            int i5 = prefetch + 117;
            ICustomTabsCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 113;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        AppLovinError appLovinErrorOnExtraCallbackWithResult = AppLovinError.Companion.onExtraCallbackWithResult();
        if (i3 == 0) {
            appLovinErrorOnExtraCallbackWithResult.IAuthTabCallback(false);
            return null;
        }
        appLovinErrorOnExtraCallbackWithResult.IAuthTabCallback(true);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityService_Parcel() {
        int i = 2 % 2;
        Object[] objArr = {TdsDialogV1.Companion.onExtraCallback(this), Integer.valueOf(im.toss.core.R.drawable.img_popup_warning)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Object[] objArr2 = {(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, objArr, iOnExtraCallback), Integer.valueOf(viva.republica.toss.R.string.global_system_error_common_message)};
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -868633265, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 868633269, objArr2, iOnExtraCallback2), im.toss.uikit.R.string.uikit_confirm, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.guest.CreatePasswordActivity$$ExternalSyntheticLambda16
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) throws Throwable {
                CreatePasswordActivity.onWarmupCompleted(dialogInterface, i2);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).onNavigationEvent(false)).readTypedObject();
        int i2 = prefetch + 103;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreatePasswordActivity createPasswordActivity, boolean z) {
        Object[] objArr = {createPasswordActivity, Boolean.valueOf(z)};
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 1906511523, R.drawable.IAuthTabCallback(), -1906511512);
    }

    public static final /* synthetic */ long IAuthTabCallbackDefault(CreatePasswordActivity createPasswordActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return ((Long) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity}, 2394694, iIAuthTabCallback3, -2394678)).longValue();
    }

    public static final /* synthetic */ GraniteBrownfieldModule_closeView access100(CreatePasswordActivity createPasswordActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (GraniteBrownfieldModule_closeView) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity}, -1466573771, iIAuthTabCallback3, 1466573772);
    }

    public static final /* synthetic */ void extraCallbackWithResult(CreatePasswordActivity createPasswordActivity) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity}, 999988762, iIAuthTabCallback3, -999988758);
    }

    public static final /* synthetic */ boolean readTypedObject(CreatePasswordActivity createPasswordActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity}, 5621707, iIAuthTabCallback3, -5621700)).booleanValue();
    }

    public static final /* synthetic */ void onNavigationEvent(CreatePasswordActivity createPasswordActivity, checkImageLoaded checkimageloaded) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity, checkimageloaded}, -1221723723, iIAuthTabCallback3, 1221723735);
    }

    public static final /* synthetic */ Object IAuthTabCallback(CreatePasswordActivity createPasswordActivity, access13800 access13800Var) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity, access13800Var}, 1565704486, iIAuthTabCallback3, -1565704486);
    }

    private final asArray IPostMessageService() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (asArray) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, -1715855679, iIAuthTabCallback3, 1715855681);
    }

    private final GraniteBrownfieldModule_closeView ITrustedWebActivityCallback_Parcel() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (GraniteBrownfieldModule_closeView) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, 1153926833, iIAuthTabCallback3, -1153926825);
    }

    private static final boolean onActivityLayout(CreatePasswordActivity createPasswordActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{createPasswordActivity}, 1217584259, iIAuthTabCallback3, -1217584249)).booleanValue();
    }

    private final void onExtraCallback(checkImageLoaded checkimageloaded) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, checkimageloaded}, -1411322475, iIAuthTabCallback3, 1411322488);
    }

    private static final void IAuthTabCallback(DialogInterface dialogInterface, int i) throws Throwable {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -2060442221, R.drawable.IAuthTabCallback(), 2060442235);
    }

    private final void AudioAttributesImplApi21Parcelizer() throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, -1901360053, iIAuthTabCallback3, 1901360059);
    }

    private static final String IconCompatParcelizer() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[0], 958168555, iIAuthTabCallback3, -958168540);
    }

    public final notifyVerticalEdgeReached access200() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (notifyVerticalEdgeReached) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, 1652803685, iIAuthTabCallback3, -1652803682);
    }

    public final SessionState ICustomTabsServiceStubProxy() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (SessionState) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, -1764287588, iIAuthTabCallback3, 1764287605);
    }

    public final getDummyAd onGreatestScrollPercentageIncreased() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (getDummyAd) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, -385711532, iIAuthTabCallback3, 385711541);
    }

    public final SessionTrackerb onSessionEnded() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (SessionTrackerb) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, 1908841271, iIAuthTabCallback3, -1908841266);
    }

    @Override // viva.republica.toss.guest.Hilt_CreatePasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = prefetch + 29;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = prefetch + 13;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_CreatePasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = prefetch + 85;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = ICustomTabsCallback_Parcel + 61;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_CreatePasswordActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 29;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    static void IEngagementSignalsCallback_Parcel() {
        onRelationshipValidationResult = -7312457871776038775L;
        mayLaunchUrl = new char[]{32386, 32389, 32398, 32401, 32625, 32614, 32610, 32620, 32637, 32415, 32631, 32609, 32611, 32629, 32623, 32616, 32626, 32608};
        ICustomTabsService = -1184334018;
        extraCommand = true;
        isEngagementSignalsApiAvailable = true;
    }
}
