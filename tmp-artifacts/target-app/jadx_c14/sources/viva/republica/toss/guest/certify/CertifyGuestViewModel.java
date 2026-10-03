package viva.republica.toss.guest.certify;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.useronboarding.overseas.model.OverseasPhoneInfo;
import im.toss.features.useronboarding.overseas.model.OverseasSmsUserInfo;
import im.toss.features.verify.login.model.network.AuthPolicy;
import im.toss.featurescommon.country.library.CountryInfo;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.coroutines.rx2.RxSingleKt;
import o.APMaxLenMode;
import o.AdSettingsIntegrationErrorMode;
import o.AttCertValidityPeriod;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CloseableUtils;
import o.CommonConfig;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.EncryptedContentInfoParser;
import o.GetInputImageFromPathAsGrayScale;
import o.GriverParseFailedExtension1;
import o.IAnimation;
import o.LifecyclesKtawaitStarted21;
import o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0;
import o.MapConverter;
import o.NetConverter3;
import o.PhotoBrowseView;
import o.PhotoBrowseView8;
import o.PhotoGrid;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.ReactNativeFeatureFlagsForTests;
import o.RedBoxContentViewOpenStackFrameTask;
import o.RemoteWorkManager;
import o.Response;
import o.Rmipmap;
import o.RotationProvider1;
import o.SetDetectableSize;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TextRoundCornerProgressBarSavedState1;
import o.TrackGroupExternalSyntheticLambda0;
import o.UserChoiceBillingListener;
import o.UtilsKtExternalSyntheticLambda17$invoke;
import o.access13800;
import o.access14000;
import o.access14300;
import o.addPolicy;
import o.clearTid;
import o.clearTrackedAxonEvents;
import o.createPaints;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.findResAndMsg;
import o.getFinalX;
import o.getLogUploadURLMap;
import o.getMaxScale;
import o.getPackageType;
import o.getSWidth;
import o.getTextViews;
import o.getWrite;
import o.hasActiveCatalystInstance;
import o.hasActiveReactInstance;
import o.initialiseBaseLayer;
import o.initializeBridge;
import o.isTestMode;
import o.isViewAllVisible;
import o.isVivoY11;
import o.jniHandleMemoryPressure;
import o.jniLoadScriptFromAssets;
import o.maybeUpdateAnimatable;
import o.mergeWorkerVHost;
import o.nLockFileSegment;
import o.notifyVerticalEdgeReached;
import o.setCommonNetworkProxy;
import o.setNativeAd;
import o.setRandomHost;
import o.setSegmentCollection;
import o.setSelection;
import o.setVolume;
import o.updateWidth;
import o.virtualViewPrerenderRatio;
import o.wasLastName;
import o.writeRaw;
import o.ycxycx;
import o.zb;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;
import viva.republica.toss.guest.certify.CertifyGuestViewModel$sendSmsForOverseasKorean$1$;
import viva.republica.toss.network.model.verify.guest.GuestAddCertifyRequest;
import viva.republica.toss.network.model.verify.guest.GuestAddPossessionRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CertifyGuestViewModel extends isTestMode {
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallback;
    private static int receiveFile;
    private static int updateVisuals;
    private boolean IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private getPackageType ICustomTabsCallback;
    private final Rmipmap<Unit> ICustomTabsCallbackDefault;
    private String ICustomTabsCallbackStub;
    private final IAnimation<initialiseBaseLayer> ICustomTabsCallbackStubProxy;
    private boolean ICustomTabsCallback_Parcel;
    private int ICustomTabsService;
    private long access000;
    private final notifyVerticalEdgeReached access100;
    private final Rmipmap<Throwable> asBinder;
    private getPackageType asInterface;
    private final TextLinkScopeExternalSyntheticLambda7 extraCallback;
    private boolean extraCallbackWithResult;
    private boolean extraCommand;
    private long getInterfaceDescriptor;
    private final Rmipmap<Unit> isEngagementSignalsApiAvailable;
    private boolean mayLaunchUrl;
    private final mergeWorkerVHost newAuthTabSession;
    private Map<String, String> newSession;
    private final Rmipmap<CommonConfig> newSessionWithExtras;
    private boolean onActivityLayout;
    private boolean onActivityResized;
    private final nLockFileSegment<initialiseBaseLayer> onExtraCallback;
    private final LiveData<AuthPolicy> onExtraCallbackWithResult;
    private final GetInputImageFromPathAsGrayScale onMessageChannelReady;
    private int onMinimized;
    private boolean onNavigationEvent;
    private final setCommonNetworkProxy onPostMessage;
    private final APMaxLenMode onRelationshipValidationResult;
    private getLogUploadURLMap onTransact;
    private final MutableLiveData<AuthPolicy> onUnminimized;
    private long onWarmupCompleted;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 postMessage;
    private final Rmipmap<OverseasSmsUserInfo> prefetch;
    private final setVolume prefetchWithMultipleUrls;
    private boolean readTypedObject;
    private boolean requestPostMessageChannelWithExtras;
    private boolean setEngagementSignalsCallback;
    private boolean writeTypedObject;
    private static final byte[] $$a = {120, 65, 99, 57};
    private static final int $$b = 46;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsServiceDefault = 0;
    private static int requestPostMessageChannel = 0;
    private static int warmup = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[jniHandleMemoryPressure.values().length];
            try {
                iArr[jniHandleMemoryPressure.USIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onNavigationEvent = iArr;
        }
    }

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = CertifyGuestViewModel.this.IAuthTabCallback((List<GriverParseFailedExtension1>) null, (access13800<? super Result<Unit>>) this);
            return objIAuthTabCallback == access14300.onWarmupCompleted() ? objIAuthTabCallback : Result.IAuthTabCallback(objIAuthTabCallback);
        }
    }

    static final class access100 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws TossApiCallException.ApiError {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = CertifyGuestViewModel.onExtraCallbackWithResult(CertifyGuestViewModel.this, (OverseasPhoneInfo) null, (access13800) this);
            return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Result.IAuthTabCallback(objOnExtraCallbackWithResult);
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = CertifyGuestViewModel.this.onWarmupCompleted((List<GriverParseFailedExtension1>) null, (access13800<? super Result<Unit>>) this);
            return objOnWarmupCompleted == access14300.onWarmupCompleted() ? objOnWarmupCompleted : Result.IAuthTabCallback(objOnWarmupCompleted);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 105
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = viva.republica.toss.guest.certify.CertifyGuestViewModel.$$a
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestViewModel.$$c(byte, short, byte):java.lang.String");
    }

    static {
        updateVisuals = 1;
        newAuthTabSession();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallback = 8;
        int i = ICustomTabsServiceDefault + 99;
        updateVisuals = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(AuthPolicy authPolicy, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 105;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(authPolicy, setDetectableSize);
        int i4 = requestPostMessageChannel + 87;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 125;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipAccess100 = access100(function1, obj);
        int i4 = warmup + 27;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeipAccess100;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 115;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3, new Object[]{function1, obj}, -601840109, 601840116, ICustomTabsCallbackStubProxy.onExtraCallback());
        int i3 = warmup + 77;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        return deserializeip;
    }

    public static /* synthetic */ Intent asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 25;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Intent intent = (Intent) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{function1, obj}, -1870346696, 1870346715, ICustomTabsCallbackStubProxy.onExtraCallback());
        int i4 = warmup + 87;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 117;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp interfaceDescriptor = getInterfaceDescriptor(function1, obj);
        int i4 = warmup + 41;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(CertifyGuestViewModel certifyGuestViewModel, Context context, Boolean bool) {
        int i = 2 % 2;
        int i2 = warmup + 99;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{certifyGuestViewModel, context, bool}, 459200042, -459200027, ICustomTabsCallbackStubProxy.onExtraCallback());
        int i4 = warmup + 17;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeip;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(CertifyGuestViewModel certifyGuestViewModel, Context context, jniLoadScriptFromAssets jniloadscriptfromassets) {
        int i = 2 % 2;
        int i2 = warmup + 105;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallback = IAuthTabCallback(certifyGuestViewModel, context, jniloadscriptfromassets);
        int i4 = requestPostMessageChannel + 101;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 73;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = requestPostMessageChannel + 77;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ AttCertValidityPeriod onNavigationEvent() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 83;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        AttCertValidityPeriod attCertValidityPeriod = (AttCertValidityPeriod) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[0], 1735757749, -1735757749, ICustomTabsCallbackStubProxy.onExtraCallback());
        int i4 = requestPostMessageChannel + 113;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return attCertValidityPeriod;
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 121;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{function1, obj}, 2021971797, -2021971794, ICustomTabsCallbackStubProxy.onExtraCallback());
        int i4 = requestPostMessageChannel + 69;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(CertifyGuestViewModel certifyGuestViewModel, Context context, List list, updateWidth updatewidth) {
        int i = 2 % 2;
        int i2 = warmup + 93;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(certifyGuestViewModel, context, list, updatewidth);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        deserializeIp deserializeipIAuthTabCallback = IAuthTabCallback(certifyGuestViewModel, context, list, updatewidth);
        int i3 = warmup + 103;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        return deserializeipIAuthTabCallback;
    }

    public static /* synthetic */ Intent onWarmupCompleted(Pair pair) {
        int i = 2 % 2;
        int i2 = warmup + 3;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Intent intent = (Intent) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{pair}, 1756772039, -1756772023, ICustomTabsCallbackStubProxy.onExtraCallback());
        int i4 = warmup + 87;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    public static /* synthetic */ Pair onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 103;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            return (Pair) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{function1, obj}, -106956707, 106956713, ICustomTabsCallbackStubProxy.onExtraCallback());
        }
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ Pair onWarmupCompleted(isViewAllVisible isviewallvisible) {
        int i = 2 % 2;
        int i2 = warmup + 119;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(isviewallvisible);
            throw null;
        }
        Pair pairIAuthTabCallback = IAuthTabCallback(isviewallvisible);
        int i3 = warmup + 69;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        return pairIAuthTabCallback;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(ReactNativeFeatureFlagsForTests reactNativeFeatureFlagsForTests, getTextViews gettextviews) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 71;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(reactNativeFeatureFlagsForTests, gettextviews);
            throw null;
        }
        deserializeIp deserializeipIAuthTabCallback = IAuthTabCallback(reactNativeFeatureFlagsForTests, gettextviews);
        int i3 = warmup + 79;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 == 0) {
            return deserializeipIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27334, 27476, 27503, 27503, 27476, 27484, 27483, 27474, 27498, 27473, 27478, 27502, 27475, 27484, 27476, 27473, 27476, 27479, 27479, 27502};
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Unit onNavigationEvent(hasActiveReactInstance hasactivereactinstance) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(hasactivereactinstance);
            int i4 = onExtraCallback + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(function1, obj);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public static final class IAuthTabCallback<Upstream, Downstream> implements deserializeUri {
            final /* synthetic */ MapConverter IAuthTabCallback;
            final /* synthetic */ MapConverter onWarmupCompleted;

            public IAuthTabCallback(MapConverter mapConverter, MapConverter mapConverter2) {
                this.onWarmupCompleted = mapConverter;
                this.IAuthTabCallback = mapConverter2;
            }

            public final deserializeIp<hasActiveReactInstance> apply(writeRaw<BaseApiResponse<hasActiveReactInstance>> writeraw) {
                Intrinsics.checkNotNullParameter(writeraw, "");
                final AnonymousClass4 anonymousClass4 = new Function1<BaseApiResponse<hasActiveReactInstance>, deserializeIp<? extends hasActiveReactInstance>>() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel.onWarmupCompleted.IAuthTabCallback.4
                    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                    public final deserializeIp<? extends hasActiveReactInstance> invoke(BaseApiResponse<hasActiveReactInstance> baseApiResponse) throws IllegalAccessException, InstantiationException {
                        Intrinsics.checkNotNullParameter(baseApiResponse, "");
                        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                            Object objOnTransact = baseApiResponse.onTransact();
                            if (objOnTransact == null) {
                                objOnTransact = hasActiveReactInstance.class.newInstance();
                            }
                            return writeRaw.onExtraCallback(objOnTransact);
                        }
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult == null) {
                            apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        }
                        return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                    }
                };
                writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass4) { // from class: o.UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda11
                    private final /* synthetic */ Function1 onExtraCallback;

                    {
                        Intrinsics.checkNotNullParameter(anonymousClass4, "");
                        this.onExtraCallback = anonymousClass4;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        return this.onExtraCallback.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
                MapConverter mapConverter = this.onWarmupCompleted;
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

        private onWarmupCompleted() {
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = IAuthTabCallback;
            if (cArr != null) {
                int i7 = $11 + 79;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i9 = 0; i9 < length; i9++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - Process.getGidForName("")), 35 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 14239 - TextUtils.indexOf("", "", 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i10 = $11 + 59;
                    $10 = i10 % 128;
                    if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 29 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = $10 + 81;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.resolveSizeAndState(0, 0, 0)), 65 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i15 = $11 + 13;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    try {
                        Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49515 - AndroidCharacter.getMirror('0')), 70 - (Process.myPid() >> 22), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i17 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i17, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i17);
            }
            if (z) {
                int i18 = $11 + 75;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i20 = $11 + 83;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 << trackGroupExternalSyntheticLambda0.onNavigationEvent) >> 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent << 1;
                    } else {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                int i21 = $11 + 119;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static final void IAuthTabCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public final writeRaw<hasActiveReactInstance> onExtraCallback() throws Throwable {
            int i = 2 % 2;
            Response response = Response.onNavigationEvent;
            UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
            ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
            String strOnNavigationEvent = constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel.onNavigationEvent();
            String str = Build.VERSION.RELEASE;
            String smallIconBitmap = zzaj.onNavigationEvent().getSmallIconBitmap();
            String str2 = Build.MODEL;
            String strAsBinder = constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel.asBinder();
            String strValueOf = String.valueOf(zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
            RemoteWorkManager remoteWorkManager = RemoteWorkManager.onWarmupCompleted;
            RemoteWorkManager.onExtraCallbackWithResult(-831430487, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 831430494, new Object[]{remoteWorkManager}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
            remoteWorkManager.onExtraCallbackWithResult(strValueOf);
            RedBoxContentViewOpenStackFrameTask.Companion.onExtraCallbackWithResult(userChoiceBillingListener.onExtraCallback());
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(new int[]{0, 20, 177, 17}, false, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0}, objArr);
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onTransact(((String) objArr[0]).intern());
            setNativeAd setnativeadPrefetchWithMultipleUrls = AdSettingsIntegrationErrorMode.onNavigationEvent.prefetchWithMultipleUrls();
            String strOnExtraCallbackWithResult = PhotoGrid.onExtraCallbackWithResult();
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNull(str2);
            writeRaw<BaseApiResponse<hasActiveReactInstance>> writerawOnNavigationEvent = setnativeadPrefetchWithMultipleUrls.onNavigationEvent(new hasActiveCatalystInstance(strOnNavigationEvent, strOnExtraCallbackWithResult, str, smallIconBitmap, str2, strAsBinder, strValueOf, false, 128, null));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$Companion$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return CertifyGuestViewModel.onWarmupCompleted.onNavigationEvent((hasActiveReactInstance) obj);
                }
            };
            writeRaw<hasActiveReactInstance> writerawOnNavigationEvent2 = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$Companion$$ExternalSyntheticLambda1
                public final void accept(Object obj) {
                    CertifyGuestViewModel.onWarmupCompleted.onNavigationEvent(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent2, "");
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return writerawOnNavigationEvent2;
        }

        private static final Unit onWarmupCompleted(hasActiveReactInstance hasactivereactinstance) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RemoteWorkManager remoteWorkManager = RemoteWorkManager.onWarmupCompleted;
            remoteWorkManager.onExtraCallback(hasactivereactinstance.onExtraCallback(), hasactivereactinstance.onNavigationEvent());
            Object[] objArr = {remoteWorkManager, hasactivereactinstance.IAuthTabCallback(), hasactivereactinstance.onExtraCallbackWithResult()};
            RemoteWorkManager.onExtraCallbackWithResult(-1652917707, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1652917715, objArr, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
            remoteWorkManager.IAuthTabCallback(true);
            setSegmentCollection.Companion.onWarmupCompleted().IAuthTabCallback(hasactivereactinstance.onWarmupCompleted());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public static final class getInterfaceDescriptor<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public getInterfaceDescriptor(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<jniLoadScriptFromAssets> apply(writeRaw<BaseApiResponse<jniLoadScriptFromAssets>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$invoke(new Function1<BaseApiResponse<jniLoadScriptFromAssets>, deserializeIp<? extends jniLoadScriptFromAssets>>() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel.getInterfaceDescriptor.5
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends jniLoadScriptFromAssets> invoke(BaseApiResponse<jniLoadScriptFromAssets> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = jniLoadScriptFromAssets.class.newInstance();
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
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onTransact<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onTransact(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$invoke(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel.onTransact.5
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Boolean> invoke(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Boolean.class.newInstance();
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
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    @Inject
    public CertifyGuestViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull notifyVerticalEdgeReached notifyverticaledgereached, @NotNull GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScale, @NotNull setCommonNetworkProxy setcommonnetworkproxy, @NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0, @NotNull setVolume setvolume, @NotNull mergeWorkerVHost mergeworkervhost) {
        int iIntValue;
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(notifyverticaledgereached, "");
        Intrinsics.checkNotNullParameter(getInputImageFromPathAsGrayScale, "");
        Intrinsics.checkNotNullParameter(setcommonnetworkproxy, "");
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(setvolume, "");
        Intrinsics.checkNotNullParameter(mergeworkervhost, "");
        this.extraCallback = textLinkScopeExternalSyntheticLambda7;
        this.access100 = notifyverticaledgereached;
        this.onMessageChannelReady = getInputImageFromPathAsGrayScale;
        this.onPostMessage = setcommonnetworkproxy;
        this.postMessage = constraintsSizeResolverExternalSyntheticLambda0;
        this.prefetchWithMultipleUrls = setvolume;
        this.newAuthTabSession = mergeworkervhost;
        this.IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda11
            public final Object invoke() {
                return CertifyGuestViewModel.onNavigationEvent();
            }
        });
        MutableLiveData<AuthPolicy> mutableLiveData = new MutableLiveData<>();
        this.onUnminimized = mutableLiveData;
        Integer num = (Integer) textLinkScopeExternalSyntheticLambda7.onExtraCallback("lastSimCount");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int i = 2 % 2;
            iIntValue = -1;
        }
        this.onMinimized = iIntValue;
        this.ICustomTabsService = -1;
        Long l = (Long) textLinkScopeExternalSyntheticLambda7.onExtraCallback("STATE_SESSION_ID");
        long jLongValue = 0;
        this.getInterfaceDescriptor = l != null ? l.longValue() : 0L;
        Long l2 = (Long) textLinkScopeExternalSyntheticLambda7.onExtraCallback("STATE_FUNNEL_ID");
        this.access000 = l2 != null ? l2.longValue() : 0L;
        String str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("STATE_REFERRER");
        this.ICustomTabsCallbackStub = str != null ? str : "";
        Long l3 = (Long) textLinkScopeExternalSyntheticLambda7.onExtraCallback("STATE_ARS_POSSESSION_TEMPLATE_ID");
        Object obj = null;
        if (l3 != null) {
            int i2 = requestPostMessageChannel + 87;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                l3.longValue();
                throw null;
            }
            jLongValue = l3.longValue();
        }
        this.onWarmupCompleted = jLongValue;
        Boolean bool = (Boolean) textLinkScopeExternalSyntheticLambda7.onExtraCallback("EXTRA_USE_ONLY_CERTIFY_METHOD");
        if (bool != null) {
            int i3 = warmup + 121;
            requestPostMessageChannel = i3 % 128;
            if (i3 % 2 != 0) {
                bool.booleanValue();
                obj.hashCode();
                throw null;
            }
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.requestPostMessageChannelWithExtras = zBooleanValue;
        this.onTransact = (getLogUploadURLMap) textLinkScopeExternalSyntheticLambda7.onExtraCallback("STATE_UPDATE_CONSENT_TYPE");
        this.onRelationshipValidationResult = (APMaxLenMode) textLinkScopeExternalSyntheticLambda7.onExtraCallback("EXTRA_OVERSEAS_ONBOARDING_USER_INFO");
        this.onExtraCallbackWithResult = mutableLiveData;
        this.isEngagementSignalsApiAvailable = new Rmipmap<>();
        this.ICustomTabsCallbackDefault = new Rmipmap<>();
        this.newSessionWithExtras = new Rmipmap<>();
        this.prefetch = new Rmipmap<>();
        this.asBinder = new Rmipmap<>();
        nLockFileSegment<initialiseBaseLayer> nlockfilesegmentOnExtraCallbackWithResult = zb.onExtraCallbackWithResult(0, (CloseableUtils) null, (Function1) null, 7, (Object) null);
        this.onExtraCallback = nlockfilesegmentOnExtraCallbackWithResult;
        this.ICustomTabsCallbackStubProxy = ycxycx.IAuthTabCallback(nlockfilesegmentOnExtraCallbackWithResult);
        int i4 = warmup + 7;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ setVolume IAuthTabCallback(CertifyGuestViewModel certifyGuestViewModel) {
        int i = 2 % 2;
        int i2 = warmup + 9;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        setVolume setvolume = certifyGuestViewModel.prefetchWithMultipleUrls;
        if (i3 == 0) {
            return setvolume;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 49;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScale = certifyGuestViewModel.onMessageChannelReady;
        if (i3 != 0) {
            return getInputImageFromPathAsGrayScale;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(CertifyGuestViewModel certifyGuestViewModel, OverseasPhoneInfo overseasPhoneInfo, access13800 access13800Var) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = warmup + 117;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = certifyGuestViewModel.onWarmupCompleted(overseasPhoneInfo, (access13800<? super Result<PhotoBrowseView8>>) access13800Var);
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        int i5 = requestPostMessageChannel + 75;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 51;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        nLockFileSegment<initialiseBaseLayer> nlockfilesegment = certifyGuestViewModel.onExtraCallback;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 45;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return nlockfilesegment;
    }

    public static final /* synthetic */ mergeWorkerVHost onExtraCallbackWithResult(CertifyGuestViewModel certifyGuestViewModel) {
        int i = 2 % 2;
        int i2 = warmup + 77;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        mergeWorkerVHost mergeworkervhost = certifyGuestViewModel.newAuthTabSession;
        if (i3 == 0) {
            return mergeworkervhost;
        }
        throw null;
    }

    public static final /* synthetic */ notifyVerticalEdgeReached onWarmupCompleted(CertifyGuestViewModel certifyGuestViewModel) {
        int i = 2 % 2;
        int i2 = warmup + 105;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        notifyVerticalEdgeReached notifyverticaledgereached = certifyGuestViewModel.access100;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return notifyverticaledgereached;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 17;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        AttCertValidityPeriod attCertValidityPeriod = (AttCertValidityPeriod) certifyGuestViewModel.IAuthTabCallbackStub.getValue();
        int i4 = warmup + 67;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return attCertValidityPeriod;
    }

    public final void getInterfaceDescriptor(boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 15;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        this.setEngagementSignalsCallback = z;
        int i5 = i3 + 31;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = warmup + 77;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback_Parcel = z;
        int i5 = i3 + 43;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void asBinder(boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 41;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        this.onActivityResized = z;
        int i5 = i3 + 91;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final boolean isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 35;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onActivityResized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 115;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallback_Parcel = z;
        if (i3 == 0) {
            throw null;
        }
    }

    public final boolean onMinimized() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 55;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.extraCommand;
        int i5 = i2 + 55;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void onTransact(boolean z) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 67;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        this.extraCommand = z;
        int i5 = i2 + 117;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = warmup + 97;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallback.onWarmupCompleted("lastSimCount", Integer.valueOf(i));
        this.onMinimized = i;
        int i5 = requestPostMessageChannel + 89;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    public final getPackageType IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 89;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = this.asInterface;
        int i5 = i2 + 81;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return getpackagetype;
    }

    public final void onWarmupCompleted(@Nullable Map<String, String> map) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 43;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.newSession = map;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 27;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void asInterface(boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 93;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        this.writeTypedObject = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 125;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean onUnminimized() {
        int i = 2 % 2;
        int i2 = warmup + 25;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.writeTypedObject;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = warmup + 7;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        certifyGuestViewModel.IAuthTabCallbackStubProxy = zBooleanValue;
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = warmup + 53;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestViewModel.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = warmup + 89;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        certifyGuestViewModel.onActivityLayout = zBooleanValue;
        int i5 = i3 + 17;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final boolean extraCommand() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 17;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onActivityLayout;
        int i5 = i2 + 97;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 5;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        certifyGuestViewModel.mayLaunchUrl = zBooleanValue;
        if (i3 != 0) {
            return null;
        }
        int i4 = 26 / 0;
        return null;
    }

    public final boolean onPostMessage() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 9;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.mayLaunchUrl;
        int i5 = i2 + 5;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void IAuthTabCallbackStub(boolean z) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 65;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        this.readTypedObject = z;
        int i5 = i2 + 97;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
    }

    public final boolean ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 21;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        boolean z = this.readTypedObject;
        int i5 = i3 + 103;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = warmup + 63;
        int i4 = i3 % 128;
        requestPostMessageChannel = i4;
        int i5 = i3 % 2;
        this.ICustomTabsService = i;
        int i6 = i4 + 81;
        warmup = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 23;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        certifyGuestViewModel.IAuthTabCallbackDefault = zBooleanValue;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 125;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return null;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 71;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.extraCallbackWithResult;
        int i5 = i2 + 115;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 125;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getInterfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onTransact(long j) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 87;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback.onWarmupCompleted("STATE_SESSION_ID", Long.valueOf(j));
        this.getInterfaceDescriptor = j;
        int i4 = warmup + 25;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = warmup + 119;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        long j = this.access000;
        int i5 = i3 + 39;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = warmup + 67;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCallback.onWarmupCompleted("STATE_FUNNEL_ID", Long.valueOf(j));
            this.access000 = j;
            int i3 = 56 / 0;
        } else {
            this.extraCallback.onWarmupCompleted("STATE_FUNNEL_ID", Long.valueOf(j));
            this.access000 = j;
        }
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 19;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ICustomTabsCallbackStub;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 81;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        certifyGuestViewModel.extraCallback.onWarmupCompleted("STATE_REFERRER", str);
        certifyGuestViewModel.ICustomTabsCallbackStub = str;
        int i4 = warmup + 49;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        long j;
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 13;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.onWarmupCompleted;
            int i4 = 30 / 0;
        } else {
            j = this.onWarmupCompleted;
        }
        int i5 = i2 + 53;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = warmup + 27;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            this.extraCallback.onWarmupCompleted("STATE_ARS_POSSESSION_TEMPLATE_ID", Long.valueOf(j));
            this.onWarmupCompleted = j;
        } else {
            this.extraCallback.onWarmupCompleted("STATE_ARS_POSSESSION_TEMPLATE_ID", Long.valueOf(j));
            this.onWarmupCompleted = j;
            throw null;
        }
    }

    public final boolean ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 85;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.requestPostMessageChannelWithExtras;
        int i5 = i2 + 83;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return z;
    }

    public final void IAuthTabCallbackStubProxy(boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 91;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            this.extraCallback.onWarmupCompleted("EXTRA_USE_ONLY_CERTIFY_METHOD", Boolean.valueOf(z));
            this.requestPostMessageChannelWithExtras = z;
            int i3 = 25 / 0;
        } else {
            this.extraCallback.onWarmupCompleted("EXTRA_USE_ONLY_CERTIFY_METHOD", Boolean.valueOf(z));
            this.requestPostMessageChannelWithExtras = z;
        }
        int i4 = warmup + 89;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final getLogUploadURLMap IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = warmup + 7;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onTransact;
        }
        throw null;
    }

    public final void onExtraCallback(@Nullable getLogUploadURLMap getloguploadurlmap) {
        int i = 2 % 2;
        int i2 = warmup + 77;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback.onWarmupCompleted("STATE_UPDATE_CONSENT_TYPE", getloguploadurlmap);
        this.onTransact = getloguploadurlmap;
        int i4 = warmup + 5;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 75;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = z;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 47;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = warmup + 81;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i3 + 47;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return z;
    }

    public final APMaxLenMode writeTypedObject() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 55;
        int i3 = i2 % 128;
        warmup = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        APMaxLenMode aPMaxLenMode = this.onRelationshipValidationResult;
        int i4 = i3 + 85;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return aPMaxLenMode;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 59;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        LiveData<AuthPolicy> liveData = certifyGuestViewModel.onExtraCallbackWithResult;
        int i5 = i2 + 75;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return liveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Rmipmap<Unit> extraCallback() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 121;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        Rmipmap<Unit> rmipmap = this.isEngagementSignalsApiAvailable;
        int i5 = i2 + 73;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return rmipmap;
    }

    public final Rmipmap<Unit> ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 79;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Rmipmap<Unit> rmipmap = this.ICustomTabsCallbackDefault;
        int i4 = i2 + 5;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return rmipmap;
    }

    public final Rmipmap<CommonConfig> onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 83;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Rmipmap<CommonConfig> rmipmap = this.newSessionWithExtras;
        int i5 = i2 + 119;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return rmipmap;
    }

    public final Rmipmap<OverseasSmsUserInfo> onActivityLayout() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 67;
        int i3 = i2 % 128;
        warmup = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Rmipmap<OverseasSmsUserInfo> rmipmap = this.prefetch;
        int i4 = i3 + 83;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return rmipmap;
    }

    public final Rmipmap<Throwable> asBinder() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 13;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        Rmipmap<Throwable> rmipmap = this.asBinder;
        int i5 = i3 + 105;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return rmipmap;
        }
        throw null;
    }

    public final IAnimation<initialiseBaseLayer> IAuthTabCallback_Parcel() {
        IAnimation<initialiseBaseLayer> iAnimation;
        int i = 2 % 2;
        int i2 = warmup + 39;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        if (i2 % 2 != 0) {
            iAnimation = this.ICustomTabsCallbackStubProxy;
            int i4 = 32 / 0;
        } else {
            iAnimation = this.ICustomTabsCallbackStubProxy;
        }
        int i5 = i3 + 97;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return iAnimation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static char[] onNavigationEvent = {27261, 27179, 27173, 27196, 27173, 27173, 27196, 27173, 27142, 27334, 27335, 27332, 27340, 27337, 27330, 27332, 27330, 27358, 27332};
        private static int onWarmupCompleted;
        final /* synthetic */ OverseasPhoneInfo $overseasUserInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(OverseasPhoneInfo overseasPhoneInfo, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$overseasUserInfo = overseasPhoneInfo;
        }

        public static /* synthetic */ Unit onWarmupCompleted(CertifyGuestViewModel certifyGuestViewModel, Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(certifyGuestViewModel, th, setDetectableSize);
            int i4 = IAuthTabCallback + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return unitIAuthTabCallback;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = CertifyGuestViewModel.this.new IAuthTabCallback_Parcel(this.$overseasUserInfo, access13800Var);
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            return objIAuthTabCallback;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = onNavigationEvent;
            if (cArr != null) {
                int i7 = $10 + 15;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 37;
                    $10 = i10 % 128;
                    if (i10 % i != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35283), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35, 14239 - KeyEvent.getDeadChar(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.MeasureSpec.getMode(0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i9++;
                    }
                    i = 2;
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 10935), 64 - TextUtils.lastIndexOf("", '0'), TextUtils.getTrimmedLength("") + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 28 - TextUtils.lastIndexOf("", '0'), 17657 - Drawable.resolveOpacity(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - ExpandableListView.getPackedPositionGroup(0L)), 70 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i13 = $10 + 5;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i15, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i15);
            }
            if (z) {
                int i16 = $11 + 57;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i18 = $11 + 13;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i20 = $11 + 97;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] / iArr[3]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static final Unit IAuthTabCallback(CertifyGuestViewModel certifyGuestViewModel, Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new int[]{0, 8, 0, 6}, false, new byte[]{0, 1, 1, 0, 1, 1, 0, 1}, objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), certifyGuestViewModel.readTypedObject());
            Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new int[]{8, 11, 30, 5}, true, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1}, objArr2);
            mapOnExtraCallback2.put(((String) objArr2[0]).intern(), th.getMessage());
            setDetectableSize.onExtraCallback().put("requester_code", "TS-USI");
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                CertifyGuestViewModel certifyGuestViewModel = CertifyGuestViewModel.this;
                OverseasPhoneInfo overseasPhoneInfo = this.$overseasUserInfo;
                this.label = 1;
                objOnExtraCallbackWithResult = CertifyGuestViewModel.onExtraCallbackWithResult(certifyGuestViewModel, overseasPhoneInfo, (access13800) this);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
            }
            OverseasPhoneInfo overseasPhoneInfo2 = this.$overseasUserInfo;
            CertifyGuestViewModel certifyGuestViewModel2 = CertifyGuestViewModel.this;
            if (Result.onNavigationEvent(objOnExtraCallbackWithResult)) {
                certifyGuestViewModel2.onMessageChannelReady().setValue(CommonConfig.Companion.onExtraCallback(overseasPhoneInfo2.onWarmupCompleted(), overseasPhoneInfo2.onExtraCallback(), ((PhotoBrowseView8) objOnExtraCallbackWithResult).onExtraCallbackWithResult()));
                int i7 = IAuthTabCallback + 5;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            CertifyGuestViewModel certifyGuestViewModel3 = CertifyGuestViewModel.this;
            Throwable th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
            if (th != null) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1459469L, false, (String) null, (Map) null, new CertifyGuestViewModel$sendSmsForOverseasKorean$1$.ExternalSyntheticLambda0(certifyGuestViewModel3, th), 14, (Object) null);
                certifyGuestViewModel3.asBinder().setValue(th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IAuthTabCallback(@org.jetbrains.annotations.NotNull java.util.List<o.GriverParseFailedExtension1> r9, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<kotlin.Unit>> r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestViewModel.IAuthTabCallback(java.util.List, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull java.util.List<o.GriverParseFailedExtension1> r9, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<kotlin.Unit>> r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestViewModel.onWarmupCompleted(java.util.List, o.access13800):java.lang.Object");
    }

    public final wasLastName onWarmupCompleted(long j) {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<Boolean>> writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras().IAuthTabCallback(new GuestAddCertifyRequest(this.getInterfaceDescriptor, j));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        wasLastName waslastnameBI_ = writerawIAuthTabCallback2.bI_();
        Intrinsics.checkNotNullExpressionValue(waslastnameBI_, "");
        int i2 = warmup + 59;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameBI_;
    }

    public final wasLastName IAuthTabCallback(long j) {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<Boolean>> writerawOnNavigationEvent = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras().onNavigationEvent(new GuestAddCertifyRequest(this.getInterfaceDescriptor, j));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        wasLastName waslastnameBI_ = writerawIAuthTabCallback.bI_();
        Intrinsics.checkNotNullExpressionValue(waslastnameBI_, "");
        int i2 = requestPostMessageChannel + 27;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return waslastnameBI_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 83;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = requestPostMessageChannel + 61;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return deserializeip;
    }

    public final writeRaw<Pair<jniHandleMemoryPressure, Bundle>> onExtraCallback(@NotNull final Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        setVolume setvolumeNewSession = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession();
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnWarmupCompleted = ((AttCertValidityPeriod) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, -1912172305, 1912172326, ICustomTabsCallbackStubProxy.onExtraCallback())).onWarmupCompleted();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        writeRaw<BaseApiResponse<jniLoadScriptFromAssets>> writerawOnExtraCallbackWithResult = setvolumeNewSession.onExtraCallbackWithResult(iOnWarmupCompleted, ((AttCertValidityPeriod) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3, new Object[]{this}, -1912172305, 1912172326, ICustomTabsCallbackStubProxy.onExtraCallback())).onExtraCallback().name(), "TS-USI");
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new getInterfaceDescriptor(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return CertifyGuestViewModel.onExtraCallback(this.f$0, context, (jniLoadScriptFromAssets) obj);
            }
        };
        writeRaw<Pair<jniHandleMemoryPressure, Bundle>> writerawOnExtraCallbackWithResult2 = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda13
            public final Object apply(Object obj) {
                return CertifyGuestViewModel.onNavigationEvent(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult2, "");
        int i2 = warmup + 55;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnExtraCallbackWithResult2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.deserializeIp IAuthTabCallback(viva.republica.toss.guest.certify.CertifyGuestViewModel r10, android.content.Context r11, o.jniLoadScriptFromAssets r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.certify.CertifyGuestViewModel.requestPostMessageChannel
            int r1 = r1 + 41
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.CertifyGuestViewModel.warmup = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            long r1 = r12.onWarmupCompleted()
            r10.onNavigationEvent(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r10}
            int r5 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback()
            int r4 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback()
            int r3 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback()
            int r9 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback()
            r7 = -1912172305(0xffffffff8e0690ef, float:-1.6586558E-30)
            r8 = 1912172326(0x71f96f26, float:2.4702764E30)
            java.lang.Object r1 = onNavigationEvent(r3, r4, r5, r6, r7, r8, r9)
            o.AttCertValidityPeriod r1 = (o.AttCertValidityPeriod) r1
            o.createPaints r2 = o.createPaints.IAuthTabCallback
            java.lang.String r2 = r2.IAuthTabCallback()
            int r3 = r10.ICustomTabsService
            boolean r1 = r1.onExtraCallback(r2, r3)
            boolean r2 = r10.readTypedObject
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == r3) goto L5a
            int r2 = viva.republica.toss.guest.certify.CertifyGuestViewModel.warmup
            int r2 = r2 + 31
            int r4 = r2 % 128
            viva.republica.toss.guest.certify.CertifyGuestViewModel.requestPostMessageChannel = r4
            int r2 = r2 % r0
            if (r1 == 0) goto L5a
            java.util.List r12 = r12.onNavigationEvent()
            goto L70
        L5a:
            java.util.List r12 = r12.onNavigationEvent()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L69:
            boolean r1 = r12.hasNext()
            if (r1 == r3) goto L75
            r12 = r0
        L70:
            o.writeRaw r10 = r10.IAuthTabCallback(r11, r12)
            return r10
        L75:
            java.lang.Object r1 = r12.next()
            r2 = r1
            o.jniHandleMemoryPressure r2 = (o.jniHandleMemoryPressure) r2
            o.jniHandleMemoryPressure r4 = o.jniHandleMemoryPressure.USIM
            if (r2 == r4) goto L69
            r0.add(r1)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestViewModel.IAuthTabCallback(viva.republica.toss.guest.certify.CertifyGuestViewModel, android.content.Context, o.jniLoadScriptFromAssets):o.deserializeIp");
    }

    private static final deserializeIp access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 29;
        requestPostMessageChannel = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = requestPostMessageChannel + 51;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return deserializeip;
        }
        obj2.hashCode();
        throw null;
    }

    private static final deserializeIp IAuthTabCallback(ReactNativeFeatureFlagsForTests reactNativeFeatureFlagsForTests, getTextViews gettextviews) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(gettextviews, "");
        if (gettextviews.IAuthTabCallback() != PhotoBrowseView.SUCCESS) {
            writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(new updateWidth(PhotoBrowseView.FAIL, -1L));
            Intrinsics.checkNotNull(writerawOnExtraCallback);
            return writerawOnExtraCallback;
        }
        int i2 = warmup + 69;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        writeRaw writerawOnNavigationEvent = reactNativeFeatureFlagsForTests.onNavigationEvent(gettextviews.onWarmupCompleted());
        int i4 = requestPostMessageChannel + 13;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return writerawOnNavigationEvent;
    }

    private static final deserializeIp getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 79;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = warmup + 49;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return deserializeip;
    }

    private static final deserializeIp IAuthTabCallback(CertifyGuestViewModel certifyGuestViewModel, Context context, List list, updateWidth updatewidth) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 103;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(updatewidth, "");
            updatewidth.onExtraCallback();
            PhotoBrowseView photoBrowseView = PhotoBrowseView.SUCCESS;
            throw null;
        }
        Intrinsics.checkNotNullParameter(updatewidth, "");
        if (updatewidth.onExtraCallback() != PhotoBrowseView.SUCCESS) {
            return certifyGuestViewModel.IAuthTabCallback(context, CollectionsKt.drop(list, 1));
        }
        int i3 = warmup + 93;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(getWrite.IAuthTabCallback(jniHandleMemoryPressure.USIM, RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("EXTRA_SIM_VERIFY_ID", Long.valueOf(updatewidth.IAuthTabCallback()))})));
        Intrinsics.checkNotNull(writerawOnExtraCallback);
        return writerawOnExtraCallback;
    }

    private final writeRaw<Pair<jniHandleMemoryPressure, Bundle>> IAuthTabCallback(final Context context, final List<? extends jniHandleMemoryPressure> list) {
        int i = 2 % 2;
        int i2 = warmup + 121;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        jniHandleMemoryPressure jnihandlememorypressure = (jniHandleMemoryPressure) CollectionsKt.firstOrNull(list);
        if (jnihandlememorypressure == null) {
            int i4 = warmup + 29;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            jnihandlememorypressure = jniHandleMemoryPressure.ARS;
        }
        if (IAuthTabCallback.onNavigationEvent[jnihandlememorypressure.ordinal()] != 1) {
            virtualViewPrerenderRatio virtualviewprerenderratio = new virtualViewPrerenderRatio("TS-USI", this.getInterfaceDescriptor);
            long j = this.onWarmupCompleted;
            createPaints createpaints = createPaints.IAuthTabCallback;
            writeRaw writerawOnWarmupCompleted = virtualviewprerenderratio.onWarmupCompleted(j, createpaints.IAuthTabCallback(), createpaints.asBinder(), createpaints.onNavigationEvent(), Integer.parseInt(createpaints.onTransact()));
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return CertifyGuestViewModel.onWarmupCompleted((isViewAllVisible) obj);
                }
            };
            writeRaw<Pair<jniHandleMemoryPressure, Bundle>> writerawOnWarmupCompleted2 = writerawOnWarmupCompleted.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda5
                public final Object apply(Object obj) {
                    return CertifyGuestViewModel.onWarmupCompleted(function1, obj);
                }
            });
            Intrinsics.checkNotNull(writerawOnWarmupCompleted2);
            return writerawOnWarmupCompleted2;
        }
        int i6 = requestPostMessageChannel + 115;
        warmup = i6 % 128;
        int i7 = i6 % 2;
        createPaints createpaints2 = createPaints.IAuthTabCallback;
        String strIAuthTabCallback = createpaints2.IAuthTabCallback();
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        if (!((AttCertValidityPeriod) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, -1912172305, 1912172326, ICustomTabsCallbackStubProxy.onExtraCallback())).onExtraCallbackWithResult(strIAuthTabCallback)) {
            return IAuthTabCallback(context, CollectionsKt.drop(list, 1));
        }
        createpaints2.IAuthTabCallback(setSelection.USIM);
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        clearTrackedAxonEvents cleartrackedaxoneventsOnExtraCallback = ((AttCertValidityPeriod) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3, new Object[]{this}, -1912172305, 1912172326, ICustomTabsCallbackStubProxy.onExtraCallback())).onExtraCallback(strIAuthTabCallback);
        final ReactNativeFeatureFlagsForTests reactNativeFeatureFlagsForTests = new ReactNativeFeatureFlagsForTests("TS-USI", this.getInterfaceDescriptor, (setVolume) null, 4, (DefaultConstructorMarker) null);
        writeRaw writerawOnWarmupCompleted3 = reactNativeFeatureFlagsForTests.onWarmupCompleted(strIAuthTabCallback, cleartrackedaxoneventsOnExtraCallback);
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CertifyGuestViewModel.onWarmupCompleted(reactNativeFeatureFlagsForTests, (getTextViews) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawOnWarmupCompleted3.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda1
            public final Object apply(Object obj) {
                return CertifyGuestViewModel.IAuthTabCallback(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CertifyGuestViewModel.onNavigationEvent(this.f$0, context, list, (updateWidth) obj);
            }
        };
        writeRaw<Pair<jniHandleMemoryPressure, Bundle>> writerawOnExtraCallbackWithResult2 = writerawOnExtraCallbackWithResult.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda3
            public final Object apply(Object obj) {
                return CertifyGuestViewModel.onExtraCallback(function13, obj);
            }
        });
        Intrinsics.checkNotNull(writerawOnExtraCallbackWithResult2);
        return writerawOnExtraCallbackWithResult2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 7;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Pair) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Pair pair = (Pair) function1.invoke(obj);
        int i3 = 14 / 0;
        return pair;
    }

    private static final Pair IAuthTabCallback(isViewAllVisible isviewallvisible) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 115;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isviewallvisible, "");
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(jniHandleMemoryPressure.ARS, RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("EXTRA_TELCO_ARS_OTP", isviewallvisible.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("EXTRA_TELCO_ARS_VERIFY_ID", Long.valueOf(isviewallvisible.onExtraCallback()))}));
        int i4 = requestPostMessageChannel + 3;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return pairIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 69;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = warmup + 69;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
        Context context = (Context) objArr[1];
        Boolean bool = (Boolean) objArr[2];
        int i = 2 % 2;
        int i2 = warmup + 15;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        writeRaw<Intent> writerawOnWarmupCompleted = certifyGuestViewModel.onWarmupCompleted(context);
        int i4 = requestPostMessageChannel + 23;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return writerawOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final writeRaw<Intent> onExtraCallbackWithResult(@NotNull final Context context, @NotNull jniHandleMemoryPressure jnihandlememorypressure, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(jnihandlememorypressure, "");
        writeRaw<BaseApiResponse<Boolean>> writerawOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession().onExtraCallback(new GuestAddPossessionRequest(this.getInterfaceDescriptor, jnihandlememorypressure, j));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onTransact(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda14
            public final Object invoke(Object obj) {
                return CertifyGuestViewModel.onExtraCallback(this.f$0, context, (Boolean) obj);
            }
        };
        writeRaw<Intent> writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda15
            public final Object apply(Object obj) {
                return CertifyGuestViewModel.IAuthTabCallbackStub(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        int i2 = requestPostMessageChannel + 95;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnExtraCallbackWithResult;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends Intent, ? extends AuthPolicy>>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ getFinalX $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(Context context, getFinalX getfinalx, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$request = getfinalx;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CertifyGuestViewModel.this.new access000(this.$context, this.$request, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Pair<? extends Intent, ? extends AuthPolicy>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallbackWithResult;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                notifyVerticalEdgeReached notifyverticaledgereachedOnWarmupCompleted = CertifyGuestViewModel.onWarmupCompleted(CertifyGuestViewModel.this);
                Context context = this.$context;
                createPaints createpaints = createPaints.IAuthTabCallback;
                boolean zIsEngagementSignalsApiAvailable = CertifyGuestViewModel.this.isEngagementSignalsApiAvailable();
                getFinalX getfinalx = this.$request;
                getLogUploadURLMap getloguploadurlmapIAuthTabCallbackStub = CertifyGuestViewModel.this.IAuthTabCallbackStub();
                this.label = 1;
                objOnExtraCallbackWithResult = notifyverticaledgereachedOnWarmupCompleted.onExtraCallbackWithResult(context, createpaints, zIsEngagementSignalsApiAvailable, getfinalx, getloguploadurlmapIAuthTabCallbackStub, this);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            return objOnExtraCallbackWithResult;
        }
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 9;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = requestPostMessageChannel + 99;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(AuthPolicy authPolicy, SetDetectableSize setDetectableSize) {
        String logValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("authPolicy", authPolicy);
        createPaints createpaints = createPaints.IAuthTabCallback;
        isVivoY11 isvivoy11IAuthTabCallbackDefault = createpaints.IAuthTabCallbackDefault();
        Object obj = null;
        setDetectableSize.onExtraCallback("certify_method", isvivoy11IAuthTabCallbackDefault != null ? isvivoy11IAuthTabCallbackDefault.getLogValue() : null);
        setSelection setselectionAccess000 = createpaints.access000();
        if (setselectionAccess000 != null) {
            int i2 = requestPostMessageChannel + 91;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                setselectionAccess000.getLogValue();
                obj.hashCode();
                throw null;
            }
            logValue = setselectionAccess000.getLogValue();
        } else {
            logValue = null;
        }
        setDetectableSize.onExtraCallback("possession_method", logValue);
        Unit unit = Unit.INSTANCE;
        int i3 = warmup + 41;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CertifyGuestViewModel certifyGuestViewModel, Pair pair) {
        int i = 2 % 2;
        final AuthPolicy authPolicy = (AuthPolicy) pair.IAuthTabCallback();
        certifyGuestViewModel.setEngagementSignalsCallback = true;
        certifyGuestViewModel.onUnminimized.setValue(authPolicy);
        ConvertByteArrayToFloatArray.onExtraCallback(1007541L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return CertifyGuestViewModel.IAuthTabCallback(authPolicy, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = warmup + 7;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Pair pair = (Pair) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 29;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Intent intentOnExtraCallbackWithResult = zzbq.onExtraCallbackWithResult((Intent) pair.onExtraCallbackWithResult());
        int i4 = requestPostMessageChannel + 19;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return intentOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 31;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Intent intent = (Intent) function1.invoke(obj);
        int i3 = requestPostMessageChannel + 5;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return intent;
    }

    private final writeRaw<Intent> onWarmupCompleted(Context context) {
        int i = 2 % 2;
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new access000(context, new getFinalX(this.getInterfaceDescriptor, this.access000, this.ICustomTabsCallbackStub, getFinalX.onExtraCallbackWithResult.LOGIN), null), 1, (Object) null).IAuthTabCallback(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (Pair) obj};
                int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                return (Unit) CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, 868887361, -868887352, ICustomTabsCallbackStubProxy.onExtraCallback());
            }
        };
        writeRaw writerawOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda7
            public final void accept(Object obj) {
                CertifyGuestViewModel.onExtraCallbackWithResult(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return CertifyGuestViewModel.onWarmupCompleted((Pair) obj);
            }
        };
        writeRaw<Intent> writerawOnWarmupCompleted = writerawOnNavigationEvent.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$$ExternalSyntheticLambda9
            public final Object apply(Object obj) {
                return CertifyGuestViewModel.asBinder(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        int i2 = warmup + 37;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IAuthTabCallback(@org.jetbrains.annotations.NotNull final android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestViewModel.IAuthTabCallback(android.content.Context):void");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[2];
        Context context = (Context) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[6]).booleanValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[7];
        int i = 2 % 2;
        int i2 = warmup + 37;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("sim_count", Integer.valueOf(iIntValue));
        setDetectableSize.onExtraCallback("is_same_phone_number", Boolean.valueOf(zBooleanValue));
        setDetectableSize.onExtraCallback("is_manual_input", Boolean.valueOf(true ^ certifyGuestViewModel.readTypedObject));
        Object[] objArr2 = {ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted, context};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        setDetectableSize.onExtraCallback("is_airplane_mode_on", Boolean.valueOf(((Boolean) ReactNativeFeatureFlagsCxxInterop.IAuthTabCallback(objArr2, 1979635851, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted, -1979635849, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).booleanValue()));
        setDetectableSize.onExtraCallback("is_guardian_mode", Boolean.valueOf(certifyGuestViewModel.IAuthTabCallback_Parcel));
        setDetectableSize.onExtraCallback("is_under_fourteen", Boolean.valueOf(getMaxScale.IAuthTabCallback.IAuthTabCallbackStub()));
        setDetectableSize.onExtraCallback("is_sim_count_permission_granted", Boolean.valueOf(zBooleanValue2));
        setDetectableSize.onExtraCallback("is_phone_number_permission_granted", Boolean.valueOf(zBooleanValue3));
        setDetectableSize.onExtraCallback("isSamePhoneNumberFromSmsRetriever", Boolean.valueOf(zBooleanValue4));
        Unit unit = Unit.INSTANCE;
        int i4 = requestPostMessageChannel + 93;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CertifyGuestViewModel.this.new IAuthTabCallbackStub(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            CertifyGuestViewModel certifyGuestViewModel;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CertifyGuestViewModel certifyGuestViewModel2 = CertifyGuestViewModel.this;
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                Pair[] pairArr = {getWrite.IAuthTabCallback("onboarding.userinfo.largeTextType", "con"), getWrite.IAuthTabCallback("onboarding.userinfo.survey", access14000.onNavigationEvent(false)), getWrite.IAuthTabCallback("onboarding.visitor.enabled", access14000.onNavigationEvent(false)), getWrite.IAuthTabCallback("onboarding.userinfo.visitor.entrypoint.visible.timeMs", access14000.onExtraCallback(2500L))};
                this.L$0 = certifyGuestViewModel2;
                this.label = 1;
                Object objOnNavigationEvent = lifecyclesKtawaitStarted21.onNavigationEvent(pairArr, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                certifyGuestViewModel = certifyGuestViewModel2;
                obj = objOnNavigationEvent;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                certifyGuestViewModel = (CertifyGuestViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            certifyGuestViewModel.onWarmupCompleted((Map<String, String>) obj);
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 47;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        if (this.newSession == null) {
            this.asInterface = maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
            return;
        }
        int i5 = i2 + 37;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void ICustomTabsService() {
        int i = 2 % 2;
        int i2 = warmup + 107;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        requestPostMessageChannel();
        int i4 = requestPostMessageChannel + 1;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void requestPostMessageChannel() {
        int i = 2 % 2;
        if (getSWidth.onExtraCallback.IAuthTabCallback()) {
            return;
        }
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 15;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = this.ICustomTabsCallback;
        if (getpackagetype != null) {
            int i5 = i2 + 23;
            warmup = i5 % 128;
            if (i5 % 2 == 0) {
                if (!getpackagetype.onExtraCallback()) {
                    return;
                }
            } else if (getpackagetype.onExtraCallback()) {
                return;
            }
        }
        this.ICustomTabsCallback = maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(this, (access13800) null), 3, (Object) null);
    }

    private final boolean setEngagementSignalsCallback() {
        int i = 2 % 2;
        if (!this.requestPostMessageChannelWithExtras && !this.IAuthTabCallback_Parcel) {
            int i2 = requestPostMessageChannel;
            int i3 = i2 + 97;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            if (!this.writeTypedObject) {
                int i5 = i2 + 61;
                warmup = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 8 / 0;
                    if (!this.IAuthTabCallbackStubProxy) {
                        return true;
                    }
                } else if (!this.IAuthTabCallbackStubProxy) {
                    return true;
                }
            }
        }
        int i7 = requestPostMessageChannel + 5;
        warmup = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final boolean mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 3;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            setEngagementSignalsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean engagementSignalsCallback = setEngagementSignalsCallback();
        int i3 = requestPostMessageChannel + 103;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return engagementSignalsCallback;
    }

    public final void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 27;
        warmup = i2 % 128;
        this.extraCallbackWithResult = i2 % 2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r3.length() > 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void newSession() {
        /*
            r15 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.certify.CertifyGuestViewModel.warmup
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            viva.republica.toss.guest.certify.CertifyGuestViewModel.requestPostMessageChannel = r3
            int r1 = r1 % r0
            java.lang.Object[] r6 = new java.lang.Object[]{r15}
            int r5 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback()
            int r4 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback()
            int r3 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback()
            int r9 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback()
            r7 = -1912172305(0xffffffff8e0690ef, float:-1.6586558E-30)
            r8 = 1912172326(0x71f96f26, float:2.4702764E30)
            java.lang.Object r1 = onNavigationEvent(r3, r4, r5, r6, r7, r8, r9)
            o.AttCertValidityPeriod r1 = (o.AttCertValidityPeriod) r1
            int r1 = r1.onWarmupCompleted()
            int r3 = r15.onMinimized
            r4 = -1
            if (r3 != r4) goto L39
            r15.onNavigationEvent(r1)
            return
        L39:
            o.setCommonNetworkProxy r3 = r15.onPostMessage
            java.lang.String r3 = r3.onExtraCallback()
            r4 = 0
            if (r3 == 0) goto L66
            int r5 = viva.republica.toss.guest.certify.CertifyGuestViewModel.requestPostMessageChannel
            int r5 = r5 + 29
            int r6 = r5 % 128
            viva.republica.toss.guest.certify.CertifyGuestViewModel.warmup = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L56
            int r3 = r3.length()
            if (r3 <= 0) goto L54
            goto L5c
        L54:
            r3 = r2
            goto L67
        L56:
            int r3 = r3.length()
            if (r3 <= 0) goto L66
        L5c:
            int r3 = viva.republica.toss.guest.certify.CertifyGuestViewModel.requestPostMessageChannel
            int r3 = r3 + 75
            int r5 = r3 % 128
            viva.republica.toss.guest.certify.CertifyGuestViewModel.warmup = r5
            int r3 = r3 % r0
            goto L54
        L66:
            r3 = r4
        L67:
            int r5 = r15.onMinimized
            if (r5 == r1) goto Lc8
            if (r1 <= 0) goto Lc8
            o.ConvertFloatArrayToByteArray r6 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "beforeSimCount : "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = " simCount: "
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = ", hasLoginToken: "
            r7.append(r5)
            r7.append(r3)
            java.lang.String r8 = r7.toString()
            int r5 = r15.onMinimized
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r7 = "beforeSimCount"
            kotlin.Pair r5 = o.getWrite.IAuthTabCallback(r7, r5)
            java.lang.String r7 = "simCount"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r7 = o.getWrite.IAuthTabCallback(r7, r9)
            java.lang.String r9 = "hasLoginToken"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            kotlin.Pair r3 = o.getWrite.IAuthTabCallback(r9, r3)
            r9 = 3
            kotlin.Pair[] r9 = new kotlin.Pair[r9]
            r9[r4] = r5
            r9[r2] = r7
            r9[r0] = r3
            java.util.Map r9 = o.access8100.onWarmupCompleted(r9)
            java.lang.String r7 = "LoginTokenForegroundDebug"
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 56
            r14 = 0
            o.ConvertFloatArrayToByteArray.onExtraCallback(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Lc8:
            r15.onNavigationEvent(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestViewModel.newSession():void");
    }

    public final void onExtraCallbackWithResult(@NotNull OverseasPhoneInfo overseasPhoneInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(overseasPhoneInfo, "");
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(overseasPhoneInfo, null), 3, (Object) null);
        int i2 = warmup + 81;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $phoneNumber;
        Object L$0;
        int label;
        final /* synthetic */ CertifyGuestViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(String str, CertifyGuestViewModel certifyGuestViewModel, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$phoneNumber = str;
            this.this$0 = certifyGuestViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStubProxy(this.$phoneNumber, this.this$0, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            OverseasPhoneInfo overseasPhoneInfo;
            Object objOnNavigationEvent;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                OverseasPhoneInfo overseasPhoneInfoOnExtraCallback = OverseasPhoneInfo.Companion.onExtraCallback(this.$phoneNumber, CountryInfo.KR);
                CertifyGuestViewModel certifyGuestViewModel = this.this$0;
                this.L$0 = overseasPhoneInfoOnExtraCallback;
                this.label = 1;
                Object objOnExtraCallbackWithResult = CertifyGuestViewModel.onExtraCallbackWithResult(certifyGuestViewModel, overseasPhoneInfoOnExtraCallback, (access13800) this);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                overseasPhoneInfo = overseasPhoneInfoOnExtraCallback;
                objOnNavigationEvent = objOnExtraCallbackWithResult;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                overseasPhoneInfo = (OverseasPhoneInfo) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            CertifyGuestViewModel certifyGuestViewModel2 = this.this$0;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                certifyGuestViewModel2.onActivityLayout().setValue(OverseasSmsUserInfo.Companion.onExtraCallback(overseasPhoneInfo, ((PhotoBrowseView8) objOnNavigationEvent).onExtraCallbackWithResult()));
            }
            CertifyGuestViewModel certifyGuestViewModel3 = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
            if (th != null) {
                certifyGuestViewModel3.asBinder().setValue(th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0123, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(im.toss.features.verify.oneclicklogin.model.network.response.SmsPossessionSendResponse.class, kotlin.Unit.class) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(im.toss.features.useronboarding.overseas.model.OverseasPhoneInfo r24, o.access13800<? super kotlin.Result<o.PhotoBrowseView8>> r25) throws im.toss.network.throwable.TossApiCallException.ApiError {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.CertifyGuestViewModel.onWarmupCompleted(im.toss.features.useronboarding.overseas.model.OverseasPhoneInfo, o.access13800):java.lang.Object");
    }

    public final CountryInfo extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = warmup + 99;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        CountryInfo countryInfo = (CountryInfo) this.extraCallback.onExtraCallback("STATE_OVERSEAS_PHONE_SELECTED_COUNTRY");
        int i4 = warmup + 79;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return countryInfo;
    }

    public final void IAuthTabCallback(@NotNull CountryInfo countryInfo) {
        int i = 2 % 2;
        int i2 = warmup + 35;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(countryInfo, "");
            this.extraCallback.onWarmupCompleted("STATE_OVERSEAS_PHONE_SELECTED_COUNTRY", countryInfo);
            int i3 = 79 / 0;
        } else {
            Intrinsics.checkNotNullParameter(countryInfo, "");
            this.extraCallback.onWarmupCompleted("STATE_OVERSEAS_PHONE_SELECTED_COUNTRY", countryInfo);
        }
        int i4 = requestPostMessageChannel + 103;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final boolean ICustomTabsCallbackStubProxy() {
        String str;
        int i = 2 % 2;
        Map<String, String> map = this.newSession;
        if (map != null) {
            str = map.get("onboarding.visitor.enabled");
            int i2 = requestPostMessageChannel + 19;
            warmup = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        if (Boolean.parseBoolean(str)) {
            int i4 = warmup + 9;
            requestPostMessageChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
                if (!createPaints.IAuthTabCallback.ICustomTabsCallback()) {
                    return true;
                }
            } else if (!createPaints.IAuthTabCallback.ICustomTabsCallback()) {
                return true;
            }
        }
        int i6 = warmup + 35;
        requestPostMessageChannel = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final long onRelationshipValidationResult() {
        String str;
        Long longOrNull;
        int i = 2 % 2;
        Map<String, String> map = this.newSession;
        if (map != null && (str = map.get("onboarding.userinfo.visitor.entrypoint.visible.timeMs")) != null && (longOrNull = StringsKt.toLongOrNull(str)) != null) {
            int i2 = requestPostMessageChannel + 121;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            return longOrNull.longValue();
        }
        int i4 = requestPostMessageChannel + 113;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return 2500L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        readTypedObject(access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CertifyGuestViewModel.this.new readTypedObject(access13800Var);
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
                Object[] objArr = {CertifyGuestViewModel.this};
                int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                nLockFileSegment nlockfilesegment = (nLockFileSegment) CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -1528765756, 1528765761, ICustomTabsCallbackStubProxy.onExtraCallback());
                initialiseBaseLayer.onWarmupCompleted onwarmupcompleted = initialiseBaseLayer.onWarmupCompleted.IAuthTabCallback;
                this.label = 1;
                if (nlockfilesegment.onExtraCallback(onwarmupcompleted, this) == objOnWarmupCompleted) {
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

    public final void prefetch() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new readTypedObject(null), 3, (Object) null);
        int i2 = warmup + 75;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    public final writeRaw<Boolean> onExtraCallbackWithResult(long j) {
        writeRaw<BaseApiResponse<Boolean>> writerawOnExtraCallbackWithResult;
        int i = 2 % 2;
        GuestAddCertifyRequest guestAddCertifyRequest = new GuestAddCertifyRequest(this.getInterfaceDescriptor, j);
        setVolume setvolumeNewSession = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession();
        if (this.requestPostMessageChannelWithExtras) {
            int i2 = warmup + 67;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
            writerawOnExtraCallbackWithResult = setvolumeNewSession.onWarmupCompleted(guestAddCertifyRequest);
        } else {
            writerawOnExtraCallbackWithResult = setvolumeNewSession.onExtraCallbackWithResult(guestAddCertifyRequest);
        }
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw<Boolean> writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new asBinder(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        int i4 = requestPostMessageChannel + 31;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return writerawIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final writeRaw<Object> IAuthTabCallbackDefault(long j) {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<Object>> writerawOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras().onExtraCallback(new initializeBridge(this.getInterfaceDescriptor, j));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw<Object> writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new extraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        int i2 = requestPostMessageChannel + 55;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return writerawIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i5;
        int i11 = (~i10) | i9;
        int i12 = ~i5;
        int i13 = (~(i3 | i10)) | (~(i8 | i12)) | (~(i12 | i4));
        int i14 = i4 + i5 + i2 + ((-1017789379) * i) + (461141949 * i6);
        int i15 = i14 * i14;
        int i16 = ((i4 * (-1063000396)) - 360994079) + (i5 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + ((-1063000885) * i2) + ((-90181537) * i) + ((-1548859681) * i6) + (i15 * 816250880);
        switch (((-551480932) * i4) + 431816704 + ((-1613042074) * i5) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i2) + ((-1727660032) * i) + (1912995840 * i6) + ((-1005256704) * i15) + (i16 * i16 * 1493368832)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) objArr[0];
                String str = (String) objArr[1];
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(certifyGuestViewModel), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(str, certifyGuestViewModel, null), 3, (Object) null);
                int i18 = requestPostMessageChannel + 103;
                warmup = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                CertifyGuestViewModel certifyGuestViewModel2 = (CertifyGuestViewModel) objArr[0];
                Pair pair = (Pair) objArr[1];
                int i20 = 2 % 2;
                int i21 = requestPostMessageChannel + 35;
                warmup = i21 % 128;
                int i22 = i21 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(certifyGuestViewModel2, pair);
                int i23 = requestPostMessageChannel + 117;
                warmup = i23 % 128;
                int i24 = i23 % 2;
                return unitOnExtraCallbackWithResult;
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                int iIntValue = ((Number) objArr[0]).intValue();
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                CertifyGuestViewModel certifyGuestViewModel3 = (CertifyGuestViewModel) objArr[2];
                Context context = (Context) objArr[3];
                boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
                boolean zBooleanValue4 = ((Boolean) objArr[6]).booleanValue();
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[7];
                int i25 = 2 % 2;
                int i26 = warmup + 9;
                requestPostMessageChannel = i26 % 128;
                int i27 = i26 % 2;
                Object[] objArr2 = {Integer.valueOf(iIntValue), Boolean.valueOf(zBooleanValue), certifyGuestViewModel3, context, Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), Boolean.valueOf(zBooleanValue4), setDetectableSize};
                Unit unit = (Unit) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), objArr2, -552556516, 552556517, ICustomTabsCallbackStubProxy.onExtraCallback());
                int i28 = requestPostMessageChannel + 99;
                warmup = i28 % 128;
                int i29 = i28 % 2;
                return unit;
            case 12:
                CertifyGuestViewModel certifyGuestViewModel4 = (CertifyGuestViewModel) objArr[0];
                int i30 = 2 % 2;
                int i31 = warmup;
                int i32 = i31 + 117;
                requestPostMessageChannel = i32 % 128;
                int i33 = i32 % 2;
                boolean z = certifyGuestViewModel4.ICustomTabsCallback_Parcel;
                int i34 = i31 + 117;
                requestPostMessageChannel = i34 % 128;
                int i35 = i34 % 2;
                return Boolean.valueOf(z);
            case 13:
                return asBinder(objArr);
            case 14:
                CertifyGuestViewModel certifyGuestViewModel5 = (CertifyGuestViewModel) objArr[0];
                int i36 = 2 % 2;
                int i37 = warmup + 33;
                int i38 = i37 % 128;
                requestPostMessageChannel = i38;
                int i39 = i37 % 2;
                boolean z2 = certifyGuestViewModel5.IAuthTabCallbackDefault;
                int i40 = i38 + 57;
                warmup = i40 % 128;
                int i41 = i40 % 2;
                return Boolean.valueOf(z2);
            case 15:
                return onTransact(objArr);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return IAuthTabCallbackStubProxy(objArr);
            case 18:
                return access100(objArr);
            case 19:
                return access000(objArr);
            case 20:
                return getInterfaceDescriptor(objArr);
            case 21:
                return readTypedObject(objArr);
            case 22:
                CertifyGuestViewModel certifyGuestViewModel6 = (CertifyGuestViewModel) objArr[0];
                int i42 = 2 % 2;
                int i43 = warmup;
                int i44 = i43 + 67;
                requestPostMessageChannel = i44 % 128;
                int i45 = i44 % 2;
                boolean z3 = certifyGuestViewModel6.IAuthTabCallback_Parcel;
                int i46 = i43 + 85;
                requestPostMessageChannel = i46 % 128;
                int i47 = i46 % 2;
                return Boolean.valueOf(z3);
            default:
                int i48 = 2 % 2;
                AttCertValidityPeriod attCertValidityPeriod = new AttCertValidityPeriod(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
                int i49 = warmup + 5;
                requestPostMessageChannel = i49 % 128;
                int i50 = i49 % 2;
                return attCertValidityPeriod;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(int i, boolean z, CertifyGuestViewModel certifyGuestViewModel, Context context, boolean z2, boolean z3, boolean z4, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Integer.valueOf(i), Boolean.valueOf(z), certifyGuestViewModel, context, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), setDetectableSize};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, 1182591630, -1182591619, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(CertifyGuestViewModel certifyGuestViewModel, Pair pair) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{certifyGuestViewModel, pair}, 868887361, -868887352, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public static final /* synthetic */ GetInputImageFromPathAsGrayScale onExtraCallback(CertifyGuestViewModel certifyGuestViewModel) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (GetInputImageFromPathAsGrayScale) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{certifyGuestViewModel}, -779784994, 779785011, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public static final /* synthetic */ nLockFileSegment onNavigationEvent(CertifyGuestViewModel certifyGuestViewModel) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (nLockFileSegment) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{certifyGuestViewModel}, -1528765756, 1528765761, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final deserializeIp onWarmupCompleted(CertifyGuestViewModel certifyGuestViewModel, Context context, Boolean bool) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (deserializeIp) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{certifyGuestViewModel, context, bool}, 459200042, -459200027, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final deserializeIp asInterface(Function1 function1, Object obj) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (deserializeIp) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{function1, obj}, -601840109, 601840116, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final AttCertValidityPeriod newSessionWithExtras() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (AttCertValidityPeriod) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[0], 1735757749, -1735757749, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private final AttCertValidityPeriod postMessage() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (AttCertValidityPeriod) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, -1912172305, 1912172326, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final Intent IAuthTabCallback(Pair pair) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Intent) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{pair}, 1756772039, -1756772023, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final Intent onTransact(Function1 function1, Object obj) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Intent) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{function1, obj}, -1870346696, 1870346715, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final deserializeIp IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (deserializeIp) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{function1, obj}, 2021971797, -2021971794, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final Pair IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Pair) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{function1, obj}, -106956707, 106956713, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final Unit onExtraCallbackWithResult(int i, boolean z, CertifyGuestViewModel certifyGuestViewModel, Context context, boolean z2, boolean z3, boolean z4, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Integer.valueOf(i), Boolean.valueOf(z), certifyGuestViewModel, context, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), setDetectableSize};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -552556516, 552556517, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final LiveData<AuthPolicy> IAuthTabCallback() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (LiveData) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, 327394819, -327394801, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final boolean onTransact() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Boolean) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, 414350851, -414350837, ICustomTabsCallbackStubProxy.onExtraCallback())).booleanValue();
    }

    public final boolean access000() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Boolean) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, -1033083291, 1033083313, ICustomTabsCallbackStubProxy.onExtraCallback())).booleanValue();
    }

    public final boolean onActivityResized() {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Boolean) onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, 413068585, -413068573, ICustomTabsCallbackStubProxy.onExtraCallback())).booleanValue();
    }

    public final void onExtraCallback(@NotNull String str) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this, str}, -1149074753, 1149074757, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final void onExtraCallbackWithResult(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, 559311633, -559311620, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final void onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -1338242766, 1338242768, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this, str}, -803660786, 803660796, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final void IAuthTabCallbackDefault(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, -1289152956, 1289152976, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final void access000(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr, 1791852698, -1791852690, ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    static void newAuthTabSession() {
        receiveFile = 478308940;
    }
}
