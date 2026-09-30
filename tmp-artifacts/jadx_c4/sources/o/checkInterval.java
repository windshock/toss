package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.feature.credit.ui.main.R;
import im.toss.tds.view.component.anim.top.AnimateTop;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.gl.TdsGLBlurView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkInterval implements SearchBarKtExternalSyntheticLambda5 {
    private static int ICustomTabsCallbackStub = 1;
    private static int onActivityResized;
    public final com.airbnb.lottie.LottieAnimationView IAuthTabCallback;
    public final LinearLayout IAuthTabCallbackDefault;
    public final ComposeView IAuthTabCallbackStub;
    public final com.airbnb.lottie.LottieAnimationView IAuthTabCallbackStubProxy;
    public final com.airbnb.lottie.LottieAnimationView IAuthTabCallback_Parcel;
    public final NestedScrollView ICustomTabsCallback;
    public final toFlameGraphLine access000;
    public final toFlameGraphLine access100;
    public final TdsBottomCtaV1View asBinder;
    public final isFreeze asInterface;
    public final FrameLayout extraCallback;
    public final com.airbnb.lottie.LottieAnimationView extraCallbackWithResult;
    public final toFlameGraphLine getInterfaceDescriptor;
    public final View onActivityLayout;
    public final AppBarLayout onExtraCallback;
    public final TdsGLBlurView onExtraCallbackWithResult;
    private final FrameLayout onMessageChannelReady;
    public final TdsImageView onMinimized;
    public final AnimateTop onNavigationEvent;
    public final Toolbar onPostMessage;
    public final View onTransact;
    public final com.airbnb.lottie.LottieAnimationView onWarmupCompleted;
    public final toFlameGraphLine readTypedObject;
    public final SwipeRefreshLayout writeTypedObject;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayoutOnWarmupCompleted = onWarmupCompleted();
        int i4 = ICustomTabsCallbackStub + 41;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return frameLayoutOnWarmupCompleted;
    }

    private checkInterval(@NonNull FrameLayout frameLayout, @NonNull AnimateTop animateTop, @NonNull AppBarLayout appBarLayout, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView, @NonNull TdsGLBlurView tdsGLBlurView, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView2, @NonNull isFreeze isfreeze, @NonNull ComposeView composeView, @NonNull LinearLayout linearLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull View view, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView3, @NonNull toFlameGraphLine toflamegraphline, @NonNull toFlameGraphLine toflamegraphline2, @NonNull toFlameGraphLine toflamegraphline3, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView4, @NonNull toFlameGraphLine toflamegraphline4, @NonNull FrameLayout frameLayout2, @NonNull NestedScrollView nestedScrollView, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView5, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull TdsImageView tdsImageView, @NonNull Toolbar toolbar, @NonNull View view2) {
        this.onMessageChannelReady = frameLayout;
        this.onNavigationEvent = animateTop;
        this.onExtraCallback = appBarLayout;
        this.IAuthTabCallback = lottieAnimationView;
        this.onExtraCallbackWithResult = tdsGLBlurView;
        this.onWarmupCompleted = lottieAnimationView2;
        this.asInterface = isfreeze;
        this.IAuthTabCallbackStub = composeView;
        this.IAuthTabCallbackDefault = linearLayout;
        this.asBinder = tdsBottomCtaV1View;
        this.onTransact = view;
        this.IAuthTabCallbackStubProxy = lottieAnimationView3;
        this.access000 = toflamegraphline;
        this.access100 = toflamegraphline2;
        this.getInterfaceDescriptor = toflamegraphline3;
        this.IAuthTabCallback_Parcel = lottieAnimationView4;
        this.readTypedObject = toflamegraphline4;
        this.extraCallback = frameLayout2;
        this.ICustomTabsCallback = nestedScrollView;
        this.extraCallbackWithResult = lottieAnimationView5;
        this.writeTypedObject = swipeRefreshLayout;
        this.onMinimized = tdsImageView;
        this.onPostMessage = toolbar;
        this.onActivityLayout = view2;
    }

    public FrameLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 77;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onMessageChannelReady;
        }
        throw null;
    }

    public static checkInterval onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 101;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        checkInterval checkintervalOnExtraCallback = onExtraCallback(layoutInflater, null, false);
        int i4 = onActivityResized + 101;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return checkintervalOnExtraCallback;
    }

    public static checkInterval onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_credit_dual, viewGroup, false);
        if (!(!z)) {
            int i2 = onActivityResized + 125;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = ICustomTabsCallbackStub + 63;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[PHI: r2 r5
      0x007c: PHI (r2v16 o.isFreeze) = (r2v15 o.isFreeze), (r2v56 o.isFreeze) binds: [B:22:0x007a, B:19:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r5v3 androidx.compose.ui.platform.ComposeView) = (r5v2 androidx.compose.ui.platform.ComposeView), (r5v7 androidx.compose.ui.platform.ComposeView) binds: [B:22:0x007a, B:19:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c A[PHI: r3
      0x013c: PHI (r3v8 androidx.core.widget.NestedScrollView) = (r3v7 androidx.core.widget.NestedScrollView), (r3v16 androidx.core.widget.NestedScrollView) binds: [B:53:0x013a, B:50:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa A[PHI: r4
      0x01aa: PHI (r4v18 int) = (r4v6 int), (r4v19 int) binds: [B:22:0x007a, B:19:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static checkInterval onExtraCallbackWithResult(@NonNull View view) {
        AppBarLayout appBarLayoutOnNavigationEvent;
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsGLBlurView tdsGLBlurViewOnNavigationEvent;
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent2;
        View viewOnNavigationEvent;
        isFreeze isfreezeOnExtraCallback;
        int i;
        ComposeView composeViewOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        View viewOnNavigationEvent2;
        View viewOnNavigationEvent3;
        NestedScrollView nestedScrollViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 123;
        ICustomTabsCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.animate_top);
            obj.hashCode();
            throw null;
        }
        int i4 = R.id.animate_top;
        AnimateTop animateTopOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (animateTopOnNavigationEvent != null && (appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.app_bar_layout))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.big_color_ring))) != null && (tdsGLBlurViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.blur_view))) != null && (lottieAnimationViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.confetti_lottie))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.confetti_overlay))) != null) {
            int i5 = onActivityResized + 39;
            ICustomTabsCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                isfreezeOnExtraCallback = isFreeze.onExtraCallback(viewOnNavigationEvent);
                i = R.id.credit_container;
                composeViewOnNavigationEvent = (ComposeView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                int i6 = 32 / 0;
                if (composeViewOnNavigationEvent != null) {
                    isFreeze isfreeze = isfreezeOnExtraCallback;
                    ComposeView composeView = composeViewOnNavigationEvent;
                    int i7 = ICustomTabsCallbackStub + 11;
                    onActivityResized = i7 % 128;
                    if (i7 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i4 = R.id.credit_score_layout;
                    LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                    if (linearLayout != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.cta))) != null) {
                        int i8 = onActivityResized + 47;
                        ICustomTabsCallbackStub = i8 % 128;
                        int i9 = i8 % 2;
                        i4 = R.id.dim_view;
                        View viewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                        if (viewOnNavigationEvent4 != null) {
                            int i10 = ICustomTabsCallbackStub + 3;
                            onActivityResized = i10 % 128;
                            int i11 = i10 % 2;
                            i4 = R.id.kcb_blur_color_ring;
                            com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                            if (lottieAnimationViewOnNavigationEvent3 != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.kcb_credit_score_view))) != null) {
                                toFlameGraphLine toflamegraphlineOnNavigationEvent = toFlameGraphLine.onNavigationEvent(viewOnNavigationEvent2);
                                i4 = R.id.neo_kcb_view;
                                View viewOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                if (viewOnNavigationEvent5 != null) {
                                    toFlameGraphLine toflamegraphlineOnNavigationEvent2 = toFlameGraphLine.onNavigationEvent(viewOnNavigationEvent5);
                                    i4 = R.id.neo_nice_view;
                                    View viewOnNavigationEvent6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                    if (viewOnNavigationEvent6 != null) {
                                        int i12 = ICustomTabsCallbackStub + 21;
                                        onActivityResized = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            toFlameGraphLine.onNavigationEvent(viewOnNavigationEvent6);
                                            SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.nice_blur_color_ring);
                                            throw null;
                                        }
                                        toFlameGraphLine toflamegraphlineOnNavigationEvent3 = toFlameGraphLine.onNavigationEvent(viewOnNavigationEvent6);
                                        i4 = R.id.nice_blur_color_ring;
                                        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                        if (lottieAnimationViewOnNavigationEvent4 != null && (viewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.nice_credit_score_view))) != null) {
                                            toFlameGraphLine toflamegraphlineOnNavigationEvent4 = toFlameGraphLine.onNavigationEvent(viewOnNavigationEvent3);
                                            i4 = R.id.root_layout;
                                            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                            if (frameLayout != null) {
                                                int i13 = ICustomTabsCallbackStub + 61;
                                                onActivityResized = i13 % 128;
                                                if (i13 % 2 != 0) {
                                                    i4 = R.id.scroll_view;
                                                    nestedScrollViewOnNavigationEvent = (NestedScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                                    int i14 = 56 / 0;
                                                    if (nestedScrollViewOnNavigationEvent != null) {
                                                        NestedScrollView nestedScrollView = nestedScrollViewOnNavigationEvent;
                                                        i4 = R.id.second_big_color_ring;
                                                        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                                        if (lottieAnimationViewOnNavigationEvent5 != null) {
                                                            int i15 = ICustomTabsCallbackStub + 47;
                                                            onActivityResized = i15 % 128;
                                                            int i16 = i15 % 2;
                                                            i4 = R.id.swipe_container;
                                                            SwipeRefreshLayout swipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                                            if (swipeRefreshLayoutOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.test_button))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.toolbar))) != null) {
                                                                int i17 = onActivityResized + 37;
                                                                ICustomTabsCallbackStub = i17 % 128;
                                                                int i18 = i17 % 2;
                                                                i4 = R.id.toolbar_background;
                                                                View viewOnNavigationEvent7 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                                                if (viewOnNavigationEvent7 != null) {
                                                                    return new checkInterval((FrameLayout) view, animateTopOnNavigationEvent, appBarLayoutOnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsGLBlurViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent2, isfreeze, composeView, linearLayout, tdsBottomCtaV1ViewOnNavigationEvent, viewOnNavigationEvent4, lottieAnimationViewOnNavigationEvent3, toflamegraphlineOnNavigationEvent, toflamegraphlineOnNavigationEvent2, toflamegraphlineOnNavigationEvent3, lottieAnimationViewOnNavigationEvent4, toflamegraphlineOnNavigationEvent4, frameLayout, nestedScrollView, lottieAnimationViewOnNavigationEvent5, swipeRefreshLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, toolbarOnNavigationEvent, viewOnNavigationEvent7);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i4 = R.id.scroll_view;
                                                    nestedScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                                    if (nestedScrollViewOnNavigationEvent != null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i4 = i;
                }
            } else {
                isfreezeOnExtraCallback = isFreeze.onExtraCallback(viewOnNavigationEvent);
                i = R.id.credit_container;
                composeViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (composeViewOnNavigationEvent != null) {
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
