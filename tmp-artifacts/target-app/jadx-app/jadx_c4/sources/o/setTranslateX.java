package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.ads_sdk.ui.view.ShortFormPlayerView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setTranslateX implements SearchBarKtExternalSyntheticLambda5 {
    private static int onActivityLayout = 1;
    private static int onActivityResized;
    public final TdsImageView IAuthTabCallback;
    public final AdsCircularCountdownLayout IAuthTabCallbackDefault;
    public final TdsRoundLayout IAuthTabCallbackStub;
    public final ShortFormPlayerView IAuthTabCallbackStubProxy;
    public final View IAuthTabCallback_Parcel;
    public final Typography5 ICustomTabsCallback;
    public final Typography5 access000;
    public final View access100;
    public final ConstraintLayout asBinder;
    public final View asInterface;
    public final Typography5 extraCallback;
    public final View extraCallbackWithResult;
    public final Typography5 getInterfaceDescriptor;
    public final TdsRoundLayout onExtraCallback;
    public final View onExtraCallbackWithResult;
    private final ConstraintLayout onMessageChannelReady;
    public final TdsSquircleLayoutV1 onNavigationEvent;
    public final View onPostMessage;
    public final TdsImageView onTransact;
    public final ScrollView onWarmupCompleted;
    public final View readTypedObject;
    public final Typography5 writeTypedObject;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onActivityLayout + 47;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayoutOnExtraCallbackWithResult;
        }
        throw null;
    }

    private setTranslateX(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsSquircleLayoutV1 tdsSquircleLayoutV1, @NonNull ScrollView scrollView, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull View view2, @NonNull AdsCircularCountdownLayout adsCircularCountdownLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull ShortFormPlayerView shortFormPlayerView, @NonNull View view3, @NonNull View view4, @NonNull Typography5 typography5, @NonNull Typography5 typography52, @NonNull Typography5 typography53, @NonNull Typography5 typography54, @NonNull Typography5 typography55, @NonNull View view5, @NonNull View view6, @NonNull View view7) {
        this.onMessageChannelReady = constraintLayout;
        this.onExtraCallbackWithResult = view;
        this.onExtraCallback = tdsRoundLayout;
        this.onNavigationEvent = tdsSquircleLayoutV1;
        this.onWarmupCompleted = scrollView;
        this.IAuthTabCallback = tdsImageView;
        this.onTransact = tdsImageView2;
        this.asInterface = view2;
        this.IAuthTabCallbackDefault = adsCircularCountdownLayout;
        this.asBinder = constraintLayout2;
        this.IAuthTabCallbackStub = tdsRoundLayout2;
        this.IAuthTabCallbackStubProxy = shortFormPlayerView;
        this.access100 = view3;
        this.IAuthTabCallback_Parcel = view4;
        this.getInterfaceDescriptor = typography5;
        this.access000 = typography52;
        this.writeTypedObject = typography53;
        this.extraCallback = typography54;
        this.ICustomTabsCallback = typography55;
        this.extraCallbackWithResult = view5;
        this.readTypedObject = view6;
        this.onPostMessage = view7;
    }

    public ConstraintLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityResized + 69;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onMessageChannelReady;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setTranslateX IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        setTranslateX settranslatexOnExtraCallback = onExtraCallback(layoutInflater, null, false);
        int i4 = onActivityResized + 17;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return settranslatexOnExtraCallback;
    }

    public static setTranslateX onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.ads_sdk_activity_short_form, viewGroup, false);
        if (z) {
            int i2 = onActivityResized + 65;
            onActivityLayout = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = onActivityResized + 47;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
        }
        return onWarmupCompleted(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
      0x0024: PHI (r4v1 android.view.View) = (r4v0 android.view.View), (r4v12 android.view.View) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static setTranslateX onWarmupCompleted(@NonNull View view) {
        int i;
        View viewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        View viewOnNavigationEvent2;
        View viewOnNavigationEvent3;
        View viewOnNavigationEvent4;
        Typography5 typography5OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        Typography5 typography5OnNavigationEvent3;
        View viewOnNavigationEvent5;
        View viewOnNavigationEvent6;
        View viewOnNavigationEvent7;
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 1;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.id.anchor_gradient;
            viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 5 / 0;
            if (viewOnNavigationEvent != null) {
                View view2 = viewOnNavigationEvent;
                i = R.id.bottom_cta;
                TdsRoundLayout tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (tdsRoundLayoutOnNavigationEvent != null) {
                    int i5 = onActivityResized + 61;
                    onActivityLayout = i5 % 128;
                    int i6 = i5 % 2;
                    i = R.id.image_container;
                    TdsSquircleLayoutV1 tdsSquircleLayoutV1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (tdsSquircleLayoutV1OnNavigationEvent != null) {
                        i = R.id.imp_scroll_view;
                        ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                        if (scrollView != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.iv_bottom))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.iv_sound))) != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.layout_click_area))) != null) {
                            int i7 = onActivityLayout + 39;
                            onActivityResized = i7 % 128;
                            int i8 = i7 % 2;
                            i = R.id.layout_close;
                            AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                            if (adsCircularCountdownLayout != null) {
                                int i9 = onActivityResized + 105;
                                onActivityLayout = i9 % 128;
                                Object obj = null;
                                if (i9 % 2 == 0) {
                                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.layout_content);
                                    obj.hashCode();
                                    throw null;
                                }
                                i = R.id.layout_content;
                                ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                if (constraintLayoutOnNavigationEvent != null) {
                                    int i10 = onActivityResized + 119;
                                    onActivityLayout = i10 % 128;
                                    int i11 = i10 % 2;
                                    i = R.id.layout_sound;
                                    TdsRoundLayout tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                    if (tdsRoundLayoutOnNavigationEvent2 != null) {
                                        i = R.id.playerView;
                                        ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                        if (shortFormPlayerView != null && (viewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.space_bottom))) != null && (viewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.space_top))) != null) {
                                            int i12 = onActivityResized + 5;
                                            onActivityLayout = i12 % 128;
                                            int i13 = i12 % 2;
                                            i = R.id.tv_button;
                                            Typography5 typography5OnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                            if (typography5OnNavigationEvent4 != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tv_disc))) != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tv_logs))) != null) {
                                                int i14 = onActivityLayout + 53;
                                                onActivityResized = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.tv_subtitle);
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                i = R.id.tv_subtitle;
                                                Typography5 typography5OnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                                if (typography5OnNavigationEvent5 != null && (typography5OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tv_title))) != null && (viewOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_dim_1))) != null && (viewOnNavigationEvent6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_dim_2))) != null && (viewOnNavigationEvent7 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_log_button))) != null) {
                                                    return new setTranslateX((ConstraintLayout) view, view2, tdsRoundLayoutOnNavigationEvent, tdsSquircleLayoutV1OnNavigationEvent, scrollView, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, viewOnNavigationEvent2, adsCircularCountdownLayout, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent2, shortFormPlayerView, viewOnNavigationEvent3, viewOnNavigationEvent4, typography5OnNavigationEvent4, typography5OnNavigationEvent, typography5OnNavigationEvent2, typography5OnNavigationEvent5, typography5OnNavigationEvent3, viewOnNavigationEvent5, viewOnNavigationEvent6, viewOnNavigationEvent7);
                                                }
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
            i = R.id.anchor_gradient;
            viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (viewOnNavigationEvent != null) {
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
