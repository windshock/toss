package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1pSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    public final Typography7 IAuthTabCallback;
    private final View IAuthTabCallbackDefault;
    public final TdsRoundLayout IAuthTabCallbackStub;
    public final ConstraintLayout asBinder;
    public final Typography7 asInterface;
    public final CardView onExtraCallback;
    public final View onExtraCallbackWithResult;
    public final FrameLayout onNavigationEvent;
    public final View onTransact;
    public final TdsImageView onWarmupCompleted;

    private AFk1pSDK(@NonNull View view, @NonNull CardView cardView, @NonNull TdsImageView tdsImageView, @NonNull FrameLayout frameLayout, @NonNull Typography7 typography7, @NonNull View view2, @NonNull Typography7 typography72, @NonNull View view3, @NonNull ConstraintLayout constraintLayout, @NonNull TdsRoundLayout tdsRoundLayout) {
        this.IAuthTabCallbackDefault = view;
        this.onExtraCallback = cardView;
        this.onWarmupCompleted = tdsImageView;
        this.onNavigationEvent = frameLayout;
        this.IAuthTabCallback = typography7;
        this.onExtraCallbackWithResult = view2;
        this.asInterface = typography72;
        this.onTransact = view3;
        this.asBinder = constraintLayout;
        this.IAuthTabCallbackStub = tdsRoundLayout;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        View view = this.IAuthTabCallbackDefault;
        int i5 = i2 + 99;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r4 = 98 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        throw new java.lang.NullPointerException("parent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r3.inflate(im.toss.uikit.R.layout.tds_segmented_control_v1, r4);
        r3 = onNavigationEvent(r4);
        r4 = o.AFk1pSDK.access000 + 37;
        o.AFk1pSDK.IAuthTabCallback_Parcel = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if ((r4 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFk1pSDK onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
    }

    public static AFk1pSDK onNavigationEvent(@NonNull View view) {
        Typography7 typography7OnNavigationEvent;
        View viewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent2;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.arrowCardView;
        CardView cardViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (cardViewOnNavigationEvent != null) {
            int i5 = access000 + 21;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.arrowImage;
            TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (tdsImageViewOnNavigationEvent != null) {
                i4 = R.id.container;
                FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (frameLayout != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.label))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.leftGradient))) != null && (typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.message))) != null) {
                    int i7 = access000 + 87;
                    IAuthTabCallback_Parcel = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = R.id.rightGradient;
                    View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                    if (viewOnNavigationEvent2 != null) {
                        int i9 = IAuthTabCallback_Parcel + 69;
                        access000 = i9 % 128;
                        if (i9 % 2 != 0) {
                            SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.tabContainerBackground);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        i4 = R.id.tabContainerBackground;
                        ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                        if (constraintLayoutOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.tabContainerBackgroundCardView))) != null) {
                            AFk1pSDK aFk1pSDK = new AFk1pSDK(view, cardViewOnNavigationEvent, tdsImageViewOnNavigationEvent, frameLayout, typography7OnNavigationEvent, viewOnNavigationEvent, typography7OnNavigationEvent2, viewOnNavigationEvent2, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent);
                            int i10 = IAuthTabCallback_Parcel + 19;
                            access000 = i10 % 128;
                            int i11 = i10 % 2;
                            return aFk1pSDK;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
