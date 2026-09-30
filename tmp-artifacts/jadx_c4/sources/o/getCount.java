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
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getCount implements SearchBarKtExternalSyntheticLambda5 {
    private static int extraCallbackWithResult = 0;
    private static int writeTypedObject = 1;
    public final Typography7 IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    public final ConstraintLayout IAuthTabCallbackStub;
    public final SubTypography13 IAuthTabCallbackStubProxy;
    public final TdsImageView IAuthTabCallback_Parcel;
    private final ConstraintLayout ICustomTabsCallback;
    public final com.airbnb.lottie.LottieAnimationView access000;
    public final StyledPlayerView access100;
    public final TdsImageView asBinder;
    public final TdsRoundLayout asInterface;
    public final TdsSquircleLayoutV1 getInterfaceDescriptor;
    public final NativeAdsThumbnailAdMobView onExtraCallback;
    public final ParcelImpl onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsImageView onTransact;
    public final FrameLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutIAuthTabCallback = IAuthTabCallback();
        int i4 = extraCallbackWithResult + 17;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutIAuthTabCallback;
    }

    private getCount(@NonNull ConstraintLayout constraintLayout, @NonNull NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, @NonNull Typography7 typography7, @NonNull ParcelImpl parcelImpl, @NonNull FrameLayout frameLayout, @NonNull TdsImageView tdsImageView, @NonNull View view, @NonNull TdsImageView tdsImageView2, @NonNull TdsImageView tdsImageView3, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView, @NonNull TdsSquircleLayoutV1 tdsSquircleLayoutV1, @NonNull StyledPlayerView styledPlayerView, @NonNull TdsImageView tdsImageView4, @NonNull SubTypography13 subTypography13) {
        this.ICustomTabsCallback = constraintLayout;
        this.onExtraCallback = nativeAdsThumbnailAdMobView;
        this.IAuthTabCallback = typography7;
        this.onExtraCallbackWithResult = parcelImpl;
        this.onWarmupCompleted = frameLayout;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallbackDefault = view;
        this.asBinder = tdsImageView2;
        this.onTransact = tdsImageView3;
        this.asInterface = tdsRoundLayout;
        this.IAuthTabCallbackStub = constraintLayout2;
        this.access000 = lottieAnimationView;
        this.getInterfaceDescriptor = tdsSquircleLayoutV1;
        this.access100 = styledPlayerView;
        this.IAuthTabCallback_Parcel = tdsImageView4;
        this.IAuthTabCallbackStubProxy = subTypography13;
    }

    public ConstraintLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 57;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.ICustomTabsCallback;
        int i4 = i2 + 101;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static getCount IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.ads_sdk_thumbnail_video_view, viewGroup, false);
        if (z) {
            int i2 = writeTypedObject + 19;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = extraCallbackWithResult + 115;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        getCount getcountOnExtraCallbackWithResult = onExtraCallbackWithResult(viewInflate);
        int i6 = extraCallbackWithResult + 119;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return getcountOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[PHI: r3
      0x0071: PHI (r3v8 android.view.View) = (r3v7 android.view.View), (r3v22 android.view.View) binds: [B:20:0x006f, B:17:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getCount onExtraCallbackWithResult(@NonNull View view) {
        View viewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        View viewOnNavigationEvent2;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        StyledPlayerView styledPlayerViewOnNavigationEvent;
        SubTypography13 subTypography13OnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.admobView;
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = (NativeAdsThumbnailAdMobView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (nativeAdsThumbnailAdMobView != null) {
            int i3 = extraCallbackWithResult + 19;
            writeTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.btnMore);
                throw null;
            }
            i2 = R.id.btnMore;
            Typography7 typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (typography7OnNavigationEvent != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.btnPlay))) != null) {
                int i4 = writeTypedObject + 3;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                ParcelImpl parcelImplOnNavigationEvent = ParcelImpl.onNavigationEvent(viewOnNavigationEvent);
                i2 = R.id.btnSound;
                FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (frameLayout != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.btnSoundImage))) != null) {
                    int i6 = writeTypedObject + 75;
                    extraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        i2 = R.id.contentContainer;
                        viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        int i7 = 91 / 0;
                        if (viewOnNavigationEvent2 != null) {
                            View view2 = viewOnNavigationEvent2;
                            i2 = R.id.imageView;
                            TdsImageView tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (tdsImageViewOnNavigationEvent3 != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_logo))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.loadingAdBadge))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.loadingContainer))) != null) {
                                int i8 = writeTypedObject + 25;
                                extraCallbackWithResult = i8 % 128;
                                int i9 = i8 % 2;
                                i2 = R.id.loadingView;
                                com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (lottieAnimationViewOnNavigationEvent != null) {
                                    int i10 = extraCallbackWithResult + 69;
                                    writeTypedObject = i10 % 128;
                                    int i11 = i10 % 2;
                                    i2 = R.id.logo_container;
                                    TdsSquircleLayoutV1 tdsSquircleLayoutV1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                    if (tdsSquircleLayoutV1OnNavigationEvent != null && (styledPlayerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.playerView))) != null) {
                                        int i12 = writeTypedObject + 5;
                                        extraCallbackWithResult = i12 % 128;
                                        int i13 = i12 % 2;
                                        i2 = R.id.thumbnailView;
                                        TdsImageView tdsImageViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        if (tdsImageViewOnNavigationEvent4 != null && (subTypography13OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.tv_disc))) != null) {
                                            getCount getcount = new getCount((ConstraintLayout) view, nativeAdsThumbnailAdMobView, typography7OnNavigationEvent, parcelImplOnNavigationEvent, frameLayout, tdsImageViewOnNavigationEvent, view2, tdsImageViewOnNavigationEvent3, tdsImageViewOnNavigationEvent2, tdsRoundLayoutOnNavigationEvent, constraintLayoutOnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsSquircleLayoutV1OnNavigationEvent, styledPlayerViewOnNavigationEvent, tdsImageViewOnNavigationEvent4, subTypography13OnNavigationEvent);
                                            int i14 = extraCallbackWithResult + 121;
                                            writeTypedObject = i14 % 128;
                                            int i15 = i14 % 2;
                                            return getcount;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i2 = R.id.contentContainer;
                        viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (viewOnNavigationEvent2 != null) {
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
