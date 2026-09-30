package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import im.toss.ads_sdk.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPathData implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100;
    public final View IAuthTabCallback;
    public final ParcelImpl IAuthTabCallbackDefault;
    public final FrameLayout IAuthTabCallbackStub;
    public final TdsImageView IAuthTabCallback_Parcel;
    public final FrameLayout access000;
    public final Typography7 asBinder;
    public final NativeAdView asInterface;
    private final View getInterfaceDescriptor;
    public final ConstraintLayout onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final MediaView onNavigationEvent;
    public final Typography7 onTransact;
    public final TdsImageView onWarmupCompleted;

    private getPathData(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull MediaView mediaView, @NonNull View view2, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull FrameLayout frameLayout, @NonNull NativeAdView nativeAdView, @NonNull ParcelImpl parcelImpl, @NonNull Typography7 typography7, @NonNull Typography7 typography72, @NonNull FrameLayout frameLayout2, @NonNull TdsImageView tdsImageView3) {
        this.getInterfaceDescriptor = view;
        this.onExtraCallback = constraintLayout;
        this.onNavigationEvent = mediaView;
        this.IAuthTabCallback = view2;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onWarmupCompleted = tdsImageView2;
        this.IAuthTabCallbackStub = frameLayout;
        this.asInterface = nativeAdView;
        this.IAuthTabCallbackDefault = parcelImpl;
        this.onTransact = typography7;
        this.asBinder = typography72;
        this.access000 = frameLayout2;
        this.IAuthTabCallback_Parcel = tdsImageView3;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        View view = this.getInterfaceDescriptor;
        int i5 = i3 + 37;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return view;
    }

    public static getPathData onNavigationEvent(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i2 = IAuthTabCallbackStubProxy + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        layoutInflater.inflate(R.layout.ads_sdk_thumbnail_admob_controller, viewGroup);
        getPathData getpathdataOnExtraCallback = onExtraCallback(viewGroup);
        int i4 = IAuthTabCallbackStubProxy + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return getpathdataOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        return new o.getPathData(r17, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static getPathData onExtraCallback(@NonNull View view) {
        View viewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.admobInfoContainer;
        ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (constraintLayoutOnNavigationEvent != null) {
            int i3 = IAuthTabCallbackStubProxy + 115;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.admobMediaView);
                throw null;
            }
            i2 = R.id.admobMediaView;
            MediaView mediaViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (mediaViewOnNavigationEvent != null && (r6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.gradient))) != null) {
                int i4 = access100 + 91;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.iconArrow);
                    throw null;
                }
                i2 = R.id.iconArrow;
                TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsImageViewOnNavigationEvent2 != null && (r8 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iconLogo))) != null) {
                    i2 = R.id.infoButton;
                    FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (frameLayout != null && (r10 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.nativeAdView))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.playerController))) != null) {
                        ParcelImpl parcelImplOnNavigationEvent = ParcelImpl.onNavigationEvent(viewOnNavigationEvent);
                        i2 = R.id.subTitle;
                        Typography7 typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (typography7OnNavigationEvent != null) {
                            int i5 = IAuthTabCallbackStubProxy + 37;
                            access100 = i5 % 128;
                            int i6 = i5 % 2;
                            i2 = R.id.title;
                            Typography7 typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (typography7OnNavigationEvent2 != null) {
                                i2 = R.id.volumeButton;
                                FrameLayout frameLayout2 = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (frameLayout2 != null) {
                                    int i7 = IAuthTabCallbackStubProxy + 47;
                                    access100 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        i2 = R.id.volumeIcon;
                                        tdsImageViewOnNavigationEvent = (TdsImageView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        int i8 = 4 / 0;
                                    } else {
                                        i2 = R.id.volumeIcon;
                                        tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
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
