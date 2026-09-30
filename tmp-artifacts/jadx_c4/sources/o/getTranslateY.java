package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsNormalV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsRightBannerV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View;
import im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView;
import im.toss.ads_sdk.ui.view.NativeAdsFeedView;
import im.toss.ads_sdk.ui.view.NativeAdsNormalView;
import im.toss.ads_sdk.ui.view.NativeAdsRightBannerView;
import im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTranslateY implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor;
    public final NativeAdsFeedView IAuthTabCallback;
    public final NativeAdsThumbnailVideoV2View IAuthTabCallbackDefault;
    public final NativeAdsThumbnailVideoView IAuthTabCallbackStub;
    private final View IAuthTabCallbackStubProxy;
    public final NativeAdsNormalV2View asBinder;
    public final NativeAdsRightBannerView asInterface;
    public final NativeAdsNormalView onExtraCallback;
    public final NativeAdsFeedV2View onExtraCallbackWithResult;
    public final NativeAdsFeedVideoView onNavigationEvent;
    public final NativeAdsRightBannerV2View onTransact;
    public final NativeAdsFeedVideoV2View onWarmupCompleted;

    private getTranslateY(@NonNull View view, @NonNull NativeAdsFeedView nativeAdsFeedView, @NonNull NativeAdsFeedV2View nativeAdsFeedV2View, @NonNull NativeAdsFeedVideoView nativeAdsFeedVideoView, @NonNull NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View, @NonNull NativeAdsNormalView nativeAdsNormalView, @NonNull NativeAdsNormalV2View nativeAdsNormalV2View, @NonNull NativeAdsRightBannerView nativeAdsRightBannerView, @NonNull NativeAdsRightBannerV2View nativeAdsRightBannerV2View, @NonNull NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, @NonNull NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        this.IAuthTabCallbackStubProxy = view;
        this.IAuthTabCallback = nativeAdsFeedView;
        this.onExtraCallbackWithResult = nativeAdsFeedV2View;
        this.onNavigationEvent = nativeAdsFeedVideoView;
        this.onWarmupCompleted = nativeAdsFeedVideoV2View;
        this.onExtraCallback = nativeAdsNormalView;
        this.asBinder = nativeAdsNormalV2View;
        this.asInterface = nativeAdsRightBannerView;
        this.onTransact = nativeAdsRightBannerV2View;
        this.IAuthTabCallbackStub = nativeAdsThumbnailVideoView;
        this.IAuthTabCallbackDefault = nativeAdsThumbnailVideoV2View;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        View view = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 57;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public static getTranslateY onNavigationEvent(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 3;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i5 = i2 + 83;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        layoutInflater.inflate(R.layout.ads_sdk_ad_view, viewGroup);
        getTranslateY gettranslateyOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        int i7 = IAuthTabCallback_Parcel + 67;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return gettranslateyOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[PHI: r2
      0x0046: PHI (r2v6 im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView) = (r2v5 im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView), (r2v11 im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView) binds: [B:12:0x0044, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getTranslateY onExtraCallbackWithResult(@NonNull View view) {
        NativeAdsFeedVideoView nativeAdsFeedVideoView;
        int i = 2 % 2;
        int i2 = R.id.feedAd;
        NativeAdsFeedView nativeAdsFeedView = (NativeAdsFeedView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (nativeAdsFeedView != null) {
            int i3 = getInterfaceDescriptor + 21;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.feedAdV2;
            NativeAdsFeedV2View nativeAdsFeedV2View = (NativeAdsFeedV2View) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (nativeAdsFeedV2View != null) {
                int i5 = getInterfaceDescriptor + 45;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    i2 = R.id.feedVideoAd;
                    nativeAdsFeedVideoView = (NativeAdsFeedVideoView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    int i6 = 94 / 0;
                    if (nativeAdsFeedVideoView != null) {
                        NativeAdsFeedVideoView nativeAdsFeedVideoView2 = nativeAdsFeedVideoView;
                        i2 = R.id.feedVideoAdV2;
                        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = (NativeAdsFeedVideoV2View) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (nativeAdsFeedVideoV2View != null) {
                            int i7 = getInterfaceDescriptor + 101;
                            IAuthTabCallback_Parcel = i7 % 128;
                            Object obj = null;
                            if (i7 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            i2 = R.id.normalAd;
                            NativeAdsNormalView nativeAdsNormalView = (NativeAdsNormalView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (nativeAdsNormalView != null) {
                                i2 = R.id.normalAdV2;
                                NativeAdsNormalV2View nativeAdsNormalV2View = (NativeAdsNormalV2View) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (nativeAdsNormalV2View != null) {
                                    i2 = R.id.rightBannerAd;
                                    NativeAdsRightBannerView nativeAdsRightBannerView = (NativeAdsRightBannerView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                    if (nativeAdsRightBannerView != null) {
                                        i2 = R.id.rightBannerAdV2;
                                        NativeAdsRightBannerV2View nativeAdsRightBannerV2View = (NativeAdsRightBannerV2View) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        if (nativeAdsRightBannerV2View != null) {
                                            int i8 = getInterfaceDescriptor + 31;
                                            IAuthTabCallback_Parcel = i8 % 128;
                                            int i9 = i8 % 2;
                                            i2 = R.id.thumbnailBannerAd;
                                            NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                            if (nativeAdsThumbnailVideoView != null) {
                                                int i10 = IAuthTabCallback_Parcel + 57;
                                                getInterfaceDescriptor = i10 % 128;
                                                int i11 = i10 % 2;
                                                i2 = R.id.thumbnailBannerAdV2;
                                                NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                if (nativeAdsThumbnailVideoV2View != null) {
                                                    getTranslateY gettranslatey = new getTranslateY(view, nativeAdsFeedView, nativeAdsFeedV2View, nativeAdsFeedVideoView2, nativeAdsFeedVideoV2View, nativeAdsNormalView, nativeAdsNormalV2View, nativeAdsRightBannerView, nativeAdsRightBannerV2View, nativeAdsThumbnailVideoView, nativeAdsThumbnailVideoV2View);
                                                    int i12 = getInterfaceDescriptor + 13;
                                                    IAuthTabCallback_Parcel = i12 % 128;
                                                    if (i12 % 2 != 0) {
                                                        return gettranslatey;
                                                    }
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i2 = R.id.feedVideoAd;
                    nativeAdsFeedVideoView = (NativeAdsFeedVideoView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (nativeAdsFeedVideoView != null) {
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
