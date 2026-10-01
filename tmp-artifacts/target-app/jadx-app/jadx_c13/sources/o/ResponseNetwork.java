package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResponseNetwork implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    public final View IAuthTabCallback;
    private final View IAuthTabCallbackStub;
    public final Typography6 asBinder;
    public final ConstraintLayout onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsRoundLayout onWarmupCompleted;

    private ResponseNetwork(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull View view2, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull Typography6 typography6) {
        this.IAuthTabCallbackStub = view;
        this.onExtraCallback = constraintLayout;
        this.onWarmupCompleted = tdsRoundLayout;
        this.IAuthTabCallback = view2;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallbackWithResult = tdsImageView2;
        this.asBinder = typography6;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        View view = this.IAuthTabCallbackStub;
        int i4 = i3 + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        throw new java.lang.NullPointerException("parent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 87;
        o.ResponseNetwork.IAuthTabCallbackDefault = r2 % 128;
        r2 = r2 % 2;
        r3.inflate(im.toss.uikit.R.layout.view_gradient_button, r4);
        r3 = IAuthTabCallback(r4);
        r4 = o.ResponseNetwork.IAuthTabCallbackDefault + 33;
        o.ResponseNetwork.asInterface = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if ((r4 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ResponseNetwork onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            int i4 = 56 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[PHI: r2
      0x0045: PHI (r2v5 im.toss.tds.view.component.atom.image.TdsImageView) = (r2v4 im.toss.tds.view.component.atom.image.TdsImageView), (r2v10 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:14:0x0043, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ResponseNetwork IAuthTabCallback(@NonNull View view) {
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        View viewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.background_container;
        ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (constraintLayoutOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.button_container))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.dim))) != null) {
            int i3 = IAuthTabCallbackDefault + 109;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                i2 = R.id.iv_error_background;
                tdsImageViewOnNavigationEvent = (TdsImageView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                int i4 = 63 / 0;
                if (tdsImageViewOnNavigationEvent != null) {
                    TdsImageView tdsImageView = tdsImageViewOnNavigationEvent;
                    int i5 = IAuthTabCallbackDefault + 85;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = R.id.iv_normal_background;
                    TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (tdsImageViewOnNavigationEvent2 != null) {
                        int i7 = asInterface + 107;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        i2 = R.id.tv_title;
                        Typography6 typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (typography6OnNavigationEvent != null) {
                            return new ResponseNetwork(view, constraintLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, viewOnNavigationEvent, tdsImageView, tdsImageViewOnNavigationEvent2, typography6OnNavigationEvent);
                        }
                    }
                }
            } else {
                i2 = R.id.iv_error_background;
                tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsImageViewOnNavigationEvent != null) {
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
