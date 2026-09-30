package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PagerAdapter implements SearchBarKtExternalSyntheticLambda5 {
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    public final Typography7 IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    public final TdsImageView IAuthTabCallbackStub;
    public final com.airbnb.lottie.LottieAnimationView IAuthTabCallbackStubProxy;
    public final TdsSquircleLayoutV1 IAuthTabCallback_Parcel;
    public final Typography7 ICustomTabsCallback;
    public final SubTypography13 access000;
    public final TdsImageView access100;
    public final ConstraintLayout asBinder;
    public final TdsRoundLayout asInterface;
    private final ConstraintLayout extraCallback;
    public final SubTypography8 extraCallbackWithResult;
    public final StyledPlayerView getInterfaceDescriptor;
    public final NativeAdsThumbnailAdMobView onExtraCallback;
    public final ParcelImpl onExtraCallbackWithResult;
    public final FrameLayout onNavigationEvent;
    public final TdsImageView onTransact;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayoutOnWarmupCompleted = onWarmupCompleted();
        int i3 = writeTypedObject + 39;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return constraintLayoutOnWarmupCompleted;
    }

    private PagerAdapter(@NonNull ConstraintLayout constraintLayout, @NonNull NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, @NonNull Typography7 typography7, @NonNull ParcelImpl parcelImpl, @NonNull FrameLayout frameLayout, @NonNull TdsImageView tdsImageView, @NonNull View view, @NonNull TdsImageView tdsImageView2, @NonNull TdsImageView tdsImageView3, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView, @NonNull TdsSquircleLayoutV1 tdsSquircleLayoutV1, @NonNull StyledPlayerView styledPlayerView, @NonNull TdsImageView tdsImageView4, @NonNull SubTypography13 subTypography13, @NonNull Typography7 typography72, @NonNull SubTypography8 subTypography8) {
        this.extraCallback = constraintLayout;
        this.onExtraCallback = nativeAdsThumbnailAdMobView;
        this.IAuthTabCallback = typography7;
        this.onExtraCallbackWithResult = parcelImpl;
        this.onNavigationEvent = frameLayout;
        this.onWarmupCompleted = tdsImageView;
        this.IAuthTabCallbackDefault = view;
        this.onTransact = tdsImageView2;
        this.IAuthTabCallbackStub = tdsImageView3;
        this.asInterface = tdsRoundLayout;
        this.asBinder = constraintLayout2;
        this.IAuthTabCallbackStubProxy = lottieAnimationView;
        this.IAuthTabCallback_Parcel = tdsSquircleLayoutV1;
        this.getInterfaceDescriptor = styledPlayerView;
        this.access100 = tdsImageView4;
        this.access000 = subTypography13;
        this.ICustomTabsCallback = typography72;
        this.extraCallbackWithResult = subTypography8;
    }

    public ConstraintLayout onWarmupCompleted() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 37;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            constraintLayout = this.extraCallback;
            int i4 = 51 / 0;
        } else {
            constraintLayout = this.extraCallback;
        }
        int i5 = i2 + 81;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static PagerAdapter onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.ads_sdk_thumbnail_video_v2_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i2 = readTypedObject + 65;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        PagerAdapter pagerAdapterOnExtraCallback = onExtraCallback(viewInflate);
        int i4 = readTypedObject + 17;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return pagerAdapterOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[PHI: r3
      0x0093: PHI (r3v12 im.toss.tds.view.component.widget.TdsRoundLayout) = (r3v11 im.toss.tds.view.component.widget.TdsRoundLayout), (r3v16 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:26:0x0091, B:23:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PagerAdapter onExtraCallback(@NonNull View view) {
        Typography7 typography7OnNavigationEvent;
        View viewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        View viewOnNavigationEvent2;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsSquircleLayoutV1 tdsSquircleLayoutV1OnNavigationEvent;
        StyledPlayerView styledPlayerViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent3;
        SubTypography13 subTypography13OnNavigationEvent;
        Typography7 typography7OnNavigationEvent2;
        SubTypography8 subTypography8OnNavigationEvent;
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.admobView;
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = (NativeAdsThumbnailAdMobView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (nativeAdsThumbnailAdMobView != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.btnMore))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.btnPlay))) != null) {
            ParcelImpl parcelImplOnNavigationEvent = ParcelImpl.onNavigationEvent(viewOnNavigationEvent);
            i4 = R.id.btnSound;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (frameLayout != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.btnSoundImage))) != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.contentContainer))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.imageView))) != null) {
                int i5 = readTypedObject + 9;
                writeTypedObject = i5 % 128;
                if (i5 % 2 != 0) {
                    i4 = R.id.iv_logo;
                    TdsImageView tdsImageViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                    if (tdsImageViewOnNavigationEvent4 != null) {
                        int i6 = writeTypedObject + 65;
                        readTypedObject = i6 % 128;
                        if (i6 % 2 != 0) {
                            i4 = R.id.loadingAdBadge;
                            tdsRoundLayoutOnNavigationEvent = (TdsRoundLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                            int i7 = 53 / 0;
                            if (tdsRoundLayoutOnNavigationEvent != null) {
                                TdsRoundLayout tdsRoundLayout = tdsRoundLayoutOnNavigationEvent;
                                i4 = R.id.loadingContainer;
                                ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                if (constraintLayoutOnNavigationEvent != null) {
                                    int i8 = readTypedObject + 119;
                                    writeTypedObject = i8 % 128;
                                    int i9 = i8 % 2;
                                    i4 = R.id.loadingView;
                                    com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                                    if (lottieAnimationViewOnNavigationEvent != null && (tdsSquircleLayoutV1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.logo_container))) != null && (styledPlayerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.playerView))) != null && (tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.thumbnailView))) != null && (subTypography13OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tv_disc))) != null && (typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tv_subtitle))) != null && (subTypography8OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tv_title))) != null) {
                                        return new PagerAdapter((ConstraintLayout) view, nativeAdsThumbnailAdMobView, typography7OnNavigationEvent, parcelImplOnNavigationEvent, frameLayout, tdsImageViewOnNavigationEvent, viewOnNavigationEvent2, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent4, tdsRoundLayout, constraintLayoutOnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsSquircleLayoutV1OnNavigationEvent, styledPlayerViewOnNavigationEvent, tdsImageViewOnNavigationEvent3, subTypography13OnNavigationEvent, typography7OnNavigationEvent2, subTypography8OnNavigationEvent);
                                    }
                                }
                            }
                        } else {
                            i4 = R.id.loadingAdBadge;
                            tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                            if (tdsRoundLayoutOnNavigationEvent != null) {
                            }
                        }
                    }
                } else {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.iv_logo);
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
