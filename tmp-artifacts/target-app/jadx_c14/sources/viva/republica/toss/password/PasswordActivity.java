package viva.republica.toss.password;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.mbridge.msdk.config.component.status.StatusCpt$;
import im.toss.base.BaseActivity;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.state.spec.SessionState;
import im.toss.uikit.widget.AppBarLayout;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_IssueCertificate;
import o.CatalystInstanceImplIA;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.EmbeddingAdapterExternalSyntheticLambda2;
import o.EncoderImplExternalSyntheticLambda3;
import o.EncryptedContentInfoParser;
import o.ExternalOfferInformationDialogListener;
import o.GeckoHubImp;
import o.GraniteBrownfieldModule_closeView;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.IndicatorView;
import o.M_;
import o.MediaCodecInfoReportIncorrectInfoQuirk;
import o.RepeatableSpec;
import o.RightClickGesturesKtonRightClickDown2;
import o.SetDetectableSize;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UTF8Decoder;
import o._get_isNull_lambda0;
import o.access8100;
import o.accessMapSafely;
import o.asMaplambda6;
import o.clearWrite;
import o.createPaints;
import o.downloadZip;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.getWrite;
import o.isJacksonCreator;
import o.isNumber;
import o.isTransient;
import o.nSetPosition;
import o.onPageExit;
import o.r8lambda51JYeBdAqXViyypFWDJRrf3snFI;
import o.setTestMode;
import o.shortValue;
import o.startRearDisplaySession;
import o.zzad;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.password.PasswordActivity$;
import viva.republica.toss.password.PasswordFragment;
import viva.republica.toss.password.reset.PasswordResetIntroActivity;
import viva.republica.toss.widget.LockWheel;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
@EmbeddingAdapterExternalSyntheticLambda1
@EmbeddingAdapterExternalSyntheticLambda2
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordActivity extends Hilt_PasswordActivity implements SensorEventListener2, PasswordFragment.onExtraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int ICustomTabsCallback_Parcel = 1;
    private static char[] ICustomTabsService = null;
    public static final int asBinder;
    private static final String asInterface;
    private static long extraCommand = 0;
    private static char isEngagementSignalsApiAvailable = 0;
    private static int mayLaunchUrl = 0;
    private static int newAuthTabSession = 1;
    private static int newSessionWithExtras;
    private int ICustomTabsCallback;

    @Inject
    public zzad environments;

    @Inject
    public ExternalOfferInformationDialogListener globalResetPasswordIntentProvider;
    private PasswordFragment onActivityLayout;
    private Sensor onActivityResized;
    private SensorManager onMessageChannelReady;
    private int writeTypedObject;
    private final Lazy onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda4
        public final Object invoke() {
            return Boolean.valueOf(PasswordActivity.IAuthTabCallbackStub(this.f$0));
        }
    });
    private final Lazy onPostMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda10
        public final Object invoke() {
            return PasswordActivity.onTransact(this.f$0);
        }
    });
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda11
        public final Object invoke() {
            return Long.valueOf(PasswordActivity.IAuthTabCallbackDefault(this.f$0));
        }
    });
    private final Lazy ICustomTabsCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda12
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return Boolean.valueOf(((Boolean) PasswordActivity.IAuthTabCallback(1110524262, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1110524245, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue());
        }
    });
    private final Lazy access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda13
        public final Object invoke() {
            return Boolean.valueOf(PasswordActivity.asBinder(this.f$0));
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda14
        public final Object invoke() {
            return PasswordActivity.IAuthTabCallback_Parcel(this.f$0);
        }
    });
    private final Lazy ICustomTabsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda15
        public final Object invoke() {
            return PasswordActivity.IAuthTabCallbackStubProxy(this.f$0);
        }
    });
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda16
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return (String) PasswordActivity.IAuthTabCallback(1868421319, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1868421303, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
    });
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda17
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return Boolean.valueOf(((Boolean) PasswordActivity.IAuthTabCallback(-320872855, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 320872859, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue());
        }
    });
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda18
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return Boolean.valueOf(((Boolean) PasswordActivity.IAuthTabCallback(122075406, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -122075394, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue());
        }
    });
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda5
        public final Object invoke() {
            return Boolean.valueOf(PasswordActivity.onExtraCallback(this.f$0));
        }
    });
    private final Lazy extraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda6
        public final Object invoke() {
            return Boolean.valueOf(PasswordActivity.onWarmupCompleted(this.f$0));
        }
    });
    private final Lazy ICustomTabsCallbackStubProxy = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(PasswordVerifyViewModel.class), new IAuthTabCallbackStub(this), new IAuthTabCallbackDefault(this), new onTransact(null, this));
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asInterface(this));
    private final Lazy readTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda7
        public final Object invoke() {
            return Boolean.valueOf(PasswordActivity.access000(this.f$0));
        }
    });
    private Handler onMinimized = new Handler(Looper.getMainLooper());
    private final IEngagementSignalsCallback_Parcel<Intent> onRelationshipValidationResult = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda8
        public final Object invoke(Object obj) {
            return PasswordActivity.onWarmupCompleted(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> access100 = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda9
        public final Object invoke(Object obj) {
            return PasswordActivity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static final /* synthetic */ class onExtraCallbackWithResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 onWarmupCompleted;

        onExtraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.onWarmupCompleted;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.onWarmupCompleted.invoke(obj);
        }
    }

    static {
        IEngagementSignalsCallback();
        Object[] objArr = new Object[1];
        a(new char[]{1527, 23817, 46081, 3889, 26145}, TextUtils.indexOf("", "", 0) + 22769, objArr);
        asInterface = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        asBinder = 8;
        int i = newSessionWithExtras + 95;
        newAuthTabSession = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        boolean booleanExtra;
        boolean booleanExtra2;
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i3 | i2));
        int i11 = ~(i7 | i9);
        int i12 = i3 | i11;
        int i13 = (~(i2 | i)) | i11 | (~(i8 | i));
        int i14 = i + i3 + i5 + (296844165 * i6) + (1729652556 * i4);
        int i15 = i14 * i14;
        int i16 = ((i * 599922083) - 580124672) + (599922083 * i3) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i5) + ((-279707648) * i6) + ((-265289728) * i4) + (2117271552 * i15);
        int i17 = (i * (-1181628991)) + 1322814002 + (i3 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i5 * (-1181629109)) + (i6 * (-698251017)) + (i4 * 1773125444) + (i15 * 938541056);
        switch (i16 + (i17 * i17 * (-109772800))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                View view = (View) objArr[0];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallback_Parcel + 31;
                mayLaunchUrl = i19 % 128;
                int i20 = i19 % 2;
                Unit unitAsInterface = asInterface(view);
                int i21 = mayLaunchUrl + 105;
                ICustomTabsCallback_Parcel = i21 % 128;
                int i22 = i21 % 2;
                return unitAsInterface;
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                BaseActivity baseActivity = (PasswordActivity) objArr[0];
                int i23 = 2 % 2;
                int i24 = ICustomTabsCallback_Parcel + 11;
                mayLaunchUrl = i24 % 128;
                if (i24 % 2 != 0) {
                    Intent intent = baseActivity.getIntent();
                    Object[] objArr2 = new Object[1];
                    c((byte) (54 >>> TextUtils.getCapsMode("", 0, 0)), (byte) KeyEvent.getModifierMetaStateMask(), new char[]{'(', 16, 24, '%', 0, 20, 27, '(', 16, 21, 20, '0', '#', 20, 27, '\r', '%', ',', 19, 7, '#', '&', 13824}, objArr2);
                    booleanExtra = intent.getBooleanExtra(((String) objArr2[0]).intern(), false);
                } else {
                    Intent intent2 = baseActivity.getIntent();
                    Object[] objArr3 = new Object[1];
                    c((byte) (TextUtils.getCapsMode("", 0, 0) + 34), ((byte) KeyEvent.getModifierMetaStateMask()) + 24, new char[]{'(', 16, 24, '%', 0, 20, 27, '(', 16, 21, 20, '0', '#', 20, 27, '\r', '%', ',', 19, 7, '#', '&', 13824}, objArr3);
                    booleanExtra = intent2.getBooleanExtra(((String) objArr3[0]).intern(), false);
                }
                return Boolean.valueOf(booleanExtra);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
                int i25 = 2 % 2;
                if (!((Boolean) objArr[1]).booleanValue()) {
                    passwordActivity.bo_();
                } else {
                    int i26 = mayLaunchUrl + 99;
                    ICustomTabsCallback_Parcel = i26 % 128;
                    if (i26 % 2 == 0) {
                        BaseActivity.IAuthTabCallback(passwordActivity, (String) null, true, 5, (Object) null);
                    } else {
                        BaseActivity.IAuthTabCallback(passwordActivity, (String) null, false, 3, (Object) null);
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i27 = mayLaunchUrl + 9;
                ICustomTabsCallback_Parcel = i27 % 128;
                int i28 = i27 % 2;
                return unit;
            case 12:
                return IAuthTabCallbackStub(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                BaseActivity baseActivity2 = (PasswordActivity) objArr[0];
                int i29 = 2 % 2;
                int i30 = mayLaunchUrl + 15;
                ICustomTabsCallback_Parcel = i30 % 128;
                int i31 = i30 % 2;
                Intent intent3 = baseActivity2.getIntent();
                char[] cArr = {1492, 40116, 14143, 51636, 24612, 64191, 40249, 14248, 52790, 24761, 64300, 40323, 13324, 52865, 24841, 64413, 37376, 13471, 53007, 24991, 63491, 37529, 13691, 53235};
                if (i31 == 0) {
                    Object[] objArr4 = new Object[1];
                    a(cArr, ((Process.getThreadPriority(1) >> 35) - 70) * 39293, objArr4);
                    booleanExtra2 = intent3.getBooleanExtra(((String) objArr4[0]).intern(), true);
                } else {
                    Object[] objArr5 = new Object[1];
                    a(cArr, ((Process.getThreadPriority(0) + 20) >> 6) + 39293, objArr5);
                    booleanExtra2 = intent3.getBooleanExtra(((String) objArr5[0]).intern(), false);
                }
                int i32 = mayLaunchUrl + 73;
                ICustomTabsCallback_Parcel = i32 % 128;
                int i33 = i32 % 2;
                return Boolean.valueOf(booleanExtra2);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return access100(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 101;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnMinimized = onMinimized(passwordActivity);
        int i4 = ICustomTabsCallback_Parcel + 75;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnMinimized);
    }

    public static /* synthetic */ Unit IAuthTabCallback(PasswordActivity passwordActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 123;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(passwordActivity, iEngagementSignalsCallbackDefault);
        }
        onExtraCallbackWithResult(passwordActivity, iEngagementSignalsCallbackDefault);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ long IAuthTabCallbackDefault(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        long jOnMessageChannelReady = onMessageChannelReady(passwordActivity);
        int i4 = mayLaunchUrl + 17;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return jOnMessageChannelReady;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 89;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) IAuthTabCallback(1802557286, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1802557276, new Object[]{str, str2, commonModule_setLeftEdgeTouchEnabled}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        }
        Object[] objArr2 = {str, str2, commonModule_setLeftEdgeTouchEnabled};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 105;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(-1690996594, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1690996601, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
        int i4 = ICustomTabsCallback_Parcel + 39;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(PasswordActivity passwordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 99;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsService(passwordActivity);
        }
        ICustomTabsService(passwordActivity);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        Pair pair = (Pair) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 55;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordActivity, pair);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ String IAuthTabCallbackStubProxy(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 83;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(passwordActivity);
        int i4 = ICustomTabsCallback_Parcel + 51;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return strIsEngagementSignalsApiAvailable;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 41;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallbackWithResult(passwordActivity);
        }
        extraCallbackWithResult(passwordActivity);
        throw null;
    }

    public static /* synthetic */ shortValue.onNavigationEvent IAuthTabCallback_Parcel(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 101;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        shortValue.onNavigationEvent typedObject = readTypedObject(passwordActivity);
        int i4 = mayLaunchUrl + 11;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public static /* synthetic */ boolean access000(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 1;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnUnminimized = onUnminimized(passwordActivity);
        int i4 = ICustomTabsCallback_Parcel + 17;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return zOnUnminimized;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            extraCommand(passwordActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zExtraCommand = extraCommand(passwordActivity);
        int i3 = mayLaunchUrl + 125;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zExtraCommand);
    }

    public static /* synthetic */ boolean asBinder(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 83;
        mayLaunchUrl = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onActivityResized(passwordActivity);
            obj.hashCode();
            throw null;
        }
        boolean zOnActivityResized = onActivityResized(passwordActivity);
        int i3 = mayLaunchUrl + 105;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnActivityResized;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 121;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(passwordActivity, str);
        }
        onWarmupCompleted(passwordActivity, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(PasswordActivity passwordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 123;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStub(passwordActivity);
        int i4 = mayLaunchUrl + 57;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordActivity passwordActivity, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 13;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(passwordActivity, bool);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordActivity passwordActivity, Unit unit) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 23;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(passwordActivity, unit);
        int i4 = mayLaunchUrl + 55;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordActivity passwordActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 77;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(passwordActivity, setDetectableSize);
        int i4 = mayLaunchUrl + 15;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ boolean onExtraCallback(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 123;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnPostMessage = onPostMessage(passwordActivity);
        int i4 = ICustomTabsCallback_Parcel + 59;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return zOnPostMessage;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(view);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(view);
        int i3 = ICustomTabsCallback_Parcel + 105;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordActivity passwordActivity) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 41;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-682779601, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 682779601, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        int i4 = mayLaunchUrl + 43;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 79;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, commonModule_setLeftEdgeTouchEnabled);
        int i4 = ICustomTabsCallback_Parcel + 25;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ UTF8Decoder onTransact(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 41;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        UTF8Decoder uTF8DecoderICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(passwordActivity);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 17;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return uTF8DecoderICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordActivity passwordActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 25;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {passwordActivity, bool};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(1529649172, iIAuthTabCallback, -1529649161, objArr, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback3);
        int i4 = mayLaunchUrl + 115;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordActivity passwordActivity, Unit unit) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 9;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordActivity, unit);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 29;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordActivity passwordActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 27;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(passwordActivity, iEngagementSignalsCallbackDefault);
        int i4 = mayLaunchUrl + 125;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordActivity passwordActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 61;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(passwordActivity, setDetectableSize);
        }
        onExtraCallbackWithResult(passwordActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(PasswordActivity passwordActivity) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 69;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(-1693298759, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1693298774, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
        int i4 = mayLaunchUrl + 95;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 75;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 33;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 103;
        mayLaunchUrl = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 41;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.hardware.SensorEventListener2
    public void onFlushCompleted(@Nullable Sensor sensor) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 13;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asInterface implements Function0<CMP_IssueCertificate> {
        final /* synthetic */ Activity IAuthTabCallback;

        public asInterface(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CMP_IssueCertificate invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_IssueCertificate.IAuthTabCallback(layoutInflater);
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public IAuthTabCallbackDefault(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.IAuthTabCallback.getDefaultViewModelProviderFactory();
        }
    }

    public static final /* synthetic */ void ICustomTabsCallback(PasswordActivity passwordActivity) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        passwordActivity.access200();
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void extraCallback(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 107;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        passwordActivity.getSmallIconId();
        if (i3 == 0) {
            throw null;
        }
        int i4 = mayLaunchUrl + 77;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ PasswordVerifyViewModel writeTypedObject(PasswordActivity passwordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 5;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) IAuthTabCallback(-1093452610, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1093452611, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        int i4 = ICustomTabsCallback_Parcel + 97;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            return passwordVerifyViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public /* bridge */ String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 5;
        mayLaunchUrl = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.setEngagementSignalsCallback();
            throw null;
        }
        String engagementSignalsCallback = super.setEngagementSignalsCallback();
        int i3 = mayLaunchUrl + 103;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return engagementSignalsCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public IAuthTabCallbackStub(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onNavigationEvent.getViewModelStore();
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
            int i3 = $10 + 41;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 24 - (ViewConfiguration.getTouchSlop() >> 8), 19627 - View.getDefaultSize(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (extraCommand ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 'k' - AndroidCharacter.getMirror('0'), 6383 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 113;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 59 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 6382 - TextUtils.indexOf((CharSequence) "", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = 79 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.alpha(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    public static final class onTransact implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 IAuthTabCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onTransact(Function0 function0, ComponentActivity componentActivity) {
            this.IAuthTabCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.IAuthTabCallback;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onWarmupCompleted.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    public final ExternalOfferInformationDialogListener validateRelationship() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ExternalOfferInformationDialogListener externalOfferInformationDialogListener = this.globalResetPasswordIntentProvider;
        if (externalOfferInformationDialogListener != null) {
            return externalOfferInformationDialogListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = ICustomTabsCallback_Parcel + 79;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return null;
    }

    public final zzad onNavigationEvent() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 41;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 105;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            return zzadVar;
        }
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 111;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            return "";
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 57;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ICustomTabsCallback_Parcel + 91;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
            return 1498525L;
        }
        Long.valueOf(1498525L);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean ICustomTabsService(PasswordActivity passwordActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 33;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        isJacksonCreator.onExtraCallback onextracallback = isJacksonCreator.Companion;
        if (i3 == 0) {
            return onextracallback.IAuthTabCallback(passwordActivity);
        }
        onextracallback.IAuthTabCallback(passwordActivity);
        throw null;
    }

    private final boolean ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 87;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onUnminimized.getValue()).booleanValue();
        int i4 = mayLaunchUrl + 53;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public String IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 105;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strIPostMessageServiceStubProxy = IPostMessageServiceStubProxy();
        int i4 = mayLaunchUrl + 63;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return strIPostMessageServiceStubProxy;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public String updateVisuals() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 123;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onVerticalScrollEvent();
            throw null;
        }
        String strOnVerticalScrollEvent = onVerticalScrollEvent();
        int i3 = mayLaunchUrl + 29;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return strOnVerticalScrollEvent;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public boolean IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zITrustedWebActivityServiceDefault = ITrustedWebActivityServiceDefault();
        int i4 = ICustomTabsCallback_Parcel + 69;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            return zITrustedWebActivityServiceDefault;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public boolean IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 109;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreNotificationsEnabled = areNotificationsEnabled();
        int i4 = ICustomTabsCallback_Parcel + 119;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return zAreNotificationsEnabled;
    }

    @Override // viva.republica.toss.password.PasswordFragment.onExtraCallback
    public Map<String, Object> ICustomTabsServiceStub() throws Throwable {
        String loginYN;
        String logValue;
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 79;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{1505, 42673, 17261, 60437, 35008, 13705, 54862, 29450}, Process.getGidForName("") + 41802, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), IPostMessageServiceStubProxy());
        Object[] objArr2 = new Object[1];
        a(new char[]{1511, 17989, 33417, 52967, 2852, 22390, 37851, 56381, 6221, 25781, 41203, 60723}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17333, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), _get_isNull_lambda0.onExtraCallbackWithResult.onWarmupCompleted());
        Object[] objArr3 = new Object[1];
        a(new char[]{1447, 53858, 43774, 33654, 23490, 12391, 2285}, View.getDefaultSize(0, 0) + 55171, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), zzaz.onExtraCallbackWithResult(setTestMode.IAuthTabCallbackDefault()));
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        if (indicatorViewAccess100 != null) {
            int i4 = mayLaunchUrl + 121;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            loginYN = indicatorViewAccess100.getLoginYN();
        } else {
            loginYN = null;
        }
        Object[] objArr4 = new Object[1];
        a(new char[]{1533, 29919, 59316, 22171, 49531, 12395, 41774, 4632}, 28961 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), loginYN);
        Object[] objArr5 = new Object[1];
        c((byte) (47 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 9, new char[]{4, 16, 13859, 13859, 14, 1, 20, '*', 13869}, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), Long.valueOf(IPostMessageServiceStub()));
        Object[] objArr6 = new Object[1];
        c((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 18 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{'*', '\r', 21, 14, '!', ' ', ',', '*', 1, 26, 19, 0, 17, 29, 21, '*', '/', 6}, objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), zzaz.onExtraCallbackWithResult(ITrustedWebActivityCallback()));
        Object[] objArr7 = new Object[1];
        c((byte) (Color.alpha(0) + 85), TextUtils.getTrimmedLength("") + 10, new char[]{22, 15, '&', 4, '#', 19, '/', 6, 3, 30}, objArr7);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), updateVisuals())});
        if (!(!setTestMode.IAuthTabCallbackDefault())) {
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                int i6 = ICustomTabsCallback_Parcel + 61;
                mayLaunchUrl = i6 % 128;
                if (i6 % 2 != 0) {
                    indicatorViewAccess1002.getLogValue();
                    throw null;
                }
                logValue = indicatorViewAccess1002.getLogValue();
            } else {
                logValue = null;
            }
            Object[] objArr8 = new Object[1];
            c((byte) (27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "") + 11, new char[]{'/', 6, 3, 1, 29, '-', 18, '#', 28, '*', 13849}, objArr8);
            mapIAuthTabCallback.put(((String) objArr8[0]).intern(), logValue);
            Object[] objArr9 = new Object[1];
            a(new char[]{1520, 23152, 47823, 6987, 31656, 55304, 14491, 39133, 63834, 22978, 48695}, (-16752747) - Color.rgb(0, 0, 0), objArr9);
            String strIntern = ((String) objArr9[0]).intern();
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, View.getDefaultSize(0, 0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 30, 24887 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                mapIAuthTabCallback.put(strIntern, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue() + 1));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return mapIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 9;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        UTF8Decoder uTF8Decoder = (UTF8Decoder) passwordActivity.onPostMessage.getValue();
        int i4 = mayLaunchUrl + 9;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return uTF8Decoder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final UTF8Decoder ICustomTabsCallbackStubProxy(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 5;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        Object[] objArr = new Object[1];
        c((byte) (80 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 3 - TextUtils.lastIndexOf("", '0'), new char[]{'#', 25, '$', 14}, objArr);
        UTF8Decoder uTF8DecoderOnExtraCallback = EncoderImplExternalSyntheticLambda3.onExtraCallback(intent, ((String) objArr[0]).intern(), UTF8Decoder.class);
        if (uTF8DecoderOnExtraCallback != null) {
            return uTF8DecoderOnExtraCallback;
        }
        int i4 = mayLaunchUrl + 83;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return UTF8Decoder.UNKNOWN;
    }

    private final long IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.IAuthTabCallback_Parcel.getValue()).longValue();
        int i4 = mayLaunchUrl + 89;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long onMessageChannelReady(PasswordActivity passwordActivity) throws Throwable {
        String strIntern;
        long j;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 73;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordActivity.getIntent();
        if (i3 != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{1492, 19806, 38123, 56326, 10124, 28477, 46685, 63973, 16743, 34960, 53298, 7072, 25306, 43635, 64919}, View.resolveSize(0, 0) * 25486, objArr);
            strIntern = ((String) objArr[0]).intern();
            j = 1;
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{1492, 19806, 38123, 56326, 10124, 28477, 46685, 63973, 16743, 34960, 53298, 7072, 25306, 43635, 64919}, 18583 - View.resolveSize(0, 0), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            j = 0;
        }
        return intent.getLongExtra(strIntern, j);
    }

    private final boolean ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 121;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) this.ICustomTabsCallbackDefault.getValue();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean extraCommand(PasswordActivity passwordActivity) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 61;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordActivity.getIntent();
        if (i3 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{1492, 15726, 29835, 44086, 59212, 7821, 22059, 35154, 49388, 63512, 13138, 27378, 41489, 58805, 7393, 21533, 36786, 50883, 65147}, 22930 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{1492, 15726, 29835, 44086, 59212, 7821, 22059, 35154, 49388, 63512, 13138, 27378, 41489, 58805, 7393, 21533, 36786, 50883, 65147}, 14504 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        boolean booleanExtra = intent.getBooleanExtra(((String) obj).intern(), false);
        int i4 = ICustomTabsCallback_Parcel + 9;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    private final boolean IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 19;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.access000.getValue()).booleanValue();
        int i4 = ICustomTabsCallback_Parcel + 95;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onActivityResized(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 125;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordActivity.getIntent();
        Object[] objArr = new Object[1];
        c((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63), TextUtils.getCapsMode("", 0, 0) + 24, new char[]{'(', 16, 24, '%', 0, 20, 19, 27, 21, 27, '#', '0', 20, 0, 16, 27, '&', '\'', 17, '#', '&', '#', ',', 30}, objArr);
        boolean booleanExtra = intent.getBooleanExtra(((String) objArr[0]).intern(), false);
        int i4 = mayLaunchUrl + 55;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return booleanExtra;
    }

    private final shortValue.onNavigationEvent onSessionEnded() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 99;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        shortValue.onNavigationEvent onnavigationevent = (shortValue.onNavigationEvent) this.IAuthTabCallbackDefault.getValue();
        int i4 = mayLaunchUrl + 49;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return onnavigationevent;
    }

    private final String IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 97;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.ICustomTabsCallbackStub.getValue();
        int i4 = mayLaunchUrl + 111;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String isEngagementSignalsApiAvailable(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 1;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordActivity.getIntent();
        Object[] objArr = new Object[1];
        a(new char[]{1492, 3086, 5707, 6294, 8908, 13613, 16238, 16821, 19424, 21034}, 2503 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = ICustomTabsCallback_Parcel + 89;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private final String onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 87;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackStub.getValue();
        int i4 = ICustomTabsCallback_Parcel + 85;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r7) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r1 = viva.republica.toss.password.PasswordActivity.mayLaunchUrl + 27;
        r3 = r1 % 128;
        viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel = r3;
        r1 = r1 % 2;
        r3 = r3 + 1;
        viva.republica.toss.password.PasswordActivity.mayLaunchUrl = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r7) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String extraCallbackWithResult(viva.republica.toss.password.PasswordActivity r7) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            android.content.Intent r7 = r7.getIntent()
            r1 = 0
            int r2 = android.graphics.drawable.Drawable.resolveOpacity(r1, r1)
            int r2 = 85 - r2
            byte r2 = (byte) r2
            double r3 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r1)
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 10
            int r3 = r3 + r4
            char[] r4 = new char[r4]
            r4 = {x0064: FILL_ARRAY_DATA , data: [22, 15, 38, 4, 35, 19, 47, 6, 3, 30} // fill-array
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            c(r2, r3, r4, r6)
            r2 = r6[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r7 = r7.getStringExtra(r2)
            r2 = 0
            if (r7 == 0) goto L62
            int r3 = viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel
            int r3 = r3 + 83
            int r4 = r3 % 128
            viva.republica.toss.password.PasswordActivity.mayLaunchUrl = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L49
            boolean r3 = kotlin.text.StringsKt.isBlank(r7)
            r4 = 96
            int r4 = r4 / r1
            if (r3 != 0) goto L62
            goto L4f
        L49:
            boolean r1 = kotlin.text.StringsKt.isBlank(r7)
            if (r1 != 0) goto L62
        L4f:
            int r1 = viva.republica.toss.password.PasswordActivity.mayLaunchUrl
            int r1 = r1 + 27
            int r3 = r1 % 128
            viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel = r3
            int r1 = r1 % r0
            int r3 = r3 + r5
            int r1 = r3 % 128
            viva.republica.toss.password.PasswordActivity.mayLaunchUrl = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L61
            return r7
        L61:
            throw r2
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordActivity.extraCallbackWithResult(viva.republica.toss.password.PasswordActivity):java.lang.String");
    }

    private final boolean areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 123;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallbackStubProxy.getValue()).booleanValue();
        int i4 = mayLaunchUrl + 67;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onMinimized(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 73;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordActivity.getIntent();
        if (i3 != 0) {
            Object[] objArr = new Object[1];
            c((byte) (29 - ExpandableListView.getPackedPositionChild(1L)), (PointF.length(1.0f, 1.0f) > 1.0f ? 1 : (PointF.length(1.0f, 1.0f) == 1.0f ? 0 : -1)) * 67, new char[]{'(', 16, 24, '%', 0, 20, 27, '(', 18, '*', 27, '\f', 2, ',', 24, '%', 23, '!', 19, 7, '#', '&', 13821}, objArr);
            return intent.getBooleanExtra(((String) objArr[0]).intern(), true);
        }
        Object[] objArr2 = new Object[1];
        c((byte) (30 - ExpandableListView.getPackedPositionChild(0L)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, new char[]{'(', 16, 24, '%', 0, 20, 27, '(', 18, '*', 27, '\f', 2, ',', 24, '%', 23, '!', 19, 7, '#', '&', 13821}, objArr2);
        return intent.getBooleanExtra(((String) objArr2[0]).intern(), false);
    }

    private final boolean ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 31;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.extraCallback.getValue()).booleanValue();
        int i4 = mayLaunchUrl + 1;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private final boolean IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 47;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.getInterfaceDescriptor.getValue()).booleanValue();
        int i4 = ICustomTabsCallback_Parcel + 77;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onPostMessage(PasswordActivity passwordActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 45;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordActivity.getIntent();
        Object[] objArr = new Object[1];
        a(new char[]{1492, 24046, 46475, 3510, 25932, 48397, 5427, 27841, 50407, 7306, 29787, 52345, 9242, 31802, 55282, 12171, 34738, 57169, 14176, 36646, 59097, 16125, 38553, 61013, 18026, 40475, 63027, 18899, 41370, 63919, 20823, 43387, 312, 22738, 45306}, 22568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        boolean booleanExtra = intent.getBooleanExtra(((String) objArr[0]).intern(), false);
        int i4 = mayLaunchUrl + 111;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    private final boolean ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 87;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            ((Boolean) this.extraCallbackWithResult.getValue()).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.extraCallbackWithResult.getValue()).booleanValue();
        int i3 = ICustomTabsCallback_Parcel + 57;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 85;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        PasswordVerifyViewModel passwordVerifyViewModel = (PasswordVerifyViewModel) passwordActivity.ICustomTabsCallbackStubProxy.getValue();
        int i4 = mayLaunchUrl + 13;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return passwordVerifyViewModel;
    }

    private final CMP_IssueCertificate writeTypedList() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 47;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CMP_IssueCertificate cMP_IssueCertificate = (CMP_IssueCertificate) this.onTransact.getValue();
        int i4 = ICustomTabsCallback_Parcel + 71;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return cMP_IssueCertificate;
    }

    private final boolean cancelNotification() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 71;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.readTypedObject.getValue()).booleanValue();
        int i4 = ICustomTabsCallback_Parcel + 105;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onUnminimized(PasswordActivity passwordActivity) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 75;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordActivity.getIntent();
        if (i3 != 0) {
            Object[] objArr = new Object[1];
            c((byte) ((ViewConfiguration.getWindowTouchSlop() >>> 67) * 69), 25 >> (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), new char[]{'(', 16, 24, '%', 0, 20, 27, '(', 15, 14, ')', '\n', '*', 16, '\'', '&', '#', '&', 21, 16, 27, 3, 13822, 13822, '\n', 7, '\'', 3, 20, '#', 28, ',', ',', 2, 13844}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            c((byte) (53 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34, new char[]{'(', 16, 24, '%', 0, 20, 27, '(', 15, 14, ')', '\n', '*', 16, '\'', '&', '#', '&', 21, 16, 27, 3, 13822, 13822, '\n', 7, '\'', 3, 20, '#', 28, ',', ',', 2, 13844}, objArr2);
            obj = objArr2[0];
        }
        boolean booleanExtra = intent.getBooleanExtra(((String) obj).intern(), false);
        int i4 = ICustomTabsCallback_Parcel + 63;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanExtra;
        }
        throw null;
    }

    private static final Unit onExtraCallback(PasswordActivity passwordActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 39;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = mayLaunchUrl + 85;
            ICustomTabsCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                passwordActivity.ITrustedWebActivityCallbackStub();
                throw null;
            }
            if (passwordActivity.ITrustedWebActivityCallbackStub() || !(!passwordActivity.IPostMessageServiceDefault())) {
                PasswordVerifyViewModel.onNavigationEvent(1647653205, -1647653193, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{(PasswordVerifyViewModel) IAuthTabCallback(-1093452610, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1093452611, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()), true}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
                passwordActivity.finish();
            } else {
                passwordActivity.ITrustedWebActivityService();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.password.PasswordActivity r8, o.IEngagementSignalsCallbackDefault r9) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel
            int r1 = r1 + 5
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordActivity.mayLaunchUrl = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            int r9 = r9.onNavigationEvent()
            r1 = -1
            if (r9 != r1) goto L81
            boolean r9 = r8.ITrustedWebActivityCallbackStub()
            if (r9 != 0) goto L3c
            int r9 = viva.republica.toss.password.PasswordActivity.mayLaunchUrl
            int r9 = r9 + 123
            int r1 = r9 % 128
            viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel = r1
            int r9 = r9 % r0
            if (r9 == 0) goto L34
            boolean r9 = r8.IPostMessageServiceDefault()
            if (r9 == 0) goto L30
            goto L3c
        L30:
            r8.ITrustedWebActivityService()
            goto L81
        L34:
            r8.IPostMessageServiceDefault()
            r8 = 0
            r8.hashCode()
            throw r8
        L3c:
            java.lang.Object[] r3 = new java.lang.Object[]{r8}
            int r1 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r5 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r6 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r4 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            r0 = -1093452610(0xffffffffbed33cbe, float:-0.4125728)
            r2 = 1093452611(0x412cc343, float:10.797671)
            java.lang.Object r9 = IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6)
            viva.republica.toss.password.PasswordVerifyViewModel r9 = (viva.republica.toss.password.PasswordVerifyViewModel) r9
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r9, r0}
            int r4 = o.nSetPosition.onExtraCallbackWithResult()
            int r6 = o.nSetPosition.onExtraCallbackWithResult()
            int r7 = o.nSetPosition.onExtraCallbackWithResult()
            int r3 = o.nSetPosition.onExtraCallbackWithResult()
            r2 = -1647653193(0xffffffff9dcaceb7, float:-5.3682693E-21)
            r1 = 1647653205(0x62353155, float:8.3560386E20)
            viva.republica.toss.password.PasswordVerifyViewModel.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7)
            r8.finish()
        L81:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordActivity.onExtraCallbackWithResult(viva.republica.toss.password.PasswordActivity, o.IEngagementSignalsCallbackDefault):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r7) {
        /*
            r0 = 0
            r7 = r7[r0]
            viva.republica.toss.password.PasswordActivity r7 = (viva.republica.toss.password.PasswordActivity) r7
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.password.PasswordActivity.mayLaunchUrl
            int r2 = r2 + 121
            int r3 = r2 % 128
            viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel = r3
            int r2 = r2 % r1
            r3 = 82
            if (r2 != 0) goto L21
            long r5 = r7.IPostMessageServiceStub()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r3 = 88
            int r3 = r3 / r0
            if (r2 != 0) goto L3c
            goto L29
        L21:
            long r5 = r7.IPostMessageServiceStub()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L3c
        L29:
            im.toss.state.spec.SessionState$onExtraCallbackWithResult r7 = im.toss.state.spec.SessionState.Companion
            im.toss.state.spec.SessionState r7 = r7.onExtraCallback()
            r7.IAuthTabCallback_Parcel()
            int r7 = viva.republica.toss.password.PasswordActivity.mayLaunchUrl
            int r7 = r7 + 103
            int r0 = r7 % 128
            viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel = r0
            int r7 = r7 % r1
            goto L3f
        L3c:
            r7.finish()
        L3f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordActivity.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit IAuthTabCallback(PasswordActivity passwordActivity, Boolean bool) throws Throwable {
        int i = 2 % 2;
        PasswordFragment passwordFragment = null;
        if (!passwordActivity.ITrustedWebActivityCallback()) {
            SessionState.Companion.onExtraCallback().IAuthTabCallback_Parcel();
            PasswordFragment passwordFragment2 = passwordActivity.onActivityLayout;
            if (passwordFragment2 == null) {
                int i2 = mayLaunchUrl + 63;
                ICustomTabsCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragment2 = null;
            }
            PasswordFragment.onNavigationEvent(-374755430, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 374755433, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment2, null, 1, null});
            passwordActivity.finish();
        } else {
            if (passwordActivity.IPostMessageServiceStub() != 82) {
                SessionState.Companion.onExtraCallback().IAuthTabCallback_Parcel();
            }
            PasswordFragment passwordFragment3 = passwordActivity.onActivityLayout;
            if (passwordFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                passwordFragment = passwordFragment3;
            }
            passwordFragment.onNavigationEvent((Function0<Unit>) new PasswordActivity$.ExternalSyntheticLambda20(passwordActivity));
            int i4 = ICustomTabsCallback_Parcel + 23;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(PasswordActivity passwordActivity, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 53;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequence = (CharSequence) pair.onExtraCallbackWithResult();
        CharSequence charSequence2 = (CharSequence) pair.IAuthTabCallback();
        PasswordFragment passwordFragment = passwordActivity.onActivityLayout;
        if (passwordFragment == null) {
            int i4 = ICustomTabsCallback_Parcel + 27;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            passwordFragment = null;
        }
        passwordFragment.onNavigationEvent(charSequence, charSequence2);
        Unit unit = Unit.INSTANCE;
        int i6 = ICustomTabsCallback_Parcel + 113;
        mayLaunchUrl = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 47;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object obj = null;
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = mayLaunchUrl + 51;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(PasswordActivity passwordActivity, final String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 125;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        int i4 = i2 % 2;
        PasswordFragment passwordFragment = passwordActivity.onActivityLayout;
        if (passwordFragment == null) {
            int i5 = i3 + 71;
            ICustomTabsCallback_Parcel = i5 % 128;
            passwordFragment = null;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 5 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        passwordFragment.extraCommand();
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(passwordActivity, new Function1() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return PasswordActivity.onNavigationEvent(str, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(PasswordActivity passwordActivity, Unit unit) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 65;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            passwordActivity.getSmallIconId();
            return Unit.INSTANCE;
        }
        passwordActivity.getSmallIconId();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = ICustomTabsService;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23139 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 107;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(isEngagementSignalsApiAvailable)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        char c2 = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0', 0) + 27, View.getDefaultSize(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 57;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 2;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 73;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    c = c2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 24824), 74 - View.combineMeasuredStates(0, 0), TextUtils.getTrimmedLength("") + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i9 = $11 + 115;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            c = '0';
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, 19487 - TextUtils.indexOf((CharSequence) "", '0'), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '0';
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        c = '0';
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                c2 = c;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            i16++;
            int i17 = $11 + 73;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PasswordActivity passwordActivity, Unit unit) throws Throwable {
        int i;
        int i2 = 2 % 2;
        SetDetectableSize setDetectableSize = new SetDetectableSize();
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{1505, 42673, 17261, 60437, 35008, 13705, 54862, 29450}, 41800 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), passwordActivity.IPostMessageServiceStubProxy());
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        c((byte) (5 - TextUtils.getCapsMode("", 0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, new char[]{29, 19, '.', '\'', '&', 3}, objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), isNumber.PASSWORD.getEventName());
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        Object[] objArr3 = new Object[1];
        c((byte) (79 - ExpandableListView.getPackedPositionChild(0L)), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{'#', 25, '$', 14}, objArr3);
        mapOnExtraCallback3.put(((String) objArr3[0]).intern(), ((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).getEventValue());
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
        Object[] objArr4 = new Object[1];
        a(new char[]{1509, 43953, 22903, 3878, 48336}, Drawable.resolveOpacity(0, 0) + 44617, objArr4);
        mapOnExtraCallback4.put(((String) objArr4[0]).intern(), passwordActivity.getString(iOnExtraCallbackWithResult));
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        int iIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
        Object[] objArr5 = new Object[1];
        a(new char[]{1525, 38793, 8472, 45701, 19479, 55689, 27407, 1166, 38416, 9115, 48413}, 37500 - TextUtils.lastIndexOf("", '0'), objArr5);
        mapOnExtraCallback5.put(((String) objArr5[0]).intern(), passwordActivity.getString(iIAuthTabCallback));
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr6 = new Object[1];
        c((byte) (79 - (ViewConfiguration.getLongPressTimeout() >> 16)), 11 - Color.red(0), new char[]{1, 17, 11, 14, 4, '#', 18, '#', 28, '*', 13902}, objArr6);
        String strIntern = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(new char[]{1527, 36213, 5362, 40050}, 34949 - KeyEvent.normalizeMetaState(0), objArr7);
        mapOnExtraCallback6.put(strIntern, ((String) objArr7[0]).intern());
        Map mapOnExtraCallback7 = setDetectableSize.onExtraCallback();
        Object[] objArr8 = new Object[1];
        c((byte) (TextUtils.getOffsetBefore("", 0) + 66), 17 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{')', 6, 28, 17, '\'', 19, '.', '\'', 15, '#', 29, 18, '%', 15, 21, 28, 13878}, objArr8);
        mapOnExtraCallback7.put(((String) objArr8[0]).intern(), _get_isNull_lambda0.onExtraCallbackWithResult.onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback(passwordActivity.ICustomTabsServiceStub());
        Map mapOnExtraCallback8 = setDetectableSize.onExtraCallback();
        Object[] objArr9 = new Object[1];
        a(new char[]{1520, 23152, 47823, 6987, 31656, 55304, 14491, 39133, 63834, 22978, 48695}, (Process.myPid() >> 22) + 24469, objArr9);
        String strIntern2 = ((String) objArr9[0]).intern();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24886, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), TextUtils.lastIndexOf("", '0', 0) + 31, TextUtils.indexOf("", "", 0, 0) + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            mapOnExtraCallback8.put(strIntern2, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()));
            Unit unit2 = Unit.INSTANCE;
            new TrackLog(1498529L, setDetectableSize.IAuthTabCallback(), (String) null, (String) null, 12, (DefaultConstructorMarker) null).onWarmupCompleted(true);
            shortValue.onNavigationEvent onnavigationeventOnSessionEnded = passwordActivity.onSessionEnded();
            if (onnavigationeventOnSessionEnded == null) {
                int i3 = mayLaunchUrl + 5;
                ICustomTabsCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                i = -1;
            } else {
                i = onWarmupCompleted.onExtraCallbackWithResult[onnavigationeventOnSessionEnded.ordinal()];
            }
            if (i != -1) {
                if (i != 1) {
                    int i5 = ICustomTabsCallback_Parcel + 19;
                    mayLaunchUrl = i5 % 128;
                    int i6 = i5 % 2;
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    asMaplambda6.onExtraCallback.onNavigationEvent().onNavigationEvent(new PasswordActivity$.ExternalSyntheticLambda2(passwordActivity));
                    return unit2;
                }
                Object[] objArr10 = new Object[1];
                a(new char[]{1523, 6505, 15565, 20529}, 7321 - ExpandableListView.getPackedPositionType(0L), objArr10);
                ConvertByteArrayToFloatArray.onExtraCallback(1383322L, false, ((String) objArr10[0]).intern(), (Map) null, new PasswordActivity$.ExternalSyntheticLambda1(passwordActivity), 10, (Object) null);
            }
            return unit2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(PasswordActivity passwordActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 5;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        c((byte) (View.MeasureSpec.getMode(0) + 5), ImageFormat.getBitsPerPixel(0) + 7, new char[]{29, 19, '.', '\'', '&', 3}, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), isNumber.PASSWORD.getEventName());
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        c((byte) (MotionEvent.axisFromString("") + 81), 5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{'#', 25, '$', 14}, objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), ((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).getEventValue());
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
        Object[] objArr3 = new Object[1];
        a(new char[]{1509, 43953, 22903, 3878, 48336}, Color.blue(0) + 44617, objArr3);
        mapOnExtraCallback3.put(((String) objArr3[0]).intern(), passwordActivity.getString(iOnExtraCallbackWithResult));
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        int iIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
        Object[] objArr4 = new Object[1];
        a(new char[]{1525, 38793, 8472, 45701, 19479, 55689, 27407, 1166, 38416, 9115, 48413}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37501, objArr4);
        mapOnExtraCallback4.put(((String) objArr4[0]).intern(), passwordActivity.getString(iIAuthTabCallback));
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        Object[] objArr5 = new Object[1];
        c((byte) (TextUtils.getTrimmedLength("") + 79), 11 - Color.green(0), new char[]{1, 17, 11, 14, 4, '#', 18, '#', 28, '*', 13902}, objArr5);
        String strIntern = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{1527, 36213, 5362, 40050}, (ViewConfiguration.getScrollBarSize() >> 8) + 34949, objArr6);
        mapOnExtraCallback5.put(strIntern, ((String) objArr6[0]).intern());
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr7 = new Object[1];
        a(new char[]{1520, 23152, 47823, 6987, 31656, 55304, 14491, 39133, 63834, 22978, 48695}, Color.green(0) + 24469, objArr7);
        Object obj = mapOnExtraCallback6.get(((String) objArr7[0]).intern());
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 30, 24888 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = null;
        Object obj3 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29, 24887 - View.MeasureSpec.makeMeasureSpec(0, 0), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            getWrite.IAuthTabCallback(obj, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj3, null)).intValue() + 1));
            setDetectableSize.onExtraCallback(passwordActivity.ICustomTabsServiceStub());
            Unit unit = Unit.INSTANCE;
            int i4 = mayLaunchUrl + 11;
            ICustomTabsCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PasswordActivity passwordActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 83;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        c((byte) (5 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 7, new char[]{29, 19, '.', '\'', '&', 3}, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), isNumber.PASSWORD.getEventName());
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        c((byte) (81 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 4, new char[]{'#', 25, '$', 14}, objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), ((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).getEventValue());
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallbackWithResult onextracallbackwithresult = PasswordFragment.Companion;
        int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
        Object[] objArr3 = new Object[1];
        a(new char[]{1509, 43953, 22903, 3878, 48336}, View.MeasureSpec.makeMeasureSpec(0, 0) + 44617, objArr3);
        mapOnExtraCallback3.put(((String) objArr3[0]).intern(), passwordActivity.getString(iOnExtraCallbackWithResult));
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        int iIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()));
        Object[] objArr4 = new Object[1];
        a(new char[]{1525, 38793, 8472, 45701, 19479, 55689, 27407, 1166, 38416, 9115, 48413}, 37501 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        mapOnExtraCallback4.put(((String) objArr4[0]).intern(), passwordActivity.getString(iIAuthTabCallback));
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        Object[] objArr5 = new Object[1];
        c((byte) (79 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{1, 17, 11, 14, 4, '#', 18, '#', 28, '*', 13902}, objArr5);
        String strIntern = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{1527, 36213, 5362, 40050}, 34949 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
        mapOnExtraCallback5.put(strIntern, ((String) objArr6[0]).intern());
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr7 = new Object[1];
        c((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 96), 11 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{4, 19, 28, 19, ')', '(', '$', 18, 28, '(', '#', 11}, objArr7);
        Object obj = mapOnExtraCallback6.get(((String) objArr7[0]).intern());
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 24886 - TextUtils.lastIndexOf("", '0'), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, Drawable.resolveOpacity(0, 0) + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            getWrite.IAuthTabCallback(obj, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue()));
            setDetectableSize.onExtraCallback(passwordActivity.ICustomTabsServiceStub());
            Unit unit = Unit.INSTANCE;
            int i4 = ICustomTabsCallback_Parcel + 3;
            mayLaunchUrl = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return unit;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // viva.republica.toss.password.Hilt_PasswordActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() throws Throwable {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 33;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(-1582234737, StatusCpt$.ExternalSyntheticLambda0.onExtraCallback(), 1582234743, new Object[]{this}, StatusCpt$.ExternalSyntheticLambda0.onExtraCallback(), StatusCpt$.ExternalSyntheticLambda0.onExtraCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        super.onDestroy();
        int i4 = mayLaunchUrl + 21;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setRequestedOrientation(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 111;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0 ? Build.VERSION.SDK_INT != 26 : Build.VERSION.SDK_INT != 30) {
            super/*im.toss.uikit.base.UIKitBaseActivity*/.setRequestedOrientation(i);
        }
        int i4 = ICustomTabsCallback_Parcel + 105;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.password.Hilt_PasswordActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 47;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        CatalystInstanceImplIA catalystInstanceImplIA = CatalystInstanceImplIA.onNavigationEvent;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        catalystInstanceImplIA.onNavigationEvent(intent);
        int i4 = ICustomTabsCallback_Parcel + 119;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 107;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CatalystInstanceImplIA.onNavigationEvent.onWarmupCompleted();
        super.onStop();
        int i4 = mayLaunchUrl + 15;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 101;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "");
        menuInflater.inflate(R.menu.password_activity_actions, menu);
        menu.findItem(R.id.action_password_reset).setVisible(false);
        boolean zOnCreateOptionsMenu = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        int i4 = mayLaunchUrl + 35;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnCreateOptionsMenu;
    }

    public final void ICustomTabsServiceDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        bg_();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = mayLaunchUrl + 107;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean bg_() throws Throwable {
        int i = 2 % 2;
        if (((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())) == UTF8Decoder.LOCK_SCREEN) {
            if (onUnminimized()) {
                int i2 = mayLaunchUrl + 113;
                ICustomTabsCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
                if (typedObject != null) {
                    int i4 = mayLaunchUrl + 7;
                    ICustomTabsCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    MediaCodecInfoReportIncorrectInfoQuirk.onWarmupCompleted(typedObject);
                }
                Runtime.getRuntime().exit(0);
            } else {
                moveTaskToBack(true);
                SessionState sessionStateOnExtraCallback = SessionState.Companion.onExtraCallback();
                Object[] objArr = new Object[1];
                a(new char[]{1501, 25461, 51428, 13915, 40942, 1349, 25249, 51257, 12716, 40732, 1247, 25144, 52084, 12525, 40568, 1987, 27982, 51928, 12339, 39297, 1838, 27778, 51722, 13210, 39152, 1654, 28662, 54552, 13002, 38976, 409, 28453, 54418, 12817, 39863, 226, 28280, 55285, 15680}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26251, objArr);
                sessionStateOnExtraCallback.onExtraCallbackWithResult(((String) objArr[0]).intern());
                if (accessMapSafely.onNavigationEvent.IAuthTabCallback(this)) {
                    finish();
                }
            }
            return true;
        }
        PasswordFragment passwordFragment = this.onActivityLayout;
        if (passwordFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            passwordFragment = null;
        }
        if (!(passwordFragment instanceof PasswordNeo6DFragment)) {
            PasswordFragment passwordFragment2 = this.onActivityLayout;
            if (passwordFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                passwordFragment2 = null;
            }
            if (!(passwordFragment2 instanceof PasswordNeo4D1AFragment)) {
                int i6 = ICustomTabsCallback_Parcel + 33;
                mayLaunchUrl = i6 % 128;
                int i7 = i6 % 2;
                setResult(0, onGreatestScrollPercentageIncreased());
                return super.bg_();
            }
        }
        setResult(0, onGreatestScrollPercentageIncreased());
        PasswordFragment passwordFragment3 = this.onActivityLayout;
        if (passwordFragment3 == null) {
            int i8 = mayLaunchUrl + 123;
            ICustomTabsCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            passwordFragment3 = null;
        }
        PasswordFragment.onNavigationEvent(1882857528, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1882857521, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{passwordFragment3, null, 1, null});
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Intent onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 7;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        int i4 = mayLaunchUrl + 19;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return intent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 77;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            IPostMessageServiceStubProxy supportActionBar = passwordActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onNavigationEvent(true);
                supportActionBar.IAuthTabCallbackStub(false);
                int i3 = ICustomTabsCallback_Parcel + 5;
                mayLaunchUrl = i3 % 128;
                int i4 = i3 % 2;
            }
            return null;
        }
        passwordActivity.getSupportActionBar();
        throw null;
    }

    public static final class onExtraCallback implements PasswordFragment.onWarmupCompleted {
        onExtraCallback() {
        }

        @Override // viva.republica.toss.password.PasswordFragment.onWarmupCompleted
        public void onWarmupCompleted(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, boolean z, String str, String str2, boolean z2) throws Throwable {
            Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
            _get_isNull_lambda0 _get_isnull_lambda0 = _get_isNull_lambda0.onExtraCallbackWithResult;
            _get_isnull_lambda0.onExtraCallbackWithResult(str);
            _get_isnull_lambda0.IAuthTabCallback(str2);
            Object[] objArr = {PasswordActivity.writeTypedObject(PasswordActivity.this), PasswordActivity.this, graniteBrownfieldModule_closeView, Boolean.valueOf(z), Boolean.valueOf(z2)};
            PasswordVerifyViewModel.onNavigationEvent(-2088399815, 2088399822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        }
    }

    public static final class IAuthTabCallback implements PasswordFragment.IAuthTabCallback {
        IAuthTabCallback() {
        }

        @Override // viva.republica.toss.password.PasswordFragment.IAuthTabCallback
        public void IAuthTabCallback() throws Throwable {
            PasswordActivity.extraCallback(PasswordActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityService() throws Throwable {
        AppBarLayout appBarLayout;
        int i;
        int i2 = 2 % 2;
        PasswordFragment passwordFragmentOnWarmupCompleted = PasswordFragment.onExtraCallbackWithResult.onWarmupCompleted(PasswordFragment.Companion, setTestMode.onExtraCallback.onTransact(), ITrustedWebActivityCallback(), false, 4, null);
        if (ITrustedWebActivityCallback()) {
            int i3 = mayLaunchUrl + 13;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                appBarLayout = writeTypedList().onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
                i = 56;
            } else {
                appBarLayout = writeTypedList().onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
                i = 8;
            }
            appBarLayout.setVisibility(i);
        }
        passwordFragmentOnWarmupCompleted.IAuthTabCallback(ITrustedWebActivityCallback_Parcel());
        passwordFragmentOnWarmupCompleted.setArguments(getIntent().getExtras());
        passwordFragmentOnWarmupCompleted.onExtraCallbackWithResult(new onExtraCallback());
        passwordFragmentOnWarmupCompleted.onExtraCallbackWithResult(new IAuthTabCallback());
        this.onActivityLayout = passwordFragmentOnWarmupCompleted;
        int i4 = R.id.password_container;
        Object[] objArr = new Object[1];
        a(new char[]{1527, 23817, 46081, 3889, 26145}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22769, objArr);
        BaseActivity.onNavigationEvent(this, i4, passwordFragmentOnWarmupCompleted, ((String) objArr[0]).intern(), (Boolean) null, 8, (Object) null);
        int i5 = mayLaunchUrl + 101;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppCompatActivity appCompatActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        if (!appCompatActivity.ITrustedWebActivityCallback()) {
            appCompatActivity.overridePendingTransition(R.anim.fade_in, 0);
        } else {
            int i2 = mayLaunchUrl + 35;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            appCompatActivity.overridePendingTransition(0, 0);
        }
        appCompatActivity.setRequestedOrientation(1);
        appCompatActivity.getWindow().setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 29) {
            int i4 = mayLaunchUrl + 17;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            appCompatActivity.getWindow().setNavigationBarContrastEnforced(false);
        }
        appCompatActivity.getWindow().setStatusBarColor(0);
        appCompatActivity.findViewById(R.id.app_bar_layout).setPadding(0, M_.onExtraCallback.access000(), 0, 0);
        RepeatableSpec.onExtraCallbackWithResult(appCompatActivity.getWindow(), false);
        int i6 = mayLaunchUrl + 15;
        ICustomTabsCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        super.finish();
        if (ITrustedWebActivityCallback()) {
            int i2 = mayLaunchUrl + 33;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                overridePendingTransition(0, 1);
            } else {
                overridePendingTransition(0, 0);
            }
            int i3 = mayLaunchUrl + 99;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            overridePendingTransition(0, R.anim.fade_out);
        }
        ((PasswordVerifyViewModel) IAuthTabCallback(-1093452610, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1093452611, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).IAuthTabCallbackStub();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getSmallIconId() throws Throwable {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        if (!(!IEngagementSignalsCallback_Parcel())) {
            int i2 = mayLaunchUrl + 121;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                objIAuthTabCallback = IAuthTabCallback(-1093452610, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1093452611, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            } else {
                objIAuthTabCallback = IAuthTabCallback(-1093452610, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1093452611, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            }
            ((PasswordVerifyViewModel) objIAuthTabCallback).IAuthTabCallback(true);
            finish();
            return;
        }
        Object[] objArr = new Object[1];
        a(new char[]{1522, 23203, 47942, 7147, 30858, 55598}, TextUtils.getTrimmedLength("") + 24413, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{1505, 12325, 28232, 42141, 53938, 2263, 18205, 32038, 43878, 57758, 8102, 21957, 32776, 48692}, 13781 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
        TrackEvent.IAuthTabCallback iAuthTabCallback = new TrackEvent.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{1511, 12085, 20590, 34177}, 10956 - ImageFormat.getBitsPerPixel(0), objArr3);
        Object[] objArr4 = {iAuthTabCallback.onNavigationEvent(((String) objArr3[0]).intern(), getScreenName()).onWarmupCompleted()};
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -870178991, objArr4, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        if (!onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
            this.access100.onNavigationEvent(validateRelationship().onExtraCallback(this, true ^ IPostMessageServiceDefault()));
            return;
        }
        int i3 = mayLaunchUrl + 11;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            this.onRelationshipValidationResult.onNavigationEvent(PasswordResetIntroActivity.Companion.onExtraCallback(this, cancelNotification()));
            throw null;
        }
        this.onRelationshipValidationResult.onNavigationEvent(PasswordResetIntroActivity.Companion.onExtraCallback(this, cancelNotification()));
        int i4 = ICustomTabsCallback_Parcel + 1;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStubProxy() throws Throwable {
        Sensor defaultSensor;
        int i = 2 % 2;
        if (DERSet.onExtraCallback.getInterfaceDescriptor()) {
            Object[] objArr = new Object[1];
            a(new char[]{1506, 36695, 4281, 39435, 12146, 45260}, TextUtils.indexOf("", "") + 35491, objArr);
            Object systemService = getSystemService(((String) objArr[0]).intern());
            Intrinsics.checkNotNull(systemService, "");
            SensorManager sensorManager = (SensorManager) systemService;
            this.onMessageChannelReady = sensorManager;
            if (sensorManager != null) {
                defaultSensor = sensorManager.getDefaultSensor(8);
            } else {
                int i2 = mayLaunchUrl + 41;
                ICustomTabsCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                defaultSensor = null;
            }
            this.onActivityResized = defaultSensor;
            SensorManager sensorManager2 = this.onMessageChannelReady;
            if (sensorManager2 != null) {
                int i4 = mayLaunchUrl + 65;
                ICustomTabsCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                sensorManager2.registerListener(this, defaultSensor, 3);
            }
            getSmallIconBitmap();
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        PasswordActivity passwordActivity = (PasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 37;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (!DERSet.onExtraCallback.getInterfaceDescriptor()) {
            return null;
        }
        SensorManager sensorManager = passwordActivity.onMessageChannelReady;
        if (sensorManager != null) {
            sensorManager.unregisterListener(passwordActivity, passwordActivity.onActivityResized);
            int i4 = ICustomTabsCallback_Parcel + 99;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
        }
        passwordActivity.onMinimized.removeCallbacksAndMessages(null);
        passwordActivity.access200();
        return null;
    }

    public static final class asBinder implements LockWheel.onExtraCallback {
        asBinder() {
        }

        public void IAuthTabCallback() {
            PasswordActivity.ICustomTabsCallback(PasswordActivity.this);
        }
    }

    private final void getSmallIconBitmap() {
        int i = 2 % 2;
        writeTypedList().onExtraCallbackWithResult.setCallback(new asBinder());
        int i2 = mayLaunchUrl + 7;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void access200() {
        int i = 2 % 2;
        ConstraintLayout constraintLayout = writeTypedList().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(constraintLayout, 300L, 0L, (Interpolator) null, false, false, (Function1) null, new Function1() { // from class: viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return PasswordActivity.onExtraCallbackWithResult((View) obj);
            }
        }, 62, (Object) null);
        int i2 = ICustomTabsCallback_Parcel + 37;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(View view) {
        int i;
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 5;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            i = 19;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            i = 8;
        }
        view.setVisibility(i);
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 3;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 103;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void ICustomTabsCallbackStub(PasswordActivity passwordActivity) {
        int i = 2 % 2;
        ConstraintLayout constraintLayout = passwordActivity.writeTypedList().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(constraintLayout, 300L, 0L, (Interpolator) null, false, false, new PasswordActivity$.ExternalSyntheticLambda22(), (Function1) null, 94, (Object) null);
        passwordActivity.writeTypedList().onExtraCallbackWithResult.onWarmupCompleted();
        int i2 = mayLaunchUrl + 11;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent sensorEvent) {
        float maximumRange;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sensorEvent, "");
        if (sensorEvent.sensor.getType() != 8) {
            return;
        }
        Sensor sensor = this.onActivityResized;
        if (sensor != null) {
            maximumRange = sensor.getMaximumRange() / 2.0f;
            int i2 = mayLaunchUrl + 75;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        } else {
            maximumRange = 0.0f;
        }
        float f = sensorEvent.values[0];
        if (f >= (-maximumRange)) {
            int i4 = ICustomTabsCallback_Parcel + 53;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
            if (f <= maximumRange) {
                this.onMinimized.postDelayed(new PasswordActivity$.ExternalSyntheticLambda21(this), 1000L);
                return;
            }
        }
        Object obj = null;
        this.onMinimized.removeCallbacksAndMessages(null);
        int i6 = mayLaunchUrl + 41;
        ICustomTabsCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 79;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, true}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
            int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
            int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, true}, iOnExtraCallbackWithResult4, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int iOnExtraCallbackWithResult5 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            Object[] objArr3 = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult5, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
            int iOnExtraCallbackWithResult6 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr3, iOnExtraCallbackWithResult6, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void notifyNotificationWithChannel() throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.PasswordActivity.mayLaunchUrl
            int r1 = r1 + 73
            int r2 = r1 % 128
            viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 17
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L37
            android.content.Intent r1 = r10.getIntent()
            char[] r6 = new char[r3]
            r6 = {x00e6: FILL_ARRAY_DATA , data: [1492, 31408, -1225, 31656, -1996, 30867, -1790, 31116, -501, 32415, -135, 32765, -919, 31997, -677, 32202, -3516} // fill-array
            int r7 = android.view.MotionEvent.axisFromString(r2)
            int r7 = r7 + 8642
            java.lang.Object[] r8 = new java.lang.Object[r4]
            a(r6, r7, r8)
            r6 = r8[r5]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.String r1 = r1.getStringExtra(r6)
            if (r1 != 0) goto L63
            goto L59
        L37:
            android.content.Intent r1 = r10.getIntent()
            char[] r6 = new char[r3]
            r6 = {x00fc: FILL_ARRAY_DATA , data: [1492, 31408, -1225, 31656, -1996, 30867, -1790, 31116, -501, 32415, -135, 32765, -919, 31997, -677, 32202, -3516} // fill-array
            int r7 = android.view.MotionEvent.axisFromString(r2)
            int r7 = r7 + 32634
            java.lang.Object[] r8 = new java.lang.Object[r4]
            a(r6, r7, r8)
            r6 = r8[r5]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.String r1 = r1.getStringExtra(r6)
            if (r1 != 0) goto L63
        L59:
            int r1 = viva.republica.toss.password.PasswordActivity.mayLaunchUrl
            int r1 = r1 + 27
            int r6 = r1 % 128
            viva.republica.toss.password.PasswordActivity.ICustomTabsCallback_Parcel = r6
            int r1 = r1 % r0
            r1 = r2
        L63:
            android.content.Intent r0 = r10.getIntent()
            r6 = 48
            char r6 = android.text.AndroidCharacter.getMirror(r6)
            int r6 = r6 + 78
            byte r6 = (byte) r6
            int r7 = android.view.View.combineMeasuredStates(r5, r5)
            int r7 = r7 + 19
            r8 = 19
            char[] r8 = new char[r8]
            r8 = {x0112: FILL_ARRAY_DATA , data: [40, 16, 24, 37, 0, 20, 38, 39, 41, 10, 35, 17, 2, 44, 13895, 13895, 1, 34, 13917} // fill-array
            java.lang.Object[] r9 = new java.lang.Object[r4]
            c(r6, r7, r8, r9)
            r6 = r9[r5]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.String r0 = r0.getStringExtra(r6)
            if (r0 != 0) goto L91
            return
        L91:
            viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda19 r6 = new viva.republica.toss.password.PasswordActivity$$ExternalSyntheticLambda19
            r6.<init>(r1, r0)
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r10, r6)
            android.content.Intent r0 = r10.getIntent()
            char[] r1 = new char[r3]
            r1 = {x012a: FILL_ARRAY_DATA , data: [1492, 31408, -1225, 31656, -1996, 30867, -1790, 31116, -501, 32415, -135, 32765, -919, 31997, -677, 32202, -3516} // fill-array
            r6 = 0
            int r3 = android.widget.ExpandableListView.getPackedPositionChild(r6)
            int r3 = r3 + 32634
            java.lang.Object[] r6 = new java.lang.Object[r4]
            a(r1, r3, r6)
            r1 = r6[r5]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r0.removeExtra(r1)
            android.content.Intent r0 = r10.getIntent()
            int r1 = android.view.KeyEvent.getDeadChar(r5, r5)
            int r1 = r1 + 126
            byte r1 = (byte) r1
            r3 = 48
            int r2 = android.text.TextUtils.indexOf(r2, r3, r5)
            int r2 = 18 - r2
            r3 = 19
            char[] r3 = new char[r3]
            r3 = {x0140: FILL_ARRAY_DATA , data: [40, 16, 24, 37, 0, 20, 38, 39, 41, 10, 35, 17, 2, 44, 13895, 13895, 1, 34, 13917} // fill-array
            java.lang.Object[] r4 = new java.lang.Object[r4]
            c(r1, r2, r3, r4)
            r1 = r4[r5]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r0.removeExtra(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordActivity.notifyNotificationWithChannel():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 13;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        if (i4 != this.writeTypedObject || i5 != this.ICustomTabsCallback) {
            onExtraCallbackWithResult(r8lambda51JYeBdAqXViyypFWDJRrf3snFI.onExtraCallback(isInMultiWindowMode(), isInPictureInPictureMode()));
            return;
        }
        int i6 = ICustomTabsCallback_Parcel + 77;
        mayLaunchUrl = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onMultiWindowModeChanged(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 87;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            super.onMultiWindowModeChanged(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onMultiWindowModeChanged(z);
        if (z) {
            onExtraCallbackWithResult(isTransient.MULTI_WINDOW);
            int i3 = ICustomTabsCallback_Parcel + 75;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Deprecated
    public void onPictureInPictureModeChanged(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 41;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.activity.ComponentActivity*/.onPictureInPictureModeChanged(z);
        if (z) {
            int i4 = ICustomTabsCallback_Parcel + 31;
            mayLaunchUrl = i4 % 128;
            if (i4 % 2 != 0) {
                onExtraCallbackWithResult(isTransient.PICTURE_IN_PICTURE);
                throw null;
            }
            onExtraCallbackWithResult(isTransient.PICTURE_IN_PICTURE);
        }
        int i5 = mayLaunchUrl + 31;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(isTransient istransient) {
        int i = 2 % 2;
        setResult(0);
        Object obj = null;
        if (((UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())) == UTF8Decoder.LOCK_SCREEN && IPostMessageServiceStub() == 82) {
            int i2 = ICustomTabsCallback_Parcel + 33;
            mayLaunchUrl = i2 % 128;
            if (i2 % 2 == 0) {
                ((PasswordVerifyViewModel) IAuthTabCallback(-1093452610, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1093452611, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).onNavigationEvent(istransient);
            } else {
                ((PasswordVerifyViewModel) IAuthTabCallback(-1093452610, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1093452611, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).onNavigationEvent(istransient);
                obj.hashCode();
                throw null;
            }
        }
        finish();
        int i3 = ICustomTabsCallback_Parcel + 31;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[PHI: r15
      0x0099: PHI (r15v10 java.lang.String) = (r15v9 java.lang.String), (r15v120 java.lang.String) binds: [B:18:0x00be, B:15:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0648  */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.app.Activity, viva.republica.toss.password.PasswordActivity] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Byte] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.shortValue.onNavigationEvent readTypedObject(viva.republica.toss.password.PasswordActivity r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.PasswordActivity.readTypedObject(viva.republica.toss.password.PasswordActivity):o.shortValue$onNavigationEvent");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) IAuthTabCallback(457123375, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -457123367, new Object[]{str, str2, commonModule_setLeftEdgeTouchEnabled}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordActivity passwordActivity, Pair pair) {
        return (Unit) IAuthTabCallback(-1705168224, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1705168238, new Object[]{passwordActivity, pair}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordActivity passwordActivity, String str) {
        return (Unit) IAuthTabCallback(-1721942786, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1721942795, new Object[]{passwordActivity, str}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(View view) {
        return (Unit) IAuthTabCallback(-1632094729, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1632094731, new Object[]{view}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    public static /* synthetic */ String getInterfaceDescriptor(PasswordActivity passwordActivity) {
        return (String) IAuthTabCallback(1868421319, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1868421303, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final void ICustomTabsService_Parcel() throws Throwable {
        IAuthTabCallback(-1582234737, StatusCpt$.ExternalSyntheticLambda0.onExtraCallback(), 1582234743, new Object[]{this}, StatusCpt$.ExternalSyntheticLambda0.onExtraCallback(), StatusCpt$.ExternalSyntheticLambda0.onExtraCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final UTF8Decoder IPostMessageService() {
        return (UTF8Decoder) IAuthTabCallback(-1662692710, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1662692715, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final PasswordVerifyViewModel ITrustedWebActivityCallbackDefault() {
        return (PasswordVerifyViewModel) IAuthTabCallback(-1093452610, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1093452611, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final void IPostMessageService_Parcel() throws Throwable {
        IAuthTabCallback(-1775302393, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1775302406, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private final void ITrustedWebActivityCallbackStubProxy() throws Throwable {
        IAuthTabCallback(1306584605, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1306584602, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private static final boolean onActivityLayout(PasswordActivity passwordActivity) {
        return ((Boolean) IAuthTabCallback(-1693298759, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1693298774, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
    }

    private static final boolean ICustomTabsCallbackDefault(PasswordActivity passwordActivity) {
        return ((Boolean) IAuthTabCallback(-1690996594, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1690996601, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(PasswordActivity passwordActivity, Boolean bool) {
        return (Unit) IAuthTabCallback(1529649172, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1529649161, new Object[]{passwordActivity, bool}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private static final Unit onRelationshipValidationResult(PasswordActivity passwordActivity) {
        return (Unit) IAuthTabCallback(-682779601, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 682779601, new Object[]{passwordActivity}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) IAuthTabCallback(1802557286, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1802557276, new Object[]{str, str2, commonModule_setLeftEdgeTouchEnabled}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    @Override // viva.republica.toss.password.Hilt_PasswordActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 35;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = ICustomTabsCallback_Parcel + 77;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.password.Hilt_PasswordActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 73;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = mayLaunchUrl + 39;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.password.Hilt_PasswordActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 65;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }

    static void IEngagementSignalsCallback() {
        extraCommand = -7081670505649962842L;
        ICustomTabsService = new char[]{64991, 65069, 64981, 64961, 65015, 64989, 65010, 64960, 64971, 64996, 65067, 65065, 64998, 65020, 65004, 64982, 64984, 65002, 64966, 65003, 65013, 64970, 64980, 64999, 64995, 64979, 65018, 65021, 65066, 65012, 65008, 64988, 64987, 64990, 64977, 64963, 64976, 65014, 64993, 64967, 64978, 64992, 65019, 64964, 65022, 64983, 65009, 65064, 64986};
        isEngagementSignalsApiAvailable = (char) 51246;
    }
}
