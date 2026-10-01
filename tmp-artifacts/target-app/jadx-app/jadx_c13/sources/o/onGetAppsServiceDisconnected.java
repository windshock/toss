package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class onGetAppsServiceDisconnected implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted;
    private final ConstraintLayout IAuthTabCallback;
    public final View onExtraCallback;
    public final TdsButtonV1View onExtraCallbackWithResult;
    public final View onNavigationEvent;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private onGetAppsServiceDisconnected(@NonNull ConstraintLayout constraintLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull View view, @NonNull View view2) {
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallbackWithResult = tdsButtonV1View;
        this.onExtraCallback = view;
        this.onNavigationEvent = view2;
    }

    public ConstraintLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.IAuthTabCallback;
        int i5 = i2 + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return constraintLayout;
    }

    public static onGetAppsServiceDisconnected onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.keyboard_bottom_cta, viewGroup, false);
        if (!(!z)) {
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        onGetAppsServiceDisconnected ongetappsservicedisconnectedOnExtraCallback = onExtraCallback(viewInflate);
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return ongetappsservicedisconnectedOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onGetAppsServiceDisconnected onExtraCallback(@NonNull View view) {
        View viewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.cta;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (tdsButtonV1ViewOnNavigationEvent != null) {
            int i3 = onWarmupCompleted + 87;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                i2 = R.id.gradient;
                View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (viewOnNavigationEvent2 != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.keyboardBottomCtaBody))) != null) {
                    onGetAppsServiceDisconnected ongetappsservicedisconnected = new onGetAppsServiceDisconnected((ConstraintLayout) view, tdsButtonV1ViewOnNavigationEvent, viewOnNavigationEvent2, viewOnNavigationEvent);
                    int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 91 / 0;
                    }
                    return ongetappsservicedisconnected;
                }
            } else {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.gradient);
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
