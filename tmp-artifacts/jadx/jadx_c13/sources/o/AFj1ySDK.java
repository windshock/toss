package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1ySDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int asInterface = 0;
    private static int onTransact = 1;
    public final LinearLayout IAuthTabCallback;
    public final FrameLayout onExtraCallback;
    public final LinearLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    private final View onWarmupCompleted;

    private AFj1ySDK(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull TdsImageView tdsImageView) {
        this.onWarmupCompleted = view;
        this.IAuthTabCallback = linearLayout;
        this.onExtraCallback = frameLayout;
        this.onExtraCallbackWithResult = linearLayout2;
        this.onNavigationEvent = tdsImageView;
    }

    public View getRoot() {
        View view;
        int i = 2 % 2;
        int i2 = onTransact + 17;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            view = this.onWarmupCompleted;
            int i4 = 5 / 0;
        } else {
            view = this.onWarmupCompleted;
        }
        int i5 = i3 + 57;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        throw null;
    }

    public static AFj1ySDK onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.tab_bar, viewGroup);
        AFj1ySDK aFj1ySDKOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        int i4 = asInterface + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return aFj1ySDKOnExtraCallbackWithResult;
    }

    public static AFj1ySDK onExtraCallbackWithResult(@NonNull View view) {
        int i = 2 % 2;
        int i2 = R.id.bottom_tab_container;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (linearLayout != null) {
            int i3 = onTransact + 11;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.floating_back_layout;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (frameLayout != null) {
                i2 = R.id.floating_tab_container;
                LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (linearLayout2 != null) {
                    int i5 = asInterface + 71;
                    onTransact = i5 % 128;
                    if (i5 % 2 == 0) {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.iv_back);
                        throw null;
                    }
                    i2 = R.id.iv_back;
                    TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (tdsImageViewOnNavigationEvent != null) {
                        AFj1ySDK aFj1ySDK = new AFj1ySDK(view, linearLayout, frameLayout, linearLayout2, tdsImageViewOnNavigationEvent);
                        int i6 = onTransact + 1;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        return aFj1ySDK;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
