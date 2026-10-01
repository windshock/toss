package im.toss.rn.toss.core;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.JsonElement;
import im.toss.components.alpha.accesstoken.AlphaEnvironmentAccessTokenProvider;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.rn.toss.core.TossModule$__te$2$;
import im.toss.rn.toss.core.common.bridge.ReactNativeJsBridgeKt;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.ALCDetectionMode;
import o.ALCLiveness;
import o.AUTextView;
import o.AudienceNetworkActivity;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseResponseBody;
import o.ConvertFloatArrayToByteArray;
import o.CreateInputImageFromJPEGBinary;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DiagnosticsWorker;
import o.GetFeatureExtension;
import o.GetInputImageFromPath;
import o.GetMotionInteractionState;
import o.MaxFullscreenAdImplExternalSyntheticLambda5;
import o.MaxFullscreenAdImplb;
import o.MultiParagraphExternalSyntheticLambda0;
import o.MultiParagraphExternalSyntheticLambda1;
import o.RectListDebuggerModifierElement;
import o.RemoteWorkManager;
import o.ResourceIdCache;
import o.Response;
import o.Role;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TTBaseLandingPageActivity;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.Threshold;
import o.TrackGroupExternalSyntheticLambda0;
import o.UserChoiceBillingListener;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access8100;
import o.adInfo;
import o.assertUnreachable;
import o.auth;
import o.buildLoadAdConfig;
import o.calculateMaxTextSize;
import o.downloadZip;
import o.drawTextBox;
import o.ec;
import o.findResAndMsg;
import o.getWidgetLayoutParams;
import o.getWriggleLayout;
import o.getWrite;
import o.h1;
import o.logicVerifyID;
import o.maybeUpdateAnimatable;
import o.nzi;
import o.putChannelInfo;
import o.r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos;
import o.r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I;
import o.r8lambdaKQljdHbnTh3WKvdWuw6pSds3WQ;
import o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE;
import o.setRandomHost;
import o.sp;
import o.tnycx;
import o.transFinalize;
import o.videoFrameChanged;
import o.wie2;
import o.zzaj;
import o.zzcy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossModule extends Role implements MultiParagraphExternalSyntheticLambda0, DefaultLifecycleObserver {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int ICustomTabsCallbackDefault = 1;
    private static int ICustomTabsCallbackStub = 1;
    private static boolean onActivityResized;
    private static int onMessageChannelReady;
    private static char[] onMinimized;
    private static boolean onPostMessage;
    private static int onRelationshipValidationResult;
    private static int onUnminimized;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final WeakReference<? extends TossReactContentOwner> ICustomTabsCallback;
    private final wie2 access000;
    private final String access100;
    private final String asBinder;
    private final Lazy asInterface;
    private final Lazy extraCallback;
    private final String extraCallbackWithResult;
    private final String getInterfaceDescriptor;
    private final calculateMaxTextSize onActivityLayout;
    private final Lazy onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final boolean onTransact;
    private final Function0<Boolean> onWarmupCompleted;
    private final String readTypedObject;
    private final String writeTypedObject;

    static {
        onPostMessage();
        Companion = new onWarmupCompleted(null);
        int i = onUnminimized + 93;
        ICustomTabsCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ReactContext IAuthTabCallback(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 123;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallback(tossModule);
        }
        extraCallback(tossModule);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TossModule tossModule = (TossModule) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 107;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossModule, str);
        int i4 = onRelationshipValidationResult + 123;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TossModule tossModule = (TossModule) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 31;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(tossModule);
        int i4 = ICustomTabsCallbackStub + 101;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public static /* synthetic */ Object access100$2257361c() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 19;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onMinimized$2257361c();
            obj.hashCode();
            throw null;
        }
        Object objOnMinimized$2257361c = onMinimized$2257361c();
        int i3 = onRelationshipValidationResult + 101;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnMinimized$2257361c;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findResAndMsg onExtraCallback(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 75;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgWriteTypedObject = writeTypedObject(tossModule);
        int i4 = onRelationshipValidationResult + 57;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgWriteTypedObject;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 81;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjgeExtraCommand = extraCommand();
        int i4 = ICustomTabsCallbackStub + 117;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return r8lambdausr520ceu4yijcrtwho1uywjgeExtraCommand;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossModule tossModule, Function2 function2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 103;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tossModule, function2);
        int i4 = onRelationshipValidationResult + 99;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda5 onExtraCallbackWithResult(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 113;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda5 interfaceDescriptor = getInterfaceDescriptor(tossModule);
        int i4 = onRelationshipValidationResult + 73;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossModule tossModule = (TossModule) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 111;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallbackWithResult(tossModule);
        }
        extraCallbackWithResult(tossModule);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 79;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(adinfo);
        }
        onExtraCallbackWithResult(adinfo);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Function2 onNavigationEvent(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 25;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Function2 function2ICustomTabsCallback = ICustomTabsCallback(tossModule);
        int i4 = onRelationshipValidationResult + 39;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return function2ICustomTabsCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 113;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function0);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStub + 25;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 5;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objOnMessageChannelReady$6f58e5ec = onMessageChannelReady$6f58e5ec();
        int i4 = onRelationshipValidationResult + 53;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objOnMessageChannelReady$6f58e5ec;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~((~i3) | i7);
        int i9 = ~(i7 | i);
        int i10 = i8 | i9;
        int i11 = i9 | i3;
        int i12 = ~(i7 | i3);
        int i13 = i4 + i3 + i2 + (1577873432 * i6) + (977123338 * i5);
        int i14 = i13 * i13;
        int i15 = (i4 * (-1177406726)) + 1326046462 + (i3 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + ((-1177406223) * i2) + (1546282648 * i6) + ((-1884272278) * i5) + (i14 * 70909952);
        switch ((((-1026819430) * i4) - 865599488) + ((-647756440) * i3) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i2) + ((-767557632) * i6) + (1290797056 * i5) + ((-539361280) * i14) + (i15 * i15 * 451280896)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                TossModule tossModule = (TossModule) objArr[0];
                String str = (String) objArr[1];
                int i16 = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5ICustomTabsCallbackStubProxy = tossModule.ICustomTabsCallbackStubProxy();
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-106, -107, -108}, 127 - TextUtils.getOffsetAfter("", 0), objArr2);
                maxFullscreenAdImplExternalSyntheticLambda5ICustomTabsCallbackStubProxy.onExtraCallback("present", access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str)));
                int i17 = onRelationshipValidationResult + 83;
                ICustomTabsCallbackStub = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                TossModule tossModule2 = (TossModule) objArr[0];
                String str2 = (String) objArr[1];
                final Function0 function0 = (Function0) objArr[2];
                int i19 = 2 % 2;
                int i20 = onRelationshipValidationResult + 47;
                ICustomTabsCallbackStub = i20 % 128;
                int i21 = i20 % 2;
                ReactContext reactContextBj_ = tossModule2.bj_();
                if (reactContextBj_.getJSMessageQueueThread() != null) {
                    reactContextBj_.runOnJSQueueThread(new Runnable() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = 2 % 2;
                            int i23 = onExtraCallback + 63;
                            onExtraCallbackWithResult = i23 % 128;
                            if (i23 % 2 != 0) {
                                TossModule.onNavigationEvent(function0);
                                int i24 = 78 / 0;
                            } else {
                                TossModule.onNavigationEvent(function0);
                            }
                            int i25 = onExtraCallback + 33;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                        }
                    });
                    return null;
                }
                int i22 = onRelationshipValidationResult + 91;
                ICustomTabsCallbackStub = i22 % 128;
                int i23 = i22 % 2;
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "rn_js_queue_not_ready", "JS 큐 스레드 미준비로 이벤트 드롭", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "TossModule"), getWrite.IAuthTabCallback("event", str2)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return null;
            case 11:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static final class IAuthTabCallbackDefault extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function1 onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, Function1 function1) {
            super(onwarmupcompleted);
            this.onExtraCallback = function1;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0 ? zzcy.onNavigationEvent(th, 0, 1, (Object) null) : zzcy.onNavigationEvent(th, 1, 1, (Object) null)) {
                this.onExtraCallback.invoke(new RectListDebuggerModifierElement("인터넷 연결이 오프라인 상태입니다.", "NETWORK_ERROR"));
                return;
            }
            if (th instanceof CancellationException) {
                return;
            }
            int i3 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ALCDetectionMode.onExtraCallbackWithResult(th, (Map) null, 1, (Object) null);
            int i5 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossModule(@NotNull ReactContext reactContext, @NotNull calculateMaxTextSize calculatemaxtextsize, @NotNull WeakReference<? extends TossReactContentOwner> weakReference, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @Nullable Function0<Boolean> function0) throws Throwable {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "");
        Intrinsics.checkNotNullParameter(calculatemaxtextsize, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.onActivityLayout = calculatemaxtextsize;
        this.ICustomTabsCallback = weakReference;
        this.writeTypedObject = str;
        this.IAuthTabCallback_Parcel = str2;
        this.IAuthTabCallback = str3;
        this.asBinder = str4;
        this.onNavigationEvent = str5;
        this.IAuthTabCallbackDefault = str6;
        this.IAuthTabCallbackStub = z;
        this.extraCallbackWithResult = str7;
        this.onWarmupCompleted = function0;
        this.access100 = "TossModule";
        String str8 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str8, "");
        this.readTypedObject = str8;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2005903668);
        Object obj = ((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11423 - (ViewConfiguration.getScrollBarSize() >> 8)), 30 - (ViewConfiguration.getTouchSlop() >> 8), 24857 - KeyEvent.keyCodeFromString(""), -1187993508, false, "onExtraCallbackWithResult", (Class[]) null) : objOnExtraCallback)).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1884379750);
            this.getInterfaceDescriptor = (String) ((Method) (objOnExtraCallback2 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11423 - TextUtils.indexOf("", "", 0)), 30 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 24857, -1091675382, false, "onWarmupCompleted", new Class[0]) : objOnExtraCallback2)).invoke(obj, null);
            this.IAuthTabCallbackStubProxy = r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I.onExtraCallback();
            this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 89;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    TossModule tossModule = this.f$0;
                    if (i3 == 0) {
                        return TossModule.onExtraCallbackWithResult(tossModule);
                    }
                    TossModule.onExtraCallbackWithResult(tossModule);
                    throw null;
                }
            });
            this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    Object objAccess100$2257361c;
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 81;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        objAccess100$2257361c = TossModule.access100$2257361c();
                        int i3 = 47 / 0;
                    } else {
                        objAccess100$2257361c = TossModule.access100$2257361c();
                    }
                    int i4 = IAuthTabCallback + 51;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objAccess100$2257361c;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda9
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 93;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnWarmupCompleted = TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -754594431, new Object[0], 754594438, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
                    int i4 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            });
            this.extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 63;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge = (r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE) TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 164704516, new Object[0], -164704511, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
                    int i4 = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return r8lambdausr520ceu4yijcrtwho1uywjge;
                }
            });
            this.access000 = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda11
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 75;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnNavigationEvent = TossModule.onNavigationEvent((adInfo) obj2);
                    int i4 = onExtraCallbackWithResult + 99;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return unitOnNavigationEvent;
                }
            }, 1, (Object) null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TossModule(ReactContext reactContext, calculateMaxTextSize calculatemaxtextsize, WeakReference weakReference, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Function0 function02;
        if ((i & 2048) != 0) {
            int i2 = onRelationshipValidationResult + 25;
            ICustomTabsCallbackStub = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            function02 = null;
        } else {
            function02 = function0;
        }
        this(reactContext, calculatemaxtextsize, weakReference, str, str2, str3, str4, str5, str6, z, str7, function02);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossModule tossModule = (TossModule) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 105;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TossReactContentOwner tossReactContentOwnerICustomTabsCallbackDefault = tossModule.ICustomTabsCallbackDefault();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = ICustomTabsCallbackStub + 49;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return tossReactContentOwnerICustomTabsCallbackDefault;
    }

    public static final /* synthetic */ Object IAuthTabCallbackDefault$21541b0a(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 15;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objICustomTabsCallbackStub$6f58e5ec = tossModule.ICustomTabsCallbackStub$6f58e5ec();
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = ICustomTabsCallbackStub + 35;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return objICustomTabsCallbackStub$6f58e5ec;
    }

    public static final /* synthetic */ Function0 IAuthTabCallbackStub(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 25;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Function0<Boolean> function0 = tossModule.onWarmupCompleted;
        int i5 = i2 + 93;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return function0;
        }
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStubProxy(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 117;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            tossModule.mayLaunchUrl();
            throw null;
        }
        boolean zMayLaunchUrl = tossModule.mayLaunchUrl();
        int i3 = ICustomTabsCallbackStub + 123;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return zMayLaunchUrl;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TossModule tossModule = (TossModule) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 59;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjgeOnUnminimized = tossModule.onUnminimized();
        int i4 = onRelationshipValidationResult + 97;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return r8lambdausr520ceu4yijcrtwho1uywjgeOnUnminimized;
    }

    public static final /* synthetic */ Object asBinder$78832dd2(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 59;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnActivityResized$2257361c = tossModule.onActivityResized$2257361c();
        int i4 = ICustomTabsCallbackStub + 21;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return objOnActivityResized$2257361c;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TossModule tossModule = (TossModule) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 21;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(tossModule.isEngagementSignalsApiAvailable());
        }
        tossModule.isEngagementSignalsApiAvailable();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(TossModule tossModule, String str, boolean z, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 49;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = tossModule.onWarmupCompleted(str, z, access13800Var);
        int i4 = onRelationshipValidationResult + 41;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ wie2 onTransact(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 21;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        wie2 wie2Var = tossModule.access000;
        int i5 = i2 + 95;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return wie2Var;
    }

    public static final /* synthetic */ Object onWarmupCompleted(TossModule tossModule, String str, ReadableMap readableMap, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 39;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return tossModule.IAuthTabCallback(str, readableMap, access13800Var);
        }
        tossModule.IAuthTabCallback(str, readableMap, access13800Var);
        throw null;
    }

    public /* bridge */ void onCreate(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 59;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onRelationshipValidationResult + 55;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onDestroy(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 77;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ void onPause(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 99;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onResume(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 53;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = ICustomTabsCallbackStub + 53;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 113;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.writeTypedObject;
        int i5 = i2 + 77;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 107;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback_Parcel;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 39;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 103;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        String str = this.asBinder;
        int i5 = i3 + 69;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return str;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 111;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i2 + 119;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 23;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallbackDefault;
        int i5 = i3 + 35;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 119;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 53;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.extraCallbackWithResult;
            int i4 = 30 / 0;
        } else {
            str = this.extraCallbackWithResult;
        }
        int i5 = i2 + 25;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 37;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.access100;
        int i5 = i2 + 41;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 43;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.readTypedObject;
        int i5 = i2 + 79;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 1;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.getInterfaceDescriptor;
        int i5 = i3 + 69;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean access000() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 61;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 117;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 109;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onTransact;
        }
        throw null;
    }

    private final findResAndMsg onRelationshipValidationResult() {
        int i = 2 % 2;
        TossReactContentOwner tossReactContentOwner = this.ICustomTabsCallback.get();
        if (tossReactContentOwner != null) {
            int i2 = onRelationshipValidationResult + 55;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            FragmentActivity activity = tossReactContentOwner.getActivity();
            if (activity != null) {
                int i4 = ICustomTabsCallbackStub + 121;
                onRelationshipValidationResult = i4 % 128;
                int i5 = i4 % 2;
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(activity);
                if (i5 != 0) {
                    int i6 = 16 / 0;
                }
                return textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
            }
        }
        int i7 = onRelationshipValidationResult + 121;
        ICustomTabsCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final MaxFullscreenAdImplExternalSyntheticLambda5 ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 61;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5 = (MaxFullscreenAdImplExternalSyntheticLambda5) this.asInterface.getValue();
        int i3 = onRelationshipValidationResult + 119;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda5;
        }
        throw null;
    }

    private static final MaxFullscreenAdImplExternalSyntheticLambda5 getInterfaceDescriptor(final TossModule tossModule) {
        int i = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5 = new MaxFullscreenAdImplExternalSyntheticLambda5(tossModule.onNavigationEvent(), new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                ReactContext reactContextIAuthTabCallback;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    reactContextIAuthTabCallback = TossModule.IAuthTabCallback(this.f$0);
                    int i4 = 71 / 0;
                } else {
                    reactContextIAuthTabCallback = TossModule.IAuthTabCallback(this.f$0);
                }
                int i5 = onExtraCallbackWithResult + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return reactContextIAuthTabCallback;
            }
        }, new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 27;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    TossModule.onExtraCallback(this.f$0);
                    obj.hashCode();
                    throw null;
                }
                findResAndMsg findresandmsgOnExtraCallback = TossModule.onExtraCallback(this.f$0);
                int i4 = onWarmupCompleted + 63;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return findresandmsgOnExtraCallback;
                }
                throw null;
            }
        }, new onNavigationEvent(tossModule), new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Function2 function2OnNavigationEvent = TossModule.onNavigationEvent(this.f$0);
                int i5 = onExtraCallback + 19;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return function2OnNavigationEvent;
            }
        }, new Function1() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = TossModule.onExtraCallbackWithResult(this.f$0, (Function2) obj);
                int i5 = onExtraCallback + 25;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, new onTransact(tossModule), new IAuthTabCallbackStub(tossModule));
        int i2 = onRelationshipValidationResult + 63;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return maxFullscreenAdImplExternalSyntheticLambda5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ReactContext extraCallback(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 109;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ReactContext reactContextBj_ = tossModule.bj_();
        int i4 = onRelationshipValidationResult + 47;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return reactContextBj_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<Map<String, ? extends Object>, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onNavigationEvent(Object obj) {
            super(1, obj, MultiParagraphExternalSyntheticLambda1.class, "emitOnSendEvent", "emitOnSendEvent(Lcom/brickmodule/codegen/TossModuleSpec;Ljava/util/Map;)V", 1);
        }

        public final void IAuthTabCallback(Map<String, ? extends Object> map) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            MultiParagraphExternalSyntheticLambda1.onWarmupCompleted((MultiParagraphExternalSyntheticLambda0) ((CallableReference) this).receiver, map);
            int i4 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((Map) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final findResAndMsg writeTypedObject(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 15;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            tossModule.onRelationshipValidationResult();
            throw null;
        }
        findResAndMsg findresandmsgOnRelationshipValidationResult = tossModule.onRelationshipValidationResult();
        int i3 = ICustomTabsCallbackStub + 85;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return findresandmsgOnRelationshipValidationResult;
        }
        obj.hashCode();
        throw null;
    }

    private static final Function2 ICustomTabsCallback(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 77;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Function2 function2Bi_ = tossModule.bi_();
        int i4 = onRelationshipValidationResult + 41;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return function2Bi_;
    }

    static final /* synthetic */ class onTransact extends FunctionReferenceImpl implements Function0<Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onTransact(Object obj) {
            super(0, obj, TossModule.class, "isEventEmitterOwnerActive", "isEventEmitterOwnerActive()Z", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return boolOnNavigationEvent;
        }

        public final Boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(TossModule) ((CallableReference) this).receiver};
            if (i3 != 0) {
                return Boolean.valueOf(((Boolean) TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1379096324, objArr, 1379096330, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult())).booleanValue());
            }
            Boolean.valueOf(((Boolean) TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1379096324, objArr, 1379096330, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult())).booleanValue());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(TossModule tossModule, Function2 function2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 85;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        tossModule.IAuthTabCallback(function2);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    static final /* synthetic */ class IAuthTabCallbackStub extends FunctionReferenceImpl implements Function0<Boolean> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        IAuthTabCallbackStub(Object obj) {
            super(0, obj, TossModule.class, "isEventEmitterOwnerRegistered", "isEventEmitterOwnerRegistered()Z", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(TossModule.IAuthTabCallbackStubProxy((TossModule) ((CallableReference) this).receiver));
            int i4 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return boolValueOf;
        }
    }

    private final Object onActivityResized$2257361c() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 101;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.getValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object value = this.onExtraCallback.getValue();
        int i3 = ICustomTabsCallbackStub + 59;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return value;
    }

    private static final Object onMinimized$2257361c() {
        Object objOnRelationshipValidationResult$2257361c;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 67;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            objOnRelationshipValidationResult$2257361c = ((assertUnreachable) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), assertUnreachable.class)).onRelationshipValidationResult$2257361c();
            int i3 = 54 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            objOnRelationshipValidationResult$2257361c = ((assertUnreachable) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), assertUnreachable.class)).onRelationshipValidationResult$2257361c();
        }
        int i4 = ICustomTabsCallbackStub + 71;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return objOnRelationshipValidationResult$2257361c;
    }

    private final Object ICustomTabsCallbackStub$6f58e5ec() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 19;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.getValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object value = this.onExtraCallbackWithResult.getValue();
        int i3 = onRelationshipValidationResult + 3;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return value;
    }

    private static final Object onMessageChannelReady$6f58e5ec() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 87;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            Object objIntDef$6f58e5ec = ((assertUnreachable) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), assertUnreachable.class)).IntDef$6f58e5ec();
            int i3 = ICustomTabsCallbackStub + 39;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            return objIntDef$6f58e5ec;
        }
        Response response2 = Response.onNavigationEvent;
        ((assertUnreachable) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), assertUnreachable.class)).IntDef$6f58e5ec();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE onUnminimized() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 49;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.extraCallback.getValue();
        if (i3 != 0) {
            return (r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE extraCommand() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            return ((ec) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ec.class)).invoke();
        }
        Response response2 = Response.onNavigationEvent;
        ((ec) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ec.class)).invoke();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TossReactContentOwner ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 65;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        TossReactContentOwner tossReactContentOwner = this.ICustomTabsCallback.get();
        int i4 = onRelationshipValidationResult + 95;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return tossReactContentOwner;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 119;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        adinfo.onNavigationEvent(tnycx.onWarmupCompleted(Reflection.getOrCreateKotlinClass(Object.class), GetMotionInteractionState.onExtraCallback));
        Unit unit = Unit.INSTANCE;
        int i4 = onRelationshipValidationResult + 83;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onStart(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
        Object[] objArr = {this, "visibilityChanged", new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 125;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {this.f$0};
                if (i4 != 0) {
                    return (Unit) TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1200245023, objArr2, -1200245022, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }};
        onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1681406686, objArr, 1681406696, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        int i2 = onRelationshipValidationResult + 75;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
    }

    private static final Unit extraCallbackWithResult(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 83;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        tossModule.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onRelationshipValidationResult + 55;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    private static final Unit readTypedObject(TossModule tossModule) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 29;
        onRelationshipValidationResult = i2 % 128;
        tossModule.IAuthTabCallback(i2 % 2 != 0);
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackStub + 23;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public void onStop(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Object[] objArr = {this, "visibilityChanged", new Function0() { // from class: im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr2 = {this.f$0};
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr3 = {this.f$0};
                Unit unit = (Unit) TossModule.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 569049211, objArr3, -569049203, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
                int i4 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }};
        onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1681406686, objArr, 1681406696, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
        int i2 = ICustomTabsCallbackStub + 85;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int[] onExtraCallback = {737028266, -1755263723, -1844215342, -629566749, -2131481306, 1904372635, 2026075092, 2002289196, 2062884090, -1022221181, 1268720588, -515384482, 1823056079, 1298942627, 1434607681, -294491674, 491133960, 1353359408};
        private static int onNavigationEvent = 1;
        final /* synthetic */ ReadableMap $parameter;
        int label;
        final /* synthetic */ TossModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(ReadableMap readableMap, TossModule tossModule, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$parameter = readableMap;
            this.this$0 = tossModule;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$parameter, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 99 / 0;
            }
            int i5 = IAuthTabCallback + 9;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = $10 + 99;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 72, KeyEvent.keyCodeFromString("") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8++;
                        i4 = -1469660336;
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
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    int i10 = $10 + 29;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i9]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 72 - Gravity.getAbsoluteGravity(i5, i5), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9++;
                    i5 = 0;
                }
                int i12 = $11 + 19;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                iArr5 = iArr6;
                i2 = 0;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i14 = $10 + 33;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i16 = 0;
                for (int i17 = 16; i16 < i17; i17 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 39, 10301 - View.resolveSize(0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i16++;
                }
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4032), 78 - Color.red(0), KeyEvent.getDeadChar(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr2, 0, i);
            int i21 = $10 + 21;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            objArr[0] = str;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            HashMap<String, Object> mapOnExtraCallbackWithResult;
            Threshold threshold;
            BaseResponseBody baseResponseBodyIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            try {
                mapOnExtraCallbackWithResult = r8lambdaKQljdHbnTh3WKvdWuw6pSds3WQ.onExtraCallbackWithResult(this.$parameter);
                Threshold.onWarmupCompleted onwarmupcompleted = new Threshold.onWarmupCompleted("event", "common", (String) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("from_rn", access14000.onNavigationEvent(true))), 4, (DefaultConstructorMarker) null);
                threshold = Threshold.onWarmupCompleted;
                baseResponseBodyIAuthTabCallback = threshold.IAuthTabCallback(mapOnExtraCallbackWithResult, onwarmupcompleted);
            } catch (Exception e) {
                wie2 wie2VarOnTransact = TossModule.onTransact(this.this$0);
                String strOnWarmupCompleted = wie2VarOnTransact.onWarmupCompleted(new getWidgetLayoutParams(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(nzi.onNavigationEvent(wie2VarOnTransact.onExtraCallback(), Reflection.getOrCreateKotlinClass(Object.class)))), this.$parameter.toHashMap());
                Object[] objArr = new Object[1];
                a(new int[]{-1472320059, -754554437}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr);
                ALCDetectionMode.onNavigationEvent(e, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strOnWarmupCompleted)));
            }
            if (baseResponseBodyIAuthTabCallback != null) {
                int i3 = IAuthTabCallback + 15;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    baseResponseBodyIAuthTabCallback.onNavigationEvent();
                    return Unit.INSTANCE;
                }
                baseResponseBodyIAuthTabCallback.onNavigationEvent();
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            if (GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(mapOnExtraCallbackWithResult, new CreateInputImageFromJPEGBinary("event", "common", access8100.onNavigationEvent(getWrite.IAuthTabCallback("from_rn", access14000.onNavigationEvent(true)))))) {
                return Unit.INSTANCE;
            }
            downloadZip downloadzipOnExtraCallbackWithResult = threshold.onExtraCallbackWithResult(mapOnExtraCallbackWithResult, new Threshold.onWarmupCompleted("event", "common", (String) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("from_rn", access14000.onNavigationEvent(true))), 4, (DefaultConstructorMarker) null));
            if (downloadzipOnExtraCallbackWithResult != null) {
                int i4 = IAuthTabCallback + 119;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, new Object[]{downloadzipOnExtraCallbackWithResult}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
            } else {
                if (mapOnExtraCallbackWithResult.get("event") == null) {
                    throw new IllegalArgumentException("event should not be null, data={" + this.$parameter + "}");
                }
                int i6 = IAuthTabCallback + 115;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final void onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 89;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = onRelationshipValidationResult + 83;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 43;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStubProxy().onExtraCallbackWithResult("visibilityChanged", Boolean.valueOf(z));
            int i3 = 27 / 0;
        } else {
            ICustomTabsCallbackStubProxy().onExtraCallbackWithResult("visibilityChanged", Boolean.valueOf(z));
        }
        int i4 = ICustomTabsCallbackStub + 121;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onMinimized;
        if (cArr2 != null) {
            int i3 = $11 + 123;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), View.MeasureSpec.getMode(0) + 77, 20952 - TextUtils.getOffsetBefore("", 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onMessageChannelReady)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 75 - TextUtils.getCapsMode("", 0, 0), 16037 - TextUtils.indexOf("", "", 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onPostMessage) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 62 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Process.getGidForName("") + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onActivityResized) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                int i6 = $10 + 103;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i8 = $11 + 89;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $11 + 31;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] * iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 62, Color.rgb(0, 0, 0) + 16789430, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 62 - ExpandableListView.getPackedPositionChild(j), 12215 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            j = 0;
        }
        objArr[0] = new String(cArr6);
    }

    public void onExtraCallbackWithResult(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Function1<? super Object[], Unit> function1, @NotNull Function1<? super RectListDebuggerModifierElement, Unit> function12) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 63;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            onRelationshipValidationResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        findResAndMsg findresandmsgOnRelationshipValidationResult = onRelationshipValidationResult();
        if (findresandmsgOnRelationshipValidationResult != null) {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsgOnRelationshipValidationResult, new IAuthTabCallbackDefault(CoroutineExceptionHandler.extraCallbackWithResult, function12), (setRandomHost) null, new asInterface(readableMap, str, this, function1, function12, (access13800) null), 2, (Object) null);
        }
        int i3 = ICustomTabsCallbackStub + 23;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char[] onNavigationEvent = {27257, 27198, 27181, 27150, 27166, 27197, 27199, 27183, 27150, 27148, 27335, 27484, 27474, 27473, 27468, 27310, 27312, 27503, 27480, 27463, 27461, 27500, 27495, 27314, 27325, 27474, 27472, 27323, 27316, 27503, 27498, 27315, 27325, 27472, 27472, 27478, 27475, 27479, 27482, 27476, 27477};
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $encrypted;
        final /* synthetic */ ReadableMap $headerMap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(ReadableMap readableMap, String str, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$headerMap = readableMap;
            this.$encrypted = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$headerMap, this.$encrypted, access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            char c;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = onNavigationEvent;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 35284), 35 - (ViewConfiguration.getFadingEdgeLength() >> 16), 14238 - MotionEvent.axisFromString(""), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr2, i2, cArr4, 0, i3);
            if (bArr != null) {
                int i7 = $10 + 51;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                    c = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i8 = $10 + 77;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 10935), ((byte) KeyEvent.getModifierMetaStateMask()) + 66, 16718 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 29 - View.MeasureSpec.getMode(0), 17658 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 70, KeyEvent.keyCodeFromString("") + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                int i12 = $11 + 25;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    char[] cArr5 = new char[i3];
                    System.arraycopy(cArr4, 0, cArr5, 1, i3);
                    System.arraycopy(cArr5, 0, cArr4, i3 << i5, i5);
                    System.arraycopy(cArr5, i5, cArr4, 0, i3 + i5);
                } else {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr4, 0, cArr6, 0, i3);
                    int i13 = i3 - i5;
                    System.arraycopy(cArr6, 0, cArr4, i13, i5);
                    System.arraycopy(cArr6, i5, cArr4, 0, i13);
                }
            }
            if (z) {
                char[] cArr7 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    int i14 = $10 + 1;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                }
                cArr4 = cArr7;
            }
            if (i4 > 0) {
                int i16 = $10 + 107;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ReadableMap readableMap = this.$headerMap;
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[1];
            a(new int[]{0, 10, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 1, 1}, objArr);
            String lowerCase = ((String) objArr[0]).intern().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String string = readableMap.getString(lowerCase);
            if (string == null) {
                int i3 = IAuthTabCallback + 121;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                string = "";
            }
            h1.onExtraCallbackWithResult onextracallbackwithresult = h1.Companion;
            ReadableMap readableMap2 = this.$headerMap;
            String lowerCase2 = "X-Toss-Content-Encoding".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            h1 h1VarOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted(readableMap2.getString(lowerCase2));
            if (h1VarOnWarmupCompleted == null) {
                return this.$encrypted;
            }
            RemoteWorkManager remoteWorkManager = RemoteWorkManager.onWarmupCompleted;
            if (!remoteWorkManager.IAuthTabCallback_Parcel()) {
                int i5 = onWarmupCompleted + 41;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a(new int[]{10, 31, 179, 0}, false, new byte[]{0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1}, objArr2);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "TossModule", ((String) objArr2[0]).intern(), (Throwable) null, (Map) null, 12, (Object) null);
                return this.$encrypted;
            }
            String interfaceDescriptor = remoteWorkManager.getInterfaceDescriptor();
            String strIAuthTabCallbackStub = remoteWorkManager.IAuthTabCallbackStub();
            String str = this.$encrypted;
            try {
                Result.Companion companion = Result.Companion;
                Object[] objArr3 = {remoteWorkManager, new DiagnosticsWorker(str, TTBaseLandingPageActivity.Companion.onExtraCallbackWithResult(string), buildLoadAdConfig.onExtraCallbackWithResult(h1VarOnWarmupCompleted)), interfaceDescriptor, strIAuthTabCallbackStub};
                return (String) RemoteWorkManager.onExtraCallbackWithResult(-1131521150, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1131521153, objArr3, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
                if (th2 != null) {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossModule", "__td", th2, (Map) null, 8, (Object) null);
                }
                String str2 = this.$encrypted;
                int i7 = IAuthTabCallback + 35;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    return str2;
                }
                throw null;
            }
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends WritableNativeMap>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static char[] onExtraCallbackWithResult = {64963, 64962, 64960, 64988, 64926, 65003, 64999, 64989, 64965};
        private static char onNavigationEvent = 51242;
        private static int onWarmupCompleted;
        final /* synthetic */ String $plain;
        int label;
        final /* synthetic */ TossModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, TossModule tossModule, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$plain = str;
            this.this$0 = tossModule;
        }

        public static /* synthetic */ CharSequence onNavigationEvent(h1 h1Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(h1Var);
            if (i3 == 0) {
                int i4 = 0 / 0;
            }
            return charSequenceOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$plain, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Pair<String, WritableNativeMap>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            RemoteWorkManager remoteWorkManager = RemoteWorkManager.onWarmupCompleted;
            String interfaceDescriptor = remoteWorkManager.getInterfaceDescriptor();
            DiagnosticsWorker diagnosticsWorkerOnExtraCallbackWithResult = remoteWorkManager.onExtraCallbackWithResult(AudienceNetworkActivity.onExtraCallbackWithResult(AudienceNetworkActivity.onExtraCallbackWithResult, this.$plain, interfaceDescriptor, true, (String) null, (String) null, (String) null, 56, (Object) null), interfaceDescriptor, remoteWorkManager.IAuthTabCallbackStub());
            String strOnWarmupCompleted = diagnosticsWorkerOnExtraCallbackWithResult.onWarmupCompleted();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            TossModule tossModule = this.this$0;
            Object[] objArr = new Object[1];
            a(new char[]{3, 5, 0, 6, 13809, 13809, 3, 7, 0, 1}, (byte) (Color.argb(0, 0, 0, 0) + 8), 9 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
            writableNativeMap.putString(((String) objArr[0]).intern(), interfaceDescriptor);
            Object[] objArr2 = new Object[1];
            a(new char[]{3, 5, 0, 6, 13822, 13822, 3, 7, 1, '\b'}, (byte) (22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), MotionEvent.axisFromString("") + 11, objArr2);
            writableNativeMap.putString(((String) objArr2[0]).intern(), diagnosticsWorkerOnExtraCallbackWithResult.onExtraCallback().asInterface());
            writableNativeMap.putString("X-Toss-Content-Encoding", buildLoadAdConfig.onNavigationEvent(diagnosticsWorkerOnExtraCallbackWithResult.IAuthTabCallback()).getValue());
            Object objIAuthTabCallbackDefault$21541b0a = TossModule.IAuthTabCallbackDefault$21541b0a(tossModule);
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-702979868);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23096 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, 11038 - (ViewConfiguration.getTouchSlop() >> 8), -413557132, false, "IAuthTabCallback", new Class[0]);
                }
                String strJoinToString$default = (String) ((Method) objOnExtraCallback).invoke(objIAuthTabCallbackDefault$21541b0a, null);
                if (strJoinToString$default == null) {
                    strJoinToString$default = CollectionsKt.joinToString$default(h1.getEntries(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new TossModule$__te$2$.ExternalSyntheticLambda0(), 30, (Object) null);
                }
                writableNativeMap.putString("X-Toss-Accept-Encoding", strJoinToString$default);
                Object objAsBinder$78832dd2 = TossModule.asBinder$78832dd2(tossModule);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1203654317);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 15 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 10990, -1996402749, false, "onWarmupCompleted", new Class[0]);
                }
                int i4 = IAuthTabCallback + 27;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                for (Map.Entry entry : ((Map) ((Method) objOnExtraCallback2).invoke(objAsBinder$78832dd2, null)).entrySet()) {
                    writableNativeMap.putString((String) entry.getKey(), (String) entry.getValue());
                }
                if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
                    writableNativeMap.putString("User-Agent", zzaj.onNavigationEvent().access100());
                    writableNativeMap.putString("X-Toss-Alpha-Token", AlphaEnvironmentAccessTokenProvider.IAuthTabCallback.onNavigationEvent());
                    int i6 = IAuthTabCallback + 67;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 4 % 2;
                    }
                }
                return new Pair(strOnWarmupCompleted, writableNativeMap);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            long j = 0;
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
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(j), TextUtils.indexOf("", "") + 26, 23139 - TextUtils.getOffsetAfter("", 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                int i5 = $11 + 97;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 25 - MotionEvent.axisFromString(""), View.getDefaultSize(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i7 = $11 + 87;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16752392) - Color.rgb(0, 0, 0)), 74 - Color.alpha(0), 8088 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 30 - Drawable.resolveOpacity(0, 0), 19488 - (Process.myPid() >> 22), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            } else {
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i14 = $10 + 105;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            for (int i16 = 0; i16 < i; i16++) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        private static final CharSequence onWarmupCompleted(h1 h1Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String value = h1Var.getValue();
            int i4 = IAuthTabCallback + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return value;
        }
    }

    private final Object onWarmupCompleted(String str, boolean z, access13800<? super Pair<String, WritableNativeMap>> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onExtraCallback(str, this, null), access13800Var);
        int i2 = ICustomTabsCallbackStub + 43;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final Object IAuthTabCallback(String str, ReadableMap readableMap, access13800<? super String> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new IAuthTabCallback(readableMap, str, null), access13800Var);
        int i2 = onRelationshipValidationResult + 57;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    public void IAuthTabCallback(@NotNull ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 19;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(readableMap, "");
        findResAndMsg findresandmsgOnRelationshipValidationResult = onRelationshipValidationResult();
        if (findresandmsgOnRelationshipValidationResult != null) {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsgOnRelationshipValidationResult, (CoroutineContext) null, (setRandomHost) null, new asBinder(readableMap, this, null), 3, (Object) null);
            int i4 = onRelationshipValidationResult + 19;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.ResourceIdCache */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull ReadableMap readableMap, @NotNull access13800<? super Unit> access13800Var) throws ResourceIdCache {
        String string;
        Map mapOnNavigationEvent;
        ReadableMap map;
        int i;
        KClass orCreateKotlinClass;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        ReadableMap readableMap2 = null;
        a(null, null, new byte[]{-113, -112, -113, -114}, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Class cls = Double.TYPE;
        Class cls2 = Float.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        try {
            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        } catch (Exception unused) {
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls4))) {
            int i3 = ICustomTabsCallbackStub + 45;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            readableMap.getBoolean("domain");
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls3))) {
            readableMap.getInt("domain");
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
            readableMap.getDouble("domain");
            int i5 = onRelationshipValidationResult + 117;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        } else {
            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    string = readableMap.getString("domain");
                    if (string == null) {
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(ReadableArray.class))) {
                    ReadableArray array = readableMap.getArray("domain");
                    if (!(array instanceof String)) {
                        array = null;
                    }
                    string = (String) array;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(ReadableMap.class))) {
                    int i7 = onRelationshipValidationResult + 7;
                    ICustomTabsCallbackStub = i7 % 128;
                    if (i7 % 2 == 0) {
                        boolean z = readableMap.getMap("domain") instanceof String;
                        readableMap2.hashCode();
                        throw null;
                    }
                    ReadableMap map2 = readableMap.getMap("domain");
                    if (!(map2 instanceof String)) {
                        map2 = null;
                    }
                    string = (String) map2;
                }
                if (string != null) {
                    int i8 = onRelationshipValidationResult + 3;
                    ICustomTabsCallbackStub = i8 % 128;
                    if (i8 % 2 == 0) {
                        StringsKt.isBlank(string);
                        throw null;
                    }
                    String str = StringsKt.isBlank(string) ? null : string;
                    if (str != null) {
                        try {
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(ReadableMap.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls4))) {
                                readableMap.getBoolean(strIntern);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls3))) {
                                int i9 = onRelationshipValidationResult + 39;
                                ICustomTabsCallbackStub = i9 % 128;
                                if (i9 % 2 == 0) {
                                    readableMap.getInt(strIntern);
                                    throw null;
                                }
                                readableMap.getInt(strIntern);
                            } else {
                                if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls2))) {
                                    readableMap.getDouble(strIntern);
                                    i = onRelationshipValidationResult + 103;
                                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls))) {
                                    readableMap.getDouble(strIntern);
                                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                                    int i10 = ICustomTabsCallbackStub + 45;
                                    onRelationshipValidationResult = i10 % 128;
                                    int i11 = i10 % 2;
                                    readableMap.getString(strIntern);
                                } else {
                                    if (!(!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(ReadableArray.class)))) {
                                        ReadableArray array2 = readableMap.getArray(strIntern);
                                        if (!(array2 instanceof ReadableMap)) {
                                            int i12 = onRelationshipValidationResult + 61;
                                            ICustomTabsCallbackStub = i12 % 128;
                                            int i13 = i12 % 2;
                                            array2 = null;
                                        }
                                        map = (ReadableMap) array2;
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(ReadableMap.class))) {
                                        map = readableMap.getMap(strIntern);
                                        if (map == null) {
                                            i = onRelationshipValidationResult + 99;
                                        }
                                    }
                                    readableMap2 = map;
                                }
                                ICustomTabsCallbackStub = i % 128;
                                int i14 = i % 2;
                            }
                        } catch (Exception unused2) {
                        }
                        if (readableMap2 == null || (mapOnNavigationEvent = r8lambdaKQljdHbnTh3WKvdWuw6pSds3WQ.onExtraCallbackWithResult(readableMap2)) == null) {
                            mapOnNavigationEvent = access8100.onNavigationEvent();
                        }
                        GetInputImageFromPath.onExtraCallback(GetInputImageFromPath.onExtraCallbackWithResult, str, mapOnNavigationEvent, false, 4, (Object) null);
                        return Unit.INSTANCE;
                    }
                }
                throw ((ResourceIdCache) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1159485426, new Object[]{this}, -1159485422, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()));
            }
            readableMap.getDouble("domain");
        }
        string = null;
        if (string != null) {
        }
        throw ((ResourceIdCache) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1159485426, new Object[]{this}, -1159485422, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()));
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-115, -116, -119, -117, -118, -119, -120, -121, -122, -127, -123, -124, -125, -126, -127}, 127 - KeyEvent.normalizeMetaState(0), objArr2);
        ResourceIdCache resourceIdCache = new ResourceIdCache("Invalid request", ((String) objArr2[0]).intern());
        int i2 = onRelationshipValidationResult + 77;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return resourceIdCache;
        }
        throw null;
    }

    public void onExtraCallback(@NotNull String str) {
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact;
        String strOnExtraCallbackWithResult;
        FragmentActivity activity;
        transFinalize transfinalize;
        MaxFullscreenAdImplb maxFullscreenAdImplb;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TossReactContentOwner tossReactContentOwnerICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        String strIAuthTabCallbackDefault = null;
        if (tossReactContentOwnerICustomTabsCallbackDefault != null) {
            int i2 = ICustomTabsCallbackStub + 11;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = tossReactContentOwnerICustomTabsCallbackDefault.onTransact();
            int i4 = onRelationshipValidationResult + 39;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = null;
        }
        if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact == null || (strOnExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact.onExtraCallbackWithResult()) == null) {
            strOnExtraCallbackWithResult = "";
        }
        TossReactContentOwner tossReactContentOwner = this.ICustomTabsCallback.get();
        if (tossReactContentOwner != null) {
            int i6 = onRelationshipValidationResult + 103;
            ICustomTabsCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                activity = tossReactContentOwner.getActivity();
                int i7 = 61 / 0;
            } else {
                activity = tossReactContentOwner.getActivity();
            }
        } else {
            int i8 = ICustomTabsCallbackStub + 65;
            onRelationshipValidationResult = i8 % 128;
            int i9 = i8 % 2;
            activity = null;
        }
        if (activity instanceof transFinalize) {
            int i10 = ICustomTabsCallbackStub + 99;
            onRelationshipValidationResult = i10 % 128;
            int i11 = i10 % 2;
            transfinalize = (transFinalize) activity;
        } else {
            transfinalize = null;
        }
        logicVerifyID typedObject = transfinalize != null ? transfinalize.readTypedObject() : null;
        if (typedObject instanceof MaxFullscreenAdImplb) {
            int i12 = onRelationshipValidationResult + 25;
            ICustomTabsCallbackStub = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            maxFullscreenAdImplb = (MaxFullscreenAdImplb) typedObject;
        } else {
            maxFullscreenAdImplb = null;
        }
        String strOnExtraCallbackWithResult2 = maxFullscreenAdImplb != null ? maxFullscreenAdImplb.onExtraCallbackWithResult() : null;
        if (strOnExtraCallbackWithResult2 == null) {
            strOnExtraCallbackWithResult2 = "";
        }
        if (maxFullscreenAdImplb != null) {
            int i13 = onRelationshipValidationResult + 35;
            ICustomTabsCallbackStub = i13 % 128;
            if (i13 % 2 == 0) {
                strIAuthTabCallbackDefault = maxFullscreenAdImplb.IAuthTabCallbackDefault();
                int i14 = 21 / 0;
            } else {
                strIAuthTabCallbackDefault = maxFullscreenAdImplb.IAuthTabCallbackDefault();
            }
        }
        onWarmupCompleted(str, strOnExtraCallbackWithResult, strIAuthTabCallbackDefault != null ? strIAuthTabCallbackDefault : "", strOnExtraCallbackWithResult2);
    }

    private final void onWarmupCompleted(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 5;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        auth.onNavigationEvent.onExtraCallbackWithResult(str, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("moduleName", str2), getWrite.IAuthTabCallback("serviceDeploymentId", str3), getWrite.IAuthTabCallback("sharedDeploymentId", str4)}), auth.onExtraCallbackWithResult.LOG);
        int i4 = ICustomTabsCallbackStub + 13;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a3, code lost:
    
        r4 = r3;
        r3 = r8;
        r8 = ICustomTabsCallbackDefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a9, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
    
        r5 = im.toss.rn.toss.core.TossModule.ICustomTabsCallbackStub + 97;
        im.toss.rn.toss.core.TossModule.onRelationshipValidationResult = r5 % 128;
        r5 = r5 % 2;
        r5 = r8.IAuthTabCallbackDefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        r1 = r5.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00be, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        return o.ALCPreviewView.onExtraCallbackWithResult.onExtraCallbackWithResult(r19, r3, r4, r5, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005c, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0097, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0099, code lost:
    
        r2 = im.toss.rn.toss.core.TossModule.ICustomTabsCallbackStub + 7;
        im.toss.rn.toss.core.TossModule.onRelationshipValidationResult = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        ALCLiveness aLCLivenessOnWarmupCompleted;
        drawTextBox drawtextbox;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 37;
        onRelationshipValidationResult = i2 % 128;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            aLCLivenessOnWarmupCompleted = onUnminimized().onWarmupCompleted(str);
            Object[] objArr = {this.onActivityLayout, str, false, 5, null};
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            aLCLivenessOnWarmupCompleted = onUnminimized().onWarmupCompleted(str);
            Object[] objArr2 = {this.onActivityLayout, str, false, 2, null};
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, objArr2, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2);
        }
    }

    public final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 87;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {ICustomTabsCallbackStubProxy()};
        if (i3 == 0) {
            MaxFullscreenAdImplExternalSyntheticLambda5.onNavigationEvent(-1578547521, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1578547523, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
        } else {
            MaxFullscreenAdImplExternalSyntheticLambda5.onNavigationEvent(-1578547521, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1578547523, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TossModule tossModule = (TossModule) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 17;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        tossModule.ICustomTabsCallbackStubProxy().onExtraCallback();
        int i4 = ICustomTabsCallbackStub + 79;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onExtraCallback(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 63;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ICustomTabsCallbackStubProxy().onWarmupCompleted("visibilityChangedByTransparentServiceWeb", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("callbackId", str), getWrite.IAuthTabCallback("isVisible", Boolean.valueOf(z))}));
        int i4 = onRelationshipValidationResult + 79;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
    }

    public final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 23;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStubProxy().onExtraCallback("presentTransitionEnd", access8100.onNavigationEvent());
        int i4 = onRelationshipValidationResult + 59;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 57;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStubProxy().onExtraCallback("dismiss", access8100.onNavigationEvent());
        int i4 = onRelationshipValidationResult + 33;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 83;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        IAuthTabCallback("geolocationUpdated", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("lat", str), getWrite.IAuthTabCallback("lon", str2), getWrite.IAuthTabCallback("degrees", str3)}));
        int i4 = onRelationshipValidationResult + 87;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable Map<?, ?> map) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 33;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5ICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-109, -110, -113, -111}, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str);
        if (map == null) {
            int i4 = ICustomTabsCallbackStub + 125;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            map = access8100.onNavigationEvent();
        }
        maxFullscreenAdImplExternalSyntheticLambda5ICustomTabsCallbackStubProxy.onWarmupCompleted("appBridgeCallback", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("params", map)}));
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull JsonElement jsonElement) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 103;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Object objOnWarmupCompleted = ReactNativeJsBridgeKt.onWarmupCompleted(jsonElement, "TossModule", (Map<String, ? extends Object>) access8100.onNavigationEvent(getWrite.IAuthTabCallback("eventName", str)));
        MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5ICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-109, -110, -113, -111}, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        maxFullscreenAdImplExternalSyntheticLambda5ICustomTabsCallbackStubProxy.onWarmupCompleted("appBridgeCallback", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback("params", objOnWarmupCompleted)}));
        int i4 = onRelationshipValidationResult + 121;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r6 = new java.lang.Object[]{r10, "androidLifecycleChanged", new im.toss.rn.toss.core.TossModule$$ExternalSyntheticLambda5(r10, r11)};
        onWarmupCompleted(im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1681406686, r6, 1681406696, im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        r11 = im.toss.rn.toss.core.TossModule.onRelationshipValidationResult + 75;
        im.toss.rn.toss.core.TossModule.ICustomTabsCallbackStub = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, "onDestroy") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, "onDestroy") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        ICustomTabsCallbackStubProxy().onNavigationEvent("androidLifecycleChanged", o.access8100.onNavigationEvent(o.getWrite.IAuthTabCallback("status", r11)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull final String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 93;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 21 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    private static final Unit onExtraCallbackWithResult(TossModule tossModule, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 51;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        tossModule.ICustomTabsCallbackStubProxy().onWarmupCompleted("androidLifecycleChanged", access8100.onNavigationEvent(getWrite.IAuthTabCallback("status", str)));
        Unit unit = Unit.INSTANCE;
        int i4 = onRelationshipValidationResult + 27;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 27;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted("onDestroy");
        int i4 = onRelationshipValidationResult + 107;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 77;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultICustomTabsService = ICustomTabsService();
        if (onextracallbackwithresultICustomTabsService != null) {
            if (onextracallbackwithresultICustomTabsService.IAuthTabCallback().getLifecycle().IAuthTabCallback() == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED || onextracallbackwithresultICustomTabsService.onExtraCallback().isFinishing() || onextracallbackwithresultICustomTabsService.onExtraCallback().isDestroyed()) {
                return false;
            }
            int i4 = ICustomTabsCallbackStub + 61;
            onRelationshipValidationResult = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = ICustomTabsCallbackStub + 13;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private final boolean mayLaunchUrl() {
        int i = 2 % 2;
        if (ICustomTabsService() != null) {
            int i2 = ICustomTabsCallbackStub + 41;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = ICustomTabsCallbackStub + 113;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final onExtraCallbackWithResult ICustomTabsService() {
        WrappedCompositionsetContent1ExternalSyntheticLambda0 activity;
        int i = 2 % 2;
        WrappedCompositionsetContent1ExternalSyntheticLambda0 wrappedCompositionsetContent1ExternalSyntheticLambda0ICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        if (wrappedCompositionsetContent1ExternalSyntheticLambda0ICustomTabsCallbackDefault == null || (activity = wrappedCompositionsetContent1ExternalSyntheticLambda0ICustomTabsCallbackDefault.getActivity()) == null) {
            return null;
        }
        WrappedCompositionsetContent1ExternalSyntheticLambda0 currentActivity = bj_().getCurrentActivity();
        if (currentActivity != null) {
            int i2 = ICustomTabsCallbackStub + 105;
            int i3 = i2 % 128;
            onRelationshipValidationResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (currentActivity != activity) {
                int i4 = i3 + 105;
                ICustomTabsCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 50 / 0;
                }
                return null;
            }
        }
        WrappedCompositionsetContent1ExternalSyntheticLambda0 wrappedCompositionsetContent1ExternalSyntheticLambda0 = wrappedCompositionsetContent1ExternalSyntheticLambda0ICustomTabsCallbackDefault instanceof WrappedCompositionsetContent1ExternalSyntheticLambda0 ? wrappedCompositionsetContent1ExternalSyntheticLambda0ICustomTabsCallbackDefault : null;
        if (wrappedCompositionsetContent1ExternalSyntheticLambda0 == null) {
            wrappedCompositionsetContent1ExternalSyntheticLambda0 = activity instanceof WrappedCompositionsetContent1ExternalSyntheticLambda0 ? activity : null;
            if (wrappedCompositionsetContent1ExternalSyntheticLambda0 == null) {
                return null;
            }
        }
        if (wrappedCompositionsetContent1ExternalSyntheticLambda0.onExtraCallbackWithResult().IAuthTabCallback(onNavigationEvent()) == this) {
            return new onExtraCallbackWithResult(wrappedCompositionsetContent1ExternalSyntheticLambda0ICustomTabsCallbackDefault, activity);
        }
        int i6 = ICustomTabsCallbackStub + 71;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final Activity onExtraCallbackWithResult;
        private final TossReactContentOwner onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 103;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i4 = onExtraCallback + 99;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                return Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult);
            }
            int i6 = onExtraCallback + 105;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.onNavigationEvent.hashCode() / 67) % this.onExtraCallbackWithResult.hashCode() : (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
            int i3 = onWarmupCompleted + 107;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EventEmitterOwnerRegistration(owner=" + this.onNavigationEvent + ", activity=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@NotNull TossReactContentOwner tossReactContentOwner, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(tossReactContentOwner, "");
            Intrinsics.checkNotNullParameter(activity, "");
            this.onNavigationEvent = tossReactContentOwner;
            this.onExtraCallbackWithResult = activity;
        }

        public final TossReactContentOwner IAuthTabCallback() {
            TossReactContentOwner tossReactContentOwner;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 67;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                tossReactContentOwner = this.onNavigationEvent;
                int i4 = 15 / 0;
            } else {
                tossReactContentOwner = this.onNavigationEvent;
            }
            int i5 = i2 + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return tossReactContentOwner;
        }

        public final Activity onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Activity activity = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                int i4 = 27 / 0;
            }
            return activity;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossModule tossModule) {
        return (Unit) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 569049211, new Object[]{tossModule}, -569049203, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static /* synthetic */ r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE writeTypedObject() {
        return (r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 164704516, new Object[0], -164704511, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onNavigationEvent(TossModule tossModule, String str) {
        return (Unit) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1342374658, new Object[]{tossModule, str}, 1342374667, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit asInterface(TossModule tossModule) {
        return (Unit) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1200245023, new Object[]{tossModule}, -1200245022, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ TossReactContentOwner access100(TossModule tossModule) {
        return (TossReactContentOwner) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1923746962, new Object[]{tossModule}, -1923746962, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE IAuthTabCallback_Parcel(TossModule tossModule) {
        return (r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1105490822, new Object[]{tossModule}, 1105490833, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private final ResourceIdCache ICustomTabsCallback_Parcel() {
        return (ResourceIdCache) onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1159485426, new Object[]{this}, -1159485422, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    private final void IAuthTabCallback(String str, Function0<Unit> function0) {
        onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1681406686, new Object[]{this, str, function0}, 1681406696, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public final void extraCallback() {
        onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1769724583, new Object[]{this}, -1769724580, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public final void IAuthTabCallback(@NotNull String str) {
        onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1911196623, new Object[]{this, str}, -1911196621, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    static void onPostMessage() {
        onMinimized = new char[]{32488, 32483, 32283, 32496, 32493, 32501, 32274, 32487, 32500, 32480, 32484, 32486, 32485, 32277, 32272, 32261, 32259, 32268, 32276, 32260, 32263, 32269};
        onMessageChannelReady = -1184334159;
        onActivityResized = true;
        onPostMessage = true;
    }
}
