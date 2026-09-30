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
public final class getItemPosition implements SearchBarKtExternalSyntheticLambda5 {
    private static int onActivityResized = 0;
    private static int onPostMessage = 1;
    public final ScrollView IAuthTabCallback;
    public final ConstraintLayout IAuthTabCallbackDefault;
    public final AdsCircularCountdownLayout IAuthTabCallbackStub;
    public final View IAuthTabCallbackStubProxy;
    public final View IAuthTabCallback_Parcel;
    public final View ICustomTabsCallback;
    public final ShortFormPlayerView access000;
    public final Typography5 access100;
    public final View asBinder;
    public final TdsImageView asInterface;
    public final Typography5 extraCallback;
    public final View extraCallbackWithResult;
    public final Typography5 getInterfaceDescriptor;
    private final ConstraintLayout onActivityLayout;
    public final TdsRoundLayout onExtraCallback;
    public final TdsSquircleLayoutV1 onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsRoundLayout onTransact;
    public final View onWarmupCompleted;
    public final View readTypedObject;
    public final Typography5 writeTypedObject;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onActivityResized + 49;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallback = onExtraCallback();
        int i4 = onActivityResized + 91;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnExtraCallback;
    }

    private getItemPosition(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsSquircleLayoutV1 tdsSquircleLayoutV1, @NonNull ScrollView scrollView, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull View view2, @NonNull AdsCircularCountdownLayout adsCircularCountdownLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull ShortFormPlayerView shortFormPlayerView, @NonNull View view3, @NonNull View view4, @NonNull Typography5 typography5, @NonNull Typography5 typography52, @NonNull Typography5 typography53, @NonNull Typography5 typography54, @NonNull View view5, @NonNull View view6, @NonNull View view7) {
        this.onActivityLayout = constraintLayout;
        this.onWarmupCompleted = view;
        this.onExtraCallback = tdsRoundLayout;
        this.onExtraCallbackWithResult = tdsSquircleLayoutV1;
        this.IAuthTabCallback = scrollView;
        this.onNavigationEvent = tdsImageView;
        this.asInterface = tdsImageView2;
        this.asBinder = view2;
        this.IAuthTabCallbackStub = adsCircularCountdownLayout;
        this.IAuthTabCallbackDefault = constraintLayout2;
        this.onTransact = tdsRoundLayout2;
        this.access000 = shortFormPlayerView;
        this.IAuthTabCallbackStubProxy = view3;
        this.IAuthTabCallback_Parcel = view4;
        this.access100 = typography5;
        this.getInterfaceDescriptor = typography52;
        this.extraCallback = typography53;
        this.writeTypedObject = typography54;
        this.extraCallbackWithResult = view5;
        this.ICustomTabsCallback = view6;
        this.readTypedObject = view7;
    }

    public ConstraintLayout onExtraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 11;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onActivityLayout;
        }
        throw null;
    }

    public static getItemPosition IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onPostMessage + 47;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getItemPosition getitempositionOnNavigationEvent = onNavigationEvent(layoutInflater, null, false);
        int i4 = onPostMessage + 7;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return getitempositionOnNavigationEvent;
    }

    public static getItemPosition onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.ads_sdk_v2_activity_short_form, viewGroup, false);
        Object obj = null;
        if (!(!z)) {
            int i4 = onPostMessage + 1;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                obj.hashCode();
                throw null;
            }
        }
        getItemPosition getitempositionOnExtraCallbackWithResult = onExtraCallbackWithResult(viewInflate);
        int i5 = onActivityResized + 63;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return getitempositionOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142 A[PHI: r3
      0x0142: PHI (r3v9 int) = (r3v8 int), (r3v13 int), (r3v14 int) binds: [B:43:0x00e5, B:45:0x00fa, B:47:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getItemPosition onExtraCallbackWithResult(@NonNull View view) {
        TdsSquircleLayoutV1 tdsSquircleLayoutV1OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        View viewOnNavigationEvent;
        View viewOnNavigationEvent2;
        Typography5 typography5;
        Typography5 typography5OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        View viewOnNavigationEvent3;
        View viewOnNavigationEvent4;
        int i = 2 % 2;
        int i2 = R.id.anchor_gradient;
        View viewOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (viewOnNavigationEvent5 != null) {
            int i3 = onActivityResized + 79;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.bottom_cta;
            TdsRoundLayout tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsRoundLayoutOnNavigationEvent != null && (tdsSquircleLayoutV1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.image_container))) != null) {
                i2 = R.id.imp_scroll_view;
                ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (scrollView != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_bottom))) != null) {
                    int i5 = onActivityResized + 63;
                    onPostMessage = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object obj = null;
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.iv_sound);
                        obj.hashCode();
                        throw null;
                    }
                    i2 = R.id.iv_sound;
                    TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (tdsImageViewOnNavigationEvent2 != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.layout_click_area))) != null) {
                        i2 = R.id.layout_close;
                        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (adsCircularCountdownLayout != null) {
                            int i6 = onPostMessage + 11;
                            onActivityResized = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = R.id.layout_content;
                            ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (constraintLayoutOnNavigationEvent != null) {
                                int i8 = onPostMessage + 59;
                                onActivityResized = i8 % 128;
                                if (i8 % 2 != 0) {
                                    Object obj2 = null;
                                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.layout_sound);
                                    obj2.hashCode();
                                    throw null;
                                }
                                i2 = R.id.layout_sound;
                                TdsRoundLayout tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (tdsRoundLayoutOnNavigationEvent2 != null) {
                                    i2 = R.id.playerView;
                                    ShortFormPlayerView shortFormPlayerView = (ShortFormPlayerView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                    if (shortFormPlayerView != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.space_bottom))) != null) {
                                        int i9 = onPostMessage + 83;
                                        onActivityResized = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            Object obj3 = null;
                                            SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.space_top);
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        i2 = R.id.space_top;
                                        View viewOnNavigationEvent6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        if (viewOnNavigationEvent6 != null) {
                                            int i10 = onPostMessage + 51;
                                            onActivityResized = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                i2 = R.id.tv_button;
                                                Typography5 typography52 = (Typography5) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                int i11 = 63 / 0;
                                                if (typography52 != null) {
                                                    typography5 = typography52;
                                                    int i12 = R.id.tv_logs;
                                                    typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i12);
                                                    if (typography5OnNavigationEvent == null) {
                                                        int i13 = onPostMessage + 117;
                                                        onActivityResized = i13 % 128;
                                                        int i14 = i13 % 2;
                                                        i12 = R.id.tv_subtitle;
                                                        Typography5 typography5OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i12);
                                                        if (typography5OnNavigationEvent3 == null || (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i12 = R.id.tv_title))) == null) {
                                                            i2 = i12;
                                                        } else {
                                                            int i15 = onActivityResized + 13;
                                                            onPostMessage = i15 % 128;
                                                            if (i15 % 2 == 0) {
                                                                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.view_dim_1);
                                                                throw null;
                                                            }
                                                            int i16 = R.id.view_dim_1;
                                                            View viewOnNavigationEvent7 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i16);
                                                            if (viewOnNavigationEvent7 != null && (viewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i16 = R.id.view_dim_2))) != null && (viewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i16 = R.id.view_log_button))) != null) {
                                                                return new getItemPosition((ConstraintLayout) view, viewOnNavigationEvent5, tdsRoundLayoutOnNavigationEvent, tdsSquircleLayoutV1OnNavigationEvent, scrollView, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, viewOnNavigationEvent, adsCircularCountdownLayout, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent2, shortFormPlayerView, viewOnNavigationEvent2, viewOnNavigationEvent6, typography5, typography5OnNavigationEvent, typography5OnNavigationEvent3, typography5OnNavigationEvent2, viewOnNavigationEvent7, viewOnNavigationEvent3, viewOnNavigationEvent4);
                                                            }
                                                            i2 = i16;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i2 = R.id.tv_button;
                                                Typography5 typography5OnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                if (typography5OnNavigationEvent4 != null) {
                                                    typography5 = typography5OnNavigationEvent4;
                                                    int i122 = R.id.tv_logs;
                                                    typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i122);
                                                    if (typography5OnNavigationEvent == null) {
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
