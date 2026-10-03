package viva.republica.toss.guest;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzaq;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.global.features.useronboarding.model.GlobalOnboardingEventId;
import im.toss.global.localization.domain.di.RegionDomainModuleKt;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.ACHttpProxyRequestInfo;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_ChangePrikeyPassword;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.IndicatorView;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UST_CMP_IssueCertificate;
import o.access15300;
import o.access8100;
import o.createPaints;
import o.getAdService;
import o.getCryptFailedReason;
import o.getDispatcherokhttp;
import o.getLogUploadURLMap;
import o.getMaxScale;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getPrivacyDestinationUri;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.getWrite;
import o.hasProvider;
import o.isHttp;
import o.readIntokhttp;
import o.setByteOrder;
import o.setTestMode;
import o.setVideoDuration;
import o.startRearDisplaySession;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.GuestBlockedActivity$;
import viva.republica.toss.guest.GuestPasswordResetActivity;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestBlockedActivity extends Hilt_GuestBlockedActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static int ICustomTabsCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static int onActivityResized = 0;
    private static int onMessageChannelReady = 1;
    private static long readTypedObject;
    private Long IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean access000;
    private int access100;
    private onExtraCallback asBinder;
    private long asInterface;
    private String extraCallback;
    private getLogUploadURLMap getInterfaceDescriptor;

    @Inject
    public ACHttpProxyRequestInfo globalOnboardingIntentProvider;

    @Inject
    public setVideoDuration kftcPasswordIntent;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackStub(this));

    @Inject
    public isHttp visitorOnboardingIntentProvider;
    private String writeTypedObject;

    static {
        setEngagementSignalsCallback();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = onActivityResized + 29;
        onMessageChannelReady = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GuestBlockedActivity guestBlockedActivity = (GuestBlockedActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(guestBlockedActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = extraCallbackWithResult + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(GuestBlockedActivity guestBlockedActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(guestBlockedActivity, setDetectableSize);
        int i4 = ICustomTabsCallback + 55;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(dialogInterface);
        int i4 = ICustomTabsCallback + 69;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(GuestBlockedActivity guestBlockedActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(guestBlockedActivity, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(GuestBlockedActivity guestBlockedActivity, SetDetectableSize setDetectableSize) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(guestBlockedActivity, setDetectableSize);
        }
        onWarmupCompleted(guestBlockedActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~((~i3) | i8);
        int i10 = i3 | i8;
        int i11 = i6 + i + i5 + ((-189913888) * i2) + ((-1809372279) * i4);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i6) - 1671495680) + (10634006 * i) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i5) + (952107008 * i2) + (1092222976 * i4) + ((-70844416) * i12);
        int i14 = (i6 * 986545540) + 223666697 + (i * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i5 * 986544659) + (i2 * 1843362976) + (i4 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        return i15 != 1 ? i15 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GuestBlockedActivity guestBlockedActivity = (GuestBlockedActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(guestBlockedActivity, dialogInterface);
        int i4 = extraCallbackWithResult + 67;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 69;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 21;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 1222259L;
    }

    public static final class IAuthTabCallbackStub implements Function0<CERT_ChangePrikeyPassword> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public IAuthTabCallbackStub(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CERT_ChangePrikeyPassword invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_ChangePrikeyPassword.IAuthTabCallback(layoutInflater);
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private final CERT_ChangePrikeyPassword ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CERT_ChangePrikeyPassword cERT_ChangePrikeyPassword = (CERT_ChangePrikeyPassword) this.onTransact.getValue();
        int i4 = extraCallbackWithResult + 19;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return cERT_ChangePrikeyPassword;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GuestBlockedActivity guestBlockedActivity = (GuestBlockedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 91;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        isHttp ishttp = guestBlockedActivity.visitorOnboardingIntentProvider;
        if (ishttp != null) {
            int i5 = i2 + 115;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return ishttp;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = extraCallbackWithResult + 85;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 85 / 0;
        }
        return null;
    }

    public final ACHttpProxyRequestInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 39;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        ACHttpProxyRequestInfo aCHttpProxyRequestInfo = this.globalOnboardingIntentProvider;
        if (aCHttpProxyRequestInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 113;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return aCHttpProxyRequestInfo;
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        hasProvider hasprovider;
        hasProvider hasprovider2;
        String str;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub2;
        int i = 2 % 2;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel = ICustomTabsServiceStub().onExtraCallbackWithResult.IAuthTabCallback_Parcel();
        if (getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel == null || (cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub2 = getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.IAuthTabCallbackStub()) == null) {
            hasprovider = null;
        } else {
            int i2 = ICustomTabsCallback + 57;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                hasprovider = (hasProvider) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub2.onExtraCallbackWithResult();
                int i3 = 70 / 0;
            } else {
                hasprovider = (hasProvider) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub2.onExtraCallbackWithResult();
            }
            int i4 = ICustomTabsCallback + 117;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr = new Object[1];
        a(new char[]{49426, 62960, 43244, 24567, 4863}, TextUtils.getTrimmedLength("") + 13567, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), hasprovider);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpOnTransact = ICustomTabsServiceStub().onExtraCallbackWithResult.onTransact();
        if (getminwebsocketmessagetocompressokhttpOnTransact == null || (cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub = getminwebsocketmessagetocompressokhttpOnTransact.IAuthTabCallbackStub()) == null) {
            hasprovider2 = null;
        } else {
            int i6 = ICustomTabsCallback + 37;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                hasprovider2 = (hasProvider) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub.onExtraCallbackWithResult();
                int i7 = 33 / 0;
            } else {
                hasprovider2 = (hasProvider) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallbackStub.onExtraCallbackWithResult();
            }
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{49410, 7894, 32447, 24186, 48704, 40486, 65512, 57281, 16295, 8052, 32602}, 57301 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), hasprovider2);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("login_yn", zzaz.onExtraCallbackWithResult(false));
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("requester_code", "TS-USI");
        IndicatorView indicatorViewAccess100 = createPaints.IAuthTabCallback.access100();
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("inflow_type", indicatorViewAccess100 != null ? indicatorViewAccess100.getLogValue() : null);
        if (setTestMode.IAuthTabCallbackDefault()) {
            str = "Y";
        } else {
            int i8 = ICustomTabsCallback + 33;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            str = "N";
        }
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback("6pin_yn", str)});
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 81;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (readTypedObject ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 59 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 6382 - ((byte) KeyEvent.getModifierMetaStateMask()), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 41;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0') + 60, TextUtils.lastIndexOf("", '0', 0, 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.guest.Hilt_GuestBlockedActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        getLogUploadURLMap getloguploadurlmap;
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(ICustomTabsServiceStub().getRoot());
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("EXTRA_BLOCK_TYPE");
            Intrinsics.checkNotNull(serializable, "");
            this.asBinder = (onExtraCallback) serializable;
            Object[] objArr = new Object[1];
            a(new char[]{49443, 46421, 10724, 40053, 4235, 34606, 31651, 61406, 25211, 55030, 19740, 49568, 46129, 10316, 40175, 4976, 34719, 31282, 61102, 25288, 55667, 19941}, 29804 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            this.asInterface = bundle.getLong(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(new char[]{49443, 3637, 24356, 44053, 64779, 51726, 7010, 26750, 47472, 34379, 55117, 9299, 30141, 17056, 37816}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022791).substring(0, 3).codePointAt(1) + 52886, objArr2);
            Long lValueOf = Long.valueOf(bundle.getLong(((String) objArr2[0]).intern(), 0L));
            if (lValueOf.longValue() == 0) {
                int i2 = extraCallbackWithResult + 27;
                ICustomTabsCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                lValueOf = null;
            }
            this.IAuthTabCallbackStub = lValueOf;
            this.extraCallback = bundle.getString("EXTRA_REFERRER");
            this.writeTypedObject = bundle.getString("EXTRA_PAUSE_REQUESTER_NAME", null);
            this.access100 = bundle.getInt("EXTRA_PASSWORD_FAIL_COUNT_LIMIT");
            Object[] objArr3 = new Object[1];
            a(new char[]{49443, 55007, 61168, 34455, 40611, 46684, 20073, 26130, 32305, 6105, 12265, 51103, 57251, 63309, 36705, 42764, 48946, 21704, 27896, 1178, 7349, 13402, 52350, 58382, 64554, 38352, 44535, 17816, 23988}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 6015, objArr3);
            this.IAuthTabCallbackStubProxy = bundle.getBoolean(((String) objArr3[0]).intern(), false);
            getLogUploadURLMap serializable2 = bundle.getSerializable("EXTRA_LOGIN_TOKEN_CONSENT_TYPE");
            this.getInterfaceDescriptor = serializable2 instanceof getLogUploadURLMap ? serializable2 : null;
            Object[] objArr4 = new Object[1];
            a(new char[]{49443, 44327, 6400, 34175, 28995, 56644, 18873, 13722, 41457, 3537, 63957, 25638, 53251, 48247, 10359, 37955}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 27654, objArr4);
            this.access000 = bundle.getBoolean(((String) objArr4[0]).intern());
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_BLOCK_TYPE");
            Intrinsics.checkNotNull(serializableExtra, "");
            this.asBinder = (onExtraCallback) serializableExtra;
            Intent intent = getIntent();
            Object[] objArr5 = new Object[1];
            a(new char[]{49443, 46421, 10724, 40053, 4235, 34606, 31651, 61406, 25211, 55030, 19740, 49568, 46129, 10316, 40175, 4976, 34719, 31282, 61102, 25288, 55667, 19941}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 29705, objArr5);
            this.asInterface = intent.getLongExtra(((String) objArr5[0]).intern(), 0L);
            Intent intent2 = getIntent();
            Object[] objArr6 = new Object[1];
            a(new char[]{49443, 3637, 24356, 44053, 64779, 51726, 7010, 26750, 47472, 34379, 55117, 9299, 30141, 17056, 37816}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 52984, objArr6);
            Long lValueOf2 = Long.valueOf(intent2.getLongExtra(((String) objArr6[0]).intern(), 0L));
            if (lValueOf2.longValue() == 0) {
                lValueOf2 = null;
            }
            this.IAuthTabCallbackStub = lValueOf2;
            this.extraCallback = getIntent().getStringExtra("EXTRA_REFERRER");
            this.writeTypedObject = getIntent().getStringExtra("EXTRA_PAUSE_REQUESTER_NAME");
            this.access100 = getIntent().getIntExtra("EXTRA_PASSWORD_FAIL_COUNT_LIMIT", 0);
            Intent intent3 = getIntent();
            Object[] objArr7 = new Object[1];
            a(new char[]{49443, 55007, 61168, 34455, 40611, 46684, 20073, 26130, 32305, 6105, 12265, 51103, 57251, 63309, 36705, 42764, 48946, 21704, 27896, 1178, 7349, 13402, 52350, 58382, 64554, 38352, 44535, 17816, 23988}, (KeyEvent.getMaxKeyCode() >> 16) + 6113, objArr7);
            this.IAuthTabCallbackStubProxy = intent3.getBooleanExtra(((String) objArr7[0]).intern(), false);
            getLogUploadURLMap serializableExtra2 = getIntent().getSerializableExtra("EXTRA_LOGIN_TOKEN_CONSENT_TYPE");
            if (serializableExtra2 instanceof getLogUploadURLMap) {
                int i3 = ICustomTabsCallback + 119;
                extraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                getloguploadurlmap = serializableExtra2;
            } else {
                getloguploadurlmap = null;
            }
            this.getInterfaceDescriptor = getloguploadurlmap;
            Intent intent4 = getIntent();
            Object[] objArr8 = new Object[1];
            a(new char[]{49443, 44327, 6400, 34175, 28995, 56644, 18873, 13722, 41457, 3537, 63957, 25638, 53251, 48247, 10359, 37955}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) + 27568, objArr8);
            this.access000 = intent4.getBooleanExtra(((String) objArr8[0]).intern(), false);
        }
        onExtraCallback onextracallback = this.asBinder;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback);
        TdsTopV2View tdsTopV2View = ICustomTabsServiceStub().onExtraCallbackWithResult;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(24);
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            int i4 = extraCallbackWithResult + 63;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr9 = new Object[1];
            a(new char[]{49422, 19975, 57144, 27689, 64833, 2613, 39735, 10458, 47549, 50863, 22485, 58613, 30195, 34068, 4718, 41769, 12377, 16752, 52847, 24519, 60587, 32178, 35463, 7145, 43249, 14367, 18736, 54840, 26447, 62580, 1341, 37518, 9129, 45246, 49601, 20182, 57340, 28480, 64541, 3367, 39516, 11092, 47206, 51660, 22216, 59386, 29907, 34253, 4857, 41495, 13138, 16419, 53585, 24144, 61286}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 36610, objArr9);
            getdispatcherokhttpAccess100.IAuthTabCallback(((String) objArr9[0]).intern());
            getdispatcherokhttpAccess100.onExtraCallbackWithResult(1);
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent());
            ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent())).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
        }
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        Intrinsics.checkNotNull(tdsTopV2View);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setTitleTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onUnminimized());
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setTitleText(onwarmupcompletedOnExtraCallbackWithResult.onExtraCallbackWithResult());
        tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        tdsTopV2View.setSubtitle2Text(onwarmupcompletedOnExtraCallbackWithResult.onNavigationEvent());
        ICustomTabsServiceStub().onExtraCallbackWithResult.setTitleText(onwarmupcompletedOnExtraCallbackWithResult.onExtraCallbackWithResult());
        ICustomTabsServiceStub().onExtraCallbackWithResult.setSubtitle2Text(onwarmupcompletedOnExtraCallbackWithResult.onNavigationEvent());
        TdsBottomCtaV1View tdsBottomCtaV1View = ICustomTabsServiceStub().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, onwarmupcompletedOnExtraCallbackWithResult.onExtraCallback(), new GuestBlockedActivity$.ExternalSyntheticLambda1(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
    }

    public static final class IAuthTabCallback {
        private static final byte[] $$a = {63, 67, 46, -88};
        private static final int $$b = 81;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onNavigationEvent = 1;
        private static int IAuthTabCallback = 478309040;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r7, byte r8, byte r9) {
            /*
                int r8 = r8 * 3
                int r8 = r8 + 1
                int r9 = r9 + 4
                byte[] r0 = viva.republica.toss.guest.GuestBlockedActivity.IAuthTabCallback.$$a
                int r7 = r7 * 3
                int r7 = r7 + 105
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2b
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r7 = r7 + r9
                r9 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestBlockedActivity.IAuthTabCallback.$$c(int, byte, byte):java.lang.String");
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 487
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestBlockedActivity.IAuthTabCallback.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Intent onNavigationEvent(IAuthTabCallback iAuthTabCallback, Context context, onExtraCallback onextracallback, long j, Long l, String str, String str2, Integer num, boolean z, getLogUploadURLMap getloguploadurlmap, boolean z2, int i, Object obj) throws Throwable {
            Integer num2;
            boolean z3;
            boolean z4;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 81;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            String str3 = (i & 32) != 0 ? null : str2;
            if ((i & 64) != 0) {
                int i6 = i4 + 59;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                num2 = null;
            } else {
                num2 = num;
            }
            if ((i & 128) != 0) {
                int i8 = i4 + 117;
                int i9 = i8 % 128;
                onNavigationEvent = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 23;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                z3 = false;
            } else {
                z3 = z;
            }
            getLogUploadURLMap getloguploadurlmap2 = (i & 256) != 0 ? null : getloguploadurlmap;
            if ((i & 512) != 0) {
                int i13 = onWarmupCompleted + 15;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 4 % 4;
                }
                z4 = false;
            } else {
                z4 = z2;
            }
            Intent intentIAuthTabCallback = iAuthTabCallback.IAuthTabCallback(context, onextracallback, j, l, str, str3, num2, z3, getloguploadurlmap2, z4);
            int i15 = onNavigationEvent + 99;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 == 0) {
                return intentIAuthTabCallback;
            }
            throw null;
        }

        @JvmStatic
        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull onExtraCallback onextracallback, long j, @Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable Integer num, boolean z, @Nullable getLogUploadURLMap getloguploadurlmap, boolean z2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intent intent = new Intent(context, (Class<?>) GuestBlockedActivity.class);
            intent.putExtra("EXTRA_BLOCK_TYPE", onextracallback);
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.makeMeasureSpec(0, 0) + 22, '7' - AndroidCharacter.getMirror('0'), new char[]{4, 65530, 0, 65535, 16, 65530, 65525, 65526, '\t', 5, 3, 65522, 16, 65528, 6, 65526, 4, 5, 16, 4, 65526, 4}, false, 232 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            intent.putExtra(((String) objArr[0]).intern(), j);
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0') + 16, 3 - TextUtils.getOffsetAfter("", 0), new char[]{17, 65531, 65526, 65527, '\n', 6, 4, 65523, 17, 65528, 7, 0, 0, 65527, 65534}, false, 230 - ImageFormat.getBitsPerPixel(0), objArr2);
            intent.putExtra(((String) objArr2[0]).intern(), l);
            intent.putExtra("EXTRA_REFERRER", str);
            intent.putExtra("EXTRA_PAUSE_REQUESTER_NAME", str2);
            intent.putExtra("EXTRA_PASSWORD_FAIL_COUNT_LIMIT", num);
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getEdgeSlop() >> 16) + 29, 15 + (ViewConfiguration.getTouchSlop() >> 8), new char[]{65531, 65528, 65531, 4, 65527, '\b', 17, 5, 65531, 17, 65523, 4, 6, '\n', 65527, 0, 65527, 65533, 1, 6, 17, 0, 65531, 65529, 1, 65534, 17, 65526, 65527}, true, TextUtils.getCapsMode("", 0, 0) + 231, objArr3);
            intent.putExtra(((String) objArr3[0]).intern(), z);
            intent.putExtra("EXTRA_LOGIN_TOKEN_CONSENT_TYPE", (Serializable) getloguploadurlmap);
            Object[] objArr4 = new Object[1];
            a(AndroidCharacter.getMirror('0') - ' ', ImageFormat.getBitsPerPixel(0) + 5, new char[]{2, 4, '\b', 65525, 2, 65535, 4, 65529, 3, 65529, 6, 15, 3, 65529, 15, 65521}, true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 233, objArr4);
            intent.putExtra(((String) objArr4[0]).intern(), z2);
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.guest.GuestBlockedActivity r9, o.SetDetectableSize r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestBlockedActivity.onExtraCallbackWithResult(viva.republica.toss.guest.GuestBlockedActivity, o.SetDetectableSize):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(GuestBlockedActivity guestBlockedActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        guestBlockedActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:15994905")));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(GuestBlockedActivity guestBlockedActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(guestBlockedActivity.getString(R.string.guest_blocked_under_fourteen_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(guestBlockedActivity.getString(R.string.guest_blocked_under_fourteen_dialog_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.close, (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.guest_blocked_under_fourteen_dialog_positive_button_title, (TdsButtonV1View.asInterface) null, false, new GuestBlockedActivity$.ExternalSyntheticLambda0(guestBlockedActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallbackWithResult + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(GuestBlockedActivity guestBlockedActivity, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1222261L, false, (String) null, (Map) null, new GuestBlockedActivity$.ExternalSyntheticLambda4(guestBlockedActivity), 14, (Object) null);
        Object obj = null;
        LoginBaseActivity.onWarmupCompleted(guestBlockedActivity, "click__enrollment_additional_certification_cta", null, 2, null);
        if (getMaxScale.IAuthTabCallback.IAuthTabCallbackStub()) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(guestBlockedActivity, new GuestBlockedActivity$.ExternalSyntheticLambda5(guestBlockedActivity));
            return;
        }
        guestBlockedActivity.IAuthTabCallback(guestBlockedActivity.IAuthTabCallbackStubProxy);
        int i2 = ICustomTabsCallback + 73;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final onWarmupCompleted onExtraCallbackWithResult(onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int iIntValue;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult.onNavigationEvent[onextracallback.ordinal()];
        if (i2 == 1) {
            String strAsBinder = this.writeTypedObject;
            if (strAsBinder == null) {
                strAsBinder = "";
            }
            if (strAsBinder.length() == 0) {
                int i3 = extraCallbackWithResult + 41;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                strAsBinder = createPaints.IAuthTabCallback.asBinder();
            }
            String string = getString(R.string.guest_blocked_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string2 = getString(R.string.guest_blocked_paused_message);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String str = String.format(string2, Arrays.copyOf(new Object[]{strAsBinder}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String string3 = getString(R.string.guest_blocked_cta_title);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return new onWarmupCompleted(string, str, string3);
        }
        int i5 = ICustomTabsCallback;
        int i6 = i5 + 11;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = i5 + 59;
        extraCallbackWithResult = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            Integer.valueOf(this.access100).intValue();
            obj.hashCode();
            throw null;
        }
        Integer numValueOf = Integer.valueOf(this.access100);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i9 = ICustomTabsCallback + 123;
            extraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                numValueOf.intValue();
                throw null;
            }
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 5;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String string4 = getString(R.string.guest_blocked_invalid_password_title);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String str2 = String.format(string4, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        String string5 = getString(R.string.guest_blocked_invalid_password_message);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String str3 = String.format(string5, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        String string6 = getString(R.string.guest_blocked_cta_title);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        return new onWarmupCompleted(str2, str3, string6);
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        long jLongValue;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        onExtraCallback onextracallback = this.asBinder;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        bundle.putSerializable("EXTRA_BLOCK_TYPE", onextracallback);
        Object[] objArr = new Object[1];
        a(new char[]{49443, 46421, 10724, 40053, 4235, 34606, 31651, 61406, 25211, 55030, 19740, 49568, 46129, 10316, 40175, 4976, 34719, 31282, 61102, 25288, 55667, 19941}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 29691, objArr);
        bundle.putLong(((String) objArr[0]).intern(), this.asInterface);
        Long l = this.IAuthTabCallbackStub;
        if (l != null) {
            int i4 = extraCallbackWithResult + 107;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            jLongValue = l.longValue();
        } else {
            int i6 = extraCallbackWithResult + 79;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            jLongValue = 0;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{49443, 3637, 24356, 44053, 64779, 51726, 7010, 26750, 47472, 34379, 55117, 9299, 30141, 17056, 37816}, KeyEvent.getDeadChar(0, 0) + 53003, objArr2);
        bundle.putLong(((String) objArr2[0]).intern(), jLongValue);
        bundle.putString("EXTRA_REFERRER", this.extraCallback);
        bundle.putString("EXTRA_PAUSE_REQUESTER_NAME", this.writeTypedObject);
        bundle.putInt("EXTRA_PASSWORD_FAIL_COUNT_LIMIT", this.access100);
        Object[] objArr3 = new Object[1];
        a(new char[]{49443, 55007, 61168, 34455, 40611, 46684, 20073, 26130, 32305, 6105, 12265, 51103, 57251, 63309, 36705, 42764, 48946, 21704, 27896, 1178, 7349, 13402, 52350, 58382, 64554, 38352, 44535, 17816, 23988}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 6067, objArr3);
        bundle.putBoolean(((String) objArr3[0]).intern(), this.IAuthTabCallbackStubProxy);
        bundle.putSerializable("EXTRA_LOGIN_TOKEN_CONSENT_TYPE", this.getInterfaceDescriptor);
        Object[] objArr4 = new Object[1];
        a(new char[]{49443, 44327, 6400, 34175, 28995, 56644, 18873, 13722, 41457, 3537, 63957, 25638, 53251, 48247, 10359, 37955}, 27673 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        bundle.putBoolean(((String) objArr4[0]).intern(), this.access000);
    }

    @Override // viva.republica.toss.guest.Hilt_GuestBlockedActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        onExtraCallback("impression__enrollment_additional_certification_type_check", (Function1<? super SetDetectableSize, Unit>) new GuestBlockedActivity$.ExternalSyntheticLambda3(this));
        int i2 = extraCallbackWithResult + 7;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onWarmupCompleted(GuestBlockedActivity guestBlockedActivity, SetDetectableSize setDetectableSize) throws NoWhenBranchMatchedException {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 33;
        extraCallbackWithResult = i2 % 128;
        onExtraCallback onextracallback = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            onExtraCallback onextracallback2 = guestBlockedActivity.asBinder;
            onextracallback.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        onExtraCallback onextracallback3 = guestBlockedActivity.asBinder;
        if (onextracallback3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = ICustomTabsCallback + 19;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } else {
            onextracallback = onextracallback3;
        }
        int i5 = onExtraCallbackWithResult.onNavigationEvent[onextracallback.ordinal()];
        if (i5 != 1) {
            int i6 = ICustomTabsCallback + 89;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "invalid_password";
        } else {
            str = "paused";
        }
        setDetectableSize.onExtraCallback("cause", str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean bg_() {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.guest.GuestBlockedActivity$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return GuestBlockedActivity.onWarmupCompleted((CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i2 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            UST_CMP_IssueCertificate.onNavigationEvent(false, UST_CMP_IssueCertificate.onExtraCallback.LOGIN, "LOGIN_PASSWORD_ERROR_BLOCKED_EXIT", null, 1, 56, null);
        } else {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            UST_CMP_IssueCertificate.onNavigationEvent(false, UST_CMP_IssueCertificate.onExtraCallback.LOGIN, "LOGIN_PASSWORD_ERROR_BLOCKED_EXIT", null, 0, 25, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.blocked_alert_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.IAuthTabCallbackDefault(new Function1() { // from class: viva.republica.toss.guest.GuestBlockedActivity$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return GuestBlockedActivity.onExtraCallbackWithResult((DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2115179004, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -2115178997, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 35;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return unit;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback PAUSED = new onExtraCallback("PAUSED", 0);
        public static final onExtraCallback INVALID_PASSWORD = new onExtraCallback("INVALID_PASSWORD", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            return new onExtraCallback[]{PAUSED, INVALID_PASSWORD};
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallback valueOf(String str) {
            return (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
        }

        public static onExtraCallback[] values() {
            return (onExtraCallback[]) $VALUES.clone();
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        if (!this.access000) {
            if (!RegionDomainModuleKt.onExtraCallbackWithResult().onExtraCallback()) {
                LoginBaseActivity.onExtraCallbackWithResult(this, GuestPasswordResetActivity.onExtraCallbackWithResult.onExtraCallback(GuestPasswordResetActivity.Companion, this, true, this.asInterface, this.IAuthTabCallbackStub, this.extraCallback, z, false, false, this.getInterfaceDescriptor, false, 704, null), null, 2, null);
                return;
            }
            int i2 = extraCallbackWithResult + 27;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            LoginBaseActivity.onExtraCallbackWithResult(this, onNavigationEvent().onWarmupCompleted(this, GlobalOnboardingEventId.onExtraCallbackWithResult(this.asInterface), "GUEST_BLOCKED"), null, 2, null);
            return;
        }
        LoginBaseActivity.onExtraCallbackWithResult(this, ((isHttp) onWarmupCompleted(-100636438, getCryptFailedReason.onWarmupCompleted(), getCryptFailedReason.onWarmupCompleted(), new Object[]{this}, getCryptFailedReason.onWarmupCompleted(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 10714873, 100636439)).onExtraCallbackWithResult(this, this.asInterface), null, 2, null);
        int i4 = extraCallbackWithResult + 117;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(GuestBlockedActivity guestBlockedActivity, DialogInterface dialogInterface) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(1283704692, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback, new Object[]{guestBlockedActivity, dialogInterface}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -1283704690);
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuestBlockedActivity guestBlockedActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(303691938, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback, new Object[]{guestBlockedActivity, commonModule_setLeftEdgeTouchEnabled}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -303691938);
    }

    public final isHttp IAuthTabCallback() {
        return (isHttp) onWarmupCompleted(-100636438, getCryptFailedReason.onWarmupCompleted(), getCryptFailedReason.onWarmupCompleted(), new Object[]{this}, getCryptFailedReason.onWarmupCompleted(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 10714873, 100636439);
    }

    @Override // viva.republica.toss.guest.Hilt_GuestBlockedActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_GuestBlockedActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_GuestBlockedActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void setEngagementSignalsCallback() {
        readTypedObject = 1484728001057080401L;
    }
}
