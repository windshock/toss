package im.toss.rn.toss.core.bridge.module;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.global.localization.domain.di.RegionDomainModuleKt;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.toss.core.bridge.module.TossReactBridgeModule$postMessage$2$;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepository;
import im.toss.rn.toss.core.util.RnAppVersion;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.ALCDetectionMode;
import o.ALCLiveness;
import o.ALCPreviewView;
import o.AUTextView;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.CreateInputImageFromJPEGBinary;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.IconRoundCornerProgressBarSavedState;
import o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0;
import o.MaxFullscreenAdImpl;
import o.Response;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.Threshold;
import o.TrackGroupExternalSyntheticLambda0;
import o.UserChoiceBillingListener;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.adInfo;
import o.auth;
import o.calculateMaxTextSize;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.downloadZip;
import o.drawTextBox;
import o.ec;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getEmbedViewManager;
import o.getPricingPhaseList;
import o.getStartTimeMillis;
import o.getWidgetLayoutParams;
import o.getWriggleLayout;
import o.getWrite;
import o.hExternalSyntheticLambda2;
import o.maybeUpdateAnimatable;
import o.nzi;
import o.putChannelInfo;
import o.r8lambdaCw9E_wIWjoKkL34VaEOT3x91SI;
import o.r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos;
import o.r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I;
import o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.removeUIManagerEventListener;
import o.setRandomHost;
import o.sp;
import o.tnycx;
import o.videoFrameChanged;
import o.wie2;
import o.zzaj;
import o.zzcy;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossReactBridgeModule extends ReactContextBaseJavaModule implements hExternalSyntheticLambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 0;
    public static final String TAG = "CommonRNBridgeModule";
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted;
    private final wie2 json;
    private final Function0<Unit> onBundleLoadFailed;
    private final Lazy reactBundleRepository$delegate;
    private final Lazy reactMessageHandlerManager$delegate;
    private final WeakReference<? extends TossReactContentOwner> tossReactContentOwnerRef;
    private final Uri tossReactContentOwnerUri;
    private final Lazy tossReactMessageHandlerManager$delegate;
    private final calculateMaxTextSize tossReactMessageHandlerPoolSet;
    private final hExternalSyntheticLambda2 tossReactScriptEvaluator;
    private final Lazy unique$delegate;

    /* renamed from: $r8$lambda$3jPbWOxy8O-LfRjwp8okCO0bX8U, reason: not valid java name */
    public static /* synthetic */ r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE m0$r8$lambda$3jPbWOxy8OLfRjwp8okCO0bX8U() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjgeReactMessageHandlerManager_delegate$lambda$0 = reactMessageHandlerManager_delegate$lambda$0();
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdausr520ceu4yijcrtwho1uywjgeReactMessageHandlerManager_delegate$lambda$0;
    }

    public static /* synthetic */ r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE $r8$lambda$PeCRI2ovE1SJbaOyePbsRjfkFIE() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge = tossReactMessageHandlerManager_delegate$lambda$0();
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return r8lambdausr520ceu4yijcrtwho1uywjge;
    }

    /* renamed from: $r8$lambda$Tgvm5AmALj3REbN-eUifq0x60vg, reason: not valid java name */
    public static /* synthetic */ ConstraintsSizeResolverExternalSyntheticLambda0 m1$r8$lambda$Tgvm5AmALj3REbNeUifq0x60vg() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0Unique_delegate$lambda$0 = unique_delegate$lambda$0();
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return constraintsSizeResolverExternalSyntheticLambda0Unique_delegate$lambda$0;
    }

    /* renamed from: $r8$lambda$ZqOTq9vUGOlO-QuWFqJHG99NWps, reason: not valid java name */
    public static /* synthetic */ Unit m2$r8$lambda$ZqOTq9vUGOlOQuWFqJHG99NWps(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitJson$lambda$0 = json$lambda$0(adinfo);
        int i4 = onNavigationEvent + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitJson$lambda$0;
        }
        throw null;
    }

    public static /* synthetic */ ReactBundleRepository $r8$lambda$gl27wWQAk59Q9QW23BopDoGiq7E() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactBundleRepository reactBundleRepositoryReactBundleRepository_delegate$lambda$0 = reactBundleRepository_delegate$lambda$0();
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return reactBundleRepositoryReactBundleRepository_delegate$lambda$0;
    }

    public static /* synthetic */ Unit $r8$lambda$qysoxn7O3qSfhtE8JHPSodS5Zt0(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, Boolean bool) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRegisterVisibilityChangedEvent$lambda$0 = registerVisibilityChangedEvent$lambda$0(rCTDeviceEventEmitter, bool);
        int i4 = onNavigationEvent + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitRegisterVisibilityChangedEvent$lambda$0;
    }

    public static /* synthetic */ void $r8$lambda$zmZyiRGJ53tAQGneHpUGhZYTEPA(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        registerVisibilityChangedEvent$lambda$1(function1, obj);
        int i4 = onExtraCallback + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        onExtraCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // o.hExternalSyntheticLambda2
    @ReactMethod
    public void evaluateScript(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        if (i3 != 0) {
            Intrinsics.checkNotNullParameter(promise, "");
            this.tossReactScriptEvaluator.evaluateScript(str, readableMap, promise);
            throw null;
        }
        Intrinsics.checkNotNullParameter(promise, "");
        this.tossReactScriptEvaluator.evaluateScript(str, readableMap, promise);
        int i4 = onExtraCallback + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.hExternalSyntheticLambda2
    @ReactMethod
    public void prefetchScript(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        if (i3 == 0) {
            Intrinsics.checkNotNullParameter(promise, "");
            this.tossReactScriptEvaluator.prefetchScript(str, readableMap, promise);
        } else {
            Intrinsics.checkNotNullParameter(promise, "");
            this.tossReactScriptEvaluator.prefetchScript(str, readableMap, promise);
            int i4 = 19 / 0;
        }
    }

    public static final class asInterface extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {51245, 51240, 51243, 64960, 51242, 64980, 64982, 64978, 64990};
        private static char onExtraCallback = 51242;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Callback onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, Callback callback) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = callback;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0 ? zzcy.onNavigationEvent(th, 0, 1, (Object) null) : zzcy.onNavigationEvent(th, 1, 0, (Object) null)) {
                Callback callback = this.onWarmupCompleted;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                Object[] objArr = new Object[1];
                a(new char[]{6, 7, 13920, 13920, '\b', 4, 13942}, (byte) (119 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.red(0) + 7, objArr);
                writableNativeMap.putString(((String) objArr[0]).intern(), "인터넷 연결이 오프라인 상태입니다.");
                writableNativeMap.putString("code", "NETWORK_ERROR");
                Unit unit = Unit.INSTANCE;
                callback.invoke(new Object[]{writableNativeMap});
                return;
            }
            if (th instanceof CancellationException) {
                return;
            }
            int i3 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ALCDetectionMode.onExtraCallbackWithResult(th, (Map) null, 1, (Object) null);
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            char c = '0';
            float f = 0.0f;
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
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 26, TextUtils.lastIndexOf("", c, 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        c = '0';
                        f = 0.0f;
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, 23138 - ExpandableListView.getPackedPositionChild(0L), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i5 = $10 + 13;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i7 = $10 + 39;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 24824), TextUtils.lastIndexOf("", '0', 0, 0) + 75, 8088 - Color.alpha(0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i9 = $11 + 19;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 30 - (ViewConfiguration.getJumpTapTimeout() >> 16), 19487 - TextUtils.lastIndexOf("", '0', 0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i12 = $10 + 95;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            } else {
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i18 = $11 + 121;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < i) {
                int i21 = $10;
                int i22 = i21 + 33;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
                int i24 = i21 + 11;
                $11 = i24 % 128;
                int i25 = i24 % 2;
            }
            objArr[0] = new String(cArr4);
        }
    }

    public static final class onNavigationEvent extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String IAuthTabCallback;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ String onNavigationEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, String str, String str2, String str3) {
            super(onwarmupcompleted);
            this.IAuthTabCallback = str;
            this.onExtraCallbackWithResult = str2;
            this.onNavigationEvent = str3;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            if (th instanceof CancellationException) {
                return;
            }
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (zzcy.onNavigationEvent(th, 0, 1, (Object) null)) {
                return;
            }
            int i4 = onExtraCallback + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ALCDetectionMode.IAuthTabCallback(th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("moduleName", this.IAuthTabCallback), getWrite.IAuthTabCallback("serviceDeploymentId", this.onExtraCallbackWithResult), getWrite.IAuthTabCallback("sharedDeploymentId", this.onNavigationEvent)}));
            int i6 = onExtraCallback + 117;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 % 4;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossReactBridgeModule(@NotNull hExternalSyntheticLambda2 hexternalsyntheticlambda2, @NotNull Uri uri, @NotNull WeakReference<? extends TossReactContentOwner> weakReference, @NotNull calculateMaxTextSize calculatemaxtextsize, @NotNull Function0<Unit> function0, @NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(hexternalsyntheticlambda2, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(calculatemaxtextsize, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        this.tossReactScriptEvaluator = hexternalsyntheticlambda2;
        this.tossReactContentOwnerUri = uri;
        this.tossReactContentOwnerRef = weakReference;
        this.tossReactMessageHandlerPoolSet = calculatemaxtextsize;
        this.onBundleLoadFailed = function0;
        this.unique$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.bridge.module.TossReactBridgeModule$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 17;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return TossReactBridgeModule.m1$r8$lambda$Tgvm5AmALj3REbNeUifq0x60vg();
                }
                TossReactBridgeModule.m1$r8$lambda$Tgvm5AmALj3REbNeUifq0x60vg();
                throw null;
            }
        });
        this.reactMessageHandlerManager$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.bridge.module.TossReactBridgeModule$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return TossReactBridgeModule.m0$r8$lambda$3jPbWOxy8OLfRjwp8okCO0bX8U();
                }
                TossReactBridgeModule.m0$r8$lambda$3jPbWOxy8OLfRjwp8okCO0bX8U();
                throw null;
            }
        });
        this.json = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.rn.toss.core.bridge.module.TossReactBridgeModule$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 93;
                onWarmupCompleted = i2 % 128;
                adInfo adinfo = (adInfo) obj;
                if (i2 % 2 != 0) {
                    TossReactBridgeModule.m2$r8$lambda$ZqOTq9vUGOlOQuWFqJHG99NWps(adinfo);
                    throw null;
                }
                Unit unitM2$r8$lambda$ZqOTq9vUGOlOQuWFqJHG99NWps = TossReactBridgeModule.m2$r8$lambda$ZqOTq9vUGOlOQuWFqJHG99NWps(adinfo);
                int i3 = onNavigationEvent + 105;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 82 / 0;
                }
                return unitM2$r8$lambda$ZqOTq9vUGOlOQuWFqJHG99NWps;
            }
        }, 1, (Object) null);
        this.tossReactMessageHandlerManager$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.bridge.module.TossReactBridgeModule$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge$r8$lambda$PeCRI2ovE1SJbaOyePbsRjfkFIE = TossReactBridgeModule.$r8$lambda$PeCRI2ovE1SJbaOyePbsRjfkFIE();
                int i4 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return r8lambdausr520ceu4yijcrtwho1uywjge$r8$lambda$PeCRI2ovE1SJbaOyePbsRjfkFIE;
            }
        });
        this.reactBundleRepository$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.bridge.module.TossReactBridgeModule$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                ReactBundleRepository reactBundleRepository$r8$lambda$gl27wWQAk59Q9QW23BopDoGiq7E;
                int i = 2 % 2;
                int i2 = onExtraCallback + 67;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    reactBundleRepository$r8$lambda$gl27wWQAk59Q9QW23BopDoGiq7E = TossReactBridgeModule.$r8$lambda$gl27wWQAk59Q9QW23BopDoGiq7E();
                    int i3 = 37 / 0;
                } else {
                    reactBundleRepository$r8$lambda$gl27wWQAk59Q9QW23BopDoGiq7E = TossReactBridgeModule.$r8$lambda$gl27wWQAk59Q9QW23BopDoGiq7E();
                }
                int i4 = IAuthTabCallback + 51;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return reactBundleRepository$r8$lambda$gl27wWQAk59Q9QW23BopDoGiq7E;
            }
        });
    }

    public static final /* synthetic */ Object access$__td(TossReactBridgeModule tossReactBridgeModule, String str, ReadableMap readableMap, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return tossReactBridgeModule.__td(str, readableMap, access13800Var);
        }
        tossReactBridgeModule.__td(str, readableMap, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object access$__te(TossReactBridgeModule tossReactBridgeModule, String str, boolean z, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj__te = tossReactBridgeModule.__te(str, z, access13800Var);
        int i4 = onExtraCallback + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return obj__te;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String access$getCurrentRegionCode(TossReactBridgeModule tossReactBridgeModule) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String currentRegionCode = tossReactBridgeModule.getCurrentRegionCode();
        int i4 = onExtraCallback + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return currentRegionCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ wie2 access$getJson$p(TossReactBridgeModule tossReactBridgeModule) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        wie2 wie2Var = tossReactBridgeModule.json;
        int i5 = i2 + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return wie2Var;
    }

    public static final /* synthetic */ Function0 access$getOnBundleLoadFailed$p(TossReactBridgeModule tossReactBridgeModule) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = tossReactBridgeModule.onBundleLoadFailed;
        if (i4 != 0) {
            int i5 = 7 / 0;
        }
        int i6 = i2 + 83;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
        return function0;
    }

    public static final /* synthetic */ ReactApplicationContext access$getReactApplicationContext(TossReactBridgeModule tossReactBridgeModule) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactApplicationContext reactApplicationContext = tossReactBridgeModule.getReactApplicationContext();
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = onNavigationEvent + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return reactApplicationContext;
    }

    public static final /* synthetic */ ReactBundleRepository access$getReactBundleRepository(TossReactBridgeModule tossReactBridgeModule) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return tossReactBridgeModule.getReactBundleRepository();
        }
        tossReactBridgeModule.getReactBundleRepository();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ TossReactContentOwner access$getReactContentOwner(TossReactBridgeModule tossReactBridgeModule) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TossReactContentOwner reactContentOwner = tossReactBridgeModule.getReactContentOwner();
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return reactContentOwner;
    }

    public static final /* synthetic */ r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE access$getTossReactMessageHandlerManager(TossReactBridgeModule tossReactBridgeModule) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            tossReactBridgeModule.getTossReactMessageHandlerManager();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE tossReactMessageHandlerManager = tossReactBridgeModule.getTossReactMessageHandlerManager();
        int i3 = onExtraCallback + 61;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
        return tossReactMessageHandlerManager;
    }

    public static final /* synthetic */ void access$leaveBreadcrumb(TossReactBridgeModule tossReactBridgeModule, String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossReactBridgeModule.leaveBreadcrumb(str, str2, str3, str4);
        int i4 = onExtraCallback + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = 4261238476243396653L;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ReadableMap $data;
        int label;
        final /* synthetic */ TossReactBridgeModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(ReadableMap readableMap, TossReactBridgeModule tossReactBridgeModule, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$data = readableMap;
            this.this$0 = tossReactBridgeModule;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$data, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 37;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 24 - (Process.myTid() >> 22), TextUtils.getOffsetBefore("", 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 60 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 6383 - TextUtils.indexOf("", ""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - (Process.myTid() >> 22), MotionEvent.axisFromString("") + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr2);
            int i6 = $10 + 125;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            HashMap hashMap;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            try {
                hashMap = this.$data.toHashMap();
            } catch (Exception e) {
                wie2 wie2VarAccess$getJson$p = TossReactBridgeModule.access$getJson$p(this.this$0);
                String strOnWarmupCompleted = wie2VarAccess$getJson$p.onWarmupCompleted(new getWidgetLayoutParams(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(nzi.onNavigationEvent(wie2VarAccess$getJson$p.onExtraCallback(), Reflection.getOrCreateKotlinClass(Object.class)))), this.$data.toHashMap());
                Object[] objArr = new Object[1];
                a(new char[]{28030, 11010, 57756, 48656}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 18041, objArr);
                ALCDetectionMode.onNavigationEvent(e, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strOnWarmupCompleted)));
            }
            if (GetFeatureExtension.onWarmupCompleted.onExtraCallbackWithResult(hashMap, new CreateInputImageFromJPEGBinary("event", "common", access8100.onNavigationEvent(getWrite.IAuthTabCallback("from_rn", access14000.onNavigationEvent(true)))))) {
                return Unit.INSTANCE;
            }
            downloadZip downloadzipOnExtraCallbackWithResult = Threshold.onWarmupCompleted.onExtraCallbackWithResult(hashMap, new Threshold.onWarmupCompleted("event", "common", (String) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("from_rn", access14000.onNavigationEvent(true))), 4, (DefaultConstructorMarker) null));
            if (downloadzipOnExtraCallbackWithResult != null) {
                int i4 = onWarmupCompleted + 3;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                    ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, new Object[]{downloadzipOnExtraCallbackWithResult}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
                    throw null;
                }
                int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, -870178991, new Object[]{downloadzipOnExtraCallbackWithResult}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
            } else if (hashMap.get("event") == null) {
                throw new IllegalArgumentException("event should not be null, data={" + this.$data + "}");
            }
            return Unit.INSTANCE;
        }
    }

    private final ConstraintsSizeResolverExternalSyntheticLambda0 getUnique() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = (ConstraintsSizeResolverExternalSyntheticLambda0) this.unique$delegate.getValue();
        if (i3 == 0) {
            return constraintsSizeResolverExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ConstraintsSizeResolverExternalSyntheticLambda0 unique_delegate$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        int i4 = onExtraCallback + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback_Parcel;
    }

    private final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE getReactMessageHandlerManager() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.reactMessageHandlerManager$delegate.getValue();
        if (i3 == 0) {
            return (r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE) value;
        }
        throw null;
    }

    private static final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE reactMessageHandlerManager_delegate$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
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

    private final TossReactContentOwner getReactContentOwner() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossReactContentOwner tossReactContentOwner = this.tossReactContentOwnerRef.get();
        int i4 = onNavigationEvent + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return tossReactContentOwner;
        }
        throw null;
    }

    private final TextFieldPressGestureFilterKtExternalSyntheticLambda0 getReactModuleScope() {
        int i = 2 % 2;
        TossReactContentOwner reactContentOwner = getReactContentOwner();
        Object obj = null;
        if (reactContentOwner == null) {
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = onNavigationEvent + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(reactContentOwner);
        }
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(reactContentOwner);
        obj.hashCode();
        throw null;
    }

    private static final Unit json$lambda$0(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
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
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = i2 + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return "TossModule";
        }
        throw null;
    }

    @Override // o.hExternalSyntheticLambda2
    public Map<String, Object> getConstants() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RnAppVersion rnAppVersion = RnAppVersion.onExtraCallback;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "");
        String strOnWarmupCompleted = rnAppVersion.onWarmupCompleted(reactApplicationContext, zzaj.onNavigationEvent());
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("deviceId", getUnique().onNavigationEvent());
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2005903668);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11423), (ViewConfiguration.getEdgeSlop() >> 16) + 30, 24856 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1187993508, false, "onExtraCallbackWithResult", (Class[]) null);
        }
        Object obj = null;
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1884379750);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11422 - Process.getGidForName("")), (ViewConfiguration.getScrollBarSize() >> 8) + 30, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24856, -1091675382, false, "onWarmupCompleted", new Class[0]);
            }
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("DeviceInfo", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("modelId", ((Method) objOnExtraCallback2).invoke(obj2, null)), getWrite.IAuthTabCallback("systemVersion", Build.VERSION.RELEASE), getWrite.IAuthTabCallback("isEmulator", Boolean.valueOf(r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I.onExtraCallback())), getWrite.IAuthTabCallback("version", strOnWarmupCompleted), getWrite.IAuthTabCallback("locale", getStartTimeMillis.Companion.onExtraCallback().onExtraCallback())}));
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("SchemeUri", this.tossReactContentOwnerUri.toString());
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("isBeta", Boolean.valueOf(zzaj.onNavigationEvent().ITrustedWebActivityServiceStubProxy()));
            String upperCase = RegionDomainModuleKt.onExtraCallbackWithResult().onExtraCallbackWithResult().getCode().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            Map<String, Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback("region", upperCase)}), this.tossReactScriptEvaluator.getConstants());
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return mapOnWarmupCompleted;
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

    private final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE getTossReactMessageHandlerManager() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge = (r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE) this.tossReactMessageHandlerManager$delegate.getValue();
        int i3 = onExtraCallback + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdausr520ceu4yijcrtwho1uywjge;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static final byte[] $$a = {77, -67, -125, 9};
        private static final int $$b = 190;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 478308908;
        final /* synthetic */ String $messageName;
        final /* synthetic */ Callback $onError;
        final /* synthetic */ Callback $onSuccess;
        final /* synthetic */ ReadableMap $paramsMap;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ TossReactBridgeModule this$0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, int i2, byte b) {
            int i3;
            int i4 = (b * 2) + 4;
            int i5 = i2 * 2;
            byte[] bArr = $$a;
            int i6 = (i * 4) + 105;
            byte[] bArr2 = new byte[1 - i5];
            int i7 = 0 - i5;
            if (bArr == null) {
                i6 = i7;
                int i8 = i4;
                int i9 = 0;
                i6 += i4;
                i4 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i6;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                int i10 = i3 + 1;
                i8 = i4;
                i4 = bArr[i4];
                i9 = i10;
                i6 += i4;
                i4 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i6;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i6;
                if (i3 == i7) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(ReadableMap readableMap, Callback callback, String str, TossReactBridgeModule tossReactBridgeModule, Callback callback2, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$paramsMap = readableMap;
            this.$onError = callback;
            this.$messageName = str;
            this.this$0 = tossReactBridgeModule;
            this.$onSuccess = callback2;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(TossReactBridgeModule tossReactBridgeModule, String str, JsonObject jsonObject, Callback callback, Callback callback2, HashMap map) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(tossReactBridgeModule, str, jsonObject, callback, callback2, map);
                throw null;
            }
            boolean zIAuthTabCallback = IAuthTabCallback(tossReactBridgeModule, str, jsonObject, callback, callback2, map);
            int i3 = onNavigationEvent + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return zIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$paramsMap, this.$onError, this.$messageName, this.this$0, this.$onSuccess, access13800Var);
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                asbinderCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = asbinderCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i6 = $11 + 37;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - Color.green(0)), TextUtils.getCapsMode("", 0, 0) + 23, 10277 - TextUtils.indexOf((CharSequence) "", '0'), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getCapsMode("", 0, 0)), 55 - TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                int i9 = $11 + 45;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 12843), (Process.myPid() >> 22) + 55, ((Process.getThreadPriority(0) + 20) >> 6) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                }
                int i11 = $11 + 11;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private static final boolean IAuthTabCallback(TossReactBridgeModule tossReactBridgeModule, String str, JsonObject jsonObject, Callback callback, Callback callback2, HashMap map) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact;
            int i = 2 % 2;
            r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjgeAccess$getTossReactMessageHandlerManager = TossReactBridgeModule.access$getTossReactMessageHandlerManager(tossReactBridgeModule);
            TossReactContentOwner tossReactContentOwnerAccess$getReactContentOwner = TossReactBridgeModule.access$getReactContentOwner(tossReactBridgeModule);
            Intrinsics.checkNotNull(jsonObject);
            if (map != null) {
                linkedHashMap = new LinkedHashMap();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    int i2 = onExtraCallback + 65;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        ((Map.Entry) it.next()).getValue();
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                int i3 = onNavigationEvent + 121;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                linkedHashMap2 = null;
            } else {
                linkedHashMap2 = linkedHashMap;
            }
            TossReactContentOwner tossReactContentOwnerAccess$getReactContentOwner2 = TossReactBridgeModule.access$getReactContentOwner(tossReactBridgeModule);
            if (tossReactContentOwnerAccess$getReactContentOwner2 != null) {
                int i5 = onExtraCallback + 9;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = tossReactContentOwnerAccess$getReactContentOwner2.onTransact();
                    int i6 = 16 / 0;
                } else {
                    r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = tossReactContentOwnerAccess$getReactContentOwner2.onTransact();
                }
                r8lambdadtqrzfihm2ghoddvkfg5vm2yos = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact;
            } else {
                r8lambdadtqrzfihm2ghoddvkfg5vm2yos = null;
            }
            return r8lambdausr520ceu4yijcrtwho1uywjgeAccess$getTossReactMessageHandlerManager.onExtraCallbackWithResult(tossReactContentOwnerAccess$getReactContentOwner, str, jsonObject, callback, callback2, linkedHashMap2, r8lambdadtqrzfihm2ghoddvkfg5vm2yos);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
        
            if (r3 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00f2, code lost:
        
            if (r3 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f4, code lost:
        
            r2 = im.toss.rn.toss.core.bridge.module.TossReactBridgeModule.asBinder.onNavigationEvent + 5;
            im.toss.rn.toss.core.bridge.module.TossReactBridgeModule.asBinder.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
            r18.$onError.invoke(new java.lang.Object[]{"error"});
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0107, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
        
            if (r4.hasKey("ed") == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
        
            r8 = r4.getBoolean("ed");
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
        
            r8 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
        
            r9 = r18.this$0;
            r18.L$0 = o.access15400.onNavigationEvent(r4);
            r18.L$1 = o.access15400.onNavigationEvent(r15);
            r18.L$2 = o.access15400.onNavigationEvent(r3);
            r18.I$0 = r8;
            r18.label = 1;
            r3 = im.toss.rn.toss.core.bridge.module.TossReactBridgeModule.access$__te(r9, r3, r8, r18);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:
        
            if (r3 == r2) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01c9, code lost:
        
            if (r1 == r2) goto L54;
         */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r8v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objAccess$__td;
            String string;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                map.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                ReadableMap map = this.$paramsMap.getMap("params");
                if (map == null) {
                    this.$onError.invoke(new Object[]{"error"});
                    return Unit.INSTANCE;
                }
                ReadableMap map2 = this.$paramsMap.getMap("callbacks");
                HashMap hashMap = map2 != null ? map2.toHashMap() : null;
                String str = this.$messageName;
                if (Intrinsics.areEqual(str, "__te")) {
                    int i4 = onExtraCallback + 101;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9, 0 - ExpandableListView.getPackedPositionType(1L), new char[]{'\n', 65529, '\t', 0, 65525}, true, 108 % KeyEvent.normalizeMetaState(0), objArr);
                        string = map.getString(((String) objArr[0]).intern());
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 1, new char[]{'\n', 65529, '\t', 0, 65525}, true, 113 - KeyEvent.normalizeMetaState(0), objArr2);
                        string = map.getString(((String) objArr2[0]).intern());
                    }
                } else if (Intrinsics.areEqual(str, "__td")) {
                    String string2 = map.getString("b");
                    if (string2 == null) {
                        this.$onError.invoke(new Object[]{"error"});
                        return Unit.INSTANCE;
                    }
                    ReadableMap map3 = map.getMap("h");
                    if (map3 == null) {
                        this.$onError.invoke(new Object[]{"error"});
                        return Unit.INSTANCE;
                    }
                    TossReactBridgeModule tossReactBridgeModule = this.this$0;
                    this.L$0 = access15400.onNavigationEvent(map);
                    this.L$1 = access15400.onNavigationEvent(hashMap);
                    this.L$2 = access15400.onNavigationEvent(string2);
                    this.L$3 = access15400.onNavigationEvent(map3);
                    this.label = 2;
                    objAccess$__td = TossReactBridgeModule.access$__td(tossReactBridgeModule, string2, map3, this);
                } else {
                    JsonObject asJsonObject = JsonParser.parseString(getEmbedViewManager.onNavigationEvent(this.$paramsMap.toHashMap())).getAsJsonObject();
                    String str2 = this.$messageName;
                    if (!((Boolean) r8lambdaCw9E_wIWjoKkL34VaEOT3x91SI.IAuthTabCallback(str2, this.$paramsMap, new TossReactBridgeModule$postMessage$2$.ExternalSyntheticLambda0(this.this$0, str2, asJsonObject, this.$onSuccess, this.$onError, hashMap))).booleanValue() && !TossReactBridgeModule.access$getReactApplicationContext(this.this$0).getCatalystInstance().isDestroyed()) {
                        Callback callback = this.$onError;
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        Object[] objArr3 = new Object[1];
                        a(6 - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 8, new char[]{65532, 65534, 65528, '\n', '\n', 65532, 4}, true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 109, objArr3);
                        writableNativeMap.putString(((String) objArr3[0]).intern(), "구현되지 않은 앱브릿지 입니다.");
                        writableNativeMap.putString("code", "NOT_IMPLEMENTED");
                        Unit unit = Unit.INSTANCE;
                        callback.invoke(new Object[]{writableNativeMap});
                    }
                }
                return objOnWarmupCompleted;
            }
            if (i3 == 1) {
                ResultKt.onNavigationEvent(obj);
                Object objAccess$__te = obj;
                Pair pair = (Pair) objAccess$__te;
                if (!TossReactBridgeModule.access$getReactApplicationContext(this.this$0).getCatalystInstance().isDestroyed()) {
                    int i5 = onNavigationEvent + 117;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        Callback callback2 = this.$onSuccess;
                        Object first = pair.getFirst();
                        Object second = pair.getSecond();
                        Object[] objArr4 = new Object[5];
                        objArr4[0] = first;
                        objArr4[1] = second;
                        callback2.invoke(objArr4);
                    } else {
                        this.$onSuccess.invoke(new Object[]{pair.getFirst(), pair.getSecond()});
                    }
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objAccess$__td = obj;
                String str3 = (String) objAccess$__td;
                if (!TossReactBridgeModule.access$getReactApplicationContext(this.this$0).getCatalystInstance().isDestroyed()) {
                    this.$onSuccess.invoke(new Object[]{str3});
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE tossReactMessageHandlerManager_delegate$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjgeInvoke = ((r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.onNavigationEvent.class)).invoke();
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdausr520ceu4yijcrtwho1uywjgeInvoke;
    }

    private final ReactBundleRepository getReactBundleRepository() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ReactBundleRepository reactBundleRepository = (ReactBundleRepository) this.reactBundleRepository$delegate.getValue();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return reactBundleRepository;
    }

    private static final ReactBundleRepository reactBundleRepository_delegate$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            return ((ReactBundleRepository.EntryPoint) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ReactBundleRepository.EntryPoint.class)).ComponentActivityExternalSyntheticLambda1();
        }
        Response response2 = Response.onNavigationEvent;
        ((ReactBundleRepository.EntryPoint) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ReactBundleRepository.EntryPoint.class)).ComponentActivityExternalSyntheticLambda1();
        throw null;
    }

    private final String getCurrentRegionCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getPricingPhaseList getpricingphaselistOnExtraCallbackWithResult = RegionDomainModuleKt.onExtraCallbackWithResult().onExtraCallbackWithResult();
        if (i3 == 0) {
            return getpricingphaselistOnExtraCallbackWithResult.getCode();
        }
        getpricingphaselistOnExtraCallbackWithResult.getCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void initialize() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super/*com.facebook.react.bridge.BaseJavaModule*/.initialize();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "");
            registerVisibilityChangedEvent(reactApplicationContext);
            int i3 = onExtraCallback + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super/*com.facebook.react.bridge.BaseJavaModule*/.initialize();
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "");
        registerVisibilityChangedEvent(reactApplicationContext2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        int i3 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (Process.myPid() >> 22) + 72, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i4] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i4++;
                    int i5 = $11 + 63;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    i3 = -1469660336;
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
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int i7 = $11 + 35;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i9 = 0; i9 < length3; i9++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Process.getGidForName("") + 73, 8848 - Gravity.getAbsoluteGravity(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $11 + 57;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22251), ImageFormat.getBitsPerPixel(0) + 40, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.MeasureSpec.makeMeasureSpec(0, 0)), 78 - View.MeasureSpec.getMode(0), 7397 - ImageFormat.getBitsPerPixel(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void importLazy(@NotNull Promise promise) throws Throwable {
        MaxFullscreenAdImpl maxFullscreenAdImpl;
        String strOnExtraCallbackWithResult;
        String strIntern;
        String deploymentId;
        String deploymentId2;
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        TossReactContentOwner reactContentOwner = getReactContentOwner();
        Object obj = null;
        if (reactContentOwner != null) {
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            MaxFullscreenAdImpl maxFullscreenAdImplAccess100 = reactContentOwner.access100();
            int i6 = onExtraCallback + 27;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            maxFullscreenAdImpl = maxFullscreenAdImplAccess100;
        } else {
            maxFullscreenAdImpl = null;
        }
        TossReactContentOwner reactContentOwner2 = getReactContentOwner();
        MaxFullscreenAdImpl maxFullscreenAdImplAsInterface = reactContentOwner2 != null ? reactContentOwner2.asInterface() : null;
        TossReactContentOwner reactContentOwner3 = getReactContentOwner();
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = reactContentOwner3 != null ? reactContentOwner3.onTransact() : null;
        if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact == null || (strOnExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact.onExtraCallbackWithResult()) == null) {
            strOnExtraCallbackWithResult = "";
        }
        if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact != null) {
            int i8 = onNavigationEvent + 85;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            strIntern = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact.IAuthTabCallback();
            if (strIntern == null) {
                Object[] objArr = new Object[1];
                a(new int[]{2041464991, 1161312600}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr);
                strIntern = ((String) objArr[0]).intern();
            }
        }
        String str = strIntern;
        String str2 = (maxFullscreenAdImpl == null || (deploymentId2 = getDeploymentId(maxFullscreenAdImpl)) == null) ? "" : deploymentId2;
        String str3 = (maxFullscreenAdImplAsInterface == null || (deploymentId = getDeploymentId(maxFullscreenAdImplAsInterface)) == null) ? "" : deploymentId;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 reactModuleScope = getReactModuleScope();
        if (reactModuleScope != null) {
            maybeUpdateAnimatable.onNavigationEvent(reactModuleScope, new onNavigationEvent(CoroutineExceptionHandler.extraCallbackWithResult, strOnExtraCallbackWithResult, str3, str2), (setRandomHost) null, new onTransact(this, strOnExtraCallbackWithResult, str3, str2, maxFullscreenAdImplAsInterface, maxFullscreenAdImpl, str, promise, (access13800) null), 2, (Object) null);
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private static char[] onNavigationEvent = {27328, 27473, 27484, 27297, 27313, 27500, 27502, 27486, 27297, 27327};
        final /* synthetic */ String $encrypted;
        final /* synthetic */ ReadableMap $headerMap;
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
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super String> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i;
            int i2 = 2;
            int i3 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = onNavigationEvent;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 109;
                    $11 = i9 % 128;
                    int i10 = i9 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 35284), 35 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14239 - View.resolveSizeAndState(0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i8++;
                        i2 = 2;
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
            char[] cArr4 = new char[i5];
            System.arraycopy(cArr2, i4, cArr4, 0, i5);
            if (bArr != null) {
                char[] cArr5 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i11 = $11 + 53;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 66 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                                int i13 = 79 / 0;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            try {
                                Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - KeyEvent.keyCodeFromString("")), ExpandableListView.getPackedPositionGroup(0L) + 65, 16718 - TextUtils.indexOf("", "", 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        }
                    } else {
                        int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 30, Color.alpha(0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i15] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.MeasureSpec.getMode(0)), 71 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr4 = cArr5;
            }
            if (i7 > 0) {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i16 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr4, i16, i7);
                System.arraycopy(cArr6, i7, cArr4, 0, i16);
            }
            if (z) {
                int i17 = $11 + 27;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i18 = $11 + 75;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 / trackGroupExternalSyntheticLambda0.onNavigationEvent) + 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
                    } else {
                        cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
                cArr4 = cArr;
            }
            if (i6 > 0) {
                int i19 = $10 + 111;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
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
            a(new int[]{0, 10, 175, 0}, true, new byte[]{1, 1, 1, 1, 0, 0, 0, 1, 1, 1}, objArr);
            String lowerCase = ((String) objArr[0]).intern().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String string = readableMap.getString(lowerCase);
            if (string == null) {
                int i3 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                string = "";
            }
            ReadableMap readableMap2 = this.$headerMap;
            String lowerCase2 = "X-Toss-Content-Encoding".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return removeUIManagerEventListener.onExtraCallbackWithResult.onWarmupCompleted(this.$encrypted, string, readableMap2.getString(lowerCase2));
        }
    }

    @ReactMethod
    public void postMessage(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Callback callback, @NotNull Callback callback2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(callback, "");
        Intrinsics.checkNotNullParameter(callback2, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 reactModuleScope = getReactModuleScope();
        if (reactModuleScope != null) {
            maybeUpdateAnimatable.onNavigationEvent(reactModuleScope, new asInterface(CoroutineExceptionHandler.extraCallbackWithResult, callback2), (setRandomHost) null, new asBinder(readableMap, callback2, str, this, callback, null), 2, (Object) null);
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isAllowedByPolicy(@NotNull String str, @NotNull String str2) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ALCLiveness aLCLivenessOnWarmupCompleted = getReactMessageHandlerManager().onWarmupCompleted(str);
        drawTextBox drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, new Object[]{this.tossReactMessageHandlerPoolSet, str, false, 2, null}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
        if (drawtextbox != null) {
            TossReactContentOwner reactContentOwner = getReactContentOwner();
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault = reactContentOwner != null ? reactContentOwner.IAuthTabCallbackDefault() : null;
            if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault == null || (strOnWarmupCompleted = r8lambdadtqrzfihm2ghoddvkfg5vm2yosIAuthTabCallbackDefault.onWarmupCompleted()) == null) {
                strOnWarmupCompleted = "";
            }
            boolean zOnExtraCallbackWithResult = ALCPreviewView.onExtraCallbackWithResult.onExtraCallbackWithResult(str, drawtextbox, aLCLivenessOnWarmupCompleted, strOnWarmupCompleted, str2);
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return zOnExtraCallbackWithResult;
        }
        int i6 = onExtraCallback + 91;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends WritableNativeMap>>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $ed;
        final /* synthetic */ String $plain;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$plain = str;
            this.$ed = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$plain, this.$ed, access13800Var);
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Pair<String, WritableNativeMap>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            removeUIManagerEventListener.onExtraCallback onExtraCallback2 = removeUIManagerEventListener.onExtraCallbackWithResult.onExtraCallback(this.$plain, this.$ed);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            for (Map.Entry entry : onExtraCallback2.IAuthTabCallback().entrySet()) {
                writableNativeMap.putString((String) entry.getKey(), (String) entry.getValue());
            }
            Pair pair = new Pair(onExtraCallback2.onNavigationEvent(), writableNativeMap);
            int i3 = onExtraCallback + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return pair;
        }
    }

    private final Object __te(String str, boolean z, access13800<? super Pair<String, WritableNativeMap>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onExtraCallback(str, z, null), access13800Var);
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    private final Object __td(String str, ReadableMap readableMap, access13800<? super String> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new IAuthTabCallback(readableMap, str, null), access13800Var);
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return objOnExtraCallback;
    }

    @ReactMethod
    public final void eventLog(@NotNull ReadableMap readableMap) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(readableMap, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 reactModuleScope = getReactModuleScope();
        if (reactModuleScope != null) {
            maybeUpdateAnimatable.onNavigationEvent(reactModuleScope, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(readableMap, this, null), 3, (Object) null);
        }
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void registerVisibilityChangedEvent$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void registerVisibilityChangedEvent(ReactContext reactContext) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        final DeviceEventManagerModule.RCTDeviceEventEmitter jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        TossReactContentOwner reactContentOwner = getReactContentOwner();
        if (reactContentOwner != null) {
            int i4 = onNavigationEvent + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getByteBuffer getbytebufferIAuthTabCallback = reactContentOwner.IAuthTabCallback();
            if (getbytebufferIAuthTabCallback != null) {
                final Function1 function1 = new Function1() { // from class: im.toss.rn.toss.core.bridge.module.TossReactBridgeModule$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        Unit unit$r8$lambda$qysoxn7O3qSfhtE8JHPSodS5Zt0;
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 3;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 != 0) {
                            unit$r8$lambda$qysoxn7O3qSfhtE8JHPSodS5Zt0 = TossReactBridgeModule.$r8$lambda$qysoxn7O3qSfhtE8JHPSodS5Zt0(jSModule, (Boolean) obj);
                            int i8 = 9 / 0;
                        } else {
                            unit$r8$lambda$qysoxn7O3qSfhtE8JHPSodS5Zt0 = TossReactBridgeModule.$r8$lambda$qysoxn7O3qSfhtE8JHPSodS5Zt0(jSModule, (Boolean) obj);
                        }
                        int i9 = onWarmupCompleted + 63;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unit$r8$lambda$qysoxn7O3qSfhtE8JHPSodS5Zt0;
                        }
                        throw null;
                    }
                };
                deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferIAuthTabCallback.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.rn.toss.core.bridge.module.TossReactBridgeModule$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final void accept(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 19;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        TossReactBridgeModule.$r8$lambda$zmZyiRGJ53tAQGneHpUGhZYTEPA(function1, obj);
                        int i9 = onNavigationEvent + 7;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                    }
                });
                if (deserializeurinullablecollectionIAuthTabCallback != null) {
                    int i6 = onNavigationEvent + 37;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = this.tossReactContentOwnerRef.get();
                    if (i7 == 0) {
                        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionIAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
                        return;
                    }
                    IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionIAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    private static final Unit registerVisibilityChangedEvent$lambda$0(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        rCTDeviceEventEmitter.emit("visibilityChanged", bool);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @ReactMethod
    public final void setBreadcrumb(@NotNull String str) {
        MaxFullscreenAdImpl maxFullscreenAdImplAsInterface;
        String strOnExtraCallbackWithResult;
        String deploymentId;
        String deploymentId2;
        int i = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        TossReactContentOwner reactContentOwner = getReactContentOwner();
        MaxFullscreenAdImpl maxFullscreenAdImplAccess100 = reactContentOwner != null ? reactContentOwner.access100() : null;
        TossReactContentOwner reactContentOwner2 = getReactContentOwner();
        if (reactContentOwner2 != null) {
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                maxFullscreenAdImplAsInterface = reactContentOwner2.asInterface();
                int i3 = 72 / 0;
            } else {
                maxFullscreenAdImplAsInterface = reactContentOwner2.asInterface();
            }
            int i4 = onNavigationEvent + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            maxFullscreenAdImplAsInterface = null;
        }
        TossReactContentOwner reactContentOwner3 = getReactContentOwner();
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact = reactContentOwner3 != null ? reactContentOwner3.onTransact() : null;
        if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact == null || (strOnExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnTransact.onExtraCallbackWithResult()) == null) {
            strOnExtraCallbackWithResult = "";
        }
        if (maxFullscreenAdImplAccess100 == null || (deploymentId = getDeploymentId(maxFullscreenAdImplAccess100)) == null) {
            deploymentId = "";
        }
        if (maxFullscreenAdImplAsInterface != null && (deploymentId2 = getDeploymentId(maxFullscreenAdImplAsInterface)) != null) {
            str2 = deploymentId2;
        }
        leaveBreadcrumb(str, strOnExtraCallbackWithResult, str2, deploymentId);
    }

    static /* synthetic */ void leaveBreadcrumb$default(TossReactBridgeModule tossReactBridgeModule, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            str3 = "";
        }
        if ((i & 8) != 0) {
            int i7 = onNavigationEvent + 73;
            int i8 = i7 % 128;
            onExtraCallback = i8;
            if (i7 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i9 = i8 + 105;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            str4 = "";
        }
        tossReactBridgeModule.leaveBreadcrumb(str, str2, str3, str4);
    }

    private final void leaveBreadcrumb(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        auth.onNavigationEvent.onExtraCallbackWithResult(str, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("moduleName", str2), getWrite.IAuthTabCallback("serviceDeploymentId", str3), getWrite.IAuthTabCallback("sharedDeploymentId", str4)}), auth.onExtraCallbackWithResult.LOG);
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private final String getDeploymentId(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult;
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = null;
        if (i2 % 2 == 0) {
            boolean z = maxFullscreenAdImpl instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult;
            onextracallbackwithresult.hashCode();
            throw null;
        }
        if (maxFullscreenAdImpl instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
            int i4 = i3 + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                onextracallbackwithresult.hashCode();
                throw null;
            }
            onextracallbackwithresult = (MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImpl;
        }
        return (onextracallbackwithresult == null || (tossReactBundleMetaOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult()) == null || (strIAuthTabCallback = tossReactBundleMetaOnExtraCallbackWithResult.IAuthTabCallback()) == null) ? "" : strIAuthTabCallback;
    }

    public void invalidate() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*com.facebook.react.bridge.BaseJavaModule*/.invalidate();
        this.tossReactContentOwnerRef.clear();
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = new int[]{-866527399, -373091003, 1124575068, -1972737751, 1865126299, -1937943814, 1618432431, 261847169, 1248649416, 1177855778, 126170157, -614992742, 1535870675, 2062813446, 1004169584, -1632059582, -116825874, -211484238};
    }
}
