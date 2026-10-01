package o;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.tmoney.a;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.widget.underlay.DecorUnderlayViewController$;
import im.toss.uikit.widget.underlay.PulseRingView;
import im.toss.uikit.widget.underlay.ShimmerSweepLayout;
import im.toss.uikit.widget.underlay.UnderlayTextView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import o.AppWithState;
import o.WebSocketFactory;
import o.getStartTimeMsbugsnag_android_core_release;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AppWithState {
    private static int newAuthTabSession = 0;
    private static int requestPostMessageChannel = 1;
    private final onWarmupCompleted IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private Function1<? super View, Unit> IAuthTabCallbackStub;
    private Function0<Unit> IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private int ICustomTabsCallbackDefault;
    private Integer ICustomTabsCallbackStub;
    private final int ICustomTabsCallbackStubProxy;
    private final View ICustomTabsCallback_Parcel;
    private WindowInsetsCompat ICustomTabsService;
    private View access000;
    private findExitInfoByPidbugsnag_plugin_android_exitinfo_release access100;
    private final generateHistoricAppWithState asBinder;
    private int asInterface;
    private boolean extraCallback;
    private boolean extraCallbackWithResult;
    private final int extraCommand;
    private Float getInterfaceDescriptor;
    private ShimmerSweepLayout isEngagementSignalsApiAvailable;
    private final View mayLaunchUrl;
    private ValueAnimator newSession;
    private final int newSessionWithExtras;
    private boolean onActivityLayout;
    private final float onActivityResized;
    private onExtraCallback onExtraCallback;
    private final getInForeground onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private final int onMinimized;
    private final int onNavigationEvent;
    private final int onPostMessage;
    private int onRelationshipValidationResult;
    private int onTransact;
    private Function0<Unit> onUnminimized;
    private final Activity onWarmupCompleted;
    private final View.OnLayoutChangeListener postMessage;
    private final Rect prefetch;
    private boolean readTypedObject;
    private final int writeTypedObject;

    public static /* synthetic */ Unit IAuthTabCallback(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 35;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(appWithState);
        int i4 = newAuthTabSession + 125;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 27;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(appWithState, i);
        int i5 = newAuthTabSession + 123;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ boolean IAuthTabCallback(AppWithState appWithState, Ref.FloatRef floatRef, Ref.IntRef intRef, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + Imgproc.COLOR_YUV2RGB_YVYU;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(appWithState, floatRef, intRef, view, motionEvent);
        int i4 = newAuthTabSession + 81;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 5;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {appWithState, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallback(53127552, -53127547, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i5 = requestPostMessageChannel + 99;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 5;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor(appWithState, iIntValue);
        }
        getInterfaceDescriptor(appWithState, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = (findExitInfoByPidbugsnag_plugin_android_exitinfo_release) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 17;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(findexitinfobypidbugsnag_plugin_android_exitinfo_release, fFloatValue);
        int i4 = newAuthTabSession + 109;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ WindowInsetsCompat onExtraCallback(AppWithState appWithState, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 41;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnWarmupCompleted = onWarmupCompleted(appWithState, view, windowInsetsCompat);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = newAuthTabSession + 11;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return windowInsetsCompatOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i3)) | i8 | (~(i2 | i3));
        int i10 = (~(i7 | (~i3))) | i8;
        int i11 = (~(i3 | i)) | (~((~i2) | i));
        int i12 = i + i2 + i5 + (929125522 * i4) + (1849324972 * i6);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i) + 1146290176 + ((-1462591364) * i2) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i5) + ((-291241984) * i4) + (1012400128 * i6) + ((-1810169856) * i13);
        int i15 = ((i * (-2058557531)) - 518432259) + (i2 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i5 * (-2058558961)) + (i4 * 548722830) + (i6 * 1549712660) + (i13 * (-2087387136));
        switch (i14 + (i15 * i15 * (-343605248))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return access000(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                AppWithState appWithState = (AppWithState) objArr[0];
                int i16 = 2 % 2;
                int i17 = requestPostMessageChannel + Imgproc.COLOR_YUV2RGB_YVYU;
                newAuthTabSession = i17 % 128;
                int i18 = i17 % 2;
                View view = appWithState.mayLaunchUrl;
                while (view != null) {
                    int i19 = newAuthTabSession + 1;
                    requestPostMessageChannel = i19 % 128;
                    int i20 = i19 % 2;
                    if (view.getId() == 16908290) {
                        return view;
                    }
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        view = null;
                    } else {
                        int i21 = newAuthTabSession + 67;
                        requestPostMessageChannel = i21 % 128;
                        int i22 = i21 % 2;
                        view = (View) parent;
                    }
                }
                return appWithState.mayLaunchUrl;
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                return writeTypedObject(objArr);
            case 17:
                return readTypedObject(objArr);
            case 18:
                return ICustomTabsCallback(objArr);
            case 19:
                return extraCallbackWithResult(objArr);
            case 20:
                return extraCallback(objArr);
            case 21:
                return onMessageChannelReady(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 111;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(-592633558, 592633569, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i4 = requestPostMessageChannel + 113;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 3;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackStub(appWithState, i);
        }
        IAuthTabCallbackStub(appWithState, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 23;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, view);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = (findExitInfoByPidbugsnag_plugin_android_exitinfo_release) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 27;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appWithState, findexitinfobypidbugsnag_plugin_android_exitinfo_release);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = requestPostMessageChannel + 55;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 33;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess000 = access000(appWithState, i);
        int i5 = requestPostMessageChannel + 87;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ getStartTimeMsbugsnag_android_core_release onExtraCallbackWithResult(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 115;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release = (getStartTimeMsbugsnag_android_core_release) onExtraCallback(1864010828, -1864010820, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i4 = requestPostMessageChannel + 109;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return getstarttimemsbugsnag_android_core_release;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 49;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(appWithState);
        }
        asBinder(appWithState);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 23;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(appWithState);
        int i4 = newAuthTabSession + 93;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 105;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackStubProxy(appWithState, i);
        }
        IAuthTabCallbackStubProxy(appWithState, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(AppWithState appWithState, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = newAuthTabSession + 119;
        requestPostMessageChannel = i10 % 128;
        int i11 = i10 % 2;
        IAuthTabCallback(appWithState, view, i, i2, i3, i4, i5, i6, i7, i8);
        int i12 = requestPostMessageChannel + 81;
        newAuthTabSession = i12 % 128;
        int i13 = i12 % 2;
    }

    public static final class IAuthTabCallback implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public IAuthTabCallback() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onWarmupCompleted + 27;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                view.removeOnLayoutChangeListener(this);
                AppWithState appWithState = AppWithState.this;
                AppWithState.onTransact(appWithState, AppWithState.IAuthTabCallbackDefault(appWithState));
            } else {
                view.removeOnLayoutChangeListener(this);
                AppWithState appWithState2 = AppWithState.this;
                AppWithState.onTransact(appWithState2, AppWithState.IAuthTabCallbackDefault(appWithState2));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public AppWithState(@NotNull Activity activity, @NotNull View view, @NotNull onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onWarmupCompleted = activity;
        this.mayLaunchUrl = view;
        this.IAuthTabCallback = onwarmupcompleted;
        this.onNavigationEvent = varyMatches.IAuthTabCallback(24, activity);
        this.onActivityResized = varyMatches.onNavigationEvent(110, activity);
        this.writeTypedObject = varyMatches.IAuthTabCallback(20, activity);
        this.newSessionWithExtras = varyMatches.IAuthTabCallback(44, activity);
        this.ICustomTabsCallbackStubProxy = varyMatches.IAuthTabCallback(16, activity);
        this.onPostMessage = varyMatches.IAuthTabCallback(40, activity);
        this.onMinimized = varyMatches.IAuthTabCallback(20, activity);
        this.extraCommand = varyMatches.IAuthTabCallback(4, activity);
        this.IAuthTabCallback_Parcel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda7
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    AppWithState.onExtraCallbackWithResult(this.f$0);
                    obj.hashCode();
                    throw null;
                }
                getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_releaseOnExtraCallbackWithResult = AppWithState.onExtraCallbackWithResult(this.f$0);
                int i3 = onWarmupCompleted + 91;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return getstarttimemsbugsnag_android_core_releaseOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        this.onExtraCallbackWithResult = new getInForeground();
        this.asBinder = new generateHistoricAppWithState();
        this.prefetch = new Rect();
        this.postMessage = new View.OnLayoutChangeListener() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 93;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                AppWithState.onWarmupCompleted(this.f$0, view2, i, i2, i3, i4, i5, i6, i7, i8);
                int i12 = onWarmupCompleted + 63;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        View view2 = new View(activity);
        Context context = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (!((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            Configuration configuration = activity.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            view2.setBackgroundColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onWarmupCompleted().ICustomTabsCallback_Parcel());
            int i = requestPostMessageChannel + 97;
            newAuthTabSession = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        view2.setVisibility(8);
        this.ICustomTabsCallback_Parcel = view2;
        int i4 = requestPostMessageChannel + 11;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(AppWithState appWithState, boolean z) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 55;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        appWithState.extraCallback = z;
        int i5 = i2 + 7;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ int IAuthTabCallbackDefault(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 95;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        int i5 = appWithState.asInterface;
        int i6 = i3 + 11;
        newAuthTabSession = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 55 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 37;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        appWithState.writeTypedObject();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        int i5 = newAuthTabSession + 45;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ void onTransact(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 41;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        appWithState.onExtraCallbackWithResult(i);
        int i5 = newAuthTabSession + 67;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 71 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements Runnable {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ ViewGroup onExtraCallbackWithResult;
        final /* synthetic */ AppWithState onNavigationEvent;

        public asInterface(View view, ViewGroup viewGroup, AppWithState appWithState) {
            this.IAuthTabCallback = view;
            this.onExtraCallbackWithResult = viewGroup;
            this.onNavigationEvent = appWithState;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            ViewGroup viewGroup = this.onExtraCallbackWithResult;
            final AppWithState appWithState = this.onNavigationEvent;
            if (!viewGroup.post(new Runnable() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$schedulePresentedCallbackIfNeeded$$inlined$doOnPreDraw$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 93;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object[] objArr = {appWithState};
                        AppWithState.onExtraCallback(1638964145, -1638964131, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object[] objArr2 = {appWithState};
                    AppWithState.onExtraCallback(1638964145, -1638964131, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                    int i4 = onExtraCallback + 19;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }
            })) {
                int i2 = onWarmupCompleted + 77;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppWithState.IAuthTabCallback(this.onNavigationEvent, false);
                int i4 = onExtraCallback + 85;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = onExtraCallback + 71;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final String IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public onWarmupCompleted() {
            this(null, null, 0, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = i3 + 31;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                return this.onExtraCallbackWithResult == onwarmupcompleted.onExtraCallbackWithResult;
            }
            int i7 = onExtraCallback + 119;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.onWarmupCompleted.hashCode();
            String str = this.IAuthTabCallback;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i2 = onExtraCallback + 29;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode3;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Config(message=" + this.onWarmupCompleted + ", secondaryMessage=" + this.IAuthTabCallback + ", primaryMessageColor=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull String str, @Nullable String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
            this.IAuthTabCallback = str2;
            this.onExtraCallbackWithResult = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = onNavigationEvent + 43;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                str = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            str2 = (i2 & 2) != 0 ? null : str2;
            if ((i2 & 4) != 0) {
                int i6 = onNavigationEvent + 13;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                i = Color.parseColor("#FFFFFFFF");
                int i8 = 2 % 2;
            }
            this(str, str2, i);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 51;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallbackWithResult;
            int i6 = i2 + 89;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
    }

    static final class onExtraCallback {
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private final Boolean IAuthTabCallback;
        private final boolean IAuthTabCallbackDefault;
        private final boolean asBinder;
        private final ViewGroup onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final boolean onTransact;
        private final View onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback) || this.asBinder != onextracallback.asBinder) {
                return false;
            }
            if (this.onTransact != onextracallback.onTransact) {
                int i2 = asInterface + 23;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted) || this.onNavigationEvent != onextracallback.onNavigationEvent) {
                return false;
            }
            if (this.IAuthTabCallbackDefault != onextracallback.IAuthTabCallbackDefault) {
                int i4 = asInterface + 83;
                IAuthTabCallbackStub = i4 % 128;
                return i4 % 2 != 0;
            }
            if (this.onExtraCallbackWithResult == onextracallback.onExtraCallbackWithResult) {
                return Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback);
            }
            int i5 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i6 = i5 % 128;
            IAuthTabCallbackStub = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 95;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.onExtraCallback.hashCode();
            int iHashCode3 = Boolean.hashCode(this.asBinder);
            int iHashCode4 = Boolean.hashCode(this.onTransact);
            int iHashCode5 = this.onWarmupCompleted.hashCode();
            int iHashCode6 = Integer.hashCode(this.onNavigationEvent);
            int iHashCode7 = Boolean.hashCode(this.IAuthTabCallbackDefault);
            int iHashCode8 = Integer.hashCode(this.onExtraCallbackWithResult);
            Boolean bool = this.IAuthTabCallback;
            if (bool == null) {
                int i2 = asInterface + 51;
                IAuthTabCallbackStub = i2 % 128;
                iHashCode = i2 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = bool.hashCode();
            }
            int i3 = (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode;
            int i4 = IAuthTabCallbackStub + 17;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AttachSnapshot(parent=" + this.onExtraCallback + ", parentClipChildren=" + this.asBinder + ", parentClipToPadding=" + this.onTransact + ", contentOffsetTargetView=" + this.onWarmupCompleted + ", contentBottomMargin=" + this.onNavigationEvent + ", temporarilyEnabledEdgeToEdge=" + this.IAuthTabCallbackDefault + ", navigationBarColor=" + this.onExtraCallbackWithResult + ", navigationBarContrastEnforced=" + this.IAuthTabCallback + ")";
            int i2 = IAuthTabCallbackStub + 109;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull ViewGroup viewGroup, boolean z, boolean z2, @NotNull View view, int i, boolean z3, int i2, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(view, "");
            this.onExtraCallback = viewGroup;
            this.asBinder = z;
            this.onTransact = z2;
            this.onWarmupCompleted = view;
            this.onNavigationEvent = i;
            this.IAuthTabCallbackDefault = z3;
            this.onExtraCallbackWithResult = i2;
            this.IAuthTabCallback = bool;
        }

        public final ViewGroup onExtraCallbackWithResult() {
            ViewGroup viewGroup;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 59;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 == 0) {
                viewGroup = this.onExtraCallback;
                int i4 = 17 / 0;
            } else {
                viewGroup = this.onExtraCallback;
            }
            int i5 = i3 + 75;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return viewGroup;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asInterface + 93;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.asBinder;
            int i4 = i3 + 95;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final boolean onTransact() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 87;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onTransact;
            int i5 = i2 + 3;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final View IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 13;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            View view = this.onWarmupCompleted;
            int i5 = i2 + 67;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return view;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 75;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i3 + 75;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        public final boolean asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 47;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.IAuthTabCallbackDefault;
            int i5 = i2 + 119;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 85;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallbackWithResult;
            int i6 = i2 + 71;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final Boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 59;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            Boolean bool = this.IAuthTabCallback;
            int i4 = i3 + 37;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return bool;
            }
            throw null;
        }
    }

    private final getStartTimeMsbugsnag_android_core_release ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 49;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback_Parcel.getValue();
        if (i3 != 0) {
            return (getStartTimeMsbugsnag_android_core_release) value;
        }
        int i4 = 65 / 0;
        return (getStartTimeMsbugsnag_android_core_release) value;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        int i = 2 % 2;
        getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release = new getStartTimeMsbugsnag_android_core_release(appWithState.onWarmupCompleted, appWithState.mayLaunchUrl, appWithState.onNavigationEvent);
        int i2 = requestPostMessageChannel + 43;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            return getstarttimemsbugsnag_android_core_release;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(AppWithState appWithState, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = newAuthTabSession;
        int i11 = i10 + 25;
        requestPostMessageChannel = i11 % 128;
        if (i11 % 2 != 0 ? i3 - i == i7 - i5 : i3 - i == i7 - i5) {
            if (i4 - i2 == i8 - i6) {
                int i12 = i10 + 79;
                requestPostMessageChannel = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
        }
        appWithState.IAuthTabCallbackDefault(appWithState.IAuthTabCallbackDefault);
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + Imgproc.COLOR_YUV2RGB_YVYU;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        int i4 = newAuthTabSession + 77;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final ShimmerSweepLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 69;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        ShimmerSweepLayout shimmerSweepLayout = this.isEngagementSignalsApiAvailable;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return shimmerSweepLayout;
    }

    public final void onExtraCallback() {
        ViewGroup viewGroup;
        int i = 2 % 2;
        if (onExtraCallbackWithResult()) {
            int i2 = newAuthTabSession + 83;
            requestPostMessageChannel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 13 / 0;
                if (this.access100 != null) {
                    return;
                }
            } else if (this.access100 != null) {
                return;
            }
            View decorView = this.onWarmupCompleted.getWindow().getDecorView();
            if (decorView instanceof ViewGroup) {
                int i4 = requestPostMessageChannel + 39;
                newAuthTabSession = i4 % 128;
                int i5 = i4 % 2;
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                int i6 = newAuthTabSession + 35;
                requestPostMessageChannel = i6 % 128;
                int i7 = i6 % 2;
                findExitInfoByPidbugsnag_plugin_android_exitinfo_release typedObject = readTypedObject();
                ShimmerSweepLayout shimmerSweepLayoutExtraCallback = extraCallback();
                if (!IAuthTabCallback(viewGroup)) {
                    ICustomTabsCallback().onNavigationEvent();
                    return;
                }
                this.access100 = typedObject;
                onExtraCallback(813342404, -813342383, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, typedObject}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                onNavigationEvent(viewGroup, typedObject, shimmerSweepLayoutExtraCallback);
                onNavigationEvent(typedObject, shimmerSweepLayoutExtraCallback);
                int i8 = newAuthTabSession + 35;
                requestPostMessageChannel = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    private final findExitInfoByPidbugsnag_plugin_android_exitinfo_release readTypedObject() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 89;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_releaseIAuthTabCallback = ICustomTabsCallback().IAuthTabCallback(ICustomTabsCallback().onWarmupCompleted(this.IAuthTabCallback.onNavigationEvent(), this.IAuthTabCallback.onWarmupCompleted(), this.IAuthTabCallback.onExtraCallback()), this.IAuthTabCallback.onExtraCallback(), true);
        int i4 = newAuthTabSession + 87;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return findexitinfobypidbugsnag_plugin_android_exitinfo_releaseIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 31;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        appWithState.ICustomTabsCallback_Parcel.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 79;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 25;
        newAuthTabSession = i2 % 128;
        appWithState.ICustomTabsCallback_Parcel.setVisibility(i2 % 2 != 0 ? 5 : 8);
        return Unit.INSTANCE;
    }

    private final ShimmerSweepLayout extraCallback() {
        int i = 2 % 2;
        ShimmerSweepLayout shimmerSweepLayout = new ShimmerSweepLayout(this.onWarmupCompleted, null, 0, 6, null);
        shimmerSweepLayout.setOnStart(new Function0() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 61;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = AppWithState.onNavigationEvent(this.f$0);
                int i5 = onExtraCallback + 111;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        });
        shimmerSweepLayout.setOnCancel(new Function0() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 91;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                AppWithState appWithState = this.f$0;
                if (i4 == 0) {
                    return AppWithState.IAuthTabCallback(appWithState);
                }
                AppWithState.IAuthTabCallback(appWithState);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = newAuthTabSession + 37;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return shimmerSweepLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean IAuthTabCallback(ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        int i = 2 % 2;
        View view = (View) onExtraCallback(-941348213, 941348225, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            marginLayoutParams = null;
        } else {
            int i2 = requestPostMessageChannel + 119;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams == null) {
            return false;
        }
        boolean z2 = Build.VERSION.SDK_INT >= 29;
        boolean zOnExtraCallback = this.asBinder.onExtraCallback();
        boolean zAsBinder = asBinder(view);
        if (!zOnExtraCallback) {
            int i4 = newAuthTabSession + 29;
            requestPostMessageChannel = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            z = zAsBinder;
        }
        this.onExtraCallback = new onExtraCallback(viewGroup, viewGroup.getClipChildren(), viewGroup.getClipToPadding(), view, marginLayoutParams.bottomMargin, z, extraCallbackWithResult(), z2 ? Boolean.valueOf(this.onWarmupCompleted.getWindow().isNavigationBarContrastEnforced()) : null);
        onExtraCallback(-1945509171, 1945509175, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        if (z) {
            int iOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult();
            RepeatableSpec.onExtraCallbackWithResult(this.onWarmupCompleted.getWindow(), false);
            onTransact(iOnExtraCallbackWithResult);
        }
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        return true;
    }

    private final boolean asBinder(View view) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 35) {
            WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(view);
            if (windowInsetsCompatICustomTabsCallback == null) {
                return false;
            }
            int i2 = windowInsetsCompatICustomTabsCallback.onExtraCallbackWithResult(WindowInsetsCompat.onTransact.IAuthTabCallbackDefault()).onWarmupCompleted;
            int i3 = windowInsetsCompatICustomTabsCallback.onExtraCallbackWithResult(WindowInsetsCompat.onTransact.asInterface()).onExtraCallback;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr);
            this.onWarmupCompleted.getWindow().getDecorView().getLocationInWindow(iArr2);
            boolean zIAuthTabCallback = windowInsetsCompatICustomTabsCallback.IAuthTabCallback(WindowInsetsCompat.onTransact.IAuthTabCallback());
            int i4 = iArr[1];
            int height = view.getHeight();
            int i5 = iArr2[1];
            boolean zOnNavigationEvent = getDurationInForeground.onNavigationEvent(i2, i3, zIAuthTabCallback, i4, i4 + height, i5, i5 + this.onWarmupCompleted.getWindow().getDecorView().getHeight());
            int i6 = requestPostMessageChannel + 77;
            newAuthTabSession = i6 % 128;
            int i7 = i6 % 2;
            return zOnNavigationEvent;
        }
        int i8 = newAuthTabSession + 21;
        requestPostMessageChannel = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = (findExitInfoByPidbugsnag_plugin_android_exitinfo_release) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 1;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact().setVisibility(5);
            findexitinfobypidbugsnag_plugin_android_exitinfo_release.asInterface().setVisibility(2);
        } else {
            findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact().setVisibility(4);
            findexitinfobypidbugsnag_plugin_android_exitinfo_release.asInterface().setVisibility(4);
        }
        appWithState.onNavigationEvent((View) findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder());
        int i3 = requestPostMessageChannel + 35;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void onNavigationEvent(ViewGroup viewGroup, findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release, ShimmerSweepLayout shimmerSweepLayout) {
        int childCount;
        int i = 2 % 2;
        View view = (View) getDurationInForeground.onNavigationEvent(a.3.onWarmupCompleted(), new Object[]{viewGroup, this.mayLaunchUrl}, -1527201072, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1527201074, a.3.onWarmupCompleted());
        viewGroup.addView(findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact(), onNavigationEvent(viewGroup, view), onWarmupCompleted(viewGroup));
        View viewAsInterface = findexitinfobypidbugsnag_plugin_android_exitinfo_release.asInterface();
        if (view == null) {
            childCount = viewGroup.getChildCount();
        } else {
            int i2 = requestPostMessageChannel + 93;
            newAuthTabSession = i2 % 128;
            childCount = i2 % 2 != 0 ? viewGroup.indexOfChild(view) : viewGroup.indexOfChild(view) + 1;
        }
        viewGroup.addView(viewAsInterface, childCount, (ViewGroup.LayoutParams) onExtraCallback(1978689941, -1978689922, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, viewGroup}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted()));
        viewGroup.addView(this.ICustomTabsCallback_Parcel, onExtraCallbackWithResult(viewGroup));
        viewGroup.addView(shimmerSweepLayout, onExtraCallbackWithResult(viewGroup));
        int i3 = newAuthTabSession + 99;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release, ShimmerSweepLayout shimmerSweepLayout) {
        int i = 2 % 2;
        this.isEngagementSignalsApiAvailable = shimmerSweepLayout;
        onWarmupCompleted(findexitinfobypidbugsnag_plugin_android_exitinfo_release.onNavigationEvent());
        findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder().addOnLayoutChangeListener(this.postMessage);
        ViewGroup viewGroupOnTransact = findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact();
        if (!(!viewGroupOnTransact.isLaidOut())) {
            int i2 = requestPostMessageChannel + 111;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            if (viewGroupOnTransact.isLayoutRequested()) {
                viewGroupOnTransact.addOnLayoutChangeListener(new IAuthTabCallback());
            } else {
                int i4 = requestPostMessageChannel + 49;
                newAuthTabSession = i4 % 128;
                int i5 = i4 % 2;
                onTransact(this, IAuthTabCallbackDefault(this));
            }
        }
        onTransact();
        int interfaceDescriptor = getInterfaceDescriptor();
        this.onTransact = interfaceDescriptor;
        Object obj = null;
        onExtraCallback(this, interfaceDescriptor, false, 2, null);
        onExtraCallbackWithResult(0);
        findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact().setVisibility(0);
        onExtraCallback(-681747020, 681747033, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact()}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i6 = requestPostMessageChannel + 57;
        newAuthTabSession = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r7.newSession == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r7.newSession == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        r8 = o.getDurationInForeground.IAuthTabCallback(r7.asInterface, r8);
        r7.onTransact = r0;
        onExtraCallback(r7, r0, false, 2, null);
        r7.onExtraCallbackWithResult((int) (r0 * r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r7.ICustomTabsCallbackStub = java.lang.Integer.valueOf(r0);
        r7.IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final WindowInsetsCompat onWarmupCompleted(AppWithState appWithState, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        appWithState.ICustomTabsService = windowInsetsCompat;
        int i2 = appWithState.onTransact;
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        int i3 = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback;
        int i4 = windowInsetsCompat.onWarmupCompleted(getDurationInForeground.IAuthTabCallback()).onExtraCallback;
        boolean z = appWithState.onRelationshipValidationResult != i3;
        boolean z2 = appWithState.ICustomTabsCallbackDefault != i4;
        if (!z && !z2) {
            return windowInsetsCompat;
        }
        appWithState.onRelationshipValidationResult = i3;
        appWithState.ICustomTabsCallbackDefault = i4;
        int interfaceDescriptor = appWithState.getInterfaceDescriptor();
        if (!appWithState.onActivityLayout()) {
            appWithState.onTransact = interfaceDescriptor;
            onExtraCallback(appWithState, interfaceDescriptor, false, 2, null);
            appWithState.onExtraCallbackWithResult(0);
            int i5 = newAuthTabSession + 1;
            requestPostMessageChannel = i5 % 128;
            if (i5 % 2 != 0) {
                return windowInsetsCompat;
            }
            throw null;
        }
        int i6 = newAuthTabSession + 91;
        requestPostMessageChannel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        final AppWithState appWithState = (AppWithState) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        ViewCompat.onWarmupCompleted(view, new RenderInTransitionOverlayNodeElement() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                WindowInsetsCompat windowInsetsCompatOnExtraCallback = AppWithState.onExtraCallback(this.f$0, view2, windowInsetsCompat);
                int i5 = onNavigationEvent + 61;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return windowInsetsCompatOnExtraCallback;
                }
                throw null;
            }
        });
        ViewCompat.extraCommand(view);
        int i2 = requestPostMessageChannel + 81;
        newAuthTabSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (onExtraCallbackWithResult()) {
            int i2 = requestPostMessageChannel + 43;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
            if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
                onExtraCallback(-268531207, 268531213, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                int interfaceDescriptor = getInterfaceDescriptor();
                this.onTransact = interfaceDescriptor;
                onExtraCallback(this, interfaceDescriptor, false, 2, null);
                onExtraCallback(findexitinfobypidbugsnag_plugin_android_exitinfo_release);
                isOneShot.onExtraCallbackWithResult(this.mayLaunchUrl, noStore.Companion.access100());
                onExtraCallback(-924199871, 924199886, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                getInterfaceDescriptor(interfaceDescriptor);
                return;
            }
        }
        int i4 = requestPostMessageChannel + 15;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 115;
        newAuthTabSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(appWithState.mayLaunchUrl);
            if (windowInsetsCompatICustomTabsCallback == null && (windowInsetsCompatICustomTabsCallback = appWithState.ICustomTabsService) == null) {
                return null;
            }
            appWithState.ICustomTabsService = windowInsetsCompatICustomTabsCallback;
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompatICustomTabsCallback.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface());
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
            appWithState.onRelationshipValidationResult = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback;
            appWithState.ICustomTabsCallbackDefault = windowInsetsCompatICustomTabsCallback.onWarmupCompleted(getDurationInForeground.IAuthTabCallback()).onExtraCallback;
            ViewCompat.onWarmupCompleted(appWithState.mayLaunchUrl, windowInsetsCompatICustomTabsCallback);
            int i3 = requestPostMessageChannel + 59;
            newAuthTabSession = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        ViewCompat.ICustomTabsCallback(appWithState.mayLaunchUrl);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004d A[PHI: r1
      0x004d: PHI (r1v7 android.view.View) = (r1v6 android.view.View), (r1v12 android.view.View) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release) {
        View viewOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 57;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCallbackWithResult = false;
            this.onActivityLayout = false;
            onExtraCallbackWithResult(1);
            findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact().setVisibility(0);
            findexitinfobypidbugsnag_plugin_android_exitinfo_release.asInterface().setVisibility(0);
            onMinimized();
            viewOnWarmupCompleted = findexitinfobypidbugsnag_plugin_android_exitinfo_release.onWarmupCompleted();
            if (viewOnWarmupCompleted != null) {
                viewOnWarmupCompleted.setVisibility(0);
            }
        } else {
            this.extraCallbackWithResult = false;
            this.onActivityLayout = true;
            onExtraCallbackWithResult(0);
            findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact().setVisibility(0);
            findexitinfobypidbugsnag_plugin_android_exitinfo_release.asInterface().setVisibility(0);
            onMinimized();
            viewOnWarmupCompleted = findexitinfobypidbugsnag_plugin_android_exitinfo_release.onWarmupCompleted();
            if (viewOnWarmupCompleted != null) {
            }
        }
        findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder().setAlpha(1.0f);
        int i3 = newAuthTabSession + 15;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onMinimized() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 31;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        access100(0);
        if (Build.VERSION.SDK_INT >= 29) {
            int i4 = requestPostMessageChannel + 69;
            newAuthTabSession = i4 % 128;
            int i5 = i4 % 2;
            this.onWarmupCompleted.getWindow().setNavigationBarContrastEnforced(false);
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 1;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        appWithState.onUnminimized();
        UnderlayTextView underlayTextViewIAuthTabCallback = appWithState.ICustomTabsCallback().IAuthTabCallback();
        if (underlayTextViewIAuthTabCallback == null) {
            return null;
        }
        underlayTextViewIAuthTabCallback.onWarmupCompleted();
        int i4 = newAuthTabSession + 75;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 119;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            if (onExtraCallbackWithResult()) {
                onExtraCallback(-1621950636, 1621950638, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                return;
            } else {
                int i3 = newAuthTabSession + 59;
                requestPostMessageChannel = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public final void onExtraCallback(@Nullable Function1<? super View, Unit> function1) {
        ViewGroup viewGroupAsBinder;
        int i = 2 % 2;
        this.IAuthTabCallbackStub = function1;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null && (viewGroupAsBinder = findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder()) != null) {
            onNavigationEvent((View) viewGroupAsBinder);
            int i2 = newAuthTabSession + 103;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = newAuthTabSession + 59;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 107;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        appWithState.IAuthTabCallbackStubProxy = function0;
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        int i6 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        newAuthTabSession = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 113;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            appWithState.onUnminimized = function0;
            appWithState.ICustomTabsCallbackStubProxy();
            int i3 = newAuthTabSession + 33;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        appWithState.onUnminimized = function0;
        appWithState.ICustomTabsCallbackStubProxy();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable View view) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel;
        int i3 = i2 + 1;
        newAuthTabSession = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.access000 != view) {
            int i4 = i2 + 77;
            newAuthTabSession = i4 % 128;
            if (i4 % 2 != 0) {
                ICustomTabsCallbackStub();
                this.access000 = view;
                throw null;
            }
            ICustomTabsCallbackStub();
            this.access000 = view;
            if (this.onExtraCallback != null) {
                int i5 = requestPostMessageChannel + 79;
                newAuthTabSession = i5 % 128;
                int i6 = i5 % 2;
                onExtraCallback(-1945509171, 1945509175, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                onExtraCallbackWithResult(this.asInterface);
            }
        }
        int i7 = requestPostMessageChannel + 51;
        newAuthTabSession = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Integer num = (Integer) objArr[3];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 119;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Typography6 typography6OnExtraCallbackWithResult = appWithState.ICustomTabsCallback().onExtraCallbackWithResult();
        Object obj = null;
        if (typography6OnExtraCallbackWithResult != null) {
            int i4 = requestPostMessageChannel + 19;
            newAuthTabSession = i4 % 128;
            if (i4 % 2 != 0) {
                typography6OnExtraCallbackWithResult.setText(str2);
                obj.hashCode();
                throw null;
            }
            typography6OnExtraCallbackWithResult.setText(str2);
            typography6OnExtraCallbackWithResult.setVisibility((str2 == null || !(StringsKt__StringsKt.isBlank(str2) ^ true)) ? 8 : 0);
        }
        UnderlayTextView underlayTextViewIAuthTabCallback = appWithState.ICustomTabsCallback().IAuthTabCallback();
        if (underlayTextViewIAuthTabCallback != null) {
            if (str2 == null) {
                int i5 = newAuthTabSession + 101;
                requestPostMessageChannel = i5 % 128;
                underlayTextViewIAuthTabCallback.setSubTypography(i5 % 2 == 0 ? 89 : 10);
            } else {
                underlayTextViewIAuthTabCallback.setTypography(5);
            }
            underlayTextViewIAuthTabCallback.onExtraCallback(str);
            if (str2 != null && !StringsKt__StringsKt.isBlank(str2)) {
                setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(underlayTextViewIAuthTabCallback, appWithState.extraCommand);
            }
            if (num != null) {
                underlayTextViewIAuthTabCallback.setPrimaryColor(num.intValue());
                int i6 = newAuthTabSession + 85;
                requestPostMessageChannel = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        appWithState.onMessageChannelReady = appWithState.access000();
        int interfaceDescriptor = appWithState.getInterfaceDescriptor();
        if (appWithState.onActivityLayout()) {
            appWithState.onExtraCallbackWithResult(appWithState.onTransact, interfaceDescriptor);
            return null;
        }
        appWithState.onTransact = interfaceDescriptor;
        onExtraCallback(appWithState, interfaceDescriptor, false, 2, null);
        appWithState.onExtraCallbackWithResult(0);
        return null;
    }

    public final void IAuthTabCallback() {
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 5;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        if (!(!onExtraCallbackWithResult())) {
            int i4 = requestPostMessageChannel + 9;
            int i5 = i4 % 128;
            newAuthTabSession = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (this.readTypedObject || (findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100) == null) {
                return;
            }
            int i6 = i5 + 57;
            requestPostMessageChannel = i6 % 128;
            int i7 = i6 % 2;
            this.readTypedObject = true;
            this.extraCallbackWithResult = true;
            try {
                onExtraCallback(154773582, -154773582, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, findexitinfobypidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                onExtraCallbackWithResult(findexitinfobypidbugsnag_plugin_android_exitinfo_release);
                onRelationshipValidationResult();
                onMessageChannelReady();
            } finally {
                this.readTypedObject = false;
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = (findExitInfoByPidbugsnag_plugin_android_exitinfo_release) objArr[1];
        int i = 2 % 2;
        findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder().removeOnLayoutChangeListener(appWithState.postMessage);
        findexitinfobypidbugsnag_plugin_android_exitinfo_release.onNavigationEvent().setOnTouchListener(null);
        ViewCompat.onWarmupCompleted(findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact(), (RenderInTransitionOverlayNodeElement) null);
        appWithState.IAuthTabCallbackStubProxy();
        ShimmerSweepLayout shimmerSweepLayout = appWithState.isEngagementSignalsApiAvailable;
        if (shimmerSweepLayout != null) {
            shimmerSweepLayout.IAuthTabCallbackDefault();
            int i2 = requestPostMessageChannel + 79;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
        }
        UnderlayTextView underlayTextViewIAuthTabCallback = appWithState.ICustomTabsCallback().IAuthTabCallback();
        if (underlayTextViewIAuthTabCallback != null) {
            UnderlayTextView.onExtraCallbackWithResult(new Object[]{underlayTextViewIAuthTabCallback}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 811292533, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -811292532);
        }
        appWithState.extraCommand();
        int i4 = newAuthTabSession + 21;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 69;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact()};
        onExtraCallback(-1922923382, 1922923398, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        Object[] objArr2 = {this, findexitinfobypidbugsnag_plugin_android_exitinfo_release.asInterface()};
        onExtraCallback(-1922923382, 1922923398, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        Object[] objArr3 = {this, this.ICustomTabsCallback_Parcel};
        onExtraCallback(-1922923382, 1922923398, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr3, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        Object[] objArr4 = {this, this.isEngagementSignalsApiAvailable};
        onExtraCallback(-1922923382, 1922923398, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr4, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i4 = newAuthTabSession + 79;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        ViewGroup viewGroup;
        View view = (View) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
            int i2 = requestPostMessageChannel + 95;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
            return null;
        }
        int i4 = requestPostMessageChannel + 105;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 27;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback().onNavigationEvent();
        Object obj = null;
        this.access100 = null;
        this.isEngagementSignalsApiAvailable = null;
        this.ICustomTabsCallback = false;
        this.extraCallbackWithResult = false;
        this.onActivityLayout = false;
        this.onUnminimized = null;
        this.extraCallback = false;
        this.onTransact = 0;
        this.asInterface = 0;
        this.getInterfaceDescriptor = null;
        this.IAuthTabCallbackDefault = 0;
        this.prefetch.setEmpty();
        this.ICustomTabsCallbackStub = null;
        this.onMessageChannelReady = 0;
        this.onRelationshipValidationResult = 0;
        this.ICustomTabsCallbackDefault = 0;
        this.ICustomTabsService = null;
        int i4 = requestPostMessageChannel + 111;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function2<View, WindowInsetsCompat, WindowInsetsCompat> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        onExtraCallbackWithResult() {
            super(2, ViewCompat.class, "dispatchApplyWindowInsets", "dispatchApplyWindowInsets(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ WindowInsetsCompat invoke(View view, WindowInsetsCompat windowInsetsCompat) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = onExtraCallbackWithResult(view, windowInsetsCompat);
            int i4 = onWarmupCompleted + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return windowInsetsCompatOnExtraCallbackWithResult;
        }

        public final WindowInsetsCompat onExtraCallbackWithResult(View view, WindowInsetsCompat windowInsetsCompat) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
            WindowInsetsCompat windowInsetsCompatOnWarmupCompleted = ViewCompat.onWarmupCompleted(view, windowInsetsCompat);
            int i4 = onWarmupCompleted + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return windowInsetsCompatOnWarmupCompleted;
        }
    }

    private final void onRelationshipValidationResult() {
        int i = 2 % 2;
        onExtraCallback onextracallback = this.onExtraCallback;
        if (onextracallback == null) {
            return;
        }
        onExtraCallbackWithResult(0);
        ICustomTabsCallbackStub();
        onextracallback.onExtraCallbackWithResult().setClipChildren(onextracallback.IAuthTabCallbackStub());
        onextracallback.onExtraCallbackWithResult().setClipToPadding(onextracallback.onTransact());
        access100(onextracallback.onNavigationEvent());
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = newAuthTabSession + 99;
            requestPostMessageChannel = i2 % 128;
            if (i2 % 2 != 0) {
                Boolean boolOnExtraCallback = onextracallback.onExtraCallback();
                if (boolOnExtraCallback != null) {
                    this.onWarmupCompleted.getWindow().setNavigationBarContrastEnforced(boolOnExtraCallback.booleanValue());
                }
            } else {
                onextracallback.onExtraCallback();
                throw null;
            }
        }
        if (!(!onextracallback.asInterface())) {
            int i3 = requestPostMessageChannel + 5;
            newAuthTabSession = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent = this.asBinder.onNavigationEvent();
            RepeatableSpec.onExtraCallbackWithResult(this.onWarmupCompleted.getWindow(), true);
            getDurationInForeground.onExtraCallback(this.mayLaunchUrl, onExtraCallbackWithResult.IAuthTabCallback);
            onTransact(iOnNavigationEvent);
        }
        this.onExtraCallback = null;
    }

    private final void onTransact(final int i) {
        int i2 = 2 % 2;
        View decorView = this.onWarmupCompleted.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        getDurationInForeground.onNavigationEvent(decorView, onNavigationEvent.onWarmupCompleted, new Function0() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda13
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 83;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallbackWithResult = AppWithState.onExtraCallbackWithResult(this.f$0, i);
                int i6 = onExtraCallback + 47;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i3 = requestPostMessageChannel + 13;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        static {
            int i = IAuthTabCallback + 19;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        onNavigationEvent() {
            super(1, ViewCompat.class, "requestApplyInsets", "requestApplyInsets(Landroid/view/View;)V", 0);
        }

        public final void IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                ViewCompat.extraCommand(view);
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                ViewCompat.extraCommand(view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(view);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit access000(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 119;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        appWithState.asBinder.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i5 = newAuthTabSession + 55;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 83;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        int navigationBarColor = this.onWarmupCompleted.getWindow().getNavigationBarColor();
        int i4 = newAuthTabSession + 103;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return navigationBarColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void access100(int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 29;
        requestPostMessageChannel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (getDurationInForeground.onWarmupCompleted(Build.VERSION.SDK_INT)) {
                this.onWarmupCompleted.getWindow().setNavigationBarColor(i);
                return;
            }
            int i4 = newAuthTabSession + 11;
            requestPostMessageChannel = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        getDurationInForeground.onWarmupCompleted(Build.VERSION.SDK_INT);
        throw null;
    }

    private final void onTransact() {
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted;
        int i;
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted2;
        int i2 = 2 % 2;
        WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(this.mayLaunchUrl);
        int iAsInterface = WindowInsetsCompat.onTransact.asInterface();
        if (windowInsetsCompatICustomTabsCallback != null) {
            cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompatICustomTabsCallback.onWarmupCompleted(iAsInterface);
            int i3 = newAuthTabSession + 73;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            cameraControllerExternalSyntheticLambda0OnWarmupCompleted = null;
        }
        this.ICustomTabsService = windowInsetsCompatICustomTabsCallback;
        int i5 = 0;
        if (cameraControllerExternalSyntheticLambda0OnWarmupCompleted != null) {
            int i6 = requestPostMessageChannel + 3;
            newAuthTabSession = i6 % 128;
            int i7 = i6 % 2;
            i = cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback;
        } else {
            Integer numIAuthTabCallback = M_.onExtraCallback.IAuthTabCallback();
            if (numIAuthTabCallback != null) {
                int i8 = requestPostMessageChannel + 7;
                newAuthTabSession = i8 % 128;
                int i9 = i8 % 2;
                int iIntValue = numIAuthTabCallback.intValue();
                int i10 = requestPostMessageChannel + 3;
                newAuthTabSession = i10 % 128;
                int i11 = i10 % 2;
                i = iIntValue;
            } else {
                i = 0;
            }
        }
        this.onRelationshipValidationResult = i;
        if (windowInsetsCompatICustomTabsCallback != null && (cameraControllerExternalSyntheticLambda0OnWarmupCompleted2 = windowInsetsCompatICustomTabsCallback.onWarmupCompleted(getDurationInForeground.IAuthTabCallback())) != null) {
            i5 = cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallback;
        }
        this.ICustomTabsCallbackDefault = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 im.toss.uikit.widget.underlay.UnderlayTextView) = (r1v5 im.toss.uikit.widget.underlay.UnderlayTextView), (r1v14 im.toss.uikit.widget.underlay.UnderlayTextView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int access000() {
        UnderlayTextView underlayTextViewIAuthTabCallback;
        float fIAuthTabCallback;
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 59;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            underlayTextViewIAuthTabCallback = ICustomTabsCallback().IAuthTabCallback();
            int i3 = 25 / 0;
            if (underlayTextViewIAuthTabCallback != null) {
                fIAuthTabCallback = underlayTextViewIAuthTabCallback.IAuthTabCallback();
                int i4 = newAuthTabSession + 87;
                requestPostMessageChannel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                fIAuthTabCallback = 0.0f;
            }
        } else {
            underlayTextViewIAuthTabCallback = ICustomTabsCallback().IAuthTabCallback();
            if (underlayTextViewIAuthTabCallback != null) {
            }
        }
        BaseTextView baseTextViewOnExtraCallbackWithResult = ICustomTabsCallback().onExtraCallbackWithResult();
        if (baseTextViewOnExtraCallbackWithResult != null) {
            CharSequence text = baseTextViewOnExtraCallbackWithResult.getText();
            float fMeasureText = baseTextViewOnExtraCallbackWithResult.getPaint().measureText(text, 0, text.length());
            TossBundleLoader_importLazy tossBundleLoader_importLazy = TossBundleLoader_importLazy.onWarmupCompleted;
            Intrinsics.checkNotNull(text);
            iOnNavigationEvent = tossBundleLoader_importLazy.onNavigationEvent(text, (int) fMeasureText, baseTextViewOnExtraCallbackWithResult);
        } else {
            iOnNavigationEvent = 0;
        }
        int i6 = (int) (iOnNavigationEvent + fIAuthTabCallback + this.newSessionWithExtras);
        int i7 = requestPostMessageChannel + 71;
        newAuthTabSession = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 70 / 0;
        }
        return i6;
    }

    private final int getInterfaceDescriptor() {
        int iIntValue;
        int i = 2 % 2;
        Integer numValueOf = Integer.valueOf(this.onMessageChannelReady);
        Object obj = null;
        if (numValueOf.intValue() <= 0) {
            int i2 = newAuthTabSession + 93;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i4 = newAuthTabSession + 125;
            requestPostMessageChannel = i4 % 128;
            if (i4 % 2 == 0) {
                numValueOf.intValue();
                obj.hashCode();
                throw null;
            }
            iIntValue = numValueOf.intValue();
        } else {
            Integer numValueOf2 = Integer.valueOf(access000());
            this.onMessageChannelReady = numValueOf2.intValue();
            iIntValue = numValueOf2.intValue();
            int i5 = requestPostMessageChannel + 113;
            newAuthTabSession = i5 % 128;
            int i6 = i5 % 2;
        }
        int iAsInterface = iIntValue + asInterface();
        int i7 = requestPostMessageChannel + 27;
        newAuthTabSession = i7 % 128;
        int i8 = i7 % 2;
        return iAsInterface;
    }

    private final int asInterface() {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = getDurationInForeground.onExtraCallbackWithResult(this.onRelationshipValidationResult, this.ICustomTabsCallbackDefault);
        if (this.onRelationshipValidationResult > 0) {
            int i2 = requestPostMessageChannel + 75;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            iOnExtraCallbackWithResult = Math.max(iOnExtraCallbackWithResult, this.onPostMessage);
            int i4 = newAuthTabSession + 51;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = requestPostMessageChannel + 109;
        newAuthTabSession = i6 % 128;
        int i7 = i6 % 2;
        return iOnExtraCallbackWithResult;
    }

    private final int asBinder(int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 59;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        int iCeil = i + this.writeTypedObject + ((int) Math.ceil(i * 0.20000005f));
        int i5 = newAuthTabSession + 49;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return iCeil;
    }

    static /* synthetic */ void onExtraCallback(AppWithState appWithState, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = newAuthTabSession;
        int i5 = i4 + 69;
        requestPostMessageChannel = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i4 + 97;
            requestPostMessageChannel = i7 % 128;
            z = i7 % 2 != 0;
        }
        appWithState.onExtraCallback(i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 99;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
            ViewGroup viewGroupAsBinder = findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder();
            int iAsBinder = asBinder(i);
            if (!z) {
                int i5 = newAuthTabSession + 5;
                requestPostMessageChannel = i5 % 128;
                int i6 = i5 % 2;
                if (iAsBinder > viewGroupAsBinder.getLayoutParams().height) {
                    Object[] objArr = {this, viewGroupAsBinder, Integer.valueOf(iAsBinder)};
                    onExtraCallback(1765867752, -1765867735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                }
            }
            IAuthTabCallback(viewGroupAsBinder, this.onMinimized, asInterface());
            IAuthTabCallbackStub();
            Object[] objArr2 = {this, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onExtraCallback(), Integer.valueOf(RangesKt___RangesKt.coerceAtLeast(i, 0))};
            onExtraCallback(1765867752, -1765867735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(viewGroupAsBinder.getLayoutParams().height - RangesKt___RangesKt.coerceAtLeast(i, 0), 0);
            Object[] objArr3 = {this, findexitinfobypidbugsnag_plugin_android_exitinfo_release.onExtraCallbackWithResult(), Integer.valueOf(((Integer) getStartTimeMsbugsnag_android_core_release.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1126574706, new Object[]{ICustomTabsCallback()}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 1126574708, setAutoCaptured.onExtraCallbackWithResult())).intValue() + iCoerceAtLeast)};
            onExtraCallback(1765867752, -1765867735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr3, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            onNavigationEvent(findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact(), -iCoerceAtLeast);
        }
    }

    private final void IAuthTabCallbackStub() {
        View viewIAuthTabCallback;
        int i = 2 % 2;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release == null || (viewIAuthTabCallback = findexitinfobypidbugsnag_plugin_android_exitinfo_release.IAuthTabCallback()) == null) {
            return;
        }
        int i2 = newAuthTabSession + 19;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(1765867752, -1765867735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, viewIAuthTabCallback, Integer.valueOf(getDurationInForeground.onExtraCallback(this.onRelationshipValidationResult, this.ICustomTabsCallbackStubProxy))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            throw null;
        }
        onExtraCallback(1765867752, -1765867735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, viewIAuthTabCallback, Integer.valueOf(getDurationInForeground.onExtraCallback(this.onRelationshipValidationResult, this.ICustomTabsCallbackStubProxy))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i3 = newAuthTabSession + 49;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void getInterfaceDescriptor(int i) {
        int i2 = 2 % 2;
        IAuthTabCallbackStubProxy();
        this.ICustomTabsCallbackStub = null;
        this.onTransact = i;
        ValueAnimator valueAnimatorOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(i, new Function1() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda11
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 27;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    AppWithState.onWarmupCompleted(this.f$0, ((Integer) obj).intValue());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = AppWithState.onWarmupCompleted(this.f$0, ((Integer) obj).intValue());
                int i5 = onWarmupCompleted + 105;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 19 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, new Function0() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda12
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 95;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = AppWithState.onWarmupCompleted(this.f$0);
                int i6 = onExtraCallback + 73;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return unitOnWarmupCompleted;
            }
        });
        valueAnimatorOnExtraCallback.start();
        this.newSession = valueAnimatorOnExtraCallback;
        int i3 = requestPostMessageChannel + 103;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit IAuthTabCallbackStubProxy(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 9;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        appWithState.onNavigationEvent(i);
        Unit unit = Unit.INSTANCE;
        int i5 = requestPostMessageChannel + 47;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback_Parcel(AppWithState appWithState) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 105;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        appWithState.newSession = null;
        appWithState.asBinder();
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 43;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallbackWithResult(int i, final int i2) {
        int i3 = 2 % 2;
        int i4 = requestPostMessageChannel + 91;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
            if (i == i2) {
                return;
            }
        } else if (i == i2) {
            return;
        }
        int i6 = this.asInterface;
        IAuthTabCallbackStubProxy();
        this.ICustomTabsCallbackStub = null;
        onExtraCallback(i2, false);
        this.onTransact = i2;
        ValueAnimator valueAnimatorOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(i6, i2, new Function1() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onNavigationEvent + 43;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnExtraCallback = AppWithState.onExtraCallback(this.f$0, ((Integer) obj).intValue());
                int i10 = onWarmupCompleted + 27;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return unitOnExtraCallback;
            }
        }, new Function0() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 59;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                AppWithState appWithState = this.f$0;
                if (i9 != 0) {
                    return AppWithState.IAuthTabCallback(appWithState, i2);
                }
                AppWithState.IAuthTabCallback(appWithState, i2);
                throw null;
            }
        });
        valueAnimatorOnExtraCallback.start();
        this.newSession = valueAnimatorOnExtraCallback;
        int i7 = requestPostMessageChannel + 119;
        newAuthTabSession = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final Unit IAuthTabCallbackStub(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 23;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            appWithState.onExtraCallbackWithResult(i);
            return Unit.INSTANCE;
        }
        appWithState.onExtraCallbackWithResult(i);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 51;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        appWithState.onTransact = i;
        Object obj = null;
        onExtraCallback(appWithState, i, false, 2, null);
        appWithState.newSession = null;
        appWithState.asBinder();
        Unit unit = Unit.INSTANCE;
        int i5 = newAuthTabSession + 59;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 111;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        final Function1<? super View, Unit> function1 = this.IAuthTabCallbackStub;
        if (function1 != null) {
            view.setClickable(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 111;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    AppWithState.onExtraCallback(function1, view2);
                    if (i7 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            int i5 = newAuthTabSession + 43;
            requestPostMessageChannel = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i6 = i3 + 75;
        newAuthTabSession = i6 % 128;
        int i7 = i6 % 2;
        view.setClickable(false);
        view.setOnClickListener(null);
    }

    private static final void onNavigationEvent(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + Imgproc.COLOR_YUV2RGB_YVYU;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = newAuthTabSession + 107;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(View view) {
        int i = 2 % 2;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.IntRef intRef = new Ref.IntRef();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.underlay.DecorUnderlayViewController$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 95;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    AppWithState.IAuthTabCallback(this.f$0, floatRef, intRef, view2, motionEvent);
                    obj.hashCode();
                    throw null;
                }
                boolean zIAuthTabCallback = AppWithState.IAuthTabCallback(this.f$0, floatRef, intRef, view2, motionEvent);
                int i4 = onWarmupCompleted + 123;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return zIAuthTabCallback;
                }
                throw null;
            }
        });
        int i2 = newAuthTabSession + 97;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean onWarmupCompleted(AppWithState appWithState, Ref.FloatRef floatRef, Ref.IntRef intRef, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (appWithState.extraCallbackWithResult || appWithState.readTypedObject) {
                return false;
            }
            ValueAnimator valueAnimator = appWithState.newSession;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            appWithState.ICustomTabsCallback = true;
            floatRef.element = motionEvent.getRawY();
            intRef.element = 0;
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!appWithState.ICustomTabsCallback || appWithState.extraCallbackWithResult || appWithState.readTypedObject) {
                    return false;
                }
                int i2 = requestPostMessageChannel + 67;
                newAuthTabSession = i2 % 128;
                int i3 = i2 % 2;
                int iCoerceAtMost = (int) RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(motionEvent.getRawY() - floatRef.element, 0.0f), appWithState.onActivityResized);
                if (intRef.element == iCoerceAtMost) {
                    return true;
                }
                intRef.element = iCoerceAtMost;
                appWithState.asInterface(iCoerceAtMost);
                return true;
            }
            if (actionMasked != 3) {
                int i4 = newAuthTabSession + 73;
                requestPostMessageChannel = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        if (appWithState.ICustomTabsCallback && !appWithState.extraCallbackWithResult) {
            int i6 = requestPostMessageChannel;
            int i7 = i6 + 1;
            newAuthTabSession = i7 % 128;
            int i8 = i7 % 2;
            if (!appWithState.readTypedObject) {
                int i9 = i6 + 73;
                newAuthTabSession = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = intRef.element;
                    throw null;
                }
                int i11 = intRef.element;
                if (i11 > 0) {
                    Function0<Unit> function0 = appWithState.IAuthTabCallbackStubProxy;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    appWithState.onExtraCallback(intRef.element);
                } else {
                    appWithState.IAuthTabCallback(i11);
                }
                ViewParent parent2 = view.getParent();
                if (parent2 != null) {
                    int i12 = requestPostMessageChannel + 33;
                    newAuthTabSession = i12 % 128;
                    int i13 = i12 % 2;
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                return true;
            }
        }
        ViewParent parent3 = view.getParent();
        if (parent3 != null) {
            int i14 = newAuthTabSession + 101;
            requestPostMessageChannel = i14 % 128;
            if (i14 % 2 == 0) {
                parent3.requestDisallowInterceptTouchEvent(true);
            } else {
                parent3.requestDisallowInterceptTouchEvent(false);
            }
            int i15 = requestPostMessageChannel + 67;
            newAuthTabSession = i15 % 128;
            int i16 = i15 % 2;
        }
        return true;
    }

    private final void asInterface(int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 79;
        requestPostMessageChannel = i3 % 128;
        onExtraCallbackWithResult(RangesKt___RangesKt.coerceAtLeast(i3 % 2 == 0 ? this.onTransact * i : this.onTransact - i, 0));
        int i4 = newAuthTabSession + 27;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    private final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + 99;
        int i4 = i3 % 128;
        newAuthTabSession = i4;
        int i5 = i3 % 2;
        ValueAnimator valueAnimator = this.newSession;
        if (valueAnimator != null) {
            int i6 = i4 + 105;
            requestPostMessageChannel = i6 % 128;
            if (i6 % 2 == 0) {
                valueAnimator.cancel();
                throw null;
            }
            valueAnimator.cancel();
        }
        if (i == 0) {
            this.ICustomTabsCallback = false;
            return;
        }
        ValueAnimator valueAnimatorOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(i, new DecorUnderlayViewController$.ExternalSyntheticLambda2(this), new DecorUnderlayViewController$.ExternalSyntheticLambda3(this));
        valueAnimatorOnNavigationEvent.start();
        this.newSession = valueAnimatorOnNavigationEvent;
        int i7 = newAuthTabSession + 5;
        requestPostMessageChannel = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 59 / 0;
        }
    }

    private static final Unit getInterfaceDescriptor(AppWithState appWithState, int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 107;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        appWithState.asInterface(i);
        Unit unit = Unit.INSTANCE;
        int i5 = newAuthTabSession + 97;
        requestPostMessageChannel = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 19;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        appWithState.newSession = null;
        appWithState.ICustomTabsCallback = false;
        appWithState.asBinder();
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 43;
        requestPostMessageChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel + Imgproc.COLOR_YUV2RGBA_YVYU;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release == null) {
            return;
        }
        ValueAnimator valueAnimator = this.newSession;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            int i5 = newAuthTabSession + 111;
            requestPostMessageChannel = i5 % 128;
            int i6 = i5 % 2;
        }
        int iCoerceIn = RangesKt___RangesKt.coerceIn(i, 0, this.onTransact);
        if (RangesKt___RangesKt.coerceAtLeast(this.onTransact - iCoerceIn, 0) != 0) {
            this.ICustomTabsCallback = true;
            ValueAnimator valueAnimatorIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback(iCoerceIn, this.onTransact, new DecorUnderlayViewController$.ExternalSyntheticLambda14(this), new DecorUnderlayViewController$.ExternalSyntheticLambda15(findexitinfobypidbugsnag_plugin_android_exitinfo_release), new DecorUnderlayViewController$.ExternalSyntheticLambda16(this, findexitinfobypidbugsnag_plugin_android_exitinfo_release));
            valueAnimatorIAuthTabCallback.start();
            this.newSession = valueAnimatorIAuthTabCallback;
            return;
        }
        int i7 = newAuthTabSession + 47;
        requestPostMessageChannel = i7 % 128;
        int i8 = i7 % 2;
        onExtraCallback(-1621950636, 1621950638, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i9 = requestPostMessageChannel + 71;
        newAuthTabSession = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 37 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = newAuthTabSession + 45;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        appWithState.asInterface(iIntValue);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 31;
        requestPostMessageChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release, float f) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 47;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder().setAlpha(f);
        Unit unit = Unit.INSTANCE;
        int i4 = requestPostMessageChannel + 119;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(AppWithState appWithState, findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release) {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + Imgproc.COLOR_YUV2RGB_YVYU;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        appWithState.newSession = null;
        findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder().setAlpha(1.0f);
        appWithState.access100();
        Unit unit = Unit.INSTANCE;
        int i4 = requestPostMessageChannel + 7;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[PHI: r1
      0x0031: PHI (r1v2 android.animation.ValueAnimator) = (r1v1 android.animation.ValueAnimator), (r1v3 android.animation.ValueAnimator) binds: [B:14:0x002f, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ValueAnimator valueAnimator;
        AppWithState appWithState = (AppWithState) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 35;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 != 0) {
            if (!appWithState.extraCallbackWithResult && !appWithState.readTypedObject) {
                int i4 = i2 + 37;
                requestPostMessageChannel = i4 % 128;
                if (i4 % 2 == 0) {
                    valueAnimator = appWithState.newSession;
                    int i5 = 12 / 0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    appWithState.access100();
                } else {
                    valueAnimator = appWithState.newSession;
                    if (valueAnimator != null) {
                    }
                    appWithState.access100();
                }
            }
            return null;
        }
        boolean z = appWithState.extraCallbackWithResult;
        throw null;
    }

    private final void access100() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 17;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        if (this.access100 != null) {
            int i5 = i3 + 59;
            int i6 = i5 % 128;
            newAuthTabSession = i6;
            int i7 = i5 % 2;
            if (!this.extraCallbackWithResult) {
                int i8 = i6 + 35;
                requestPostMessageChannel = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (!this.readTypedObject) {
                    IAuthTabCallback();
                }
            }
        }
        int i9 = newAuthTabSession + 21;
        requestPostMessageChannel = i9 % 128;
        int i10 = i9 % 2;
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 101;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        ValueAnimator valueAnimator = this.newSession;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.newSession;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.newSession;
        if (valueAnimator3 != null) {
            int i4 = newAuthTabSession + 93;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            valueAnimator3.cancel();
            int i6 = newAuthTabSession + 15;
            requestPostMessageChannel = i6 % 128;
            int i7 = i6 % 2;
        }
        this.newSession = null;
    }

    private final void asBinder() {
        float f;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 119;
        int i3 = i2 % 128;
        requestPostMessageChannel = i3;
        int i4 = i2 % 2;
        Integer num = this.ICustomTabsCallbackStub;
        if (num != null) {
            int i5 = i3 + 85;
            newAuthTabSession = i5 % 128;
            if (i5 % 2 == 0) {
                int iIntValue = num.intValue();
                this.ICustomTabsCallbackStub = null;
                float fIAuthTabCallback = getDurationInForeground.IAuthTabCallback(this.asInterface, this.onTransact);
                this.onTransact = iIntValue;
                onExtraCallback(this, iIntValue, false, 2, null);
                f = iIntValue * fIAuthTabCallback;
            } else {
                int iIntValue2 = num.intValue();
                this.ICustomTabsCallbackStub = null;
                float fIAuthTabCallback2 = getDurationInForeground.IAuthTabCallback(this.asInterface, this.onTransact);
                this.onTransact = iIntValue2;
                onExtraCallback(this, iIntValue2, true, 3, null);
                f = iIntValue2 + fIAuthTabCallback2;
            }
            onExtraCallbackWithResult((int) f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(int i) {
        int iIntValue;
        int i2 = 2 % 2;
        onExtraCallback onextracallback = this.onExtraCallback;
        if (onextracallback == null) {
            return;
        }
        this.asInterface = i;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
            int i3 = requestPostMessageChannel + 43;
            newAuthTabSession = i3 % 128;
            int i4 = i3 % 2;
            View viewOnNavigationEvent = findexitinfobypidbugsnag_plugin_android_exitinfo_release.onNavigationEvent();
            if (viewOnNavigationEvent != null) {
                Integer numValueOf = Integer.valueOf(viewOnNavigationEvent.getHeight());
                if (numValueOf.intValue() <= 0) {
                    int i5 = newAuthTabSession + 77;
                    requestPostMessageChannel = i5 % 128;
                    int i6 = i5 % 2;
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int i7 = newAuthTabSession + 13;
                    requestPostMessageChannel = i7 % 128;
                    int i8 = i7 % 2;
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = ((Integer) getStartTimeMsbugsnag_android_core_release.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1126574706, new Object[]{ICustomTabsCallback()}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 1126574708, setAutoCaptured.onExtraCallbackWithResult())).intValue();
                }
            }
        }
        setLaunching setlaunchingOnWarmupCompleted = getDurationInForeground.onWarmupCompleted(i, this.onTransact, iIntValue);
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release2 = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release2 != null) {
            float fOnNavigationEvent = setlaunchingOnWarmupCompleted.onNavigationEvent();
            View viewIAuthTabCallback = findexitinfobypidbugsnag_plugin_android_exitinfo_release2.IAuthTabCallback();
            if (viewIAuthTabCallback != null) {
                viewIAuthTabCallback.setTranslationY(fOnNavigationEvent);
            }
            onNavigationEvent(findexitinfobypidbugsnag_plugin_android_exitinfo_release2.asInterface(), setlaunchingOnWarmupCompleted.onWarmupCompleted());
        }
        IAuthTabCallbackDefault(setlaunchingOnWarmupCompleted.onWarmupCompleted());
        IAuthTabCallbackStub(RangesKt___RangesKt.coerceAtLeast(i, 0));
        onNavigationEvent(onextracallback.IAuthTabCallback(), onextracallback.onWarmupCompleted() + setlaunchingOnWarmupCompleted.onWarmupCompleted());
        onWarmupCompleted(setlaunchingOnWarmupCompleted.onWarmupCompleted());
        ICustomTabsCallbackStubProxy();
        int i9 = requestPostMessageChannel + Imgproc.COLOR_YUV2RGBA_YVYU;
        newAuthTabSession = i9 % 128;
        int i10 = i9 % 2;
    }

    private final void writeTypedObject() {
        int i = 2 % 2;
        this.extraCallback = false;
        Function0<Unit> function0 = this.onUnminimized;
        if (function0 == null) {
            return;
        }
        if (!((Boolean) onExtraCallback(1139533321, -1139533318, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted())).booleanValue()) {
            ICustomTabsCallbackStubProxy();
            return;
        }
        int i2 = requestPostMessageChannel + 11;
        newAuthTabSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onUnminimized = null;
            function0.invoke();
            throw null;
        }
        this.onUnminimized = null;
        function0.invoke();
        int i3 = requestPostMessageChannel + 87;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ViewGroup viewGroupOnTransact;
        AppWithState appWithState = (AppWithState) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 67;
        newAuthTabSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = appWithState.access100;
            obj.hashCode();
            throw null;
        }
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release2 = appWithState.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release2 != null && (viewGroupOnTransact = findexitinfobypidbugsnag_plugin_android_exitinfo_release2.onTransact()) != null && !appWithState.onWarmupCompleted.isFinishing()) {
            int i3 = requestPostMessageChannel + 71;
            newAuthTabSession = i3 % 128;
            if (i3 % 2 != 0) {
                appWithState.onWarmupCompleted.isDestroyed();
                throw null;
            }
            if (!appWithState.onWarmupCompleted.isDestroyed() && !(!appWithState.onWarmupCompleted.hasWindowFocus()) && ViewCompat.ICustomTabsCallbackStubProxy(viewGroupOnTransact)) {
                int i4 = requestPostMessageChannel + 103;
                newAuthTabSession = i4 % 128;
                int i5 = i4 % 2;
                if (viewGroupOnTransact.isShown() && appWithState.IAuthTabCallbackDefault > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 123;
        newAuthTabSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            View view = appWithState.access000;
            obj.hashCode();
            throw null;
        }
        View view2 = appWithState.access000;
        appWithState.getInterfaceDescriptor = view2 != null ? Float.valueOf(view2.getTranslationY()) : null;
        int i3 = newAuthTabSession + 59;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = requestPostMessageChannel;
        int i4 = i3 + 47;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        View view = this.access000;
        if (view != null) {
            int i6 = i3 + 55;
            newAuthTabSession = i6 % 128;
            int i7 = i6 % 2;
            Float f = this.getInterfaceDescriptor;
            if (f != null) {
                float fFloatValue = f.floatValue() + getDurationInForeground.onNavigationEvent(i, getDurationInForeground.onExtraCallbackWithResult(this.onRelationshipValidationResult, this.ICustomTabsCallbackDefault));
                if (view.getTranslationY() == fFloatValue) {
                    return;
                }
                view.setTranslationY(fFloatValue);
            }
        }
    }

    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannel + 41;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        View view = this.access000;
        Float f = this.getInterfaceDescriptor;
        if (view != null && f != null) {
            view.setTranslationY(f.floatValue());
        }
        this.getInterfaceDescriptor = null;
        int i3 = newAuthTabSession + 57;
        requestPostMessageChannel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
    }

    private final void IAuthTabCallbackDefault(int i) {
        int iIntValue;
        int i2 = 2 % 2;
        this.IAuthTabCallbackDefault = RangesKt___RangesKt.coerceAtLeast(i, 0);
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
            int i3 = requestPostMessageChannel + 57;
            newAuthTabSession = i3 % 128;
            int i4 = i3 % 2;
            ViewGroup viewGroupAsBinder = findexitinfobypidbugsnag_plugin_android_exitinfo_release.asBinder();
            if (viewGroupAsBinder != null) {
                Integer numValueOf = Integer.valueOf(viewGroupAsBinder.getHeight());
                Object obj = null;
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                    int i5 = requestPostMessageChannel + 5;
                    newAuthTabSession = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 4;
                    }
                } else {
                    Integer numValueOf2 = Integer.valueOf(viewGroupAsBinder.getLayoutParams().height);
                    if (numValueOf2.intValue() <= 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 == null) {
                        this.prefetch.setEmpty();
                        viewGroupAsBinder.setClipBounds(this.prefetch);
                        int i7 = newAuthTabSession + 107;
                        requestPostMessageChannel = i7 % 128;
                        int i8 = i7 % 2;
                        return;
                    }
                    int i9 = requestPostMessageChannel + 29;
                    newAuthTabSession = i9 % 128;
                    if (i9 % 2 != 0) {
                        numValueOf2.intValue();
                        throw null;
                    }
                    iIntValue = numValueOf2.intValue();
                }
                this.prefetch.set(0, getDurationInForeground.onWarmupCompleted(iIntValue, this.IAuthTabCallbackDefault), RangesKt___RangesKt.coerceAtLeast(viewGroupAsBinder.getWidth(), 0), iIntValue);
                viewGroupAsBinder.setClipBounds(this.prefetch);
                int i10 = newAuthTabSession + 41;
                requestPostMessageChannel = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
    }

    private final void IAuthTabCallbackStub(int i) {
        int i2 = 2 % 2;
        onNavigationEvent(this.ICustomTabsCallback_Parcel, i);
        ShimmerSweepLayout shimmerSweepLayout = this.isEngagementSignalsApiAvailable;
        if (shimmerSweepLayout != null) {
            int i3 = requestPostMessageChannel + 41;
            newAuthTabSession = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent(shimmerSweepLayout, i);
            if (i4 != 0) {
                int i5 = 0 / 0;
            }
            int i6 = requestPostMessageChannel + 87;
            newAuthTabSession = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = requestPostMessageChannel + 123;
        newAuthTabSession = i8 % 128;
        int i9 = i8 % 2;
    }

    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 7;
        requestPostMessageChannel = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(i);
        if (i4 == 0) {
            int i5 = 70 / 0;
        }
        int i6 = newAuthTabSession + 43;
        requestPostMessageChannel = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.findExitInfoByPidbugsnag_plugin_android_exitinfo_release) = 
      (r1v4 o.findExitInfoByPidbugsnag_plugin_android_exitinfo_release)
      (r1v12 o.findExitInfoByPidbugsnag_plugin_android_exitinfo_release)
     binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onActivityLayout() {
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 25;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 == 0) {
            findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
            int i3 = 43 / 0;
            if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
                ViewGroup viewGroupOnTransact = findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact();
                if (viewGroupOnTransact != null && this.onActivityLayout && viewGroupOnTransact.getVisibility() == 0 && !this.extraCallbackWithResult) {
                    int i4 = newAuthTabSession + 35;
                    requestPostMessageChannel = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else {
            findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
            if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
            }
        }
        return false;
    }

    private final void onUnminimized() {
        int i = 2 % 2;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
            int i2 = newAuthTabSession + 115;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
            PulseRingView pulseRingViewIAuthTabCallbackStub = findexitinfobypidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackStub();
            if (pulseRingViewIAuthTabCallbackStub != null) {
                pulseRingViewIAuthTabCallbackStub.IAuthTabCallback();
                int i4 = newAuthTabSession + 113;
                requestPostMessageChannel = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private final void extraCommand() {
        int i = 2 % 2;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
            int i2 = newAuthTabSession + 49;
            requestPostMessageChannel = i2 % 128;
            int i3 = i2 % 2;
            PulseRingView pulseRingViewIAuthTabCallbackStub = findexitinfobypidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackStub();
            if (i3 == 0) {
                int i4 = 93 / 0;
                if (pulseRingViewIAuthTabCallbackStub == null) {
                    return;
                }
            } else if (pulseRingViewIAuthTabCallbackStub == null) {
                return;
            }
            int i5 = newAuthTabSession + 71;
            requestPostMessageChannel = i5 % 128;
            int i6 = i5 % 2;
            pulseRingViewIAuthTabCallbackStub.onExtraCallback();
            if (i6 == 0) {
                int i7 = 16 / 0;
            }
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != iIntValue) {
            layoutParams.height = iIntValue;
            view.setLayoutParams(layoutParams);
            int i2 = newAuthTabSession + 7;
            requestPostMessageChannel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 54 / 0;
            }
            return null;
        }
        int i4 = requestPostMessageChannel + 71;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void IAuthTabCallback(View view, int i, int i2) {
        int i3 = 2 % 2;
        if (view.getPaddingTop() == i) {
            int i4 = newAuthTabSession + 65;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            if (view.getPaddingBottom() == i2) {
                return;
            }
        }
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        int i6 = requestPostMessageChannel + 103;
        newAuthTabSession = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onNavigationEvent(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2 = 2 % 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int i3 = newAuthTabSession + 55;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            int i5 = newAuthTabSession + 15;
            requestPostMessageChannel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = marginLayoutParams.bottomMargin;
                throw null;
            }
            if (marginLayoutParams.bottomMargin == i) {
                return;
            }
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
            int i7 = newAuthTabSession + 27;
            requestPostMessageChannel = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final int onNavigationEvent(ViewGroup viewGroup, View view) {
        int i = 2 % 2;
        if (view != null) {
            Integer numValueOf = Integer.valueOf(viewGroup.indexOfChild(view));
            if (numValueOf.intValue() < 0) {
                int i2 = requestPostMessageChannel + 3;
                newAuthTabSession = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 66 / 0;
                }
                numValueOf = null;
            }
            if (numValueOf != null) {
                int i4 = requestPostMessageChannel + 5;
                newAuthTabSession = i4 % 128;
                int i5 = i4 % 2;
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    private final ViewGroup.LayoutParams onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 49;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        if (!(viewGroup instanceof FrameLayout)) {
            return new ViewGroup.MarginLayoutParams(-1, -2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        int i4 = requestPostMessageChannel + 5;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return layoutParams;
    }

    private final ViewGroup.LayoutParams onExtraCallbackWithResult(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 17;
        requestPostMessageChannel = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(viewGroup instanceof FrameLayout)) {
                return new ViewGroup.MarginLayoutParams(-1, -1);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i3 = newAuthTabSession + 107;
            requestPostMessageChannel = i3 % 128;
            int i4 = i3 % 2;
            return layoutParams;
        }
        boolean z = viewGroup instanceof FrameLayout;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        AppWithState appWithState = (AppWithState) objArr[0];
        ViewGroup viewGroup = (ViewGroup) objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 29;
        requestPostMessageChannel = i2 % 128;
        int i3 = i2 % 2;
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, appWithState.ICustomTabsCallback().onWarmupCompleted(), 80);
            int i4 = newAuthTabSession + 77;
            requestPostMessageChannel = i4 % 128;
            int i5 = i4 % 2;
            return layoutParams;
        }
        return new ViewGroup.MarginLayoutParams(-1, appWithState.ICustomTabsCallback().onWarmupCompleted());
    }

    private final void ICustomTabsCallbackStubProxy() {
        ViewGroup viewGroupOnTransact;
        int i = 2 % 2;
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = this.access100;
        if (findexitinfobypidbugsnag_plugin_android_exitinfo_release != null) {
            int i2 = requestPostMessageChannel + 63;
            newAuthTabSession = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroupOnTransact = findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact();
                int i3 = 25 / 0;
                if (viewGroupOnTransact == null) {
                    return;
                }
            } else {
                viewGroupOnTransact = findexitinfobypidbugsnag_plugin_android_exitinfo_release.onTransact();
                if (viewGroupOnTransact == null) {
                    return;
                }
            }
            if (this.onUnminimized != null) {
                int i4 = requestPostMessageChannel;
                int i5 = i4 + 101;
                newAuthTabSession = i5 % 128;
                int i6 = i5 % 2;
                if (this.extraCallback) {
                    return;
                }
                int i7 = i4 + 105;
                newAuthTabSession = i7 % 128;
                int i8 = i7 % 2;
                if (!onActivityLayout()) {
                    return;
                }
                int i9 = requestPostMessageChannel + 65;
                newAuthTabSession = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                if (this.IAuthTabCallbackDefault > 0) {
                    this.extraCallback = true;
                    AnimateAsStateKtExternalSyntheticLambda0.IAuthTabCallback(viewGroupOnTransact, new asInterface(viewGroupOnTransact, viewGroupOnTransact, this));
                    int i10 = requestPostMessageChannel + 101;
                    newAuthTabSession = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(AppWithState appWithState, int i) {
        Object[] objArr = {appWithState, Integer.valueOf(i)};
        return (Unit) onExtraCallback(581201756, -581201738, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release, float f) {
        Object[] objArr = {findexitinfobypidbugsnag_plugin_android_exitinfo_release, Float.valueOf(f)};
        return (Unit) onExtraCallback(-64596540, 64596549, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(AppWithState appWithState, findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release) {
        return (Unit) onExtraCallback(-992950640, 992950641, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState, findexitinfobypidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit asInterface(AppWithState appWithState, int i) {
        Object[] objArr = {appWithState, Integer.valueOf(i)};
        return (Unit) onExtraCallback(53127552, -53127547, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallbackStub(AppWithState appWithState) {
        return (Unit) onExtraCallback(-592633558, 592633569, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final void IAuthTabCallback_Parcel() {
        onExtraCallback(-1945509171, 1945509175, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final ViewGroup.LayoutParams onNavigationEvent(ViewGroup viewGroup) {
        return (ViewGroup.LayoutParams) onExtraCallback(1978689941, -1978689922, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, viewGroup}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private static final getStartTimeMsbugsnag_android_core_release IAuthTabCallbackStubProxy(AppWithState appWithState) {
        return (getStartTimeMsbugsnag_android_core_release) onExtraCallback(1864010828, -1864010820, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final void onActivityResized() {
        onExtraCallback(-1621950636, 1621950638, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final void onExtraCallbackWithResult(View view) {
        onExtraCallback(-681747020, 681747033, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, view}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final boolean onPostMessage() {
        return ((Boolean) onExtraCallback(1139533321, -1139533318, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted())).booleanValue();
    }

    private final void onWarmupCompleted(findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release) {
        onExtraCallback(813342404, -813342383, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, findexitinfobypidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final void onNavigationEvent(findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release) {
        onExtraCallback(154773582, -154773582, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, findexitinfobypidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final void onExtraCallback(View view) {
        onExtraCallback(-1922923382, 1922923398, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, view}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final View ICustomTabsCallbackDefault() {
        return (View) onExtraCallback(-941348213, 941348225, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final void isEngagementSignalsApiAvailable() {
        onExtraCallback(-924199871, 924199886, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final void ICustomTabsCallback_Parcel() {
        onExtraCallback(-268531207, 268531213, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    private final void onExtraCallbackWithResult(View view, int i) {
        Object[] objArr = {this, view, Integer.valueOf(i)};
        onExtraCallback(1765867752, -1765867735, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final void onExtraCallback(@NotNull String str, @Nullable String str2, @Nullable Integer num) {
        onExtraCallback(-1500151596, 1500151616, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, str, str2, num}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final void IAuthTabCallback(@Nullable Function0<Unit> function0) {
        onExtraCallback(1690897580, -1690897573, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, function0}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final void onExtraCallbackWithResult(@Nullable Function0<Unit> function0) {
        onExtraCallback(496110628, -496110618, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, function0}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
    }
}
