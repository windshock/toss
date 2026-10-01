package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1zSDKAFa1ySDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    public final TdsCheckBoxV2View IAuthTabCallback;
    public final ConstraintLayout IAuthTabCallbackStub;
    private final View asBinder;
    public final ConstraintLayout asInterface;
    public final Space onExtraCallback;
    public final Space onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final Space onWarmupCompleted;

    private AFj1zSDKAFa1ySDK(@NonNull View view, @NonNull TdsCheckBoxV2View tdsCheckBoxV2View, @NonNull TdsImageView tdsImageView, @NonNull Space space, @NonNull Space space2, @NonNull Space space3, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.asBinder = view;
        this.IAuthTabCallback = tdsCheckBoxV2View;
        this.onNavigationEvent = tdsImageView;
        this.onWarmupCompleted = space;
        this.onExtraCallback = space2;
        this.onExtraCallbackWithResult = space3;
        this.asInterface = constraintLayout;
        this.IAuthTabCallbackStub = constraintLayout2;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 67;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        View view = this.asBinder;
        int i5 = i2 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r3.inflate(im.toss.uikit.R.layout.tds_agreement_row_v2_group, r4);
        r3 = onExtraCallback(r4);
        r4 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r3.inflate(im.toss.uikit.R.layout.tds_agreement_row_v2_group, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return onExtraCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        throw new java.lang.NullPointerException("parent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 1;
        o.AFj1zSDKAFa1ySDK.IAuthTabCallbackDefault = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r2 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFj1zSDKAFa1ySDK IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            int i4 = 22 / 0;
        }
    }

    public static AFj1zSDKAFa1ySDK onExtraCallback(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        int i = 2 % 2;
        int i2 = R.id.agreement_row_left_check_box;
        TdsCheckBoxV2View tdsCheckBoxV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (tdsCheckBoxV2ViewOnNavigationEvent != null) {
            int i3 = onTransact + 17;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.agreement_row_right_arrow;
            TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsImageViewOnNavigationEvent != null) {
                i2 = R.id.spaceBottom;
                Space space = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (space != null) {
                    i2 = R.id.spaceLeft;
                    Space space2 = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (space2 != null) {
                        int i5 = onTransact + 13;
                        IAuthTabCallbackDefault = i5 % 128;
                        if (i5 % 2 == 0) {
                            i2 = R.id.spaceTop;
                            Space space3 = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (space3 != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.touchAreaCenter))) != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.touchAreaRight))) != null) {
                                return new AFj1zSDKAFa1ySDK(view, tdsCheckBoxV2ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, space, space2, space3, constraintLayoutOnNavigationEvent, constraintLayoutOnNavigationEvent2);
                            }
                        } else {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
