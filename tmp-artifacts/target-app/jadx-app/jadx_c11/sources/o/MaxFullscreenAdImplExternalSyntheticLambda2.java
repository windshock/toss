package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.observability.instrumentation.rn.RnBundleInfo;
import im.toss.observability.instrumentation.rn.RnCause;
import im.toss.rn.toss.core.ReactSchemeActivity;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImplExternalSyntheticLambda2 extends Role implements AnnotatedStringKtExternalSyntheticLambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static long IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact = 1;
    private final WeakReference<Activity> IAuthTabCallback;
    private boolean asBinder;
    private final access6900<Map<String, Object>> onExtraCallback;
    private final onInterstitialAdDisplayFailed onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private final String onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = MaxFullscreenAdImplExternalSyntheticLambda2.this.onExtraCallbackWithResult((access13800<? super Unit>) this);
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class asBinder<T> extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = MaxFullscreenAdImplExternalSyntheticLambda2.onExtraCallbackWithResult(MaxFullscreenAdImplExternalSyntheticLambda2.this, null, this);
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    static final class asInterface extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = MaxFullscreenAdImplExternalSyntheticLambda2.this.onExtraCallback((AnnotatedStringKtExternalSyntheticLambda3) null, (access13800<? super JvmAnnotatedString_jvmAndAndroidKtExternalSyntheticLambda0>) this);
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return objOnExtraCallback;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = MaxFullscreenAdImplExternalSyntheticLambda2.this.IAuthTabCallback((String) null, (access13800<? super Unit>) this);
            int i4 = onNavigationEvent + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    public interface onWarmupCompleted {
        RnPhaseObserver ComponentActivityExternalSyntheticLambda0();
    }

    static {
        IAuthTabCallback();
        Companion = new onExtraCallbackWithResult(null);
        int i = onTransact + 3;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = (~(i2 | i5)) | i8;
        int i10 = (~(i5 | (~i6))) | (~((~i2) | i7)) | i8;
        int i11 = i7 | i2 | i6;
        int i12 = i2 + i6 + i3 + (1050315579 * i4) + (2086215248 * i);
        int i13 = i12 * i12;
        int i14 = (i2 * (-1156115713)) + 1671168000 + ((-1156115713) * i6) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i3) + ((-1303117824) * i4) + (314572800 * i) + (431423488 * i13);
        int i15 = ((i2 * (-961373039)) - 1316831794) + (i6 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i3 * (-961372049)) + (i4 * 755842709) + (i * (-1858722640)) + (i13 * (-2040987648));
        return i14 + ((i15 * i15) * 1361641472) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxFullscreenAdImplExternalSyntheticLambda2(@NotNull ReactContext reactContext, @Nullable WeakReference<Activity> weakReference, @Nullable onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "");
        this.IAuthTabCallback = weakReference;
        this.onExtraCallbackWithResult = oninterstitialaddisplayfailed;
        this.onWarmupCompleted = "TossBundleLoader";
        this.onNavigationEvent = new Object();
        this.onExtraCallback = new access6900<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda2(ReactContext reactContext, WeakReference weakReference, onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 87;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            oninterstitialaddisplayfailed = null;
        }
        this(reactContext, weakReference, oninterstitialaddisplayfailed);
    }

    public static final /* synthetic */ RnPhaseObserver onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{maxFullscreenAdImplExternalSyntheticLambda2}, -208413610, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, 208413610);
        int i4 = getInterfaceDescriptor + 87;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return rnPhaseObserver;
    }

    public static final /* synthetic */ ReactContext onExtraCallbackWithResult(MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ReactContext reactContextBj_ = maxFullscreenAdImplExternalSyntheticLambda2.bj_();
        int i4 = asInterface + 53;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return reactContextBj_;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2, Function1 function1, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = maxFullscreenAdImplExternalSyntheticLambda2.onNavigationEvent(function1, access13800Var);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        int i5 = getInterfaceDescriptor + 123;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ WeakReference onNavigationEvent(MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 35;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        WeakReference<Activity> weakReference = maxFullscreenAdImplExternalSyntheticLambda2.IAuthTabCallback;
        if (i4 != 0) {
            int i5 = 19 / 0;
        }
        int i6 = i2 + 111;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return weakReference;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    public final boolean onExtraCallbackWithResult() {
        boolean z;
        synchronized (this.onNavigationEvent) {
            z = this.asBinder;
        }
        return z && bj_().hasActiveReactInstance();
    }

    private final RnPhaseObserver asBinder() {
        RnPhaseObserver rnPhaseObserverComponentActivityExternalSyntheticLambda0;
        int i = 2 % 2;
        int i2 = asInterface + 83;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Context applicationContext = bj_().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            rnPhaseObserverComponentActivityExternalSyntheticLambda0 = ((onWarmupCompleted) Response.onExtraCallback(applicationContext, onWarmupCompleted.class)).ComponentActivityExternalSyntheticLambda0();
            int i3 = 5 / 0;
        } else {
            Context applicationContext2 = bj_().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            rnPhaseObserverComponentActivityExternalSyntheticLambda0 = ((onWarmupCompleted) Response.onExtraCallback(applicationContext2, onWarmupCompleted.class)).ComponentActivityExternalSyntheticLambda0();
        }
        int i4 = asInterface + 63;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return rnPhaseObserverComponentActivityExternalSyntheticLambda0;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj;
        MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2 = (MaxFullscreenAdImplExternalSyntheticLambda2) objArr[0];
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(maxFullscreenAdImplExternalSyntheticLambda2.asBinder());
            int i2 = asInterface + 35;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i4 = asInterface + 39;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        return (RnPhaseObserver) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r13 != r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> Object onNavigationEvent(Function1<? super access13800<? super T>, ? extends Object> function1, access13800<? super T> access13800Var) {
        asBinder asbinder;
        Object objInvoke;
        int i = 2 % 2;
        int i2 = asInterface + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = access13800Var instanceof asBinder;
            throw null;
        }
        if (!(access13800Var instanceof asBinder)) {
            asbinder = new asBinder(access13800Var);
        } else {
            asbinder = (asBinder) access13800Var;
            int i3 = asbinder.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                asbinder.label = i3 - 2147483648;
            }
        }
        Object objIAuthTabCallback = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = asbinder.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this}, -208413610, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 208413610);
            if (rnPhaseObserver != null) {
                asbinder.L$0 = function1;
                asbinder.label = 1;
                objIAuthTabCallback = rnPhaseObserver.IAuthTabCallback((Function1) function1, (access13800) asbinder);
            } else {
                asbinder.L$0 = access15400.onNavigationEvent(function1);
                asbinder.label = 2;
                objInvoke = function1.invoke(asbinder);
                if (objInvoke != objOnWarmupCompleted) {
                    int i5 = asInterface + 85;
                    getInterfaceDescriptor = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 31 / 0;
                    }
                    return objInvoke;
                }
            }
            return objOnWarmupCompleted;
        }
        int i7 = asInterface;
        int i8 = i7 + 67;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 != 0 ? i4 != 1 : i4 != 1) {
            int i9 = i7 + 5;
            getInterfaceDescriptor = i9 % 128;
            if (i9 % 2 != 0 ? i4 != 2 : i4 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            return objIAuthTabCallback;
        }
        function1 = (Function1) asbinder.L$0;
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        if (objIAuthTabCallback != null) {
            return objIAuthTabCallback;
        }
        asbinder.L$0 = access15400.onNavigationEvent(function1);
        asbinder.label = 2;
        objInvoke = function1.invoke(asbinder);
        if (objInvoke != objOnWarmupCompleted) {
        }
        return objOnWarmupCompleted;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 11;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 19627 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackDefault ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 58 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getTouchSlop() >> 8) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), TextUtils.getOffsetAfter("", 0) + 59, MotionEvent.axisFromString("") + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d2 A[Catch: Exception -> 0x0418, CancellationException -> 0x041c, WebResourceResponseModel -> 0x0420, TryCatch #2 {CancellationException -> 0x041c, blocks: (B:141:0x03cc, B:143:0x03d2, B:144:0x03da, B:175:0x044b, B:177:0x0451, B:178:0x0460, B:188:0x0471, B:190:0x0477, B:191:0x0483, B:31:0x00bf, B:33:0x00e9, B:45:0x010c, B:49:0x0115, B:52:0x014b, B:54:0x0167, B:57:0x0187, B:61:0x01a0, B:71:0x01ba, B:73:0x01e7, B:76:0x0207, B:94:0x0231, B:96:0x0237, B:99:0x0247, B:102:0x0282, B:108:0x02c2, B:111:0x02c9, B:114:0x02d7, B:118:0x02e6, B:120:0x030d, B:107:0x02b8, B:98:0x023d, B:207:0x049f, B:208:0x04c2, B:62:0x01a9, B:64:0x01b1, B:65:0x01b4, B:51:0x0147, B:220:0x04da, B:221:0x04fd), top: B:255:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0451 A[Catch: CancellationException -> 0x041c, Exception -> 0x0461, WebResourceResponseModel -> 0x0466, TryCatch #2 {CancellationException -> 0x041c, blocks: (B:141:0x03cc, B:143:0x03d2, B:144:0x03da, B:175:0x044b, B:177:0x0451, B:178:0x0460, B:188:0x0471, B:190:0x0477, B:191:0x0483, B:31:0x00bf, B:33:0x00e9, B:45:0x010c, B:49:0x0115, B:52:0x014b, B:54:0x0167, B:57:0x0187, B:61:0x01a0, B:71:0x01ba, B:73:0x01e7, B:76:0x0207, B:94:0x0231, B:96:0x0237, B:99:0x0247, B:102:0x0282, B:108:0x02c2, B:111:0x02c9, B:114:0x02d7, B:118:0x02e6, B:120:0x030d, B:107:0x02b8, B:98:0x023d, B:207:0x049f, B:208:0x04c2, B:62:0x01a9, B:64:0x01b1, B:65:0x01b4, B:51:0x0147, B:220:0x04da, B:221:0x04fd), top: B:255:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0477 A[Catch: CancellationException -> 0x041c, Exception -> 0x0484, WebResourceResponseModel -> 0x048a, TryCatch #2 {CancellationException -> 0x041c, blocks: (B:141:0x03cc, B:143:0x03d2, B:144:0x03da, B:175:0x044b, B:177:0x0451, B:178:0x0460, B:188:0x0471, B:190:0x0477, B:191:0x0483, B:31:0x00bf, B:33:0x00e9, B:45:0x010c, B:49:0x0115, B:52:0x014b, B:54:0x0167, B:57:0x0187, B:61:0x01a0, B:71:0x01ba, B:73:0x01e7, B:76:0x0207, B:94:0x0231, B:96:0x0237, B:99:0x0247, B:102:0x0282, B:108:0x02c2, B:111:0x02c9, B:114:0x02d7, B:118:0x02e6, B:120:0x030d, B:107:0x02b8, B:98:0x023d, B:207:0x049f, B:208:0x04c2, B:62:0x01a9, B:64:0x01b1, B:65:0x01b4, B:51:0x0147, B:220:0x04da, B:221:0x04fd), top: B:255:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[Catch: CancellationException -> 0x041c, Exception -> 0x0461, WebResourceResponseModel -> 0x0466, SYNTHETIC, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x041c, blocks: (B:141:0x03cc, B:143:0x03d2, B:144:0x03da, B:175:0x044b, B:177:0x0451, B:178:0x0460, B:188:0x0471, B:190:0x0477, B:191:0x0483, B:31:0x00bf, B:33:0x00e9, B:45:0x010c, B:49:0x0115, B:52:0x014b, B:54:0x0167, B:57:0x0187, B:61:0x01a0, B:71:0x01ba, B:73:0x01e7, B:76:0x0207, B:94:0x0231, B:96:0x0237, B:99:0x0247, B:102:0x0282, B:108:0x02c2, B:111:0x02c9, B:114:0x02d7, B:118:0x02e6, B:120:0x030d, B:107:0x02b8, B:98:0x023d, B:207:0x049f, B:208:0x04c2, B:62:0x01a9, B:64:0x01b1, B:65:0x01b4, B:51:0x0147, B:220:0x04da, B:221:0x04fd), top: B:255:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[Catch: CancellationException -> 0x041c, Exception -> 0x0484, WebResourceResponseModel -> 0x048a, SYNTHETIC, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x041c, blocks: (B:141:0x03cc, B:143:0x03d2, B:144:0x03da, B:175:0x044b, B:177:0x0451, B:178:0x0460, B:188:0x0471, B:190:0x0477, B:191:0x0483, B:31:0x00bf, B:33:0x00e9, B:45:0x010c, B:49:0x0115, B:52:0x014b, B:54:0x0167, B:57:0x0187, B:61:0x01a0, B:71:0x01ba, B:73:0x01e7, B:76:0x0207, B:94:0x0231, B:96:0x0237, B:99:0x0247, B:102:0x0282, B:108:0x02c2, B:111:0x02c9, B:114:0x02d7, B:118:0x02e6, B:120:0x030d, B:107:0x02b8, B:98:0x023d, B:207:0x049f, B:208:0x04c2, B:62:0x01a9, B:64:0x01b1, B:65:0x01b4, B:51:0x0147, B:220:0x04da, B:221:0x04fd), top: B:255:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187 A[Catch: CancellationException -> 0x041c, Exception -> 0x0461, WebResourceResponseModel -> 0x0466, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x041c, blocks: (B:141:0x03cc, B:143:0x03d2, B:144:0x03da, B:175:0x044b, B:177:0x0451, B:178:0x0460, B:188:0x0471, B:190:0x0477, B:191:0x0483, B:31:0x00bf, B:33:0x00e9, B:45:0x010c, B:49:0x0115, B:52:0x014b, B:54:0x0167, B:57:0x0187, B:61:0x01a0, B:71:0x01ba, B:73:0x01e7, B:76:0x0207, B:94:0x0231, B:96:0x0237, B:99:0x0247, B:102:0x0282, B:108:0x02c2, B:111:0x02c9, B:114:0x02d7, B:118:0x02e6, B:120:0x030d, B:107:0x02b8, B:98:0x023d, B:207:0x049f, B:208:0x04c2, B:62:0x01a9, B:64:0x01b1, B:65:0x01b4, B:51:0x0147, B:220:0x04da, B:221:0x04fd), top: B:255:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0227  */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [im.toss.rn.toss.core.ReactSchemeActivity] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) throws Exception {
        IAuthTabCallback iAuthTabCallback;
        ReactSchemeActivity reactSchemeActivity;
        Ref.ObjectRef objectRef;
        Activity activity;
        Exception exc;
        Throwable th;
        Exception exc2;
        Throwable th2;
        transFinalize transfinalize;
        Exception exc3;
        Throwable th3;
        Map map;
        Object obj;
        MaxFullscreenAdImplb maxFullscreenAdImplb;
        Map<String, Object> mapOnNavigationEvent;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        RnBundleInfo rnBundleInfo;
        CancellationException cancellationException;
        String str2;
        Ref.ObjectRef objectRef2;
        Throwable th4;
        String str3;
        RnBundleInfo rnBundleInfo2;
        String str4;
        RnBundleInfo rnBundleInfo3;
        String simpleName;
        RnPhaseObserver rnPhaseObserverOnExtraCallback;
        RnPhaseObserver rnPhaseObserverOnExtraCallback2;
        Object obj5;
        Throwable th5;
        Activity activity2;
        RnPhaseObserver rnPhaseObserverOnExtraCallback3;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = asInterface + 23;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object obj6 = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback2.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj6);
                WeakReference<Activity> weakReference = this.IAuthTabCallback;
                Object obj7 = weakReference != null ? (Activity) weakReference.get() : null;
                if (obj7 instanceof ReactSchemeActivity) {
                    int i6 = getInterfaceDescriptor + 41;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    reactSchemeActivity = (ReactSchemeActivity) obj7;
                } else {
                    reactSchemeActivity = null;
                }
                if (reactSchemeActivity != null) {
                    reactSchemeActivity.ITrustedWebActivityCallbackDefault();
                }
                objectRef = new Ref.ObjectRef();
                objectRef.element = access8100.onNavigationEvent();
                try {
                    Result.Companion companion = Result.Companion;
                    Map mapOnNavigationEvent2 = access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "TossBundleLoaderModule"));
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "import_lazy_started", mapOnNavigationEvent2, (String) null, false, (String) null, 56, (Object) null);
                    Objects.toString(mapOnNavigationEvent2);
                    WeakReference weakReferenceOnNavigationEvent = onNavigationEvent(this);
                    if (weakReferenceOnNavigationEvent != null) {
                        try {
                            transfinalize = (Activity) weakReferenceOnNavigationEvent.get();
                        } catch (Exception e) {
                            exc = e;
                            activity = null;
                            exc2 = exc;
                            Result.Companion companion2 = Result.Companion;
                            obj5 = Result.constructor-impl(ResultKt.createFailure(exc2));
                            th5 = Result.exceptionOrNull-impl(obj5);
                            if (th5 == null) {
                            }
                        } catch (WebResourceResponseModel e2) {
                            th = e2;
                            activity = null;
                            th2 = th;
                            Result.Companion companion3 = Result.Companion;
                            obj5 = Result.constructor-impl(ResultKt.createFailure(th2));
                            th5 = Result.exceptionOrNull-impl(obj5);
                            if (th5 == null) {
                            }
                        }
                    } else {
                        transfinalize = null;
                    }
                    if (transfinalize != null) {
                        int i8 = getInterfaceDescriptor + 25;
                        asInterface = i8 % 128;
                        if (i8 % 2 != 0) {
                            boolean z = transfinalize instanceof ReactSchemeActivity;
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        ReactSchemeActivity reactSchemeActivity2 = transfinalize instanceof ReactSchemeActivity ? (ReactSchemeActivity) transfinalize : null;
                        if (reactSchemeActivity2 != null) {
                            Map map2 = (Map) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1321755818, -1321755802, zzaq.onNavigationEvent(), new Object[]{reactSchemeActivity2, null, 1, null}, zzaq.onNavigationEvent());
                            if (map2 == null) {
                                try {
                                    map2 = (Map) objectRef.element;
                                    objectRef.element = map2;
                                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "TossBundleLoaderModule");
                                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("activity", transfinalize.getClass().getSimpleName());
                                    Pair[] pairArr = new Pair[2];
                                    try {
                                        pairArr[0] = pairIAuthTabCallback;
                                        pairArr[1] = pairIAuthTabCallback2;
                                        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(pairArr);
                                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "import_lazy_activity", mapOnWarmupCompleted, (String) null, false, (String) null, 56, (Object) null);
                                        Objects.toString(mapOnWarmupCompleted);
                                        if (transfinalize instanceof transFinalize) {
                                            map = mapOnWarmupCompleted;
                                            obj = objOnWarmupCompleted;
                                        } else {
                                            logicVerifyID typedObject = transfinalize.readTypedObject();
                                            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("from", "TossBundleLoaderModule");
                                            if (typedObject != null) {
                                                int i9 = asInterface + 61;
                                                getInterfaceDescriptor = i9 % 128;
                                                if (i9 % 2 == 0) {
                                                    typedObject.getClass().getSimpleName();
                                                    Object obj9 = null;
                                                    obj9.hashCode();
                                                    throw null;
                                                }
                                                simpleName = typedObject.getClass().getSimpleName();
                                            } else {
                                                simpleName = null;
                                            }
                                            map = mapOnWarmupCompleted;
                                            obj = objOnWarmupCompleted;
                                            Object[] objArr = new Object[1];
                                            a(new char[]{7976, 2504, 13046, 23550}, 5869 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                                            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), simpleName);
                                            Pair[] pairArr2 = new Pair[2];
                                            try {
                                                pairArr2[0] = pairIAuthTabCallback3;
                                                pairArr2[1] = pairIAuthTabCallback4;
                                                Map mapOnWarmupCompleted2 = access8100.onWarmupCompleted(pairArr2);
                                                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "import_lazy_bundle_loader_type", mapOnWarmupCompleted2, (String) null, false, (String) null, 56, (Object) null);
                                                Objects.toString(mapOnWarmupCompleted2);
                                                maxFullscreenAdImplb = typedObject instanceof MaxFullscreenAdImplb ? (MaxFullscreenAdImplb) typedObject : null;
                                                if (maxFullscreenAdImplb == null) {
                                                    Map mapOnNavigationEvent3 = access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "TossBundleLoaderModule"));
                                                    ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "react_native_debug", "import_lazy_loader_not_available", (Throwable) null, mapOnNavigationEvent3, 4, (Object) null);
                                                    Objects.toString(mapOnNavigationEvent3);
                                                    throw new Exception("Bundle loader not available or not TossReactBundleHandle type");
                                                }
                                                int i10 = getInterfaceDescriptor + 39;
                                                asInterface = i10 % 128;
                                                int i11 = i10 % 2;
                                                String strAsInterface = maxFullscreenAdImplb.asInterface();
                                                if (reactSchemeActivity2 == null || (mapOnNavigationEvent = reactSchemeActivity2.onExtraCallbackWithResult(strAsInterface)) == null) {
                                                    mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("failedBundleName", strAsInterface));
                                                }
                                                objectRef.element = mapOnNavigationEvent;
                                                Map mapOnNavigationEvent4 = access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "TossBundleLoaderModule"));
                                                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "import_lazy_ensuring_bundle", mapOnNavigationEvent4, (String) null, false, (String) null, 56, (Object) null);
                                                Objects.toString(mapOnNavigationEvent4);
                                                String strAsBinder = maxFullscreenAdImplb.asBinder();
                                                Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("from", "TossBundleLoaderModule");
                                                Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("remoteBundlePath", strAsBinder);
                                                obj2 = "TossBundleLoaderModule";
                                                Pair[] pairArr3 = new Pair[2];
                                                try {
                                                    pairArr3[0] = pairIAuthTabCallback5;
                                                    pairArr3[1] = pairIAuthTabCallback6;
                                                    Map mapOnWarmupCompleted3 = access8100.onWarmupCompleted(pairArr3);
                                                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "import_lazy_remote_path", mapOnWarmupCompleted3, (String) null, false, (String) null, 56, (Object) null);
                                                    Objects.toString(mapOnWarmupCompleted3);
                                                    String strOnTransact = maxFullscreenAdImplb.onTransact();
                                                    RnBundleInfo.Role role = RnBundleInfo.Role.SERVICE;
                                                    try {
                                                        obj3 = Result.constructor-impl(access14000.onExtraCallback(new File(strAsBinder).length()));
                                                    } catch (Throwable th6) {
                                                        Result.Companion companion4 = Result.Companion;
                                                        obj3 = Result.constructor-impl(ResultKt.createFailure(th6));
                                                    }
                                                    if (Result.onExtraCallback(obj3)) {
                                                        obj3 = null;
                                                    }
                                                    Long l = (Long) obj3;
                                                    if (l != null) {
                                                        int i12 = getInterfaceDescriptor + 109;
                                                        asInterface = i12 % 128;
                                                        int i13 = i12 % 2;
                                                        Long l2 = l.longValue() > 0 ? l : null;
                                                        RnBundleInfo rnBundleInfo4 = new RnBundleInfo((RnBundleInfo.Source) null, strAsInterface, (String) null, (String) null, strOnTransact, (String) null, (Integer) null, l2, (Long) null, (RnCause) null, role, (List) null, (Double) null, 7021, (DefaultConstructorMarker) null);
                                                        RnPhaseObserver rnPhaseObserverOnExtraCallback4 = onExtraCallback(this);
                                                        if (rnPhaseObserverOnExtraCallback4 != null) {
                                                            obj4 = "from";
                                                            RnPhaseObserver.onNavigationEvent(rnPhaseObserverOnExtraCallback4, strOnTransact, (String) null, 2, (Object) null);
                                                        } else {
                                                            obj4 = "from";
                                                        }
                                                        try {
                                                            MaxFullscreenAdImplExternalSyntheticLambda3 maxFullscreenAdImplExternalSyntheticLambda3 = MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted;
                                                            ReactContext reactContextOnExtraCallbackWithResult = onExtraCallbackWithResult(this);
                                                            try {
                                                                try {
                                                                    Map<String, ? extends Object> mapOnWarmupCompleted4 = access8100.onWarmupCompleted((Map) objectRef.element, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("remoteBundleName", maxFullscreenAdImplb.asInterface()), getWrite.IAuthTabCallback("hostBundleName", maxFullscreenAdImplb.IAuthTabCallback())}));
                                                                    iAuthTabCallback2.L$0 = objectRef;
                                                                    iAuthTabCallback2.L$1 = access15400.onNavigationEvent(iAuthTabCallback2);
                                                                    iAuthTabCallback2.L$2 = access15400.onNavigationEvent(mapOnNavigationEvent2);
                                                                    iAuthTabCallback2.L$3 = access15400.onNavigationEvent(reactSchemeActivity2);
                                                                    iAuthTabCallback2.L$4 = access15400.onNavigationEvent(transfinalize);
                                                                    iAuthTabCallback2.L$5 = access15400.onNavigationEvent(map);
                                                                    iAuthTabCallback2.L$6 = access15400.onNavigationEvent(maxFullscreenAdImplb);
                                                                    iAuthTabCallback2.L$7 = access15400.onNavigationEvent(strAsInterface);
                                                                    iAuthTabCallback2.L$8 = access15400.onNavigationEvent(strAsBinder);
                                                                    iAuthTabCallback2.L$9 = access15400.onNavigationEvent(mapOnWarmupCompleted3);
                                                                    iAuthTabCallback2.L$10 = access15400.onNavigationEvent(mapOnNavigationEvent4);
                                                                    str = strOnTransact;
                                                                    try {
                                                                        iAuthTabCallback2.L$11 = str;
                                                                        rnBundleInfo = rnBundleInfo4;
                                                                        try {
                                                                            try {
                                                                                iAuthTabCallback2.L$12 = rnBundleInfo;
                                                                                iAuthTabCallback2.I$0 = 0;
                                                                                iAuthTabCallback2.I$1 = 0;
                                                                                iAuthTabCallback2.label = 1;
                                                                                try {
                                                                                    Object obj10 = obj;
                                                                                    if (maxFullscreenAdImplExternalSyntheticLambda3.IAuthTabCallback(reactContextOnExtraCallbackWithResult, strAsBinder, str, "TossBundleLoaderModule", mapOnWarmupCompleted4, iAuthTabCallback2) == obj10) {
                                                                                        int i14 = asInterface + 13;
                                                                                        getInterfaceDescriptor = i14 % 128;
                                                                                        if (i14 % 2 != 0) {
                                                                                            return obj10;
                                                                                        }
                                                                                        Object obj11 = null;
                                                                                        obj11.hashCode();
                                                                                        throw null;
                                                                                    }
                                                                                    int i15 = asInterface + 55;
                                                                                    getInterfaceDescriptor = i15 % 128;
                                                                                    int i16 = i15 % 2;
                                                                                    str4 = str;
                                                                                    rnBundleInfo3 = rnBundleInfo;
                                                                                    rnPhaseObserverOnExtraCallback3 = onExtraCallback(this);
                                                                                    if (rnPhaseObserverOnExtraCallback3 != null) {
                                                                                    }
                                                                                    Map mapOnNavigationEvent5 = access8100.onNavigationEvent(getWrite.IAuthTabCallback(obj4, obj2));
                                                                                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "import_lazy_completed", mapOnNavigationEvent5, (String) null, false, (String) null, 56, (Object) null);
                                                                                    obj5 = Result.constructor-impl(access14000.onNavigationEvent(Log.d("react_native_debug", "import_lazy_completed extras=" + mapOnNavigationEvent5)));
                                                                                    activity = null;
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    th4 = th;
                                                                                    str3 = str;
                                                                                    rnBundleInfo2 = rnBundleInfo;
                                                                                    rnPhaseObserverOnExtraCallback = onExtraCallback(this);
                                                                                    if (rnPhaseObserverOnExtraCallback == null) {
                                                                                        throw th4;
                                                                                    }
                                                                                    RnPhaseObserver.IAuthTabCallback(rnPhaseObserverOnExtraCallback, str3, rnBundleInfo2, th4.getClass().getSimpleName(), false, 8, (Object) null);
                                                                                    throw th4;
                                                                                }
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                            }
                                                                        } catch (CancellationException e3) {
                                                                            e = e3;
                                                                            cancellationException = e;
                                                                            str2 = str;
                                                                            objectRef2 = objectRef;
                                                                            rnPhaseObserverOnExtraCallback2 = onExtraCallback(this);
                                                                            if (rnPhaseObserverOnExtraCallback2 == null) {
                                                                                throw cancellationException;
                                                                            }
                                                                            rnPhaseObserverOnExtraCallback2.onWarmupCompleted(str2, rnBundleInfo, cancellationException.getClass().getSimpleName(), true);
                                                                            throw cancellationException;
                                                                        }
                                                                    } catch (CancellationException e4) {
                                                                        e = e4;
                                                                        rnBundleInfo = rnBundleInfo4;
                                                                        cancellationException = e;
                                                                        str2 = str;
                                                                        objectRef2 = objectRef;
                                                                        rnPhaseObserverOnExtraCallback2 = onExtraCallback(this);
                                                                        if (rnPhaseObserverOnExtraCallback2 == null) {
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        rnBundleInfo = rnBundleInfo4;
                                                                        th4 = th;
                                                                        str3 = str;
                                                                        rnBundleInfo2 = rnBundleInfo;
                                                                        rnPhaseObserverOnExtraCallback = onExtraCallback(this);
                                                                        if (rnPhaseObserverOnExtraCallback == null) {
                                                                        }
                                                                    }
                                                                } catch (CancellationException e5) {
                                                                    e = e5;
                                                                    rnBundleInfo = rnBundleInfo4;
                                                                    str = strOnTransact;
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                    rnBundleInfo = rnBundleInfo4;
                                                                    str = strOnTransact;
                                                                }
                                                            } catch (CancellationException e6) {
                                                                e = e6;
                                                                str = strOnTransact;
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                str = strOnTransact;
                                                            }
                                                        } catch (CancellationException e7) {
                                                            e = e7;
                                                            str = strOnTransact;
                                                            rnBundleInfo = rnBundleInfo4;
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            str = strOnTransact;
                                                            rnBundleInfo = rnBundleInfo4;
                                                        }
                                                    }
                                                } catch (WebResourceResponseModel e8) {
                                                    th3 = e8;
                                                    th = th3;
                                                    activity = null;
                                                    th2 = th;
                                                    Result.Companion companion32 = Result.Companion;
                                                    obj5 = Result.constructor-impl(ResultKt.createFailure(th2));
                                                    th5 = Result.exceptionOrNull-impl(obj5);
                                                    if (th5 == null) {
                                                    }
                                                } catch (CancellationException e9) {
                                                    e = e9;
                                                    throw e;
                                                } catch (Exception e10) {
                                                    exc3 = e10;
                                                    exc = exc3;
                                                    activity = null;
                                                    exc2 = exc;
                                                    Result.Companion companion22 = Result.Companion;
                                                    obj5 = Result.constructor-impl(ResultKt.createFailure(exc2));
                                                    th5 = Result.exceptionOrNull-impl(obj5);
                                                    if (th5 == null) {
                                                    }
                                                }
                                            } catch (WebResourceResponseModel e11) {
                                                th3 = e11;
                                                th = th3;
                                                activity = null;
                                                th2 = th;
                                                Result.Companion companion322 = Result.Companion;
                                                obj5 = Result.constructor-impl(ResultKt.createFailure(th2));
                                                th5 = Result.exceptionOrNull-impl(obj5);
                                                if (th5 == null) {
                                                }
                                            } catch (CancellationException e12) {
                                                e = e12;
                                                throw e;
                                            } catch (Exception e13) {
                                                exc3 = e13;
                                                exc = exc3;
                                                activity = null;
                                                exc2 = exc;
                                                Result.Companion companion222 = Result.Companion;
                                                obj5 = Result.constructor-impl(ResultKt.createFailure(exc2));
                                                th5 = Result.exceptionOrNull-impl(obj5);
                                                if (th5 == null) {
                                                }
                                            }
                                        }
                                        if (maxFullscreenAdImplb == null) {
                                        }
                                    } catch (CancellationException e14) {
                                        e = e14;
                                    } catch (WebResourceResponseModel e15) {
                                        th3 = e15;
                                    } catch (Exception e16) {
                                        exc3 = e16;
                                    }
                                } catch (WebResourceResponseModel e17) {
                                    th = e17;
                                    activity = null;
                                    th2 = th;
                                    Result.Companion companion3222 = Result.Companion;
                                    obj5 = Result.constructor-impl(ResultKt.createFailure(th2));
                                    th5 = Result.exceptionOrNull-impl(obj5);
                                    if (th5 == null) {
                                    }
                                } catch (Exception e18) {
                                    exc = e18;
                                    activity = null;
                                    exc2 = exc;
                                    Result.Companion companion2222 = Result.Companion;
                                    obj5 = Result.constructor-impl(ResultKt.createFailure(exc2));
                                    th5 = Result.exceptionOrNull-impl(obj5);
                                    if (th5 == null) {
                                    }
                                }
                            } else {
                                objectRef.element = map2;
                                Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("from", "TossBundleLoaderModule");
                                Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("activity", transfinalize.getClass().getSimpleName());
                                Pair[] pairArr4 = new Pair[2];
                                pairArr4[0] = pairIAuthTabCallback7;
                                pairArr4[1] = pairIAuthTabCallback22;
                                Map mapOnWarmupCompleted5 = access8100.onWarmupCompleted(pairArr4);
                                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "import_lazy_activity", mapOnWarmupCompleted5, (String) null, false, (String) null, 56, (Object) null);
                                Objects.toString(mapOnWarmupCompleted5);
                                if (transfinalize instanceof transFinalize) {
                                }
                                if (maxFullscreenAdImplb == null) {
                                }
                            }
                        }
                    } else {
                        activity = null;
                        try {
                            Map mapOnNavigationEvent6 = access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "TossBundleLoaderModule"));
                            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "react_native_debug", "import_lazy_activity_null", (Throwable) null, mapOnNavigationEvent6, 4, (Object) null);
                            Objects.toString(mapOnNavigationEvent6);
                            throw new Exception("Activity is null");
                        } catch (WebResourceResponseModel e19) {
                            e = e19;
                            th = e;
                            th2 = th;
                            Result.Companion companion32222 = Result.Companion;
                            obj5 = Result.constructor-impl(ResultKt.createFailure(th2));
                            th5 = Result.exceptionOrNull-impl(obj5);
                            if (th5 == null) {
                            }
                        } catch (Exception e20) {
                            e = e20;
                            exc = e;
                            exc2 = exc;
                            Result.Companion companion22222 = Result.Companion;
                            obj5 = Result.constructor-impl(ResultKt.createFailure(exc2));
                            th5 = Result.exceptionOrNull-impl(obj5);
                            if (th5 == null) {
                            }
                        }
                    }
                } catch (WebResourceResponseModel e21) {
                    e = e21;
                    activity = null;
                } catch (Exception e22) {
                    e = e22;
                    activity = null;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RnBundleInfo rnBundleInfo5 = (RnBundleInfo) iAuthTabCallback2.L$12;
                str2 = (String) iAuthTabCallback2.L$11;
                objectRef2 = (Ref.ObjectRef) iAuthTabCallback2.L$0;
                try {
                    ResultKt.onNavigationEvent(obj6);
                    rnBundleInfo3 = rnBundleInfo5;
                    str4 = str2;
                    objectRef = objectRef2;
                    obj2 = "TossBundleLoaderModule";
                    obj4 = "from";
                    try {
                        rnPhaseObserverOnExtraCallback3 = onExtraCallback(this);
                        if (rnPhaseObserverOnExtraCallback3 != null) {
                            RnPhaseObserver.IAuthTabCallback(rnPhaseObserverOnExtraCallback3, str4, rnBundleInfo3, (String) null, false, 12, (Object) null);
                        }
                        Map mapOnNavigationEvent52 = access8100.onNavigationEvent(getWrite.IAuthTabCallback(obj4, obj2));
                        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "import_lazy_completed", mapOnNavigationEvent52, (String) null, false, (String) null, 56, (Object) null);
                        obj5 = Result.constructor-impl(access14000.onNavigationEvent(Log.d("react_native_debug", "import_lazy_completed extras=" + mapOnNavigationEvent52)));
                        activity = null;
                    } catch (Exception e23) {
                        exc2 = e23;
                        activity = null;
                        Result.Companion companion222222 = Result.Companion;
                        obj5 = Result.constructor-impl(ResultKt.createFailure(exc2));
                        th5 = Result.exceptionOrNull-impl(obj5);
                        if (th5 == null) {
                        }
                    } catch (WebResourceResponseModel e24) {
                        th2 = e24;
                        activity = null;
                        Result.Companion companion322222 = Result.Companion;
                        obj5 = Result.constructor-impl(ResultKt.createFailure(th2));
                        th5 = Result.exceptionOrNull-impl(obj5);
                        if (th5 == null) {
                        }
                    }
                } catch (CancellationException e25) {
                    rnBundleInfo = rnBundleInfo5;
                    cancellationException = e25;
                    try {
                        rnPhaseObserverOnExtraCallback2 = onExtraCallback(this);
                        if (rnPhaseObserverOnExtraCallback2 == null) {
                        }
                    } catch (WebResourceResponseModel e26) {
                        th2 = e26;
                        objectRef = objectRef2;
                        activity = null;
                        Result.Companion companion3222222 = Result.Companion;
                        obj5 = Result.constructor-impl(ResultKt.createFailure(th2));
                        th5 = Result.exceptionOrNull-impl(obj5);
                        if (th5 == null) {
                        }
                    } catch (Exception e27) {
                        exc2 = e27;
                        objectRef = objectRef2;
                        activity = null;
                        Result.Companion companion2222222 = Result.Companion;
                        obj5 = Result.constructor-impl(ResultKt.createFailure(exc2));
                        th5 = Result.exceptionOrNull-impl(obj5);
                        if (th5 == null) {
                        }
                    }
                } catch (Throwable th13) {
                    rnBundleInfo2 = rnBundleInfo5;
                    th4 = th13;
                    str3 = str2;
                    rnPhaseObserverOnExtraCallback = onExtraCallback(this);
                    if (rnPhaseObserverOnExtraCallback == null) {
                    }
                }
            }
            th5 = Result.exceptionOrNull-impl(obj5);
            if (th5 == null) {
                Unit unit = Unit.INSTANCE;
                int i17 = asInterface + 99;
                getInterfaceDescriptor = i17 % 128;
                int i18 = i17 % 2;
                return unit;
            }
            Map map3 = (Map) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, (Map) objectRef.element, th5}, 978055091, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -978055090);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BundleLoadError", (String) null, map3, (String) null, false, (String) null, 58, (Object) null);
            Objects.toString(map3);
            WeakReference<Activity> weakReference2 = this.IAuthTabCallback;
            if (weakReference2 != null) {
                int i19 = asInterface + 121;
                getInterfaceDescriptor = i19 % 128;
                int i20 = i19 % 2;
                activity2 = weakReference2.get();
            } else {
                activity2 = activity;
            }
            ?? r15 = activity2 instanceof ReactSchemeActivity ? (ReactSchemeActivity) activity2 : activity;
            if (r15 != 0) {
                r15.IAuthTabCallbackStub(th5);
            }
            throw new Exception("Failed to load bundle: importLazy: " + th5.getMessage(), th5);
        } catch (CancellationException e28) {
            throw e28;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        Object obj = null;
        if (access13800Var instanceof onNavigationEvent) {
            int i2 = asInterface + 85;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((onNavigationEvent) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i4 = onnavigationevent.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = asInterface + 123;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 == 0) {
                    onnavigationevent.label = i4 / Integer.MIN_VALUE;
                } else {
                    onnavigationevent.label = i4 - 2147483648;
                }
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj2 = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onnavigationevent.label;
        if (i6 != 0) {
            int i7 = getInterfaceDescriptor + 95;
            asInterface = i7 % 128;
            if (i7 % 2 == 0 ? i6 != 1 : i6 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj2);
        } else {
            ResultKt.onNavigationEvent(obj2);
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.onExtraCallbackWithResult;
            if (oninterstitialaddisplayfailed == null) {
                throw new UnsupportedOperationException("Portal service bundles require the Application-owned TossBundleLoader");
            }
            onExtraCallback onextracallback = new onExtraCallback(oninterstitialaddisplayfailed, str, this, null);
            onnavigationevent.L$0 = str;
            onnavigationevent.L$1 = access15400.onNavigationEvent(oninterstitialaddisplayfailed);
            onnavigationevent.label = 1;
            if (onNavigationEvent((Function1) onextracallback, (access13800) onnavigationevent) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $bundleRequest;
        final /* synthetic */ onInterstitialAdDisplayFailed $runtime;
        int label;
        final /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2, access13800<? super onExtraCallback> access13800Var) {
            super(1, access13800Var);
            this.$runtime = oninterstitialaddisplayfailed;
            this.$bundleRequest = str;
            this.this$0 = maxFullscreenAdImplExternalSyntheticLambda2;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$runtime, this.$bundleRequest, this.this$0, access13800Var);
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            if (i3 != 0) {
                int i4 = 2 / 0;
            }
            int i5 = onWarmupCompleted + 23;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 95;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onWarmupCompleted + 35;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.$runtime;
                String str = this.$bundleRequest;
                ReactContext reactContextOnExtraCallbackWithResult = MaxFullscreenAdImplExternalSyntheticLambda2.onExtraCallbackWithResult(this.this$0);
                this.label = 1;
                if (onInterstitialAdDisplayFailed.IAuthTabCallback(1185854566, new Object[]{oninterstitialaddisplayfailed, str, reactContextOnExtraCallbackWithResult, this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1185854548) == objOnWarmupCompleted) {
                    int i8 = onExtraCallback + 49;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull AnnotatedStringKtExternalSyntheticLambda3 annotatedStringKtExternalSyntheticLambda3, @NotNull access13800<? super JvmAnnotatedString_jvmAndAndroidKtExternalSyntheticLambda0> access13800Var) {
        asInterface asinterface;
        int i = 2 % 2;
        if (access13800Var instanceof asInterface) {
            asinterface = (asInterface) access13800Var;
            int i2 = asinterface.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asinterface.label = i2 - 2147483648;
            } else {
                asinterface = new asInterface(access13800Var);
            }
        }
        Object objOnNavigationEvent = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = asinterface.label;
        Object obj = null;
        if (i3 != 0) {
            int i4 = asInterface;
            int i5 = i4 + 63;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0 ? i3 != 1 : i3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i4 + 103;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 == 0) {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                throw null;
            }
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        } else {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            if (StringsKt.isBlank(annotatedStringKtExternalSyntheticLambda3.IAuthTabCallback())) {
                throw new IllegalArgumentException("loadBundle requires request.appName");
            }
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.onExtraCallbackWithResult;
            if (oninterstitialaddisplayfailed == null) {
                throw new IllegalStateException("Portal runtime is unavailable");
            }
            onTransact ontransact = new onTransact(oninterstitialaddisplayfailed, annotatedStringKtExternalSyntheticLambda3, null);
            asinterface.L$0 = access15400.onNavigationEvent(annotatedStringKtExternalSyntheticLambda3);
            asinterface.L$1 = access15400.onNavigationEvent(oninterstitialaddisplayfailed);
            asinterface.label = 1;
            objOnNavigationEvent = onNavigationEvent((Function1) ontransact, (access13800) asinterface);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i7 = getInterfaceDescriptor + 71;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                obj.hashCode();
                throw null;
            }
        }
        return new JvmAnnotatedString_jvmAndAndroidKtExternalSyntheticLambda0((String) objOnNavigationEvent);
    }

    static final class onTransact extends SuspendLambda implements Function1<access13800<? super String>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ AnnotatedStringKtExternalSyntheticLambda3 $request;
        final /* synthetic */ onInterstitialAdDisplayFailed $runtime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, AnnotatedStringKtExternalSyntheticLambda3 annotatedStringKtExternalSyntheticLambda3, access13800<? super onTransact> access13800Var) {
            super(1, access13800Var);
            this.$runtime = oninterstitialaddisplayfailed;
            this.$request = annotatedStringKtExternalSyntheticLambda3;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$runtime, this.$request, access13800Var);
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.$runtime;
            String strIAuthTabCallback = this.$request.IAuthTabCallback();
            this.label = 1;
            Object objOnWarmupCompleted2 = oninterstitialaddisplayfailed.onWarmupCompleted(strIAuthTabCallback, (access13800<? super String>) this);
            if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                return objOnWarmupCompleted2;
            }
            int i5 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 73 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    public Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.onExtraCallbackWithResult;
        if (oninterstitialaddisplayfailed == null) {
            throw new IllegalStateException("Portal runtime is unavailable");
        }
        Object objIAuthTabCallback = oninterstitialaddisplayfailed.IAuthTabCallback(str, access13800Var);
        if (objIAuthTabCallback == access14300.onWarmupCompleted()) {
            int i2 = asInterface + 35;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return objIAuthTabCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 23;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        List<Map> list;
        Object obj;
        synchronized (this.onNavigationEvent) {
            this.asBinder = true;
            list = CollectionsKt.toList(this.onExtraCallback);
            this.onExtraCallback.clear();
        }
        list.size();
        int i = 0;
        for (Map map : list) {
            if (bj_().hasActiveReactInstance()) {
                try {
                    Result.Companion companion = Result.Companion;
                    AnnotatedStringKtExternalSyntheticLambda1.onExtraCallbackWithResult(this, map);
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Result.exceptionOrNull-impl(obj);
            } else {
                i++;
            }
        }
        if (i > 0) {
            return Unit.INSTANCE;
        }
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.onExtraCallbackWithResult;
        if (oninterstitialaddisplayfailed != null) {
            onInterstitialAdDisplayFailed.IAuthTabCallback(279445662, new Object[]{oninterstitialaddisplayfailed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -279445639);
        }
        return Unit.INSTANCE;
    }

    public final boolean IAuthTabCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        boolean z;
        Object obj;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("eventName", str), getWrite.IAuthTabCallback("body", map)});
        synchronized (this.onNavigationEvent) {
            if (this.asBinder) {
                z = true;
            } else {
                this.onExtraCallback.addLast(mapOnWarmupCompleted);
                z = false;
            }
        }
        if (!z) {
            return true;
        }
        if (!bj_().hasActiveReactInstance()) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            AnnotatedStringKtExternalSyntheticLambda1.onExtraCallbackWithResult(this, mapOnWarmupCompleted);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Result.exceptionOrNull-impl(obj);
        return Result.onNavigationEvent(obj);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Map map = (Map) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("groupId", map.get("groupId"));
        Object[] objArr2 = new Object[1];
        a(new char[]{7983, 51914, 46302, 40678, 18661, 13040}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54772, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{7983, 51914, 46302, 40678, 18661, 13040}, 54774 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(strIntern, map.get(((String) objArr3[0]).intern())), getWrite.IAuthTabCallback("cause", th.getMessage()), getWrite.IAuthTabCallback("stackTrace", RawQueries.onNavigationEvent(th, 0, 0, 3, (Object) null)), getWrite.IAuthTabCallback("failedBundleName", map.get("failedBundleName"))});
        int i4 = getInterfaceDescriptor + 31;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private final Map<String, Object> onExtraCallback(Map<String, ? extends Object> map, Throwable th) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Map) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, map, th}, 978055091, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, -978055090);
    }

    private final RnPhaseObserver IAuthTabCallbackDefault() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (RnPhaseObserver) onExtraCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this}, -208413610, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, 208413610);
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = -3222938730871743893L;
    }
}
