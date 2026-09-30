package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.playable.PlayableEndCardBottomSheet;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.TdsSkeletonV1View;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getScaleY implements SearchBarKtExternalSyntheticLambda5 {
    private static int onMinimized = 0;
    private static int onPostMessage = 1;
    public final ConstraintLayout IAuthTabCallback;
    public final PlayableEndCardBottomSheet IAuthTabCallbackDefault;
    public final TdsRoundLayout IAuthTabCallbackStub;
    public final TextView IAuthTabCallbackStubProxy;
    public final View IAuthTabCallback_Parcel;
    public final WebView ICustomTabsCallback;
    public final ScrollView access000;
    public final ConstraintLayout access100;
    public final TdsRoundLayout asBinder;
    public final TdsRoundLayout asInterface;
    public final Typography5 extraCallback;
    public final Typography7 extraCallbackWithResult;
    public final TdsSkeletonV1View getInterfaceDescriptor;
    public final TdsImageView onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final TdsRoundLayout onNavigationEvent;
    public final com.airbnb.lottie.LottieAnimationView onTransact;
    public final AdsCircularCountdownLayout onWarmupCompleted;
    private final ConstraintLayout readTypedObject;
    public final Typography3 writeTypedObject;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onPostMessage + 17;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onPostMessage + 33;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            return constraintLayoutOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private getScaleY(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull AdsCircularCountdownLayout adsCircularCountdownLayout, @NonNull PlayableEndCardBottomSheet playableEndCardBottomSheet, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull TdsRoundLayout tdsRoundLayout3, @NonNull TdsRoundLayout tdsRoundLayout4, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView, @NonNull View view, @NonNull ScrollView scrollView, @NonNull TdsSkeletonV1View tdsSkeletonV1View, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView, @NonNull Typography3 typography3, @NonNull Typography5 typography5, @NonNull Typography7 typography7, @NonNull WebView webView) {
        this.readTypedObject = constraintLayout;
        this.IAuthTabCallback = constraintLayout2;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onExtraCallback = tdsImageView2;
        this.onNavigationEvent = tdsRoundLayout;
        this.onWarmupCompleted = adsCircularCountdownLayout;
        this.IAuthTabCallbackDefault = playableEndCardBottomSheet;
        this.asBinder = tdsRoundLayout2;
        this.asInterface = tdsRoundLayout3;
        this.IAuthTabCallbackStub = tdsRoundLayout4;
        this.onTransact = lottieAnimationView;
        this.IAuthTabCallback_Parcel = view;
        this.access000 = scrollView;
        this.getInterfaceDescriptor = tdsSkeletonV1View;
        this.access100 = constraintLayout3;
        this.IAuthTabCallbackStubProxy = textView;
        this.writeTypedObject = typography3;
        this.extraCallback = typography5;
        this.extraCallbackWithResult = typography7;
        this.ICustomTabsCallback = webView;
    }

    public ConstraintLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 5;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.readTypedObject;
        int i5 = i3 + 45;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static getScaleY IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onMinimized + 9;
        onPostMessage = i2 % 128;
        return onExtraCallback(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
      0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getScaleY onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = onPostMessage + 7;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.ads_sdk_activity_playable_webview, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
                int i3 = onPostMessage + 13;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.ads_sdk_activity_playable_webview, viewGroup, false);
            if (z) {
            }
        }
        return onWarmupCompleted(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[PHI: r3
      0x004a: PHI (r3v6 im.toss.tds.view.component.widget.TdsRoundLayout) = (r3v5 im.toss.tds.view.component.widget.TdsRoundLayout), (r3v14 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:14:0x0048, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1 A[PHI: r4
      0x00f1: PHI (r4v9 androidx.constraintlayout.widget.ConstraintLayout) = (r4v8 androidx.constraintlayout.widget.ConstraintLayout), (r4v14 androidx.constraintlayout.widget.ConstraintLayout) binds: [B:43:0x00ef, B:40:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getScaleY onWarmupCompleted(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent2;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent3;
        View viewOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.container_nudge;
        ConstraintLayout constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (constraintLayoutOnNavigationEvent2 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_share))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_sound))) != null) {
            int i3 = onMinimized + 9;
            onPostMessage = i3 % 128;
            if (i3 % 2 == 0) {
                i2 = R.id.layout_ad_badge;
                tdsRoundLayoutOnNavigationEvent = (TdsRoundLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                int i4 = 55 / 0;
                if (tdsRoundLayoutOnNavigationEvent != null) {
                    TdsRoundLayout tdsRoundLayout = tdsRoundLayoutOnNavigationEvent;
                    i2 = R.id.layout_close;
                    AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (adsCircularCountdownLayout != null) {
                        i2 = R.id.layout_end_card;
                        PlayableEndCardBottomSheet playableEndCardBottomSheet = (PlayableEndCardBottomSheet) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (playableEndCardBottomSheet != null && (tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.layout_nudge))) != null && (tdsRoundLayoutOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.layout_share))) != null) {
                            int i5 = onPostMessage + 65;
                            onMinimized = i5 % 128;
                            Object obj = null;
                            if (i5 % 2 == 0) {
                                i2 = R.id.layout_sound;
                                TdsRoundLayout tdsRoundLayoutOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (tdsRoundLayoutOnNavigationEvent4 != null) {
                                    int i6 = onPostMessage + 65;
                                    onMinimized = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        i2 = R.id.lottie_nudge;
                                        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        if (lottieAnimationViewOnNavigationEvent != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.overlay_nudge))) != null) {
                                            i2 = R.id.scrollViewLog;
                                            ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                            if (scrollView != null) {
                                                int i7 = onMinimized + 49;
                                                onPostMessage = i7 % 128;
                                                int i8 = i7 % 2;
                                                i2 = R.id.skeletonView;
                                                TdsSkeletonV1View tdsSkeletonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                if (tdsSkeletonV1ViewOnNavigationEvent != null) {
                                                    int i9 = onMinimized + 25;
                                                    onPostMessage = i9 % 128;
                                                    if (i9 % 2 == 0) {
                                                        i2 = R.id.top_layout;
                                                        constraintLayoutOnNavigationEvent = (ConstraintLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                        int i10 = 94 / 0;
                                                        if (constraintLayoutOnNavigationEvent != null) {
                                                            ConstraintLayout constraintLayout = constraintLayoutOnNavigationEvent;
                                                            i2 = R.id.tvLog;
                                                            TextView textView = (TextView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                            if (textView != null) {
                                                                int i11 = onMinimized + 117;
                                                                onPostMessage = i11 % 128;
                                                                if (i11 % 2 != 0) {
                                                                    i2 = R.id.tv_nudge_subtitle;
                                                                    Typography3 typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                                    if (typography3OnNavigationEvent != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.tv_nudge_title))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.tvPlayableState))) != null) {
                                                                        i2 = R.id.webView;
                                                                        WebView webView = (WebView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                                        if (webView != null) {
                                                                            return new getScaleY((ConstraintLayout) view, constraintLayoutOnNavigationEvent2, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsRoundLayout, adsCircularCountdownLayout, playableEndCardBottomSheet, tdsRoundLayoutOnNavigationEvent2, tdsRoundLayoutOnNavigationEvent3, tdsRoundLayoutOnNavigationEvent4, lottieAnimationViewOnNavigationEvent, viewOnNavigationEvent, scrollView, tdsSkeletonV1ViewOnNavigationEvent, constraintLayout, textView, typography3OnNavigationEvent, typography5OnNavigationEvent, typography7OnNavigationEvent, webView);
                                                                        }
                                                                    }
                                                                } else {
                                                                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.tv_nudge_subtitle);
                                                                    obj.hashCode();
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i2 = R.id.top_layout;
                                                        constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                        if (constraintLayoutOnNavigationEvent != null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.lottie_nudge);
                                        obj.hashCode();
                                        throw null;
                                    }
                                }
                            } else {
                                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.layout_sound);
                                throw null;
                            }
                        }
                    }
                }
            } else {
                i2 = R.id.layout_ad_badge;
                tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsRoundLayoutOnNavigationEvent != null) {
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
