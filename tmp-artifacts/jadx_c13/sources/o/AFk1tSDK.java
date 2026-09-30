package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.uikit.R;
import im.toss.uikit.widget.tab.TdsTabV1TabLayoutView;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1tSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final View onExtraCallback;
    public final View onNavigationEvent;
    public final TdsTabV1TabLayoutView onWarmupCompleted;

    private AFk1tSDK(@NonNull View view, @NonNull View view2, @NonNull TdsTabV1TabLayoutView tdsTabV1TabLayoutView) {
        this.onExtraCallback = view;
        this.onNavigationEvent = view2;
        this.onWarmupCompleted = tdsTabV1TabLayoutView;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        View view = this.onExtraCallback;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return view;
    }

    public static AFk1tSDK onNavigationEvent(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i4 = i2 + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        layoutInflater.inflate(R.layout.tds_tab_v1, viewGroup);
        return IAuthTabCallback(viewGroup);
    }

    public static AFk1tSDK IAuthTabCallback(@NonNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.tabBorder;
            View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (viewOnNavigationEvent != null) {
                i3 = R.id.tabLayout;
                TdsTabV1TabLayoutView tdsTabV1TabLayoutView = (TdsTabV1TabLayoutView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                if (tdsTabV1TabLayoutView != null) {
                    AFk1tSDK aFk1tSDK = new AFk1tSDK(view, viewOnNavigationEvent, tdsTabV1TabLayoutView);
                    int i4 = IAuthTabCallback + 75;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return aFk1tSDK;
                    }
                    throw null;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.tabBorder);
        obj.hashCode();
        throw null;
    }
}
