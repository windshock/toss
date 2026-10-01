package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.SafePlayerView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getRootAlpha implements SearchBarKtExternalSyntheticLambda5 {
    private static int onMinimized = 1;
    private static int onPostMessage;
    public final TdsImageView IAuthTabCallback;
    public final TdsRoundLayout IAuthTabCallbackDefault;
    public final ConstraintLayout IAuthTabCallbackStub;
    public final Typography6 IAuthTabCallbackStubProxy;
    public final ConstraintLayout IAuthTabCallback_Parcel;
    public final FrameLayout ICustomTabsCallback;
    public final SafePlayerView access000;
    public final Typography6 access100;
    public final TdsRoundLayout asBinder;
    public final TdsRoundLayout asInterface;
    public final Typography6 extraCallback;
    public final Typography7 extraCallbackWithResult;
    public final View getInterfaceDescriptor;
    public final TdsImageView onExtraCallback;
    public final Barrier onExtraCallbackWithResult;
    private final View onMessageChannelReady;
    public final TdsImageView onNavigationEvent;
    public final ConstraintLayout onTransact;
    public final TdsImageView onWarmupCompleted;
    public final SubTypography13 readTypedObject;
    public final Typography6 writeTypedObject;

    private getRootAlpha(@NonNull View view, @NonNull Barrier barrier, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsImageView tdsImageView3, @NonNull TdsImageView tdsImageView4, @NonNull ConstraintLayout constraintLayout, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsRoundLayout tdsRoundLayout3, @NonNull ConstraintLayout constraintLayout3, @NonNull SafePlayerView safePlayerView, @NonNull View view2, @NonNull Typography6 typography6, @NonNull Typography6 typography62, @NonNull SubTypography13 subTypography13, @NonNull Typography6 typography63, @NonNull Typography6 typography64, @NonNull Typography7 typography7, @NonNull FrameLayout frameLayout) {
        this.onMessageChannelReady = view;
        this.onExtraCallbackWithResult = barrier;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallback = tdsImageView2;
        this.onWarmupCompleted = tdsImageView3;
        this.IAuthTabCallback = tdsImageView4;
        this.onTransact = constraintLayout;
        this.asInterface = tdsRoundLayout;
        this.IAuthTabCallbackDefault = tdsRoundLayout2;
        this.IAuthTabCallbackStub = constraintLayout2;
        this.asBinder = tdsRoundLayout3;
        this.IAuthTabCallback_Parcel = constraintLayout3;
        this.access000 = safePlayerView;
        this.getInterfaceDescriptor = view2;
        this.IAuthTabCallbackStubProxy = typography6;
        this.access100 = typography62;
        this.readTypedObject = subTypography13;
        this.extraCallback = typography63;
        this.writeTypedObject = typography64;
        this.extraCallbackWithResult = typography7;
        this.ICustomTabsCallback = frameLayout;
    }

    public View getRoot() {
        View view;
        int i = 2 % 2;
        int i2 = onPostMessage + 93;
        int i3 = i2 % 128;
        onMinimized = i3;
        if (i2 % 2 == 0) {
            view = this.onMessageChannelReady;
            int i4 = 55 / 0;
        } else {
            view = this.onMessageChannelReady;
        }
        int i5 = i3 + 43;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        throw null;
    }

    public static getRootAlpha onNavigationEvent(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i2 = onPostMessage + 25;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        layoutInflater.inflate(R.layout.ads_sdk_feed_video_ad_view, viewGroup);
        getRootAlpha getrootalphaOnExtraCallback = onExtraCallback(viewGroup);
        int i4 = onPostMessage + 17;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return getrootalphaOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[PHI: r9
      0x006e: PHI (r9v3 im.toss.tds.view.component.widget.TdsRoundLayout) = (r9v2 im.toss.tds.view.component.widget.TdsRoundLayout), (r9v6 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:20:0x006c, B:17:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getRootAlpha onExtraCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsImageView tdsImageViewOnNavigationEvent3;
        TdsImageView tdsImageViewOnNavigationEvent4;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        ConstraintLayout constraintLayoutOnNavigationEvent3;
        SafePlayerView safePlayerViewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        Typography6 typography6OnNavigationEvent2;
        Typography6 typography6OnNavigationEvent3;
        Typography7 typography7OnNavigationEvent;
        int i = 2 % 2;
        int i2 = onMinimized + 1;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.barrier_top_section_below;
        Barrier barrierOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (barrierOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.iv_icon))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.iv_more))) != null && (tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.iv_mute))) != null && (tdsImageViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.iv_thumbnail))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.layout_content))) != null) {
            int i5 = onMinimized + 71;
            onPostMessage = i5 % 128;
            if (i5 % 2 != 0) {
                i4 = R.id.layout_icon;
                tdsRoundLayoutOnNavigationEvent = (TdsRoundLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                int i6 = 10 / 0;
                if (tdsRoundLayoutOnNavigationEvent != null) {
                    i4 = R.id.layout_main;
                    TdsRoundLayout tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                    if (tdsRoundLayoutOnNavigationEvent2 != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.layout_main_bottom))) != null) {
                        int i7 = onPostMessage + 109;
                        onMinimized = i7 % 128;
                        if (i7 % 2 == 0) {
                            Object obj = null;
                            SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.layout_mute);
                            obj.hashCode();
                            throw null;
                        }
                        i4 = R.id.layout_mute;
                        TdsRoundLayout tdsRoundLayoutOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                        if (tdsRoundLayoutOnNavigationEvent3 != null && (constraintLayoutOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.layout_top))) != null && (safePlayerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.player_view))) != null) {
                            int i8 = onPostMessage + 113;
                            onMinimized = i8 % 128;
                            if (i8 % 2 == 0) {
                                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.space_middle);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            i4 = R.id.space_middle;
                            View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                            if (viewOnNavigationEvent != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tv_content_row1))) != null && (typography6OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tv_content_row2))) != null) {
                                int i9 = onPostMessage + 9;
                                onMinimized = i9 % 128;
                                int i10 = i9 % 2;
                                i4 = R.id.tv_disc;
                                SubTypography13 subTypography13OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                if (subTypography13OnNavigationEvent != null && (typography6OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tv_more))) != null) {
                                    int i11 = onMinimized + 31;
                                    onPostMessage = i11 % 128;
                                    int i12 = i11 % 2;
                                    i4 = R.id.tv_row1;
                                    Typography6 typography6OnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                    if (typography6OnNavigationEvent4 != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tv_row2))) != null) {
                                        i4 = R.id.video_container;
                                        FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                        if (frameLayout != null) {
                                            return new getRootAlpha(view, barrierOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent3, tdsImageViewOnNavigationEvent4, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent2, constraintLayoutOnNavigationEvent2, tdsRoundLayoutOnNavigationEvent3, constraintLayoutOnNavigationEvent3, safePlayerViewOnNavigationEvent, viewOnNavigationEvent, typography6OnNavigationEvent, typography6OnNavigationEvent2, subTypography13OnNavigationEvent, typography6OnNavigationEvent3, typography6OnNavigationEvent4, typography7OnNavigationEvent, frameLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                i4 = R.id.layout_icon;
                tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (tdsRoundLayoutOnNavigationEvent != null) {
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
