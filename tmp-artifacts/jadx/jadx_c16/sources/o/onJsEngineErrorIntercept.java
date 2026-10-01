package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.features.home.core.hds.R;
import im.toss.features.home.core.hds.view.HomeImageView;
import im.toss.tds.view.component.atom.text.Typography;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onJsEngineErrorIntercept implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final HomeImageView onExtraCallback;
    private final View onExtraCallbackWithResult;
    public final Typography onWarmupCompleted;

    private onJsEngineErrorIntercept(@NonNull View view, @NonNull HomeImageView homeImageView, @NonNull Typography typography) {
        this.onExtraCallbackWithResult = view;
        this.onExtraCallback = homeImageView;
        this.onWarmupCompleted = typography;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        View view = this.onExtraCallbackWithResult;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return view;
    }

    public static onJsEngineErrorIntercept onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.home_v2_core_hds_home_round_button, viewGroup);
        onJsEngineErrorIntercept onjsengineerrorinterceptOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        int i3 = IAuthTabCallback + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onjsengineerrorinterceptOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static onJsEngineErrorIntercept onExtraCallbackWithResult(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.imageView;
        HomeImageView homeImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (homeImageViewOnNavigationEvent != null) {
            int i5 = IAuthTabCallback + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.typography;
            Typography typographyOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (typographyOnNavigationEvent != null) {
                onJsEngineErrorIntercept onjsengineerrorintercept = new onJsEngineErrorIntercept(view, homeImageViewOnNavigationEvent, typographyOnNavigationEvent);
                int i7 = onNavigationEvent + 87;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return onjsengineerrorintercept;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
