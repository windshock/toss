package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.base.BaseActivity;
import im.toss.components.tuba.variable.TubaVarV1SyncState;
import im.toss.components.tuba.variable.v1.model.CdnVars;
import im.toss.core.cache.RxSharedApiCall;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.core.tuba.TriggersResult;
import im.toss.core.tuba.VarsResult;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.state.spec.SessionState;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import o.DetectOcclusion;
import o.GeckoHubImp;
import o.GetInputImageFromPathAsUnchanged;
import o.GriverDecodeUrl21;
import o.GyrShakeHelper;
import o.SetDetectableSize;
import o.UST_CERT_GetPublicKeyInfo;
import o.UST_CERT_VerifyCertificate;
import o.UST_CMP_IssueCertificate;
import o.deserializeIp;
import o.genSignatureValueWithDigest;
import o.getAdUnitIds;
import o.getLastTrimMemoryLevel;
import o.getMediationProvider;
import o.getSdkKey;
import o.getSegmentCollection;
import o.setApTextSize;
import o.setLogBuffers;
import o.trackEventSynchronously;
import o.useNavigationStyleTitleBar;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.ClearAppDataAndExitActivity;
import viva.republica.toss.core.AppStateHandler$;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.main.more.DisplaySettingActivity;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;
import viva.republica.toss.network.model.init.v2.CheckoutResult;
import viva.republica.toss.password.reset.PasswordBlockIntroActivity;
import viva.republica.toss.verify.unblock.UnblockSessionActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetPublicKeyInfo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy IAuthTabCallback;
    private static final Lazy IAuthTabCallbackDefault;
    private static final Lazy IAuthTabCallbackStub;
    private static final Lazy IAuthTabCallbackStubProxy;
    private static final JsonReaderUnknownNumberParsing<AppState> IAuthTabCallback_Parcel;
    private static final findResAndMsg ICustomTabsCallback;
    private static final Lazy ICustomTabsCallbackDefault;
    private static final Lazy ICustomTabsCallbackStub;
    private static final Lazy ICustomTabsCallbackStubProxy;
    private static int[] ICustomTabsCallback_Parcel = null;
    private static boolean ICustomTabsService = false;
    private static final Lazy access000;
    private static final Lazy access100;
    private static final Lazy asBinder;
    private static final AppSetIdAndScope1 asInterface;
    private static final Lazy extraCallback;
    private static final JsonReaderUnknownNumberParsing<SessionState> extraCallbackWithResult;
    private static boolean extraCommand = false;
    private static final Lazy getInterfaceDescriptor;
    private static char[] isEngagementSignalsApiAvailable = null;
    private static int mayLaunchUrl = 0;
    private static int newAuthTabSession = 1;
    private static int newSessionWithExtras = 1;
    private static final Lazy onActivityLayout;
    private static final Lazy onActivityResized;
    private static final Lazy onExtraCallback;
    private static final Lazy onExtraCallbackWithResult;
    private static final Lazy onMessageChannelReady;
    private static final Lazy onMinimized;
    public static final int onNavigationEvent;
    private static final Lazy onPostMessage;
    private static final Lazy onRelationshipValidationResult;
    private static final Lazy onTransact;
    private static final Lazy onUnminimized;
    public static final UST_CERT_GetPublicKeyInfo onWarmupCompleted;
    private static int postMessage;
    private static int prefetch;
    private static final Object readTypedObject;
    private static final Lazy writeTypedObject;

    public interface IAuthTabCallback {
        useNavigationStyleTitleBar ActivityResultCallerKtExternalSyntheticLambda1();

        DeviceInfoFieldGroup IEngagementSignalsCallbackStub();

        ExternalOfferInformationDialogListener RequiresExtension();

        GetInputImageFromPathAsGrayScale Rinteger();

        ProductDetailsPricingPhase Rstring();

        ProductDetailsResult setBackgroundResource();

        getBillingPeriod setSupportProgressBarVisibility();
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[UST_CERT_SetCertVerifyEnv.values().length];
            try {
                iArr[UST_CERT_SetCertVerifyEnv.BLOCKED_BY_WRONG_BANK_PASSWORD_ATTEMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.BLOCKED_BY_WRONG_PASSWORD_ATTEMPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.DORMANT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.INVALID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.LEAVED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.LOGIN_OTHER_DEVICE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.DEAD_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.INVALID_ANDROID_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UST_CERT_SetCertVerifyEnv.INVALID_MIUI_VIRTUAL_IDENTITY_DISABLED_ANDROID_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[DisplaySettingActivity.Companion.DisplaySetting.values().length];
            try {
                iArr2[DisplaySettingActivity.Companion.DisplaySetting.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DisplaySettingActivity.Companion.DisplaySetting.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DisplaySettingActivity.Companion.DisplaySetting.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            IAuthTabCallback = iArr2;
            int[] iArr3 = new int[maxAge.values().length];
            try {
                iArr3[maxAge.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[maxAge.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[maxAge.System.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            onExtraCallback = iArr3;
            int[] iArr4 = new int[getPricingPhaseList.values().length];
            try {
                iArr4[getPricingPhaseList.KR.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            onWarmupCompleted = iArr4;
        }
    }

    public static /* synthetic */ TubaVarV1SyncState.onExtraCallback.onWarmupCompleted IAuthTabCallback(VarsResult varsResult, CdnVars cdnVars) {
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(varsResult, cdnVars);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent(varsResult, cdnVars);
        int i3 = postMessage + 125;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedOnNavigationEvent;
    }

    public static /* synthetic */ Boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 75;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolICustomTabsServiceDefault = ICustomTabsServiceDefault(function1, obj);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return boolICustomTabsServiceDefault;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 53;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        getSmallIconId(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = newAuthTabSession + 57;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 31;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            MediaSessionCompatResultReceiverWrapper();
            throw null;
        }
        Unit unitMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        int i3 = postMessage + 103;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return unitMediaSessionCompatResultReceiverWrapper;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TriggersResult triggersResult) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 39;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(triggersResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(triggersResult);
        int i3 = postMessage + 99;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 123;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(bool);
        int i4 = newAuthTabSession + 23;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 25;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(th);
        int i4 = postMessage + 49;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(VarsResult varsResult) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 61;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipAsBinder = asBinder(varsResult);
        int i4 = postMessage + 95;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return deserializeipAsBinder;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(SessionState sessionState) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 69;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onExtraCallbackWithResult(new Object[]{sessionState}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -403580368, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 403580415);
        int i4 = newAuthTabSession + 25;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 35;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{setDetectableSize}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 530052799, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -530052748);
        int i4 = postMessage + 13;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 67;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        int i4 = postMessage + 89;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAudioAttributesImplBaseParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 17;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {th};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(objArr, iIAuthTabCallback2, iIAuthTabCallback, -1053345042, iIAuthTabCallback3, iIAuthTabCallback4, 1053345104);
        int i4 = postMessage + 27;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 21;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        getActiveNotifications(function1, obj);
        int i4 = postMessage + 57;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ SessionState IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 81;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        SessionState sessionStateR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return sessionStateR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 103;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return onPostMessage(th);
        }
        onPostMessage(th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 43;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(rSASSAPSSparams);
        }
        onExtraCallbackWithResult(rSASSAPSSparams);
        throw null;
    }

    public static /* synthetic */ forNonGDPRUser IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 87;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_lambda1();
        }
        _init_lambda1();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 31;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityCallback(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        getMediationProvider.IAuthTabCallback iAuthTabCallback = (getMediationProvider.IAuthTabCallback) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) onExtraCallbackWithResult(new Object[]{iAuthTabCallback}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -892993238, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 892993286);
        int i4 = newAuthTabSession + 49;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ProductDetailsResult IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = postMessage + 77;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ProductDetailsResult productDetailsResultDefaultViewModelProviderFactory_delegatelambda0 = defaultViewModelProviderFactory_delegatelambda0();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return productDetailsResultDefaultViewModelProviderFactory_delegatelambda0;
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 83;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallbackDefault(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 101;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return requestPostMessageChannel(function1, obj);
        }
        requestPostMessageChannel(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        VarsResult varsResult = (VarsResult) objArr[0];
        CdnVars cdnVars = (CdnVars) objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 43;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onWarmupCompleted2 = onWarmupCompleted(varsResult, cdnVars);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return onWarmupCompleted2;
    }

    public static /* synthetic */ void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = postMessage + 77;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        RatingCompatStyle();
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void ICustomTabsCallbackDefault(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 69;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1778587308, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1778587333);
            int i3 = 13 / 0;
        } else {
            onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1778587308, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1778587333);
        }
        int i4 = newAuthTabSession + 25;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 9;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = access000(bool);
        int i4 = postMessage + 17;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zAccess000);
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp ICustomTabsCallbackStub(Function1 function1, Object obj) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 23;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            deserializeip = (deserializeIp) onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -551504484, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 551504487);
            int i3 = 90 / 0;
        } else {
            deserializeip = (deserializeIp) onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -551504484, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 551504487);
        }
        int i4 = newAuthTabSession + 107;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ isWifiEnabled ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = postMessage + 11;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        isWifiEnabled iswifienabledR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        int i4 = newAuthTabSession + 99;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return iswifienabledR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 57;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            writeTypedList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        useNavigationStyleTitleBar usenavigationstyletitlebarWriteTypedList = writeTypedList();
        int i3 = newAuthTabSession + 59;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 43 / 0;
        }
        return usenavigationstyletitlebarWriteTypedList;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 87;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1834797338, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1834797286);
        int i4 = postMessage + 81;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 39;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(th);
        int i4 = newAuthTabSession + 41;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAccess000;
        }
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallback_Parcel() {
        Unit unit;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 65;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 118116854, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -118116836);
            int i3 = 51 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 118116854, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -118116836);
        }
        int i4 = newAuthTabSession + 101;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean ICustomTabsCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 77;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess200 = access200(function1, obj);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return zAccess200;
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 125;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ITrustedWebActivityServiceDefault(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = postMessage + 67;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void ICustomTabsService(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 17;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        onVerticalScrollEvent(function1, obj);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
    }

    private static /* synthetic */ Object ICustomTabsServiceDefault(Object[] objArr) {
        Unit unitPlaybackStateCompatCustomAction;
        int i = 2 % 2;
        int i2 = postMessage + 69;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            unitPlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction();
            int i3 = 9 / 0;
        } else {
            unitPlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction();
        }
        int i4 = newAuthTabSession + 101;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitPlaybackStateCompatCustomAction;
    }

    private static /* synthetic */ Object ICustomTabsServiceStubProxy(Object[] objArr) {
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 121;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(rSASSAPSSparams);
        }
        onNavigationEvent(rSASSAPSSparams);
        throw null;
    }

    private static /* synthetic */ Object IEngagementSignalsCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 57;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsServiceStub(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = postMessage + 67;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit access000() {
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            MediaSessionCompatQueueItem();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        int i3 = postMessage + 7;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 82 / 0;
        }
        return unitMediaSessionCompatQueueItem;
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 121;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        onGreatestScrollPercentageIncreased(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = postMessage + 109;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ setAlogFlushAddr access100() {
        int i = 2 % 2;
        int i2 = postMessage + 75;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        setAlogFlushAddr setalogflushaddr = (setAlogFlushAddr) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 753460206, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -753460153);
        int i3 = newAuthTabSession + 77;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 93 / 0;
        }
        return setalogflushaddr;
    }

    public static /* synthetic */ TubaVarV1SyncState.onExtraCallback.onWarmupCompleted asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 105;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            newAuthTabSession(function1, obj);
            throw null;
        }
        TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onwarmupcompletedNewAuthTabSession = newAuthTabSession(function1, obj);
        int i3 = postMessage + 79;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedNewAuthTabSession;
    }

    public static /* synthetic */ Unit asBinder(Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 77;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {th};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback, -1837206518, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1837206579);
        int i4 = postMessage + 17;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ ExternalOfferInformationDialogListener asBinder() {
        ExternalOfferInformationDialogListener externalOfferInformationDialogListener;
        int i = 2 % 2;
        int i2 = postMessage + 97;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            externalOfferInformationDialogListener = read();
            int i3 = 13 / 0;
        } else {
            externalOfferInformationDialogListener = read();
        }
        int i4 = postMessage + 87;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return externalOfferInformationDialogListener;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        SessionState sessionState = (SessionState) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 81;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskAsInterface = asInterface(sessionState);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = newAuthTabSession + 41;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 11;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2029316864, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2029316806);
        int i4 = newAuthTabSession + 55;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit asInterface(Throwable th) {
        int i = 2 % 2;
        int i2 = postMessage + 65;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(th);
        int i4 = postMessage + 57;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess100;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        TriggersResult triggersResult = (TriggersResult) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 25;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(triggersResult);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ ImageRequests_androidKtExternalSyntheticLambda2 extraCallback() {
        int i = 2 % 2;
        int i2 = postMessage + 89;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ImageRequests_androidKtExternalSyntheticLambda2 imageRequests_androidKtExternalSyntheticLambda2AddObserverForBackInvoker = addObserverForBackInvoker();
        int i4 = newAuthTabSession + 99;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return imageRequests_androidKtExternalSyntheticLambda2AddObserverForBackInvoker;
    }

    public static /* synthetic */ void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 51;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsServiceStubProxy(function1, obj);
        int i4 = newAuthTabSession + 69;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        CheckoutResult checkoutResult = (CheckoutResult) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 97;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{checkoutResult}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1261714768, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1261714711);
        int i4 = newAuthTabSession + 73;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 71;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        _init_lambda3();
        int i4 = postMessage + 5;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 73;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService_Parcel(function1, obj);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = newAuthTabSession + 97;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ RxSharedApiCall extraCommand() throws Throwable {
        RxSharedApiCall rxSharedApiCallFullyDrawnReporter_delegatelambda00;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 79;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            rxSharedApiCallFullyDrawnReporter_delegatelambda00 = fullyDrawnReporter_delegatelambda00();
            int i3 = 92 / 0;
        } else {
            rxSharedApiCallFullyDrawnReporter_delegatelambda00 = fullyDrawnReporter_delegatelambda00();
        }
        int i4 = newAuthTabSession + 3;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return rxSharedApiCallFullyDrawnReporter_delegatelambda00;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp extraCommand(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 49;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub(function1, obj);
        int i4 = newAuthTabSession + 81;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeipITrustedWebActivityCallbackStub;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = postMessage + 109;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            ResultReceiver1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitResultReceiver1 = ResultReceiver1();
        int i3 = postMessage + 113;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return unitResultReceiver1;
    }

    public static /* synthetic */ deserializeIp getInterfaceDescriptor(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 53;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipExtraCallback = extraCallback(th);
        int i4 = postMessage + 79;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeipExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 13;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(function1, obj);
        int i4 = newAuthTabSession + 29;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIEngagementSignalsCallbackStub;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk isEngagementSignalsApiAvailable(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 125;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIEngagementSignalsCallback = IEngagementSignalsCallback(function1, obj);
        int i4 = postMessage + 25;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIEngagementSignalsCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 63;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityService(function1, obj);
        int i4 = postMessage + 43;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ boolean mayLaunchUrl(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 75;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zValidateRelationship = validateRelationship(function1, obj);
        int i4 = postMessage + 125;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return zValidateRelationship;
    }

    public static /* synthetic */ ProductDetailsPricingPhase newAuthTabSession() {
        int i = 2 % 2;
        int i2 = postMessage + 3;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return MediaDescriptionCompat();
        }
        MediaDescriptionCompat();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void newSession(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 103;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setEngagementSignalsCallback(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ TouchInterceptFrameLayout1 newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 29;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            throw null;
        }
        TouchInterceptFrameLayout1 touchInterceptFrameLayout1R8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        int i3 = newAuthTabSession + 103;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return touchInterceptFrameLayout1R8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk newSessionWithExtras(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 85;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            updateVisuals(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskUpdateVisuals = updateVisuals(function1, obj);
        int i3 = newAuthTabSession + 19;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskUpdateVisuals;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        GriverDecodeUrl21 griverDecodeUrl21;
        int i = 2 % 2;
        int i2 = postMessage + 5;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            griverDecodeUrl21 = (GriverDecodeUrl21) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 882061682, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -882061652);
            int i3 = 59 / 0;
        } else {
            griverDecodeUrl21 = (GriverDecodeUrl21) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 882061682, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -882061652);
        }
        int i4 = postMessage + 85;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return griverDecodeUrl21;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getBillingPeriod onActivityLayout() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 87;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        getBillingPeriod getbillingperiodR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        int i4 = postMessage + 21;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return getbillingperiodR8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        VarsResult varsResult = (VarsResult) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 111;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = IAuthTabCallbackDefault(varsResult);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = postMessage + 13;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallbackIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ ConstraintsSizeResolverExternalSyntheticLambda0 onActivityResized() {
        int i = 2 % 2;
        int i2 = postMessage + 61;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0AccessensureViewModelStore = accessensureViewModelStore();
        int i4 = postMessage + 101;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return constraintsSizeResolverExternalSyntheticLambda0AccessensureViewModelStore;
    }

    public static /* synthetic */ void onActivityResized(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 81;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1600859163, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1600859186);
        int i4 = postMessage + 113;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ CharSequence onExtraCallback(Context context, RSASSAPSSparams rSASSAPSSparams) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 67;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return (CharSequence) onExtraCallbackWithResult(new Object[]{context, rSASSAPSSparams}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1154427150, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1154427095);
        }
        CharSequence charSequence = (CharSequence) onExtraCallbackWithResult(new Object[]{context, rSASSAPSSparams}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1154427150, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1154427095);
        int i3 = 56 / 0;
        return charSequence;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = postMessage + 65;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitParcelableVolumeInfo = ParcelableVolumeInfo();
        int i4 = newAuthTabSession + 93;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unitParcelableVolumeInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 105;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, str2, str3, trackeventsynchronously);
        int i4 = postMessage + 1;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 57;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnActivityResized = onActivityResized(th);
        int i4 = postMessage + 109;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return deserializeipOnActivityResized;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallback(AppState appState) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 119;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback = IAuthTabCallback(appState);
        int i4 = postMessage + 65;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback;
    }

    public static /* synthetic */ setCommonNetworkProxy onExtraCallback() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 71;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setCommonNetworkProxy setcommonnetworkproxyIconCompatParcelizer = IconCompatParcelizer();
        int i4 = postMessage + 33;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return setcommonnetworkproxyIconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = postMessage + 39;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function0);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 65;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        IPostMessageServiceStub(function1, obj);
        int i4 = newAuthTabSession + 53;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 105;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(bool);
        }
        asInterface(bool);
        throw null;
    }

    public static /* synthetic */ TubaVarV1SyncState.onExtraCallback.IAuthTabCallback onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 81;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallbackITrustedWebActivityCallback_Parcel = ITrustedWebActivityCallback_Parcel(function1, obj);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = postMessage + 87;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallbackITrustedWebActivityCallback_Parcel;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        Map mapOnExtraCallback;
        Object obj;
        int i7 = ~i6;
        int i8 = ~((~i2) | i7 | i3);
        int i9 = (~(i7 | (~i3))) | (~(i3 | i2));
        int i10 = (~(i2 | i6)) | i3;
        int i11 = i3 + i6 + i + ((-407681510) * i4) + ((-298114539) * i5);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i3) + 672923648 + (2103481690 * i6) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i) + ((-328728576) * i4) + ((-2108424192) * i5) + ((-1296629760) * i12);
        int i14 = ((i3 * 57881544) - 1472685786) + (i6 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * 205) + (i * 57881749) + (i4 * 289608994) + (i5 * 969284153) + (i12 * 813891584);
        switch (i13 + (i14 * i14 * 454098944)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                int i15 = 2 % 2;
                int i16 = newAuthTabSession + 95;
                postMessage = i16 % 128;
                int i17 = i16 % 2;
                TouchInterceptFrameLayout1 touchInterceptFrameLayout1 = (TouchInterceptFrameLayout1) onMessageChannelReady.getValue();
                int i18 = postMessage + 97;
                newAuthTabSession = i18 % 128;
                int i19 = i18 % 2;
                return touchInterceptFrameLayout1;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                Function1 function1 = (Function1) objArr[0];
                Object obj2 = objArr[1];
                int i20 = 2 % 2;
                int i21 = newAuthTabSession + 71;
                postMessage = i21 % 128;
                int i22 = i21 % 2;
                function1.invoke(obj2);
                int i23 = postMessage + 73;
                newAuthTabSession = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 5:
                int i25 = 2 % 2;
                maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new onMessageChannelReady(null), 3, (Object) null);
                int i26 = postMessage + 99;
                newAuthTabSession = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 6:
                Function1 function12 = (Function1) objArr[0];
                Object obj3 = objArr[1];
                int i28 = 2 % 2;
                int i29 = postMessage + 1;
                newAuthTabSession = i29 % 128;
                int i30 = i29 % 2;
                writeTypedList(function12, obj3);
                int i31 = postMessage + 105;
                newAuthTabSession = i31 % 128;
                int i32 = i31 % 2;
                return null;
            case 7:
                return onWarmupCompleted(objArr);
            case 8:
                return IAuthTabCallback(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return onTransact(objArr);
            case 13:
                return IAuthTabCallbackStub(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return access000(objArr);
            case 17:
                return IAuthTabCallbackStubProxy(objArr);
            case 18:
                return access100(objArr);
            case 19:
                return extraCallback(objArr);
            case 20:
                return ICustomTabsCallback(objArr);
            case 21:
                return extraCallbackWithResult(objArr);
            case 22:
                return writeTypedObject(objArr);
            case 23:
                return readTypedObject(objArr);
            case 24:
                return onMessageChannelReady(objArr);
            case 25:
                return onMinimized(objArr);
            case 26:
                return onActivityLayout(objArr);
            case 27:
                return onPostMessage(objArr);
            case 28:
                return onActivityResized(objArr);
            case 29:
                return ICustomTabsCallbackDefault(objArr);
            case 30:
                return onUnminimized(objArr);
            case 31:
                return ICustomTabsCallbackStubProxy(objArr);
            case 32:
                return onRelationshipValidationResult(objArr);
            case 33:
                return ICustomTabsCallbackStub(objArr);
            case 34:
                return ICustomTabsService(objArr);
            case 35:
                return extraCommand(objArr);
            case 36:
                return ICustomTabsCallback_Parcel(objArr);
            case 37:
                return mayLaunchUrl(objArr);
            case 38:
                return isEngagementSignalsApiAvailable(objArr);
            case 39:
                return prefetch(objArr);
            case 40:
                return newSession(objArr);
            case 41:
                return newAuthTabSession(objArr);
            case 42:
                return newSessionWithExtras(objArr);
            case 43:
                return postMessage(objArr);
            case 44:
                return setEngagementSignalsCallback(objArr);
            case 45:
                return requestPostMessageChannelWithExtras(objArr);
            case 46:
                return requestPostMessageChannel(objArr);
            case 47:
                return prefetchWithMultipleUrls(objArr);
            case 48:
                return receiveFile(objArr);
            case 49:
                return validateRelationship(objArr);
            case 50:
                return ICustomTabsServiceDefault(objArr);
            case 51:
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
                int i33 = 2 % 2;
                int i34 = newAuthTabSession + 89;
                postMessage = i34 % 128;
                if (i34 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    mapOnExtraCallback = setDetectableSize.onExtraCallback();
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-116, -117, -97, -98}, (ViewConfiguration.getWindowTouchSlop() + 51) * 72, objArr2);
                    obj = objArr2[0];
                } else {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    mapOnExtraCallback = setDetectableSize.onExtraCallback();
                    Object[] objArr3 = new Object[1];
                    a(null, null, new byte[]{-116, -117, -97, -98}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, objArr3);
                    obj = objArr3[0];
                }
                mapOnExtraCallback.put(((String) obj).intern(), "medium");
                return Unit.INSTANCE;
            case 52:
                int i35 = 2 % 2;
                setTopGuideText.onWarmupCompleted.onExtraCallback(new getBacktraceNote() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda21
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return UST_CERT_GetPublicKeyInfo.onNavigationEvent((String) obj4, (String) obj5, (String) obj6);
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i36 = postMessage + 65;
                newAuthTabSession = i36 % 128;
                int i37 = i36 % 2;
                return unit;
            case 53:
                return warmup(objArr);
            case 54:
                return updateVisuals(objArr);
            case 55:
                return ICustomTabsServiceStub(objArr);
            case 56:
                return ICustomTabsServiceStubProxy(objArr);
            case 57:
                return IEngagementSignalsCallback(objArr);
            case 58:
                int i38 = 2 % 2;
                int i39 = newAuthTabSession + 53;
                postMessage = i39 % 128;
                int i40 = i39 % 2;
                MaxAdViewImpla maxAdViewImplaOnExtraCallback = MaxAdViewImpla.Companion.onExtraCallback();
                maxAdViewImplaOnExtraCallback.onWarmupCompleted(onWarmupCompleted.onSessionEnded());
                maxAdViewImplaOnExtraCallback.onExtraCallback();
                maxAdViewImplaOnExtraCallback.onWarmupCompleted("onValidSessionStarted");
                Unit unit2 = Unit.INSTANCE;
                int i41 = newAuthTabSession + 107;
                postMessage = i41 % 128;
                int i42 = i41 % 2;
                return unit2;
            case 59:
                return writeTypedList(objArr);
            case 60:
                return access200(objArr);
            case 61:
                return ICustomTabsService_Parcel(objArr);
            case 62:
                Throwable th = (Throwable) objArr[0];
                int i43 = 2 % 2;
                int i44 = postMessage + 83;
                newAuthTabSession = i44 % 128;
                int i45 = i44 % 2;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "checkout", "getUserInitDataFlowable error", th, (Map) null, 8, (Object) null);
                Unit unit3 = Unit.INSTANCE;
                int i46 = postMessage + 13;
                newAuthTabSession = i46 % 128;
                int i47 = i46 % 2;
                return unit3;
            case 63:
                return IEngagementSignalsCallbackDefault(objArr);
            case 64:
                return onGreatestScrollPercentageIncreased(objArr);
            case 65:
                return onVerticalScrollEvent(objArr);
            case 66:
                return IEngagementSignalsCallbackStub(objArr);
            case 67:
                return onSessionEnded(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TubaVarV1SyncState.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = postMessage + 61;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallback);
        int i4 = newAuthTabSession + 107;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossApiCallException tossApiCallException) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 5;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(tossApiCallException);
        }
        IAuthTabCallback(tossApiCallException);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback_Parcel(th);
            throw null;
        }
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(th);
        int i3 = newAuthTabSession + 53;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 29;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{setDetectableSize}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1217416328, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1217416290);
        int i4 = newAuthTabSession + 103;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(SessionState sessionState) {
        int i = 2 % 2;
        int i2 = postMessage + 79;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnNavigationEvent = onNavigationEvent(sessionState);
        int i4 = postMessage + 71;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnNavigationEvent;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Boolean bool) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 15;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(bool);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAsBinder = asBinder(bool);
        int i3 = newAuthTabSession + 103;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return zAsBinder;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        GyrShakeHelper gyrShakeHelperR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 21;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            gyrShakeHelperR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            int i3 = 26 / 0;
        } else {
            gyrShakeHelperR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }
        int i4 = newAuthTabSession + 35;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return gyrShakeHelperR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    public static /* synthetic */ Unit onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 25;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return RatingCompatApi19Impl();
        }
        RatingCompatApi19Impl();
        throw null;
    }

    public static /* synthetic */ void onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 115;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        IPostMessageServiceDefault(function1, obj);
        int i4 = newAuthTabSession + 23;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ getStartTimeMillis onMinimized() {
        int i = 2 % 2;
        int i2 = postMessage + 109;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return (getStartTimeMillis) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1741817372, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1741817432);
        }
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 99;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskWarmup = warmup(function1, obj);
        int i4 = postMessage + 91;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskWarmup;
    }

    public static /* synthetic */ TubaVarV1SyncState.onExtraCallback.IAuthTabCallback onNavigationEvent(VarsResult varsResult) {
        int i = 2 % 2;
        int i2 = postMessage + 67;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackStub = IAuthTabCallbackStub(varsResult);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return iAuthTabCallbackIAuthTabCallbackStub;
    }

    public static /* synthetic */ AppState onNavigationEvent() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 91;
        postMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            obj.hashCode();
            throw null;
        }
        AppState appStateR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        int i3 = newAuthTabSession + 25;
        postMessage = i3 % 128;
        if (i3 % 2 == 0) {
            return appStateR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TubaVarV1SyncState.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 119;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallback);
        int i4 = newAuthTabSession + 111;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossApiCallException tossApiCallException, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 31;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossApiCallException, trackeventsynchronously);
        int i4 = newAuthTabSession + 27;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 97;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(bool);
        int i4 = postMessage + 19;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 107;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(str, str2, str3);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, str3);
        int i3 = postMessage + 79;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = postMessage + 61;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(th);
        int i4 = newAuthTabSession + 81;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 121;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(setDetectableSize);
        }
        asInterface(setDetectableSize);
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(Pair pair) {
        int i = 2 % 2;
        int i2 = postMessage + 43;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(pair);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = newAuthTabSession + 3;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 59;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zIEngagementSignalsCallbackStubProxy = IEngagementSignalsCallbackStubProxy(function1, obj);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return zIEngagementSignalsCallbackStubProxy;
    }

    public static /* synthetic */ TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 37;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return receiveFile(function1, obj);
        }
        receiveFile(function1, obj);
        throw null;
    }

    public static /* synthetic */ Unit onPostMessage() {
        int i = 2 % 2;
        int i2 = postMessage + 37;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1979946714, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1979946671);
        int i4 = postMessage + 95;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ RxSharedApiCall onRelationshipValidationResult() throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 49;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            createFullyDrawnExecutor();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RxSharedApiCall rxSharedApiCallCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        int i3 = newAuthTabSession + 37;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return rxSharedApiCallCreateFullyDrawnExecutor;
    }

    public static /* synthetic */ Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(th);
        int i4 = postMessage + 91;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ isJacksonCreator onTransact() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 97;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        isJacksonCreator isjacksoncreator = (isJacksonCreator) onExtraCallbackWithResult(objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback, 1811562691, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1811562684);
        int i4 = postMessage + 11;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return isjacksoncreator;
        }
        throw null;
    }

    public static /* synthetic */ boolean onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 107;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return prefetchWithMultipleUrls(function1, obj);
        }
        prefetchWithMultipleUrls(function1, obj);
        throw null;
    }

    public static /* synthetic */ UST_CERT_VerifyVID onUnminimized() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 57;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_VerifyVID uST_CERT_VerifyVIDWarmup = warmup();
        int i4 = newAuthTabSession + 93;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return uST_CERT_VerifyVIDWarmup;
        }
        throw null;
    }

    public static /* synthetic */ void onUnminimized(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 105;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1092676949, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1092677014);
        int i4 = postMessage + 111;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TrackLog.onWarmupCompleted onwarmupcompleted, Context context, List list) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 79;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onwarmupcompleted, context, list);
        int i4 = postMessage + 63;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SessionState.State state) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 83;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(state);
        int i4 = newAuthTabSession + 25;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Boolean bool) {
        int i = 2 % 2;
        int i2 = postMessage + 29;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(bool);
        int i4 = newAuthTabSession + 43;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Pair pair) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 3;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{pair}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1375235934, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1375235954);
        int i4 = postMessage + 97;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(VarsResult varsResult) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = postMessage + 63;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {varsResult};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 == 0) {
            deserializeip = (deserializeIp) onExtraCallbackWithResult(objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback, -1601477221, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1601477260);
            int i4 = 26 / 0;
        } else {
            deserializeip = (deserializeIp) onExtraCallbackWithResult(objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback, -1601477221, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1601477260);
        }
        int i5 = newAuthTabSession + 123;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return deserializeip;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(SessionState sessionState) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 59;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallbackStub = IAuthTabCallbackStub(sessionState);
        int i4 = newAuthTabSession + 75;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(getMediationProvider getmediationprovider) {
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult = onExtraCallbackWithResult(getmediationprovider);
        int i4 = newAuthTabSession + 125;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 65;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        RatingCompat();
        int i4 = postMessage + 61;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1393189086, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1393189082);
            int i3 = 28 / 0;
        } else {
            onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1393189086, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1393189082);
        }
        int i4 = newAuthTabSession + 85;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ setTextProgressColor postMessage() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 47;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return (setTextProgressColor) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -536990510, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 536990537);
        }
        int i3 = 33 / 0;
        return (setTextProgressColor) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -536990510, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 536990537);
    }

    public static /* synthetic */ DeviceInfoFieldGroup prefetch() {
        int i = 2 % 2;
        int i2 = postMessage + 113;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsServiceStub();
        }
        ICustomTabsServiceStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp prefetch(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 1;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return IPostMessageService(function1, obj);
        }
        IPostMessageService(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ TubaVarV1SyncState.onExtraCallback.IAuthTabCallback readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 63;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallback = (TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -187434369, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 187434381);
        int i4 = postMessage + 7;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallback;
    }

    public static /* synthetic */ getTextProgressSize readTypedObject() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 33;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        getTextProgressSize gettextprogresssize_init_lambda2 = _init_lambda2();
        int i4 = newAuthTabSession + 23;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return gettextprogresssize_init_lambda2;
    }

    private static /* synthetic */ Object requestPostMessageChannel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 103;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipITrustedWebActivityCallbackStubProxy = ITrustedWebActivityCallbackStubProxy(function1, obj);
        int i4 = postMessage + 27;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeipITrustedWebActivityCallbackStubProxy;
        }
        throw null;
    }

    private static /* synthetic */ Object validateRelationship(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityCallbackDefault(function1, obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        int i = 2 % 2;
        int i2 = postMessage + 71;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getMediationProvider getmediationproviderRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i3 = postMessage + 29;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return getmediationproviderRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ GetInputImageFromPathAsGrayScale writeTypedObject() {
        int i = 2 % 2;
        int i2 = postMessage + 67;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleWrite = write();
        int i4 = newAuthTabSession + 1;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return getInputImageFromPathAsGrayScaleWrite;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 125;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnSessionEnded = onSessionEnded(function1, obj);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnSessionEnded;
    }

    public static final class ICustomTabsCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public ICustomTabsCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<VarsResult> apply(writeRaw<BaseApiResponse<VarsResult>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$removeOnUserLeaveHintListener(new Function1<BaseApiResponse<VarsResult>, deserializeIp<? extends VarsResult>>() { // from class: o.UST_CERT_GetPublicKeyInfo.ICustomTabsCallback.3
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends VarsResult> invoke(BaseApiResponse<VarsResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = VarsResult.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class extraCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public extraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<TriggersResult> apply(writeRaw<BaseApiResponse<TriggersResult>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$removeOnUserLeaveHintListener(new Function1<BaseApiResponse<TriggersResult>, deserializeIp<? extends TriggersResult>>() { // from class: o.UST_CERT_GetPublicKeyInfo.extraCallback.4
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends TriggersResult> invoke(BaseApiResponse<TriggersResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = TriggersResult.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onActivityLayout<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onActivityLayout(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<VarsResult> apply(writeRaw<BaseApiResponse<VarsResult>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$removeOnUserLeaveHintListener(new Function1<BaseApiResponse<VarsResult>, deserializeIp<? extends VarsResult>>() { // from class: o.UST_CERT_GetPublicKeyInfo.onActivityLayout.2
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends VarsResult> invoke(BaseApiResponse<VarsResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = VarsResult.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onNavigationEvent;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onActivityResized<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallback;

        public onActivityResized(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<VarsResult> apply(writeRaw<BaseApiResponse<VarsResult>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$removeOnUserLeaveHintListener(new Function1<BaseApiResponse<VarsResult>, deserializeIp<? extends VarsResult>>() { // from class: o.UST_CERT_GetPublicKeyInfo.onActivityResized.1
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends VarsResult> invoke(BaseApiResponse<VarsResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = VarsResult.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onPostMessage<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onPostMessage(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<TriggersResult> apply(writeRaw<BaseApiResponse<TriggersResult>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$removeOnUserLeaveHintListener(new Function1<BaseApiResponse<TriggersResult>, deserializeIp<? extends TriggersResult>>() { // from class: o.UST_CERT_GetPublicKeyInfo.onPostMessage.1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends TriggersResult> invoke(BaseApiResponse<TriggersResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = TriggersResult.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onNavigationEvent;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class writeTypedObject<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public writeTypedObject(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<VarsResult> apply(writeRaw<BaseApiResponse<VarsResult>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$removeOnUserLeaveHintListener(new Function1<BaseApiResponse<VarsResult>, deserializeIp<? extends VarsResult>>() { // from class: o.UST_CERT_GetPublicKeyInfo.writeTypedObject.3
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends VarsResult> invoke(BaseApiResponse<VarsResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = VarsResult.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onExtraCallbackWithResult = -8003338206502848540L;
        private static int onNavigationEvent = 1;
        Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0199  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(char[] r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.a(char[], int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
        
            if (r5.onNavigationEvent(r11, r6, r7, r10) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
        
            if (r11.onNavigationEvent(r10) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
        
            r11 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.onNavigationEvent + 69;
            o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.IAuthTabCallback = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
        
            if ((r11 % 2) == 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
        
            r11 = 38 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r2 = r10.label
                r3 = 1
                if (r2 == 0) goto L2b
                int r1 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.IAuthTabCallback
                int r1 = r1 + 109
                int r4 = r1 % 128
                o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.onNavigationEvent = r4
                int r1 = r1 % r0
                if (r2 == r3) goto L22
                if (r2 != r0) goto L1a
                goto L22
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                java.lang.Object r0 = r10.L$0
                o.ProductDetailsPricingPhases r0 = (o.ProductDetailsPricingPhases) r0
                kotlin.ResultKt.onNavigationEvent(r11)
                goto Lae
            L2b:
                kotlin.ResultKt.onNavigationEvent(r11)
                o.UST_CERT_GetPublicKeyInfo r11 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted
                o.getStartTimeMillis r2 = o.UST_CERT_GetPublicKeyInfo.IAuthTabCallback(r11)
                o.ProductDetailsPricingPhases r2 = r2.onWarmupCompleted()
                r4 = 0
                if (r2 == 0) goto L8d
                int r5 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.IAuthTabCallback
                int r5 = r5 + 55
                int r6 = r5 % 128
                o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.onNavigationEvent = r6
                int r5 = r5 % r0
                o.ProductDetailsPricingPhases r5 = o.ProductDetailsPricingPhases.KOREAN
                if (r2 == r5) goto L8d
                o.ProductDetailsPricingPhase r5 = o.UST_CERT_GetPublicKeyInfo.IAuthTabCallbackStub(r11)
                android.content.Context r11 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted(r11)
                o.zzad r6 = o.zzaj.onNavigationEvent()
                java.lang.String r6 = r6.getSmallIconBitmap()
                o.zzad r7 = o.zzaj.onNavigationEvent()
                boolean r7 = r7.RemoteActionCompatParcelizer()
                if (r7 == 0) goto L7c
                r7 = 5
                char[] r7 = new char[r7]
                r7 = {x00b2: FILL_ARRAY_DATA , data: [29362, 17866, 7241, -11036, -20634} // fill-array
                int r8 = android.view.View.resolveSize(r4, r4)
                int r8 = 14197 - r8
                java.lang.Object[] r9 = new java.lang.Object[r3]
                a(r7, r8, r9)
                r7 = r9[r4]
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r7 = r7.intern()
                goto L7e
            L7c:
                java.lang.String r7 = ""
            L7e:
                java.lang.Object r2 = o.access15400.onNavigationEvent(r2)
                r10.L$0 = r2
                r10.label = r3
                java.lang.Object r11 = r5.onNavigationEvent(r11, r6, r7, r10)
                if (r11 != r1) goto Lae
                goto L9f
            L8d:
                o.ProductDetailsPricingPhase r11 = o.UST_CERT_GetPublicKeyInfo.IAuthTabCallbackStub(r11)
                java.lang.Object r2 = o.access15400.onNavigationEvent(r2)
                r10.L$0 = r2
                r10.label = r0
                java.lang.Object r11 = r11.onNavigationEvent(r10)
                if (r11 != r1) goto Lae
            L9f:
                int r11 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.onNavigationEvent
                int r11 = r11 + 69
                int r2 = r11 % 128
                o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.IAuthTabCallback = r2
                int r11 = r11 % r0
                if (r11 == 0) goto Lad
                r11 = 38
                int r11 = r11 / r4
            Lad:
                return r1
            Lae:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static long onExtraCallbackWithResult = -4341429707283888466L;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        readTypedObject(access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = new readTypedObject(access13800Var);
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return readtypedobject;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            readTypedObject readtypedobjectCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return readtypedobjectCreate.invokeSuspend(unit);
            }
            readtypedobjectCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(char[] r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 415
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.readTypedObject.a(char[], int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[Catch: Exception -> 0x0110, CancellationException -> 0x011b, WebResourceResponseModel -> 0x011d, PHI: r2
          0x00c4: PHI (r2v22 com.google.android.gms.wearable.Node) = (r2v16 com.google.android.gms.wearable.Node), (r2v24 com.google.android.gms.wearable.Node) binds: [B:30:0x00c2, B:25:0x00af] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {CancellationException -> 0x011b, Exception -> 0x0110, WebResourceResponseModel -> 0x011d, blocks: (B:6:0x0019, B:15:0x0060, B:17:0x006e, B:18:0x008d, B:22:0x009e, B:24:0x00ae, B:32:0x00c8, B:31:0x00c4, B:29:0x00b4, B:33:0x00e0, B:35:0x010a, B:11:0x0028), top: B:47:0x000d }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.readTypedObject.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onTransact(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onNavigationEvent implements IAnimation<r8lambdaEK35TGWCjvE5YDlTcJsm53divws> {
            final /* synthetic */ IAnimation IAuthTabCallback;

            public onNavigationEvent(IAnimation iAnimation) {
                this.IAuthTabCallback = iAnimation;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                Object objCollect = this.IAuthTabCallback.collect(new AnonymousClass1(setripple), access13800Var);
                return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
            }

            /* renamed from: o.UST_CERT_GetPublicKeyInfo$onTransact$onNavigationEvent$1, reason: invalid class name */
            public static final class AnonymousClass1<T> implements setRipple {
                final /* synthetic */ setRipple IAuthTabCallback;

                /* renamed from: o.UST_CERT_GetPublicKeyInfo$onTransact$onNavigationEvent$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00061 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public C00061(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass1.this.emit(null, this);
                    }
                }

                public AnonymousClass1(setRipple setripple) {
                    this.IAuthTabCallback = setripple;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, o.access13800 r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof o.UST_CERT_GetPublicKeyInfo.onTransact.onNavigationEvent.AnonymousClass1.C00061
                        if (r0 == 0) goto L13
                        r0 = r7
                        o.UST_CERT_GetPublicKeyInfo$onTransact$onNavigationEvent$1$1 r0 = (o.UST_CERT_GetPublicKeyInfo.onTransact.onNavigationEvent.AnonymousClass1.C00061) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 + r2
                        r0.label = r1
                        goto L18
                    L13:
                        o.UST_CERT_GetPublicKeyInfo$onTransact$onNavigationEvent$1$1 r0 = new o.UST_CERT_GetPublicKeyInfo$onTransact$onNavigationEvent$1$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = o.access14300.onWarmupCompleted()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        o.setRipple r6 = (o.setRipple) r6
                        java.lang.Object r6 = r0.L$1
                        o.UST_CERT_GetPublicKeyInfo$onTransact$onNavigationEvent$1$1 r6 = (o.UST_CERT_GetPublicKeyInfo.onTransact.onNavigationEvent.AnonymousClass1.C00061) r6
                        kotlin.ResultKt.onNavigationEvent(r7)
                        goto L6d
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.ResultKt.onNavigationEvent(r7)
                        o.setRipple r7 = r5.IAuthTabCallback
                        r2 = r6
                        o.r8lambdaEK35TGWCjvE5YDlTcJsm53divws r2 = (o.r8lambdaEK35TGWCjvE5YDlTcJsm53divws) r2
                        o.shared r2 = r2.IAuthTabCallback()
                        o.shared r4 = o.shared.UNKNOWN
                        if (r2 == r4) goto L6d
                        java.lang.Object r2 = o.access15400.onNavigationEvent(r6)
                        r0.L$0 = r2
                        java.lang.Object r2 = o.access15400.onNavigationEvent(r0)
                        r0.L$1 = r2
                        java.lang.Object r2 = o.access15400.onNavigationEvent(r6)
                        r0.L$2 = r2
                        java.lang.Object r2 = o.access15400.onNavigationEvent(r7)
                        r0.L$3 = r2
                        r2 = 0
                        r0.I$0 = r2
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L6d
                        return r1
                    L6d:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.onTransact.onNavigationEvent.AnonymousClass1.emit(java.lang.Object, o.access13800):java.lang.Object");
                }
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimationIAuthTabCallback = getAppEnteredBackgroundTimeMillis.Companion.onExtraCallbackWithResult().IAuthTabCallback();
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = SessionState.onExtraCallback(SessionState.Companion.onExtraCallback(), false, 1, (Object) null);
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$initMydataRefreshAppOpen$1$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(UST_CERT_GetPublicKeyInfo.onTransact.onExtraCallback((SessionState.State) obj2));
                    }
                };
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(new deserializeLongCollection() { // from class: viva.republica.toss.core.AppStateHandler$initMydataRefreshAppOpen$1$$ExternalSyntheticLambda1
                    public final boolean test(Object obj2) {
                        return UST_CERT_GetPublicKeyInfo.onTransact.onExtraCallback(function1, obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
                IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(new onNavigationEvent(ycxycx.onWarmupCompleted(iAnimationIAuthTabCallback, ReactiveFlowKt.onWarmupCompleted(jsonReaderUnknownNumberParsingOnWarmupCompleted), new AnonymousClass5(null))), 500L);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnExtraCallbackWithResult, anonymousClass3, this) == objOnWarmupCompleted) {
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

        /* renamed from: o.UST_CERT_GetPublicKeyInfo$onTransact$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements getBacktraceNote<r8lambdaEK35TGWCjvE5YDlTcJsm53divws, SessionState.State, access13800<? super r8lambdaEK35TGWCjvE5YDlTcJsm53divws>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass5(access13800<? super AnonymousClass5> access13800Var) {
                super(3, access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws, SessionState.State state, access13800<? super r8lambdaEK35TGWCjvE5YDlTcJsm53divws> access13800Var) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(access13800Var);
                anonymousClass5.L$0 = r8lambdaek35tgwcjve5ydltcjsm53divws;
                return anonymousClass5.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws = (r8lambdaEK35TGWCjvE5YDlTcJsm53divws) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return r8lambdaek35tgwcjve5ydltcjsm53divws;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onExtraCallback(SessionState.State state) {
            return Intrinsics.areEqual(state, SessionState.State.LoginSession.onExtraCallbackWithResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onExtraCallback(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        /* renamed from: o.UST_CERT_GetPublicKeyInfo$onTransact$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<r8lambdaEK35TGWCjvE5YDlTcJsm53divws, access13800<? super Unit>, Object> {
            int I$0;
            int I$1;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            AnonymousClass3(access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(access13800Var);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws, access13800<? super Unit> access13800Var) {
                return create(r8lambdaek35tgwcjve5ydltcjsm53divws, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2;
                r8lambdaEK35TGWCjvE5YDlTcJsm53divws r8lambdaek35tgwcjve5ydltcjsm53divws = (r8lambdaEK35TGWCjvE5YDlTcJsm53divws) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        Result.Companion companion = Result.Companion;
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16806642), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                        }
                        Object obj3 = ((Field) objOnExtraCallback).get(null);
                        try {
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 29426), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, (Process.myPid() >> 22) + 24734, -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
                            }
                            FullScreenAd fullScreenAd = (FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj3, null);
                            String key = r8lambdaek35tgwcjve5ydltcjsm53divws.IAuthTabCallback().getKey();
                            String strOnExtraCallback = r8lambdaek35tgwcjve5ydltcjsm53divws.onExtraCallback();
                            this.L$0 = access15400.onNavigationEvent(r8lambdaek35tgwcjve5ydltcjsm53divws);
                            this.L$1 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.label = 1;
                            obj = fullScreenAd.onNavigationEvent("APP", "OPEN", key, strOnExtraCallback, this);
                            if (obj == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    obj2 = Result.constructor-impl(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj2);
                if (th2 != null) {
                    zzat.onExtraCallback().onExtraCallbackWithResult(th2, "initMydataRefreshAppOpen", false);
                }
                return Unit.INSTANCE;
            }
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ICustomTabsCallback_Parcel;
        char c = '0';
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int i5 = $10;
            int i6 = i5 + 105;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = i5 + 35;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 71 - TextUtils.indexOf("", c), (ViewConfiguration.getPressedStateDuration() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i10++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ICustomTabsCallback_Parcel;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = $10 + 75;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i4] = Integer.valueOf(iArr5[i13]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 72 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i13++;
                i3 = -1469660336;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i4;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i14;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i15 = $10 + 91;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i17 = $11 + 33;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            for (int i19 = 0; i19 < 16; i19++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i19];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.MeasureSpec.getSize(0)), 39 - TextUtils.indexOf("", ""), Color.red(0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 77 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.rgb(0, 0, 0) + 16784614, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i23 = $11 + 61;
        $10 = i23 % 128;
        int i24 = i23 % 2;
        objArr[0] = str;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = isEngagementSignalsApiAvailable;
        long j = 0;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(j) + 78, ExpandableListView.getPackedPositionChild(j) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(mayLaunchUrl)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 75, (Process.myTid() >> 22) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (ICustomTabsService) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 63 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!extraCommand) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 109;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] << iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted << 1;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i7 = $11 + 111;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $10 + 51;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 63 - Gravity.getAbsoluteGravity(0, 0), 12214 - (ViewConfiguration.getTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr6);
        int i11 = $10 + 73;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private UST_CERT_GetPublicKeyInfo() {
    }

    public static final /* synthetic */ getStartTimeMillis IAuthTabCallback(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = postMessage + 53;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        getStartTimeMillis getstarttimemillisIPostMessageServiceStub = uST_CERT_GetPublicKeyInfo.IPostMessageServiceStub();
        int i4 = postMessage + 109;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return getstarttimemillisIPostMessageServiceStub;
    }

    public static final /* synthetic */ GyrShakeHelper IAuthTabCallbackDefault(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 115;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        GyrShakeHelper gyrShakeHelperITrustedWebActivityCallbackStubProxy = uST_CERT_GetPublicKeyInfo.ITrustedWebActivityCallbackStubProxy();
        int i4 = newAuthTabSession + 125;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return gyrShakeHelperITrustedWebActivityCallbackStubProxy;
    }

    public static final /* synthetic */ ProductDetailsPricingPhase IAuthTabCallbackStub(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = postMessage + 25;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ProductDetailsPricingPhase productDetailsPricingPhaseITrustedWebActivityCallbackStub = uST_CERT_GetPublicKeyInfo.ITrustedWebActivityCallbackStub();
        int i4 = newAuthTabSession + 1;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return productDetailsPricingPhaseITrustedWebActivityCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object IEngagementSignalsCallbackDefault(Object[] objArr) {
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 73;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ProductDetailsResult productDetailsResult = (ProductDetailsResult) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -172548259, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 172548303);
        int i4 = newAuthTabSession + 1;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return productDetailsResult;
    }

    public static final /* synthetic */ forNonGDPRUser access100(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = postMessage + 37;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        forNonGDPRUser fornongdpruserCancelNotification = uST_CERT_GetPublicKeyInfo.cancelNotification();
        int i4 = postMessage + 43;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return fornongdpruserCancelNotification;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ GriverDecodeUrl21 asBinder(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 57;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return (GriverDecodeUrl21) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -761446785, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 761446825);
        }
        int i3 = 23 / 0;
        return (GriverDecodeUrl21) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -761446785, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 761446825);
    }

    public static final /* synthetic */ TouchInterceptFrameLayout1 getInterfaceDescriptor(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        TouchInterceptFrameLayout1 touchInterceptFrameLayout1;
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {uST_CERT_GetPublicKeyInfo};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 == 0) {
            touchInterceptFrameLayout1 = (TouchInterceptFrameLayout1) onExtraCallbackWithResult(objArr, iIAuthTabCallback2, iIAuthTabCallback, 1726970482, iIAuthTabCallback3, iIAuthTabCallback4, -1726970480);
            int i4 = 70 / 0;
        } else {
            touchInterceptFrameLayout1 = (TouchInterceptFrameLayout1) onExtraCallbackWithResult(objArr, iIAuthTabCallback2, iIAuthTabCallback, 1726970482, iIAuthTabCallback3, iIAuthTabCallback4, -1726970480);
        }
        int i5 = postMessage + 39;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return touchInterceptFrameLayout1;
    }

    public static final /* synthetic */ setCommonNetworkProxy onExtraCallback(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = postMessage + 13;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            uST_CERT_GetPublicKeyInfo.IPostMessageService();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setCommonNetworkProxy setcommonnetworkproxyIPostMessageService = uST_CERT_GetPublicKeyInfo.IPostMessageService();
        int i3 = newAuthTabSession + 95;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return setcommonnetworkproxyIPostMessageService;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 93;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ImageRequests_androidKtExternalSyntheticLambda2 smallIconId = uST_CERT_GetPublicKeyInfo.getSmallIconId();
        int i4 = newAuthTabSession + 95;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return smallIconId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ isJacksonCreator onExtraCallbackWithResult(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = postMessage + 1;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        isJacksonCreator isjacksoncreatorOnGreatestScrollPercentageIncreased = uST_CERT_GetPublicKeyInfo.onGreatestScrollPercentageIncreased();
        int i4 = newAuthTabSession + 99;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return isjacksoncreatorOnGreatestScrollPercentageIncreased;
        }
        throw null;
    }

    public static final /* synthetic */ DeviceInfoFieldGroup onNavigationEvent(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = postMessage + 57;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        DeviceInfoFieldGroup deviceInfoFieldGroupIEngagementSignalsCallbackDefault = uST_CERT_GetPublicKeyInfo.IEngagementSignalsCallbackDefault();
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = newAuthTabSession + 69;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return deviceInfoFieldGroupIEngagementSignalsCallbackDefault;
        }
        throw null;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 55;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        getTextProgressSize gettextprogresssizeITrustedWebActivityService = uST_CERT_GetPublicKeyInfo.ITrustedWebActivityService();
        int i4 = newAuthTabSession + 109;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return gettextprogresssizeITrustedWebActivityService;
    }

    public static final /* synthetic */ setAlogFlushAddr onTransact(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = postMessage + 77;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        setAlogFlushAddr setalogflushaddrITrustedWebActivityCallback = uST_CERT_GetPublicKeyInfo.ITrustedWebActivityCallback();
        int i4 = newAuthTabSession + 45;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return setalogflushaddrITrustedWebActivityCallback;
    }

    public static final /* synthetic */ Context onWarmupCompleted(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = postMessage + 79;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnSessionEnded = uST_CERT_GetPublicKeyInfo.onSessionEnded();
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        int i5 = postMessage + 25;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 != 0) {
            return contextOnSessionEnded;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object requestPostMessageChannelWithExtras(Object[] objArr) {
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 117;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setTextProgressColor settextprogresscolorAreNotificationsEnabled = uST_CERT_GetPublicKeyInfo.areNotificationsEnabled();
        int i4 = newAuthTabSession + 103;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return settextprogresscolorAreNotificationsEnabled;
    }

    private static /* synthetic */ Object writeTypedList(Object[] objArr) {
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 9;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {uST_CERT_GetPublicKeyInfo};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBillingPeriod getbillingperiod = (getBillingPeriod) onExtraCallbackWithResult(objArr2, iIAuthTabCallback2, iIAuthTabCallback, 2058036084, iIAuthTabCallback3, iIAuthTabCallback4, -2058036068);
        int i4 = newAuthTabSession + 63;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return getbillingperiod;
    }

    static {
        ICustomTabsServiceDefault();
        onWarmupCompleted = new UST_CERT_GetPublicKeyInfo();
        ICustomTabsCallback = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        ICustomTabsCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda79
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.onActivityResized();
            }
        });
        ICustomTabsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda90
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.extraCallback();
            }
        });
        onActivityLayout = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda96
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.IAuthTabCallbackStubProxy();
            }
        });
        asInterface = ea10.onExtraCallbackWithResult("AppStateHandler");
        JsonReaderUnknownNumberParsing<AppState> jsonReaderUnknownNumberParsingOnExtraCallback = JsonReaderUnknownNumberParsing.onNavigationEvent(new Callable() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda97
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UST_CERT_GetPublicKeyInfo.onNavigationEvent();
            }
        }).onExtraCallback(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        IAuthTabCallback_Parcel = jsonReaderUnknownNumberParsingOnExtraCallback;
        JsonReaderUnknownNumberParsing<SessionState> jsonReaderUnknownNumberParsingOnExtraCallback2 = JsonReaderUnknownNumberParsing.onNavigationEvent(new Callable() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda98
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UST_CERT_GetPublicKeyInfo.IAuthTabCallbackStub();
            }
        }).onExtraCallback(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback2, "");
        extraCallbackWithResult = jsonReaderUnknownNumberParsingOnExtraCallback2;
        try {
            Object[] objArr = {UserChoiceBillingListener.onExtraCallback.onExtraCallback(), zzaj.onWarmupCompleted()};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1245209630);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 24 - KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(0) + 24259, -2071501454, false, (String) null, new Class[]{Context.class, zzag.class});
            }
            readTypedObject = ((Constructor) objOnExtraCallback).newInstance(objArr);
            writeTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda99
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.ICustomTabsCallbackStub();
                }
            });
            onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda100
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.writeTypedObject();
                }
            });
            onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda101
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.prefetch();
                }
            });
            IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda102
                public final Object invoke() {
                    return (useNavigationStyleTitleBar) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1662159298, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1662159267);
                }
            });
            onActivityResized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda103
                public final Object invoke() {
                    return (GyrShakeHelper) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1669138020, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1669137996);
                }
            });
            onMinimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda80
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.readTypedObject();
                }
            });
            onPostMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda81
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.postMessage();
                }
            });
            IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda82
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.onExtraCallback();
                }
            });
            getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda83
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.newAuthTabSession();
                }
            });
            IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda84
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.onMinimized();
                }
            });
            access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda85
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.onActivityLayout();
                }
            });
            ICustomTabsCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda86
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.IAuthTabCallback_Parcel();
                }
            });
            asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda87
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.asBinder();
                }
            });
            extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda88
                public final Object invoke() {
                    return (GriverDecodeUrl21) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1247178742, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1247178716);
                }
            });
            onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda89
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.onUnminimized();
                }
            });
            onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda91
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.newSessionWithExtras();
                }
            });
            access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda92
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.access100();
                }
            });
            IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda93
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.onTransact();
                }
            });
            onRelationshipValidationResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda94
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.extraCommand();
                }
            });
            onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda95
                public final Object invoke() {
                    return UST_CERT_GetPublicKeyInfo.onRelationshipValidationResult();
                }
            });
            onNavigationEvent = 8;
            int i = prefetch + 19;
            newSessionWithExtras = i % 128;
            if (i % 2 == 0) {
                int i2 = 22 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final ConstraintsSizeResolverExternalSyntheticLambda0 getSmallIconBitmap() {
        int i = 2 % 2;
        int i2 = postMessage + 61;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = (ConstraintsSizeResolverExternalSyntheticLambda0) ICustomTabsCallbackStubProxy.getValue();
        if (i3 != 0) {
            return constraintsSizeResolverExternalSyntheticLambda0;
        }
        throw null;
    }

    private static final ConstraintsSizeResolverExternalSyntheticLambda0 accessensureViewModelStore() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 71;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        if (i3 == 0) {
            return ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(contextOnExtraCallback, LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        }
        ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(contextOnExtraCallback, LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        throw null;
    }

    private final ImageRequests_androidKtExternalSyntheticLambda2 getSmallIconId() {
        int i = 2 % 2;
        int i2 = postMessage + 71;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ImageRequests_androidKtExternalSyntheticLambda2 imageRequests_androidKtExternalSyntheticLambda2 = (ImageRequests_androidKtExternalSyntheticLambda2) ICustomTabsCallbackStub.getValue();
        int i4 = newAuthTabSession + 113;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return imageRequests_androidKtExternalSyntheticLambda2;
    }

    private static final ImageRequests_androidKtExternalSyntheticLambda2 addObserverForBackInvoker() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 49;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        ImageRequests_androidKtExternalSyntheticLambda2 imageRequests_androidKtExternalSyntheticLambda2OnMinimized = ((RealSizeResolver) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RealSizeResolver.class)).onMinimized();
        int i4 = postMessage + 17;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return imageRequests_androidKtExternalSyntheticLambda2OnMinimized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final forNonGDPRUser cancelNotification() {
        int i = 2 % 2;
        int i2 = postMessage + 71;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        forNonGDPRUser fornongdpruser = (forNonGDPRUser) onActivityLayout.getValue();
        int i4 = newAuthTabSession + 7;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return fornongdpruser;
    }

    private static final forNonGDPRUser _init_lambda1() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 95;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        forNonGDPRUser fornongdpruserRequiresPermissionRead = ((forGDPRUser) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), forGDPRUser.class)).RequiresPermissionRead();
        int i4 = postMessage + 91;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return fornongdpruserRequiresPermissionRead;
    }

    private static final AppState r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 45;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        AppState appStateOnExtraCallbackWithResult = AppState.Companion.onExtraCallbackWithResult();
        int i4 = newAuthTabSession + 43;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return appStateOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final SessionState r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int i = 2 % 2;
        int i2 = postMessage + 83;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        SessionState sessionStateOnExtraCallback = SessionState.Companion.onExtraCallback();
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return sessionStateOnExtraCallback;
    }

    private final isWifiEnabled ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = postMessage + 21;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        isWifiEnabled iswifienabled = (isWifiEnabled) writeTypedObject.getValue();
        int i4 = newAuthTabSession + 85;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return iswifienabled;
    }

    private static final isWifiEnabled r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        int i = 2 % 2;
        int i2 = postMessage + 47;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            ((RVTabbarLayout1) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RVTabbarLayout1.class)).prefetch();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        isWifiEnabled iswifienabledPrefetch = ((RVTabbarLayout1) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RVTabbarLayout1.class)).prefetch();
        int i3 = postMessage + 35;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return iswifienabledPrefetch;
    }

    private final GetInputImageFromPathAsGrayScale IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = postMessage + 31;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScale = (GetInputImageFromPathAsGrayScale) onTransact.getValue();
        int i4 = postMessage + 125;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return getInputImageFromPathAsGrayScale;
    }

    private static final GetInputImageFromPathAsGrayScale write() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 1;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleRinteger = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).Rinteger();
        int i4 = newAuthTabSession + 31;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return getInputImageFromPathAsGrayScaleRinteger;
        }
        throw null;
    }

    private final DeviceInfoFieldGroup IEngagementSignalsCallbackDefault() {
        DeviceInfoFieldGroup deviceInfoFieldGroup;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 103;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            deviceInfoFieldGroup = (DeviceInfoFieldGroup) onExtraCallbackWithResult.getValue();
            int i3 = 69 / 0;
        } else {
            deviceInfoFieldGroup = (DeviceInfoFieldGroup) onExtraCallbackWithResult.getValue();
        }
        int i4 = newAuthTabSession + 105;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return deviceInfoFieldGroup;
    }

    private static final DeviceInfoFieldGroup ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 29;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        DeviceInfoFieldGroup deviceInfoFieldGroupIEngagementSignalsCallbackStub = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).IEngagementSignalsCallbackStub();
        int i4 = postMessage + 71;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return deviceInfoFieldGroupIEngagementSignalsCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final useNavigationStyleTitleBar onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 95;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        useNavigationStyleTitleBar usenavigationstyletitlebar = (useNavigationStyleTitleBar) IAuthTabCallbackDefault.getValue();
        if (i3 == 0) {
            return usenavigationstyletitlebar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final useNavigationStyleTitleBar writeTypedList() {
        int i = 2 % 2;
        int i2 = postMessage + 71;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        if (i3 != 0) {
            return ((IAuthTabCallback) Response.onExtraCallback(contextOnExtraCallback, IAuthTabCallback.class)).ActivityResultCallerKtExternalSyntheticLambda1();
        }
        int i4 = 67 / 0;
        return ((IAuthTabCallback) Response.onExtraCallback(contextOnExtraCallback, IAuthTabCallback.class)).ActivityResultCallerKtExternalSyntheticLambda1();
    }

    private final GyrShakeHelper ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = postMessage + 17;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        GyrShakeHelper gyrShakeHelper = (GyrShakeHelper) onActivityResized.getValue();
        int i4 = postMessage + 73;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return gyrShakeHelper;
    }

    private static final GyrShakeHelper r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 53;
        postMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            GyrShakeHelper gyrShakeHelperRequestPostMessageChannelWithExtras = ((GyrShakeHelper.IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), GyrShakeHelper.IAuthTabCallback.class)).requestPostMessageChannelWithExtras();
            int i3 = postMessage + 123;
            newAuthTabSession = i3 % 128;
            if (i3 % 2 != 0) {
                return gyrShakeHelperRequestPostMessageChannelWithExtras;
            }
            obj.hashCode();
            throw null;
        }
        ((GyrShakeHelper.IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), GyrShakeHelper.IAuthTabCallback.class)).requestPostMessageChannelWithExtras();
        obj.hashCode();
        throw null;
    }

    private final getTextProgressSize ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 95;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        getTextProgressSize gettextprogresssize = (getTextProgressSize) onMinimized.getValue();
        int i4 = postMessage + 5;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return gettextprogresssize;
    }

    private static final getTextProgressSize _init_lambda2() {
        int i = 2 % 2;
        int i2 = postMessage + 105;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        getTextProgressSize lifecycle = ((issueCert) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), issueCert.class)).getLifecycle();
        int i4 = newAuthTabSession + 75;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return lifecycle;
    }

    private final setTextProgressColor areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 95;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        setTextProgressColor settextprogresscolor = (setTextProgressColor) onPostMessage.getValue();
        int i3 = postMessage + 47;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return settextprogresscolor;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 23;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setTextProgressColor settextprogresscolorInitializeViewTreeOwners = ((issueCert) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), issueCert.class)).initializeViewTreeOwners();
        int i4 = newAuthTabSession + 63;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return settextprogresscolorInitializeViewTreeOwners;
    }

    private final setCommonNetworkProxy IPostMessageService() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 5;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setCommonNetworkProxy setcommonnetworkproxy = (setCommonNetworkProxy) IAuthTabCallbackStubProxy.getValue();
        int i4 = newAuthTabSession + 71;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return setcommonnetworkproxy;
    }

    private static final setCommonNetworkProxy IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 3;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setCommonNetworkProxy setcommonnetworkproxyOnNavigationEvent = setCommonNetworkProxy.Companion.onNavigationEvent();
        int i4 = postMessage + 41;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return setcommonnetworkproxyOnNavigationEvent;
    }

    public final getTileModeX<Unit> prefetchWithMultipleUrls() throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 77;
        newAuthTabSession = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Object obj = readTypedObject;
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1462669712);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.alpha(0) + 24259, 1718513408, false, "onNavigationEvent", new Class[0]);
                }
                return (getTileModeX) ((Method) objOnExtraCallback).invoke(obj, null);
            }
            Object obj2 = readTypedObject;
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1462669712);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - Color.blue(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 24259, 1718513408, false, "onNavigationEvent", new Class[0]);
            }
            getTileModeX<Unit> gettilemodex = (getTileModeX) ((Method) objOnExtraCallback2).invoke(obj2, null);
            int i3 = 66 / 0;
            return gettilemodex;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private final ProductDetailsPricingPhase ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = postMessage + 89;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ProductDetailsPricingPhase productDetailsPricingPhase = (ProductDetailsPricingPhase) getInterfaceDescriptor.getValue();
        int i4 = postMessage + 95;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return productDetailsPricingPhase;
    }

    private static final ProductDetailsPricingPhase MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 83;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).Rstring();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProductDetailsPricingPhase productDetailsPricingPhaseRstring = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).Rstring();
        int i3 = newAuthTabSession + 125;
        postMessage = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 93 / 0;
        }
        return productDetailsPricingPhaseRstring;
    }

    private final getStartTimeMillis IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 83;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object value = IAuthTabCallbackStub.getValue();
        if (i3 == 0) {
            return (getStartTimeMillis) value;
        }
        throw null;
    }

    private static /* synthetic */ Object access200(Object[] objArr) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 107;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            getStartTimeMillis.Companion.onExtraCallback();
            throw null;
        }
        getStartTimeMillis getstarttimemillisOnExtraCallback = getStartTimeMillis.Companion.onExtraCallback();
        int i3 = postMessage + 37;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return getstarttimemillisOnExtraCallback;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getBillingPeriod getbillingperiod;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 55;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            getbillingperiod = (getBillingPeriod) access000.getValue();
            int i3 = 7 / 0;
        } else {
            getbillingperiod = (getBillingPeriod) access000.getValue();
        }
        int i4 = postMessage + 19;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return getbillingperiod;
    }

    private static final getBillingPeriod r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int i = 2 % 2;
        int i2 = postMessage + 15;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        if (i3 != 0) {
            return ((IAuthTabCallback) Response.onExtraCallback(contextOnExtraCallback, IAuthTabCallback.class)).setSupportProgressBarVisibility();
        }
        ((IAuthTabCallback) Response.onExtraCallback(contextOnExtraCallback, IAuthTabCallback.class)).setSupportProgressBarVisibility();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object setEngagementSignalsCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 89;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        ProductDetailsResult productDetailsResult = (ProductDetailsResult) ICustomTabsCallbackDefault.getValue();
        int i4 = postMessage + 69;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return productDetailsResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ProductDetailsResult defaultViewModelProviderFactory_delegatelambda0() {
        int i = 2 % 2;
        int i2 = postMessage + 119;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ProductDetailsResult backgroundResource = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).setBackgroundResource();
        int i4 = postMessage + 53;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return backgroundResource;
    }

    private final ExternalOfferInformationDialogListener IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 73;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object value = asBinder.getValue();
        if (i3 == 0) {
            return (ExternalOfferInformationDialogListener) value;
        }
        int i4 = 65 / 0;
        return (ExternalOfferInformationDialogListener) value;
    }

    private static final ExternalOfferInformationDialogListener read() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 63;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        ExternalOfferInformationDialogListener externalOfferInformationDialogListenerRequiresExtension = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).RequiresExtension();
        int i4 = newAuthTabSession + 111;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return externalOfferInformationDialogListenerRequiresExtension;
        }
        throw null;
    }

    private static /* synthetic */ Object newSession(Object[] objArr) {
        int i = 2 % 2;
        int i2 = postMessage + 91;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        GriverDecodeUrl21 griverDecodeUrl21 = (GriverDecodeUrl21) extraCallback.getValue();
        int i4 = postMessage + 77;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return griverDecodeUrl21;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 53;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            ((GriverDecodeUrl21.onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), GriverDecodeUrl21.onNavigationEvent.class)).PlaybackStateCompat();
            throw null;
        }
        GriverDecodeUrl21 griverDecodeUrl21PlaybackStateCompat = ((GriverDecodeUrl21.onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), GriverDecodeUrl21.onNavigationEvent.class)).PlaybackStateCompat();
        int i3 = newAuthTabSession + 47;
        postMessage = i3 % 128;
        if (i3 % 2 == 0) {
            return griverDecodeUrl21PlaybackStateCompat;
        }
        throw null;
    }

    private final UST_CERT_VerifyVID IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = postMessage + 67;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_VerifyVID uST_CERT_VerifyVID = (UST_CERT_VerifyVID) onExtraCallback.getValue();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return uST_CERT_VerifyVID;
    }

    private static final UST_CERT_VerifyVID warmup() {
        UST_CERT_VerifyVID uST_CERT_VerifyVIDPredictiveBackHandlerKtExternalSyntheticLambda5;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 37;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            uST_CERT_VerifyVIDPredictiveBackHandlerKtExternalSyntheticLambda5 = ((UST_CERT_VerifyCRL) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), UST_CERT_VerifyCRL.class)).PredictiveBackHandlerKtExternalSyntheticLambda5();
            int i3 = 94 / 0;
        } else {
            uST_CERT_VerifyVIDPredictiveBackHandlerKtExternalSyntheticLambda5 = ((UST_CERT_VerifyCRL) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), UST_CERT_VerifyCRL.class)).PredictiveBackHandlerKtExternalSyntheticLambda5();
        }
        int i4 = postMessage + 39;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return uST_CERT_VerifyVIDPredictiveBackHandlerKtExternalSyntheticLambda5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TouchInterceptFrameLayout1 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        int i = 2 % 2;
        int i2 = postMessage + 87;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        if (i3 != 0) {
            return ((TouchInterceptFrameLayoutTapListener) Response.onExtraCallback(contextOnExtraCallback, TouchInterceptFrameLayoutTapListener.class)).r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
        ((TouchInterceptFrameLayoutTapListener) Response.onExtraCallback(contextOnExtraCallback, TouchInterceptFrameLayoutTapListener.class)).r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final setAlogFlushAddr ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 53;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setAlogFlushAddr setalogflushaddr = (setAlogFlushAddr) access100.getValue();
        int i4 = newAuthTabSession + 65;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return setalogflushaddr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object warmup(Object[] objArr) {
        int i = 2 % 2;
        int i2 = postMessage + 103;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            ((setAlogFlushV2Addr) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAlogFlushV2Addr.class)).getOnBackPressedDispatcher();
            throw null;
        }
        setAlogFlushAddr onBackPressedDispatcher = ((setAlogFlushV2Addr) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAlogFlushV2Addr.class)).getOnBackPressedDispatcher();
        int i3 = newAuthTabSession + 79;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return onBackPressedDispatcher;
    }

    private final isJacksonCreator onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 19;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        isJacksonCreator isjacksoncreator = (isJacksonCreator) IAuthTabCallback.getValue();
        int i4 = postMessage + 35;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return isjacksoncreator;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = postMessage + 89;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        isJacksonCreator isjacksoncreatorRemoteActionCompatParcelizer = ((makeParameterizedType) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), makeParameterizedType.class)).RemoteActionCompatParcelizer();
        int i4 = postMessage + 79;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return isjacksoncreatorRemoteActionCompatParcelizer;
    }

    private static final void ICustomTabsServiceStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 109;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final boolean asBinder(Boolean bool) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 35;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bool, "");
            return bool.booleanValue();
        }
        Intrinsics.checkNotNullParameter(bool, "");
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(SessionState sessionState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionState, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = sessionState.asBinder().onWarmupCompleted(new AppStateHandler$.ExternalSyntheticLambda124(new AppStateHandler$.ExternalSyntheticLambda123()));
        int i2 = newAuthTabSession + 27;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        return jsonReaderUnknownNumberParsingOnWarmupCompleted;
    }

    private static final boolean prefetchWithMultipleUrls(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 65;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = newAuthTabSession + 65;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk requestPostMessageChannel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 105;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i4 = postMessage + 71;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private static final Unit onTransact(Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 17;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{onWarmupCompleted}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -709044151, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 709044215);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 79;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IEngagementSignalsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static final boolean access200(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 27;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = 19 / 0;
        return zBooleanValue;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk asInterface(SessionState sessionState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionState, "");
        JsonReaderUnknownNumberParsing interfaceDescriptor = sessionState.getInterfaceDescriptor();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda22
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UST_CERT_GetPublicKeyInfo.onExtraCallback((Boolean) obj));
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = interfaceDescriptor.onWarmupCompleted(new deserializeLongCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda23
            public final boolean test(Object obj) {
                return UST_CERT_GetPublicKeyInfo.ICustomTabsCallback_Parcel(function1, obj);
            }
        });
        int i2 = newAuthTabSession + 87;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return jsonReaderUnknownNumberParsingOnWarmupCompleted;
    }

    private static final boolean asInterface(Boolean bool) {
        int i = 2 % 2;
        int i2 = postMessage + 111;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        boolean zBooleanValue = bool.booleanValue();
        int i4 = postMessage + 119;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void writeTypedList(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 125;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newAuthTabSession + 75;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault(Boolean bool) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 123;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted.ResultReceiverMyResultReceiver();
            Unit unit = Unit.INSTANCE;
            int i3 = postMessage + 109;
            newAuthTabSession = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 61 / 0;
            }
            return unit;
        }
        onWarmupCompleted.ResultReceiverMyResultReceiver();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallbackStub(SessionState sessionState) {
        int i = 2 % 2;
        int i2 = postMessage + 73;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sessionState, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = sessionState.onExtraCallbackWithResult(true);
        int i4 = newAuthTabSession + 89;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return jsonReaderUnknownNumberParsingOnExtraCallbackWithResult;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IEngagementSignalsCallbackStub(Function1 function1, Object obj) {
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
        int i = 2 % 2;
        int i2 = postMessage + 91;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
            int i3 = 65 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        }
        int i4 = postMessage + 125;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
        }
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 13;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = newAuthTabSession + 107;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(im.toss.state.spec.SessionState.State r8) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            im.toss.state.spec.SessionState$State$LoginSession r1 = im.toss.state.spec.SessionState.State.LoginSession.onExtraCallbackWithResult
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L35
            o.UST_CERT_GetPublicKeyInfo r8 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            int r3 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r2 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r5 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r6 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            r4 = -582766764(0xffffffffdd43af54, float:-8.812863E17)
            r7 = 582766799(0x22bc50cf, float:5.104306E-18)
            onExtraCallbackWithResult(r1, r2, r3, r4, r5, r6, r7)
            int r8 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r8 = r8 + 77
            int r1 = r8 % 128
            goto L5f
        L33:
            int r8 = r8 % r0
            goto L62
        L35:
            im.toss.state.spec.SessionState$State$GuestSession r1 = im.toss.state.spec.SessionState.State.GuestSession.onWarmupCompleted
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            if (r1 == 0) goto L4c
            int r8 = o.UST_CERT_GetPublicKeyInfo.postMessage
            int r8 = r8 + 101
            int r1 = r8 % 128
            o.UST_CERT_GetPublicKeyInfo.newAuthTabSession = r1
            int r8 = r8 % r0
            o.UST_CERT_GetPublicKeyInfo r8 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted
            r8.MediaMetadataCompat()
            goto L62
        L4c:
            im.toss.state.spec.SessionState$State$SessionFinished r1 = im.toss.state.spec.SessionState.State.SessionFinished.onExtraCallbackWithResult
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            if (r8 == 0) goto L62
            o.UST_CERT_GetPublicKeyInfo r8 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted
            r8.ComponentActivity()
            int r8 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r8 = r8 + 41
            int r1 = r8 % 128
        L5f:
            o.UST_CERT_GetPublicKeyInfo.postMessage = r1
            goto L33
        L62:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            int r1 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r1 = r1 + 57
            int r2 = r1 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L70
            return r8
        L70:
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.IAuthTabCallback(im.toss.state.spec.SessionState$State):kotlin.Unit");
    }

    private static final void setEngagementSignalsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 13;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 69;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(TossApiCallException tossApiCallException) {
        int i = 2 % 2;
        int i2 = postMessage + 75;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = onWarmupCompleted;
        Intrinsics.checkNotNull(tossApiCallException);
        uST_CERT_GetPublicKeyInfo.onExtraCallback(tossApiCallException);
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 47;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object prefetchWithMultipleUrls(Object[] objArr) {
        boolean z = false;
        SessionState sessionState = (SessionState) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 39;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sessionState, "");
        } else {
            Intrinsics.checkNotNullParameter(sessionState, "");
            z = true;
        }
        return sessionState.onExtraCallbackWithResult(z);
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk updateVisuals(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 93;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i4 = newAuthTabSession + 115;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
        }
        throw null;
    }

    private static final getMediationProvider RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = postMessage + 31;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        getMediationProvider getmediationproviderOnNavigationEvent = getMediationProvider.Companion.onNavigationEvent();
        int i4 = newAuthTabSession + 83;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return getmediationproviderOnNavigationEvent;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(getMediationProvider getmediationprovider) {
        boolean z;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 61;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getmediationprovider, "");
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(getmediationprovider, "");
            z = true;
        }
        return getmediationprovider.onWarmupCompleted(z);
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk warmup(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i4 = postMessage + 63;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private static final Boolean ICustomTabsServiceDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 87;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = postMessage + 57;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object receiveFile(java.lang.Object[] r4) throws kotlin.NoWhenBranchMatchedException {
        /*
            r0 = 0
            r4 = r4[r0]
            o.getMediationProvider$IAuthTabCallback r4 = (o.getMediationProvider.IAuthTabCallback) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.UST_CERT_GetPublicKeyInfo.postMessage
            int r2 = r2 + 17
            int r3 = r2 % 128
            o.UST_CERT_GetPublicKeyInfo.newAuthTabSession = r3
            int r2 = r2 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            o.getMediationProvider$IAuthTabCallback$IAuthTabCallback r2 = o.getMediationProvider.IAuthTabCallback.IAuthTabCallback.onExtraCallback
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r2 != 0) goto L5e
            int r2 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r2 = r2 + 7
            int r3 = r2 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L35
            o.getMediationProvider$IAuthTabCallback$onNavigationEvent r2 = o.getMediationProvider.IAuthTabCallback.onNavigationEvent.IAuthTabCallback
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            r3 = 65
            int r3 = r3 / r0
            if (r2 != 0) goto L5e
            goto L3d
        L35:
            o.getMediationProvider$IAuthTabCallback$onNavigationEvent r2 = o.getMediationProvider.IAuthTabCallback.onNavigationEvent.IAuthTabCallback
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r2 != 0) goto L5e
        L3d:
            int r2 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r2 = r2 + 71
            int r3 = r2 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L57
            o.getMediationProvider$IAuthTabCallback$onExtraCallback r1 = o.getMediationProvider.IAuthTabCallback.onExtraCallback.IAuthTabCallback
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
            if (r4 == 0) goto L51
            goto L5f
        L51:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L57:
            o.getMediationProvider$IAuthTabCallback$onExtraCallback r0 = o.getMediationProvider.IAuthTabCallback.onExtraCallback.IAuthTabCallback
            kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            r4 = 0
            throw r4
        L5e:
            r0 = 1
        L5f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.receiveFile(java.lang.Object[]):java.lang.Object");
    }

    private static final boolean validateRelationship(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 125;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = newAuthTabSession + 83;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean IAuthTabCallback(Pair pair) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        SessionState.State state = (SessionState.State) pair.onExtraCallbackWithResult();
        Boolean bool = (Boolean) pair.IAuthTabCallback();
        if (Intrinsics.areEqual(state, SessionState.State.LoginSession.onExtraCallbackWithResult)) {
            int i2 = postMessage + 27;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            if (bool.booleanValue()) {
                int i4 = newAuthTabSession + 95;
                postMessage = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = postMessage + 73;
        newAuthTabSession = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static final void ICustomTabsServiceStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 99;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 53;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 37;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted.ResultReceiver();
            return Unit.INSTANCE;
        }
        onWarmupCompleted.ResultReceiver();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void ICustomTabsService_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 125;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newAuthTabSession + 77;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback_Parcel(Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 29;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        ALCDetectionMode.onExtraCallbackWithResult(th, (Map) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 87;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void requestPostMessageChannel() throws Throwable {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing<SessionState> jsonReaderUnknownNumberParsing = extraCallbackWithResult;
        jsonReaderUnknownNumberParsing.IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda62(new AppStateHandler$.ExternalSyntheticLambda51())).IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda71(new AppStateHandler$.ExternalSyntheticLambda70()));
        jsonReaderUnknownNumberParsing.IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda73(new AppStateHandler$.ExternalSyntheticLambda72())).IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda75(new AppStateHandler$.ExternalSyntheticLambda74()));
        jsonReaderUnknownNumberParsing.IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda77(new AppStateHandler$.ExternalSyntheticLambda76())).IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda53(new AppStateHandler$.ExternalSyntheticLambda52()));
        buildInitSettings.onExtraCallback.onWarmupCompleted().IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda55(new AppStateHandler$.ExternalSyntheticLambda54()));
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsing.IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda57(new AppStateHandler$.ExternalSyntheticLambda56()));
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAsInterface = JsonReaderUnknownNumberParsing.onNavigationEvent(new AppStateHandler$.ExternalSyntheticLambda58()).onExtraCallback(clearTid.onExtraCallback()).IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda60(new AppStateHandler$.ExternalSyntheticLambda59())).onNavigationEvent(new AppStateHandler$.ExternalSyntheticLambda63(new AppStateHandler$.ExternalSyntheticLambda61())).asInterface();
        clearMessage clearmessage = clearMessage.onWarmupCompleted;
        Intrinsics.checkNotNull(jsonReaderUnknownNumberParsingIAuthTabCallback);
        Intrinsics.checkNotNull(jsonReaderUnknownNumberParsingAsInterface);
        clearmessage.IAuthTabCallback(jsonReaderUnknownNumberParsingIAuthTabCallback, jsonReaderUnknownNumberParsingAsInterface).onWarmupCompleted(new AppStateHandler$.ExternalSyntheticLambda65(new AppStateHandler$.ExternalSyntheticLambda64())).onWarmupCompleted(clearTid.onExtraCallback()).onWarmupCompleted(new AppStateHandler$.ExternalSyntheticLambda67(new AppStateHandler$.ExternalSyntheticLambda66()), new AppStateHandler$.ExternalSyntheticLambda69(new AppStateHandler$.ExternalSyntheticLambda68()));
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 291971867, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -291971856);
        int i2 = newAuthTabSession + 67;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CdnVars>, Object> {
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackDefault(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super CdnVars> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
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
            ImageRequests_androidKtExternalSyntheticLambda2 imageRequests_androidKtExternalSyntheticLambda2 = (ImageRequests_androidKtExternalSyntheticLambda2) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{UST_CERT_GetPublicKeyInfo.onWarmupCompleted}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1881286762, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1881286763);
            this.label = 1;
            Object objOnNavigationEvent = imageRequests_androidKtExternalSyntheticLambda2.onNavigationEvent((String) null, this);
            return objOnNavigationEvent == objOnWarmupCompleted ? objOnWarmupCompleted : objOnNavigationEvent;
        }
    }

    private static final TubaVarV1SyncState.onExtraCallback.onWarmupCompleted newAuthTabSession(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 45;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onwarmupcompleted = (TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) function1.invoke(obj);
        int i3 = 84 / 0;
        return onwarmupcompleted;
    }

    private static final TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onWarmupCompleted(VarsResult varsResult, CdnVars cdnVars) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cdnVars, "");
        TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onwarmupcompleted = new TubaVarV1SyncState.onExtraCallback.onWarmupCompleted(cdnVars.onExtraCallback(), cdnVars.onExtraCallbackWithResult(), varsResult.onNavigationEvent());
        int i2 = postMessage + 125;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return onwarmupcompleted;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CdnVars>, Object> {
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new asInterface(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super CdnVars> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
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
            ImageRequests_androidKtExternalSyntheticLambda2 imageRequests_androidKtExternalSyntheticLambda2 = (ImageRequests_androidKtExternalSyntheticLambda2) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{UST_CERT_GetPublicKeyInfo.onWarmupCompleted}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1881286762, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1881286763);
            Object[] objArr = {onResponse.onWarmupCompleted};
            String str = (String) onResponse.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 999611841, objArr, -999611841, JsParamKeys.onExtraCallbackWithResult());
            this.label = 1;
            Object objOnNavigationEvent = imageRequests_androidKtExternalSyntheticLambda2.onNavigationEvent(str, this);
            return objOnNavigationEvent == objOnWarmupCompleted ? objOnWarmupCompleted : objOnNavigationEvent;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        r1 = kotlinx.coroutines.rx2.RxSingleKt.IAuthTabCallback((kotlin.coroutines.CoroutineContext) null, new o.UST_CERT_GetPublicKeyInfo.asInterface(null), 1, (java.lang.Object) null);
        r3 = new viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda121(r6);
        r6 = r1.onWarmupCompleted(new viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda122(r3));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
        r1 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession + 61;
        o.UST_CERT_GetPublicKeyInfo.postMessage = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        r0 = 57 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.IAuthTabCallback(), r1.onExtraCallback(r6.onNavigationEvent())) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.IAuthTabCallback(), r1.onExtraCallback(r6.onNavigationEvent())) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r0 = kotlinx.coroutines.rx2.RxSingleKt.IAuthTabCallback((kotlin.coroutines.CoroutineContext) null, new o.UST_CERT_GetPublicKeyInfo.IAuthTabCallbackDefault(null), 1, (java.lang.Object) null);
        r2 = new viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda119(r6);
        r6 = r0.onWarmupCompleted(new viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda120(r2));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final o.writeRaw<im.toss.components.tuba.variable.TubaVarV1SyncState.onExtraCallback.onWarmupCompleted> onExtraCallback(final im.toss.core.tuba.VarsResult r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r1 = r1 + 15
            int r2 = r1 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L29
            o.onResponse r1 = o.onResponse.onWarmupCompleted
            kotlinx.serialization.json.JsonObject r4 = r6.onNavigationEvent()
            java.lang.String r4 = r1.onExtraCallback(r4)
            java.lang.String r1 = r1.IAuthTabCallback()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r4 = 84
            int r4 = r4 / 0
            if (r1 != 0) goto L58
            goto L3d
        L29:
            o.onResponse r1 = o.onResponse.onWarmupCompleted
            kotlinx.serialization.json.JsonObject r4 = r6.onNavigationEvent()
            java.lang.String r4 = r1.onExtraCallback(r4)
            java.lang.String r1 = r1.IAuthTabCallback()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L58
        L3d:
            o.UST_CERT_GetPublicKeyInfo$IAuthTabCallbackDefault r0 = new o.UST_CERT_GetPublicKeyInfo$IAuthTabCallbackDefault
            r0.<init>(r3)
            o.writeRaw r0 = kotlinx.coroutines.rx2.RxSingleKt.IAuthTabCallback(r3, r0, r2, r3)
            viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda120 r1 = new viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda120
            viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda119 r2 = new viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda119
            r2.<init>()
            r1.<init>()
            o.writeRaw r6 = r0.onWarmupCompleted(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            return r6
        L58:
            o.UST_CERT_GetPublicKeyInfo$asInterface r1 = new o.UST_CERT_GetPublicKeyInfo$asInterface
            r1.<init>(r3)
            o.writeRaw r1 = kotlinx.coroutines.rx2.RxSingleKt.IAuthTabCallback(r3, r1, r2, r3)
            viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda122 r2 = new viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda122
            viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda121 r3 = new viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda121
            r3.<init>()
            r2.<init>()
            o.writeRaw r6 = r1.onWarmupCompleted(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r1 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r1 = r1 + 61
            int r2 = r1 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L81
            r0 = 57
            int r0 = r0 / 0
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.onExtraCallback(im.toss.core.tuba.VarsResult):o.writeRaw");
    }

    private static final TubaVarV1SyncState.onExtraCallback.onWarmupCompleted receiveFile(Function1 function1, Object obj) {
        TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 57;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            onwarmupcompleted = (TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) function1.invoke(obj);
            int i3 = 14 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            onwarmupcompleted = (TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) function1.invoke(obj);
        }
        int i4 = postMessage + 1;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompleted;
    }

    private static final TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onNavigationEvent(VarsResult varsResult, CdnVars cdnVars) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cdnVars, "");
        TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onwarmupcompleted = new TubaVarV1SyncState.onExtraCallback.onWarmupCompleted(cdnVars.onExtraCallback(), cdnVars.onExtraCallbackWithResult(), varsResult.onNavigationEvent());
        int i2 = newAuthTabSession + 23;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    private final RxSharedApiCall<VarsResult> notifyNotificationWithChannel() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 11;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        RxSharedApiCall<VarsResult> rxSharedApiCall = (RxSharedApiCall) onRelationshipValidationResult.getValue();
        int i4 = postMessage + 35;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return rxSharedApiCall;
    }

    private static final RxSharedApiCall fullyDrawnReporter_delegatelambda00() throws Throwable {
        int i = 2 % 2;
        RxSharedApiCall.Companion companion = RxSharedApiCall.Companion;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.lastIndexOf("", '0')), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 24734 - ((Process.getThreadPriority(0) + 20) >> 6), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, 24734 - TextUtils.getOffsetAfter("", 0), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawIAuthTabCallback = onExitFullscreen.IAuthTabCallback((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null), false, false, 3, null);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onActivityLayout(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            RxSharedApiCall rxSharedApiCallOnWarmupCompleted = RxSharedApiCall.Companion.onWarmupCompleted(companion, "tubaUserOverlayVars", writerawIAuthTabCallback2, (Object) null, setLogBuffers.onWarmupCompleted(setCommandLine.onWarmupCompleted(5, setRevision.SECONDS)), 4, (Object) null);
            int i2 = newAuthTabSession + 91;
            postMessage = i2 % 128;
            int i3 = i2 % 2;
            return rxSharedApiCallOnWarmupCompleted;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private final RxSharedApiCall<TriggersResult> getActiveNotifications() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 31;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        RxSharedApiCall<TriggersResult> rxSharedApiCall = (RxSharedApiCall) onUnminimized.getValue();
        int i4 = postMessage + 125;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return rxSharedApiCall;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final RxSharedApiCall createFullyDrawnExecutor() throws Throwable {
        int i = 2 % 2;
        RxSharedApiCall.Companion companion = RxSharedApiCall.Companion;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - ExpandableListView.getPackedPositionType(0L)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, 24734 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 29426), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, 24734 - TextUtils.getOffsetAfter("", 0), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw<BaseApiResponse<TriggersResult>> writerawIAuthTabCallbackStub = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallbackStub();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawIAuthTabCallbackStub.IAuthTabCallback(new onPostMessage(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            RxSharedApiCall rxSharedApiCallOnWarmupCompleted = RxSharedApiCall.Companion.onWarmupCompleted(companion, "tubaUserTrigger", writerawIAuthTabCallback, (Object) null, setLogBuffers.onWarmupCompleted(setCommandLine.onWarmupCompleted(5, setRevision.SECONDS)), 4, (Object) null);
            int i2 = postMessage + 57;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            return rxSharedApiCallOnWarmupCompleted;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ wasLastName IAuthTabCallback(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 59;
        int i4 = i3 % 128;
        postMessage = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 83;
            newAuthTabSession = i6 % 128;
            z = i6 % 2 == 0;
        }
        wasLastName waslastname = (wasLastName) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo, str, Boolean.valueOf(z)}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -401540738, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 401540751);
        int i7 = postMessage + 97;
        newAuthTabSession = i7 % 128;
        if (i7 % 2 != 0) {
            return waslastname;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str;
        wasLastName waslastnameIAuthTabCallback;
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        String str2 = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "tubaUserSync", str2, (Map) null, (String) null, false, (String) null, 60, (Object) null);
        if (zBooleanValue) {
            Object[] objArr2 = {uST_CERT_GetPublicKeyInfo.notifyNotificationWithChannel(), "forceReSync:" + str2};
            RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 237696428, -237696426, objArr2, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            Object[] objArr3 = {uST_CERT_GetPublicKeyInfo.getActiveNotifications(), "forceReSync:" + str2};
            RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 237696428, -237696426, objArr3, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }
        if (Intrinsics.areEqual(AppStateManager.onExtraCallbackWithResult.onMinimized().onExtraCallbackWithResult(), TubaVarV1SyncState.State.Evaluated.INSTANCE)) {
            int i2 = newAuthTabSession + 111;
            postMessage = i2 % 128;
            if (i2 % 2 != 0) {
                wasLastName.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
            str = "";
        } else {
            str = "";
            Object[] objArr4 = {uST_CERT_GetPublicKeyInfo.notifyNotificationWithChannel(), null, null, false, 7, null};
            writeRaw writeraw = (writeRaw) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -939077752, 939077756, objArr4, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda39
                public final Object invoke(Object obj2) {
                    return UST_CERT_GetPublicKeyInfo.IAuthTabCallback((VarsResult) obj2);
                }
            };
            writeRaw writerawOnExtraCallback = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda42
                public final Object apply(Object obj2) {
                    return (deserializeIp) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{function1, obj2}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 603426612, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -603426566);
                }
            }).onExtraCallback(TubaVarV1SyncState.onExtraCallback.class);
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda43
                public final Object invoke(Object obj2) {
                    return UST_CERT_GetPublicKeyInfo.onExtraCallback((Throwable) obj2);
                }
            };
            writeRaw writerawAsBinder = writerawOnExtraCallback.asBinder(new deserializeIntNullableCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda44
                public final Object apply(Object obj2) {
                    return UST_CERT_GetPublicKeyInfo.ICustomTabsCallbackStub(function12, obj2);
                }
            });
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda45
                public final Object invoke(Object obj2) {
                    return UST_CERT_GetPublicKeyInfo.IAuthTabCallbackStub((Throwable) obj2);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawAsBinder.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda46
                public final void accept(Object obj2) throws Throwable {
                    UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{function13, obj2}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1149418260, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1149418252);
                }
            });
            final Function1 function14 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda47
                public final Object invoke(Object obj2) {
                    return UST_CERT_GetPublicKeyInfo.onNavigationEvent((TubaVarV1SyncState.onExtraCallback) obj2);
                }
            };
            wasLastName waslastnameBI_ = writerawOnWarmupCompleted.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda48
                public final void accept(Object obj2) throws Throwable {
                    UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{function14, obj2}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1870238135, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1870238169);
                }
            }).bI_();
            int i3 = newAuthTabSession + 83;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            waslastnameIAuthTabCallback = waslastnameBI_;
        }
        Object[] objArr5 = {uST_CERT_GetPublicKeyInfo.getActiveNotifications(), null, null, false, 7, null};
        writeRaw writeraw2 = (writeRaw) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -939077752, 939077756, objArr5, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        final Function1 function15 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda49
            public final Object invoke(Object obj2) {
                return (Unit) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{(TriggersResult) obj2}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -863916007, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 863916026);
            }
        };
        writeRaw writerawOnNavigationEvent = writeraw2.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda50
            public final void accept(Object obj2) {
                UST_CERT_GetPublicKeyInfo.IAuthTabCallbackDefault(function15, obj2);
            }
        });
        final Function1 function16 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda40
            public final Object invoke(Object obj2) {
                return UST_CERT_GetPublicKeyInfo.IAuthTabCallback((Throwable) obj2);
            }
        };
        wasLastName waslastnameOnNavigationEvent = waslastnameIAuthTabCallback.onExtraCallback(writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda41
            public final void accept(Object obj2) throws Throwable {
                UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{function16, obj2}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1845520957, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1845520920);
            }
        }).bI_()).onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, str);
        return waslastnameOnNavigationEvent;
    }

    private static final deserializeIp ITrustedWebActivityCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 99;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final deserializeIp asBinder(VarsResult varsResult) {
        int i = 2 % 2;
        int i2 = postMessage + 85;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(varsResult, "");
            return onWarmupCompleted.onExtraCallback(varsResult);
        }
        Intrinsics.checkNotNullParameter(varsResult, "");
        onWarmupCompleted.onExtraCallback(varsResult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 109;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = 93 / 0;
        return deserializeip;
    }

    private static final TubaVarV1SyncState.onExtraCallback.IAuthTabCallback IAuthTabCallbackStub(VarsResult varsResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(varsResult, "");
        TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallback = new TubaVarV1SyncState.onExtraCallback.IAuthTabCallback(varsResult.onNavigationEvent());
        int i2 = newAuthTabSession + 111;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final TubaVarV1SyncState.onExtraCallback.IAuthTabCallback ITrustedWebActivityCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 33;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallback = (TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) function1.invoke(obj);
        int i4 = newAuthTabSession + 11;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return iAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final deserializeIp onActivityResized(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 11;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            if (zzcy.onNavigationEvent(th, 0, 0, (Object) null)) {
                throw th;
            }
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            if (zzcy.onNavigationEvent(th, 0, 1, (Object) null)) {
                throw th;
            }
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaUserSync", "fallback to getVars", th, (Map) null, 8, (Object) null);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - TextUtils.getCapsMode("", 0, 0)), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), 24733 - ExpandableListView.getPackedPositionChild(0L), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, TextUtils.indexOf((CharSequence) "", '0') + 24735, -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawOnNavigationEvent = onExitFullscreen.onNavigationEvent((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null), false, false, 3, null);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onActivityResized(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda19
                public final Object invoke(Object obj2) {
                    return UST_CERT_GetPublicKeyInfo.onNavigationEvent((VarsResult) obj2);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda20
                public final Object apply(Object obj2) {
                    return UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(function1, obj2);
                }
            });
            int i3 = postMessage + 87;
            newAuthTabSession = i3 % 128;
            int i4 = i3 % 2;
            return writerawOnWarmupCompleted;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static final void getSmallIconId(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 25;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 77;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onPostMessage(Throwable th) {
        int i = 2 % 2;
        int i2 = postMessage + 71;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TubaUserVarSync", "failed to sync", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("evaluate", Boolean.TRUE)));
        TubaVarV1SyncState tubaVarV1SyncStateOnMinimized = AppStateManager.onExtraCallbackWithResult.onMinimized();
        Intrinsics.checkNotNull(th);
        tubaVarV1SyncStateOnMinimized.IAuthTabCallback(th);
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 43;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void ITrustedWebActivityServiceDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 81;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 79;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(TubaVarV1SyncState.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = postMessage + 25;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState tubaVarV1SyncStateOnMinimized = AppStateManager.onExtraCallbackWithResult.onMinimized();
        Intrinsics.checkNotNull(onextracallback);
        tubaVarV1SyncStateOnMinimized.onWarmupCompleted(onextracallback);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 97;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return unit;
    }

    private static final void getActiveNotifications(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 33;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    private static final Unit onWarmupCompleted(TriggersResult triggersResult) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 79;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        dispatchEvent.onExtraCallbackWithResult(dispatchEvent.onNavigationEvent, (String) null, 1, (Object) null).IAuthTabCallback(triggersResult.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 5;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void ITrustedWebActivityService(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 9;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 43;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit ICustomTabsCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = postMessage + 75;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaUserTriggerSync", "failed to sync", th, (Map) null, 51, (Object) null);
        } else {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaUserTriggerSync", "failed to sync", th, (Map) null, 8, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ wasLastName onWarmupCompleted(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo, String str, long j, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 61;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            j = 5;
        }
        wasLastName waslastnameOnExtraCallbackWithResult = uST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(str, j);
        int i5 = newAuthTabSession + 25;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return waslastnameOnExtraCallbackWithResult;
    }

    private static final deserializeIp IPostMessageService(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 125;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static /* synthetic */ Object prefetch(Object[] objArr) {
        VarsResult varsResult = (VarsResult) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 69;
        postMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(varsResult, "");
            onWarmupCompleted.onExtraCallback(varsResult);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(varsResult, "");
        writeRaw<TubaVarV1SyncState.onExtraCallback.onWarmupCompleted> writerawOnExtraCallback = onWarmupCompleted.onExtraCallback(varsResult);
        int i3 = newAuthTabSession + 13;
        postMessage = i3 % 128;
        if (i3 % 2 == 0) {
            return writerawOnExtraCallback;
        }
        throw null;
    }

    private static final deserializeIp ITrustedWebActivityCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 65;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = newAuthTabSession + 31;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return deserializeip;
    }

    private static final TubaVarV1SyncState.onExtraCallback.IAuthTabCallback IAuthTabCallbackDefault(VarsResult varsResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(varsResult, "");
        TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallback = new TubaVarV1SyncState.onExtraCallback.IAuthTabCallback(varsResult.onNavigationEvent());
        int i2 = newAuthTabSession + 85;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 43;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        TubaVarV1SyncState.onExtraCallback.IAuthTabCallback iAuthTabCallback = (TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) function1.invoke(obj);
        int i4 = newAuthTabSession + 11;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return iAuthTabCallback;
    }

    private static final deserializeIp extraCallback(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 91;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (zzcy.onNavigationEvent(th, 0, 1, (Object) null)) {
            throw th;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaGuestVarSync", "fallback to getVars", th, (Map) null, 8, (Object) null);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16747790) - Color.rgb(0, 0, 0)), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29426), 16777238 + Color.rgb(0, 0, 0), 24734 - View.combineMeasuredStates(0, 0), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawOnExtraCallbackWithResult = onExitFullscreen.onExtraCallbackWithResult((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null), true, onWarmupCompleted.getSmallIconBitmap().onNavigationEvent(), false, 4, null);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new writeTypedObject(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda104
                public final Object invoke(Object obj2) {
                    return (TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{(VarsResult) obj2}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 919706820, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -919706792);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda105
                public final Object apply(Object obj2) {
                    return UST_CERT_GetPublicKeyInfo.readTypedObject(function1, obj2);
                }
            });
            int i4 = postMessage + 15;
            newAuthTabSession = i4 % 128;
            if (i4 % 2 != 0) {
                return writerawOnWarmupCompleted;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static final void ITrustedWebActivityCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 113;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 113;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit extraCallbackWithResult(Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 79;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TubaGuestVarSync", "failed to sync (overlayVars)", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("evaluate", Boolean.TRUE)));
            unit = Unit.INSTANCE;
            int i3 = 61 / 0;
        } else {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TubaGuestVarSync", "failed to sync (overlayVars)", th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("evaluate", Boolean.TRUE)));
            unit = Unit.INSTANCE;
        }
        int i4 = newAuthTabSession + 65;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 9;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallback(TubaVarV1SyncState.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        String str;
        boolean z;
        String str2;
        List list;
        Map map;
        Function1 function1;
        int i;
        int i2 = 2 % 2;
        if (onextracallback instanceof TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) {
            int i3 = newAuthTabSession + 43;
            postMessage = i3 % 128;
            if (i3 % 2 != 0) {
                onResponse.onWarmupCompleted.onWarmupCompleted(((TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) onextracallback).onExtraCallback());
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                str = "app_open_trigger_sync";
                z = false;
                str2 = null;
                list = null;
                map = null;
                function1 = null;
                i = 100;
            } else {
                onResponse.onWarmupCompleted.onWarmupCompleted(((TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) onextracallback).onExtraCallback());
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                str = "app_open_trigger_sync";
                z = false;
                str2 = null;
                list = null;
                map = null;
                function1 = null;
                i = 62;
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, str, z, str2, list, map, function1, i, (Object) null);
        } else if (onextracallback instanceof TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) {
            int i4 = newAuthTabSession + 17;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
            TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onwarmupcompleted = (TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) onextracallback;
            onResponse.onWarmupCompleted.onExtraCallback(onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.onNavigationEvent(), onwarmupcompleted.onExtraCallbackWithResult());
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "app_open_trigger_sync", false, (String) null, (List) null, (Map) null, (Function1) null, 62, (Object) null);
        } else {
            if (!(onextracallback instanceof TubaVarV1SyncState.onExtraCallback.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = postMessage + 21;
            newAuthTabSession = i6 % 128;
            int i7 = i6 % 2;
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TubaGuestVarSync", "failed to sync", ((TubaVarV1SyncState.onExtraCallback.onExtraCallback) onextracallback).onWarmupCompleted(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("evaluate", Boolean.TRUE)));
        }
        Unit unit = Unit.INSTANCE;
        int i8 = postMessage + 93;
        newAuthTabSession = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void _init_lambda3() {
        int i = 2 % 2;
        int i2 = postMessage + 65;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        setJSBundleLoader setjsbundleloader = setJSBundleLoader.onNavigationEvent;
        DERSet dERSet = DERSet.onExtraCallback;
        setjsbundleloader.onExtraCallback(dERSet.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(), dERSet.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        int i4 = postMessage + 115;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    private static /* synthetic */ Object onVerticalScrollEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = newAuthTabSession + 43;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(TriggersResult triggersResult) {
        int i = 2 % 2;
        int i2 = postMessage + 59;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            dispatchEvent.onNavigationEvent.onWarmupCompleted(false);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        dispatchEvent.onExtraCallbackWithResult(dispatchEvent.onNavigationEvent, (String) null, 1, (Object) null).IAuthTabCallback(triggersResult.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 3;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void ITrustedWebActivityCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 47;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = newAuthTabSession + 83;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object ICustomTabsService_Parcel(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 33;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaGuestTriggerSync", "failed to sync", th, (Map) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 91;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return unit;
    }

    public final wasLastName onExtraCallbackWithResult(@NotNull String str, long j) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "tubaGuestSync", str, (Map) null, (String) null, false, (String) null, 60, (Object) null);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 29426), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, TextUtils.lastIndexOf("", '0') + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = null;
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29474 - AndroidCharacter.getMirror('0')), 22 - Color.red(0), 24733 - TextUtils.lastIndexOf("", '0'), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawOnWarmupCompleted = onExitFullscreen.onWarmupCompleted((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj2, null), true, getSmallIconBitmap().onNavigationEvent(), false, 4, null);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new ICustomTabsCallback(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda106
                public final Object invoke(Object obj3) {
                    return UST_CERT_GetPublicKeyInfo.onWarmupCompleted((VarsResult) obj3);
                }
            };
            writeRaw writerawOnExtraCallback = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda110
                public final Object apply(Object obj3) {
                    return UST_CERT_GetPublicKeyInfo.prefetch(function1, obj3);
                }
            }).onExtraCallback(TubaVarV1SyncState.onExtraCallback.class);
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda111
                public final Object invoke(Object obj3) {
                    return UST_CERT_GetPublicKeyInfo.getInterfaceDescriptor((Throwable) obj3);
                }
            };
            writeRaw writerawAsBinder = writerawOnExtraCallback.asBinder(new deserializeIntNullableCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda112
                public final Object apply(Object obj3) {
                    return UST_CERT_GetPublicKeyInfo.extraCommand(function12, obj3);
                }
            });
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda113
                public final Object invoke(Object obj3) {
                    return UST_CERT_GetPublicKeyInfo.onTransact((Throwable) obj3);
                }
            };
            writeRaw writerawOnWarmupCompleted2 = writerawAsBinder.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda114
                public final void accept(Object obj3) {
                    UST_CERT_GetPublicKeyInfo.IAuthTabCallbackStubProxy(function13, obj3);
                }
            });
            final Function1 function14 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda115
                public final Object invoke(Object obj3) {
                    return UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult((TubaVarV1SyncState.onExtraCallback) obj3);
                }
            };
            wasLastName waslastnameBI_ = writerawOnWarmupCompleted2.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda116
                public final void accept(Object obj3) throws Throwable {
                    UST_CERT_GetPublicKeyInfo.ICustomTabsCallbackDefault(function14, obj3);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda117
                public final void run() {
                    UST_CERT_GetPublicKeyInfo.extraCallbackWithResult();
                }
            }).bI_();
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 21 - Process.getGidForName(""), 24734 - View.resolveSize(0, 0), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawOnWarmupCompleted3 = ((onExitFullscreen) ((Method) objOnExtraCallback3).invoke(obj2, null)).IAuthTabCallbackDefault(getSmallIconBitmap().onNavigationEvent()).onWarmupCompleted(j, TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted3, "");
            MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
            writeRaw writerawIAuthTabCallback2 = writerawOnWarmupCompleted3.IAuthTabCallback(new extraCallback(mapConverterOnExtraCallback2, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            final Function1 function15 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda118
                public final Object invoke(Object obj3) {
                    return UST_CERT_GetPublicKeyInfo.IAuthTabCallback((TriggersResult) obj3);
                }
            };
            writeRaw writerawOnNavigationEvent = writerawIAuthTabCallback2.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda107
                public final void accept(Object obj3) throws Throwable {
                    UST_CERT_GetPublicKeyInfo.onUnminimized(function15, obj3);
                }
            });
            final Function1 function16 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda108
                public final Object invoke(Object obj3) {
                    return UST_CERT_GetPublicKeyInfo.asBinder((Throwable) obj3);
                }
            };
            wasLastName waslastnameOnNavigationEvent = waslastnameBI_.onExtraCallback(writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda109
                public final void accept(Object obj3) throws Throwable {
                    UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{function16, obj3}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1498056811, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1498056860);
                }
            }).bI_()).onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
            int i2 = postMessage + 71;
            newAuthTabSession = i2 % 128;
            if (i2 % 2 != 0) {
                return waslastnameOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void onWarmupCompleted(@Nullable Activity activity, @NotNull UST_CERT_SetCertVerifyEnv uST_CERT_SetCertVerifyEnv) {
        Intent intentOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uST_CERT_SetCertVerifyEnv, "");
        Objects.toString(uST_CERT_SetCertVerifyEnv);
        IPostMessageService().IAuthTabCallbackStub();
        switch (onExtraCallbackWithResult.onNavigationEvent[uST_CERT_SetCertVerifyEnv.ordinal()]) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                String string = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_blocked_by_wrong_back_password_attempt_title);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = IEngagementSignalsCallback_Parcel().getString(R.string.certificate_password_max_failed_content, 5);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                onNavigationEvent(this, activity, uST_CERT_SetCertVerifyEnv, string, string2, "BLOCKED_BY_WRONG_BANK_PASSWORD_ATTEMPT", null, 0, false, 224, null);
                return;
            case 2:
                PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
                if (!addExtra.onWarmupCompleted(playerErrorCode) && !addExtra.writeTypedObject(playerErrorCode)) {
                    int i2 = newAuthTabSession + 35;
                    postMessage = i2 % 128;
                    int i3 = i2 % 2;
                    if (!addExtra.extraCallback(playerErrorCode)) {
                        int i4 = postMessage + 51;
                        newAuthTabSession = i4 % 128;
                        int i5 = i4 % 2;
                        if (activity == null || ITrustedWebActivityServiceStubProxy()) {
                            return;
                        }
                        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
                        Object[] objArr = new Object[1];
                        b(new int[]{1990635598, -1738277597, 2005032101, -826537945, -1388008178, 892797303, 1412416919, 459943901, 188140970, -579822798, 1169500554, 726676415, 298002860, 1841600782, -1331293229, -1145183299, -994102014, 1390601402}, Process.getGidForName("") + 35, objArr);
                        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), true);
                        Intent flags = (zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer() ? new Intent(activity, (Class<?>) PasswordBlockIntroActivity.class) : IEngagementSignalsCallbackStubProxy().onNavigationEvent(activity)).setFlags(268468224);
                        Intrinsics.checkNotNullExpressionValue(flags, "");
                        activity.startActivity(flags);
                        return;
                    }
                }
                String string3 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_blocked_by_wrong_password_attempt_title);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_blocked_by_wrong_password_attempt_message);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                onNavigationEvent(this, activity, uST_CERT_SetCertVerifyEnv, string3, string4, "BLOCKED_BY_WRONG_PASSWORD_ATTEMPT", null, 0, false, 224, null);
                int i6 = postMessage + 5;
                newAuthTabSession = i6 % 128;
                int i7 = i6 % 2;
                return;
            case 3:
                if ((activity instanceof BaseActivity ? (BaseActivity) activity : null) != null) {
                    if (zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
                        int i8 = newAuthTabSession + 103;
                        postMessage = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr2 = new Object[1];
                        b(new int[]{-1646482038, -1271952049, -399329897, 469907922, -427988140, -726736923, 514673169, -1032745039}, 16 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
                        intentOnWarmupCompleted = UnblockSessionActivity.Companion.onNavigationEvent((BaseActivity) activity, "account", "AppState", "AppState", ((String) objArr2[0]).intern());
                    } else {
                        intentOnWarmupCompleted = getPoint.Companion.onNavigationEvent(onSessionEnded()).IEngagementSignalsCallback_Parcel().onWarmupCompleted(activity, "AppState", "account", "account");
                    }
                    getNavigationBar.IAuthTabCallback(zzbq.onExtraCallbackWithResult(intentOnWarmupCompleted), activity);
                    return;
                }
                return;
            case 4:
                String string5 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_paused_title);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                String string6 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_paused_message);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                onNavigationEvent(this, activity, uST_CERT_SetCertVerifyEnv, string5, string6, "PAUSED", null, 0, false, 224, null);
                return;
            case 5:
                String string7 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_dormant_title);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                String string8 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_dialog_dormant_message);
                Intrinsics.checkNotNullExpressionValue(string8, "");
                onNavigationEvent(this, activity, uST_CERT_SetCertVerifyEnv, string7, string8, "DORMANT", "-1 error on " + (activity != null ? activity.getClass().getSimpleName() : null), 5, false, 128, null);
                int i10 = postMessage + 93;
                newAuthTabSession = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                str.hashCode();
                throw null;
            case 6:
                String string9 = IEngagementSignalsCallback_Parcel().getString(R.string.alert_try_login_invalid_user_title);
                Intrinsics.checkNotNullExpressionValue(string9, "");
                String string10 = IEngagementSignalsCallback_Parcel().getString(R.string.alert_try_login_invalid_user_message);
                Intrinsics.checkNotNullExpressionValue(string10, "");
                IAuthTabCallback(activity, uST_CERT_SetCertVerifyEnv, string9, string10, "INVALID", "-1 error on " + (activity != null ? activity.getClass().getSimpleName() : null), 5, true);
                return;
            case 7:
                String string11 = IEngagementSignalsCallback_Parcel().getString(R.string.alert_try_login_invalid_user_title);
                Intrinsics.checkNotNullExpressionValue(string11, "");
                String string12 = IEngagementSignalsCallback_Parcel().getString(R.string.alert_try_login_invalid_user_message);
                Intrinsics.checkNotNullExpressionValue(string12, "");
                IAuthTabCallback(activity, uST_CERT_SetCertVerifyEnv, string11, string12, "LEAVED", "-1 error on " + (activity != null ? activity.getClass().getSimpleName() : null), 5, true);
                return;
            case 8:
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                try {
                    Object[] objArr3 = {activity};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-486996572);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 30 - View.MeasureSpec.getMode(0), 24887 - Drawable.resolveOpacity(0, 0), -742786252, false, "onWarmupCompleted", new Class[]{Activity.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(obj, objArr3);
                    return;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            case 9:
                onExtraCallbackWithResult(activity);
                return;
            case 10:
                String string13 = zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer() ? IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_invalid_android_id_message_kr) : IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_invalid_android_id_message_global);
                Intrinsics.checkNotNull(string13);
                String string14 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_invalid_android_id_title);
                Intrinsics.checkNotNullExpressionValue(string14, "");
                IAuthTabCallback(activity, uST_CERT_SetCertVerifyEnv, string14, string13, "INVALID_ANDROID_ID", "invalid android id error on " + (activity != null ? activity.getClass().getSimpleName() : null), 5, true);
                return;
            case 11:
                String string15 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_invalid_miui_android_id_title);
                Intrinsics.checkNotNullExpressionValue(string15, "");
                String string16 = IEngagementSignalsCallback_Parcel().getString(R.string.user_exit_dialog_invalid_miui_android_id_message);
                Intrinsics.checkNotNullExpressionValue(string16, "");
                IAuthTabCallback(activity, uST_CERT_SetCertVerifyEnv, string15, string16, "INVALID_ANDROID_ID", "invalid miui virtual identity disabled android id error on " + (activity != null ? activity.getClass().getSimpleName() : null), 5, true);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Context onSessionEnded() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 83;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        int i4 = postMessage + 89;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return contextOnExtraCallback;
    }

    private final Context IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = postMessage + 87;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Context contextIAuthTabCallback = IPostMessageServiceStub().IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
        int i4 = newAuthTabSession + 97;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return contextIAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object isEngagementSignalsApiAvailable(java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.isEngagementSignalsApiAvailable(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onGreatestScrollPercentageIncreased(Object[] objArr) throws Throwable {
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        int i = 2 % 2;
        mainHandler_delegatelambda0.onExtraCallbackWithResult.onExtraCallbackWithResult();
        uST_CERT_GetPublicKeyInfo.AudioAttributesCompatParcelizer();
        getCurrentBatteryPercentage.onNavigationEvent.onExtraCallback(0);
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "app_open", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda128
            public final Object invoke(Object obj) {
                return UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult((SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        uST_CERT_GetPublicKeyInfo.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 200317353, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -200317311);
        uST_CERT_GetPublicKeyInfo.access200();
        uST_CERT_GetPublicKeyInfo.IEngagementSignalsCallback();
        uST_CERT_GetPublicKeyInfo.ICustomTabsService_Parcel();
        Object obj = null;
        if (setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback()) {
            int i2 = newAuthTabSession + 33;
            postMessage = i2 % 128;
            int i3 = i2 % 2;
            uST_CERT_GetPublicKeyInfo.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = newAuthTabSession + 45;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        return null;
    }

    private final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws Throwable {
        int i = 2 % 2;
        Object systemService = onSessionEnded().getSystemService("camera");
        Intrinsics.checkNotNull(systemService, "");
        CameraManager cameraManager = (CameraManager) systemService;
        String[] cameraIdList = cameraManager.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
        for (String str : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "");
            if (onExtraCallback(cameraCharacteristics)) {
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num != null && num.intValue() == 2) {
                    return "legacy";
                }
                if (num != null && num.intValue() == 0) {
                    return "limited";
                }
                if (num != null && num.intValue() == 1) {
                    return "full";
                }
                if (num != null) {
                    int i2 = newAuthTabSession + 3;
                    postMessage = i2 % 128;
                    int i3 = i2 % 2;
                    if (num.intValue() == 3) {
                        int i4 = postMessage + 25;
                        newAuthTabSession = i4 % 128;
                        int i5 = i4 % 2;
                        return "level_3";
                    }
                }
                if (num != null && num.intValue() == 4) {
                    return "external";
                }
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, objArr);
                String strIntern = ((String) objArr[0]).intern();
                int i6 = postMessage + 87;
                newAuthTabSession = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 35 / 0;
                }
                return strIntern;
            }
        }
        return "no_front_camera";
    }

    private final boolean onExtraCallback(CameraCharacteristics cameraCharacteristics) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 103;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            return false;
        }
        int i4 = newAuthTabSession + 119;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        if (num.intValue() != 0) {
            return false;
        }
        int i6 = newAuthTabSession;
        int i7 = i6 + 11;
        postMessage = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 41;
        postMessage = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = postMessage + 97;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "appopen", clearFaultAdjacentMetadata.onExtraCallback(new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.APPSFLYER, r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FIREBASE}), false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, "fb_mobile_search", r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FACEBOOK, false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
        int i4 = postMessage + 25;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onMessageChannelReady extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        onMessageChannelReady(access13800<? super onMessageChannelReady> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onMessageChannelReady(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x01b0, code lost:
        
            if (r3.onWarmupCompleted(r1, "AutoSetInAppStateOpen", r19) != r7) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x01e3, code lost:
        
            if (r3.onWarmupCompleted(r8, r5, "AutoSetInAppStateOpen", r19) != r7) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0240, code lost:
        
            if (r3.onExtraCallback(r2, "RestoreInAppStateOpen", r19) == r7) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0217 A[PHI: r0 r1 r2 r3
          0x0217: PHI (r0v44 o.ReactFontManagerAssetFontFamily) = (r0v19 o.ReactFontManagerAssetFontFamily), (r0v50 o.ReactFontManagerAssetFontFamily) binds: [B:48:0x0215, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x0217: PHI (r1v16 o.getPricingPhaseList) = (r1v11 o.getPricingPhaseList), (r1v19 o.getPricingPhaseList) binds: [B:48:0x0215, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x0217: PHI (r2v12 o.ProductDetailsPricingPhases) = (r2v7 o.ProductDetailsPricingPhases), (r2v14 o.ProductDetailsPricingPhases) binds: [B:48:0x0215, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x0217: PHI (r3v23 java.lang.Object) = (r3v11 java.lang.Object), (r3v28 java.lang.Object) binds: [B:48:0x0215, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x021f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instructions count: 604
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.onMessageChannelReady.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = postMessage + 101;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
    }

    private final void ResultReceiverMyResultReceiver() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel((access13800) null), 3, (Object) null);
        int i2 = postMessage + 53;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void MediaMetadataCompat() throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 17;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        validateRelationship();
        ICustomTabsServiceStubProxy();
        Object[] objArr = {AFj1nSDK5.onNavigationEvent, true};
        AFj1nSDK5.onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 1048141282, handleRemoveKey.onExtraCallbackWithResult(), -1048141279, handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult());
        AFj1oSDK.onExtraCallbackWithResult.onExtraCallback();
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -295821730, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 295821735);
        int i4 = postMessage + 13;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ResultReceiver() throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 29;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        if (zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
            int i4 = postMessage + 107;
            newAuthTabSession = i4 % 128;
            if (i4 % 2 == 0) {
                verifyHASH.onWarmupCompleted(248544737, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -248544729, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{verifyHASH.onExtraCallback, null, true, false, 5, null});
            } else {
                verifyHASH.onWarmupCompleted(248544737, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -248544729, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{verifyHASH.onExtraCallback, null, false, false, 3, null});
            }
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        int i = 2 % 2;
        int i2 = postMessage + 55;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult.onWarmupCompleted[((getBillingPeriod) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2058036084, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2058036068)).onExtraCallbackWithResult().ordinal()] != 1) {
            return null;
        }
        int i4 = newAuthTabSession + 51;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1071861627, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1071861681);
            return null;
        }
        onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1071861627, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1071861681);
        int i5 = 27 / 0;
        return null;
    }

    private static /* synthetic */ Object updateVisuals(Object[] objArr) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new onTransact(null), 3, (Object) null);
        int i2 = postMessage + 61;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return null;
    }

    private static final void RatingCompat() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 109;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        setJSBundleLoader setjsbundleloader = setJSBundleLoader.onNavigationEvent;
        DERSet dERSet = DERSet.onExtraCallback;
        setjsbundleloader.onExtraCallback(dERSet.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(), dERSet.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        int i4 = newAuthTabSession + 99;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        access000(access13800<? super access000> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new access000(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                DeviceInfoFieldGroup deviceInfoFieldGroupOnNavigationEvent = UST_CERT_GetPublicKeyInfo.onNavigationEvent(UST_CERT_GetPublicKeyInfo.onWarmupCompleted);
                this.label = 1;
                if (deviceInfoFieldGroupOnNavigationEvent.onExtraCallbackWithResult(this) == objOnWarmupCompleted) {
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

    private static final void RatingCompatStyle() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new access000(null), 3, (Object) null);
        int i2 = newAuthTabSession + 67;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void IEngagementSignalsCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final Unit access000(Throwable th) {
        int i = 2 % 2;
        int i2 = postMessage + 7;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("onLoginSessionStart", th);
            Unit unit = Unit.INSTANCE;
            int i3 = newAuthTabSession + 19;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("onLoginSessionStart", th);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStubProxy(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                H5TinyPopMenuTitleBarTheme h5TinyPopMenuTitleBarTheme = H5TinyPopMenuTitleBarTheme.IAuthTabCallback;
                Context contextOnWarmupCompleted = UST_CERT_GetPublicKeyInfo.onWarmupCompleted(UST_CERT_GetPublicKeyInfo.onWarmupCompleted);
                this.label = 1;
                if (h5TinyPopMenuTitleBarTheme.IAuthTabCallback(contextOnWarmupCompleted, this) == objOnWarmupCompleted) {
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

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new getInterfaceDescriptor(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                GriverDecodeUrl21 griverDecodeUrl21AsBinder = UST_CERT_GetPublicKeyInfo.asBinder(UST_CERT_GetPublicKeyInfo.onWarmupCompleted);
                this.label = 1;
                if (griverDecodeUrl21AsBinder.onWarmupCompleted(this) == objOnWarmupCompleted) {
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

    private static final Unit ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 35;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        enableKeyEvents.IAuthTabCallback.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 23;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return unit;
    }

    private static final Unit MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        Response response = Response.onNavigationEvent;
        UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm = new UST_CERT_GetPublicKeyAlgorithm(onWarmupCompleted.onSessionEnded(), ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().IAuthTabCallbackDefault());
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        AppStateManager.onExtraCallbackWithResult.IAuthTabCallback(uST_CERT_GetPublicKeyAlgorithm);
        setTopGuideText.onWarmupCompleted(375967420, new Object[]{setTopGuideText.onWarmupCompleted, uST_CERT_GetPublicKeyAlgorithm}, -375967419, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i2 = newAuthTabSession + 75;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, String str2, String str3, trackEventSynchronously trackeventsynchronously) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onExtraCallbackWithResult("(DEBUG) 해당 도메인에는 " + str + " 앱브릿지 실행 권한이 없습니다.");
        StringBuilder sb = new StringBuilder();
        sb.append("해당 도메인에서 " + str + " 앱브릿지 실행이 필요하다면 안드로이드 개발자에게 권한 추가를 요청해주세요.");
        sb.append('\n');
        sb.append("• 앱브릿지 이름 : " + str);
        sb.append('\n');
        sb.append("• 현재 도메인 : " + Uri.parse(str2).getHost());
        sb.append('\n');
        sb.append("• 진입 도메인 : " + Uri.parse(str3).getHost());
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{trackeventsynchronously, sb.toString()}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = newAuthTabSession + 91;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(final String str, final String str2, final String str3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        trackCheckout.IAuthTabCallback(trackCheckout.Companion.onNavigationEvent(), "APP_BRIDGE_PERMISSION_DENIED", 0, new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda78
            public final Object invoke(Object obj) {
                return UST_CERT_GetPublicKeyInfo.onExtraCallback(str, str3, str2, (trackEventSynchronously) obj);
            }
        }, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = postMessage + 51;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit PlaybackStateCompatCustomAction() {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r1 = r1 + 125
            int r2 = r1 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r2
            int r1 = r1 % r0
            java.lang.String r2 = "UserSessionStart"
            if (r1 == 0) goto L3f
            o.UST_CERT_GetPublicKeyInfo r1 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            int r5 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r4 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r7 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r8 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            r6 = 2058036084(0x7aab2374, float:4.443009E35)
            r9 = -2058036068(0xffffffff8554dc9c, float:-1.00087116E-35)
            java.lang.Object r1 = onExtraCallbackWithResult(r3, r4, r5, r6, r7, r8, r9)
            o.getBillingPeriod r1 = (o.getBillingPeriod) r1
            o.getPricingPhaseList r1 = r1.onExtraCallbackWithResult()
            o.getPricingPhaseList r3 = o.getPricingPhaseList.EU
            r4 = 39
            int r4 = r4 / 0
            if (r1 != r3) goto L7b
            goto L69
        L3f:
            o.UST_CERT_GetPublicKeyInfo r1 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            int r5 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r4 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r7 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            int r8 = im.toss.core.workerservice.WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback()
            r6 = 2058036084(0x7aab2374, float:4.443009E35)
            r9 = -2058036068(0xffffffff8554dc9c, float:-1.00087116E-35)
            java.lang.Object r1 = onExtraCallbackWithResult(r3, r4, r5, r6, r7, r8, r9)
            o.getBillingPeriod r1 = (o.getBillingPeriod) r1
            o.getPricingPhaseList r1 = r1.onExtraCallbackWithResult()
            o.getPricingPhaseList r3 = o.getPricingPhaseList.EU
            if (r1 != r3) goto L7b
        L69:
            o.r8lambda295zAJYjdsl38mfEBnLGXD9CqAA$onExtraCallback r1 = o.r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion
            r1.IAuthTabCallback(r2)
            int r1 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r1 = r1 + 111
            int r3 = r1 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L7b
            r0 = 3
            int r0 = r0 % r0
        L7b:
            o.r8lambda295zAJYjdsl38mfEBnLGXD9CqAA$onExtraCallback r0 = o.r8lambda295zAJYjdsl38mfEBnLGXD9CqAA.Companion
            r0.onExtraCallback(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.PlaybackStateCompatCustomAction():kotlin.Unit");
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i = 2 % 2;
        int i2 = postMessage + 109;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        allowAdditionalDecoder.onNavigationEvent.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return unit;
    }

    private static final Unit ResultReceiver1() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 19;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        enableFabricLogs.onExtraCallback.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 13;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object postMessage(Object[] objArr) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 21;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        loadNextAd.IAuthTabCallback.onWarmupCompleted(onWarmupCompleted.onSessionEnded());
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 123;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 63;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
            int i4 = newAuthTabSession + 17;
            postMessage = i4 % 128;
            if (i4 % 2 != 0) {
                r8lambdaShe2y8_pwjgTgnkclE5SBx7SZE.IAuthTabCallback.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            r8lambdaShe2y8_pwjgTgnkclE5SBx7SZE.IAuthTabCallback.IAuthTabCallback();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = newAuthTabSession + 113;
        postMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit RatingCompatApi19Impl() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 31;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        if (addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            int i4 = postMessage + 103;
            newAuthTabSession = i4 % 128;
            int i5 = i4 % 2;
            ReadableMapBufferMapBufferEntry.onExtraCallbackWithResult.onNavigationEvent();
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStub(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
            } catch (WebResourceResponseModel e) {
                Result.Companion companion = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                UtilsKtExternalSyntheticLambda11 utilsKtExternalSyntheticLambda11 = UtilsKtExternalSyntheticLambda11.IAuthTabCallback;
                this.label = 1;
                obj = UtilsKtExternalSyntheticLambda11.onExtraCallback(utilsKtExternalSyntheticLambda11, "shoppingReco.PreCook.enabled", (UtilsKtExternalSyntheticLambda3) null, this, 2, (Object) null);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Result.constructor-impl(obj);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            Result.Companion companion3 = Result.Companion;
            withRewardData withrewarddataOnPostMessage = AdSettingsIntegrationErrorMode.onNavigationEvent.onPostMessage();
            this.L$0 = access15400.onNavigationEvent(this);
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 2;
            obj = withrewarddataOnPostMessage.IAuthTabCallback(this);
            if (obj == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            Result.constructor-impl(obj);
            return Unit.INSTANCE;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new asBinder(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                TouchInterceptFrameLayout1 interfaceDescriptor = UST_CERT_GetPublicKeyInfo.getInterfaceDescriptor(UST_CERT_GetPublicKeyInfo.onWarmupCompleted);
                this.label = 1;
                if (interfaceDescriptor.onExtraCallback(this) == objOnWarmupCompleted) {
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

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new access100(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    setAlogFlushAddr setalogflushaddrOnTransact = UST_CERT_GetPublicKeyInfo.onTransact(UST_CERT_GetPublicKeyInfo.onWarmupCompleted);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = setalogflushaddrOnTransact.onWarmupCompleted(this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e3));
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) throws Throwable {
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = (UST_CERT_GetPublicKeyInfo) objArr[0];
        int i = 2 % 2;
        wasLastName waslastnameOnWarmupCompleted = IAuthTabCallback(uST_CERT_GetPublicKeyInfo, "onLoginSessionStart", false, 2, null).onNavigationEvent(NetConverter3.onExtraCallback()).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda25
            public final void run() {
                UST_CERT_GetPublicKeyInfo.onWarmupCompleted();
            }
        });
        deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda30
            public final void run() {
                UST_CERT_GetPublicKeyInfo.ICustomTabsCallbackDefault();
            }
        };
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda31
            public final Object invoke(Object obj) {
                return (Unit) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{(Throwable) obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2068618783, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2068618747);
            }
        };
        waslastnameOnWarmupCompleted.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda32
            public final void accept(Object obj) {
                UST_CERT_GetPublicKeyInfo.IAuthTabCallback_Parcel(function1, obj);
            }
        });
        onFirstFrameRendered.Companion.onWarmupCompleted().onExtraCallbackWithResult();
        if (((getBillingPeriod) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2058036084, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2058036068)).onExtraCallbackWithResult() != getPricingPhaseList.EU) {
            maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(null), 3, (Object) null);
        }
        uST_CERT_GetPublicKeyInfo.addObserverForBackInvokerlambda0();
        findResAndMsg findresandmsg = ICustomTabsCallback;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(null), 3, (Object) null);
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda33
            public final Object invoke() {
                return (Unit) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1632718222, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1632718222);
            }
        });
        onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo, "onLoginSessionStart"}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -901952901, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 901952942);
        uST_CERT_GetPublicKeyInfo.ICustomTabsServiceStubProxy();
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda34
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.IAuthTabCallback();
            }
        });
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda35
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.ICustomTabsCallbackStubProxy();
            }
        });
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda36
            public final Object invoke() {
                return (Unit) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1081486982, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1081487032);
            }
        });
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda37
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.ICustomTabsCallback_Parcel();
            }
        });
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda38
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.getInterfaceDescriptor();
            }
        });
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda26
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.onPostMessage();
            }
        });
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda27
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.access000();
            }
        });
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda28
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.onMessageChannelReady();
            }
        });
        uST_CERT_GetPublicKeyInfo.onWarmupCompleted(new Function0() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda29
            public final Object invoke() {
                return UST_CERT_GetPublicKeyInfo.asInterface();
            }
        });
        if (zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new access100(null), 3, (Object) null);
        }
        uST_CERT_GetPublicKeyInfo.IPostMessageServiceDefault().onWarmupCompleted();
        AFj1nSDK5.onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 1048141282, handleRemoveKey.onExtraCallbackWithResult(), -1048141279, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{AFj1nSDK5.onNavigationEvent, true}, handleRemoveKey.onExtraCallbackWithResult());
        AFj1oSDK.onExtraCallbackWithResult.onExtraCallback();
        onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -295821730, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 295821735);
        GetFeatureExtension.onWarmupCompleted.onNavigationEvent(new GetInputImageFromPathAsUnchanged.IAuthTabCallback(0L, DERSet.onExtraCallback.MediaSessionCompatQueueItem(), 0L, 5, (DefaultConstructorMarker) null));
        int i2 = newAuthTabSession + 57;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static final class onMinimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onMinimized(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        
            if (r5.IAuthTabCallback(r4) == r0) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.onNavigationEvent(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.onNavigationEvent(r5)
                goto L2b
            L1e:
                kotlin.ResultKt.onNavigationEvent(r5)
                o.LifecyclesKtawaitStarted21 r5 = o.LifecyclesKtawaitStarted21.IAuthTabCallback
                r4.label = r3
                java.lang.Object r5 = r5.onNavigationEvent(r3, r4)
                if (r5 == r0) goto L47
            L2b:
                o.zzad r5 = o.zzaj.onNavigationEvent()
                boolean r5 = r5.AudioAttributesImplApi21Parcelizer()
                if (r5 == 0) goto L44
                o.UST_CERT_GetPublicKeyInfo r5 = o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted
                o.forNonGDPRUser r5 = o.UST_CERT_GetPublicKeyInfo.access100(r5)
                r4.label = r2
                java.lang.Object r5 = r5.IAuthTabCallback(r4)
                if (r5 != r0) goto L44
                goto L47
            L44:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L47:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.onMinimized.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void addObserverForBackInvokerlambda0() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new onMinimized(null), 3, (Object) null);
        int i2 = newAuthTabSession + 47;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void ComponentActivity() {
        int i = 2 % 2;
        int i2 = postMessage + 111;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ComposableLambdaImplExternalSyntheticLambda9.onNavigationEvent(onSessionEnded());
        isPreload.onWarmupCompleted(isPreload.onWarmupCompleted, false, 1, (Object) null);
        dispatchEvent.onNavigationEvent.IAuthTabCallback();
        AppStateManager appStateManager = AppStateManager.onExtraCallbackWithResult;
        appStateManager.extraCallbackWithResult().IAuthTabCallback(getSdkKey.onExtraCallback.onExtraCallback.IAuthTabCallback);
        appStateManager.onMinimized().onWarmupCompleted(TubaVarV1SyncState.onWarmupCompleted.onExtraCallback.onExtraCallback);
        appStateManager.IAuthTabCallback_Parcel().onEvent(getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult);
        H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onExtraCallbackWithResult();
        AFj1nSDK5.onExtraCallbackWithResult(AFj1nSDK5.onNavigationEvent, false, 1, (Object) null);
        AFj1oSDK.onExtraCallbackWithResult.onExtraCallback();
        setClipboard.onNavigationEvent.asBinder();
        onVerticalScrollEvent().onExtraCallbackWithResult();
        ITrustedWebActivityService().IAuthTabCallbackDefault();
        ITrustedWebActivityService().asInterface();
        int i4 = postMessage + 53;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void validateRelationship() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent((access13800) null), 3, (Object) null);
        int i2 = newAuthTabSession + 23;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void onGreatestScrollPercentageIncreased(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 81;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 3;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IEngagementSignalsCallback(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 21;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(new Object[]{onWarmupCompleted}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 445392062, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -445392047);
            return Unit.INSTANCE;
        }
        onExtraCallbackWithResult(new Object[]{onWarmupCompleted}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 445392062, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -445392047);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onVerticalScrollEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 61;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 117;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newAuthTabSession(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        disableOldAndroidAttachmentMetricsWorkarounds disableoldandroidattachmentmetricsworkarounds = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback;
        Object obj = null;
        if (!disableoldandroidattachmentmetricsworkarounds.IAuthTabCallback().onExtraCallback()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "checkout", "userInitDataSyncState is ongoing (caller=" + str + ")", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return null;
        }
        int i2 = newAuthTabSession + 113;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            AppStateManager.onExtraCallbackWithResult.readTypedObject();
            obj.hashCode();
            throw null;
        }
        Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = ((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(-264221534, new Object[]{disableoldandroidattachmentmetricsworkarounds, str + " - activity: " + (typedObject != null ? typedObject.getClass().getSimpleName() : null), false, 2, null}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 264221539, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).onWarmupCompleted(clearTid.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda15
            public final Object invoke(Object obj2) {
                return (Unit) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{(CheckoutResult) obj2}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -544407455, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 544407476);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda16
            public final void accept(Object obj2) {
                UST_CERT_GetPublicKeyInfo.access000(function1, obj2);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda17
            public final Object invoke(Object obj2) {
                return UST_CERT_GetPublicKeyInfo.IAuthTabCallbackDefault((Throwable) obj2);
            }
        };
        jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda18
            public final void accept(Object obj2) {
                UST_CERT_GetPublicKeyInfo.ICustomTabsService(function12, obj2);
            }
        });
        int i3 = postMessage + 61;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final boolean IAuthTabCallback(String str, zzad zzadVar) throws Throwable {
        Object obj;
        String path;
        int i = 2 % 2;
        boolean z = false;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-114, -117, -117, -122, -99, -100, -101}, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new int[]{-53935456, 3815477, -1130369377, -970659445}, 8 - KeyEvent.getDeadChar(0, 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(new int[]{-615086964, 2113813001, -1973295758, 856586880, 932301790, 691692220}, 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
        List listListOf = CollectionsKt.listOf(new String[]{strIntern, "apps", strIntern2, "users", ((String) objArr3[0]).intern()});
        try {
            Result.Companion companion = Result.Companion;
            List listListOf2 = CollectionsKt.listOf(new URI[]{new URI(zzadVar.IAuthTabCallbackDefault()), new URI(zzadVar.IAuthTabCallbackStub())});
            URI uri = new URI(str);
            List list = listListOf2;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    URI uri2 = (URI) it.next();
                    if (Intrinsics.areEqual(uri.getHost(), uri2.getHost())) {
                        String path2 = uri2.getPath();
                        Intrinsics.checkNotNullExpressionValue(path2, "");
                        if (StringsKt.endsWith$default(path2, "/", false, 2, (Object) null)) {
                            int i2 = newAuthTabSession + 47;
                            postMessage = i2 % 128;
                            int i3 = i2 % 2;
                            path = uri2.getPath();
                        } else {
                            path = uri2.getPath() + "/";
                            int i4 = newAuthTabSession + 97;
                            postMessage = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        String path3 = uri.getPath();
                        Intrinsics.checkNotNullExpressionValue(path3, "");
                        Intrinsics.checkNotNull(path);
                        String strRemovePrefix = StringsKt.removePrefix(path3, path);
                        List list2 = listListOf;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (StringsKt.startsWith$default(strRemovePrefix, (String) it2.next(), false, 2, (Object) null)) {
                                    z = true;
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            } else {
                int i6 = postMessage + 21;
                newAuthTabSession = i6 % 128;
                int i7 = i6 % 2;
            }
            obj = Result.constructor-impl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            obj = Boolean.FALSE;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r7 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r7 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1 = r6.asBinder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        switch(r1.hashCode()) {
            case -215214285: goto L50;
            case 600353211: goto L46;
            case 829463265: goto L42;
            case 872486392: goto L34;
            case 1376761651: goto L30;
            default: goto L55;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r1.equals("passwordResetRequired") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        IAuthTabCallback(r6);
        r5.onEvent(o.getSegmentCollection.onWarmupCompleted.IAuthTabCallback.IAuthTabCallback);
        r1 = o.UST_CERT_GetPublicKeyInfo.postMessage + 69;
        o.UST_CERT_GetPublicKeyInfo.newAuthTabSession = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (r1.equals("blockUser") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        r1 = o.UST_CERT_GetPublicKeyInfo.postMessage + 87;
        o.UST_CERT_GetPublicKeyInfo.newAuthTabSession = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if ((r1 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        IAuthTabCallback(r6);
        r5.onEvent(o.getSegmentCollection.onWarmupCompleted.onWarmupCompleted.onExtraCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        IAuthTabCallback(r6);
        r5.onEvent(o.getSegmentCollection.onWarmupCompleted.onWarmupCompleted.onExtraCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        if (r1.equals("pauseUser") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        IAuthTabCallback(r6);
        r5.onEvent(o.getSegmentCollection.onWarmupCompleted.IAuthTabCallback_Parcel.IAuthTabCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        if (r1.equals("dsDelayRequest") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        r1 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession + 15;
        o.UST_CERT_GetPublicKeyInfo.postMessage = r1 % 128;
        r1 = r1 % 2;
        o.ConvertFloatArrayToByteArray.IAuthTabCallback(-727664198, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), 727664201, new java.lang.Object[]{o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "dsDelayRequest", null, 2, null}, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult());
        o.RedBoxContentViewOpenStackFrameTask.Companion.onExtraCallbackWithResult(o.UserChoiceBillingListener.onExtraCallback.onExtraCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        if (r1.equals("ForceUpdateRequired") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010e, code lost:
    
        IAuthTabCallback(r6);
        r1 = o.setMediationProvider.Companion;
        r2 = IEngagementSignalsCallback_Parcel().getString(viva.republica.toss.R.string.check_version_update_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r4 = IEngagementSignalsCallback_Parcel().getString(viva.republica.toss.R.string.app_check_version_update_subtitle);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
        r3.IAuthTabCallback_Parcel().onEvent(new o.getAdUnitIds.onExtraCallbackWithResult.onWarmupCompleted(r1.onExtraCallbackWithResult(r2, r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0148, code lost:
    
        if (o.setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
    
        o.UST_CERT_GetSignatureAlgorithm.onExtraCallback.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014f, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onExtraCallback(im.toss.network.throwable.TossApiCallException r21) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.onExtraCallback(im.toss.network.throwable.TossApiCallException):boolean");
    }

    private final void onNavigationEvent(TossApiCallException tossApiCallException) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 59;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
            if (!(tossApiCallException instanceof TossApiCallException.DeserializationError)) {
                return;
            }
        } else if (!(tossApiCallException instanceof TossApiCallException.DeserializationError)) {
            return;
        }
        if (zzaj.onNavigationEvent().ICustomTabsCallback_Parcel()) {
            trackCheckout.IAuthTabCallback(trackCheckout.Companion.onNavigationEvent(), "API_PARSING_ERROR", 0, new AppStateHandler$.ExternalSyntheticLambda24(tossApiCallException), 2, (Object) null);
            int i4 = postMessage + 89;
            newAuthTabSession = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(TossApiCallException tossApiCallException, trackEventSynchronously trackeventsynchronously) {
        String strEncodedPath;
        HttpUrl httpUrlUrl;
        String strHost;
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onExtraCallbackWithResult("(DEBUG) API 파싱 에러 감지");
        StringBuilder sb = new StringBuilder();
        sb.append("API 파싱 에러가 감지되었습니다. 자세한 내용은 로그를 확인해주세요.");
        sb.append('\n');
        String str2 = (String) TossApiCallException.onExtraCallbackWithResult(-1822689457, new Object[]{tossApiCallException}, 1822689458, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult());
        if (str2 != null) {
            sb.append("• X-Toss-EventId : " + str2);
            sb.append('\n');
        }
        Request requestOnNavigationEvent = tossApiCallException.onNavigationEvent();
        if (requestOnNavigationEvent != null) {
            int i2 = newAuthTabSession + 11;
            postMessage = i2 % 128;
            int i3 = i2 % 2;
            HttpUrl httpUrlUrl2 = requestOnNavigationEvent.url();
            if (httpUrlUrl2 != null && (strHost = httpUrlUrl2.host()) != null) {
                str = strHost;
            }
        }
        sb.append("• Host : " + str);
        sb.append('\n');
        Request requestOnNavigationEvent2 = tossApiCallException.onNavigationEvent();
        if (requestOnNavigationEvent2 == null || (httpUrlUrl = requestOnNavigationEvent2.url()) == null || (strEncodedPath = httpUrlUrl.encodedPath()) == null) {
            strEncodedPath = (String) TossApiCallException.onExtraCallbackWithResult(814865993, new Object[]{tossApiCallException}, -814865993, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult());
            int i4 = postMessage + 57;
            newAuthTabSession = i4 % 128;
            int i5 = i4 % 2;
        }
        sb.append("• Path : " + strEncodedPath);
        sb.append('\n');
        sb.append('\n');
        sb.append(((TossApiCallException.DeserializationError) tossApiCallException).getLocalizedMessage());
        sb.append('\n');
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{trackeventsynchronously, sb.toString()}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(TossApiCallException.ApiError apiError) {
        int i = 2 % 2;
        String strOnExtraCallback = RemoteWorkManager.onWarmupCompleted.onExtraCallback("trackUserError");
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        Request requestOnNavigationEvent = apiError.onNavigationEvent();
        if (requestOnNavigationEvent != null) {
            int i2 = newAuthTabSession + 45;
            postMessage = i2 % 128;
            if (i2 % 2 != 0) {
                requestOnNavigationEvent.body();
                throw null;
            }
            RequestBody requestBodyBody = requestOnNavigationEvent.body();
            if (requestBodyBody != null) {
                requestBodyBody.writeTo(tTBaseActivity);
                int i3 = newAuthTabSession + 31;
                postMessage = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        String strOnRelationshipValidationResult = tTBaseActivity.onRelationshipValidationResult();
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "UserError", apiError.IAuthTabCallbackStub() + "/" + apiError.asBinder() + "/" + apiError.getMessage() + "/" + ((String) TossApiCallException.onExtraCallbackWithResult(814865993, new Object[]{apiError}, -814865993, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult())) + "/key=" + strOnExtraCallback + "/reqBody=" + strOnRelationshipValidationResult, (Throwable) null, (Map) null, 12, (Object) null);
    }

    private static final void IPostMessageServiceDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 121;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newAuthTabSession + 71;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsServiceStub(Object[] objArr) {
        Context context = (Context) objArr[0];
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 61;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
            commonTestFlag.onExtraCallback.onNavigationEvent((String) RSASSAPSSparams.onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{rSASSAPSSparams}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1054676118, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1054676117, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()), DetectOcclusion.onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent(context), CommonModule_closeView.onWarmupCompleted.access000());
            throw null;
        }
        Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
        String strOnNavigationEvent = commonTestFlag.onExtraCallback.onNavigationEvent((String) RSASSAPSSparams.onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{rSASSAPSSparams}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1054676118, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1054676117, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()), DetectOcclusion.onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent(context), CommonModule_closeView.onWarmupCompleted.access000());
        if (strOnNavigationEvent != null) {
            return strOnNavigationEvent;
        }
        int i3 = postMessage + 15;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return "";
    }

    private static final CharSequence onNavigationEvent(RSASSAPSSparams rSASSAPSSparams) {
        int i = 2 % 2;
        int i2 = postMessage + 1;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
        String strAsBinder = rSASSAPSSparams.asBinder();
        int i4 = postMessage + 13;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return strAsBinder;
    }

    private static final CharSequence onExtraCallbackWithResult(RSASSAPSSparams rSASSAPSSparams) {
        int i = 2 % 2;
        int i2 = postMessage + 45;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
        String strReplace$default = StringsKt.replace$default(rSASSAPSSparams.onWarmupCompleted(), " ", "", false, 4, (Object) null);
        int i4 = newAuthTabSession + 21;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return strReplace$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(im.toss.core.tracker.entry.TrackLog.onWarmupCompleted r27, final android.content.Context r28, java.util.List r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.onNavigationEvent(im.toss.core.tracker.entry.TrackLog$onWarmupCompleted, android.content.Context, java.util.List):kotlin.Unit");
    }

    private static final Unit readTypedObject(Throwable th) {
        int i = 2 % 2;
        int i2 = postMessage + 93;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ScrapingWrapper.getAllCertificatesOnce error", th);
            Unit unit = Unit.INSTANCE;
            int i3 = postMessage + 97;
            newAuthTabSession = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 15 / 0;
            }
            return unit;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ScrapingWrapper.getAllCertificatesOnce error", th);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        final Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        TrackLog.onWarmupCompleted onWarmupCompleted2 = new TrackLog.onWarmupCompleted(1017615L).onWarmupCompleted("category", "common");
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126, -119, -122, -115}, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, objArr2);
        final TrackLog.onWarmupCompleted onWarmupCompleted3 = onWarmupCompleted2.onWarmupCompleted("view", ((String) objArr2[0]).intern());
        if (EncoderImplExternalSyntheticLambda9.onExtraCallbackWithResult(contextOnExtraCallback, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            writeRaw<List<RSASSAPSSparams>> writerawIAuthTabCallback = genSignatureValueWithDigest.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback();
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda11
                public final Object invoke(Object obj) {
                    return UST_CERT_GetPublicKeyInfo.onWarmupCompleted(onWarmupCompleted3, contextOnExtraCallback, (List) obj);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda12
                public final void accept(Object obj) {
                    UST_CERT_GetPublicKeyInfo.onMessageChannelReady(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda13
                public final Object invoke(Object obj) {
                    return UST_CERT_GetPublicKeyInfo.onNavigationEvent((Throwable) obj);
                }
            };
            Intrinsics.checkNotNull(writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda14
                public final void accept(Object obj) throws Throwable {
                    UST_CERT_GetPublicKeyInfo.onWarmupCompleted(function12, obj);
                }
            }));
            return null;
        }
        Object[] objArr3 = {onWarmupCompleted3.onExtraCallbackWithResult()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = newAuthTabSession + 87;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit asInterface(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 1;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-116, -117, -97, -98}, View.MeasureSpec.getSize(0) + 127, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), "small");
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 105;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final void r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        getModules getmodules;
        int i = 2 % 2;
        int i2 = postMessage + 95;
        newAuthTabSession = i2 % 128;
        boolean z = false;
        Object obj = null;
        if (i2 % 2 == 0) {
            getmodules = getModules.onExtraCallbackWithResult;
            if (!getModules.onNavigationEvent(getmodules, (String) null, 0, (Object) null)) {
                return;
            }
        } else {
            getmodules = getModules.onExtraCallbackWithResult;
            if (!getModules.onNavigationEvent(getmodules, (String) null, 1, (Object) null)) {
                return;
            }
        }
        int i3 = newAuthTabSession + 117;
        postMessage = i3 % 128;
        if (i3 % 2 == 0) {
            if (getmodules.onExtraCallback("medium")) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1005906L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda126
                    public final Object invoke(Object obj2) {
                        return (Unit) UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{(SetDetectableSize) obj2}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1380903564, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1380903555);
                    }
                }, 14, (Object) null);
                z = true;
            }
            if (getmodules.onExtraCallback("small")) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1005906L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda127
                    public final Object invoke(Object obj2) {
                        return UST_CERT_GetPublicKeyInfo.onNavigationEvent((SetDetectableSize) obj2);
                    }
                }, 14, (Object) null);
                z = true;
            }
            if (!(!z)) {
                getModules.onWarmupCompleted(getmodules, (String) null, 1, (Object) null);
                return;
            }
            return;
        }
        getmodules.onExtraCallback("medium");
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newSessionWithExtras(Object[] objArr) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new readTypedObject(null), 3, (Object) null);
        int i2 = postMessage + 95;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(AppState appState) {
        int i = 2 % 2;
        int i2 = postMessage + 27;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appState, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = appState.onNavigationEvent(true);
        int i4 = postMessage + 105;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return jsonReaderUnknownNumberParsingOnNavigationEvent;
    }

    private static final boolean IEngagementSignalsCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 45;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ((Boolean) function1.invoke(obj)).booleanValue();
        throw null;
    }

    private static final void IPostMessageServiceStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 125;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newAuthTabSession + 67;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean access000(Boolean bool) {
        int i = 2 % 2;
        int i2 = postMessage + 57;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        boolean zBooleanValue = bool.booleanValue();
        int i4 = postMessage + 29;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onSessionEnded(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 47;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i4 = postMessage + 19;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private final void r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = IAuthTabCallback_Parcel.IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda1(new AppStateHandler$.ExternalSyntheticLambda0())).onWarmupCompleted(new AppStateHandler$.ExternalSyntheticLambda3(new AppStateHandler$.ExternalSyntheticLambda2()));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(clearTid.onExtraCallback()).IAuthTabCallback(new AppStateHandler$.ExternalSyntheticLambda5(new AppStateHandler$.ExternalSyntheticLambda4()));
        int i2 = newAuthTabSession + 25;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit access100(Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 105;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        getLastTrimMemoryLevel.onNavigationEvent onnavigationevent = getLastTrimMemoryLevel.Companion;
        UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo = onWarmupCompleted;
        Context contextOnSessionEnded = uST_CERT_GetPublicKeyInfo.onSessionEnded();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-102, -104, -110, -111, -110, -102, -103, -104, -112, -105, -106, -107, -108, -111, -110, -109, -110, -111, -112, -113, -118, -126, -124, -119, -114, -114, -119, -115, -120, -116, -117, -118, -121, -119, -124, -120, -121, -126, -122}, View.resolveSizeAndState(0, 0, 0) + 127, objArr);
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "permission_info", "background to foreground", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("fitness_auth", onnavigationevent.onExtraCallbackWithResult(contextOnSessionEnded, ((String) objArr[0]).intern())), getWrite.IAuthTabCallback("location_auth", onnavigationevent.onExtraCallbackWithResult(uST_CERT_GetPublicKeyInfo.onSessionEnded(), "android.permission.ACCESS_FINE_LOCATION"))}), (String) null, false, (String) null, 56, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 39;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = postMessage + 59;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = newAuthTabSession + 89;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    private final deserializeUriNullableCollection onWarmupCompleted(final Function0<Unit> function0) {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = clearTid.onExtraCallback().onExtraCallback(new Runnable() { // from class: viva.republica.toss.core.AppStateHandler$$ExternalSyntheticLambda125
            @Override // java.lang.Runnable
            public final void run() {
                UST_CERT_GetPublicKeyInfo.onExtraCallback(function0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallback, "");
        int i2 = postMessage + 29;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            return deserializeurinullablecollectionOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 117;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            if (UST_CMP_IssueCertificate.onNavigationEvent.asBinder()) {
                int i3 = newAuthTabSession + 39;
                postMessage = i3 % 128;
                if (i3 % 2 != 0) {
                    UST_CMP_IssueCertificate.IAuthTabCallback(-596488443, new Object[]{false, UST_CMP_IssueCertificate.onExtraCallback.LOGIN, "LOGIN_ABNORMAL_SESSION", null, 2, 7, null}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 596488447);
                    return;
                } else {
                    UST_CMP_IssueCertificate.IAuthTabCallback(-596488443, new Object[]{false, UST_CMP_IssueCertificate.onExtraCallback.LOGIN, "LOGIN_ABNORMAL_SESSION", null, 5, 9, null}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 596488447);
                    return;
                }
            }
            return;
        }
        UST_CMP_IssueCertificate.onNavigationEvent.asBinder();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void ICustomTabsServiceStubProxy() throws NoWhenBranchMatchedException {
        getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub iAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 83;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_VerifyCertificate uST_CERT_VerifyCertificateIAuthTabCallback = IEngagementSignalsCallbackStub().IAuthTabCallback();
        if (uST_CERT_VerifyCertificateIAuthTabCallback instanceof UST_CERT_VerifyCertificate.onExtraCallbackWithResult) {
            return;
        }
        Object obj = null;
        if (!(uST_CERT_VerifyCertificateIAuthTabCallback instanceof UST_CERT_VerifyCertificate.onWarmupCompleted.onNavigationEvent)) {
            if (!(uST_CERT_VerifyCertificateIAuthTabCallback instanceof UST_CERT_VerifyCertificate.onWarmupCompleted.onExtraCallback) && !(uST_CERT_VerifyCertificateIAuthTabCallback instanceof UST_CERT_VerifyCertificate.onWarmupCompleted.IAuthTabCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            iAuthTabCallbackStub = getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault.onWarmupCompleted;
        } else {
            int i4 = newAuthTabSession + 21;
            postMessage = i4 % 128;
            if (i4 % 2 != 0) {
                getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub iAuthTabCallbackStub2 = getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub.onNavigationEvent;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallbackStub = getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub.onNavigationEvent;
        }
        AppStateManager.onExtraCallbackWithResult.onActivityLayout().onEvent(iAuthTabCallbackStub);
        int i5 = newAuthTabSession + 45;
        postMessage = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void onNavigationEvent(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo, Activity activity, UST_CERT_SetCertVerifyEnv uST_CERT_SetCertVerifyEnv, String str, String str2, String str3, String str4, int i, boolean z, int i2, Object obj) {
        String str5;
        boolean z2;
        int i3 = 2 % 2;
        if ((i2 & 32) != 0) {
            int i4 = postMessage + 93;
            newAuthTabSession = i4 % 128;
            int i5 = i4 % 2;
            str5 = "";
        } else {
            str5 = str4;
        }
        int i6 = (i2 & 64) != 0 ? 4 : i;
        if ((i2 & 128) != 0) {
            int i7 = postMessage + 59;
            newAuthTabSession = i7 % 128;
            z2 = i7 % 2 == 0;
        } else {
            z2 = z;
        }
        uST_CERT_GetPublicKeyInfo.IAuthTabCallback(activity, uST_CERT_SetCertVerifyEnv, str, str2, str3, str5, i6, z2);
    }

    private final void IAuthTabCallback(Activity activity, UST_CERT_SetCertVerifyEnv uST_CERT_SetCertVerifyEnv, String str, String str2, String str3, String str4, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 63;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        if (activity instanceof ClearAppDataAndExitActivity) {
            return;
        }
        if (activity == null || (!AppState.Companion.onExtraCallbackWithResult().IAuthTabCallback())) {
            UST_CMP_IssueCertificate.IAuthTabCallback(-596488443, new Object[]{false, UST_CMP_IssueCertificate.onExtraCallback.MEMBER_STATE, uST_CERT_SetCertVerifyEnv.name(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "AppStateHandler")), Integer.valueOf(i), 1, null}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 596488447);
        } else {
            int i5 = postMessage + 1;
            newAuthTabSession = i5 % 128;
            int i6 = i5 % 2;
            getNavigationBar.IAuthTabCallback(ClearAppDataAndExitActivity.Companion.IAuthTabCallback(activity, str, str2, z, str3, str4, uST_CERT_SetCertVerifyEnv.name(), i), onSessionEnded());
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setCommonNetworkProxy setcommonnetworkproxyOnExtraCallback = UST_CERT_GetPublicKeyInfo.onExtraCallback(UST_CERT_GetPublicKeyInfo.onWarmupCompleted);
                this.label = 1;
                if (setCommonNetworkProxy.onWarmupCompleted(setcommonnetworkproxyOnExtraCallback, false, this, 1, (Object) null) == objOnWarmupCompleted) {
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

    private final void access200() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        int i2 = newAuthTabSession + 109;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
    }

    private final void onExtraCallbackWithResult(Activity activity) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 15;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (activity != null) {
            int i5 = i2 + 109;
            postMessage = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.areEqual(onVisit.IAuthTabCallback(activity), getCompressedSize.Companion.IAuthTabCallback(activity).IAuthTabCallback());
                obj.hashCode();
                throw null;
            }
            getCompressedSize getcompressedsizeIAuthTabCallback = getCompressedSize.Companion.IAuthTabCallback(activity);
            if (!Intrinsics.areEqual(onVisit.IAuthTabCallback(activity), getcompressedsizeIAuthTabCallback.IAuthTabCallback())) {
                int i6 = newAuthTabSession + 61;
                postMessage = i6 % 128;
                int i7 = i6 % 2;
                activity.startActivity(getcompressedsizeIAuthTabCallback.onNavigationEvent(activity));
            }
        }
        int i8 = postMessage + 113;
        newAuthTabSession = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        extraCallbackWithResult(access13800<? super extraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new extraCallbackWithResult(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getStartTimeMillis getstarttimemillisIAuthTabCallback = UST_CERT_GetPublicKeyInfo.IAuthTabCallback(UST_CERT_GetPublicKeyInfo.onWarmupCompleted);
                    this.label = 1;
                    if (getstarttimemillisIAuthTabCallback.onExtraCallback(this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } catch (Exception e) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "syncAppLanguageSetting", "Failed to sync the app language setting : " + message, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            }
            return Unit.INSTANCE;
        }
    }

    private final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ICustomTabsCallback, (CoroutineContext) null, (setRandomHost) null, new extraCallbackWithResult(null), 3, (Object) null);
        int i2 = postMessage + 33;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 125;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(SessionState.Companion.onExtraCallback().asInterface(), SessionState.State.LoginSession.onExtraCallbackWithResult)) {
            setMessageBytes.onNavigationEvent((wasLastName) onExtraCallbackWithResult(new Object[]{this, "onLocaleChanged", true}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -401540738, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 401540751), new AppStateHandler$.ExternalSyntheticLambda6(), new AppStateHandler$.ExternalSyntheticLambda7());
        }
        int i4 = newAuthTabSession + 43;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 119;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit access100(Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 9;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("onLocaleChanged", th);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("onLocaleChanged", th);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = postMessage + 51;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zITrustedWebActivityServiceStubProxy = ITrustedWebActivityServiceStubProxy();
        int i4 = postMessage + 27;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return zITrustedWebActivityServiceStubProxy;
    }

    private static /* synthetic */ Object onSessionEnded(Object[] objArr) {
        int i = 2 % 2;
        int i2 = postMessage + 67;
        newAuthTabSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            SessionState.Companion.onExtraCallback().onExtraCallback();
            return null;
        }
        SessionState.Companion.onExtraCallback().onExtraCallback();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r1
      0x0036: PHI (r1v9 java.util.List<kotlin.Pair<java.lang.ref.WeakReference<android.app.Activity>, java.lang.Long>>) = 
      (r1v8 java.util.List<kotlin.Pair<java.lang.ref.WeakReference<android.app.Activity>, java.lang.Long>>)
      (r1v25 java.util.List<kotlin.Pair<java.lang.ref.WeakReference<android.app.Activity>, java.lang.Long>>)
     binds: [B:10:0x0034, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[PHI: r1
      0x003f: PHI (r1v21 java.util.List<kotlin.Pair<java.lang.ref.WeakReference<android.app.Activity>, java.lang.Long>>) = 
      (r1v8 java.util.List<kotlin.Pair<java.lang.ref.WeakReference<android.app.Activity>, java.lang.Long>>)
      (r1v9 java.util.List<kotlin.Pair<java.lang.ref.WeakReference<android.app.Activity>, java.lang.Long>>)
      (r1v25 java.util.List<kotlin.Pair<java.lang.ref.WeakReference<android.app.Activity>, java.lang.Long>>)
     binds: [B:10:0x0034, B:12:0x003d, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean ITrustedWebActivityServiceStubProxy() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            o.zzad r1 = o.zzaj.onNavigationEvent()
            boolean r1 = r1.AudioAttributesImplApi21Parcelizer()
            if (r1 == 0) goto Lb4
            int r1 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r1 = r1 + 55
            int r2 = r1 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2a
            viva.republica.toss.core.AppStateManager r1 = viva.republica.toss.core.AppStateManager.onExtraCallbackWithResult
            java.util.List r1 = r1.onMessageChannelReady()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            r5 = 66
            int r5 = r5 / r2
            if (r4 == 0) goto L3f
            goto L36
        L2a:
            viva.republica.toss.core.AppStateManager r1 = viva.republica.toss.core.AppStateManager.onExtraCallbackWithResult
            java.util.List r1 = r1.onMessageChannelReady()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L3f
        L36:
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L7e
        L3f:
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r4 = r1.hasNext()
            r4 = r4 ^ r3
            if (r4 == r3) goto L7e
            int r4 = o.UST_CERT_GetPublicKeyInfo.newAuthTabSession
            int r4 = r4 + 19
            int r5 = r4 % 128
            o.UST_CERT_GetPublicKeyInfo.postMessage = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L6a
            java.lang.Object r4 = r1.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.onExtraCallbackWithResult()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            boolean r4 = r4 instanceof viva.republica.toss.password.reset.PasswordBlockResetActivity
            if (r4 == 0) goto L43
            goto Lb2
        L6a:
            java.lang.Object r0 = r1.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.onExtraCallbackWithResult()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof viva.republica.toss.password.reset.PasswordBlockResetActivity
            r0 = 0
            throw r0
        L7e:
            viva.republica.toss.core.AppStateManager r0 = viva.republica.toss.core.AppStateManager.onExtraCallbackWithResult
            java.util.List r0 = r0.onMessageChannelReady()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == r3) goto L8b
            goto L94
        L8b:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lb3
        L94:
            java.util.Iterator r0 = r0.iterator()
        L98:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r1 = r1.onExtraCallbackWithResult()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            boolean r1 = r1 instanceof viva.republica.toss.password.reset.PasswordBlockIntroActivity
            if (r1 == 0) goto L98
        Lb2:
            return r3
        Lb3:
            return r2
        Lb4:
            o.ExternalOfferInformationDialogListener r0 = r6.IEngagementSignalsCallbackStubProxy()
            boolean r0 = r0.onWarmupCompleted()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyInfo.ITrustedWebActivityServiceStubProxy():boolean");
    }

    public static /* synthetic */ useNavigationStyleTitleBar onExtraCallbackWithResult() {
        return (useNavigationStyleTitleBar) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1662159298, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1662159267);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CheckoutResult checkoutResult) {
        return (Unit) onExtraCallbackWithResult(new Object[]{checkoutResult}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -544407455, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 544407476);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        return (Unit) onExtraCallbackWithResult(new Object[]{th}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2068618783, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2068618747);
    }

    public static /* synthetic */ TubaVarV1SyncState.onExtraCallback.onWarmupCompleted onExtraCallback(VarsResult varsResult, CdnVars cdnVars) {
        return (TubaVarV1SyncState.onExtraCallback.onWarmupCompleted) onExtraCallbackWithResult(new Object[]{varsResult, cdnVars}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1929211210, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1929211181);
    }

    public static /* synthetic */ Boolean onExtraCallback(getMediationProvider.IAuthTabCallback iAuthTabCallback) {
        return (Boolean) onExtraCallbackWithResult(new Object[]{iAuthTabCallback}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1590769545, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1590769559);
    }

    public static /* synthetic */ getMediationProvider ICustomTabsCallback() {
        return (getMediationProvider) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1363742535, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1363742557);
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(new Object[]{setDetectableSize}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1380903564, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1380903555);
    }

    public static /* synthetic */ deserializeIp onActivityLayout(Function1 function1, Object obj) {
        return (deserializeIp) onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 603426612, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -603426566);
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallback(SessionState sessionState) {
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onExtraCallbackWithResult(new Object[]{sessionState}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -543652301, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 543652311);
    }

    public static /* synthetic */ TubaVarV1SyncState.onExtraCallback.IAuthTabCallback onExtraCallbackWithResult(VarsResult varsResult) {
        return (TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) onExtraCallbackWithResult(new Object[]{varsResult}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 919706820, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -919706792);
    }

    public static /* synthetic */ CharSequence onExtraCallback(RSASSAPSSparams rSASSAPSSparams) {
        return (CharSequence) onExtraCallbackWithResult(new Object[]{rSASSAPSSparams}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1000130058, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1000130041);
    }

    public static /* synthetic */ Unit mayLaunchUrl() {
        return (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1632718222, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1632718222);
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(RSASSAPSSparams rSASSAPSSparams) {
        return (CharSequence) onExtraCallbackWithResult(new Object[]{rSASSAPSSparams}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1122364447, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1122364503);
    }

    public static /* synthetic */ Unit ICustomTabsService() {
        return (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1081486982, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1081487032);
    }

    public static /* synthetic */ GriverDecodeUrl21 isEngagementSignalsApiAvailable() {
        return (GriverDecodeUrl21) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1247178742, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1247178716);
    }

    public static /* synthetic */ Unit onNavigationEvent(TriggersResult triggersResult) {
        return (Unit) onExtraCallbackWithResult(new Object[]{triggersResult}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -863916007, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 863916026);
    }

    public static /* synthetic */ GyrShakeHelper newSession() {
        return (GyrShakeHelper) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1669138020, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1669137996);
    }

    public static final /* synthetic */ getBillingPeriod asInterface(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        return (getBillingPeriod) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 263242144, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -263242085);
    }

    public static final /* synthetic */ getTextProgressSize IAuthTabCallbackStubProxy(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        return (getTextProgressSize) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 406457257, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -406457225);
    }

    public static final /* synthetic */ setTextProgressColor IAuthTabCallback_Parcel(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        return (setTextProgressColor) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1225209501, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1225209546);
    }

    public static final /* synthetic */ ImageRequests_androidKtExternalSyntheticLambda2 access000(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        return (ImageRequests_androidKtExternalSyntheticLambda2) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1881286762, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1881286763);
    }

    public static final /* synthetic */ ProductDetailsResult extraCallback(UST_CERT_GetPublicKeyInfo uST_CERT_GetPublicKeyInfo) {
        return (ProductDetailsResult) onExtraCallbackWithResult(new Object[]{uST_CERT_GetPublicKeyInfo}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2022127358, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2022127295);
    }

    private static final isJacksonCreator updateVisuals() {
        return (isJacksonCreator) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1811562691, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1811562684);
    }

    private final getBillingPeriod IPostMessageService_Parcel() {
        return (getBillingPeriod) onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2058036084, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2058036068);
    }

    private final GriverDecodeUrl21 IPostMessageServiceStubProxy() {
        return (GriverDecodeUrl21) onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -761446785, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 761446825);
    }

    private final TouchInterceptFrameLayout1 ITrustedWebActivityCallback_Parcel() {
        return (TouchInterceptFrameLayout1) onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1726970482, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1726970480);
    }

    private final ProductDetailsResult ITrustedWebActivityServiceDefault() {
        return (ProductDetailsResult) onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -172548259, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 172548303);
    }

    private static final void requestPostMessageChannelWithExtras(Function1 function1, Object obj) throws Throwable {
        onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1600859163, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1600859186);
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallbackDefault(SessionState sessionState) {
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onExtraCallbackWithResult(new Object[]{sessionState}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -403580368, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 403580415);
    }

    private static final Boolean onNavigationEvent(getMediationProvider.IAuthTabCallback iAuthTabCallback) {
        return (Boolean) onExtraCallbackWithResult(new Object[]{iAuthTabCallback}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -892993238, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 892993286);
    }

    private static final Unit onExtraCallbackWithResult(Pair pair) {
        return (Unit) onExtraCallbackWithResult(new Object[]{pair}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1375235934, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1375235954);
    }

    private final void ITrustedWebActivityService_Parcel() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 291971867, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -291971856);
    }

    private final void ITrustedWebActivityServiceStub() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1071861627, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1071861681);
    }

    private static final getStartTimeMillis AudioAttributesImplApi26Parcelizer() {
        return (getStartTimeMillis) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1741817372, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1741817432);
    }

    private static final setAlogFlushAddr AudioAttributesImplApi21Parcelizer() {
        return (setAlogFlushAddr) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 753460206, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -753460153);
    }

    private final void MediaBrowserCompatMediaItem() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -582766764, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 582766799);
    }

    private static final Unit RatingCompat1() {
        return (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1979946714, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1979946671);
    }

    private static final Unit RatingCompatStarStyle() {
        return (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2029316864, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2029316806);
    }

    private static final Unit MediaSessionCompatToken() {
        return (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1834797338, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1834797286);
    }

    private static final Unit PlaybackStateCompat() {
        return (Unit) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 118116854, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -118116836);
    }

    private final void ResultReceiverMyRunnable() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -709044151, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 709044215);
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(new Object[]{setDetectableSize}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1217416328, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1217416290);
    }

    private final void r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 200317353, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -200317311);
    }

    private static final GriverDecodeUrl21 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
        return (GriverDecodeUrl21) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 882061682, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -882061652);
    }

    private static final Unit IAuthTabCallback(CheckoutResult checkoutResult) {
        return (Unit) onExtraCallbackWithResult(new Object[]{checkoutResult}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1261714768, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1261714711);
    }

    private static final Unit IAuthTabCallbackStubProxy(Throwable th) {
        return (Unit) onExtraCallbackWithResult(new Object[]{th}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1053345042, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1053345104);
    }

    private static final setTextProgressColor r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        return (setTextProgressColor) onExtraCallbackWithResult(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -536990510, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 536990537);
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(new Object[]{setDetectableSize}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 530052799, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -530052748);
    }

    private final void _init_lambda4() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 445392062, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -445392047);
    }

    private static final CharSequence IAuthTabCallback(Context context, RSASSAPSSparams rSASSAPSSparams) {
        return (CharSequence) onExtraCallbackWithResult(new Object[]{context, rSASSAPSSparams}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1154427150, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1154427095);
    }

    private static final void IEngagementSignalsCallback_Parcel(Function1 function1, Object obj) throws Throwable {
        onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1393189086, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1393189082);
    }

    private static final deserializeIp asInterface(VarsResult varsResult) {
        return (deserializeIp) onExtraCallbackWithResult(new Object[]{varsResult}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1601477221, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1601477260);
    }

    private static final void IPostMessageService_Parcel(Function1 function1, Object obj) throws Throwable {
        onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1092676949, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1092677014);
    }

    private static final Unit writeTypedObject(Throwable th) {
        return (Unit) onExtraCallbackWithResult(new Object[]{th}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1837206518, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1837206579);
    }

    private static final TubaVarV1SyncState.onExtraCallback.IAuthTabCallback IPostMessageServiceStubProxy(Function1 function1, Object obj) {
        return (TubaVarV1SyncState.onExtraCallback.IAuthTabCallback) onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -187434369, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 187434381);
    }

    private static final void areNotificationsEnabled(Function1 function1, Object obj) throws Throwable {
        onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1778587308, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1778587333);
    }

    private static final deserializeIp cancelNotification(Function1 function1, Object obj) {
        return (deserializeIp) onExtraCallbackWithResult(new Object[]{function1, obj}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -551504484, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 551504487);
    }

    private final void ensureViewModelStore() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -295821730, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 295821735);
    }

    public final void receiveFile() throws Throwable {
        onExtraCallbackWithResult(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1125951665, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1125951598);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) throws Throwable {
        onExtraCallbackWithResult(new Object[]{this, str}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -901952901, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 901952942);
    }

    public final wasLastName IAuthTabCallback(@NotNull String str, boolean z) {
        return (wasLastName) onExtraCallbackWithResult(new Object[]{this, str, Boolean.valueOf(z)}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -401540738, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 401540751);
    }

    static void ICustomTabsServiceDefault() {
        isEngagementSignalsApiAvailable = new char[]{32736, 32751, 32746, 32750, 32742, 32764, 32753, 32739, 32756, 32687, 32749, 32752, 32744, 32738, 32732, 32722, 32705, 32724, 32711, 32708, 32766, 32707, 32720, 32718, 32726, 32719, 32743, 32674, 32686, 32737, 32740};
        mayLaunchUrl = -1184333923;
        extraCommand = true;
        ICustomTabsService = true;
        ICustomTabsCallback_Parcel = new int[]{1309819637, -2118615572, -371242751, -1141444453, -2062697677, -1582151501, 50727798, 1319895927, -1148259945, -614388542, -1982857376, -421319722, -1392986614, 1598594448, 466447097, 963165082, -218508960, -600592927};
    }
}
