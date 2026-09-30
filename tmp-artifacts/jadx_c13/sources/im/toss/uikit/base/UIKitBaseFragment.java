package im.toss.uikit.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1nSDK4;
import o.AFj1oSDK;
import o.AFj1rSDKExternalSyntheticLambda2;
import o.AFj1rSDKExternalSyntheticLambda4;
import o.AFj1rSDKExternalSyntheticLambda6;
import o.AFj1sSDK5;
import o.ALCFaceEmotion;
import o.AppLovinSdkSdkInitializationListener;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.L_;
import o.NetConverter3;
import o.RememberLottieCompositionKtloadFontsFromAssets2;
import o.RememberLottieCompositionKtlottieComposition1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TimelineExternalSyntheticLambda0;
import o.clearPid;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeLongCollection;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.downloadZip;
import o.getAvailableMediatedNetworks;
import o.getByteBuffer;
import o.initMiniApp;
import o.isFireOS;
import o.onAppStart;
import o.onVisit;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setTid;
import o.setTopGuideText;
import o.sslSocketFactory;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class UIKitBaseFragment extends Fragment implements r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, L_, RememberLottieCompositionKtlottieComposition1, AFj1rSDKExternalSyntheticLambda6, getAvailableMediatedNetworks {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private static int extraCallbackWithResult = 0;
    private static long getInterfaceDescriptor = 0;
    private static int writeTypedObject = 1;
    private SparseArray<Parcelable> IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final ALCFaceEmotion IAuthTabCallbackStub;
    private final setTid<Boolean> IAuthTabCallback_Parcel;
    private final Lazy access100;
    private final sslSocketFactory asBinder;
    private boolean asInterface;
    private final boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private deserializeUriCollection onNavigationEvent;
    private final HashMap<String, deserializeUriNullableCollection> onTransact;
    private final AppLovinSdkSdkInitializationListener onWarmupCompleted;

    public static /* synthetic */ boolean $r8$lambda$InRHJTgegf0vafTdzsLJFKG7y8w(UIKitBaseFragment uIKitBaseFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean visibleState$lambda$0 = getVisibleState$lambda$0(uIKitBaseFragment, bool);
        int i4 = IAuthTabCallbackStubProxy + 65;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return visibleState$lambda$0;
        }
        throw null;
    }

    public static /* synthetic */ Boolean $r8$lambda$NP7QcofOUozZ1qPvxFtwDC72Od0(Pair pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            getVisibleState$lambda$2(pair);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean visibleState$lambda$2 = getVisibleState$lambda$2(pair);
        int i3 = access000 + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return visibleState$lambda$2;
    }

    public static /* synthetic */ boolean $r8$lambda$cr2vg5wJm5sAMZdKUyutSPMDnOw(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean visibleState$lambda$1 = getVisibleState$lambda$1(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 101;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return visibleState$lambda$1;
    }

    public static /* synthetic */ Boolean $r8$lambda$sC_pUv9VqOuogVxziXJo2VXlLgU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Boolean visibleState$lambda$3 = getVisibleState$lambda$3(function1, obj);
        int i4 = access000 + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return visibleState$lambda$3;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$sYrSaakR2bbfYVyGrtShuSCg8bw(UIKitBaseFragment uIKitBaseFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onViewCreated$lambda$0(uIKitBaseFragment, bool);
        }
        onViewCreated$lambda$0(uIKitBaseFragment, bool);
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$sezZe45pd416Y43FrZlWk19Pu9M(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onViewCreated$lambda$1(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean $r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs(UIKitBaseFragment uIKitBaseFragment) {
        int i = 2 % 2;
        int i2 = access000 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zUseAutoLog_delegate$lambda$0 = useAutoLog_delegate$lambda$0(uIKitBaseFragment);
        int i4 = IAuthTabCallbackStubProxy + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zUseAutoLog_delegate$lambda$0;
    }

    /* renamed from: $r8$lambda$zsgLg-XY4czVpxktt9jV7u26IxI, reason: not valid java name */
    public static /* synthetic */ AFj1sSDK5 m0$r8$lambda$zsgLgXY4czVpxktt9jV7u26IxI(UIKitBaseFragment uIKitBaseFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        AFj1sSDK5 aFj1sSDK5UiLaunchTimeProducer_delegate$lambda$0 = uiLaunchTimeProducer_delegate$lambda$0(uIKitBaseFragment);
        int i4 = IAuthTabCallbackStubProxy + 61;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return aFj1sSDK5UiLaunchTimeProducer_delegate$lambda$0;
    }

    static {
        cJ_();
        Companion = new onExtraCallbackWithResult(null);
        int i = extraCallbackWithResult + 71;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    protected String getAccessibilityPaneTitle(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i4 = access000 + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AFj1rSDKExternalSyntheticLambda6
    public void onFirstGlobalLayout() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public onNavigationEvent() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            UIKitBaseFragment.this.onGreatestScrollPercentageIncreased();
            int i12 = onWarmupCompleted + 119;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public /* bridge */ void clearAnimationStore() {
        int i = 2 % 2;
        int i2 = access000 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.clearAnimationStore();
        int i4 = access000 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void clearPlayable(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.clearPlayable(view);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = access000 + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ String getBiometricTitle() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String biometricTitle = super.getBiometricTitle();
        int i4 = access000 + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return biometricTitle;
    }

    @Override // o.L_
    public /* bridge */ AFj1nSDK4 getLogVersion() {
        int i = 2 % 2;
        int i2 = access000 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getLogVersion();
        }
        super.getLogVersion();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ isFireOS<?> getPlayable(@NotNull View view) {
        int i = 2 % 2;
        int i2 = access000 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.getPlayable(view);
            throw null;
        }
        isFireOS<?> playable = super.getPlayable(view);
        int i3 = IAuthTabCallbackStubProxy + 43;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
        }
        return playable;
    }

    public /* bridge */ isFireOS<?> getPlayable(@NotNull View view, long j) {
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getPlayable(view, j);
        }
        super.getPlayable(view, j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ List<isFireOS<?>> getPlayables(@NotNull View view) {
        int i = 2 % 2;
        int i2 = access000 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.getPlayables(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<isFireOS<?>> playables = super.getPlayables(view);
        int i3 = IAuthTabCallbackStubProxy + 123;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return playables;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ String getScreenHash() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getScreenHash();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String screenHash = super.getScreenHash();
        int i3 = access000 + 29;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return screenHash;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String screenName = super.getScreenName();
        int i4 = IAuthTabCallbackStubProxy + 57;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return screenName;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ Map<String, Object> getScreenParams() {
        Map<String, Object> screenParams;
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            screenParams = super.getScreenParams();
            int i3 = 53 / 0;
        } else {
            screenParams = super.getScreenParams();
        }
        int i4 = IAuthTabCallbackStubProxy + 113;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return screenParams;
        }
        throw null;
    }

    @Override // o.AFj1rSDKExternalSyntheticLambda6
    public /* bridge */ boolean isSplashScreen() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsSplashScreen = super.isSplashScreen();
        int i4 = IAuthTabCallbackStubProxy + 83;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zIsSplashScreen;
    }

    @Override // o.L_
    public /* bridge */ void onPrepareTrackViewParams(@NotNull Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPrepareTrackViewParams(map);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 81;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackBottomSheetView() {
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackBottomSheetView = super.onTrackBottomSheetView();
        int i4 = IAuthTabCallbackStubProxy + 71;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnTrackBottomSheetView;
        }
        throw null;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackView() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onTrackView();
            obj.hashCode();
            throw null;
        }
        boolean zOnTrackView = super.onTrackView();
        int i3 = access000 + 125;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnTrackView;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackView(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackView = super.onTrackView(z);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        int i5 = access000 + 1;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return zOnTrackView;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackViewInternal(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = access000 + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackViewInternal = super.onTrackViewInternal(z, z2);
        int i4 = access000 + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTrackViewInternal;
        }
        throw null;
    }

    private final AFj1sSDK5 getUiLaunchTimeProducer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        AFj1sSDK5 aFj1sSDK5 = (AFj1sSDK5) this.IAuthTabCallbackDefault.getValue();
        int i3 = access000 + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return aFj1sSDK5;
        }
        obj.hashCode();
        throw null;
    }

    private static final AFj1sSDK5 uiLaunchTimeProducer_delegate$lambda$0(UIKitBaseFragment uIKitBaseFragment) {
        int i = 2 % 2;
        AFj1sSDK5 aFj1sSDK5 = new AFj1sSDK5(uIKitBaseFragment);
        int i2 = access000 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return aFj1sSDK5;
        }
        throw null;
    }

    public AppLovinSdkSdkInitializationListener getAnimationStore() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 79;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener = this.onWarmupCompleted;
        int i4 = i2 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinSdkSdkInitializationListener;
        }
        obj.hashCode();
        throw null;
    }

    public sslSocketFactory getScrollTriggerStore() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 43;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        sslSocketFactory sslsocketfactory = this.asBinder;
        int i5 = i2 + 15;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return sslsocketfactory;
    }

    private static final boolean useAutoLog_delegate$lambda$0(UIKitBaseFragment uIKitBaseFragment) {
        int i = 2 % 2;
        int i2 = access000 + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        boolean z = uIKitBaseFragment instanceof initMiniApp;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    protected final boolean getUseAutoLog() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.access100.getValue()).booleanValue();
        int i4 = access000 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    @Override // o.L_
    public String getReferrerParam() throws Throwable {
        L_ l_;
        int i = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = IAuthTabCallbackStubProxy + 93;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            h(new char[]{59299, '[', 28170, 59345, 37219, 51529, 64642, 52579, 49677, 61306, 54949, 4944}, (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr);
            String string = arguments.getString(((String) objArr[0]).intern());
            if (string != null) {
                int i4 = IAuthTabCallbackStubProxy + 123;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                return string;
            }
        }
        L_ activity = getActivity();
        Object obj = null;
        if (activity != null) {
            if (activity instanceof L_) {
                int i6 = access000 + 53;
                IAuthTabCallbackStubProxy = i6 % 128;
                l_ = activity;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                l_ = null;
            }
            if (l_ != null) {
                int i7 = access000 + 125;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                return l_.getReferrerParam();
            }
        }
        return null;
    }

    public UIKitBaseFragment() {
        this.onTransact = new HashMap<>(1);
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        this.IAuthTabCallback_Parcel = settidOnNavigationEvent;
        this.IAuthTabCallback = new SparseArray<>();
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AFj1sSDK5 aFj1sSDK5M0$r8$lambda$zsgLgXY4czVpxktt9jV7u26IxI = UIKitBaseFragment.m0$r8$lambda$zsgLgXY4czVpxktt9jV7u26IxI(this.f$0);
                int i4 = onWarmupCompleted + 43;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return aFj1sSDK5M0$r8$lambda$zsgLgXY4czVpxktt9jV7u26IxI;
                }
                throw null;
            }
        });
        this.onWarmupCompleted = new AppLovinSdkSdkInitializationListener();
        this.asBinder = new sslSocketFactory();
        this.access100 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                boolean z$r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs = UIKitBaseFragment.$r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs(this.f$0);
                if (i3 != 0) {
                    return Boolean.valueOf(z$r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs);
                }
                int i4 = 64 / 0;
                return Boolean.valueOf(z$r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs);
            }
        });
        this.asInterface = true;
    }

    private static void h(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(getInterfaceDescriptor ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 111;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(getInterfaceDescriptor)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45812), 85 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - ((Process.getThreadPriority(0) + 20) >> 6)), KeyEvent.getDeadChar(0, 0) + 19, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 109;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i8 = $10 + 85;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    public UIKitBaseFragment(int i) {
        super(i);
        this.onTransact = new HashMap<>(1);
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        this.IAuthTabCallback_Parcel = settidOnNavigationEvent;
        this.IAuthTabCallback = new SparseArray<>();
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onWarmupCompleted + 45;
                IAuthTabCallback = i22 % 128;
                int i3 = i22 % 2;
                AFj1sSDK5 aFj1sSDK5M0$r8$lambda$zsgLgXY4czVpxktt9jV7u26IxI = UIKitBaseFragment.m0$r8$lambda$zsgLgXY4czVpxktt9jV7u26IxI(this.f$0);
                int i4 = onWarmupCompleted + 43;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return aFj1sSDK5M0$r8$lambda$zsgLgXY4czVpxktt9jV7u26IxI;
                }
                throw null;
            }
        });
        this.onWarmupCompleted = new AppLovinSdkSdkInitializationListener();
        this.asBinder = new sslSocketFactory();
        this.access100 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i22 % 128;
                int i3 = i22 % 2;
                boolean z$r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs = UIKitBaseFragment.$r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs(this.f$0);
                if (i3 != 0) {
                    return Boolean.valueOf(z$r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs);
                }
                int i4 = 64 / 0;
                return Boolean.valueOf(z$r8$lambda$tcJ4EyWVMxJ3PcElGh7LDJWYQOs);
            }
        });
        this.asInterface = true;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public void addSubscription(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        deserializeUriCollection deserializeuricollection = this.onNavigationEvent;
        if (deserializeuricollection != null) {
            int i3 = access000 + 5;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                deserializeuricollection.isDisposed();
                obj.hashCode();
                throw null;
            }
            if (!deserializeuricollection.isDisposed()) {
                deserializeuricollection.onNavigationEvent(deserializeurinullablecollection);
                int i4 = access000 + 37;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        this.onNavigationEvent = new deserializeUriCollection(deserializeurinullablecollection);
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public void removeSubscription(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        deserializeUriCollection deserializeuricollection = this.onNavigationEvent;
        if (deserializeuricollection != null) {
            int i2 = access000 + 63;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            deserializeuricollection.onExtraCallbackWithResult(deserializeurinullablecollection);
        }
        int i4 = access000 + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void autoDisposable(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        addSubscription(deserializeurinullablecollection);
        int i4 = access000 + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void releaseSubscriptions() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        try {
            deserializeUriCollection deserializeuricollection = this.onNavigationEvent;
            if (deserializeuricollection != null) {
                deserializeuricollection.onExtraCallbackWithResult();
                int i4 = access000 + 67;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.onTransact.clear();
            throw th;
        }
        this.onTransact.clear();
    }

    public final deserializeUriNullableCollection addSubscription(@NotNull String str, @NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        deserializeUriNullableCollection deserializeurinullablecollectionPut = this.onTransact.put(str, deserializeurinullablecollection);
        if (deserializeurinullablecollectionPut != null) {
            int i2 = IAuthTabCallbackStubProxy + 3;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            removeSubscription(deserializeurinullablecollectionPut);
            int i4 = access000 + 13;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        addSubscription(deserializeurinullablecollection);
        return deserializeurinullablecollectionPut;
    }

    protected final deserializeUriNullableCollection autoDisposable(@NotNull deserializeUriNullableCollection deserializeurinullablecollection, @NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
            Intrinsics.checkNotNullParameter(str, "");
            return addSubscription(str, deserializeurinullablecollection);
        }
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        Intrinsics.checkNotNullParameter(str, "");
        addSubscription(str, deserializeurinullablecollection);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deserializeUriNullableCollection getSubscription(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.onTransact.get(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = 41 / 0;
        return this.onTransact.get(str);
    }

    public final void releaseSubscription(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        deserializeUriNullableCollection deserializeurinullablecollectionRemove = this.onTransact.remove(str);
        if (deserializeurinullablecollectionRemove != null) {
            removeSubscription(deserializeurinullablecollectionRemove);
            int i4 = access000 + 69;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("FragmentInstanceStateData");
            if (sparseParcelableArray == null) {
                sparseParcelableArray = new SparseArray<>();
            }
            this.IAuthTabCallback = sparseParcelableArray;
        }
        Object objOnTransact$128544c1 = RememberLottieCompositionKtloadFontsFromAssets2.Companion.onExtraCallback().onTransact$128544c1();
        if (objOnTransact$128544c1 != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            try {
                Object[] objArr = {contextRequireContext, getClass()};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(786135490);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 6567, 530286418, false, "onNavigationEvent", new Class[]{Context.class, Class.class});
                }
                ((Method) objOnExtraCallback).invoke(objOnTransact$128544c1, objArr);
                int i2 = IAuthTabCallbackStubProxy + 65;
                access000 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i4 = IAuthTabCallbackStubProxy + 13;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public void putInstanceStateData(int i, @Nullable Parcelable parcelable) {
        int i2 = 2 % 2;
        int i3 = access000 + 79;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback.put(i, parcelable);
        int i5 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public Parcelable getInstanceStateData(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 13;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Parcelable parcelable = this.IAuthTabCallback.get(i);
        int i5 = IAuthTabCallbackStubProxy + 51;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return parcelable;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putSparseParcelableArray("FragmentInstanceStateData", this.IAuthTabCallback);
        super.onSaveInstanceState(bundle);
        int i4 = IAuthTabCallbackStubProxy + 79;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 51;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            super.onActivityResult(i, i2, intent);
            if (this instanceof WebViewContentOwner) {
                int i5 = IAuthTabCallbackStubProxy + 63;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                setTopGuideText settopguidetext = setTopGuideText.onWarmupCompleted;
                if (i6 != 0) {
                    settopguidetext.onExtraCallbackWithResult((WebViewContentOwner) this, i, i2, intent);
                    return;
                } else {
                    settopguidetext.onExtraCallbackWithResult((WebViewContentOwner) this, i, i2, intent);
                    throw null;
                }
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
        boolean z = this instanceof WebViewContentOwner;
        throw null;
    }

    private static final void onViewCreated$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 31;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onViewCreated$lambda$0(UIKitBaseFragment uIKitBaseFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (bool.booleanValue()) {
            int i4 = IAuthTabCallbackStubProxy + 111;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                AFj1oSDK.onExtraCallbackWithResult.onNavigationEvent(uIKitBaseFragment);
            } else {
                AFj1oSDK.onExtraCallbackWithResult.onNavigationEvent(uIKitBaseFragment);
                throw null;
            }
        }
        Intrinsics.checkNotNull(bool);
        uIKitBaseFragment.onUserVisible(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getByteBuffer<Boolean> visibleState = getVisibleState();
        final Function1 function1 = new Function1() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 125;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    UIKitBaseFragment.$r8$lambda$sYrSaakR2bbfYVyGrtShuSCg8bw(this.f$0, (Boolean) obj);
                    throw null;
                }
                Unit unit$r8$lambda$sYrSaakR2bbfYVyGrtShuSCg8bw = UIKitBaseFragment.$r8$lambda$sYrSaakR2bbfYVyGrtShuSCg8bw(this.f$0, (Boolean) obj);
                int i4 = IAuthTabCallback + 89;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit$r8$lambda$sYrSaakR2bbfYVyGrtShuSCg8bw;
                }
                throw null;
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = visibleState.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 65;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                UIKitBaseFragment.$r8$lambda$sezZe45pd416Y43FrZlWk19Pu9M(function1, obj);
                if (i4 == 0) {
                    int i5 = 55 / 0;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        addSubscription(deserializeurinullablecollectionIAuthTabCallback);
        getUiLaunchTimeProducer().onExtraCallback(this, view, this.IAuthTabCallbackStub);
        setAccessibilityPaneTitle(view);
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = true;
        super.onResume();
        Boolean boolOnWarmupCompleted = this.IAuthTabCallback_Parcel.onWarmupCompleted();
        Boolean bool = Boolean.TRUE;
        if (!(!Intrinsics.areEqual(boolOnWarmupCompleted, bool))) {
            return;
        }
        int i4 = IAuthTabCallbackStubProxy + 27;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        this.IAuthTabCallback_Parcel.onExtraCallback((setTid<Boolean>) bool);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        super.onPause();
        try {
            Result.Companion companion = Result.Companion;
            if (requireActivity().getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                this.asInterface = true;
            }
            Result.m31constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th));
            int i2 = access000 + 91;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 5;
            }
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback_Parcel.onWarmupCompleted(), Boolean.TRUE)) {
            int i4 = IAuthTabCallbackStubProxy + 21;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            this.IAuthTabCallback_Parcel.onExtraCallback((setTid<Boolean>) Boolean.FALSE);
        }
    }

    public void onStop() {
        boolean z;
        int i = 2 % 2;
        int i2 = access000 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStop();
            z = false;
        } else {
            super.onStop();
            z = true;
        }
        this.asInterface = z;
        int i3 = IAuthTabCallbackStubProxy + 35;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUserVisibleHint(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.setUserVisibleHint(z);
        if (!(!this.onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallbackStubProxy + 67;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(this.IAuthTabCallback_Parcel.onWarmupCompleted(), Boolean.valueOf(z));
                throw null;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback_Parcel.onWarmupCompleted(), Boolean.valueOf(z))) {
                int i5 = IAuthTabCallbackStubProxy + 1;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                this.IAuthTabCallback_Parcel.onExtraCallback((setTid<Boolean>) Boolean.valueOf(z));
            }
        }
        if (!z) {
            int i7 = IAuthTabCallbackStubProxy + 71;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            this.asInterface = true;
        }
    }

    private static final boolean getVisibleState$lambda$0(UIKitBaseFragment uIKitBaseFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        if (uIKitBaseFragment.getLifecycle().IAuthTabCallback() != TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) {
            int i4 = IAuthTabCallbackStubProxy + 95;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = access000 + 87;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean getVisibleState$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = access000 + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final Boolean getVisibleState$lambda$2(Pair pair) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((Boolean) pair.getFirst()).booleanValue() && ((Boolean) pair.getSecond()).booleanValue()) {
            z = true;
        } else {
            int i4 = access000 + 17;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static final Boolean getVisibleState$lambda$3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 91;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public getByteBuffer<Boolean> getVisibleState() {
        UIKitBaseFragment uIKitBaseFragment;
        int i = 2 % 2;
        getByteBuffer<Boolean> getbytebufferOnExtraCallbackWithResult = this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(50L, TimeUnit.MILLISECONDS, NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(UIKitBaseFragment.$r8$lambda$InRHJTgegf0vafTdzsLJFKG7y8w(this.f$0, (Boolean) obj));
                int i5 = onNavigationEvent + 101;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        };
        getByteBuffer<Boolean> getbytebufferAsBinder = getbytebufferOnExtraCallbackWithResult.onTransact(new deserializeLongCollection() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // o.deserializeLongCollection
            public final boolean test(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Function1 function12 = function1;
                if (i4 == 0) {
                    return UIKitBaseFragment.$r8$lambda$cr2vg5wJm5sAMZdKUyutSPMDnOw(function12, obj);
                }
                UIKitBaseFragment.$r8$lambda$cr2vg5wJm5sAMZdKUyutSPMDnOw(function12, obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }).asBinder();
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof UIKitBaseFragment) {
            int i2 = IAuthTabCallbackStubProxy + 93;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            uIKitBaseFragment = (UIKitBaseFragment) parentFragment;
        } else {
            int i4 = IAuthTabCallbackStubProxy + 73;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            uIKitBaseFragment = null;
        }
        if (uIKitBaseFragment != null) {
            clearPid clearpid = clearPid.onWarmupCompleted;
            Intrinsics.checkNotNull(getbytebufferAsBinder);
            getByteBuffer getbytebufferOnWarmupCompleted = clearpid.onWarmupCompleted(getbytebufferAsBinder, uIKitBaseFragment.getVisibleState());
            final Function1 function12 = new Function1() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 83;
                    onExtraCallback = i7 % 128;
                    Pair pair = (Pair) obj;
                    if (i7 % 2 == 0) {
                        UIKitBaseFragment.$r8$lambda$NP7QcofOUozZ1qPvxFtwDC72Od0(pair);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Boolean bool$r8$lambda$NP7QcofOUozZ1qPvxFtwDC72Od0 = UIKitBaseFragment.$r8$lambda$NP7QcofOUozZ1qPvxFtwDC72Od0(pair);
                    int i8 = onExtraCallback + 89;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return bool$r8$lambda$NP7QcofOUozZ1qPvxFtwDC72Od0;
                }
            };
            getByteBuffer<Boolean> getbytebufferAsInterface = getbytebufferOnWarmupCompleted.asInterface(new deserializeIntNullableCollection() { // from class: im.toss.uikit.base.UIKitBaseFragment$$ExternalSyntheticLambda5
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // o.deserializeIntNullableCollection
                public final Object apply(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 1;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        UIKitBaseFragment.$r8$lambda$sC_pUv9VqOuogVxziXJo2VXlLgU(function12, obj);
                        throw null;
                    }
                    Boolean bool$r8$lambda$sC_pUv9VqOuogVxziXJo2VXlLgU = UIKitBaseFragment.$r8$lambda$sC_pUv9VqOuogVxziXJo2VXlLgU(function12, obj);
                    int i8 = onExtraCallbackWithResult + 75;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return bool$r8$lambda$sC_pUv9VqOuogVxziXJo2VXlLgU;
                }
            });
            Intrinsics.checkNotNullExpressionValue(getbytebufferAsInterface, "");
            return getbytebufferAsInterface;
        }
        Intrinsics.checkNotNull(getbytebufferAsBinder);
        return getbytebufferAsBinder;
    }

    public void onUserVisible(boolean z) {
        View view;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 47;
        int i4 = i3 % 128;
        access000 = i4;
        int i5 = i3 % 2;
        if (!z) {
            if (this instanceof initMiniApp) {
                int i6 = i2 + 125;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                ((initMiniApp) this).writeTypedList();
            }
            if (this.onExtraCallback) {
                onVisit.IAuthTabCallback(this);
                return;
            }
            return;
        }
        int i8 = i4 + 97;
        IAuthTabCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
        if (this.onExtraCallback) {
            onVisit.IAuthTabCallback(this);
        }
        if (this.asInterface) {
            this.asInterface = false;
            onTrackView();
            if (!(this instanceof initMiniApp) || (view = getView()) == null) {
                return;
            }
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new onNavigationEvent());
                return;
            }
            ((initMiniApp) this).onGreatestScrollPercentageIncreased();
            int i10 = access000 + 29;
            IAuthTabCallbackStubProxy = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            releaseSubscriptions();
            clearAnimationStore();
            super.onDestroyView();
            int i3 = 1 / 0;
        } else {
            releaseSubscriptions();
            clearAnimationStore();
            super.onDestroyView();
        }
        int i4 = IAuthTabCallbackStubProxy + 103;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onDestroy() {
        int i = 2 % 2;
        if (!(!(this instanceof initMiniApp))) {
            int i2 = access000 + 17;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                ((initMiniApp) this).IEngagementSignalsCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((initMiniApp) this).IEngagementSignalsCallback();
            int i3 = access000 + 43;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 3;
            }
        }
        this.IAuthTabCallback_Parcel.onExtraCallback();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.content.Context, im.toss.uikit.base.UIKitBaseActivity] */
    @Override // o.AFj1rSDKExternalSyntheticLambda6
    public void onUiLaunchTime(@NotNull ALCFaceEmotion aLCFaceEmotion) {
        ?? r3;
        Long lValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceEmotion, "");
        UIKitBaseActivity activity = getActivity();
        Object obj = null;
        if (activity instanceof UIKitBaseActivity) {
            int i2 = IAuthTabCallbackStubProxy + 115;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            r3 = activity;
        } else {
            int i3 = access000 + 123;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            r3 = 0;
        }
        boolean zMediaSessionCompatResultReceiverWrapper = r3 != 0 ? r3.MediaSessionCompatResultReceiverWrapper() : false;
        boolean zExtraCallbackWithResult = r3 != 0 ? r3.extraCallbackWithResult() : false;
        AFj1rSDKExternalSyntheticLambda4 aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult = r3 != 0 ? AFj1rSDKExternalSyntheticLambda2.onExtraCallbackWithResult(r3) : null;
        String strIAuthTabCallback = onVisit.IAuthTabCallback(this);
        String screenName = getScreenName();
        Boolean boolOnExtraCallbackWithResult = aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult != null ? aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallbackWithResult() : null;
        Long lValueOf2 = aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult != null ? Long.valueOf(aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback()) : null;
        if (aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult != null) {
            int i5 = access000 + 23;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            lValueOf = Long.valueOf(aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.onNavigationEvent());
        } else {
            int i7 = access000 + 1;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 5;
            }
            lValueOf = null;
        }
        downloadZip downloadzipOnExtraCallbackWithResult = aLCFaceEmotion.onExtraCallbackWithResult(strIAuthTabCallback, screenName, Boolean.valueOf(zMediaSessionCompatResultReceiverWrapper), boolOnExtraCallbackWithResult, zExtraCallbackWithResult, lValueOf2, lValueOf, aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult != null ? Long.valueOf(aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.onWarmupCompleted()) : null, aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult != null ? aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback() : null);
        if (downloadzipOnExtraCallbackWithResult != null) {
            ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -870178991, new Object[]{downloadzipOnExtraCallbackWithResult}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
            int i9 = IAuthTabCallbackStubProxy + 95;
            access000 = i9 % 128;
            int i10 = i9 % 2;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        onAppStart.IAuthTabCallback(fragmentActivityRequireActivity);
    }

    private final void setAccessibilityPaneTitle(View view) {
        int i = 2 % 2;
        int i2 = access000 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ViewCompat.IAuthTabCallback(view, getAccessibilityPaneTitle(context));
            throw null;
        }
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        ViewCompat.IAuthTabCallback(view, getAccessibilityPaneTitle(context2));
        int i3 = access000 + 109;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
        }
    }

    static void cJ_() {
        getInterfaceDescriptor = 1707506398077366907L;
    }
}
