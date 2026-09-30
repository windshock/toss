package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.R;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.widget.underlay.HandleBarGlowView;
import im.toss.uikit.widget.underlay.HandleOverlayGradientView;
import im.toss.uikit.widget.underlay.PulseRingView;
import im.toss.uikit.widget.underlay.UnderlayTextView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.getStartTimeMsbugsnag_android_core_release;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getStartTimeMsbugsnag_android_core_release {
    private static int access000 = 1;
    private static int getInterfaceDescriptor;
    private final Activity IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private final View IAuthTabCallback_Parcel;
    private Typography6 access100;
    private final int asBinder;
    private View asInterface;
    private final int onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private UnderlayTextView onTransact;
    private final DisplayMetrics onWarmupCompleted;

    public static /* synthetic */ int onExtraCallbackWithResult(getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(getstarttimemsbugsnag_android_core_release);
        }
        IAuthTabCallbackDefault(getstarttimemsbugsnag_android_core_release);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i) | i7);
        int i9 = (~i2) | (~(i7 | i));
        int i10 = i | i2 | i7;
        int i11 = i2 + i5 + i3 + (1635157569 * i4) + ((-1141649966) * i6);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i2) - 711983104) + (488484398 * i5) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i3) + (1462763520 * i4) + (1566572544 * i6) + (1631846400 * i12);
        int i14 = (i2 * 1521345644) + 2088555610 + (i5 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i3 * 1521345871) + (i4 * (-1382509809)) + (i6 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ float onNavigationEvent(getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return ((Float) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1129609973, new Object[]{getstarttimemsbugsnag_android_core_release}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1129609972, setAutoCaptured.onExtraCallbackWithResult())).floatValue();
        }
        ((Float) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1129609973, new Object[]{getstarttimemsbugsnag_android_core_release}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1129609972, setAutoCaptured.onExtraCallbackWithResult())).floatValue();
        throw null;
    }

    public static /* synthetic */ int onWarmupCompleted(getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(getstarttimemsbugsnag_android_core_release);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iAsInterface = asInterface(getstarttimemsbugsnag_android_core_release);
        int i3 = getInterfaceDescriptor + 1;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return iAsInterface;
    }

    public getStartTimeMsbugsnag_android_core_release(@NotNull Activity activity, @NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.IAuthTabCallback = activity;
        this.IAuthTabCallback_Parcel = view;
        this.onExtraCallback = i;
        this.onWarmupCompleted = activity.getResources().getDisplayMetrics();
        this.IAuthTabCallbackStub = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.underlay.UnderlayDecorViewFactory$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Integer.valueOf(getStartTimeMsbugsnag_android_core_release.onWarmupCompleted(this.f$0));
                    obj.hashCode();
                    throw null;
                }
                Integer numValueOf = Integer.valueOf(getStartTimeMsbugsnag_android_core_release.onWarmupCompleted(this.f$0));
                int i4 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return numValueOf;
                }
                throw null;
            }
        });
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.underlay.UnderlayDecorViewFactory$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 99;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallbackWithResult = getStartTimeMsbugsnag_android_core_release.onExtraCallbackWithResult(this.f$0);
                if (i4 == 0) {
                    return Integer.valueOf(iOnExtraCallbackWithResult);
                }
                int i5 = 51 / 0;
                return Integer.valueOf(iOnExtraCallbackWithResult);
            }
        });
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.underlay.UnderlayDecorViewFactory$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Float fValueOf;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 65;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    fValueOf = Float.valueOf(getStartTimeMsbugsnag_android_core_release.onNavigationEvent(this.f$0));
                    int i4 = 33 / 0;
                } else {
                    fValueOf = Float.valueOf(getStartTimeMsbugsnag_android_core_release.onNavigationEvent(this.f$0));
                }
                int i5 = onExtraCallbackWithResult + 103;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return fValueOf;
            }
        });
        this.IAuthTabCallbackStubProxy = Color.parseColor("#07111F");
        this.IAuthTabCallbackDefault = varyMatches.IAuthTabCallback(36, activity);
        this.asBinder = varyMatches.IAuthTabCallback(16, activity);
    }

    public static final /* synthetic */ int IAuthTabCallback(getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 27;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = getstarttimemsbugsnag_android_core_release.onExtraCallback;
        int i6 = i2 + 47;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.IAuthTabCallbackStub.getValue()).intValue();
        int i4 = getInterfaceDescriptor + 81;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    private static final int asInterface(getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = access000 + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = getstarttimemsbugsnag_android_core_release.onWarmupCompleted.widthPixels;
        int i5 = getInterfaceDescriptor + 7;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int IAuthTabCallbackDefault(getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        float f = getstarttimemsbugsnag_android_core_release.onWarmupCompleted.widthPixels;
        return (int) (i3 == 0 ? f + 0.3f : f * 0.3f);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release = (getStartTimeMsbugsnag_android_core_release) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) getstarttimemsbugsnag_android_core_release.onExtraCallbackWithResult.getValue()).intValue();
        int i4 = access000 + 79;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(iIntValue);
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release = (getStartTimeMsbugsnag_android_core_release) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = varyMatches.IAuthTabCallback(28, getstarttimemsbugsnag_android_core_release.IAuthTabCallback);
        int i4 = access000 + 35;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(fIAuthTabCallback);
        }
        int i5 = 60 / 0;
        return Float.valueOf(fIAuthTabCallback);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release = (getStartTimeMsbugsnag_android_core_release) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) getstarttimemsbugsnag_android_core_release.onNavigationEvent.getValue()).floatValue();
        int i4 = getInterfaceDescriptor + 39;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(fFloatValue);
        }
        int i5 = 29 / 0;
        return Float.valueOf(fFloatValue);
    }

    public final int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = access000;
        int i4 = i3 + 65;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.IAuthTabCallbackDefault;
            int i5 = 63 / 0;
        } else {
            i = this.IAuthTabCallbackDefault;
        }
        int i6 = i3 + 27;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release = (getStartTimeMsbugsnag_android_core_release) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 67;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = getstarttimemsbugsnag_android_core_release.asBinder;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i3 + 75;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    public final UnderlayTextView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 75;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        UnderlayTextView underlayTextView = this.onTransact;
        int i4 = i3 + 81;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return underlayTextView;
        }
        obj.hashCode();
        throw null;
    }

    public final Typography6 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        Typography6 typography6 = this.access100;
        int i5 = i3 + 67;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return typography6;
        }
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 85;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            this.onTransact = null;
            this.access100 = null;
            this.asInterface = null;
        } else {
            this.onTransact = null;
            this.access100 = null;
            this.asInterface = null;
            throw null;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.IAuthTabCallback))) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public final findExitInfoByPidbugsnag_plugin_android_exitinfo_release IAuthTabCallback(@NotNull View view, int i, boolean z) {
        View view2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConstraintLayout constraintLayout = new ConstraintLayout(this.IAuthTabCallback);
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        constraintLayout.setBackground(new GradientDrawable(orientation, new int[]{this.IAuthTabCallbackStubProxy, Color.parseColor("#040A14")}));
        View view3 = new View(this.IAuthTabCallback);
        view3.setId(View.generateViewId());
        view3.setBackground(new GradientDrawable(orientation, new int[]{Color.parseColor("#0007111F"), Color.parseColor("#CC07111F")}));
        ViewGroup.LayoutParams onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, varyMatches.IAuthTabCallback(72, this.IAuthTabCallback));
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult).ITrustedWebActivityCallback = 0;
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult).ICustomTabsCallback = 0;
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult).IPostMessageServiceStubProxy = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(view3, onextracallbackwithresult);
        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        FrameLayout frameLayoutIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        Resources resources = this.IAuthTabCallback.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        FrameLayout frameLayoutOnExtraCallback = onExtraCallback(frameLayoutIAuthTabCallbackDefault, new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration)).onWarmupCompleted());
        if (z) {
            View view4 = new View(this.IAuthTabCallback);
            view4.setBackgroundColor(iIAuthTabCallbackStubProxy);
            view4.setClickable(false);
            view4.setFocusable(false);
            view4.setImportantForAccessibility(2);
            view2 = view4;
        } else {
            int i3 = access000 + 33;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            view2 = null;
        }
        int iFloatValue = (int) ((Float) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1211276165, new Object[]{this}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1211276162, setAutoCaptured.onExtraCallbackWithResult())).floatValue();
        Activity activity = this.IAuthTabCallback;
        Configuration configuration2 = activity.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        View handleBarGlowView = new HandleBarGlowView(activity, setBodyokhttp.onNavigationEvent(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration2))}, -1612582679, 1612582689, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue(), 0.45f), ((Float) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1211276165, new Object[]{this}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1211276162, setAutoCaptured.onExtraCallbackWithResult())).floatValue());
        handleBarGlowView.setId(View.generateViewId());
        int i5 = iFloatValue << 1;
        ViewGroup.LayoutParams onextracallbackwithresult2 = new ConstraintLayout.onExtraCallbackWithResult(IAuthTabCallbackStub() + i5, ((Integer) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -268543751, new Object[]{this}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 268543751, setAutoCaptured.onExtraCallbackWithResult())).intValue() + i5);
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult2).ITrustedWebActivityCallback = 0;
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult2).ICustomTabsCallback = 0;
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult2).IPostMessageServiceStubProxy = 0;
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult2).IAuthTabCallbackDefault = 0;
        constraintLayout.addView(handleBarGlowView, onextracallbackwithresult2);
        FrameLayout frameLayout = new FrameLayout(this.IAuthTabCallback);
        frameLayout.setId(View.generateViewId());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult3 = new ConstraintLayout.onExtraCallbackWithResult(0, -2);
        onextracallbackwithresult3.ITrustedWebActivityCallback = 0;
        onextracallbackwithresult3.ICustomTabsCallback = 0;
        onextracallbackwithresult3.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult3.IAuthTabCallback = 0;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult3).topMargin = this.asBinder;
        constraintLayout.addView(frameLayout, onextracallbackwithresult3);
        view.setTranslationY(varyMatches.IAuthTabCallback(12, this.IAuthTabCallback));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        frameLayout.addView(view, layoutParams);
        PulseRingView pulseRingView = new PulseRingView(this.IAuthTabCallback, i);
        pulseRingView.setId(View.generateViewId());
        pulseRingView.setTranslationY(varyMatches.IAuthTabCallback(12, this.IAuthTabCallback));
        ViewGroup.LayoutParams onextracallbackwithresult4 = new ConstraintLayout.onExtraCallbackWithResult(0, 0);
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult4).ITrustedWebActivityCallback = frameLayout.getId();
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult4).ICustomTabsCallback = frameLayout.getId();
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult4).IPostMessageServiceStubProxy = frameLayout.getId();
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult4).IAuthTabCallback = frameLayout.getId();
        constraintLayout.addView(pulseRingView, onextracallbackwithresult4);
        FrameLayout frameLayout2 = new FrameLayout(this.IAuthTabCallback);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setTranslationZ(-1.0f);
        frameLayout2.addView((View) constraintLayout, new FrameLayout.LayoutParams(-1, 0, 80));
        View view5 = new View(this.IAuthTabCallback);
        view5.setBackgroundColor(Color.parseColor("#040A14"));
        LinearLayout linearLayout = new LinearLayout(this.IAuthTabCallback);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        if (view2 != null) {
            linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 0));
        }
        linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0));
        linearLayout.addView(view5, new LinearLayout.LayoutParams(-1, 0));
        findExitInfoByPidbugsnag_plugin_android_exitinfo_release findexitinfobypidbugsnag_plugin_android_exitinfo_release = new findExitInfoByPidbugsnag_plugin_android_exitinfo_release(linearLayout, frameLayout2, view5, constraintLayout, frameLayoutOnExtraCallback, frameLayoutIAuthTabCallbackDefault, view2, this.asInterface, pulseRingView, frameLayout);
        int i6 = access000 + 81;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            return findexitinfobypidbugsnag_plugin_android_exitinfo_release;
        }
        throw null;
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    int i3 = onNavigationEvent + 93;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i5 = onExtraCallback + 21;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            obj.hashCode();
            throw null;
        }
    }

    public final View onWarmupCompleted(@NotNull String str, @Nullable String str2, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact = IAuthTabCallback(str, i);
        Typography6 typography6 = new Typography6(this.IAuthTabCallback, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        typography6.setText(str2);
        Context context = typography6.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        typography6.setTextColor(setBodyokhttp.onNavigationEvent(new getUrlokhttp(new IAuthTabCallback(configuration)).requestPostMessageChannel().access200(), 0.4f));
        typography6.setTextAlignment(4);
        typography6.setGravity(16);
        if (str2 == null || StringsKt__StringsKt.isBlank(str2)) {
            int i4 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGBA_YVYU;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            i2 = 8;
        } else {
            int i6 = access000 + 3;
            getInterfaceDescriptor = i6 % 128;
            i2 = i6 % 2 != 0 ? 1 : 0;
        }
        typography6.setVisibility(i2);
        typography6.setLayerType(2, onTransact());
        this.access100 = typography6;
        LinearLayout linearLayout = new LinearLayout(this.IAuthTabCallback);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView((View) this.access100, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(this.onTransact, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    private final FrameLayout onExtraCallback(View view, int i) {
        int i2 = 2 % 2;
        HandleOverlayGradientView handleOverlayGradientView = new HandleOverlayGradientView(this.IAuthTabCallback, i, this.IAuthTabCallbackStubProxy, this.onExtraCallback);
        handleOverlayGradientView.setImportantForAccessibility(2);
        FrameLayout frameLayout = new FrameLayout(this.IAuthTabCallback);
        frameLayout.addView(handleOverlayGradientView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, this.asBinder, 80));
        int i3 = getInterfaceDescriptor + 69;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return frameLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent extends ViewOutlineProvider {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        onNavigationEvent() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, -getStartTimeMsbugsnag_android_core_release.IAuthTabCallback(getStartTimeMsbugsnag_android_core_release.this), view.getWidth(), view.getHeight(), getStartTimeMsbugsnag_android_core_release.IAuthTabCallback(getStartTimeMsbugsnag_android_core_release.this));
            int i4 = onWarmupCompleted + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private final FrameLayout IAuthTabCallbackDefault() {
        int i = 2 % 2;
        View view = new View(this.IAuthTabCallback);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(varyMatches.IAuthTabCallback(40, this.IAuthTabCallback));
        gradientDrawable.setColor(view.getContext().getColor(R.color.bottom_sheet_handle_fill));
        view.setBackground(gradientDrawable);
        view.setVisibility(8);
        this.asInterface = view;
        FrameLayout frameLayout = new FrameLayout(this.IAuthTabCallback);
        frameLayout.setMinimumHeight(this.asBinder);
        frameLayout.setBackgroundColor(0);
        frameLayout.setOutlineProvider(new onNavigationEvent());
        frameLayout.setClipToOutline(true);
        View view2 = this.asInterface;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(varyMatches.IAuthTabCallback(48, this.IAuthTabCallback), varyMatches.IAuthTabCallback(4, this.IAuthTabCallback));
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(view2, layoutParams);
        int i2 = getInterfaceDescriptor + 11;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return frameLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        Drawable background = this.IAuthTabCallback_Parcel.getBackground();
        if (!(background instanceof ColorDrawable)) {
            return this.IAuthTabCallback_Parcel.getContext().getColor(R.color.background_default);
        }
        Integer numValueOf = Integer.valueOf(((ColorDrawable) background).getColor());
        Object obj = null;
        if (Color.alpha(numValueOf.intValue()) == 0) {
            int i2 = getInterfaceDescriptor + 45;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i3 = access000 + 111;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                return numValueOf.intValue();
            }
            numValueOf.intValue();
            throw null;
        }
        int color = this.IAuthTabCallback_Parcel.getContext().getColor(R.color.background_default);
        int i4 = access000 + 53;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return color;
        }
        obj.hashCode();
        throw null;
    }

    private final UnderlayTextView IAuthTabCallback(String str, int i) {
        int i2 = 2 % 2;
        UnderlayTextView underlayTextView = new UnderlayTextView(this.IAuthTabCallback);
        underlayTextView.setFont(response.SemiBold);
        underlayTextView.setPrimaryColor(i);
        underlayTextView.onExtraCallback(str);
        int i3 = getInterfaceDescriptor + 69;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return underlayTextView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Paint onTransact() {
        int i = 2 % 2;
        Paint paint = new Paint(1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = access000 + 45;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                paint.setBlendMode(isHighResolutionDisabled.hm_());
                return paint;
            }
            paint.setBlendMode(isHighResolutionDisabled.hm_());
            int i3 = 79 / 0;
            return paint;
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        int i4 = access000 + 83;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return paint;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float asInterface() {
        return ((Float) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1211276165, new Object[]{this}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1211276162, setAutoCaptured.onExtraCallbackWithResult())).floatValue();
    }

    private final int asBinder() {
        return ((Integer) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -268543751, new Object[]{this}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 268543751, setAutoCaptured.onExtraCallbackWithResult())).intValue();
    }

    private static final float onExtraCallback(getStartTimeMsbugsnag_android_core_release getstarttimemsbugsnag_android_core_release) {
        return ((Float) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), 1129609973, new Object[]{getstarttimemsbugsnag_android_core_release}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1129609972, setAutoCaptured.onExtraCallbackWithResult())).floatValue();
    }

    public final int onExtraCallback() {
        return ((Integer) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1126574706, new Object[]{this}, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 1126574708, setAutoCaptured.onExtraCallbackWithResult())).intValue();
    }
}
