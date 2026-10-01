package o;

import android.view.View;
import androidx.annotation.NonNull;
import im.toss.uikit.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1wSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final View IAuthTabCallback;
    private final View onExtraCallbackWithResult;
    public final View onWarmupCompleted;

    private AFj1wSDK(@NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.onExtraCallbackWithResult = view;
        this.IAuthTabCallback = view2;
        this.onWarmupCompleted = view3;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFj1wSDK IAuthTabCallback(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.bottomDivider;
        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (viewOnNavigationEvent != null) {
            int i5 = onExtraCallback + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.topDivider;
            View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (viewOnNavigationEvent2 != null) {
                AFj1wSDK aFj1wSDK = new AFj1wSDK(view, viewOnNavigationEvent, viewOnNavigationEvent2);
                int i7 = onExtraCallback + 85;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return aFj1wSDK;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
